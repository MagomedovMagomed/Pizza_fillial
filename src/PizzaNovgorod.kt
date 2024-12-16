class PizzaNovgorod (
    city: Int, coffeePrice: Double = 200.0,
    tabascoPrice : Int, barbecuePrice: Int,
    neapolitanPizzaPrice : Double, romanPizzaPrice : Double,
    sicilianPizzaPrice : Double, tyroleanPizzaPrice : Double,
    neapolitanPizzaCheckPrice : Double, romanPizzaCheckPrice : Double,
    sicilianPizzaCheckPrice : Double, tyroleanPizzaCheckPrice : Double
) : PizzaCity(
    city, coffeePrice,
    tabascoPrice, barbecuePrice,
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice,
    neapolitanPizzaCheckPrice, romanPizzaCheckPrice,
    sicilianPizzaCheckPrice, tyroleanPizzaCheckPrice
), CheckPhoto, Drink
{
    override fun drinkSale() : Boolean
    {
        println("Вы будете кофе?")
        println("1. Да \n2. Нет")
        if (readln() == "1") {
            println("С вас 200 рублей")
            return true
        }
        return false
    }

    override fun showCheckPhoto(): Boolean
    {
        println("У вас есть фотография чека?")
        println("1. Да \n2. Нет")

        if (readln() == "1") {
            println("Вам будет скидка 50 рублей с покупки")
            return true
        }
        return false
    }

    override fun TabascoPriceSale()
    {
        TabascoCount++
    }

    override fun BarbecuePriceSale()
    {
        BarbecueCount++
    }

    override fun coffeePriceSale() {
        coffeeCount++
    }

    override fun CoffeeNeapolitanPriceSale()
    {
        CoffeeCountNeapolitan++
    }

    override fun CoffeeSicilianPriceSale()
    {
        CoffeeCountSicilian++
    }

    override fun CoffeeRomanPriceSale()
    {
        CoffeeCountRoman++
    }

    override fun CoffeeTyroleanPriceSale() {
        CoffeeCountTyrolean++
    }

    override fun neapolitanPriceSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Новгороде")
    }

    override fun romanPriceSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Новгороде")
    }
    override fun sicilianPriceSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Новгороде")
    }
    override fun tyroleanPriceSale() {
        tyroleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Новгороде")
    }
    override fun neapolitanCheckPriceSale() {
        neapolitanPizzaCheckCount++
        println("Спасибо за покупку неаполитанской пиццы в Новгороде")
    }

    override fun romanCheckPriceSale() {
        romanPizzaCheckCount++
        println("Спасибо за покупку римской пиццы в Новгороде")
    }

    override fun sicilianCheckPriceSale() {
        sicilianPizzaCheckCount++
        println("Спасибо за покупку сицилийской пиццы в Новгороде")
    }
    override fun tyroleanCheckPriceSale() {
        tyroleanPizzaCheckCount++
        println("Спасибо за покупку тирольской пиццы в Новгороде")
    }
}