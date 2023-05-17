package kotlinactivities
fun main(){
    //1. Create an ArrayList of names with 20 entries.
    val bookList  = arrayListOf<String>("The Art of Not Giving a Fuck","Ikigai","Harry Potter and Sorcerrer's Stone","The Hobbit","Hit them where it hurts"," Just a matter of time","This is For Real"," In Search of Lost Time","Sarah","Ulysses", " One Hundred Years of Solitude", " The Great Gatsby","Hamlet"," The Divine Comedy","Lolita"," Leaves of Grass"," Tristram Shandy","The Magic Mountain","A Portrait of the Artist as a Young Man","Midnight's Children")

    //For number 2
    println("Enter name of a book: ")
    val bookName = readln()

    //Search Student Call in function
    searchBook(bookName,bookList)

    //Check if student bookName is in the record
    if(!isInRecord(bookName,bookList)){
        //if is not, it will add in the record, mata ko please.
        addBook(bookName,bookList)
    }else{
        //if found, remove it --  just added this logic, just to showcase lang yun function.
        removeBook(bookName,bookList)
    }

    //Display the number of students
    println("Total Number of books: ${countBook(bookList)}")
}

//2. Create a function "isInRecord" that will accept a bookName and return true if the bookName is found, otherwise false.
fun isInRecord(bookName:String,bookList: ArrayList<String>):Boolean{
    for(book in bookList){
        if(book == bookName){
            return true
        }
    }
    return false
}

//3.Create a function "addBook" that will accept a bookName and add it to the ArrayList.
fun addBook(bookName: String, bookList: ArrayList<String>) {
    bookList.add(bookName)
}

//4. Create a function "removeStudent"  that will accept a bookName and remove it from the ArrayList.
fun removeBook(bookName: String, bookList: ArrayList<String>) {
    bookList.remove(bookName)
}

//5. Create a function "countStudent" that will return the size of the ArrayList.
fun countBook(bookName: ArrayList<String>):Int{
    return bookName.size
}

//6. Create a function "searchBookWildSearch" that will accept a String and search if that string is found
// within the ArrayList, it will return an ArrayList of names that matched if there are.
fun searchBookWildSearch(bookList: ArrayList<String>) {
    showBook(bookList)
}

//7. Create a function  "searchBookName" that will accept a String and search
//if there is an exact match of the String input,it will return an ArrayList of names that matched if there are.
fun searchBookName(bookName:String,bookList: ArrayList<String>): ArrayList<String> {
    val matchList= ArrayList<String>()
    for(book in bookList){
        if(book == bookName){
            matchList.add(book)
            return matchList
        }
    }
    return matchList
}

//8. Create a function "searchBook" that will accept a String and call "searchBookWildSearch" if the String input is
//less than or equal to three, and it will call "searchBookName" if the String input is greater than three.
fun searchBook(bookName:String,bookList: ArrayList<String>){
    val numberOfChar = bookName.toCharArray()
    if(numberOfChar.size <4){
        searchBookWildSearch(bookList)
    }else{
        searchBookName(bookName,bookList)
    }
}

//9.  Create a function "showBook" that will print all the entries in the ArrayList.
fun showBook(bookList: ArrayList<String>){
    for(book in bookList){
        println(book)
    }
}
