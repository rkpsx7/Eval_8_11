package com.example.eval_8_11.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.example.eval_8_11.models.ResponseDTO

@Entity(tableName = "ArticleEntity")
data class ArticleEntity(@ColumnInfo(name = "ResponseDTO") var ResponseDTO: ResponseDTO)
