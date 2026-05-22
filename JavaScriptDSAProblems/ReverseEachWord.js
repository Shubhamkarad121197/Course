let string="I am Shubham";
function reverseEachWord(string){
    let splittedWords=string.split(" ");
    let reverseWord=[]
    splittedWords.map((res)=>{
        reverseWord.push(res.split('').reverse().join(''))
    })
    
    return reverseWord.join(' ')
}

console.log(reverseEachWord(string));