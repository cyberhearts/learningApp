package com.example.learningappproject.ui

import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.learningappproject.ui.user.UserEntryViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {

//        initializer {
//            ItemEditViewModel(
//                this.createSavedStateHandle(),
//                inventoryApplication().container.itemsRepository
//            )
//        }

        initializer {
            UserEntryViewModel(UserApplication().container.userRepository)
        }

//        initializer {
//            ItemDetailsViewModel(
//                this.createSavedStateHandle(),
//                inventoryApplication().container.itemsRepository
//            )
//        }
//
//        initializer {
//            HomeViewModel(inventoryApplication().container.itemsRepository)
//        }
    }
}


//fun CreationExtras.inventoryApplication(): InventoryApplication =
//    (this[AndroidViewModelFactory.APPLICATION_KEY] as InventoryApplication)