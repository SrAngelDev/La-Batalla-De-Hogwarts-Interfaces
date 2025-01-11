package srangeldev.models

import srangeldev.models.Enemy
import kotlin.math.min

class Inferi1(
    maxEnergy: Int = 50,
    color: String = "[💚]"
) : Enemy(maxEnergy, color), Atacar{

    val isAvailable: Boolean
        get() = maxEnergy >0

    override fun toString(): String {
        return "Inferi1(maxEnergy=$maxEnergy)"
    }

    override fun attack() {
        println("Atacando como Inferi1")
    }
}