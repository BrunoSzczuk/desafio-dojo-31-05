package com.example.desafiodojo

import kotlin.math.pow

class Desafio {

    companion object {
        private val letras = arrayOf(
            'A',
            'B',
            'C',
            'D'
        )

        private val tamanho = letras.size
        fun calcular(valor: Int): String {
            var saida = ""
            var divisao = valor
            var sobra: Int
            if (valor <= tamanho) {
                return acessaIndice(valor) + ""
            }
            do {
                sobra = divisao % tamanho
                if (sobra == 0) {
                    saida += acessaIndice(tamanho)
                    divisao -= tamanho
                } else {
                    saida += acessaIndice(sobra)
                }
                divisao /= tamanho
            } while (divisao > 0)
            print("valor: $valor, entrada: $valor, saida: $saida")
            return saida.reversed()
        }

        private fun acessaIndice(indice: Int) = letras[indice - 1]
    }

}