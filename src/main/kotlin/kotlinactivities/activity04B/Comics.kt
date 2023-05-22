package kotlinactivities.activity04B
class Comics(private var title:String,private var monthPublished:String, private var yearPublished:Int,private var illustrator: Illustrator,private var publisher:String){
////    5. Add a class Comics.
////    A comic has a title, month published, year published, illustrators, publisher.

    private var comicList = mutableListOf<Comics>()
    init {
        this.comicList.add(this)

    }
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
    fun searchComics(name: String) {
        for (comics in comicList) {
            if (comics.getTitle() == name) {
                println("${comics.getTitle()} is found")
                return
            }
        }
        println("No item found")
    }

    fun displayComics() {
        for (comics in comicList) {
            println("Title: ${comics.getTitle()}")
            println("Illustrator:${comics.getIllustrator()}")
            println("Publisher:${comics.getPublisher()}")
            println("Month Published:${comics.getMonthPublished()}")
            println("Year Published:${comics.getYearPublished()}")
        }
    }
}