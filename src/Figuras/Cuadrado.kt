package Figuras

 open class Cuadrado: Draw.Figures.Draw, Draw.Figures.Describe{
     var longitud: Int = 0
         set(value){
             field = value
         }

     fun ancho(): String{
         return """
             Ingrese el ancho:
             """.trimIndent()
     }

     override fun objeto(): Int {
         longitud =  super.objeto()
         return 0
     }
 }

