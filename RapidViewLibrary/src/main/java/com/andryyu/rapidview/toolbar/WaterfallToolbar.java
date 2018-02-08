package com.andryyu.rapidview.toolbar;

import android.content.Context;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

/**
 * Created by Administrator on 2018\2\5 0005.
 */

public class WaterfallToolbar extends CardView {

    public WaterfallToolbar(@NonNull Context context) {
        super(context);
    }

    public WaterfallToolbar(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public WaterfallToolbar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Nullable
    @Override
    protected Parcelable onSaveInstanceState() {

        return super.onSaveInstanceState();
    }

    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(state);

    }
}
