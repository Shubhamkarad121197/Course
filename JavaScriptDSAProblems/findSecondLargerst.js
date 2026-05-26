// Input:
// [10, 5, 8, 20]

// Output:
// 10

let arr=[10, 5, 8, 20];

function findSecondLargest(arr){
    let uniqueElement= [...new Set(arr)];
    console.log(uniqueElement)
    let sortedArr=uniqueElement.sort((a,b)=>a-b);
    console.log(sortedArr)

    return sortedArr[sortedArr.length-2];
}

console.log(findSecondLargest(arr));