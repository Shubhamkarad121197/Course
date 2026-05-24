let arr=[12,34,56,12,34,78,98];
function removeDuplicates(arr){
    let uniqueArr=[]
    for(let i=0;i<arr.length;i++){
        let seen=false;
        for(let j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                seen=true;
            }
        }
        if(!seen){
            uniqueArr.push(arr[i])
        }
    }
    return uniqueArr;
}

console.log(removeDuplicates(arr))
let newSet=[...new Set(arr)]
console.log(newSet);