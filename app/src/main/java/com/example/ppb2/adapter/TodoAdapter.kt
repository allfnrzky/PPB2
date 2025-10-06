package com.example.ppb2.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ppb2.TodoActivity
import com.example.ppb2.databinding.ItemTodoBinding
import com.example.ppb2.entity.Todo

class TodoAdapter (
    private val dataset: MutableList<Todo>
) : RecyclerView.Adapter<TodoActivity.CustomViewHolder>() {

    inner class CustomViewHolder(val view: ItemTodoBinding)
        : RecyclerView.ViewHolder(view.root) {

            fun bindData(item: Todo) {
                view.title.text = item.title
                view.description.text = item.description
            }
        }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
        ItemTodoBinding: ItemTodoBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return CustomViewHolder(
            holder: CustomViewHolder,
            position: Int
        ) {
            val data = dataset[position]
        holder.bindData(data)
        }
    )

    class TodoAdapter
}