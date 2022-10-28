// Do binary search on a sorted array using recursion
function binarySearchRecursion(arr, target, start, end) {

  // base case
  if (start > end) {
    return -1;
  }
  
  let mid = start + (end - start)/2;

  if (arr[mid] === target) {
    return mid;
  }

  if (arr[mid] > target) {
    return binarySearchRecursion(arr, target, start, mid - 1);
  }

  return binarySearchRecursion(arr, target, mid + 1, end);
}

const array = [1, 2, 3, 5, 7, 66, 78];
const target = 66;

console.log("index of target is", binarySearchRecursion(array, target, 0, array.length - 1));