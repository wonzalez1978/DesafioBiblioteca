package cl.desafiolatam.biblioteca

fun main() {
    var librosEscolares1 = LibroEscolares( " Metamorfosis", "00001", "1960",
        "Independiente", 200, 2000, "Kafka", 'D')

    var librosEscolares2 = LibroEscolares(" El señor de las moscas", "2",
        "1954", "Independiente", 250, 3000,
        "William Golding", 'I')

    var librosEscolares3 = LibroEscolares(
        " El médico", "3", "1986", "Independiente",
        2000, 5000, "Noah Gordon", 'I')
    val librosEscolares4 = LibroEscolares(" El ruiseñor y la rosa", "4",
        "1888", "Independiente", 60, 1500, "Oscar Wilde", 'I')
    imprimir(librosEscolares1)
    precioFormateado(librosEscolares1.precio)
    println()
    imprimir(librosEscolares3)
    precioFormateado(librosEscolares3.precio)
}





