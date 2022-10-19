package com.example.cleanarchitecture.di

import com.example.cleanarchitecture.domain.repository.UserRepository
import com.example.cleanarchitecture.domain.usecase.GetUsernameUsecase
import com.example.cleanarchitecture.domain.usecase.SaveUsernameUsecase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideGetUsernameUsecase(userRepository: UserRepository) : GetUsernameUsecase {
        return GetUsernameUsecase(userRepository = userRepository)
    }

    @Provides
    fun provideSaveUsernameUsecase(userRepository: UserRepository) : SaveUsernameUsecase {
        return SaveUsernameUsecase(userRepository = userRepository)
    }

}