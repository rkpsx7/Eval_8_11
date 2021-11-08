package com.example.eval_8_11.repo

import androidx.lifecycle.LiveData
import com.example.eval_8_11.models.ResponseDTO
import com.example.eval_8_11.room.Dao

class Repo(private val dao: Dao) {

    fun getNewsFromDB(): LiveData<ResponseDTO> {
        return dao.getNewsFromDB()
    }
}