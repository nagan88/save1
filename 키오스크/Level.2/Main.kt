package com.example.practice

fun main(){
    var ShackBurger=Food("ShackBurger", 6.9, "burger", "토마토,양상추,쉑소스가 토핑된 치즈버거")
    var SmokeBurger = Food("SmokeBurger", 8.9, "burger", "체리 페퍼에 쉑소스가 토핑된 치즈버거")
    var ShroomBurger=Food("Shroom Burger", 9.4, "burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
    var Cheeseburger=Food("Cheeseburger", 9.4, "burger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
    var Hamburger=Food("Hamburger", 9.4, "burger", "비프패티를 기반으로 야채가 들어간 기본버거")

    var PlainIceCream=Food("Plain Ice Cream", 12.1, "Forzen Custard", "바닐라 아이스크림")
    var ChocolateIceCream = Food("Chocolate Ice Cream", 10.2, "Forzen Custard", "바닐라 아이스크림")
    var FruitsIceCream =Food("Fruits Ice Cream", 15.14, "Forzen Custard", "과일 아이스크림")
    var NutsIceCream =Food("Nuts 1Ice Cream", 15.14, "Forzen Custard", "아몬드 아이스크림")
    var IceMilk =Food("Ice Milk ", 9.9, "Forzen Custard", "저지방 아이스크림")

    var Ade=Food("Ade", 7.5, "Drinks", "에이드")
    var Americano  = Food("Americano", 6.4, "Drinks", "아메리카노")
    var Beverage =Food("Beverage", 6.8, "Drinks", "음료수")
    var BlackTea =Food("Black Tea", 7.7, "Drinks", "홍차")
    var BarleyTea =Food("Barley Tea ", 8.9, "Drinks", "보리차")

    var Bokbunja =Food("Bokbunja", 16.2, "Beer", "복분자")
    var Bourbon  = Food("Bourbon", 19.2, "Beer", "버번위스키")
    var Cocktail =Food("Cocktail", 15.4, "Beer", "캌테일")
    var Gin =Food("Gin", 25.2, "Beer", "진")
    var ArmandDeBrignac =Food("Armand de Brignac", 999.99, "Beer", "아르망디 샴페인")


    while(true){
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요")
        println("SHAKESHACK MENU")
        println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
        println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림")
        println("3. Drinks          | 매장에서 직접 만드는 음료")
        println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
        println("0. 종료            | 프로그램 종료\n")
        var categorypick = readLine()!!.toInt()
        when(categorypick){
            1 ->{
                println("Burgers MENU")
                println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
                println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
                println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
                println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
                println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
                println("0. 뒤로가기       | 뒤로가기\n")
                var Menupick = readLine()!!.toInt()
                when(Menupick){
                    0->{
                    }
                    1->{
                        ShackBurger.displayinfo()
                    }
                    2->{
                        SmokeBurger.displayinfo()
                    }
                    3->{
                        ShroomBurger.displayinfo()
                    }
                    4->{
                        Cheeseburger.displayinfo()
                    }
                    5->{
                        Hamburger.displayinfo()

                    }

                }
            }
            2->{
                println("Forzen Custard MENU")
                println("1. Plain Ice Cream     | W 12.1  | 바닐라 아이스크림")
                println("2. Chocolate Ice Cream | W 10.2  | 초콜릿 아이스크림")
                println("3. Fruits Ice Cream    | W 15.14 | 과일 아이스크림")
                println("4. Nuts Ice Cream      | W 15.14 | 아몬드 아이스크림")
                println("5. Ice Milk            | W 9.9   | 저지방 아이스크림")
                println("0. 뒤로가기             | 뒤로가기\n")
                var Menupick = readLine()!!.toInt()
                when(Menupick){
                    0->{

                    }
                    1->{
                        PlainIceCream.displayinfo()
                    }
                    2->{
                        ChocolateIceCream.displayinfo()
                    }
                    3->{
                        FruitsIceCream.displayinfo()
                    }
                    4->{
                        NutsIceCream.displayinfo()
                    }
                    5->{
                        IceMilk.displayinfo()
                    }

                }

            }
            3->{
                println("Drinks MENU")
                println("1. Ade        | W 7.5 | 에이드")
                println("2. Americano  | W 6.4 | 아메리카노")
                println("3. Beverage   | W 6.8 | 음료수")
                println("4. Black Tea  | W 7.7 | 홍차")
                println("5. Barley Tea | W 8.9 | 보리차")
                println("0. 뒤로가기    | 뒤로가기\n")
                var Menupick = readLine()!!.toInt()
                when(Menupick){
                    0->{

                    }
                    1->{
                        Ade.displayinfo()
                    }
                    2->{
                        Americano.displayinfo()
                    }
                    3->{
                        Beverage.displayinfo()
                    }
                    4->{
                        BlackTea.displayinfo()
                    }
                    5->{
                        BarleyTea.displayinfo()
                    }
                }
            }
            4->{
                println("Beer MENU")
                println("1. Bokbunja           | W 16.2   | 복분자")
                println("2. Bourbon            | W 19.2   | 버번위스키")
                println("3. Cocktail           | W 15.4   | 칵테일")
                println("4. Gin                | W 25.2   | 진")
                println("5. Armand de Brignac  | W 999.99 | 아르망디 샴페인")
                println("0. 뒤로가기            | 뒤로가기\n")
                var Menupick = readLine()!!.toInt()
                when(Menupick){
                    0->{

                    }
                    1->{
                        Bokbunja.displayinfo()
                    }
                    2->{
                        Bourbon.displayinfo()
                    }
                    3->{
                        Cocktail.displayinfo()
                    }
                    4->{
                        Gin.displayinfo()
                    }
                    5->{
                        ArmandDeBrignac.displayinfo()
                    }

                }
            }
            0->{
                println("프로그램을 종료합니다.")
                break
            }
        }
    }
}
