package com.example.eval_8_11.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.eval_8_11.models.ResponseDTO

@Dao
interface Dao {
    @Insert(onConflict = REPLACE)
    fun insertNews(obj: ResponseDTO)

    @Query("select * from ArticleEntity")
    fun getNewsFromDB(): LiveData<ResponseDTO>

}