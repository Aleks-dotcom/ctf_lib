package p000a.p058q;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: a.q.a0 */
public class C0661a0 implements C0663b0 {

    /* renamed from: a */
    public final ViewOverlay f2595a;

    public C0661a0(View view) {
        this.f2595a = view.getOverlay();
    }

    /* renamed from: d */
    public void mo3437d(Drawable drawable) {
        this.f2595a.add(drawable);
    }

    /* renamed from: b */
    public void mo3436b(Drawable drawable) {
        this.f2595a.remove(drawable);
    }
}
