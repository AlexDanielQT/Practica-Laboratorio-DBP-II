fun calcularComision(giro: Double): Double {
    return when {
        giro <= 1000 -> 5.0
        giro <= 10001 -> 0.005 * giro // 0.5% de g
        else -> 0.015 * giro // 1.5% de g
    }
}

fun calcularItf(giro: Double): Double {
    return 0.00005 * giro // 0.005% de g
}

fun calcularMontoTotal(giro: Double): Double {
    val comision = calcularComision(giro)
    val itf = calcularItf(giro)
    return giro + comision + itf
}

fun encontrarMontoGiro(montoTotal: Double, precision: Double = 0.01): Double {
    var giroMin = 0.0
    var giroMax = montoTotal

    while (giroMax - giroMin > precision) {
        val giro = (giroMin + giroMax) / 2
        val totalCalculado = calcularMontoTotal(giro)

        if (totalCalculado < montoTotal) {
            giroMin = giro
        } else {
            giroMax = giro
        }
    }
    return giroMax
}

fun main() {
    val montoTotal = 155.0 // Cambiar por el monto total deseado
    val montoGiro = encontrarMontoGiro(montoTotal)
    println("El monto de giro estimado es: %.2f".format(montoGiro))
}
