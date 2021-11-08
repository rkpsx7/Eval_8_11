package com.example.eval_8_11

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.eval_8_11.Networks.ApiClient
import com.example.eval_8_11.Networks.NetWork
import com.example.eval_8_11.models.Article
import com.example.eval_8_11.models.ResponseDTO
import com.example.eval_8_11.views.Adapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    var dataList = ArrayList<Article>()

    companion object {
        @JvmStatic
        val APIKEY = "8442d86a44b74313886bc61edef8154f"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiService = NetWork.getRetrofit().create(ApiClient::class.java)
        apiService.getNews("us", "business", APIKEY).enqueue(object : Callback<ResponseDTO?> {
            override fun onResponse(call: Call<ResponseDTO?>, response: Response<ResponseDTO?>) {
                dataList = response.body()?.articles as ArrayList<Article>
                setAdapter()
            }

            override fun onFailure(call: Call<ResponseDTO?>, t: Throwable) {
            }


        })
    }

    private fun setAdapter() {
        recyclerView.adapter = Adapter(dataList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}

//8442d86a44b74313886bc61edef8154f