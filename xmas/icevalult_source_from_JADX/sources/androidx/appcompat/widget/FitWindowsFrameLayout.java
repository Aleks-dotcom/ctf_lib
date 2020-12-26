package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000a.p002b.p011p.C0151g0;

public class FitWindowsFrameLayout extends FrameLayout implements C0151g0 {

    /* renamed from: b */
    public C0151g0.C0152a f3123b;

    public FitWindowsFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setOnFitSystemWindowsListener(C0151g0.C0152a listener) {
        this.f3123b = listener;
    }

    public boolean fitSystemWindows(Rect insets) {
        C0151g0.C0152a aVar = this.f3123b;
        if (aVar != null) {
            aVar.mo172a(insets);
        }
        return super.fitSystemWindows(insets);
    }
}
