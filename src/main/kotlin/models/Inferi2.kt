package srangeldev.models

import kotlin.math.min

class Inferi2(
    maxEnergy: Int = 50,
    color: String = "[💛]",
    override var shield: Int = 50
): Enemy(maxEnergy, color), Defender {

    val isAvailable: Boolean
        get() = maxEnergy >0

    override fun toString(): String {
        return "Inferi2(maxEnergy=$maxEnergy}, shield=$shield)"
    }

    override fun defend() {
        println("Defendiendo con un escudo de $shield")
    }
}