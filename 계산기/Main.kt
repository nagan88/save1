package com.example.calculater_application_v2

fun main(){

    val addCalc=Calculator(AddOperation())
    println("10 + 20 = : ${addCalc.operate(10, 20)}")

    val minuCalc=Calculator(MinusOperation())
    println("20 - 10 = : ${minuCalc.operate(20, 10)}")

    val multiCalc=Calculator(MultiplyOperation())
    println("10 * 20 = : ${multiCalc.operate(10, 20)}")

    val diviCalc=Calculator(DivideOperation())
    println("20 / 10 = : ${diviCalc.operate(20, 10)}")

    val myStack=MyStack()//나만의 stack
    val calResult = myStack.getPostFixExpressionOperation("(2 + 4) * 4 / 2 * 12")
    println("결과: ${calResult}")//후위연산(PostFixExpression) 표기법을 가져오겠다는 의미

    //두개의 숫자가 주어졌을 떄는 인풋으로 입력하거나 고정값으로 계산기 출력이 가능
    //3개이상 숫자 또는 ()를 포함한 수식을 주어졌을 떄는 'stack(후위연산)'을 사용
    //stack는 먼저들어간 것이 나중에 나오는 후입선출
