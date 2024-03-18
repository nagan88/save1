package com.example.practice

class Food (name: String, price:Double, category: String, description:String){
    var name:String //메뉴 이름
    var price:Double//메뉴 가격
    var category:String//메뉴 카테고리
    var description:String//메뉴 설명

    init{
        this.name=name
        this.price=price
        this.category=category
        this.description=description
    }

    fun displayinfo(){
        println("이름: $name, 가격: $price, 카테고리: $category, 설명: [ $description ]")
    }
}
