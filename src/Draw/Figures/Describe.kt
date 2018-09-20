package Draw.Figures

interface Describe{
    fun objeto(): Int{
        println("Ingrese la altura")
        var alt : Int
        alt = Integer.parseInt(readLine()!!)
        return alt
    }

}