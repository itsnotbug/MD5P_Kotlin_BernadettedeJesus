package kotlinactivities.activity04B
// 1. Use class to represent the Book rather string.
// A book has a title, authors, year published, edition, ISBN, publisher.
// A book may have a list of chapters.
// A book has a number of pages.
class Book( private var title:String,private var authors:String,private var yearPublished:Int, private var edition:Int,
            private var ISBN:Long, private var publisher:String,private var chapter:MutableList<String>,private var numberOfPages:Int) {

    fun setTitle(title: String) {
        this.title = title
    }
    fun setAuthor(authors: Authors){
        this.authors =authors.getFirstName()
    }
    fun setYearPublished(yearPublished: Int){
        this.yearPublished=yearPublished
    }
    fun setEdition(edition: Int){
        this.edition =edition
    }
    fun setISBN(ISBN: Long){
        this.ISBN =ISBN
    }
    fun setPublisher(publisher: Publisher){
        this.publisher = publisher.setName()
    }
    fun setChapter(chapter: MutableList<String>){
        this.chapter =chapter
    }
    fun setNumberOfPages(numberOfPages: Int){
        this.numberOfPages =numberOfPages
    }

    fun getTitle():String{
        return title
    }
    fun getAuthor():String{
        return authors
    }
    fun getEdition():Int{
        return edition
    }
    fun getISBN():Long{
        return ISBN
    }
    fun getPublisher():String{
        return publisher
    }
    fun getChapter():List<String>{
        return chapter
    }
    fun getNumberOfPages():Int{
        return numberOfPages
    }
}
