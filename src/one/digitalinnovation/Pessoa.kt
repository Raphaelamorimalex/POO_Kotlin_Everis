package one.digitalinnovation

class Pessoa {
    var nome: String = "Raphael Alexander Moura Amorim"
    var cpf:String = "135.204.299-65"
}

fun main(){
    val raphael = Pessoa()

    println(raphael.nome)
    println(raphael.cpf)
}