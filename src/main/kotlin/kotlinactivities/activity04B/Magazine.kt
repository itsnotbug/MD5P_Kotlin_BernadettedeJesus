package kotlinactivities.activity04B
// 2. Add a class for magazines.
//    A magazine has an editor, a title, a month published, a year published
class Magazine( private var editor:String, private var title:String,private var monthPublished:String,
                private var yearPublished:Int) {


    //example default list
    var magazineList = mutableListOf<Magazine>()

    init{
        magazineList.add(this)
    }

    fun setEditor(editor: String) {
        this.editor = editor
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

    fun getEditor(): String {
        return editor
    }

    fun getTitle(): String {
        return title
    }

    fun getMonthPublished(): String {
        return monthPublished
    }

    fun getYearPublished(): Int {
        return yearPublished
    }

    fun searchMagazine(title: String) {
        for (magazine in magazineList) {
            if (magazine.getTitle() == title) {
                println("${magazine.getTitle()} is found")
                return
            }
        }
        println("No item found")
    }

    fun displayMagazine() {
        for (magazine in magazineList) {
            println("Editor: ${magazine.getEditor()}")
            println("Title: ${magazine.getTitle()}")
            println("Month Published: ${magazine.getMonthPublished()}")
            println("Year Published: ${magazine.getYearPublished()}")
        }
    }

}