package com.example.eval_8_11.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.eval_8_11.R
import com.example.eval_8_11.models.Article
import kotlinx.android.synthetic.main.item_layout.view.*

class Adapter(private val dataList: ArrayList<Article>) : RecyclerView.Adapter<ViewHolderNews>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderNews {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolderNews(view)
    }

    override fun onBindViewHolder(holder: ViewHolderNews, position: Int) {
        val item = dataList[position]
        holder.setData(item)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}

class ViewHolderNews(private val view: View) : RecyclerView.ViewHolder(view) {
    val clickTo: LinearLayout = view.findViewById(R.id.linear_item_layout_clickable)

    fun setData(item: Article) {
        view.apply {
            Glide.with(iv_article_pic).load(item.urlToImage).into(iv_article_pic)
            tv_title.text = item.title
            tv_publish_date.text = item.publishedAt
            tv_short_desc.text = item.description
        }
    }
}