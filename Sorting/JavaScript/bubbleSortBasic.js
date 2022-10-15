// sort the following array using bubble sort

const arr = [11, 23, 8, 7, 10, 16, 14, 15];

console.log("unsorted Array: ", arr)
let swapped;

for (let i = 0; i < arr.length - 1; i++) {
  swapped = false;
  for (let j = 0; j < arr.length - 1 - i; j++) {
    if (arr[j] > arr[j + 1]) {
      const temp = arr[j];
      arr[j] = arr[j + 1];
      arr[j + 1] = temp;
      swapped = true;
    }
  }
  // if no value is swapped in the above loop it means that our array is sorted and there is no reason that we should go ahead with other iterations in the loop
  if (!swapped) {
    break;
  }
}

console.log("sorted array: ", arr)