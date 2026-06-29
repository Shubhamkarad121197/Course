function solve(nums, target) {
  let left = 0,
    right = nums.length;
  while (left < right) {
    let mid = Math.floor((left + right) / 2);
    if (nums[mid] == target) {
      return mid;
    } else if (nums[mid] < target) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }
  return -1;
}
// nums=[1,3,5,6], target=5