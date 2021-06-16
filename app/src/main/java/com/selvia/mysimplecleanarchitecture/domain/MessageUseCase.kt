package com.selvia.mysimplecleanarchitecture.domain

interface MessageUseCase {

    fun getMessage(name:String): MessageEntity
}