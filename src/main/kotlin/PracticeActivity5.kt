fun main(){
    //Declaration
    var studentName:String =""
    var unitsEnrolled:Int =0
    var pricePerUnit:Double =0.0
    var computedTutionFee:Double=0.0
    var cashPayment:Double=0.0
    var cashPaymentDiscount:Double=0.0
    var twoInstallment:Double=0.0
    var twoInstallmentDiscount=0.0
    var threeInstallmentPenalty:Double=0.0
    var threeInstallment:Double=0.0

    //Input
    println("Enter student name:" )
    studentName = readln()
    println("Enter number of units enrolled:" )
    unitsEnrolled = readln().toInt()
    println("Enter price per unit:" )
    pricePerUnit = readln().toDouble()

    //Process -Computation
    computedTutionFee = pricePerUnit * unitsEnrolled
    cashPaymentDiscount = computedTutionFee * 0.10
    cashPayment = computedTutionFee - cashPaymentDiscount
    twoInstallmentDiscount = computedTutionFee * 0.05
    twoInstallment =computedTutionFee + twoInstallmentDiscount
    threeInstallmentPenalty = cashPaymentDiscount
    threeInstallment = computedTutionFee +threeInstallmentPenalty


    //Output
    println("$studentName, you could avail the following payment mode: ")
    println("Computed tuition fee : ${String.format("%.2f",computedTutionFee)}")
    println("Payment Mode:")
    println("Cash Payment: ${String.format("%.2f",cashPayment)} dollars")
    println("2-Installment: ${String.format("%.2f",twoInstallment)} dollars")
    println("3-Installment: ${String.format("%.1f",threeInstallment)} dollars")


}