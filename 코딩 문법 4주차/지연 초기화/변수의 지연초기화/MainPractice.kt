package com.example.practice

fun main(){
    var s1 = Student()
    s1.name = "참새"
    s1.displayInfo()

    s1.age = 10
    s1.displayInfo()
}

class Student {
    lateinit var name:String // 'var'옆에 'lateinit' 붙이면 '='사용하지 않고도 ':'으로 초기화가 가능
    var age:Int = 0

    fun displayInfo() {
        println("이름은: ${name} 입니다.")//displayInfo에서 name이 초기화
        println("나이는: ${age} 입니다.")
    }
}
