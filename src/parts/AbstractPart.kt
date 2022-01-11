package parts

abstract class AbstractPart {
 var price: Long = 0
 var brand: String = ""
 var name: String = ""
 var number: Int = 0
 abstract fun calculatePrice(): Long
}