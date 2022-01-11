import parts.CompositePart
import parts.SimplePart

fun main(args: Array<String>) {
    val part1 = SimplePart()
    part1.name = "hood"
    part1.number = 1
    part1.brand = "Mazda"
    part1.price = 3000

    val simpleMotorPart1 = SimplePart()
    simpleMotorPart1.price = 4000
    val simpleMotorPart2 = SimplePart()
    simpleMotorPart2.price = 2500
    val simpleMotorPart3 = SimplePart()
    simpleMotorPart3.price = 3500

    val part2 = CompositePart()
    part2.name = "motor"
    part2.number = 1
    part2.brand = "Mazda"
    part2.parts = listOf(
        simpleMotorPart1,
        simpleMotorPart2,
        simpleMotorPart3
    )

    val part3 = SimplePart()
    part3.name = "roof"
    part3.number = 1
    part3.brand = "Mazda"
    part3.price = 1000

    val part4 = SimplePart()
    part4.name = "bumper"
    part4.number = 1
    part4.brand = "Mazda"
    part4.price = 1000

    val part5 = SimplePart()
    part5.name = "window"
    part5.number = 4
    part5.brand = "Mazda"
    part5.price = 2000

    val car1 = Car(
        "Mazda 3",
        "Mazda",
        listOf(
            part1,
            part2,
            part3,
            part4,
            part5,
        )
    )

    print("This is the car '${car1.name}' with brand name '${car1.brand}' price -> $${car1.calculatePrice()},")
    car1.putOnSale()

    print("\n and the car state is '${if(car1.onSale) "on sale" else "sold" }'")
}