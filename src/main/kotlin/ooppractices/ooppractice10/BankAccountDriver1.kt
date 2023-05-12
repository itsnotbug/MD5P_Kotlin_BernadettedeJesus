import ooppractices.ooppractice10.BankAccount

fun main() {

    println("Display Primary Constructor -Initial value")
    val bankAccountInitialValue = BankAccount(6321119899)
    println("Account Number: ${bankAccountInitialValue.accountNumber}")
    println("Balance:${bankAccountInitialValue.initialBalance}")

    println()
    println("Display Secondary Constructor")
    val bankAccountValue=BankAccount(9999999,500.0)
    println("Account Number: ${bankAccountValue.accountNumber}")
    println("Balance:${bankAccountValue.initialBalance}")


}