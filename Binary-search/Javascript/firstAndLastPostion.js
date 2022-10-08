// find the first and last position of an element in an array

// the implementation is basically going to be same as normal binary search just one case is going to change

// in case of finding first position
// when we find the element we need to store it in an variable and then move left so we do  end = mid - 1;
// in the return that variable

// in case of finding the last element, we store the index if we find the element in the answer and move rightwards which means we do start = mid + 1;

// Solution

const array = [1, 2, 7, 7, 7, 9, 13];
const target = 7;

// find the first element first

const first = findFirst(array, target);
const last = findLast(array, target);

const ansArray = [first, last]
console.log(ansArray)


function findFirst (arr, target) {
  let start = 0;
  let end = arr.length - 1;
  let first = -1;

  while (start <= end) {
    let mid = Math.floor(start + (end - start)/2);
    if (arr[mid] === target) {
      first = mid;
      end = mid - 1;
    } else if (arr[mid] < target) {
      start = mid + 1;
    } else {
      end = mid - 1;
    }
  }
  return first;
}

function findLast (arr, target) {
  let start = 0;
  let end = arr.length - 1;
  let last = -1;

  while (start <= end) {
    console.log("called", "second")
    let mid = Math.floor(start + (end - start) /2);

    if (arr[mid] === target) {
      last = mid;
      start = mid + 1;
    } else if (arr[mid] < target) {
      start = mid + 1;
    } else {
      end = mid - 1;
    }
  }
  return last;
}
