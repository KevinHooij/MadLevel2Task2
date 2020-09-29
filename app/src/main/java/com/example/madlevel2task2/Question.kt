package com.example.madlevel2task2

data class Question (
    val questionValue: String,
    val answerValue: Boolean

){companion object{
    val QUESTION_LIST: Array<String> = arrayOf (
        "1 + 1 = 42",
        "Dit is een opdracht voor MAD",
        "Blauw is een primaire kleur",
        "Appel is een groente",
        "Ananas hoort op pizza"
    )

    val ANSWER_LIST: Array<Boolean> = arrayOf(
        false,
        true,
        true,
        false,
        false
    )

    }
}



