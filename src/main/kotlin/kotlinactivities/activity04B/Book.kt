package kotlinactivities.activity04B
// 1. Use class to represent the Book rather string.
// A book has a title, authors, year published, edition, ISBN, publisher.
// A book may have a list of chapters.
// A book has a number of pages.
class Book( private var title:String,private var authors:String,private var yearPublished:Int, private var edition:Int,
           private var ISBN:Long, private var publisher:String,private var chapter:MutableList<String>,private var numberOfPages:Int) {
}