package com.androiddevs.mvvmnewsapp.beans

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)