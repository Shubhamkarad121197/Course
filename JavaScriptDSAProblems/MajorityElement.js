var majorityElement = function(nums) {
    let map=new Map();
    for(let num of nums){
        if(map.has(num)){
            map.set(num,map.get(num)+1)
        }else{
            map.set(num,1);
            
        }
    }
    let maxCount=0;
    let numberMajority=0
    for(const [num,count] of map.entries()){
        
        if(count>maxCount){
            maxCount=count;
            numberMajority=num;
            
       
        }
    }
    return numberMajority;
};