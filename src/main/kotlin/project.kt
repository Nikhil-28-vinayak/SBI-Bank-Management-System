package org.example

import java.io.File


class SavingAccount {
    var file = File("C:\\Users\\vinay\\IdeaProjects\\kotlin.kt\\src\\main\\kotlin\\Saving_Account.txt")
    var accountNo: String? = null
    var lenght: Int? = null
    fun enterDetails() {
        println("Enter your details!")
        print("First name: ")
        var input2 = readLine()
        file.appendText("\nFull Name = $input2\n")
        lenght = input2!!.length
        accountNo = lenght.toString()

        print("Last name: ")
        input2 = readLine()
        file.appendText("Last Name = $input2\n")
        lenght = input2!!.length
        accountNo = accountNo + lenght.toString()

        print("Phone No: ")
        input2 = readLine()
        file.appendText("Phone No = $input2\n")
        lenght = input2!!.length
        accountNo = accountNo + lenght.toString()

        print("Aadharr card no: ")
        input2 = readLine()
        file.appendText("Aadharr = $input2\n")
        lenght = input2!!.length
        accountNo = accountNo + lenght.toString()

        print("Pan card card no: ")
        input2 = readLine()
        file.appendText("Pan card = $input2\n")
        lenght = input2!!.length
        accountNo = accountNo + lenght.toString()

        print("Enter the initial amount: ")
        input2 = readln()
        file.appendText("Balance=$input2\n")

        println("Congratulation your account is created")
        println("your account number is: $accountNo")
        println("Kindly collect Your Cheque Book and Pass Book from your nearest SBI branch")
        file.appendText("Account No = $accountNo\n")
        file.appendText("--------------------\n\n")
    }
}

fun deposit(credit: Int) {
    var totalBalance: Int = 0
    totalBalance += credit
    println("$credit is credited in your account")
}

fun withdrawn(debit: Int) {
    var totalBalance: Int = 0
    totalBalance -= debit
    println("$debit is debited in your account")
}


class CurrentAcoount {
    var companyName: String? = null
    var gstNo: String? = null
    var accountNo: String? = null
    var lenght: Int? = null
    var file = File("C:\\Users\\vinay\\IdeaProjects\\kotlin.kt\\src\\main\\kotlin\\Current_Account.txt")
    fun enterDetails() {
        println("Enter your details!")
        print("First name: ")
        var input2 = readLine()
        file.appendText("\nFull Name = $input2\n")
        lenght = input2!!.length
        accountNo = lenght.toString()
        print("Last name: ")
        input2 = readLine()
        file.appendText("Last Name = $input2\n")
        lenght = input2!!.length
        accountNo = lenght.toString()
        print("Phone No: ")
        input2 = readLine()
        file.appendText("Phone No = $input2\n")
        lenght = input2!!.length
        accountNo = lenght.toString()
        print("Aadharr card no: ")
        input2 = readLine()
        file.appendText("Aadharr Card No = $input2\n")
        lenght = input2!!.length
        accountNo = lenght.toString()
        print("Pan card card no: ")
        input2 = readLine()
        file.appendText("Pan Card No = $input2\n")
        lenght = input2!!.length
        accountNo = lenght.toString()
        print("Company Name: ")
        companyName = readLine()
        file.appendText("Company Name = $companyName\n")
        lenght = companyName!!.length
        accountNo = lenght.toString()

        print("Enter the initial amount: ")
        input2 = readln()
        file.appendText("Balance=$input2\n")

        println("Congratulation your account is created")
        println("your account number is: $accountNo")
        println("(Kindly collect Your Cheque Book and Pass Book from your nearest SBI branch)")
        file.appendText("Account No = $accountNo\n")
        file.appendText("--------------------\n\n")
    }
}

class FixedDepositAccount {
    var file = File("C:\\Users\\vinay\\IdeaProjects\\kotlin.kt\\src\\main\\kotlin\\Fixed_Deposit_Account.txt")
    var accountNo: String? = null
    var lenght: Int? = null
    fun enterDetails() {
        println("Enter your details!")
        print("First name: ")
        var input2 = readLine()
        file.appendText("\nFull Name = $input2\n")
        lenght = input2!!.length
        accountNo = lenght.toString()
        print("Last name: ")
        input2 = readLine()
        file.appendText("Last Name = $input2\n")
        lenght = input2!!.length
        accountNo = accountNo + lenght.toString()
        print("Phone No: ")
        input2 = readLine()
        file.appendText("Phone No = $input2\n")
        lenght = input2!!.length
        accountNo = accountNo + lenght.toString()
        print("Aadharr card no: ")
        input2 = readLine()
        file.appendText("Aadharr Card No = $input2\n")
        lenght = input2!!.length
        accountNo = accountNo + lenght.toString()
        print("Pan card no: ")
        input2 = readLine()
        file.appendText("Pan Card No = $input2\n")
        lenght = input2!!.length
        accountNo = accountNo + lenght.toString()
        print("Duration of the Fixed Deposit (in years): ")
        input2 = readLine()
        file.appendText("Duration of the Fixed Deposit (in years) = $input2\n")
        lenght = input2!!.length
        accountNo = accountNo + lenght.toString()

        println("Congratulation your Fixed Deposit Account is created")
        println("your account number is: $accountNo")
        println("Go to your Nearest SBI Branch to collect your FD prove")
        file.appendText("Account No = $accountNo\n")
        file.appendText("--------------------\n\n")
    }
}

fun main() {
    println("WELCOME TO SBI BANKING MANAGEMENT SYSTEM")
    println("What you want to do:")
    println("1. Creation Account\n2. Checking Details\n3. Withdrawn/Deposit")
    print("Choose an option(1, 2 or 3): ")
    var input1 = readln()
    for (i in 1 downTo 0) {
        if (input1.equals("1")) {
            println("What type of Account would you like to create!")
            println("1. Saving Account\n2. Current Account\n3. Fixed Deposit account")
            print("Choose an option(1, 2 or 3): ")
            var input2 = readln()
            for (i in 1 downTo 0) {
                if (input2.equals("1") || input2.equals("2") || input2.equals("3")) {
                    if (input2.equals("1")) {
                        var obj = SavingAccount()
                        obj.enterDetails()
                        return
                    } else if (input2.equals("2")) {
                        var obj = CurrentAcoount()
                        obj.enterDetails()
                        return
                    } else if (input2.equals("3")) {
                        var obj = FixedDepositAccount()
                        obj.enterDetails()
                        return
                    }
                } else {
                    println("Wrong input try again!")
                    println("you have only $i attempt")
                    println("1. Saving account\n2. Current Account\n3. Fixed deposit")
                    print("Choose an option(1, 2 or 3): ")
                    input1 = readln()
                }
            }
        } else if (input1.equals("2")) {
            readLine()
            return
        } else if (input1.equals("3")) {
            println("Choose what you want :")
            println("1. Deposit Amount\n2. Withdrawn Amount")
            print("Choose an option(1 or 2): ")
            for (i in 1 downTo 0) {
                var input3 = readLine()
                if (input3.equals("1")) {
                    print("Enter account number: ")
                    val accountNoInput = readLine()
                    val content = File("Saving_Account.txt").readLines()

                    val accountExists = content.any { line ->
                        line.contains("Account No = $accountNoInput")
                    }
                    if (accountExists) {
                        print("Enter amount: ")
                        input3 = readLine()
                        var credit = input3!!.toInt()
                        deposit(credit)
                        return
                    } else {
                        println("Account not found!")
                        return
                    }
                } else if (input3.equals("2")) {
                    print("Enter account number: ")
                    val accountNoInput = readLine()
                    val content = File("Saving_Account.txt").readLines()

                    val accountExists = content.any { line ->
                        line.contains("AccountNo=$accountNoInput")
                    }

                    if (accountExists) {
                        print("Enter amount: ")
                        input3 = readLine()
                        var debit = input3!!.toInt()
                        withdrawn(debit)
                        return
                    } else {
                        println("Account not found!")
                        return
                    }
                } else {
                    println("you have only $i attempt")
                    println("Choose what you want :")
                    println("1. Deposit Amount\n2. Withdrawn Amount")
                    print("Choose an option(1 or 2): ")
                    input3 = readLine()
                }
            }
        } else {
            println("You enter wrong input!")
            println("you have only $i attempt")
            println("1. Creating Account\n2. Checking Account\n3. Withdrawn/Deposit")
            print("Choose an option(1, 2 or 3): ")
            input1 = readln()
        }
    }
}
