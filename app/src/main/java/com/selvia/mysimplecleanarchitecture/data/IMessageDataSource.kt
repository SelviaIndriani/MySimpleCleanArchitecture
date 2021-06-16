package com.selvia.mysimplecleanarchitecture.data

import com.selvia.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}