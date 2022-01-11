package parts

class CompositePart: AbstractPart() {
    lateinit var parts: List<AbstractPart>
    override fun calculatePrice(): Long {
        price = parts.map(fun (p) = p.calculatePrice()).reduce { acc, l -> acc + l }

        return price
    }
}