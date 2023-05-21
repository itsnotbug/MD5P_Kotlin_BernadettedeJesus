package kotlinactivities.activity04B
class Comics(private var title:String,private var monthPublished:String, private var yearPublished:Int,private var illustrator: Illustrator,private var publisher:String){
////    5. Add a class Comics.
////    A comic has a title, month published, year published, illustrators, publisher.

fun setTitle(title: String) {
    this.title = title
}

    fun setMonthPublished(monthPublished: String) {
        this.monthPublished = monthPublished
    }

    fun setYearPublished(yearPublished: Int) {
        this.yearPublished = yearPublished
    }

    fun setIllustrator(illustrator: Illustrator) {
        this.illustrator = illustrator
    }

    fun setPublisher(publisher: String) {
        this.publisher = publisher
    }

    // Getters
    fun getTitle(): String {
        return title
    }

    fun getMonthPublished(): String {
        return monthPublished
    }

    fun getYearPublished(): Int {
        return yearPublished
    }

    fun getIllustrator(): Illustrator {
        return illustrator
    }

    fun getPublisher(): String {
        return publisher
    }

}