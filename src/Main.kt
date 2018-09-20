

fun menupricipal():  String {
    return """
        Menu Principal
        1. Dibujar una figura
        2. Salir
        """.trimIndent()
}
fun menusecundario(): String {
    return """
        Menu
        1. Dibujar un cuadrado
        2. Dibujar un rectangulo
        3. Dibujar un triangulo
        4. Salir al menu principal
        """.trimIndent()
}

fun main (args: Array<String>) {
    // Variables
    var respuestaone: Int
    var respuestatwo: Int
    var on = true

    while (on) {
        println(menupricipal())
        respuestaone = Integer.parseInt(readLine()!!)
        when (respuestaone) {
            1 -> {
                println(menusecundario())
                respuestatwo = Integer.parseInt(readLine()!!)

                when (respuestatwo) {
                    1 -> {//# TODO CUADRADO

                    }
                    2 -> { //# TODO Rectangulo

                    }
                    3 -> { //# TODO triangulo

                    }
                    4 -> {
                        println("Regresando a menu principal")
                    }
                }
            }
            2 -> {
                println("Se esta saliendo del programa")
                on = false
            }
        }
    }
}