package one.digitalinnovation

class Pessoa {
    var nome: String = "Raphael Alexander Moura Amorim"
    var cpf:String = "135.204.299-65"
    /*inner class endereco{
        var rua:String = "Rua teste"
    }*/
}

fun main(){
    val raphael = Pessoa()

    println(raphael.nome)
    println(raphael.cpf)
    //println(raphael.endereco().rua)
}