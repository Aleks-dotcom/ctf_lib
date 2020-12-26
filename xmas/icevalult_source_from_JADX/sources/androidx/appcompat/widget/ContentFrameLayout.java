package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p000a.p025h.p038m.C0460r;

public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    public TypedValue f3115b;

    /* renamed from: c */
    public TypedValue f3116c;

    /* renamed from: d */
    public TypedValue f3117d;

    /* renamed from: e */
    public TypedValue f3118e;

    /* renamed from: f */
    public TypedValue f3119f;

    /* renamed from: g */
    public TypedValue f3120g;

    /* renamed from: h */
    public final Rect f3121h;

    /* renamed from: i */
    public C0792a f3122i;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface C0792a {
        /* renamed from: a */
        void mo173a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ContentFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f3121h = new Rect();
    }

    /* renamed from: a */
    public void mo4041a(Rect insets) {
        fitSystemWindows(insets);
    }

    public void setAttachListener(C0792a attachListener) {
        this.f3122i = attachListener;
    }

    /* renamed from: b */
    public void mo4042b(int left, int top, int right, int bottom) {
        this.f3121h.set(left, top, right, bottom);
        if (C0460r.m2235J(this)) {
            requestLayout();
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int i2;
        int i3;
        DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();
        boolean isPortrait = metrics.widthPixels < metrics.heightPixels;
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        boolean fixedWidth = false;
        if (widthMode == Integer.MIN_VALUE) {
            TypedValue tvw = isPortrait ? this.f3118e : this.f3117d;
            if (!(tvw == null || (i3 = tvw.type) == 0)) {
                int w = 0;
                if (i3 == 5) {
                    w = (int) tvw.getDimension(metrics);
                } else if (i3 == 6) {
                    int i4 = metrics.widthPixels;
                    w = (int) tvw.getFraction((float) i4, (float) i4);
                }
                if (w > 0) {
                    Rect rect = this.f3121h;
                    widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(w - (rect.left + rect.right), View.MeasureSpec.getSize(widthMeasureSpec)), 1073741824);
                    fixedWidth = true;
                }
            }
        }
        if (heightMode == Integer.MIN_VALUE) {
            TypedValue tvh = isPortrait ? this.f3119f : this.f3120g;
            if (!(tvh == null || (i2 = tvh.type) == 0)) {
                int h = 0;
                if (i2 == 5) {
                    h = (int) tvh.getDimension(metrics);
                } else if (i2 == 6) {
                    int i5 = metrics.heightPixels;
                    h = (int) tvh.getFraction((float) i5, (float) i5);
                }
                if (h > 0) {
                    Rect rect2 = this.f3121h;
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(h - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(heightMeasureSpec)), 1073741824);
                }
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMeasuredWidth();
        boolean measure = false;
        int widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        if (!fixedWidth && widthMode == Integer.MIN_VALUE) {
            TypedValue tv = isPortrait ? this.f3116c : this.f3115b;
            if (!(tv == null || (i = tv.type) == 0)) {
                int min = 0;
                if (i == 5) {
                    min = (int) tv.getDimension(metrics);
                } else if (i == 6) {
                    int i6 = metrics.widthPixels;
                    min = (int) tv.getFraction((float) i6, (float) i6);
                }
                if (min > 0) {
                    Rect rect3 = this.f3121h;
                    min -= rect3.left + rect3.right;
                }
                if (width < min) {
                    widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
                    measure = true;
                }
            }
        }
        if (measure) {
            super.onMeasure(widthMeasureSpec2, heightMeasureSpec);
        }
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3115b == null) {
            this.f3115b = new TypedValue();
        }
        return this.f3115b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3116c == null) {
            this.f3116c = new TypedValue();
        }
        return this.f3116c;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3117d == null) {
            this.f3117d = new TypedValue();
        }
        return this.f3117d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3118e == null) {
            this.f3118e = new TypedValue();
        }
        return this.f3118e;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3119f == null) {
            this.f3119f = new TypedValue();
        }
        return this.f3119f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3120g == null) {
            this.f3120g = new TypedValue();
        }
        return this.f3120g;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0792a aVar = this.f3122i;
        if (aVar != null) {
            aVar.mo173a();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0792a aVar = this.f3122i;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }
}
