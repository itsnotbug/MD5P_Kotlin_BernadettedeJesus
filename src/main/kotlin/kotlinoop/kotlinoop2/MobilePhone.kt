
class MobilePhone(var load:Int) {
    var messageLogs = mutableListOf<String>()
    var textMessageCount:Int=0


    fun sendTextMessage(message:String){
        load--
        textMessageCount++
        println("Message sent!")
        messageLogs.add("Message $message,${System.currentTimeMillis()}")
    }

    fun load(amount:Int){
        load+=amount
        println("Loaded successfully!")
    }


    fun checkBalance(){
        println("Your account balance is $load")
    }

    fun displayLogs(){
        println("Number of text messages sent $textMessageCount")
        println(messageLogs)
    }
}