// sort the given array using selection sort

const array = [5, 2, 4, 1, 0, 8, 11, 9];

console.log("unsorted array: ", array);

for (let i = 0; i < array.length - 1; i++) {
  // doing array.length - 1 because we do not need to check for the last element of the array it should be sorted at the end
  let minIndex = i;

  for (let j = i + 1; j < array.length; j++) {
    if (array[minIndex] > array[j]) {
      minIndex = j;
    }
  }
  const temp = array[i];
  array[i] = array[minIndex];
  array[minIndex] = temp;
}

console.log("sorted array: ", array);
