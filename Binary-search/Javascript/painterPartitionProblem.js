/*
Question: we are given an array of boards which contain the length of that board, we are also a value k which represents the number of workers present to paint all the board, each unit of board takes 1 unit of time to paint that board, 

we need to distribute the array between all the painters in such a way that it takes minimum time for each of them, one condition is that it should be distributed continuously.e.g if we have an 5 5 5 5 then it should be divided between both of them like this 5, 5 to first one and 5 5 to the second one or any other way but it has to be continuous

POSSIBLE COMBINATIONS OF DISTRIBUTION

sum => 5    15    max => 15
1st => 5 | 5 5 5

sum => 10    10    max => 10
2nd => 5 5 | 5 5

sum => 15    5    max => 15
3rd => 5 5 5 | 5

we can compare the max time for each of the case and then we can get the minimum time among them and that is the most feasible distribution, in our case it is the second one

- HOW DO WE FIND IT?

- we can do it by following approach
- we make all the possible distributions
- we find the maximum in each case
- and then we return the minimum among them

we can do this using binary search as well

we know that minimum unit alloted to a person is going to be 5(smallest), and the maximum can be 20, so the minimum time taken would be 5 and maximum would be 20, now we have a search range where we can perform binary search

- SOLUTION APPROACH
- we take a mid
- we find if that mid is the minimum in the maximums by doing the following
  - we start dividing the boards to the painters
  - we make sure that when distributing it should be within that range
  - if we exceed the limit than we go to the other painter
  - if we excced the number of labours while distributing it, we return false, because 
  it means that this cannot be a minimum maximum number as we are not able to distribute the boards fully if we distribute by taking it as the max number
  - we increase our start and it becomes start => mid + 1;
  
  - if we are able to distribute the array boards fully among all the labours then we will store this value and decrease our search range by doing end = mid + 1 because after that all the number would be a possible solution.
*/

function isPossibleSolution(arr, mid, k) {
  let timeTaken = 0;
  let painter = 1; // will be assigning those boards first to the first painter

  for (let i = 0; i < arr.length; i++) {
    if (timeTaken + arr[i] <= mid) {
      timeTaken += arr[i]
    } else {
      painter++;
      if (painter > k || arr[i] > mid) {
        return false;
      }
      timeTaken = arr[i]
    }
  }
  return true;
}

function findAns (arr, k) {
  let start = 0;
  let sum = 0;
  let ans = 0;

  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  let end = sum;

  while (start <= end) {
    let mid = Math.floor(start + (end - start)/2);

    if (isPossibleSolution(arr, mid, k)) {
      ans = mid;
      end = mid - 1;
    } else {
      start = mid + 1;
    }
  }
  return ans
}

const boardArray = [5, 5, 5, 5];

console.log("Answer: ",findAns(boardArray, 2))