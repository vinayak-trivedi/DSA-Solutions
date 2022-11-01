// return the sum of the digits of a given number
// so if the number is 1452, it should return => 1 + 4 + 5 + 2 = 12

function sumOfDigits(n) {
  // we can get the last digit of an item by dividing the number by 10 and also we can remove that last digit by dividing the last digit by 10

  // we know that this problem can be broken down into smaller problem, if we see the sum can be broken down like this
  // sum of 1432 can be written as => sum of 143 + 2
  // this can also be broken down further
  // sum of 143 can be written as => sum of 14 + 3

  if (n === 0) {
    return 0;
  }

  return Math.floor(sumOfDigits(n/10)) + Math.floor(n % 10);
}

console.log("sum", sumOfDigits(789))