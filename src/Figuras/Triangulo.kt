package Figuras


open class Triangulo: Draw.Figures.Draw, Draw.Figures.Describe{

    fun altura(): String{
        return """
            Ingrese la altura:
            """.trimIndent()
    }
}