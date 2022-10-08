// We need to find the peak in a mountain array
// What is mountain array
// e.g of a mountain array => 1 2 3 2 1
// so we can observe from the above example that moutain array is an array which follows this behavious until it's peak => arr[i] < arr[i + 1] and this behavious after the peak => arr[i] > arr[i + 1]
// so to find the peak we need to find the peak which is going to satisfy the following situation in all the cases => arr[peak] > arr[peak -1] and arr[peak] > arr[peak + 1]

// Solution

function findArray(arr) {
  let start = 0;
  let end = arr.length - 1;

  while (start < end) {
    let mid = Math.floor(start + (end - start) / 2);

    if (arr[mid] < arr[mid + 1]) {
      start = mid + 1;
    } else {
      end = mid;
    }
  }
  return start;
}
