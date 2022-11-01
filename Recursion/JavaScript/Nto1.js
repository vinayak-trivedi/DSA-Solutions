// print the numbers from n to 1 using recursion

function Nto1(n) {
  if (n === 1) {
    console.log(1)
    return;
  }
  console.log(n)
  Nto1(n - 1)
}

Nto1(5)