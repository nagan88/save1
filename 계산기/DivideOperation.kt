package com.example.calculater_application_v2

import kotlin.jvm.Throws

class DivideOperation : AbstractOperation(){

    override fun operate(num1: Int, num2: Int): Double{
        require(num2!=0){//require:예외처리 함수
            ArithmeticException("Divide by zero")//ArithmeticException: 함수를 0으로 나누면 수학적 오류 발생
        }
        return (num1/num2).toDouble()//num1를 num2으로 나눈 것을 toDouble로 반환
    }

}
