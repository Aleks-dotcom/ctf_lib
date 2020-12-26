package p000a.p002b.p011p;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p000a.p002b.C0012j;
import p000a.p025h.p040n.C0489h;

/* renamed from: a.b.p.q */
public class C0193q extends PopupWindow {

    /* renamed from: b */
    public static final boolean f1000b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a */
    public boolean f1001a;

    public C0193q(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mo1371a(context, attrs, defStyleAttr, defStyleRes);
    }

    /* renamed from: a */
    public final void mo1371a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        C0218w0 a = C0218w0.m1093u(context, attrs, C0012j.f74Q1, defStyleAttr, defStyleRes);
        int i = C0012j.f82S1;
        if (a.mo1513r(i)) {
            mo1372b(a.mo1496a(i, false));
        }
        setBackgroundDrawable(a.mo1502g(C0012j.f78R1));
        a.mo1514v();
    }

    public void showAsDropDown(View anchor, int xoff, int yoff) {
        if (f1000b && this.f1001a) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff);
    }

    public void showAsDropDown(View anchor, int xoff, int yoff, int gravity) {
        if (f1000b && this.f1001a) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff, gravity);
    }

    public void update(View anchor, int xoff, int yoff, int width, int height) {
        if (f1000b && this.f1001a) {
            yoff -= anchor.getHeight();
        }
        super.update(anchor, xoff, yoff, width, height);
    }

    /* renamed from: b */
    public final void mo1372b(boolean overlapAnchor) {
        if (f1000b) {
            this.f1001a = overlapAnchor;
        } else {
            C0489h.m2423a(this, overlapAnchor);
        }
    }
}
