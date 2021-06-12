package com.whoopedu.dnevnadozasikiracije.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.whoopedu.dnevnadozasikiracije.R;
import com.whoopedu.dnevnadozasikiracije.model.Article;

import java.util.List;

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ViewHolder> {

    private List<Article> mArticles;

    public ArticlesAdapter(List<Article> articles) {
        mArticles = articles;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.article_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Article article = mArticles.get(position);
        holder.mCategoryTextView.setText(article.getCategory());
        holder.mDateTextView.setText(article.getDate().toString());
        holder.mTitleTextView.setText(article.getTitle());
        holder.mDescription.setText(article.getDescription());
    }

    @Override
    public int getItemCount() {
        return mArticles.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView mThumbnailImageView;
        private final TextView mCategoryTextView;
        private final TextView mDateTextView;
        private final TextView mTitleTextView;
        private final TextView mDescription;
        private final ImageButton mExpandButton;
        private final ImageButton mCollapseButton;

        private final LinearLayout mDetailsLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mThumbnailImageView = itemView.findViewById(R.id.iv_article_thumbnail);
            mCategoryTextView = itemView.findViewById(R.id.tv_category);
            mDateTextView = itemView.findViewById(R.id.tv_date);
            mTitleTextView = itemView.findViewById(R.id.tv_title);
            mDescription = itemView.findViewById(R.id.tv_description);
            mExpandButton = itemView.findViewById(R.id.btn_expand);
            mCollapseButton = itemView.findViewById(R.id.btn_collapse);
            mDetailsLayout = itemView.findViewById(R.id.details_layout);
            mDetailsLayout.setVisibility(View.GONE);

            mExpandButton.setOnClickListener(this::expandDetailsLayout);
            mCollapseButton.setOnClickListener(this::collapseDetailsLayout);
        }

        private void expandDetailsLayout(View view) {
            mDetailsLayout.setVisibility(View.VISIBLE);
        }

        private void collapseDetailsLayout(View view) {
            mDetailsLayout.setVisibility(View.GONE);
        }
    }
}
