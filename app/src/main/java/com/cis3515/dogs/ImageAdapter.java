package com.cis3515.dogs;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.function.Consumer;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageAdapterViewHolder> {
    private Context originalContext;
    private DogsContent dogsContent;

    public ImageAdapter(Context baseContext) {
        originalContext = baseContext;
        dogsContent = new DogsContent(baseContext);
    }

    @Override
    public ImageAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImageAdapterViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.dogs_list_item, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(ImageAdapterViewHolder holder, int position) {
        holder.listItemImageView.setImageResource(dogsContent.getResourceId(position));
        holder.listItemDescriptionView.setText(dogsContent.getDescription(position));
    }

    @Override
    public int getItemCount() {
        return dogsContent.getSize();
    }

    public class ImageAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView listItemImageView;
        private TextView listItemDescriptionView;

        ImageAdapterViewHolder(View itemView) {
            super(itemView);
            listItemImageView = itemView.findViewById(R.id.list_item_image);
            listItemDescriptionView = itemView.findViewById(R.id.list_item_description);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent myIntent = new Intent(originalContext, DisplayActivity.class);
            myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            myIntent.putExtra("dogPosition", getAbsoluteAdapterPosition()); //Optional parameters
            originalContext.startActivity(myIntent);
        }
    }
}