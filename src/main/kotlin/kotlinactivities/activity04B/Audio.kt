package kotlinactivities.activity04B
//length, date recorded, title, publisher
class Audio(private var length:String,private var dataRecorded:String,private var title:String,private var publisher:String) {

    fun getLength(length: String){
        this.length =length

    }
    fun getDataRecorded(dataRecorded: String){
        this.dataRecorded = dataRecorded
    }
    fun getTitle(title: String){
        this.title =title
    }
    fun getPublisher(publisher: Publisher){
        this.publisher = publisher.setName()
    }
    fun setLength():String{
        return length
    }
    fun setDataRecorded():String{
        return dataRecorded
    }
    fun setTitle():String{
        return title
    }
    fun setPublisher():String{
        return publisher
    }
}