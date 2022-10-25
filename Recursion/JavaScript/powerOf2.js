// we take a number n and return the 2 to the power n

function powerOf2(n) {
  if (n === 0) {
    return 1;
  } 

  return 2 * powerOf2(n - 1)
}

console.log("2 to the power 5 is equal to: ", powerOf2(5))