package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p000a.p002b.p011p.C0151g0;

public class FitWindowsLinearLayout extends LinearLayout implements C0151g0 {

    /* renamed from: b */
    public C0151g0.C0152a f3124b;

    public FitWindowsLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setOnFitSystemWindowsListener(C0151g0.C0152a listener) {
        this.f3124b = listener;
    }

    public boolean fitSystemWindows(Rect insets) {
        C0151g0.C0152a aVar = this.f3124b;
        if (aVar != null) {
            aVar.mo172a(insets);
        }
        return super.fitSystemWindows(insets);
    }
}
