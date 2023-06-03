package kotlinactivities.activity04B

class Article(private var title:String, private var content:String, private var author:String) {
    ////    6. Add a class Article.
////    An article has a title, content, author.
    fun getTitle(title:String){
        this.title=title
    }
    fun getContent(content: String){
        this.content=content
    }
    fun getAuthor(author:String){
        this.author =author
    }
    fun setTitle():String{
        return title
    }
    fun setContent():String{
        return content
    }
    fun setAuthor():String{
        return author
    }
}