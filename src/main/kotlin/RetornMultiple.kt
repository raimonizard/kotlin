import org.example.utils.Utilities
import java.util.Scanner

val scan: Scanner = Scanner(System.`in`)

/**
 * Exemple de main que fa ús de mètodes que retornen Pair<> i Triple<>
 *
 * Limitacions: Sembla que només es poden usar Pair i Triple en el moment d'inicialització de variables:
 * https://stackoverflow.com/questions/69403492/assigning-pairs-to-already-defined-vars-in-kotlin
 *
 * Veure també: https://stackoverflow.com/questions/46202147/kotlin-quadruple-quintuple-etc-for-destructuring
 *
 * @author RIS
 * @since 1.0 -> 2024-12-04
 */
fun main(){
    var (nom, cognom, edat) = nomCognomEdat()
    println("El teu nom complet és: $nom, $cognom i tens $edat anys")

    var assignatura1: String = Utilities.readWord("Escriu el nom de la primera assignatura", "El nom introduït no és vàlid")
    var assignatura2: String = Utilities.readWord("Escriu el nom de la segona assignatura", "El nom introduït no és vàlid")
    var notes: Pair<Float, Float> = notes(assignatura1, assignatura2)
    println("La teva nota de $assignatura1 és ${notes.first} i la teva nota de $assignatura2 és ${notes.second}")
}

/**
 * Funció per a representar l'ús de la classe Pair com a retorn d'una funció
 *
 * @param assignatura1 primera assignatura per la qual consultar la nota
 * @param assignatura2 segona assignatura per la qual consultar la nota
 * @property first Primer valor del Pair
 * @property second Segon valor del Pair
 * @constructor Crea una nova instància d'un Pair
 */
fun notes(assignatura1: String
          , assignatura2: String): Pair<Float, Float>{
    var nota1: Float
    var nota2: Float

    nota1 = Utilities.readFloat("Escriu la nota de $assignatura1", "Valor no vàlid", "Valor fora de rang",1f, 10f)

    nota2 = Utilities.readFloat("Escriu la nota de $assignatura2", "Valor no vàlid", "Valor fora de rang",1f, 10f)
    scan.nextLine()

    return Pair(nota1, nota2)
}

/**
 * Funció per a representar l'ús de la classe Triple com a retorn d'una funció
 *
 * @property first Primer valor del Triple
 * @property second Segon valor del Triple
 * @property third Segon valor del Triple
 * @constructor Crea una nova instància d'un Triple
 */
fun nomCognomEdat(): Triple<String, String, Int>{
    var nom: String
    var cognom: String
    var edat: Int

    nom = Utilities.readWord("Si us plau, escriu el teu nom", "Nom no vàlid")

    cognom = Utilities.readWord("Si us plau, escriu el teu cognom", "Nom no vàlid")

    edat = Utilities.readInt("Si us plau, escriu la teva edat", "Valor no vàlid", "Valor fora de rang",1, 99)
    scan.nextLine()

    return Triple(nom, cognom, edat)
}
