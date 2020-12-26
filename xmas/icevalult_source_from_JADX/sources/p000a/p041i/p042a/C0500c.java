package p000a.p041i.p042a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.i.a.c */
public abstract class C0500c extends C0495a {

    /* renamed from: j */
    public int f2113j;

    /* renamed from: k */
    public int f2114k;

    /* renamed from: l */
    public LayoutInflater f2115l;

    @Deprecated
    public C0500c(Context context, int layout, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
        this.f2114k = layout;
        this.f2113j = layout;
        this.f2115l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: h */
    public View mo1384h(Context context, Cursor cursor, ViewGroup parent) {
        return this.f2115l.inflate(this.f2113j, parent, false);
    }

    /* renamed from: g */
    public View mo2667g(Context context, Cursor cursor, ViewGroup parent) {
        return this.f2115l.inflate(this.f2114k, parent, false);
    }
}
