package kotlinactivities
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
fun main(){
    // Implement Activity01-B
    
        var borrowerName:String=""
        var ItemToBeBorrowed:String=""

        val ItemList = mutableMapOf<String,String>()
        ItemList.put("12345","Encyclopedia")
        ItemList.put("12346","Kimono")
        ItemList.put("12347","Desk")
        ItemList.put("12348","Laptop")
        ItemList.put("12349","News Paper")
        ItemList.put("12350","Book Cutter")
        ItemList.put("12351","Flash Cards")


        //println(ItemList)
        println("Items in the Library")
        println("----------------------------")
        displayItems(ItemList)

        println()
        println("----------------------------")
        println("Enter borrower's name: ")
        borrowerName = readln()
        println("Enter item's ID: ")
        ItemToBeBorrowed = readln()

        //Check if the book is available on library
        checkIfContainsItemInLibrary(ItemToBeBorrowed,ItemList)

        //display the details and checkout
        displayItemDetails(borrowerName,ItemToBeBorrowed,ItemList)

        //display updated list
        println()
        println("-------UPDATED ITEM LIST--------")
        updateItemList(ItemToBeBorrowed,ItemList)


    }

    fun updateItemList(itemID: String, ItemList: MutableMap<String, String>){
        var i=0
        ItemList.remove(itemID)
        for((itemNumber,book) in ItemList){
            println("(${i+1}) $book")
            i++
        }
    }

    fun displayItems(ItemList: MutableMap<String, String>): MutableMap<String, String> {
        var i=0
        for((itemNumber,book) in ItemList){
            println("(${i+1}) $book")
            i++
        }
        return ItemList
    }

    fun checkIfContainsItemInLibrary(itemID:String,ItemList: MutableMap<String, String>)
    {
        for((itemNumber,book) in ItemList){
            if(itemID==itemNumber){
                println("Book $itemNumber - $book is available")

            }
        }
    }

    fun displayItemDetails(borrowerName: String, ItemToBeBorrowed: String, ItemList: MutableMap<String, String>) {
        var itemName=""
        var itemCategory:String=""
        val itemID:Int
        var itemDescription =""
        var itemColor:String =""
        var days:Int=0

        when(ItemToBeBorrowed){
            "12345" ->{
                itemColor="Green"
                itemCategory="Books"
                itemName="Encyclopedia"
                itemID=12345
                itemDescription ="None"
                days=3

                //will display the details of the book
                displayDetailsOfItem(itemID,itemCategory,itemName,itemDescription,itemColor)
                //proceed to checkout the books
                checkOutItem(borrowerName,itemID,itemName,days)
            }
            "12346" ->{
                itemColor="Blue"
                itemCategory="Cultural Costume"
                itemName="Kimono"
                itemID=12346
                itemDescription ="None"
                days=4

                //will display the details of the book
                displayDetailsOfItem(itemID,itemCategory,itemName,itemDescription,itemColor)
                //proceed to checkout the books
                checkOutItem(borrowerName,itemID,itemName,days)
            }
            "12347" ->{
                itemColor="Brown"
                itemCategory="Furniture"
                itemName="Desk"
                itemID=12347
                itemDescription ="None"
                days=5

                //will display the details of the book
                displayDetailsOfItem(itemID,itemCategory,itemName,itemDescription,itemColor)
                //proceed to checkout the books
                checkOutItem(borrowerName,itemID,itemName,days)

            }
            "12348" ->{
                itemColor="Silver"
                itemCategory="Gadget"
                itemName="Laptop"
                itemID=12348
                itemDescription ="None"
                days=2

                //will display the details of the book
                displayDetailsOfItem(itemID,itemCategory,itemName,itemDescription,itemColor)
                //proceed to checkout the books
                checkOutItem(borrowerName,itemID,itemName,days)
            }
            "12349" ->{

                itemColor="Variety"
                itemCategory="Paper"
                itemName="News Paper"
                itemID=12349
                itemDescription ="None"
                days=3

                //will display the details of the book
                displayDetailsOfItem(itemID,itemCategory,itemName,itemDescription,itemColor)
                //proceed to checkout the books
                checkOutItem(borrowerName,itemID,itemName,days)
            }
            "12350" ->{
                itemColor="Silver"
                itemCategory="Tool"
                itemName="Book Cutter"
                itemID=12350
                itemDescription ="None"
                days=6
                //will display the details of the book
                displayDetailsOfItem(itemID,itemCategory,itemName,itemDescription,itemColor)
                //proceed to checkout the books
                checkOutItem(borrowerName,itemID,itemName,days)
            }
            "12351" ->{
                itemColor="Variety"
                itemCategory="Education"
                itemName="Flash Cards"
                itemID=12351
                itemDescription ="None"
                days=6

                //will display the details of the book
                displayDetailsOfItem(itemID,itemCategory,itemName,itemDescription,itemColor)
                //proceed to checkout the books
                checkOutItem(borrowerName,itemID,itemName,days)
            }

        }
    }

    fun checkOutItem(borrowerName: String, itemID: Int, itemName: String,days:Int) {

        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        val current = LocalDateTime.now().plusDays(3)
        val dueDate =calculateDateTimeOfBorrowedItem(current,days)
        dueDate.format(formatter)

        println("This item can be borrowed for only $days days")
        println("Failure to return will costs a fee of $10")
        println()
        println("****************CHECK OUT***********************")
        println("Borrower's Name: $borrowerName")
        println("Book Borrowed [ID/Title]:[$itemID]-$itemName ")
        println("Date Borrowed: ${current.format(formatter)}")
        println("Return/Due Date: ${dueDate.format(formatter)}  ")

    }
    fun calculateDateTimeOfBorrowedItem(dueDate: LocalDateTime, dayToLend: Int): LocalDateTime {
        return dueDate.plusDays(dayToLend.toLong())
    }
    fun displayDetailsOfItem(itemID: Int, itemCategory: String, itemName: String, itemDescription: String, itemColor: String) {
        println()
        println("*************** Item Details *******************")
        println("Number:      $itemID")
        println("Category:    $itemCategory")
        println("Title:       $itemName")
        println("Description: $itemDescription")
        println("Color:       $itemColor")
    }



