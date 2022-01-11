import parts.AbstractPart

class Car(
    val name: String,
    val brand: String,
    private val parts: List<AbstractPart>,
){
    var onSale = false
    fun putOnSale() {
        onSale = true
    }
    fun calculatePrice(): Long {
        return parts.map(fun (p) = p.calculatePrice()).reduce { acc, l -> acc + l }
    }
}