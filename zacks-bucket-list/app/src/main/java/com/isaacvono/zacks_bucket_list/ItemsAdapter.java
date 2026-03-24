package com.isaacvono.zacks_bucket_list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {

    private Item[] items;

    public ItemsAdapter(Item[] items) { this.items = items;}

    @Override
    public int getItemCount() {
        return items.length;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bucket_list_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.bind(items[position]);
    }


    static class ItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView itemIcon;
        private TextView itemTitle;
        private TextView itemDescription;


        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemIcon = itemView.findViewById(R.id.item_icon_image_view);
            itemTitle = itemView.findViewById(R.id.item_title);
            itemDescription = itemView.findViewById(R.id.item_description);
        }

        public void bind(Item item) {
            itemIcon.setImageResource(item.icon);
            itemTitle.setText(item.title);
            itemDescription.setText(item.description);
        }
    }

}
