// //Two Sum with Two  pointers
// let nums = [2, 7, 11, 15];
// let target = 9;
// function twoSum(nums, target) {
//   let left = 0,
//     right = nums.length - 1;
//   while (left <= right) {
//     let sum = nums[left] + nums[right];
//     if (target == sum) {
//       return [left, right];
//     }
//     if (target > sum) {
//       left++;
//     } else {
//       right--;
//     }
//   }
//   return [-1, -1];
// }

// console.log(twoSum(nums, target));

//Optimal Approach Using match
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
let nums=[2,7,11,15];
let target=9;
function twoSum(nums,target){
   let map=new Map();
   for(let i=0;i<nums.length;i++){
       let diff=target-nums[i]
       if(map.has(diff)){
           return [map.get(diff),i]
       }
       else{
           map.set(nums[i],i)
       }
   }
    
}

console.log(twoSum(nums,target))
