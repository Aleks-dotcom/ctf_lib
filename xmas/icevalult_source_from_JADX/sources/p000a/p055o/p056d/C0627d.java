package p000a.p055o.p056d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.o.d.d */
public class C0627d extends RecyclerView.C0875n implements RecyclerView.C0884s {

    /* renamed from: D */
    public static final int[] f2495D = {16842919};

    /* renamed from: E */
    public static final int[] f2496E = new int[0];

    /* renamed from: A */
    public int f2497A;

    /* renamed from: B */
    public final Runnable f2498B;

    /* renamed from: C */
    public final RecyclerView.C0885t f2499C;

    /* renamed from: a */
    public final int f2500a;

    /* renamed from: b */
    public final int f2501b;

    /* renamed from: c */
    public final StateListDrawable f2502c;

    /* renamed from: d */
    public final Drawable f2503d;

    /* renamed from: e */
    public final int f2504e;

    /* renamed from: f */
    public final int f2505f;

    /* renamed from: g */
    public final StateListDrawable f2506g;

    /* renamed from: h */
    public final Drawable f2507h;

    /* renamed from: i */
    public final int f2508i;

    /* renamed from: j */
    public final int f2509j;

    /* renamed from: k */
    public int f2510k;

    /* renamed from: l */
    public int f2511l;

    /* renamed from: m */
    public float f2512m;

    /* renamed from: n */
    public int f2513n;

    /* renamed from: o */
    public int f2514o;

    /* renamed from: p */
    public float f2515p;

    /* renamed from: q */
    public int f2516q = 0;

    /* renamed from: r */
    public int f2517r = 0;

    /* renamed from: s */
    public RecyclerView f2518s;

    /* renamed from: t */
    public boolean f2519t = false;

    /* renamed from: u */
    public boolean f2520u = false;

    /* renamed from: v */
    public int f2521v = 0;

    /* renamed from: w */
    public int f2522w = 0;

    /* renamed from: x */
    public final int[] f2523x = new int[2];

    /* renamed from: y */
    public final int[] f2524y = new int[2];

    /* renamed from: z */
    public final ValueAnimator f2525z;

    /* renamed from: a.o.d.d$a */
    public class C0628a implements Runnable {
        public C0628a() {
        }

        public void run() {
            C0627d.this.mo3280q(500);
        }
    }

    /* renamed from: a.o.d.d$b */
    public class C0629b extends RecyclerView.C0885t {
        public C0629b() {
        }

        /* renamed from: b */
        public void mo3291b(RecyclerView recyclerView, int dx, int dy) {
            C0627d.this.mo3267B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public C0627d(RecyclerView recyclerView, StateListDrawable verticalThumbDrawable, Drawable verticalTrackDrawable, StateListDrawable horizontalThumbDrawable, Drawable horizontalTrackDrawable, int defaultWidth, int scrollbarMinimumRange, int margin) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f2525z = ofFloat;
        this.f2497A = 0;
        this.f2498B = new C0628a();
        this.f2499C = new C0629b();
        this.f2502c = verticalThumbDrawable;
        this.f2503d = verticalTrackDrawable;
        this.f2506g = horizontalThumbDrawable;
        this.f2507h = horizontalTrackDrawable;
        this.f2504e = Math.max(defaultWidth, verticalThumbDrawable.getIntrinsicWidth());
        this.f2505f = Math.max(defaultWidth, verticalTrackDrawable.getIntrinsicWidth());
        this.f2508i = Math.max(defaultWidth, horizontalThumbDrawable.getIntrinsicWidth());
        this.f2509j = Math.max(defaultWidth, horizontalTrackDrawable.getIntrinsicWidth());
        this.f2500a = scrollbarMinimumRange;
        this.f2501b = margin;
        verticalThumbDrawable.setAlpha(255);
        verticalTrackDrawable.setAlpha(255);
        ofFloat.addListener(new C0630c());
        ofFloat.addUpdateListener(new C0631d());
        mo3273j(recyclerView);
    }

    /* renamed from: j */
    public void mo3273j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2518s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                mo3275l();
            }
            this.f2518s = recyclerView;
            if (recyclerView != null) {
                mo3289z();
            }
        }
    }

    /* renamed from: z */
    public final void mo3289z() {
        this.f2518s.addItemDecoration(this);
        this.f2518s.addOnItemTouchListener(this);
        this.f2518s.addOnScrollListener(this.f2499C);
    }

    /* renamed from: l */
    public final void mo3275l() {
        this.f2518s.removeItemDecoration(this);
        this.f2518s.removeOnItemTouchListener(this);
        this.f2518s.removeOnScrollListener(this.f2499C);
        mo3274k();
    }

    /* renamed from: v */
    public void mo3285v() {
        this.f2518s.invalidate();
    }

    /* renamed from: y */
    public void mo3288y(int state) {
        if (state == 2 && this.f2521v != 2) {
            this.f2502c.setState(f2495D);
            mo3274k();
        }
        if (state == 0) {
            mo3285v();
        } else {
            mo3266A();
        }
        if (this.f2521v == 2 && state != 2) {
            this.f2502c.setState(f2496E);
            mo3286w(1200);
        } else if (state == 1) {
            mo3286w(1500);
        }
        this.f2521v = state;
    }

    /* renamed from: s */
    public final boolean mo3282s() {
        return C0460r.m2292v(this.f2518s) == 1;
    }

    /* renamed from: A */
    public void mo3266A() {
        int i = this.f2497A;
        if (i != 0) {
            if (i == 3) {
                this.f2525z.cancel();
            } else {
                return;
            }
        }
        this.f2497A = 1;
        ValueAnimator valueAnimator = this.f2525z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f2525z.setDuration(500);
        this.f2525z.setStartDelay(0);
        this.f2525z.start();
    }

    /* renamed from: q */
    public void mo3280q(int duration) {
        int i = this.f2497A;
        if (i == 1) {
            this.f2525z.cancel();
        } else if (i != 2) {
            return;
        }
        this.f2497A = 3;
        ValueAnimator valueAnimator = this.f2525z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f2525z.setDuration((long) duration);
        this.f2525z.start();
    }

    /* renamed from: k */
    public final void mo3274k() {
        this.f2518s.removeCallbacks(this.f2498B);
    }

    /* renamed from: w */
    public final void mo3286w(int delay) {
        mo3274k();
        this.f2518s.postDelayed(this.f2498B, (long) delay);
    }

    /* renamed from: i */
    public void mo3272i(Canvas canvas, RecyclerView parent, RecyclerView.C0856a0 state) {
        if (this.f2516q != this.f2518s.getWidth() || this.f2517r != this.f2518s.getHeight()) {
            this.f2516q = this.f2518s.getWidth();
            this.f2517r = this.f2518s.getHeight();
            mo3288y(0);
        } else if (this.f2497A != 0) {
            if (this.f2519t) {
                mo3277n(canvas);
            }
            if (this.f2520u) {
                mo3276m(canvas);
            }
        }
    }

    /* renamed from: n */
    public final void mo3277n(Canvas canvas) {
        int viewWidth = this.f2516q;
        int i = this.f2504e;
        int left = viewWidth - i;
        int i2 = this.f2511l;
        int i3 = this.f2510k;
        int top = i2 - (i3 / 2);
        this.f2502c.setBounds(0, 0, i, i3);
        this.f2503d.setBounds(0, 0, this.f2505f, this.f2517r);
        if (mo3282s()) {
            this.f2503d.draw(canvas);
            canvas.translate((float) this.f2504e, (float) top);
            canvas.scale(-1.0f, 1.0f);
            this.f2502c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f2504e), (float) (-top));
            return;
        }
        canvas.translate((float) left, 0.0f);
        this.f2503d.draw(canvas);
        canvas.translate(0.0f, (float) top);
        this.f2502c.draw(canvas);
        canvas.translate((float) (-left), (float) (-top));
    }

    /* renamed from: m */
    public final void mo3276m(Canvas canvas) {
        int viewHeight = this.f2517r;
        int i = this.f2508i;
        int top = viewHeight - i;
        int i2 = this.f2514o;
        int i3 = this.f2513n;
        int left = i2 - (i3 / 2);
        this.f2506g.setBounds(0, 0, i3, i);
        this.f2507h.setBounds(0, 0, this.f2516q, this.f2509j);
        canvas.translate(0.0f, (float) top);
        this.f2507h.draw(canvas);
        canvas.translate((float) left, 0.0f);
        this.f2506g.draw(canvas);
        canvas.translate((float) (-left), (float) (-top));
    }

    /* renamed from: B */
    public void mo3267B(int offsetX, int offsetY) {
        int verticalContentLength = this.f2518s.computeVerticalScrollRange();
        int verticalVisibleLength = this.f2517r;
        this.f2519t = verticalContentLength - verticalVisibleLength > 0 && this.f2517r >= this.f2500a;
        int horizontalContentLength = this.f2518s.computeHorizontalScrollRange();
        int horizontalVisibleLength = this.f2516q;
        boolean z = horizontalContentLength - horizontalVisibleLength > 0 && this.f2516q >= this.f2500a;
        this.f2520u = z;
        boolean z2 = this.f2519t;
        if (z2 || z) {
            if (z2) {
                this.f2511l = (int) ((((float) verticalVisibleLength) * (((float) offsetY) + (((float) verticalVisibleLength) / 2.0f))) / ((float) verticalContentLength));
                this.f2510k = Math.min(verticalVisibleLength, (verticalVisibleLength * verticalVisibleLength) / verticalContentLength);
            }
            if (this.f2520u) {
                this.f2514o = (int) ((((float) horizontalVisibleLength) * (((float) offsetX) + (((float) horizontalVisibleLength) / 2.0f))) / ((float) horizontalContentLength));
                this.f2513n = Math.min(horizontalVisibleLength, (horizontalVisibleLength * horizontalVisibleLength) / horizontalContentLength);
            }
            int i = this.f2521v;
            if (i == 0 || i == 1) {
                mo3288y(1);
            }
        } else if (this.f2521v != 0) {
            mo3288y(0);
        }
    }

    /* renamed from: b */
    public boolean mo3270b(RecyclerView recyclerView, MotionEvent ev) {
        int i = this.f2521v;
        if (i == 1) {
            boolean insideVerticalThumb = mo3284u(ev.getX(), ev.getY());
            boolean insideHorizontalThumb = mo3283t(ev.getX(), ev.getY());
            if (ev.getAction() != 0 || (!insideVerticalThumb && !insideHorizontalThumb)) {
                return false;
            }
            if (insideHorizontalThumb) {
                this.f2522w = 1;
                this.f2515p = (float) ((int) ev.getX());
            } else if (insideVerticalThumb) {
                this.f2522w = 2;
                this.f2512m = (float) ((int) ev.getY());
            }
            mo3288y(2);
            return true;
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public void mo3271c(RecyclerView recyclerView, MotionEvent me) {
        if (this.f2521v != 0) {
            if (me.getAction() == 0) {
                boolean insideVerticalThumb = mo3284u(me.getX(), me.getY());
                boolean insideHorizontalThumb = mo3283t(me.getX(), me.getY());
                if (insideVerticalThumb || insideHorizontalThumb) {
                    if (insideHorizontalThumb) {
                        this.f2522w = 1;
                        this.f2515p = (float) ((int) me.getX());
                    } else if (insideVerticalThumb) {
                        this.f2522w = 2;
                        this.f2512m = (float) ((int) me.getY());
                    }
                    mo3288y(2);
                }
            } else if (me.getAction() == 1 && this.f2521v == 2) {
                this.f2512m = 0.0f;
                this.f2515p = 0.0f;
                mo3288y(1);
                this.f2522w = 0;
            } else if (me.getAction() == 2 && this.f2521v == 2) {
                mo3266A();
                if (this.f2522w == 1) {
                    mo3281r(me.getX());
                }
                if (this.f2522w == 2) {
                    mo3268C(me.getY());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3269a(boolean disallowIntercept) {
    }

    /* renamed from: C */
    public final void mo3268C(float y) {
        int[] scrollbarRange = mo3279p();
        float y2 = Math.max((float) scrollbarRange[0], Math.min((float) scrollbarRange[1], y));
        if (Math.abs(((float) this.f2511l) - y2) >= 2.0f) {
            int scrollingBy = mo3287x(this.f2512m, y2, scrollbarRange, this.f2518s.computeVerticalScrollRange(), this.f2518s.computeVerticalScrollOffset(), this.f2517r);
            if (scrollingBy != 0) {
                this.f2518s.scrollBy(0, scrollingBy);
            }
            this.f2512m = y2;
        }
    }

    /* renamed from: r */
    public final void mo3281r(float x) {
        int[] scrollbarRange = mo3278o();
        float x2 = Math.max((float) scrollbarRange[0], Math.min((float) scrollbarRange[1], x));
        if (Math.abs(((float) this.f2514o) - x2) >= 2.0f) {
            int scrollingBy = mo3287x(this.f2515p, x2, scrollbarRange, this.f2518s.computeHorizontalScrollRange(), this.f2518s.computeHorizontalScrollOffset(), this.f2516q);
            if (scrollingBy != 0) {
                this.f2518s.scrollBy(scrollingBy, 0);
            }
            this.f2515p = x2;
        }
    }

    /* renamed from: x */
    public final int mo3287x(float oldDragPos, float newDragPos, int[] scrollbarRange, int scrollRange, int scrollOffset, int viewLength) {
        int scrollbarLength = scrollbarRange[1] - scrollbarRange[0];
        if (scrollbarLength == 0) {
            return 0;
        }
        int totalPossibleOffset = scrollRange - viewLength;
        int scrollingBy = (int) (((float) totalPossibleOffset) * ((newDragPos - oldDragPos) / ((float) scrollbarLength)));
        int absoluteOffset = scrollOffset + scrollingBy;
        if (absoluteOffset >= totalPossibleOffset || absoluteOffset < 0) {
            return 0;
        }
        return scrollingBy;
    }

    /* renamed from: u */
    public boolean mo3284u(float x, float y) {
        if (!mo3282s() ? x >= ((float) (this.f2516q - this.f2504e)) : x <= ((float) (this.f2504e / 2))) {
            int i = this.f2511l;
            int i2 = this.f2510k;
            return y >= ((float) (i - (i2 / 2))) && y <= ((float) (i + (i2 / 2)));
        }
    }

    /* renamed from: t */
    public boolean mo3283t(float x, float y) {
        if (y >= ((float) (this.f2517r - this.f2508i))) {
            int i = this.f2514o;
            int i2 = this.f2513n;
            return x >= ((float) (i - (i2 / 2))) && x <= ((float) (i + (i2 / 2)));
        }
    }

    /* renamed from: p */
    public final int[] mo3279p() {
        int[] iArr = this.f2523x;
        int i = this.f2501b;
        iArr[0] = i;
        iArr[1] = this.f2517r - i;
        return iArr;
    }

    /* renamed from: o */
    public final int[] mo3278o() {
        int[] iArr = this.f2524y;
        int i = this.f2501b;
        iArr[0] = i;
        iArr[1] = this.f2516q - i;
        return iArr;
    }

    /* renamed from: a.o.d.d$c */
    public class C0630c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f2528a = false;

        public C0630c() {
        }

        public void onAnimationEnd(Animator animation) {
            if (this.f2528a) {
                this.f2528a = false;
            } else if (((Float) C0627d.this.f2525z.getAnimatedValue()).floatValue() == 0.0f) {
                C0627d dVar = C0627d.this;
                dVar.f2497A = 0;
                dVar.mo3288y(0);
            } else {
                C0627d dVar2 = C0627d.this;
                dVar2.f2497A = 2;
                dVar2.mo3285v();
            }
        }

        public void onAnimationCancel(Animator animation) {
            this.f2528a = true;
        }
    }

    /* renamed from: a.o.d.d$d */
    public class C0631d implements ValueAnimator.AnimatorUpdateListener {
        public C0631d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int alpha = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0627d.this.f2502c.setAlpha(alpha);
            C0627d.this.f2503d.setAlpha(alpha);
            C0627d.this.mo3285v();
        }
    }
}
