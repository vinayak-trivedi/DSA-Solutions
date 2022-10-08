// we need to find the minimum number in a rotated sorted array
// First of all what is a rotated sorted array
// let see with the help of an example

// this is a sorted array => [1, 2 ,3 ,4, 5]

// if we take the last element i.e 5 and put it in the first index
// the array becomes => [5,1,2,3,4]
// this is called rotation

// so in a sorted array we know that the minimum element is going to be on the first index, but that is not the case in rotated sorted array
// So how do we find it in a rotated sorted array

// solution

function findMinimum(arr) {
  let start = 0;
  let end = arr.length - 1;

  // checking if the array is not rotated

  if (arr[start] < arr[end]) {
    return arr[0];
  }

  while (start < end) {
    let mid = Math.floor(start + (end - start) / 2);

    if (arr[0] < arr[mid]) {
      start = mid + 1;
    } else {
      end = mid;
    }
  }
  return arr[start];
}
