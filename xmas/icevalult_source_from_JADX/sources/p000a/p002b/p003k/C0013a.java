package p000a.p002b.p003k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p002b.C0012j;
import p000a.p002b.p009o.C0073b;

/* renamed from: a.b.k.a */
public abstract class C0013a {

    /* renamed from: a.b.k.a$b */
    public interface C0015b {
        /* renamed from: a */
        void mo24a(boolean z);
    }

    @Deprecated
    /* renamed from: a.b.k.a$c */
    public static abstract class C0016c {
        /* renamed from: a */
        public abstract CharSequence mo25a();

        /* renamed from: b */
        public abstract View mo26b();

        /* renamed from: c */
        public abstract Drawable mo27c();

        /* renamed from: d */
        public abstract CharSequence mo28d();

        /* renamed from: e */
        public abstract void mo29e();
    }

    /* renamed from: h */
    public abstract boolean mo10h();

    /* renamed from: i */
    public abstract void mo11i(boolean z);

    /* renamed from: j */
    public abstract int mo12j();

    /* renamed from: k */
    public abstract Context mo13k();

    /* renamed from: m */
    public abstract void mo15m(Configuration configuration);

    /* renamed from: o */
    public abstract boolean mo17o(int i, KeyEvent keyEvent);

    /* renamed from: r */
    public abstract void mo20r(boolean z);

    /* renamed from: s */
    public abstract void mo21s(boolean z);

    /* renamed from: t */
    public abstract void mo22t(CharSequence charSequence);

    /* renamed from: u */
    public abstract C0073b mo23u(C0073b.C0074a aVar);

    /* renamed from: q */
    public boolean mo19q() {
        return false;
    }

    /* renamed from: g */
    public boolean mo9g() {
        return false;
    }

    /* renamed from: l */
    public boolean mo14l() {
        return false;
    }

    /* renamed from: p */
    public boolean mo18p(KeyEvent event) {
        return false;
    }

    /* renamed from: n */
    public void mo16n() {
    }

    /* renamed from: a.b.k.a$a */
    public static class C0014a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f238a;

        public C0014a(Context c, AttributeSet attrs) {
            super(c, attrs);
            this.f238a = 0;
            TypedArray a = c.obtainStyledAttributes(attrs, C0012j.f207t);
            this.f238a = a.getInt(C0012j.f212u, 0);
            a.recycle();
        }

        public C0014a(int width, int height) {
            super(width, height);
            this.f238a = 0;
            this.f238a = 8388627;
        }

        public C0014a(C0014a source) {
            super(source);
            this.f238a = 0;
            this.f238a = source.f238a;
        }

        public C0014a(ViewGroup.LayoutParams source) {
            super(source);
            this.f238a = 0;
        }
    }
}
