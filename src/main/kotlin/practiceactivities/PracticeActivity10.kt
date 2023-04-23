package practiceactivities

fun main(){
    //declaration
    var product:String=""
    var price:Double= 0.0
    var discount:Double =0.0
    var netPrice:Double =0.0

    //input
    println("Enter product: ")
    product =readln()
    println("Enter price: ")
    price = readln().toDouble()

    //Process-computation
    //discount - 0% 0-10,000
    //discount - 5% 10,001-20,000
    //discount - 10% 20,001-50,000
    //discount - 15% 50,001-100,000
    //discount - 20% > 100,000

    if((price >=0) && (price <=10000)){
        discount = (price * 0.00)
    } else if(price>=10001){
        discount = (price * 0.05)
    } else if(price>=20001){
        discount = (price * 0.10)
    } else if(price>=50001){
        discount = (price * 0.15)
    } else if(price >100000){
        discount = (price * 0.20)
    }
    //Computation
    netPrice =(price - discount)

    //output
    println("Price of $product is ${String.format("%.2f",price)}")
    println("Discount is  ${String.format("%.2f",discount)}")
    println("Net Price is ${String.format("%.2f",netPrice)}")





}