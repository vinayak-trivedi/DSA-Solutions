// find factorial of the given number using recursion

/*
  let's see what are factorial number
  - factorial of a number is a the factor of all the positive integer     numbers, so the factorial of 5 => 5 * 4 * 3 * 2 * 1 => 120
  - if we take a look the factorial of 5 can also be written as 5 * 4!
  - so we can call the factorial function with n - 1 recursively until we reach 0

*/

function factorial(n) {
  if (n === 0) {
    return 1;
  }

  return n * factorial(n - 1);
}



console.log("factorial of 4: ", factorial(4)) // should give 24