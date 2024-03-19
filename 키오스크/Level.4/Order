package com.example.practice

class Order(food: Food) {
    val idx : Int
    val food : Food

    init {
        this.idx = getNextIdx()
        this.food = food
    }


    companion object{
        private var maxIdx=1

        private fun getNextIdx():Int{
            return maxIdx++
        }
    }
}
