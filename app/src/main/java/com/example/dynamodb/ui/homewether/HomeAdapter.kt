package com.example.dynamodb.ui.homewether

import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.dynamodb.core.base.BaseAdapter
import com.example.dynamodb.core.base.BaseBindingViewHolder
import com.example.dynamodb.databinding.RowItemBinding
import com.example.dynamodb.medule.DynamodbModual


class HomeAdapter(
    marketCategories: MutableList<DynamodbModual>?,
    val onclickListener: ((pos: Int, (DynamodbModual?)) -> Unit),

    ) : BaseAdapter<DynamodbModual, HomeAdapter.MarketCategoryItemViewHolder>(marketCategories) {


    override fun getViewHolder(parent: ViewGroup, viewType: Int): MarketCategoryItemViewHolder {
        val binding = RowItemBinding.inflate(inflater, parent, false)
        return MarketCategoryItemViewHolder(binding)
    }


    inner class MarketCategoryItemViewHolder(
        val binding: RowItemBinding
    ) : BaseBindingViewHolder<DynamodbModual>(binding) {
        override fun bind(position: Int, item: DynamodbModual?) {
            bind<RowItemBinding> {
                model = item

                setImageUrl(binding.img, item?.image_urls?.get(0))


            }
            binding.cardItem.setOnClickListener {
                onclickListener(position, item)
                notifyDataSetChanged()


            }



        }
    }

    @BindingAdapter("imageUrl")
    fun setImageUrl(imgView: ImageView, imgUrl: String?) {
        imgUrl?.let {
            val imgUri = it.toUri().buildUpon().scheme("http").build()
            Glide.with(imgView.context)
                .load(imgUri)
                .into(imgView)

        }

    }


}