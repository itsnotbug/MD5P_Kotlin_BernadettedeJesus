package kotlinactivities.activity04B

class Article(private var title:String, private var content:String, private var author:String) {
    ////    6. Add a class Article.
////    An article has a title, content, author.
    fun setTitle(title:String){
        this.title=title
    }
    fun setContent(content: String){
        this.content=content
    }
    fun setAuthor(author:String){
        this.author =author
    }
    fun getTitle():String{
        return title
    }
    fun getContent():String{
        return content
    }
    fun getAuthor():String{
        return author
    }
}