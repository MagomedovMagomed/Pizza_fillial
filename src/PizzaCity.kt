abstract class PizzaCity(
    val city: Int, val coffeePrice: Double = 200.0,
    val tabascoPrice : Int, val barbecuePrice: Int,
    val neapolitanPizzaPrice : Double, val romanPizzaPrice : Double,
    val sicilianPizzaPrice : Double, val tyroleanPizzaPrice : Double,
    val neapolitanPizzaCheckPrice : Double, val romanPizzaCheckPrice : Double,
    val sicilianPizzaCheckPrice : Double, val tyroleanPizzaCheckPrice : Double
)
{
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyroleanPizzaCount = 0
    var neapolitanPizzaCheckCount = 0
    var romanPizzaCheckCount = 0
    var sicilianPizzaCheckCount = 0
    var tyroleanPizzaCheckCount = 0
    var coffeeCount = 0
    var CoffeeCountNeapolitan = 0
    var CoffeeCountRoman = 0
    var CoffeeCountSicilian = 0
    var CoffeeCountTyrolean = 0
    var TabascoCount = 0
    var BarbecueCount = 0

    abstract fun neapolitanPriceSale()
    abstract fun romanPriceSale()
    abstract fun sicilianPriceSale()
    abstract fun tyroleanPriceSale()
    abstract fun neapolitanCheckPriceSale()
    abstract fun romanCheckPriceSale()
    abstract fun sicilianCheckPriceSale()
    abstract fun tyroleanCheckPriceSale()
    abstract fun CoffeeNeapolitanPriceSale()
    abstract fun CoffeeSicilianPriceSale()
    abstract fun CoffeeRomanPriceSale()
    abstract fun CoffeeTyroleanPriceSale()
    abstract fun coffeePriceSale()
    abstract fun TabascoPriceSale()
    abstract fun BarbecuePriceSale()


    fun showStatistics()
    {

        if(city == 3)
        {
            val neapolit = neapolitanPizzaCount + neapolitanPizzaCheckCount
            val sicilia = sicilianPizzaCount + sicilianPizzaCheckCount
            val roman = romanPizzaCount + romanPizzaCheckCount
            val tyrolean = tyroleanPizzaCount + tyroleanPizzaCheckCount
            val pizza = neapolit + sicilia + roman + tyrolean
            val checkpizza = neapolitanPizzaCheckCount + sicilianPizzaCheckCount + romanPizzaCheckCount + tyroleanPizzaCheckCount

            println("Продано неаполитанской пиццы: $neapolit")
            println("Продано сицилийской пиццы: $sicilia")
            println("Продано римской пиццы: $roman")
            println("Продано тирольской пиццы: $tyrolean")

            val coffeeneap = 100 * CoffeeCountNeapolitan / pizza
            val coffeerom = 100 * CoffeeCountRoman / pizza
            val coffeesic = 100 * CoffeeCountSicilian / pizza
            val coffeetyr = 100 * CoffeeCountTyrolean / pizza

            println("Кофе чаще всего берут с:")
            println("Неаполитанской пиццей: $CoffeeCountNeapolitan ($coffeeneap %)")
            println("Сицилийской пиццей: $CoffeeCountSicilian ($coffeesic %)")
            println("Римской пиццей: $CoffeeCountRoman ($coffeerom %)")
            println("Тирольской пиццей: $CoffeeCountTyrolean ($coffeetyr %)")

            var tobasco = TabascoCount * tabascoPrice
            var barbecue = BarbecueCount * barbecuePrice

            println("Продано соуса табаско: $TabascoCount")
            println("Продано соуса барбекю: $BarbecueCount")
            println("Выручка соуса табаско: $tobasco")
            println("Выручка соуса барбекю: $barbecue")

            val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaPrice * romanPizzaCount +
                    sicilianPizzaPrice * sicilianPizzaCount + tyroleanPizzaPrice * tyroleanPizzaCount +
                    neapolitanPizzaCheckCount * neapolitanPizzaCheckPrice + romanPizzaCheckPrice * romanPizzaCheckCount +
                    sicilianPizzaCheckPrice * sicilianPizzaCheckCount + tyroleanPizzaCheckPrice * tyroleanPizzaCheckCount
            val Discountmoney = neapolitanPizzaCheckCount * neapolitanPizzaCheckPrice + romanPizzaCheckPrice * romanPizzaCheckCount +
                    sicilianPizzaCheckPrice * sicilianPizzaCheckCount + tyroleanPizzaCheckPrice * tyroleanPizzaCheckCount
            val PizzaMoney = (neapolitanPizzaCount + neapolitanPizzaCheckCount) * neapolitanPizzaPrice +
                    romanPizzaPrice * (romanPizzaCount + romanPizzaCheckCount) + sicilianPizzaPrice *
                    (sicilianPizzaCount + sicilianPizzaCheckCount) + tyroleanPizzaPrice *
                    (tyroleanPizzaCount + tyroleanPizzaCheckCount)
            val Discount = PizzaMoney - money
            val CoffeeMoney = coffeeCount * coffeePrice
            val Allmoney = CoffeeMoney + money + tobasco + barbecue
            val PeopleCheck = 100 * checkpizza / pizza
            val CoffeCheck = 100 * coffeeCount / pizza
            println("Общая стоимость заказов пиццы: $PizzaMoney")
            println("Общая стоимость заказов пиццы со скидкой: $money")
            println("Общая стоимость заказов с чеков: $Discountmoney")
            println("Общая сумма скидки: $Discount")
            println("Общая количество проданных кофе: $coffeeCount")
            println("Общая выручка за кофе: $CoffeeMoney")
            println("Общая стоимость заказов: $Allmoney")
            println("Профентное соотношение людей которые показывают чек: $PeopleCheck %")
            println("Профентное соотношение людей которые покупают кофе: $CoffeCheck %")
        }
        else if (city == 2)
        {
            val neapolit = neapolitanPizzaCount + neapolitanPizzaCheckCount
            val sicilia = sicilianPizzaCount + sicilianPizzaCheckCount
            val roman = romanPizzaCount + romanPizzaCheckCount
            val tyrolean = tyroleanPizzaCount + tyroleanPizzaCheckCount
            val pizza = neapolit + sicilia + roman + tyrolean
            val checkpizza = neapolitanPizzaCheckCount + sicilianPizzaCheckCount + romanPizzaCheckCount + tyroleanPizzaCheckCount

            println("Продано неаполитанской пиццы: $neapolit")
            println("Продано сицилийской пиццы: $sicilia")
            println("Продано римской пиццы: $roman")
            println("Продано тирольской пиццы: $tyrolean")

            val coffeeneap = 100 * CoffeeCountNeapolitan / pizza
            val coffeerom = 100 * CoffeeCountRoman / pizza
            val coffeesic = 100 * CoffeeCountSicilian / pizza
            val coffeetyr = 100 * CoffeeCountTyrolean / pizza

            println("Кофе чаще всего берут с:")
            println("Неаполитанской пиццей: $CoffeeCountNeapolitan ($coffeeneap %)")
            println("Сицилийской пиццей: $CoffeeCountSicilian ($coffeesic %)")
            println("Римской пиццей: $CoffeeCountRoman ($coffeerom %)")
            println("Тирольской пиццей: $CoffeeCountTyrolean ($coffeetyr %)")

            val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaPrice * romanPizzaCount +
                    sicilianPizzaPrice * sicilianPizzaCount + tyroleanPizzaPrice * tyroleanPizzaCount +
                    neapolitanPizzaCheckCount * neapolitanPizzaCheckPrice + romanPizzaCheckPrice * romanPizzaCheckCount +
                    sicilianPizzaCheckPrice * sicilianPizzaCheckCount + tyroleanPizzaCheckPrice * tyroleanPizzaCheckCount
            val Discountmoney = neapolitanPizzaCheckCount * neapolitanPizzaCheckPrice + romanPizzaCheckPrice * romanPizzaCheckCount +
                    sicilianPizzaCheckPrice * sicilianPizzaCheckCount + tyroleanPizzaCheckPrice * tyroleanPizzaCheckCount
            val PizzaMoney = (neapolitanPizzaCount + neapolitanPizzaCheckCount) * neapolitanPizzaPrice +
                    romanPizzaPrice * (romanPizzaCount + romanPizzaCheckCount) + sicilianPizzaPrice *
                    (sicilianPizzaCount + sicilianPizzaCheckCount) + tyroleanPizzaPrice *
                    (tyroleanPizzaCount + tyroleanPizzaCheckCount)
            val CoffeeMoney = coffeeCount * coffeePrice
            val Allmoney = CoffeeMoney + money
            val PeopleCheck = 100 * checkpizza / pizza
            val CoffeCheck = 100 * coffeeCount / pizza
            println("Общая стоимость заказов пиццы: $PizzaMoney")
            println("Общая количество проданных кофе: $coffeeCount")
            println("Общая выручка за кофе: $CoffeeMoney")
            println("Общая стоимость заказов: $Allmoney")
            println("Профентное соотношение людей которые покупают кофе: $CoffeCheck %")
        }
        else if(city == 1)
        {
            val neapolit = neapolitanPizzaCount + neapolitanPizzaCheckCount
            val sicilia = sicilianPizzaCount + sicilianPizzaCheckCount
            val roman = romanPizzaCount + romanPizzaCheckCount
            val tyrolean = tyroleanPizzaCount + tyroleanPizzaCheckCount
            val pizza = neapolit + sicilia + roman + tyrolean
            val checkpizza = neapolitanPizzaCheckCount + sicilianPizzaCheckCount + romanPizzaCheckCount + tyroleanPizzaCheckCount

            println("Продано неаполитанской пиццы: $neapolit")
            println("Продано сицилийской пиццы: $sicilia")
            println("Продано римской пиццы: $roman")
            println("Продано тирольской пиццы: $tyrolean")

            val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaPrice * romanPizzaCount +
                    sicilianPizzaPrice * sicilianPizzaCount + tyroleanPizzaPrice * tyroleanPizzaCount +
                    neapolitanPizzaCheckCount * neapolitanPizzaCheckPrice + romanPizzaCheckPrice * romanPizzaCheckCount +
                    sicilianPizzaCheckPrice * sicilianPizzaCheckCount + tyroleanPizzaCheckPrice * tyroleanPizzaCheckCount
            val Discountmoney = neapolitanPizzaCheckCount * neapolitanPizzaCheckPrice + romanPizzaCheckPrice * romanPizzaCheckCount +
                    sicilianPizzaCheckPrice * sicilianPizzaCheckCount + tyroleanPizzaCheckPrice * tyroleanPizzaCheckCount
            val PizzaMoney = (neapolitanPizzaCount + neapolitanPizzaCheckCount) * neapolitanPizzaPrice +
                    romanPizzaPrice * (romanPizzaCount + romanPizzaCheckCount) + sicilianPizzaPrice *
                    (sicilianPizzaCount + sicilianPizzaCheckCount) + tyroleanPizzaPrice *
                    (tyroleanPizzaCount + tyroleanPizzaCheckCount)
            val Discount = PizzaMoney - money
            val CoffeeMoney = coffeeCount * coffeePrice
            val Allmoney = CoffeeMoney + money
            val PeopleCheck = 100 * checkpizza / pizza
            println("Общая стоимость заказов пиццы: $PizzaMoney")
            println("Общая стоимость заказов пиццы со скидкой: $money")
            println("Общая стоимость заказов с чеков: $Discountmoney")
            println("Общая сумма скидки: $Discount")
            println("Общая стоимость заказов: $Allmoney")
            println("Профентное соотношение людей которые показывают чек: $PeopleCheck %")
        }

    }
}
