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
}