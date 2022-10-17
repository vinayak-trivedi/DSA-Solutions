// sort the given array using insertion sort
const arr = [15, 11, 8, 3, 21];

console.log("sorted array: ", arr)

for (let i = 0; i < arr.length - 1; i++) {
  for (let j = i + 1; j > 0; j--) {
    if (arr[j] > arr[j - 1]) {
      break;
    }
    const temp = arr[j];
    arr[j] = arr[j - 1]
    arr[j - 1] = temp;
  }
}

console.log("sorted array: ", arr)