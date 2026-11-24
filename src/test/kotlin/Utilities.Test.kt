import org.example.*

fun main(){
    var y: Int = Utils.readInt("Write an int value","ERROR: Value not int", "WARNING: Value oob",1,3)
    println(y)

    y = Utils.readInt("Write an int value","ERROR: Value not int")
    println(y)

    var x: Float = Utils.readFloat("Write a float value","ERROR: Value not float", "WARNING: Value oob",1.0f,3.0f)
    println(x)

    x = Utils.readFloat("Write a float value","ERROR: Value not float")
    println(x)

    var chars: Char = Utils.readChar("Write a char value", "Not a char")
    println(chars)

    var bool: Boolean = Utils.readBoolean("Write a boolean", "Not a boolean")
    println(bool)
}