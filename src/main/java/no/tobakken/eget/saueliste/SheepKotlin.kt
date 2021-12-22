package no.tobakken.eget.saueliste

class SheepKotlin (val number: String, val alive: Boolean, val comment: String) {
    val lambs = ""
    val weight = "ingen veging registrert"
    val mother: Int? = null
    val father: Int? = null

    fun convertToCSV(): String{
        return number + ";" +
                alive + ";" +
                comment
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SheepKotlin

        if (number != other.number) return false

        return true
    }

    override fun hashCode(): Int {
        return number.hashCode()
    }

}