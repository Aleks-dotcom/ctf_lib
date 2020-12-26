package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p002b.C0003a;
import p000a.p002b.C0012j;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.C0472v;
import p000a.p025h.p038m.C0476w;

/* renamed from: a.b.p.a */
public abstract class C0124a extends ViewGroup {

    /* renamed from: b */
    public final C0125a f760b;

    /* renamed from: c */
    public final Context f761c;

    /* renamed from: d */
    public ActionMenuView f762d;

    /* renamed from: e */
    public C0131c f763e;

    /* renamed from: f */
    public int f764f;

    /* renamed from: g */
    public C0472v f765g;

    /* renamed from: h */
    public boolean f766h;

    /* renamed from: i */
    public boolean f767i;

    public abstract void setContentHeight(int i);

    public C0124a(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public C0124a(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f760b = new C0125a();
        TypedValue tv = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0003a.actionBarPopupTheme, tv, true) || tv.resourceId == 0) {
            this.f761c = context;
        } else {
            this.f761c = new ContextThemeWrapper(context, tv.resourceId);
        }
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        TypedArray a = getContext().obtainStyledAttributes((AttributeSet) null, C0012j.f112a, C0003a.actionBarStyle, 0);
        setContentHeight(a.getLayoutDimension(C0012j.f157j, 0));
        a.recycle();
        C0131c cVar = this.f763e;
        if (cVar != null) {
            cVar.mo953E(newConfig);
        }
    }

    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            this.f766h = false;
        }
        if (!this.f766h) {
            boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.f766h = true;
            }
        }
        if (action == 1 || action == 3) {
            this.f766h = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 9) {
            this.f767i = false;
        }
        if (!this.f767i) {
            boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.f767i = true;
            }
        }
        if (action == 10 || action == 3) {
            this.f767i = false;
        }
        return true;
    }

    public int getContentHeight() {
        return this.f764f;
    }

    public int getAnimatedVisibility() {
        if (this.f765g != null) {
            return this.f760b.f769b;
        }
        return getVisibility();
    }

    /* renamed from: f */
    public C0472v mo901f(int visibility, long duration) {
        C0472v vVar = this.f765g;
        if (vVar != null) {
            vVar.mo2598b();
        }
        if (visibility == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0472v anim = C0460r.m2256c(this).mo2597a(1.0f);
            anim.mo2600d(duration);
            C0125a aVar = this.f760b;
            aVar.mo910d(anim, visibility);
            anim.mo2602f(aVar);
            return anim;
        }
        C0472v anim2 = C0460r.m2256c(this).mo2597a(0.0f);
        anim2.mo2600d(duration);
        C0125a aVar2 = this.f760b;
        aVar2.mo910d(anim2, visibility);
        anim2.mo2602f(aVar2);
        return anim2;
    }

    public void setVisibility(int visibility) {
        if (visibility != getVisibility()) {
            C0472v vVar = this.f765g;
            if (vVar != null) {
                vVar.mo2598b();
            }
            super.setVisibility(visibility);
        }
    }

    /* renamed from: c */
    public int mo899c(View child, int availableWidth, int childSpecHeight, int spacing) {
        child.measure(View.MeasureSpec.makeMeasureSpec(availableWidth, RecyclerView.UNDEFINED_DURATION), childSpecHeight);
        return Math.max(0, (availableWidth - child.getMeasuredWidth()) - spacing);
    }

    /* renamed from: d */
    public static int m692d(int x, int val, boolean isRtl) {
        return isRtl ? x - val : x + val;
    }

    /* renamed from: e */
    public int mo900e(View child, int x, int y, int contentHeight, boolean reverse) {
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        int childTop = ((contentHeight - childHeight) / 2) + y;
        if (reverse) {
            child.layout(x - childWidth, childTop, x, childTop + childHeight);
        } else {
            child.layout(x, childTop, x + childWidth, childTop + childHeight);
        }
        return reverse ? -childWidth : childWidth;
    }

    /* renamed from: a.b.p.a$a */
    public class C0125a implements C0476w {

        /* renamed from: a */
        public boolean f768a = false;

        /* renamed from: b */
        public int f769b;

        public C0125a() {
        }

        /* renamed from: d */
        public C0125a mo910d(C0472v animation, int visibility) {
            C0124a.this.f765g = animation;
            this.f769b = visibility;
            return this;
        }

        /* renamed from: b */
        public void mo177b(View view) {
            C0124a.super.setVisibility(0);
            this.f768a = false;
        }

        /* renamed from: a */
        public void mo176a(View view) {
            if (!this.f768a) {
                C0124a aVar = C0124a.this;
                aVar.f765g = null;
                C0124a.super.setVisibility(this.f769b);
            }
        }

        /* renamed from: c */
        public void mo909c(View view) {
            this.f768a = true;
        }
    }
}
