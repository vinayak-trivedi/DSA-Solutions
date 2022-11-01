// return the product of all the digits
// so if we have a number => 143, we return 1 * 4 * 3 = 12

// if we see, the problem can be broken down into smaller problem
// the product of 1432 can also be written as product of 143 * 2
// this can be futher broken down => product of 14 * 3


function productOfDigits(n) {
  if (n === 1) {
    return 1;
  }

  let numberPassedInfunction = Math.floor(n/10);
  let numberToBeAdded = Math.floor(n % 10);

  console.log("numberPassedInfunction", numberPassedInfunction)
  console.log("numberToBeAdded", numberToBeAdded)

  return productOfDigits(numberPassedInfunction) * numberToBeAdded
}

console.log("ans", productOfDigits(14325))