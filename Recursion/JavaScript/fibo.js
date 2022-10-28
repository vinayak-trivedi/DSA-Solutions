// find the fibonacci number of a series given the number n return the number n return the nth value of that fibonacci series

function fibo(n) {
  // base cases

  if (n === 0) {
    return 0;
  } 
  
  if (n === 1) {
    return 1;
  }

  // recursive case
  return fibo(n - 1) + fibo(n - 2);
}

console.log("The 5th number in the fibonacci series is: ", fibo(5))