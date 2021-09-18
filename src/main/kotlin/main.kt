fun main(){
    val fix:Double = 35.0
    println("Для перевода денег на карту 1234 0203 2333 2656, введите необходимую сумму")
    val card = readLine()
    println("Вы ввели: $card")
    val eqdouble = card?.toDouble()
    val procentsumm:Double = (eqdouble!! *0.75)/100
    val minprocent = procentsumm + eqdouble!!
    val amount =
        if (procentsumm < fix) println(eqdouble + fix) else println(minprocent)
    println(amount)
}





