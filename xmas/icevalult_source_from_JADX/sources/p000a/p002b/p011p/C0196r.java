package p000a.p002b.p011p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p000a.p025h.p029f.p030j.C0372c;

/* renamed from: a.b.p.r */
public class C0196r {

    /* renamed from: c */
    public static final int[] f1021c = {16843067, 16843068};

    /* renamed from: a */
    public final ProgressBar f1022a;

    /* renamed from: b */
    public Bitmap f1023b;

    public C0196r(ProgressBar view) {
        this.f1022a = view;
    }

    /* renamed from: c */
    public void mo1405c(AttributeSet attrs, int defStyleAttr) {
        C0218w0 a = C0218w0.m1093u(this.f1022a.getContext(), attrs, f1021c, defStyleAttr, 0);
        Drawable drawable = a.mo1503h(0);
        if (drawable != null) {
            this.f1022a.setIndeterminateDrawable(mo1407e(drawable));
        }
        Drawable drawable2 = a.mo1503h(1);
        if (drawable2 != null) {
            this.f1022a.setProgressDrawable(mo1406d(drawable2, false));
        }
        a.mo1514v();
    }

    /* renamed from: d */
    public final Drawable mo1406d(Drawable drawable, boolean clip) {
        if (drawable instanceof C0372c) {
            Drawable inner = ((C0372c) drawable).mo2291a();
            if (inner != null) {
                ((C0372c) drawable).mo2292b(mo1406d(inner, clip));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable background = (LayerDrawable) drawable;
            int N = background.getNumberOfLayers();
            Drawable[] outDrawables = new Drawable[N];
            for (int i = 0; i < N; i++) {
                int id = background.getId(i);
                outDrawables[i] = mo1406d(background.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable newBg = new LayerDrawable(outDrawables);
            for (int i2 = 0; i2 < N; i2++) {
                newBg.setId(i2, background.getId(i2));
            }
            return newBg;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap tileBitmap = bitmapDrawable.getBitmap();
            if (this.f1023b == null) {
                this.f1023b = tileBitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo1403a());
            shapeDrawable.getPaint().setShader(new BitmapShader(tileBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return clip ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    public final Drawable mo1407e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable background = (AnimationDrawable) drawable;
        int N = background.getNumberOfFrames();
        AnimationDrawable newBg = new AnimationDrawable();
        newBg.setOneShot(background.isOneShot());
        for (int i = 0; i < N; i++) {
            Drawable frame = mo1406d(background.getFrame(i), true);
            frame.setLevel(10000);
            newBg.addFrame(frame, background.getDuration(i));
        }
        newBg.setLevel(10000);
        return newBg;
    }

    /* renamed from: a */
    public final Shape mo1403a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* renamed from: b */
    public Bitmap mo1404b() {
        return this.f1023b;
    }
}
