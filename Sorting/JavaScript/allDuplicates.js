// find all the duplicate numbers in the given array which is in the range 1 to n

const arr = [4, 3, 2, 7, 8, 2, 3, 1];

// we will first do cyclic sort and then run a for loop to check which number is not in the correct index even after getting sorted those numbers are the ones which are duplicated


function swap(arr, firstIndex, secondIndex) {
  const temp = arr[firstIndex];
  arr[firstIndex] = arr[secondIndex];
  arr[secondIndex] = temp;
}
function findAllDuplicate(arr) {
  let i = 0;
  const answer = [];
  while (i < arr.length) {
    let correctIndex = arr[i] - 1;
    console.log("arr", arr)
    console.log("i", i)
    console.log("correctIndex", correctIndex)

    if (arr[i] !== arr[correctIndex]) {
      swap(arr, correctIndex, i)
    } else {
      i++;
    }
  }

  // now we will go through each element of the array to check which are still not in the correct place they are the ones which are duplicated

  for (let index = 0; index < arr.length; index++) {
    if (arr[index] !== index + 1) {
      answer.push(arr[index])
    }
  }

  return answer;
}

console.log(findAllDuplicate(arr))