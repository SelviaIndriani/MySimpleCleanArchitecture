package com.selvia.mysimplecleanarchitecture.data

import com.selvia.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name Welcome to Clean Architecture")

}