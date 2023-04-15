fun main(){
    //Declaration
    var studentName:String =""
    var unitsEnrolled:Int =0
    var pricePerUnit:Double =0.0
    var computedTuitionFee:Double=0.0
    var cashPayment:Double=0.0
    var twoInstallment:Double=0.0
    var threeInstallment:Double=0.0

    //Input
    println("Enter student name:" )
    studentName = readln()
    println("Enter number of units enrolled:" )
    unitsEnrolled = readln().toInt()
    println("Enter price per unit:" )
    pricePerUnit = readln().toDouble()

    //Process -Computation
    computedTuitionFee = pricePerUnit * unitsEnrolled
    cashPayment = computedTuitionFee - (computedTuitionFee * 0.10)
    twoInstallment = computedTuitionFee + (computedTuitionFee * 0.05)
    threeInstallment = computedTuitionFee + (computedTuitionFee + cashPayment)


    //Output
    println("$studentName, you could avail the following payment mode: ")
    println("Computed tuition fee : ${String.format("%.2f",computedTuitionFee)}")
    println("Payment Mode:")
    println("Cash Payment: ${String.format("%.2f",cashPayment)} dollars")
    println("2-Installment: ${String.format("%.2f",twoInstallment)} dollars")
    println("3-Installment: ${String.format("%.1f",threeInstallment)} dollars")


}