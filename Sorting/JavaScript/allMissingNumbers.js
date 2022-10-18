// find all the missing numbers in a given array which is in the range 1 to n

const arr = [4, 3, 2, 7, 8, 2, 3, 1];

function swap (arr, firstIndex, secondIndex) {
  const temp = arr[firstIndex];
  arr[firstIndex] = arr[secondIndex];
  arr[secondIndex] = temp;
}


function findMissingNumbers(arr) {
  let i = 0;

  while (i < arr.length) {
    let correctIndex = arr[i] -1;

    if (arr[i] !== arr[correctIndex]) {
      swap(arr, correctIndex, i);
    } else {
      i++
    }
  }
  const missingNumbersArray = []
  for (let index = 0; index < arr.length; index++) {
    if (arr[index] !== index + 1) {
      missingNumbersArray.push(index + 1)
    }
  }
  return missingNumbersArray;
}

console.log(findMissingNumbers(arr))