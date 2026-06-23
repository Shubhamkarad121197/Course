// Input:
// "shubham"

// Output:
// 2

let str="shubham";
function findVowelsCount(str){
    let vowels=new Set(['A','E','I','O','U',"a",'e','i','o','u']);
    let count=0;
    let consonants=0
    for(let char of str){
        if(vowels.has(char)){
            count++;
        }else{
            consonants++;
        }
    }
    return `vowels:${count}:consonants:${consonants}`;
}

console.log(findVowelsCount(str));