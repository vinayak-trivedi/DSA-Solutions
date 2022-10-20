// Question link => https://leetcode.com/problems/set-mismatch/

// we need to find out the number which is repeated and the number which should have been at it's place the number is in the range 1 to n

// we know that the number is in the range 1 to n so the index of every number would be number - 1. e.g if the number is 1 then it's index should be 0

// so we can first sort the array using cylic sort and then check which number is not in the desired place and the number which is that index is the repeated number the index is the number which should have been present there

/*
for example we have an array like below

[1, 2, 2, 4];

here  every number is in the correct index, only 2 is not in the correct index, and what number should be there in place of two? we can find it by looking at the index which is 2 add 1 to it, because every number is in the index => number - 1
*/

// SOLUTION

const arr = [1, 2, 4, 2]

function swap(arr, firstIndex, secondIndex) {
  const temp = arr[firstIndex];
  arr[firstIndex] = arr[secondIndex];
  arr[secondIndex] = temp;
}

function findSetMisMatch(arr) {
  let i = 0;
  const answer = [];

  while (i < arr.length) {
    let correctIndex = arr[i] - 1;

    if (arr[i] !== arr[correctIndex]) {
      swap(arr, correctIndex, i)
    } else {
      i++;
    }
  }

  console.log(arr)

  for (let index = 0; index < arr.length; index++) {
    if (arr[index] !== index + 1) {
      answer.push(arr[index])
      answer.push(index + 1)
    }
  }
  return answer
}

console.log(findSetMisMatch(arr))