package com.example.practice

fun main(){
    while(true) {
        try {
            var num1 = readLine()!!.toInt()//toInt:숫자입력
            println("내가 입력한 숫자는 ${num1}입니다")//숫자을 입력할 경우에만 출력
            break //제대로 조건을 입력할 경우에만 작동
        } catch(e:java.lang.NumberFormatException) {//제대로 입력하지 않으면 catch가 발생하여 다시반복(숫자를 입력할 때까지)
            println("숫자를 입력하세요")//숫자가 아닌 문자를 입력할 경우메만 출력
        }
    }
}
