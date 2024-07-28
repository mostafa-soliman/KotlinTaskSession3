//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1- Ask the user to enter one integer (Int)
    val oneInt :Int?
    println("enter one integer")
    oneInt = readln().substring(0,1).toIntOrNull()
    println("enter one integer : ${oneInt}")

//2: Ask the user to enter one double (Double).
    val oneDouble :Double?
    println("enter one Double")
    oneDouble = readln().substring(0,1).toDoubleOrNull()
    println("enter one Double : ${oneDouble}")

//3: Calculate the quotient of the double divided by the integer.
println("Calculate the quotient of the double divided by the integer.")
    if(oneInt!== 0 && oneInt !=null && oneDouble != null )  {
        val calDiv: Double = oneDouble/oneInt
        println("The quotient is: $calDiv")
    } else {
        println("Cannot perform division. Please ensure the integer is not null or zero, and the double is not null.")
    }

}

