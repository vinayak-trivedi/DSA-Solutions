// sort the given array using cyclic sort
// one condition that we need to remember for cyclic sort is that the given an array is within the range 1-n

const arr = [2, 3, 5, 1, 4];
console.log("unsorted array: ", arr)


function swap (arr, firstIndex, secondIndex) {
  const temp = arr[firstIndex];
  arr[firstIndex] = arr[secondIndex];
  arr[secondIndex] = temp;
}

function sort (arr) {
  let i = 0;
  while (i < arr.length) {
    let correctIndex = arr[i] - 1;
    if (arr[correctIndex] !== arr[i]) {
      swap(arr, correctIndex, i)
    } else {
      i++;
    }
  } 
}

sort(arr)
console.log("sorted array: ", arr)