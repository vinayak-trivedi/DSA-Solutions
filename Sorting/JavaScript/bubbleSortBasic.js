// sort the following array using bubble sort

const arr = [11, 23, 8, 7, 10, 16, 14, 15];

console.log("unsorted Array: ", arr)

for (let i = 0; i < arr.length - 1; i++) {
  for (let j = 0; j < arr.length - 1 - i; j++) {
    if (arr[j] > arr[j + 1]) {
      const temp = arr[j];
      arr[j] = arr[j + 1];
      arr[j + 1] = temp;
    }
  }
}

console.log("sorted array: ", arr)