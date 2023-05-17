package kotlinoop.kotlinoop2

fun main(){
    val myPhone  = MobilePhone(10)
    myPhone.checkBalance()
    myPhone.load(30)
    myPhone.checkBalance()
    myPhone.sendTextMessage("Wer na u?")
    myPhone.sendTextMessage("d2 na me hehe")
    myPhone.checkBalance()
    myPhone.displayLogs()

}