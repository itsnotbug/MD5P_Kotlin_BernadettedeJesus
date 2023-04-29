fun main(){
//    Write a function called countWords() that takes in a string of text and returns the number of words in the text.
//    A word is defined as any sequence of characters separated by whitespace.

    var input :String=""
    var count:Int=0

    println("Enter a string:")
    input= readln()

    count = countWords(input)

    println("Number of words: $count")
}
fun countWords(input:String):Int{
    var i:Int=0
    var wordCount:Int=0
    var checker:Int=0
    while (i<input.length){
        if(input[i]==' ' || input[i]=='\n' || input[i]== '\t'){
            checker=0
        }
        else if(checker==0){
            checker=1
            wordCount++

        }
        i++
    }
return wordCount
}