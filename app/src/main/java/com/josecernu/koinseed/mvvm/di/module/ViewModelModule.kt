package com.josecernu.koinseed.mvvm.di.module

import com.josecernu.koinseed.mvvm.ui.main.viewmodel.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MainViewModel(get(),get())
    }
}