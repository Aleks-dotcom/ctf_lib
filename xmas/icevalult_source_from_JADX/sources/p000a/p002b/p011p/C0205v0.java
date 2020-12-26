package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: a.b.p.v0 */
public class C0205v0 extends C0184n0 {

    /* renamed from: b */
    public final WeakReference<Context> f1050b;

    public C0205v0(Context context, Resources res) {
        super(res);
        this.f1050b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int id) {
        Drawable d = super.getDrawable(id);
        Context context = (Context) this.f1050b.get();
        if (!(d == null || context == null)) {
            C0176m0.m948h().mo1264x(context, id, d);
        }
        return d;
    }
}
