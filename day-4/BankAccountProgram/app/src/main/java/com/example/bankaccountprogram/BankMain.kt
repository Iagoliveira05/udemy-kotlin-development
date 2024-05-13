package com.example.bankaccountprogram

fun main() {


    val denisesBankAccount = BankAccount("Denis", 4324.0)

    //println(denisesBankAccount.accountHolder)
    denisesBankAccount.deposit(200.0)
    denisesBankAccount.withDraw(1200.0)
    denisesBankAccount.deposit(3000.0)
    denisesBankAccount.deposit(2000.0)
    denisesBankAccount.withDraw(333.50)

    denisesBankAccount.displayTransactionHistory()

    denisesBankAccount.acctBalance()

    val sarahBankAccount = BankAccount("Sarah", 0.0)
    sarahBankAccount.deposit(100.0)
    sarahBankAccount.withDraw(10.0)
    sarahBankAccount.deposit(300.0)

    sarahBankAccount.displayTransactionHistory()
    sarahBankAccount.acctBalance()
}