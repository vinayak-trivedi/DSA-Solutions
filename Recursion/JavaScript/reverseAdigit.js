// we need to reverse a digit
// if we have 8234 we need to return 4328
// normally how would we reverse it
// we make a new int array with 0 as intial value take out the last element by taking out the remainder after dividing with 10 which is going to be last digit if we use Math.floor and then we multiply that new integer with 10 and add this number there

// number is 8532
// let newReversed = 0

// taking remainder first time we get => 2
// newReverse = newReversed * 10 + 2
// newRevesre = 2
// now change the current number by diving it by 10
// and we can repeat these steps until our number is reversed

// We can break donw this problem into a smaller problem
// reverse of 8523 can also be writeen as 3 + reverse of 852
// this can further be broken => 2 + reverse of 85


let sum = 0;
function reverse(n) {
  if (n === 0) {
    return 0;
  }

  sum = sum * 10 + n % 10;
  let numberPassedInfunction = Math.floor(n/10);
  reverse(numberPassedInfunction)
}

console.log(reverse(5431))
console.log(sum)