// Input:
// [3, 7, 2, 9, 5]

// Output:
// 9

let arr=[3, 7, 2, 9, 5];
let maxNo=arr[0];
for(let i=1;i<arr.length;i++){
    if(maxNo<arr[i]){
        maxNo=arr[i]
    }
}

console.log(maxNo)