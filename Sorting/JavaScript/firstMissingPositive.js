// Question link => https://leetcode.com/problems/first-missing-positive/description/

// we need to find out the first positive number which is missing from array
// we can use cyclic sort here as the number is lying between the range 1 to n

// we will first sort the array using cyclic sort and then check if the number is at the correct index which is going to be number -1

// one condition is that we will ignore the numbers which are negative or bigger than n, so we will have all the number between the range of 1 to n in the correct position except the ones which are missing

// SOLUTION

const arr = [3,4,-1,1];

function swap(arr, firstIndex, secondIndex) {
  const temp = arr[firstIndex];
  arr[firstIndex] = arr[secondIndex];
  arr[secondIndex] = temp;
}

function findFirstMissingPositive(arr) {
  let i = 0;

  while (i < arr.length) {
    let correctIndex = arr[i] - 1;

    if (arr[i] > 0 && arr[i] <= arr.length && arr[i] !== arr[correctIndex]) {
      swap(arr, correctIndex, i);
    } else {
      i++;
    }
  }

  for (let index = 0; index < arr.length; index++) {
    if (arr[index] !== index + 1) {
      return index + 1;
    }
  }

  return arr.length + 1;
}

console.log(findFirstMissingPositive(arr))