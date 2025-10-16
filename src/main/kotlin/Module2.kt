package org.example


//fun addition(value1:Int, value2: Int){//function defination
//    println("sum of $value1 and $value2 is: ${value1+value2}")
//}
//fun main() {
//    print("Enter first number: ")
//    var input1 = readLine()
//    print("Enter Second number:  ")
//    var input2 = readLine()
//
//    var number1=input1?.toInt()
//    var number2=input2?.toInt()
//
//    if(number2!==null&&number1!=null)
//       addition(number1,number2)
//
//}
//fun factorial(value: Int): Int{
//            if(value==1){
//                return 1
//            }
//            return factorial(value-1)*value
//}
//fun main(){
//    print("Enter any number: ")
//    var input=readLine()
//    var number=input?.toInt()
//    if(number!=null)
//        number=factorial(number)
//    println("Factorial of $input is : $number")
//}
//fun play(child1:String="harry", child2:String="jyoti"){
//    println("$child1 is playing with $child2 in the playground")
//}
//fun main(){
//    play(child2="kushi")
//}

//class Office(
//    public var name: String,
//     public var position: String
//){
//    // body of class
//    var label= "$name ($position)"
//}
//
//fun main(){
//    var obj=Office("Arjun", "Boss")
//    println(obj.label)
//}

//class Subject(
//    val name: String,
//    val teacher: Teacher,
//    val isObligatory: Boolean
//)
//class Teacher(
//    val name: String,
//    val surname: String,
//    val birthday: String,
//    val status: String
//)
//fun main(){
//    var obj1=Teacher("Neha", "divedi", "20/5/5005",
//        "coordinator")
//    var obj2=Subject("maths",obj1, true)
//    println("${obj2.teacher}")

//class InputAge{
//    fun input():Age{
//        print("Enter your age: ")
//        var input=readLine()
//        var age=input?.toInt()
//        if(age!=null)
//            return Age(age)
//        else
//            return Age(age=0)
//    }
//}
//
//class Age(
//    var age:Int
//)
//fun main(){
//    var enter=InputAge()
//    var obj:Age=enter.input()
//    println(obj.age)
//
//}
//class User(var name: String) {
//    fun changeName(name: String) {
//        println("Changed name from ${this.name} to $name")
//        this.name = name // Avoids confusion with parameter
//    }
//}
//fun main(){
//    var obj=User("Gurinder")
//    obj.changeName("jasdeep")
//   println(obj.name)
//}
//class Player(
//    var name:String,
//    var surName:String,
//    var totalScore: Float,
//    var personalBestScore:Float
//){
//    fun PrintFullName(){
//        println("Your full name is : $name $surName")
//    }
//}
//fun main(){
//    var obj=Player("Ankit", "Jain")
//    obj.PrintFullName()
//}


//class Player1(
//    var Name:String,
//    var surName:String,
//    var totalScrore: Double,
//    var personalBestScore:Double
//){
//    fun start1():Player1 {
//        print("Enter the name of first player: ")
//        var name = readLine()
//        print("Surname: ")
//        var surname = readLine()
//        print("Totalscore: ")
//        var input = readLine()
//        var totalscrore = input?.toDouble()
//        print("personal best score: ")
//        var input1 = readLine()
//        var BestScore = input1?.toDouble()
//
//        if (name != null && surname != null && totalscrore != null && BestScore != null)
//            return Player1(name, surname, totalscrore, BestScore)
//        else {
//            return Player1("0", "0", 0.0, 0.0)
//        }
//      }
//    }
//
//class Player2(
//    var Name:String,
//    var surName:String,
//    var totalScrore: Double,
//    var personalBestScore:Double
//){
//    fun start2():Player2 {
//        print("Enter the name of second player: ")
//        var name = readLine()
//        print("Surname: ")
//        var surname = readLine()
//        print("Total score: ")
//        var input = readLine()
//        var totalscrore = input?.toDouble()
//        print("personal best score: ")
//        var input1 = readLine()
//        var BestScore = input1?.toDouble()
//
//        if (name != null && surname != null && totalscrore != null && BestScore != null)
//            return Player2(name, surname, totalscrore, BestScore)
//        else {
//            return Player2("0", "0", 0.0, 0.0)
//        }
//    }
//}
//
//class Player3(
//    var Name:String,
//    var surName:String,
//    var totalScrore: Double,
//    var personalBestScore:Double
//){
//    fun start3():Player3 {
//        print("Enter the name of third player: ")
//        var name = readLine()
//        print("Surname: ")
//        var surname = readLine()
//        print("Total score: ")
//        var input = readLine()
//        var totalscrore = input?.toDouble()
//        print("personal best score: ")
//        var input1 = readLine()
//        var BestScore = input1?.toDouble()
//
//        if (name != null && surname != null && totalscrore != null && BestScore != null)
//            return Player3(name, surname, totalscrore, BestScore)
//        else {
//            return Player3("0", "0", 0.0, 0.0)
//        }
//    }
//}
//fun main(){
//    var obj1:Player1=Player1("0","0",0.0,0.0)
//    obj1=obj1.start1()
//    println()
//    var obj2:Player2=Player2("0","0",0.0,0.0)
//    obj2=obj2.start2()
//    println()
//    var obj3:Player3=Player3("0","0",0.0,0.0)
//    obj3=obj3.start3()
//    println()
//    if(obj1.totalScrore>obj2.totalScrore&&obj1.totalScrore>obj3.totalScrore)
//       println("The winner is ${obj1.Name}${obj1.surName} with total score" +
//               " ${obj1.totalScrore} and personal best score ${obj1.personalBestScore}\n congratulation! ")
//    else if(obj2.totalScrore>obj1.totalScrore&&obj2.totalScrore>obj3.totalScrore)
//        println("The winner is ${obj2.Name}${obj2.surName} with total score" +
//                " ${obj2.totalScrore} and personal best score ${obj2.personalBestScore}\n congratulation! ")
//    else if(obj3.totalScrore>obj1.totalScrore&&obj3.totalScrore>obj2.totalScrore)
//        println("The winner is ${obj3.Name}${obj3.surName} with total score" +
//                " ${obj3.totalScrore} and personal best score ${obj3.personalBestScore}\n congratulation! ")
//    else
//        println("Its a tie!")
//}

//interface Vehicle {
//         var name: String
//    fun output()
//}
//class Bike(override var name: String):Vehicle {
//    override fun output() {
//        println("name is : $name")
//    }
//    fun abc(){}
//}
//class Car(override var name: String): Vehicle{
//    override fun output() {
//        println("name is : $name")
//    }
//}
////fun transport(run: Vehicle){
////        run.output()
////}
//fun main(){
//      var obj: Vehicle=Bike("bike")//upcasting
//      var obj2: Bike= obj as Bike//Downcasting
//      obj=Car("thar")
//}

// open class Parent{
//    var pName="Surinder"
//    open fun print(){
//        println("this is a parent class")
//    }
//}
//class Child():Parent(){
//      var cName="Nikhil"
//    override fun print(){
//        println("this is a child class")
//    }
//}
//fun main(){
//    var  obj:Parent=Child()
//         obj.pName="45"
//}
//open class Dog(val name: String)
//class Labrador(name1: String) : Dog(name1)
//
//fun main() {
//    val lab = Labrador("Coco")
//    println(lab.name)
//}


//open class BankAccount{
//    var balance=0.00
//    private fun deposit(amount:Double){
//        balance+=amount
//    }
//    fun withdrawn(amount:Double){
//        balance-=amount
//    }
//}
//class Casher: BankAccount(){
//    fun collectCash(amount:Double){
//        deposit(amount)
//    }
//}
//fun main(){
//    var customer= Casher()
//    customer.collectCash(4.55)
//}

// abstract class Payment(
//    private var upiId:Int,
//     private var pin:Int
//
//){
//    fun input(){
//        println("Enter your upi id: ")
//        var input1=readLine()
//        println("Enter your pin: ")
//        var input2=readLine()
//            upiId = input1!!.toInt()
//            pin = input2!!.toInt()
//    }
//    abstract fun output()
//}
//
//class Product: Payment(0,0){
//    override fun output() {
//        println("Your order is placed thankyou")
//    }
//}
//






































