let string="I am shubham";

function maxLengthWord(string){
    let splittedString=string.split(" ");
    let maxLength=0;
    let maxCharWord=''
    for(let word of splittedString){
        if(maxLength<word.length){
            maxCharWord=word;
        }
    }
    return maxCharWord;
}

console.log(maxLengthWord(string));