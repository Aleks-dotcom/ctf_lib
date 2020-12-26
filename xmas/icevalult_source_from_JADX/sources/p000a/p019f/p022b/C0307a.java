package p000a.p019f.p022b;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import p000a.p019f.p020a.p021j.C0283b;

/* renamed from: a.f.b.a */
public class C0307a extends C0308b {

    /* renamed from: h */
    public int f1519h;

    /* renamed from: i */
    public int f1520i;

    /* renamed from: j */
    public C0283b f1521j;

    public C0307a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public int getType() {
        return this.f1519h;
    }

    public void setType(int type) {
        this.f1519h = type;
        this.f1520i = type;
        if (Build.VERSION.SDK_INT >= 17) {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                int i = this.f1519h;
                if (i == 5) {
                    this.f1520i = 1;
                } else if (i == 6) {
                    this.f1520i = 0;
                }
            } else {
                int i2 = this.f1519h;
                if (i2 == 5) {
                    this.f1520i = 0;
                } else if (i2 == 6) {
                    this.f1520i = 1;
                }
            }
        } else if (type == 5) {
            this.f1520i = 0;
        } else if (type == 6) {
            this.f1520i = 1;
        }
        this.f1521j.mo1993L0(this.f1520i);
    }

    /* renamed from: b */
    public void mo2160b(AttributeSet attrs) {
        super.mo2160b(attrs);
        this.f1521j = new C0283b();
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, C0317h.f1679a);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == C0317h.f1700h) {
                    setType(a.getInt(attr, 0));
                } else if (attr == C0317h.f1697g) {
                    this.f1521j.mo1992K0(a.getBoolean(attr, true));
                }
            }
        }
        this.f1525e = this.f1521j;
        mo2168f();
    }

    public void setAllowsGoneWidget(boolean supportGone) {
        this.f1521j.mo1992K0(supportGone);
    }
}
