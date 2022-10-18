// given an array which is in the range 0 to n we need to find the missing number
// Question link => https://leetcode.com/problems/missing-number/

// first we will sort the array using cyclic sort and then we will check which is number is not present in it's current index

const arr = [4, 1, 2, 0];

function swap(arr, firstIndex, secondIndex) {
  const temp = arr[firstIndex];
  arr[firstIndex] = arr[secondIndex];
  arr[secondIndex] = temp;
} 

function findMissing(arr) {
  // first we will sort the array
  let i = 0;
  while (i < arr.length) {
    let correctIndex = arr[i];

    if (arr[i] < arr.length && arr[i] !== arr[correctIndex]) {
      swap(arr, correctIndex, i)
    } else {
      i++;
    }
  }

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] !== i) {
      return i;
    }
  }
  return arr.length;
}
console.log("missing number: ", findMissing(arr))
