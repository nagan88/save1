package com.example.calculater_application_v2

import java.util.Stack

class MyStack {
    fun getPostFixExpressionOperation(originalExpression: String):Int {
        val stack = Stack<String>()
        var arr = strToArr(originalExpression) //수식을 하나씩 뜯어보는 함수
        var result = " "//계산 수식을 저장할 문자열 변수

        for (e in arr) {
            when (e) {
                "+", "-", "*", "/" -> {
                    while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(e)) {
                        result += stack.pop() + " " // 실행결과를 result에 이어 붙인다
                    }
                    stack.push(e)
                    //!stack.isEmpty -> stack이 비어있지 않다
                    //precedence(stack.peek()-> stack 맨위(peck)에서 연산자를 하나씩 꺼내본다
                    //precedence(e) 현재 연산자에 다시 넣은다
                }

                "(" -> {
                    stack.push(e)//연산자 순위가 가장 높기 때문에 바로 넣은다
                }

                ")" -> {
                    while (stack.peek() != "(") { //stack 맨위의 괗호가 여느 괄호가 아닐 경우
                        result += stack.pop() + " " //연산자를 하나씩 꺼내 본다
                    }
                    stack.pop() //"(" 여는 괄호 제거
                }
                //닫은 괄호는 여는 괄호와 짝이 맞아야 한다
                else -> {
                    result += "$e "
                }
                //Satck이 비어있거나  Satck의 맨 꼭대기가 여는 괄호일 경우 연산자에 그대로 푸쉬(넣는다)
                //아닐 경우에는 우선 순위가 더 높은 연산자를 만날때까지 하나씩 꺼내 현재 연산자에 푸쉬(넣는다)
            }
        }

        while(!stack.isEmpty()){
            result +=stack.pop()+" "
        }//stack이 비어있지 않을 때까지 stack.pop에서 하나씩 꺼내 더한다

        println("---결과---")
        println("후위표기법: $result")

        val realResult = finalCalc(result)
        println("결과: $realResult")
        return realResult
    }
    fun finalCalc(result: String): Int{
        val stack=Stack<String>()
        val calResult=result.split(" ") //후위 표기법에서 공백제거
        var result=0 //retur할 값을 0으로

        for(e in calResult){
            when(e){
                "+" -> {
                    result = stack.pop().toInt() + stack.pop().toInt()
                    stack.push(result.toString())//더한 결과를 넣는다
                }
                "-" -> {
                    result = -stack.pop().toInt() + stack.pop().toInt()
                    stack.push(result.toString())//뺀 결과를 넣는다
                }
                "*" -> {
                    result = stack.pop().toInt() * stack.pop().toInt()
                    stack.push(result.toString())//곱셉 결과를 넣는다
                }
                "/" ->{
                    val num2 = stack.pop().toInt()
                    val num1 = stack.pop().toInt()
                    result=num1/num2
                    stack.push(result.toString())//나눈 결과를 넣는다
                }
                else ->{
                    stack.push(e)//그냥 나왔을 경우
                }

            }
        }
        return result
    }

    //연산자 우선순위: 1위는(), 2위는 *,/,% 3위는+,_

    fun strToArr(str:String):Array<String>{
        var tempStr = str.replace(" ( "," ( ")//띄어쓰기 단위 구분
        tempStr = tempStr.replace(" ) "," ) ")//띄어쓰기 단위 구분
        return tempStr.split(" ").toTypedArray()
    }

    fun precedence(operation:String):Int{
        return when(operation){
            "+", "-" -> 1
            "*", "/" -> 2
            else -> 0
        }
    }

}
