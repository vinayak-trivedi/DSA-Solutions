/* 
Question: We are given an array arr, which contains the page number of ith book, number of students m we need to allocate the books amongs m students so that:

1. Every student gets a book 
2. and each book is distributed

we need to see every possibility of distribution and then we need to compare the maximum page in each case with each other and give out the smallest number among them

Let's understand it better with an example

we have a book page array like this => [20, 10, 30, 40]
we have m i.e students => 2

we will look at each possiblity of distribution

sum =>             20    80   max => 80
first possibility 20 | 10 30 40

sum =>             30     70   max => 70
second possibitiy 20 10 | 30 40

sum =>               60       40   max => 60
third possibility  20 10 30 | 40


so we need to return 60 which is smallest in all these maximums

Although, we can do by the following approach => 
1. figure out the the possible distribution in all the cases
2. find the maximum of all the cases
3. campare the maximum of all the cases and return the minimum one

But there is a better way to do that, we can use binary search here
How? this is a unsorted array right?
But if we notice carefully there is rythm in this chaos

if we see the minimum number of pages that a particular student can get is 10 which is the smallest in the array
and the maximum number of pages that can exist is 100

so we have found a search range, that our number can exist between 10 to 100

so now we can apply binary search to find out which is the smallest number in all the maximum of every iteration

## how do we find it?

Let us first understand what is the smallest number in all the maxiumum
- There are only three possibilties in our above case
- we do not have any other possibility so the maximum 60 is the smallest maximum till which we can go

how do we find it now

- first we find out a mid
- then we check if that mid is the value in which a possible distribution exists
- if yes then we store that value and we know that other after it are going to be a possible distribution so we go back in number by doing => end = mid - 1;

- if that is not a possible solution then we move to the right side of the array because below it also our solution is not going to lie, so we go ahead by doing start = mid + 1;

- at the end we return the ans

How do we find if the mid is a possible ans for the minimum in the maximum of all the three combination

- we take the mid and start distributing the book pages to the first student until we reach that mid
- when we reach that mid we start distributing it to the  second student, then if we reach the limit before all book pages in the array are distributed then we know that this is not a possible maximum so we return false

- if the all the book pages are distributed then we know that this is a possible solution
*/ 

function isPossibleSolution(arr, m, mid) {
  console.log(mid)
  let student = 1;
  let pageSum = 0; // this will used to determine if we have exceeded the page limit

  for (let i = 0; i < arr.length; i++) {
    if (pageSum + arr[i] <= mid) {
      pageSum += arr[i]
    } else {
      student++; // we are now giving the books to second student
      if (student > m || arr[i] > mid) {
        return false;
      }
      pageSum = arr[i];
    }
  }
  return true;
}

function findAnswer(arr, m) {
  let start = 0;
  let sum = 0;
  let ans = -1;
  console.log(arr)
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  let end = sum;

  while (start <= end) {    
    let mid = Math.floor(start + (end - start)/2);
    if (isPossibleSolution(arr,m, mid)) {
      ans = mid;
      end = mid - 1;
    } else {
      start = mid + 1;
    }
  }
  return ans;
}

const arr = [10, 30, 20, 40];
const ans = findAnswer(arr, 2)
console.log("answer:", ans)