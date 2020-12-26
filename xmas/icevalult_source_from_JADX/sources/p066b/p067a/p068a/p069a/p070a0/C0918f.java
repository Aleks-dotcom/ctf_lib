package p066b.p067a.p068a.p069a.p070a0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p066b.p067a.p068a.p069a.p073d0.C0933d;
import p066b.p067a.p068a.p069a.p073d0.C0937f;

/* renamed from: b.a.a.a.a0.f */
public class C0918f {

    /* renamed from: a */
    public final TextPaint f3835a = new TextPaint(1);

    /* renamed from: b */
    public final C0937f f3836b = new C0919a();

    /* renamed from: c */
    public float f3837c;

    /* renamed from: d */
    public boolean f3838d = true;

    /* renamed from: e */
    public WeakReference<C0920b> f3839e = new WeakReference<>((Object) null);

    /* renamed from: f */
    public C0933d f3840f;

    /* renamed from: b.a.a.a.a0.f$b */
    public interface C0920b {
        /* renamed from: a */
        void mo5523a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    /* renamed from: b.a.a.a.a0.f$a */
    public class C0919a extends C0937f {
        public C0919a() {
        }

        /* renamed from: b */
        public void mo5522b(Typeface typeface, boolean fontResolvedSynchronously) {
            if (!fontResolvedSynchronously) {
                boolean unused = C0918f.this.f3838d = true;
                C0920b textDrawableDelegate = (C0920b) C0918f.this.f3839e.get();
                if (textDrawableDelegate != null) {
                    textDrawableDelegate.mo5523a();
                }
            }
        }

        /* renamed from: a */
        public void mo5521a(int reason) {
            boolean unused = C0918f.this.f3838d = true;
            C0920b textDrawableDelegate = (C0920b) C0918f.this.f3839e.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.mo5523a();
            }
        }
    }

    public C0918f(C0920b delegate) {
        mo5517g(delegate);
    }

    /* renamed from: g */
    public void mo5517g(C0920b delegate) {
        this.f3839e = new WeakReference<>(delegate);
    }

    /* renamed from: e */
    public TextPaint mo5515e() {
        return this.f3835a;
    }

    /* renamed from: i */
    public void mo5519i(boolean dirty) {
        this.f3838d = dirty;
    }

    /* renamed from: f */
    public float mo5516f(String text) {
        if (!this.f3838d) {
            return this.f3837c;
        }
        float c = mo5513c(text);
        this.f3837c = c;
        this.f3838d = false;
        return c;
    }

    /* renamed from: c */
    public final float mo5513c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f3835a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C0933d mo5514d() {
        return this.f3840f;
    }

    /* renamed from: h */
    public void mo5518h(C0933d textAppearance, Context context) {
        if (this.f3840f != textAppearance) {
            this.f3840f = textAppearance;
            if (textAppearance != null) {
                textAppearance.mo5539j(context, this.f3835a, this.f3836b);
                C0920b textDrawableDelegate = (C0920b) this.f3839e.get();
                if (textDrawableDelegate != null) {
                    this.f3835a.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.mo5538i(context, this.f3835a, this.f3836b);
                this.f3838d = true;
            }
            C0920b textDrawableDelegate2 = (C0920b) this.f3839e.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.mo5523a();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }

    /* renamed from: j */
    public void mo5520j(Context context) {
        this.f3840f.mo5538i(context, this.f3835a, this.f3836b);
    }
}
