package com.example.eval_8_11.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.eval_8_11.models.ResponseDTO
import com.example.eval_8_11.repo.Repo

class ViewModel(private val repo: Repo) : ViewModel() {
    fun getNewsFromDB():LiveData<ResponseDTO>{
        return repo.getNewsFromDB()
    }
}