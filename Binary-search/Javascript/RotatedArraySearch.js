// DESCRIPTION AND APPROACH

// we need to find a number in a rotated sorted array
// let us first understand what is a rotated sorted array

// suppose we have an array like this: [1, 2, 3, 4, 5]
// if we rotate it one time it becomes something like this [5, 1, 2 ,3 ,4]
// if we rotate it one more time it becomes [4, 5, 1, 2, 3]

// how to solve this using binary search
// If we take a look at the rotated array we get that the array is divided into two sorted array when it is rotated
// first is the one which is till the number it has started to rotated and another one which is the one after it
// so if we find the lowest number which will be number which was the 0th index when it was not rotated we can do binary search on both the arrays

// how to find the minimum number in the array
// steps:

// 1. We find the number mid point of the array
// 2. if array[0] < array[mid] we are on the left side of the array which is not going to contain the lowest number for sure, so we do start = mid + 1;
// 3. if arr[0] > arr[mid] we are on the right side, we do end = mid, why? because the number could be the first number of the right side of the array and we do not want to go back to the previous array which contains higher numbers for sure
//4 we continue this process until start == end; which means we have only one number left in the array, and because of the conditions followed above it is going to be the lowest number

// Solution

// intial array and target

const array = [3,1];
const target = 1;

// first find the pivot(lowest point of the array)
let pivot = findPivot(array);

// now we will search till the point before the pivot

let ans = binarySearch(array, target, 0, pivot - 1)

if(ans !== -1) {
  console.log(ans)
  console.log("Found in the first iteration")
} else {
  ans = binarySearch(array, target, pivot, array.length - 1)
  console.log("Found in the second iteration")
  console.log(ans)
}

function findPivot (arr) {
  let start = 0;
  let end = arr.length - 1;

  while (start < end) {
    let mid = Math.floor(start + (end - start)/2);

    if(arr[0] <= arr[mid]) {
      // we are on the left hand side array
      start = mid + 1;
    } else {
      end = mid;
    }
  }
  return start;
}

function binarySearch (arr, target, start, end) {
  while (start <= end) {
    let mid = Math.floor(start + (end - start) /2);

    if (arr[mid] == target) {
      return mid;
    } else if (arr[mid] < target) {
        start = mid + 1;
    } else {
        end = mid - 1;
    }
  }
  return -1;
}