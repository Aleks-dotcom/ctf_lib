package p000a.p025h.p038m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: a.h.m.v */
public final class C0472v {

    /* renamed from: a */
    public WeakReference<View> f2047a;

    /* renamed from: b */
    public Runnable f2048b = null;

    /* renamed from: c */
    public Runnable f2049c = null;

    /* renamed from: d */
    public int f2050d = -1;

    public C0472v(View view) {
        this.f2047a = new WeakReference<>(view);
    }

    /* renamed from: a.h.m.v$c */
    public static class C0475c implements C0476w {

        /* renamed from: a */
        public C0472v f2055a;

        /* renamed from: b */
        public boolean f2056b;

        public C0475c(C0472v vpa) {
            this.f2055a = vpa;
        }

        /* renamed from: b */
        public void mo177b(View view) {
            this.f2056b = false;
            if (this.f2055a.f2050d > -1) {
                view.setLayerType(2, (Paint) null);
            }
            C0472v vVar = this.f2055a;
            if (vVar.f2048b != null) {
                Runnable startAction = vVar.f2048b;
                vVar.f2048b = null;
                startAction.run();
            }
            Object listenerTag = view.getTag(2113929216);
            C0476w listener = null;
            if (listenerTag instanceof C0476w) {
                listener = (C0476w) listenerTag;
            }
            if (listener != null) {
                listener.mo177b(view);
            }
        }

        /* renamed from: a */
        public void mo176a(View view) {
            int i = this.f2055a.f2050d;
            if (i > -1) {
                view.setLayerType(i, (Paint) null);
                this.f2055a.f2050d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f2056b) {
                C0472v vVar = this.f2055a;
                if (vVar.f2049c != null) {
                    Runnable endAction = vVar.f2049c;
                    vVar.f2049c = null;
                    endAction.run();
                }
                Object listenerTag = view.getTag(2113929216);
                C0476w listener = null;
                if (listenerTag instanceof C0476w) {
                    listener = (C0476w) listenerTag;
                }
                if (listener != null) {
                    listener.mo176a(view);
                }
                this.f2056b = true;
            }
        }

        /* renamed from: c */
        public void mo909c(View view) {
            Object listenerTag = view.getTag(2113929216);
            C0476w listener = null;
            if (listenerTag instanceof C0476w) {
                listener = (C0476w) listenerTag;
            }
            if (listener != null) {
                listener.mo909c(view);
            }
        }
    }

    /* renamed from: d */
    public C0472v mo2600d(long value) {
        View view = (View) this.f2047a.get();
        View view2 = view;
        if (view != null) {
            view2.animate().setDuration(value);
        }
        return this;
    }

    /* renamed from: a */
    public C0472v mo2597a(float value) {
        View view = (View) this.f2047a.get();
        View view2 = view;
        if (view != null) {
            view2.animate().alpha(value);
        }
        return this;
    }

    /* renamed from: k */
    public C0472v mo2607k(float value) {
        View view = (View) this.f2047a.get();
        View view2 = view;
        if (view != null) {
            view2.animate().translationY(value);
        }
        return this;
    }

    /* renamed from: c */
    public long mo2599c() {
        View view = (View) this.f2047a.get();
        View view2 = view;
        if (view != null) {
            return view2.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: e */
    public C0472v mo2601e(Interpolator value) {
        View view = (View) this.f2047a.get();
        View view2 = view;
        if (view != null) {
            view2.animate().setInterpolator(value);
        }
        return this;
    }

    /* renamed from: h */
    public C0472v mo2604h(long value) {
        View view = (View) this.f2047a.get();
        View view2 = view;
        if (view != null) {
            view2.animate().setStartDelay(value);
        }
        return this;
    }

    /* renamed from: b */
    public void mo2598b() {
        View view = (View) this.f2047a.get();
        View view2 = view;
        if (view != null) {
            view2.animate().cancel();
        }
    }

    /* renamed from: j */
    public void mo2606j() {
        View view = (View) this.f2047a.get();
        View view2 = view;
        if (view != null) {
            view2.animate().start();
        }
    }

    /* renamed from: f */
    public C0472v mo2602f(C0476w listener) {
        View view = (View) this.f2047a.get();
        View view2 = view;
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                mo2603g(view2, listener);
            } else {
                view2.setTag(2113929216, listener);
                mo2603g(view2, new C0475c(this));
            }
        }
        return this;
    }

    /* renamed from: a.h.m.v$a */
    public class C0473a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C0476w f2051a;

        /* renamed from: b */
        public final /* synthetic */ View f2052b;

        public C0473a(C0472v this$0, C0476w wVar, View view) {
            this.f2051a = wVar;
            this.f2052b = view;
        }

        public void onAnimationCancel(Animator animation) {
            this.f2051a.mo909c(this.f2052b);
        }

        public void onAnimationEnd(Animator animation) {
            this.f2051a.mo176a(this.f2052b);
        }

        public void onAnimationStart(Animator animation) {
            this.f2051a.mo177b(this.f2052b);
        }
    }

    /* renamed from: g */
    public final void mo2603g(View view, C0476w listener) {
        if (listener != null) {
            view.animate().setListener(new C0473a(this, listener, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: i */
    public C0472v mo2605i(C0478y listener) {
        View view = (View) this.f2047a.get();
        View view2 = view;
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            ValueAnimator.AnimatorUpdateListener wrapped = null;
            if (listener != null) {
                wrapped = new C0474b(this, listener, view2);
            }
            view2.animate().setUpdateListener(wrapped);
        }
        return this;
    }

    /* renamed from: a.h.m.v$b */
    public class C0474b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C0478y f2053a;

        /* renamed from: b */
        public final /* synthetic */ View f2054b;

        public C0474b(C0472v this$0, C0478y yVar, View view) {
            this.f2053a = yVar;
            this.f2054b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2053a.mo251a(this.f2054b);
        }
    }
}
