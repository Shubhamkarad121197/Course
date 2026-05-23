fruits=["apple","banana","banana","Grapes","Grapes","banana"];

function fruitsWithCount(fruits){
    let map=new Map();
    for(let fruit of fruits){
        if(map.has(fruit)){
            map.set(fruit,map.get(fruit)+1)
        }else{
            map.set(fruit,1)
        }
    }
    let arr=[]
    for(let [fruits,count] of map.entries()){
        arr.push(`${fruits}:${count}`)
    }
    return arr;
}
console.log(fruitsWithCount(fruits))