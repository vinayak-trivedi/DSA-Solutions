// we are given a target number, we need return the index of it if it's found, and the index at which it can be inserted if it's not in the array

// basically we need to find the index of smallest number bigger than the number in order to get the index at which it is going to be inserted

// we can find that number by just returning start at the end of the loop as start = end + 1; in case of loop breaking

// solution

const array = [1, 2, 3, 5, 7];
const target = 4; // should return 4

// this function returns the index of the number if it's found or the index at which it can be inserted

function SearchPosition (arr, target) {
  let start = 0;
  let end = arr.length - 1;

  while (start <= end) {
    let mid = Math.floor(start + (end - start)/2);

    if (arr[mid] === target) {
      return mid;
    }

    if (arr[mid] < target) {
      start = mid + 1; // considering array is ascending
    } else {
      end = mid - 1;
    }
  }
  return start; // because start is end + 1 and this is going to be a value which is smallest number greater than the number
}