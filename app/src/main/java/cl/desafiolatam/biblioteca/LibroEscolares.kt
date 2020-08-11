package cl.desafiolatam.biblioteca

data class LibroEscolares (val nombreLibro : String, val isbn:String, val añoPublicacion : String,
                           val editorial:String, val cantidadPaginas: Int, val precio: Int, val autor:String, val tipoLibro:Char)



fun precioFormateado(valor : Int) {
    var precio = valor
    println("el precio del libro es $precio pesos")
}

fun imprimir(libroEscolares : LibroEscolares){
    println(libroEscolares)
}