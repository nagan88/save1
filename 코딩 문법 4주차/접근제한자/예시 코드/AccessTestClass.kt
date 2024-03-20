package com.example.practice

open class AccessTestClass {
    public var a:Int = 1 //접근제한자 public는 있으나 하는 키워드 public이 있는 없는 변수 a는 밑의 접근제한자가 없는 변수 b와 같은 권한을 보유
    var b = 2
    private var c = 3 //변수 c는 객체를 만들고 객체이름.c하고는 사용이 불가, 같은 클래스에서 사용이가능
    internal var d = 4 //
    protected var e = 5 //변수 e는 기본적으로 private지만 상속관계에서만 사용이 가능

    public fun publicTest() {
        println("public 입니다")
    }

    fun publicTest2() {
        println("public 입니다")
    }

    private fun privateTest() {
        println("private 입니다")
    }

    internal fun internalTest() {
        println("internal 입니다")
    }

    protected fun protectedTest() {
        println("protected 입니다")
    }
}
