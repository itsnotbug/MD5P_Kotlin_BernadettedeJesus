package kotlinactivities.activity04B
// 3. Add a class for newspaper.
//  A newspaper has a name, day published, month published, year published and headline.
//  A newspaper and magazine have articles.
class Newspaper(private var name:String, private var dayPublished:Int, private var monthPublished:String, private var yearPublished:Int,
                private var headLine:String) {

   private var newspaperList= mutableListOf<Newspaper>()

    init {
        newspaperList.add(this)
    }
    fun setName(name: String) {
        this.name = name
    }

    fun setDayPublished(dayPublished: Int) {
        this.dayPublished = dayPublished
    }

    fun setMonthPublished(monthPublished: String) {
        this.monthPublished = monthPublished
    }

    fun setYearPublished(yearPublished: Int) {
        this.yearPublished = yearPublished
    }

    fun setHeadline(headLine: String) {
        this.headLine = headLine
    }

    fun getName(): String {
        return name
    }

    fun getDayPublished(): Int {
        return dayPublished
    }

    fun getMonthPublished(): String {
        return monthPublished
    }

    fun getYearPublished(): Int {
        return yearPublished
    }

    fun getHeadline(): String {
        return headLine
    }

    fun searchNewsPaper(name: String) {
        for (newsPaper in newspaperList) {
            if (newsPaper.getName() == name) {
                println("${newsPaper.getName()} is found")
                return
            }
        }
        println("No item found")
    }

    fun displayNewspaper() {
        for (newsPaper in newspaperList) {
            println("Name: ${newsPaper.getName()}")
            println("Headline: ${newsPaper.getHeadline()}")
            println("Month Published: ${newsPaper.getMonthPublished()}")
            println("Day Published: ${newsPaper.getDayPublished()}")
            println("Year Published: ${newsPaper.getYearPublished()}")
        }
    }

}