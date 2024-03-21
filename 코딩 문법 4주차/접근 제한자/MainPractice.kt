package com.example.practice

fun main(){
    var access = AccessTestClass()
    access. a //변수 a의 접근제한자가 public로 되어 있어 어디서든 접근 가능,
    access. b //변수 b는 변수 a와 마찬가지로 어디서든 접근 가능,
    access. d //변수 d는 접근제한자가 internal로 되어 같은 모듈에서만 사용이 가능

    var accessTestClass = AccessTestClass()
    var accessTestChildClass = AccessTestChildClass()//accessTestChildClass 객체 생성

// . 하고 접근가능한 요소를 확인
//    accessTestClass.
    accessTestChildClass.protectedTest1()//.protectedTest1()를 호출하여 변수 e의 값 사용
}
