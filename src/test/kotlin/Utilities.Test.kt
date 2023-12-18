import org.example.*

fun main(){
    var y = readInt("Write an int value","ERROR: Value not int", "WARNING: Value oob",1,3)
    println(y)

    y = readInt("Write an int value","ERROR: Value not int")
    println(y)

    var x = readFloat("Write a float value","ERROR: Value not float", "WARNING: Value oob",1.0f,3.0f)
    println(x)

    x = readFloat("Write a float value","ERROR: Value not float")
    println(x)

    var chars = readChar("Write a char value", "Not a char")
    println(chars)

    var bool = readBoolean("Write a boolean", "Not a boolean")
    println(bool)
}