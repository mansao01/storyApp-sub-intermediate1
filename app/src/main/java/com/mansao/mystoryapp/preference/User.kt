package com.mansao.mystoryapp.preference

data class User(
    val name: String,
    val email: String,
    val password: String,
    val isLogin: Boolean,
    val token: String
)