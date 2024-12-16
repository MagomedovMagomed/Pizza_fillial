import kotlin.system.exitProcess

val pizzaPeter = PizzaPeter(
    city = 2,
    tabascoPrice = 150, barbecuePrice = 150,
    neapolitanPizzaPrice = 175.0, romanPizzaPrice = 241.5,
    sicilianPizzaPrice = 167.5, tyroleanPizzaPrice = 215.0,
    neapolitanPizzaCheckPrice = 175.0, romanPizzaCheckPrice = 241.5,
    sicilianPizzaCheckPrice = 167.5, tyroleanPizzaCheckPrice = 215.0
)
val pizzaMoscow = PizzaMoscow(
    city = 1,
    tabascoPrice = 200, barbecuePrice = 200,
    neapolitanPizzaPrice = 215.0, romanPizzaPrice = 250.5,
    sicilianPizzaPrice = 180.5, tyroleanPizzaPrice = 240.0,
    neapolitanPizzaCheckPrice = 165.0, romanPizzaCheckPrice = 200.5,
    sicilianPizzaCheckPrice = 130.5, tyroleanPizzaCheckPrice = 190.0
)
val pizzaCity = CityPizza(
    city = 99,
    tabascoPrice = 150, barbecuePrice = 150,
    neapolitanPizzaPrice = 215.0, romanPizzaPrice = 250.5,
    sicilianPizzaPrice = 180.5, tyroleanPizzaPrice = 240.0,
    neapolitanPizzaCheckPrice = 165.0, romanPizzaCheckPrice = 200.5,
    sicilianPizzaCheckPrice = 130.5, tyroleanPizzaCheckPrice = 190.0
)

val pizzaNovgorod = PizzaNovgorod(
    city = 3,
    tabascoPrice = 22, barbecuePrice = 11,
    neapolitanPizzaPrice = 215.0, romanPizzaPrice = 250.5,
    sicilianPizzaPrice = 180.5, tyroleanPizzaPrice = 240.0,
    neapolitanPizzaCheckPrice = 165.0, romanPizzaCheckPrice = 200.5,
    sicilianPizzaCheckPrice = 130.5, tyroleanPizzaCheckPrice = 190.0
)

fun main() {

    var currentPizzaCity: PizzaCity

    while (true) {
        println("Добрый день! Выберите город")
        println("1.Москва \n2.Санкт-Петербург\n3.Новгород \n\n 0. Выход из программы")

        currentPizzaCity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "3" -> pizzaNovgorod
            "0" -> break
            else -> {
                println("ERROR")
                continue
            }
        }
        println("Выберите пиццу")
        println("1. Неаполитанская пицца \n2. Римская пицца \n3. Сицилийская пицца \n" +
                "4. Тирольская пицца \n\n0. Показать статистику")
        SelectPizza(currentPizzaCity, City = currentPizzaCity.city)
    }
}

fun SelectPizza(currentPizzaCity: PizzaCity, City: Int) {

    val SCity : CityPizza = CityPizza(
        city = currentPizzaCity.city,
        tabascoPrice = currentPizzaCity.tabascoPrice, barbecuePrice = currentPizzaCity.barbecuePrice,
        neapolitanPizzaPrice = currentPizzaCity.neapolitanPizzaPrice, romanPizzaPrice = currentPizzaCity.romanPizzaPrice,
        sicilianPizzaPrice = currentPizzaCity.sicilianPizzaPrice, tyroleanPizzaPrice = currentPizzaCity.tyroleanPizzaPrice,
        neapolitanPizzaCheckPrice = currentPizzaCity.neapolitanPizzaCheckPrice, romanPizzaCheckPrice = currentPizzaCity.romanPizzaCheckPrice,
        sicilianPizzaCheckPrice = currentPizzaCity.sicilianPizzaCheckPrice, tyroleanPizzaCheckPrice = currentPizzaCity.tyroleanPizzaCheckPrice
    )

    when (readln()) {
        "1" -> {
            if(currentPizzaCity.city == 1) {
                if (SCity.showCheckPhoto()) {
                    currentPizzaCity.neapolitanCheckPriceSale()
                } else {
                    currentPizzaCity.neapolitanPriceSale()
                }
            }
            else if(currentPizzaCity.city == 2) {
                currentPizzaCity.neapolitanPriceSale()
                if (SCity.drinkSale()) {
                    currentPizzaCity.coffeePriceSale()
                    currentPizzaCity.CoffeeNeapolitanPriceSale()
                }
            }
            else
            {
                if (SCity.showCheckPhoto()) {
                    currentPizzaCity.neapolitanCheckPriceSale()
                } else {
                    currentPizzaCity.neapolitanPriceSale()
                }
                if (SCity.drinkSale()) {
                    currentPizzaCity.coffeePriceSale()
                    currentPizzaCity.CoffeeNeapolitanPriceSale()
                }
                when (ChooseSauce())
                {
                    1 -> currentPizzaCity.TabascoPriceSale()
                    2 -> currentPizzaCity.BarbecuePriceSale()
                }
            }
        }

        "2" -> {
            if(currentPizzaCity.city == 1) {
                if (SCity.showCheckPhoto()) {
                    currentPizzaCity.romanCheckPriceSale()
                } else {
                    currentPizzaCity.romanPriceSale()
                }
            }
            else if(currentPizzaCity.city == 2) {
                currentPizzaCity.romanPriceSale()
                if (SCity.drinkSale()) {
                    currentPizzaCity.coffeePriceSale()
                    currentPizzaCity.CoffeeRomanPriceSale()
                }
            }
            else
            {
                if (SCity.showCheckPhoto()) {
                    currentPizzaCity.romanCheckPriceSale()
                } else {
                    currentPizzaCity.romanPriceSale()
                }
                if (SCity.drinkSale()) {
                    currentPizzaCity.coffeePriceSale()
                    currentPizzaCity.CoffeeRomanPriceSale()
                }
            }
        }

        "3" -> {
            if(currentPizzaCity.city == 1) {
                if (SCity.showCheckPhoto()) {
                    currentPizzaCity.sicilianCheckPriceSale()
                } else {
                    currentPizzaCity.sicilianPriceSale()
                }
            }
            else if(currentPizzaCity.city == 2) {
                currentPizzaCity.sicilianPriceSale()
                if (SCity.drinkSale()) {
                    currentPizzaCity.coffeePriceSale()
                    currentPizzaCity.CoffeeSicilianPriceSale()
                }
            }
            else
            {
                if (SCity.showCheckPhoto()) {
                    currentPizzaCity.sicilianCheckPriceSale()
                } else {
                    currentPizzaCity.sicilianPriceSale()
                }
                if (SCity.drinkSale()) {
                    currentPizzaCity.coffeePriceSale()
                    currentPizzaCity.CoffeeSicilianPriceSale()
                }
            }
        }

        "4" -> {
            if(currentPizzaCity.city == 1) {
                if (SCity.showCheckPhoto()) {
                    currentPizzaCity.tyroleanCheckPriceSale()
                } else {
                    currentPizzaCity.tyroleanPriceSale()
                }
            }
            else if(currentPizzaCity.city == 2) {
                currentPizzaCity.tyroleanPriceSale()
                if (SCity.drinkSale()) {
                    currentPizzaCity.coffeePriceSale()
                    currentPizzaCity.CoffeeTyroleanPriceSale()
                }
            }
            else
            {
                if (SCity.showCheckPhoto()) {
                    currentPizzaCity.neapolitanCheckPriceSale()
                } else {
                    currentPizzaCity.neapolitanPriceSale()
                }
                if (SCity.drinkSale()) {
                    currentPizzaCity.coffeePriceSale()
                }
            }
        }

        "0" -> currentPizzaCity.showStatistics()
        else -> {
            println("Выберите пиццу")
            println("1. Неаполитанская пицца \n2. Римская пицца \n3. Сицилийская пицца \n" +
                    "4. Тирольская пицца \n\n0. Показать статистику")
            SelectPizza(currentPizzaCity, City = currentPizzaCity.city)
        }
    }
}

fun ChooseSauce(): Int
{
    println("Хотите соус к вашей пицце?")
    println("1. Да \n2. Нет")

    if (readln() == "1") {
        println("Выберите соус")
        println("1. Табаско \n2. Барбекю \n\n0. Отказаться от соуса")
        when (readln()) {
            "1" -> return 1
            "2" -> return 2
            "0" -> return 0
            else -> {
                println("Выберите соус")
                println("1. Табаско \n2. Барбекю \n\n0. Отказаться от соуса")
            }
        }
    }
    return 0
}

fun selectAddService(currentPizzaCity: PizzaCity)
{
    when(currentPizzaCity)
    {
        is CheckPhoto -> currentPizzaCity.showCheckPhoto()
        is Drink -> currentPizzaCity.drinkSale()
    }
}