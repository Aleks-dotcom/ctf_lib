package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p002b.p009o.p010j.C0098g;
import p000a.p002b.p009o.p010j.C0115n;

public class NavigationMenuView extends RecyclerView implements C0115n {
    public NavigationMenuView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    /* renamed from: d */
    public void mo847d(C0098g menu) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
