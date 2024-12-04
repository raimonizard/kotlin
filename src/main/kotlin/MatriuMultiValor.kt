/**
 * Exemple de main que crea una matriu de tipus de valor múltiple
 *
 * @author RIS
 * @since 1.0 -> 2024-12-04
 */
fun main(){
    var matriu = inicialitzarMatriu()

    println(matriu::class.simpleName)

    imprimirMatriu(matriu)
}

/**
 * Funció que declara i inicialitza una matriu de tipus de dades múltiple
 *
 * @return matriu que conté dades
 */
fun inicialitzarMatriu(): Array<Array<Any>>{
    var matriu: Array<Array<Any>> = arrayOf(
        arrayOf("Maria", "Domènech", 18, true, 'A'),
        arrayOf("Josep", "Bosch", 19, false, 'C'),
        arrayOf("Guim", "Fuster", 18, true, 'B'),
        arrayOf("Marina", "Canovelles", 18, true, 'B'),
    )

    return matriu
}

/**
 * Procediment que imprimeix per pantalla el contingut de la matriu rebuda per paràmetre
 *
 * @param matriu que conté dades
 */
fun imprimirMatriu(matriu: Array<Array<Any>>) {
    for (fila in matriu) {
        for (columna in fila) {
            // La sintaxi ::class.simpleName retorna el tipus de dada de qualsevol variable
            print("$columna (${columna::class.simpleName}) ")
        }
        // Per imprimir un salt de línia després de cada fila
        println("")
    }
}
