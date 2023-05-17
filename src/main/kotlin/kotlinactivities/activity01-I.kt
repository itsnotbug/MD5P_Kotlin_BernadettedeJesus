package kotlinactivities
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
//    Activity 01 - I
//    Using Activity 01 - B, Implement a process where someone can borrow a book.
//    User: Librarian
//    Goal: Keep track of books borrowed, who borrowed and how long it can be borrowed.
//    Scope :Data Structures

    //I modified my code based on requirements -USER IS  LIBRARIAN NOT BORROWER

//declaration of variables
    var borrowerName:String=""
    var bookToBeBorrowed:String=""

    //book names from https://thegreatestbooks.org/
    val bookList = mutableMapOf<String,String>()
    bookList.put("12345","In Search of Lost Time")
    bookList.put("12346","Ulyssese")
    bookList.put("12347","Don Quixote")
    bookList.put("12348","Moby Dick")
    bookList.put("12349","War and Peace")
    bookList.put("12350","Hamlet")
    bookList.put("12351","The Odyssey ")


    //println(bookList)
    println("List of Available Books in the Library")
    println("----------------------------")
    displayBook(bookList)

    println()
    println("----------------------------")
    println("Enter borrower's name: ")
    borrowerName = readln()
    println("Enter books ID: ")
    bookToBeBorrowed = readln()

    //Check if the book is available on library
    checkIfContainsInLibrary(bookToBeBorrowed,bookList)

    //display the details and checkout
    displayBookDetails(borrowerName,bookToBeBorrowed,bookList)

    //display updated list
    println()
    println("-------UPDATED BOOK LIST--------")
    updateBookList(bookToBeBorrowed,bookList)


}

fun updateBookList(bookID: String, bookList: MutableMap<String, String>){
    var i=0
    bookList.remove(bookID)
    for((bookNumber,book) in bookList){
        println("(${i+1}) $book")
        i++
    }
}

fun displayBook(bookList: MutableMap<String, String>): MutableMap<String, String> {
    var i=0
    for((bookNumber,book) in bookList){
        println("(${i+1}) $book")
        i++
    }
    return bookList
}

fun checkIfContainsInLibrary(bookID:String,bookList: MutableMap<String, String>)
{
    for((bookNumber,book) in bookList){
         if(bookID==bookNumber){
             println("Book $bookNumber - $book is available")

        }
    }
}

fun displayBookDetails(borrowerName: String, bookToBeBorrowed: String, bookList: MutableMap<String, String>) {
    var bookTitle=""
    var bookCategory:String=""
    var bookID:Int
    var isCheckedOut:Boolean=false
    var bookDescription =""
    var bookColor:String =""
    var days:Int=0

    when(bookToBeBorrowed){
        "12345" ->{
            bookColor="Green"
            bookCategory="History"
            bookTitle="In Search of Lost Time"
            bookID=12345
            bookDescription ="None"
            days=3

            //will display the details of the book
            displayDetails(bookID,bookCategory,bookTitle,bookDescription,bookColor)
            //proceed to checkout the books
            checkOutBook(borrowerName,bookID,bookTitle,days)
        }
        "12346" ->{
            bookColor="Blue"
            bookCategory="Poetry"
            bookTitle="Ulyssese"
            bookID=12346
            bookDescription ="None"
            days=4

            //will display the details of the book
            displayDetails(bookID,bookCategory,bookTitle,bookDescription,bookColor)
            //proceed to checkout the books
            checkOutBook(borrowerName,bookID,bookTitle,days)
        }
        "12347" ->{
            bookColor="Orange"
            bookCategory="Literature"
            bookTitle="Don Quixote"
            bookID=12347
            bookDescription ="None"
            days=5

            //will display the details of the book
            displayDetails(bookID,bookCategory,bookTitle,bookDescription,bookColor)
            //proceed to checkout the books
            checkOutBook(borrowerName,bookID,bookTitle,days)

        }
        "12348" ->{
            bookColor="Purple"
            bookCategory="Adventure"
            bookTitle="Moby Dick"
            bookID=12348
            bookDescription ="None"
            days=2

            //will display the details of the book
            displayDetails(bookID,bookCategory,bookTitle,bookDescription,bookColor)
            //proceed to checkout the books
            checkOutBook(borrowerName,bookID,bookTitle,days)
        }
        "12349" ->{

            bookColor="Brown"
            bookCategory="War"
            bookTitle="War and Peace"
            bookID=12349
            bookDescription ="None"
            days=3

            //will display the details of the book
            displayDetails(bookID,bookCategory,bookTitle,bookDescription,bookColor)
            //proceed to checkout the books
            checkOutBook(borrowerName,bookID,bookTitle,days)
        }
        "12350" ->{
            bookColor="Purple"
            bookCategory="Literature"
            bookTitle="Hamlet"
            bookID=12350
            bookDescription ="None"
            days=6
            //will display the details of the book
            displayDetails(bookID,bookCategory,bookTitle,bookDescription,bookColor)
            //proceed to checkout the books
            checkOutBook(borrowerName,bookID,bookTitle,days)
        }
        "12351" ->{
            bookColor="Yellow"
            bookCategory="Literature"
            bookTitle="The Odyssey"
            bookID=12351
            bookDescription ="None"
            days=6

            //will display the details of the book
            displayDetails(bookID,bookCategory,bookTitle,bookDescription,bookColor)
            //proceed to checkout the books
            checkOutBook(borrowerName,bookID,bookTitle,days)
        }

    }
}

fun checkOutBook(borrowerName: String, bookID: Int, bookTitle: String,days:Int) {

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    val current = LocalDateTime.now().plusDays(3)
    val dueDate =calculateDateTime(current,days)
    dueDate.format(formatter)

    println("This book can be borrowed for only $days days")
    println("Failure to return will costs a fee of $10")
    println()
    println("****************CHECK OUT***********************")
    println("Borrower's Name: $borrowerName")
    println("Book Borrowed [ID/Title]:[$bookID]-$bookTitle ")
    println("Date Borrowed: ${current.format(formatter)}")
    println("Return/Due Date: ${dueDate.format(formatter)}  ")

}
fun calculateDateTime(dueDate: LocalDateTime,dayToLend: Int): LocalDateTime {
    return dueDate.plusDays(dayToLend.toLong())
}
fun displayDetails(bookID: Int, bookCategory: String, bookTitle: String, bookDescription: String, bookColor: String) {
    println()
    println("*************** Book Details *******************")
    println("Number:      $bookID")
    println("Category:    $bookCategory")
    println("Title:       $bookTitle")
    println("Description: $bookDescription")
    println("Color:       $bookColor")
}


