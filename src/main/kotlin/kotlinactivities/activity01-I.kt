import java.util.Date

fun main(){
//    Activity 01 - I
//    Using Activity 01 - B, Implement a process where someone can borrow a book.
//    User: Librarian
//    Goal: Keep track of books borrowed, who borrowed and how long it can be borrowed.
//    Scope :Data Structures



//declaration of variables
    var borrowerName:String=""
    var bookTitle=""
    var bookCategory:String=""
    var bookID:Int
    var isCheckedOut:Boolean=false
    var bookDescription =""
    var bookSize:Int= 50
    var bookColor:String =""
    
    //List of the books available
    //book names from https://thegreatestbooks.org/
    val bookName = mutableListOf<String>()
    bookName.add("In Search of Lost Time")
    bookName.add("Ulyssese")
    bookName.add("Don Quixote")
    bookName.add("Moby Dick")
    bookName.add("War and Peace")
    bookName.add("Hamlet")
    bookName.add("The Odyssey ")

    //display and loop books on the list
    var ctr:Int=0 //counter
    var i=0
    println("Books available in Library")
    println("----------------------------")
    while (ctr<bookName.size){
        println("(${i+1}) ${bookName[ctr]}")
        i++
        ctr++
    }

    var answer:Char= ' '
    println()
    println("----------------------------")
    println("Would you like to borrow a book? [Y/N]")
    answer = readln().first()

    when(answer){
        'Y'->{
            var pick:Int=0
            println("Please choose book from [1-7]")
            pick= readln().toInt()
            when(pick){
                1->{
                    
                    bookColor="Green"
                    bookCategory="History"
                    bookSize=20
                    bookTitle="In Search of Lost Time"
                    bookID=12345
                    bookDescription ="None"

                    println("Item Category: $bookCategory")
                    println("Item ID: $bookID")
                    println("Item ID: $bookTitle")
                    println("Is checked out?: $isCheckedOut")
                    println("Item Description: $bookDescription")
                    println("Item Category: $bookSize")
                    println("Item Color: $bookColor")

                    println()
                    println("Confirm checkout-- Enter Y to continue and N to exit")
                    var pick2 = readln().first()
                    if(pick2.equals('Y') || pick2.equals('y')){

                    }

                }
                2->{
                    bookColor="Blue"
                    bookCategory="Poetry"
                    bookSize=20
                    bookTitle="Ulyssese"
                    bookID=12346
                    bookDescription ="None"

                    println("Item Category: $bookCategory")
                    println("Item ID: $bookID")
                    println("Item ID: $bookTitle")
                    println("Is checked out?: $isCheckedOut")
                    println("Item Description: $bookDescription")
                    println("Item Category: $bookSize")
                    println("Item Color: $bookColor")
                }
                3->{
                    bookColor="Orange"
                    bookCategory="Literature"
                    bookSize=20
                    bookTitle="Don Quixote"
                    bookID=12347
                    bookDescription ="None"

                    println("Item Category: $bookCategory")
                    println("Item ID: $bookID")
                    println("Item ID: $bookTitle")
                    println("Is checked out?: $isCheckedOut")
                    println("Item Description: $bookDescription")
                    println("Item Category: $bookSize")
                    println("Item Color: $bookColor")
                }
                4->{
                    bookColor="Purple"
                    bookCategory="Adventure"
                    bookSize=20
                    bookTitle="Moby Dick"
                    bookID=12347
                    bookDescription ="None"

                    println("Item Category: $bookCategory")
                    println("Item ID: $bookID")
                    println("Item ID: $bookTitle")
                    println("Is checked out?: $isCheckedOut")
                    println("Item Description: $bookDescription")
                    println("Item Category: $bookSize")
                    println("Item Color: $bookColor")

                }
                5->{
                    bookColor="Brown"
                    bookCategory="War"
                    bookSize=20
                    bookTitle="War and Peace"
                    bookID=12348
                    bookDescription ="None"

                    println("Item Category: $bookCategory")
                    println("Item ID: $bookID")
                    println("Item ID: $bookTitle")
                    println("Is checked out?: $isCheckedOut")
                    println("Item Description: $bookDescription")
                    println("Item Category: $bookSize")
                    println("Item Color: $bookColor")
                }
                6->{
                    bookColor="Purple"
                    bookCategory="Literature"
                    bookSize=20
                    bookTitle="Hamlet"
                    bookID=12349
                    bookDescription ="None"

                    println("Book Category: $bookCategory   | Book ID: $bookID")
                    println("Book Number: $bookTitle        | Book Description: $bookDescription")
                    println("Is checkout?: $isCheckedOut")
                }
                7->{
                    bookColor="Yellow"
                    bookCategory="Literature"
                    bookSize=20
                    bookTitle="The Odyssey"
                    bookID=12350
                    bookDescription ="None"

                    println("Item Category: $bookCategory")
                    println("Item ID: $bookID")
                    println("Item ID: $bookTitle")
                    println("Is checked out?: $isCheckedOut")
                    println("Item Description: $bookDescription")
                    println("Item Category: $bookSize")
                    println("Item Color: $bookColor")
                }
            }

        }
    }


}
