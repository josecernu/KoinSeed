package com.josecernu.koinseed.mvvm.di.module

import com.josecernu.koinseed.mvvm.data.repository.MainRepository
import org.koin.dsl.module

    val repoModule = module {
        single {
            MainRepository(get())
        }
    }
