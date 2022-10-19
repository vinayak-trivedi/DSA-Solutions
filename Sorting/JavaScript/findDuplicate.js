// find the duplicate number in the array which is in the range 1 to n

// we can apply cyclic sort here as the given array is in the range 1 to n

const arr = [1, 3, 4, 2, 2];

function swap(arr, firstIndex, secondIndex) {
  const temp = arr[firstIndex];
  arr[firstIndex] = arr[secondIndex];
  arr[secondIndex] = temp;
}

function findDuplicate(arr) {
  // first do cyclic sort
  let i = 0;

  while (i < arr.length) {
    if (arr[i] !== i + 1) {
      let correctIndex = arr[i] - 1; // because it is from 1 to n
      if (arr[i] !== arr[correctIndex]) {
        swap(arr, correctIndex, i);
      } else {
        return arr[i];
      }
    } else {
      i++;
    }

    // Explanation of the code above:
    // we are checking if the arr[i] !== i + 1
    // if not then we increase the i counter, because the element is at the correct index
    // if it is not equal then:
    // we check the correct index of that particular element
    // if the value at current index is not equals to the value at correct index
    // if the value is equal in both the cases than we know that this is a duplicate number
    // if it's not then we swap it
  }
}

console.log(findDuplicate(arr));
