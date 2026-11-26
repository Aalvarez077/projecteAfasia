package com.example.afasiaproject.ui

import kotlinx.serialization.json.Json
import java.io.File
object VocabularyManager{
    //By Lazy hace que solo lo lea una vez para no cargar la memoria
    private val jsonFile: Map<String, List<String>>by lazy {
        val content = File("dictionary.json").readText()
        Json.decodeFromString(content)
    }
    fun getCategories(): List<String>{
        return jsonFile.keys.toList()
    }
    fun getWords(category: String): List<String>{
        return jsonFile[category] ?: emptyList()
    }
}