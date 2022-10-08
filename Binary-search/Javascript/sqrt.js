// In this question we need to find the sqrt of a particular number
// we can use Math.sqrt that is provided to us, but we will do it manually now

// first of all we can think of a brute force solution for it

// so if we go through each number from one till the number and check if we get the target element by multiplying the number by itself, we will be able to find the sqrt of it in this way as well

// if we see that we are going through each and every number one by one like 1 2 3 4 5 6, the series is monotonous, so we can use binary search here

/**
 *
 * APPROACH
 *
 * 1.we put the number as end and 0 as start
 * 2.we find the mid
 * 3. we check if mid * mid === number => return mid
 * 4. If mid * mid > number => end = mid - 1;
 * 5. IF mid * mid < number => this is the case where our ans could be a potential ans so we store it in a variable called ans and do start = mid + 1;
 *
 */

// SOLUTION


function findSqrt(x) {
  let start = 1;
  let end = x;
  let ans = 0;

  if (x === 0) {
    return 0;
  }

  if (x === 1) {
    return 1;
  }

  while (start <= end) {
    let mid = Math.floor(start + (end - start) /2);
    let square = mid * mid;
    if (square === x) {
      return mid;
    }

    if (square < x) {
      ans = mid;
      start = mid + 1;
    } else {
      end = mid - 1;
    }
  }
  return ans;
}