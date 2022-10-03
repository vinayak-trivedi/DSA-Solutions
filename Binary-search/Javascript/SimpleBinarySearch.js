// we are given a simple sorted array we need to find the index of the number using binary search

const array = [1, 3, 7, 9, 11, 15];
const target = 11;

const ansIndex = binarySearch(array, target);

console.log(ansIndex)

function binarySearch (array, target) {
  let start = 0;
  let end = array.length - 1;

  while (start <= end) {
    let mid = Math.floor(start + (end - start) /2);

    if (array[mid] === target) {
      return mid;
    }

    if (array[mid] < target) {
      start = mid + 1;
    } else {
      end = mid - 1;
    }
  }
  return -1; // if the program comes here it means that we have not found the solution
}