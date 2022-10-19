package com.example.cleanarchitecture.domain.usecase

import com.example.cleanarchitecture.domain.models.Username
import com.example.cleanarchitecture.domain.repository.UserRepository

class GetUsernameUsecase(private val userRepository: UserRepository) {

    fun execute() : Username {
        return userRepository.getName()
    }

}