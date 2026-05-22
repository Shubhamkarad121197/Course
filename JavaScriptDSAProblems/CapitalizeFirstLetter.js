let string="I am shubham";
function capitalizeFirstWord(string){
    let splittedWords=string.split(" ");
    let reverseWord=[]
    splittedWords.map((res)=>{
        reverseWord.push(res[0].toUpperCase()+res.slice(1))
    })
    
    return reverseWord.join(' ')
}

console.log(capitalizeFirstWord(string));