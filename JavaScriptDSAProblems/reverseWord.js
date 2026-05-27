// Input:
// "hello world"

// Output:
// "olleh dlrow"

let str="hello world"
function reverseWord(arr){
    let splittedWord=arr.split(" ");
    let word= splittedWord.map((res)=>res.split('').reverse().join(''))

    console.log(word.join(' '))
    return word.join(' ');

}

reverseWord(str)