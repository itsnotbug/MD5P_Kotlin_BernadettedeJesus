package kotlinbasics

fun main(){
    //Credentials saved in database
    var defaultUsername:String="admin"
    var defaultPassword:String="pass123"

    //login
    println("Enter username: ")
    var username:String = readln()
    println("Enter password: ")
    var password:String = readln()

    //test credentials if correct
    if((username==defaultUsername)&&(password==defaultPassword)){
        println("Logged In")
    }else{
        println("Invalid username or password")
    }
}