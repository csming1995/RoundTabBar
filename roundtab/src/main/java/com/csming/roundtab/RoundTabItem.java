package com.csming.roundtab;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * @author Created by csming on 2019/3/16.
 */
class RoundTabItem extends FrameLayout implements View.OnClickListener {

    private RoundTabBar.Item item;
    private RoundTabBar.OnItemSelectedListener onItemSelectedListener;

//    private ImageView mIvIcon;
    private TextView mTvTitle;

    public RoundTabItem(Context context) {
        this(context, null);
    }

    public RoundTabItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RoundTabItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View containerView = LayoutInflater.from(context).inflate(R.layout.round_tabbar_item, this);
//        mIvIcon = containerView.findViewById(R.id.iv_icon);
        mTvTitle = containerView.findViewById(R.id.tv_title);
        setOnClickListener(this);
        setWillNotDraw(false);

    }

    public void setItem(RoundTabBar.Item item) {
        this.item = item;
//        mIvIcon.setImageResource(item.getIcon());
        if (item.getTitle() != null) {
            mTvTitle.setText(item.getTitle());
            mTvTitle.setVisibility(VISIBLE);
        }

        mTvTitle.setTextColor(getResources().getColor(item.getTitleColor()));
    }

    public void setOnSelectedListener(final RoundTabBar.OnItemSelectedListener onItemSelectedListener) {
        this.onItemSelectedListener = onItemSelectedListener;
    }

    @Override
    public void onClick(View view) {
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(item);
        }
    }
}
