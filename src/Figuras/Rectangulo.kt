package Figuras

open class Rectangulo: Draw.Figures.Draw, Draw.Figures.Describe{
    fun vertical(): String{
        return """
            Ingrese el lado vertical:
            """.trimIndent()
    }
    fun horizontal(): String{
        return """
            Ingrese el lado horizontal:
            """.trimIndent()
    }
}