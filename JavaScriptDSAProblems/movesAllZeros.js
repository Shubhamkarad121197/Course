// Input:
// [0,1,0,3,12]

// Output:
// [1,3,12,0,0]
let arr=[0,1,0,3,12]
function movesZeros(arr){
    let newArr=new Array(arr.length).fill(0);
    
    let count=0;
    for(let i=0;i<arr.length;i++){
       if(arr[i]>0){
           newArr[count]=arr[i]
            count++;
       }
    }
    return newArr;
}
console.log(movesZeros(arr))