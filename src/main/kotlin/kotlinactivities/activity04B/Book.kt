package kotlinactivities.activity04B
// 1. Use class to represent the Book rather string.
// A book has a title, authors, year published, edition, ISBN, publisher.
// A book may have a list of chapters.
// A book has a number of pages.
class Book( private var title:String,private var authors:String,private var yearPublished:Int, private var edition:Int,
            private var ISBN:Long, private var publisher:String,private var chapter:MutableList<String>,private var numberOfPages:Int) {

    fun getTitle(title: String) {
        this.title = title
    }
    fun getAuthor(authors: Authors){
        this.authors =authors.setFirstName()
    }
    fun getYearPublished(yearPublished: Int){
        this.yearPublished=yearPublished
    }
    fun getEdition(edition: Int){
        this.edition =edition
    }
    fun getISBN(ISBN: Long){
        this.ISBN =ISBN
    }
    fun getPublisher(publisher: Publisher){
        this.publisher = publisher.setName()
    }
    fun getChapter(chapter: MutableList<String>){
        this.chapter =chapter
    }
    fun getNumberOfPages(numberOfPages: Int){
        this.numberOfPages =numberOfPages
    }

    fun setTitle():String{
        return title
    }
    fun setAuthor():String{
        return authors
    }
    fun setEdition():Int{
        return edition
    }
    fun setISBN():Long{
        return ISBN
    }
    fun setPublisher():String{
        return publisher
    }
    fun setChapter():List<String>{
        return chapter
    }
    fun setNumberOfPages():Int{
        return numberOfPages
    }
}
