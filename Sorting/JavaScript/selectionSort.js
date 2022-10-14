// sort the array below using selection sort

const array = [32, 11, 8, 9, 23, 10];

console.log("unsorted array: ", array)

for (let i = 0; i < array.length - 1; i++) {
  let minIndex = i;

  for (let j = i + 1; j < array.length; j++) {
    if (array[j] < array[minIndex]) {
      minIndex = j;
    }
  }
  swap(array, i, minIndex)
}

function swap(arr, firstIndex, secondIndex) {
  const temp = arr[firstIndex];
  arr[firstIndex] = arr[secondIndex];
  arr[secondIndex] = temp;
}

console.log("Sorted Array: ", array)