package com.example.practice

class Food (name: String, price:Double, category: String, description:String):Menu(name, description){
    var price:Double//메뉴 가격
    var category:String//메뉴 카테고리

    init{
        this.price=price
        this.category=category
    }

    override fun displayInfo() {
        println("이름: $name, 가격: $price, 카테고리: $category, 설명: [ $description ]")
    }

}
