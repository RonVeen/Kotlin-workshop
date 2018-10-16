import java.lang.IllegalArgumentException
import java.time.LocalDate


interface Zitplaats {

    fun aantalZitplaatsen() : Int
}


open class Voertuig() {
    open fun start() { }
}


class Auto(val merk: String, val type: String, var kenteken: String = "", val bouwjaar: Int) : Voertuig(), Zitplaats {

    var kleur: String = ""
        set(value) {
            if (value != "Groen") throw IllegalArgumentException("Groen is de vetste kleur")
            else field = value
        }

    val apkVereist: Boolean
        get() = (LocalDate.now().year - bouwjaar) > 3


    init {
        kenteken = kenteken.toUpperCase()
    }


    constructor(merk: String, type:String) : this(merk = merk, type = type, bouwjaar=LocalDate.now().year)

    override fun start() {
        println("Starten van de $merk")
    }

    override fun aantalZitplaatsen(): Int {
        return 5
    }



}

fun main(args: Array<String>) {
    val mazda = Auto("Mazda", type = "3 SkyActive", bouwjaar = 2014)
    println("APK vereist = ${mazda.apkVereist}")

    mazda.start()

    mazda.kleur = "Groen"
    println("De kleur van de ${mazda.merk} ${mazda.type} is ${mazda.kleur}")

    //  Gooit een exceptie
    mazda.kleur = "Rood"


}