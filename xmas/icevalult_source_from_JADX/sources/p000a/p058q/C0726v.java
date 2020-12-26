package p000a.p058q;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: a.q.v */
public class C0726v implements C0727w {

    /* renamed from: a */
    public final ViewGroupOverlay f2748a;

    public C0726v(ViewGroup group) {
        this.f2748a = group.getOverlay();
    }

    /* renamed from: d */
    public void mo3437d(Drawable drawable) {
        this.f2748a.add(drawable);
    }

    /* renamed from: b */
    public void mo3436b(Drawable drawable) {
        this.f2748a.remove(drawable);
    }

    /* renamed from: c */
    public void mo3601c(View view) {
        this.f2748a.add(view);
    }

    /* renamed from: a */
    public void mo3600a(View view) {
        this.f2748a.remove(view);
    }
}
