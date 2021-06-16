package com.selvia.mysimplecleanarchitecture.di

import com.selvia.mysimplecleanarchitecture.data.IMessageDataSource
import com.selvia.mysimplecleanarchitecture.data.MessageDataSource
import com.selvia.mysimplecleanarchitecture.data.MessageRepository
import com.selvia.mysimplecleanarchitecture.domain.IMessageRepository
import com.selvia.mysimplecleanarchitecture.domain.MessageInteractor
import com.selvia.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {

    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource{
        return MessageDataSource()
    }
}