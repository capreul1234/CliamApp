package com.example.previsaodotempo

import java.io.Serializable
class Previsao(
    var data: String?,
    var diaDaSemana: String?,
    var maxima: String?,
    var minima: String?,
    var descricao: String?,
    var condicao: String?) : Serializable {

    companion object {
        private const val serialVersionUID = 1L
    }
}
