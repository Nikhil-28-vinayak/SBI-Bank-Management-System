package org.example
//fun main(){
//    println("Enter your blood group-")
//    val bloodGroup=readLine()
//    when {
//        (bloodGroup == "A+" || bloodGroup == "B+") -> println("It is a common blood group")
//        bloodGroup == "O+" -> println("It is very common blood")
//        (bloodGroup == "A+" || bloodGroup == "B+") -> println("It is very reare blood")
//        else-> println("Invalid input")
//
//    }
//}
//fun main(){
//          print("Today is which day: ")
//          val day=readLine()
//          when {
//              (day == "Monday" || day == "monday") ->
//                  println(" On $day opening hours are : 8AM to 12PM")
//
//              (day == "Tuesday" || day == "Tuesday") ->
//                  println(" On $day opening hours are : 8AM to 6PM")
//
//              (day == "Wednesday" || day == "wednesday") ->
//                  println(" On $day opening hours are : 8AM to 6PM")
//
//              (day == "Thursday" || day == "thursday") ->
//                  println(" On $day opening hours are : 8AM to 6PM")
//
//              (day == "Friday" || day == "friday") ->
//                  println(" On $day opening hours are : 8AM to 9PM")
//
//              (day == "Saturday" || day == "saturday") ->
//                  println(" On $day opening hours are : 9AM to 4PM")
//
//              (day == "Sunday" || day == "sunday") ->
//                  println(" On $day opening hours are : 8AM to 4PM")
//
//              else ->
//                  println("Invalid input !please try again later")
//          }
//}
//fun main(){
//    print("Enter day: ")
//    val day=readLine()
//    print("Enter time: ")
//    val input=readLine()
//    val time=input?.toInt()
//    val status= when(day){
//                "Monday"->time in 8..12
//                "Tuesday"->time in  8..18
//                "Wednesday"->time in 8..18
//                "Thursday"->time in 8..18
//                "Friday"->time in 8..18
//                "Saturday"->time in 8..16
//                "Sunday"->time in 8..14
//                else-> println("Invalid input")
//    }
//    if(status==true) println("Little Lemon is open Now")
//    else println("Sorry! Little Lemon is Closed Now")
//}
//fun main(){
//    print("Enter which table you want to print:  ")
//    val input=readLine()
//    val table=input?.toInt()
//    var number:Int=0
//    while(number<=10&&table!=null){
//        println("$table * $number = ${table*number}")
//        number++
//    }
//}
//fun main(){
//    print("Enter which table you want to print: ")
//    val input=readLine()
//    val table =input?.toInt()
//    if(table!=null) {
//        for (i in 10 downTo 0 step 5) {
//            println("$table * $i = ${table * i}")
//        }
//    }
//}
//fun main(){
//    println("How many of triangle you want: ")
//    val input=readLine()
//    val triangle=input?.toInt()
//    if(triangle!=null)
//    for(i in 1..triangle){
//        for(j in 1..i){
//            print(" * ")
//        }
//        println()
//    }
//}
//fun main(){
//    for(i in 1..5 step 2){
//        if(i%2==1)
//        for(j in 1..i){
//            print(" * ")
//        }
//        println()
//    }
//    for(i in 3 downTo 1 step 2){
//        for(j in 1..i){
//            if(i%2==1){
//                print(" * ")
//            }
//        }
//        println()
//    }
//}
//fun main(){
//    for(i in 1.. 5){
//        for(j in 1 .. 5){
//           if(i==5||i+j==6||i+j==7||i+j==8||j==5)
//               print(" *")
//            else
//                print("  ")
//        }
//        println()
//    }
//}

//fun main(){
//    for( i in 1..5){
//        for(j in 1..9){
//            if(i==5||j==5||i+j==6||j-i==4||(j-i==3&&i!=1)||(j-i==1&&i!=1&&i!=2)||(i==4&&j!=1&&j!=9))
//                print("* ")
//            else
//                print("  ")
//        }
//        println()
//    }
//}
//fun main(){
//    for(i in 1..5){
//        for(j in 1..i-1){
//            print(" ")
//        }
//        for(i in 6-i downTo 1){
//            print("*")
//        }
//        println()
//    }
//}
//fun main(){
//    var number=9
//        for(i in 1..5){
//            for( j in 1..i-1){
//                print(" -")}
//            for(j in number downTo 1){
//                print(" *")
//            }
//            number-=2
//            println()
//        }
//}
//fun main(){
//    for(i in 1..5){
//        for(i in 5-i downTo 1){
//            print("  ")
//        }
//        for(i in 1..i){
//            print(" *")
//        }
//        println()
//    }
//    for(i in 4 downTo 1){
//        for(i in 1 .. 5-i){
//            print("  ")
//        }
//        for(j in i downTo 1){
//            print(" *")
//        }
//        println()
//    }
//}
