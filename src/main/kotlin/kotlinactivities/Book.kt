package kotlinactivities
//    Activity 04 - B
//    Covered Topic(s) : Classes
//    Instructions :
//    1. Use class to represent the Book rather string.
//    A book has a title, authors, year published, edition, ISBN, publisher.
//    A book may have a list of chapters.
//    A book has a number of pages.
data class Book(val title:String,
                val author:String,
                val yearPublished:String,
                val edition:String,
                val ISBN:String,
                val publisher:String,
                val chapters: ArrayList<String> = arrayListOf<String>(),
                val numberOfPages:Int)




