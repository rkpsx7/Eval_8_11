package com.example.eval_8_11.room

import androidx.room.TypeConverter
import com.example.eval_8_11.models.ResponseDTO
import com.google.gson.Gson

class RoomTypeConvertors {
    @TypeConverter
    fun objToJson(obj: ResponseDTO): String = Gson().toJson(obj)

    @TypeConverter
    fun jsonToObj(json: String): ResponseDTO = Gson().fromJson(json, ResponseDTO::class.java)
}