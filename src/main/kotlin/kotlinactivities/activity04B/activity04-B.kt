package kotlinactivities.activity04B
fun main(){
////    Activity 04 - B
////    Covered Topic(s) : Classes
////    Instructions :
////    1. Use class to represent the Book rather string.
////    A book has a title, authors, year published, edition, ISBN, publisher.
////    A book may have a list of chapters.
////    A book has a number of pages.
////    2. Add a class for magazines.
////    A magazine has an editor, a title, a month published, a year published
////    3. Add a class for newspaper.
////    A newspaper has a name, day published, month published, year published and headline.
////    4. Add a class Authors.
////    Authors have firstName, lastName, middleName, date of birth.
////    5. Add a class Comics.
////    A comic has a title, month published, year published, illustrators, publisher.
////    Create a class illustrator.
////    Illustrator have firstName, lastName, middleName, date of birth.
////    6. Add a class Article.
////    An article has a title, content, author.
////    A Newspaper, and magazine have articles.
////    7. Create a search function to search for the title of a magazine, newspaper, comics.
////    8. Create a function that will list the name of the magazine, newspaper, comics or book, author has written in.
////    9. Create a class for Audio / Video recording.
////    The class should show whether the recording has a video or audio or both.
////    It has a length, date recorded, title, publisher.
////    10. Create a Publisher class.
//
//
    val magazine = Magazine("John Doe", "Magazine Title", "May", 2023)
    // Set new values
    magazine.setEditor("John Wick")
    magazine.setTitle("New Magazine Title")
    magazine.setMonthPublished("June")
    magazine.setYearPublished(2023)

    // Search for a magazine
    magazine.searchMagazine("New Magazine Title")

    // Display all magazines
    magazine.displayMagazine()

    println()
    val newspaper =Newspaper("Sampaguita",15,"January",2023,"No more Taxes")
    newspaper.setHeadline("New Viva Star on Spotlight")
    newspaper.setName("Sampaguita")
    newspaper.setDayPublished(22)
    newspaper.setMonthPublished("February")
    newspaper.setYearPublished(2023)
    newspaper.searchNewsPaper("Sampaguita")
    newspaper.displayNewspaper()

    val article=Article("New Corona Virus","The new corona virus is found","John Doe")
    println("Article $article")
}