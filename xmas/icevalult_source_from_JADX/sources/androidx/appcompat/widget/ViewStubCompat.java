package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p000a.p002b.C0012j;

public final class ViewStubCompat extends View {

    /* renamed from: b */
    public int f3251b;

    /* renamed from: c */
    public int f3252c;

    /* renamed from: d */
    public WeakReference<View> f3253d;

    /* renamed from: e */
    public LayoutInflater f3254e;

    /* renamed from: f */
    public C0819a f3255f;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0819a {
        /* renamed from: a */
        void mo4299a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f3251b = 0;
        TypedArray a = context.obtainStyledAttributes(attrs, C0012j.f206s3, defStyle, 0);
        this.f3252c = a.getResourceId(C0012j.f221v3, -1);
        this.f3251b = a.getResourceId(C0012j.f216u3, 0);
        setId(a.getResourceId(C0012j.f211t3, -1));
        a.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f3252c;
    }

    public void setInflatedId(int inflatedId) {
        this.f3252c = inflatedId;
    }

    public int getLayoutResource() {
        return this.f3251b;
    }

    public void setLayoutResource(int layoutResource) {
        this.f3251b = layoutResource;
    }

    public void setLayoutInflater(LayoutInflater inflater) {
        this.f3254e = inflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f3254e;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public void dispatchDraw(Canvas canvas) {
    }

    public void setVisibility(int visibility) {
        WeakReference<View> weakReference = this.f3253d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(visibility);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(visibility);
        if (visibility == 0 || visibility == 4) {
            mo4287a();
        }
    }

    /* renamed from: a */
    public View mo4287a() {
        LayoutInflater factory;
        ViewParent viewParent = getParent();
        if (!(viewParent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f3251b != 0) {
            ViewGroup parent = (ViewGroup) viewParent;
            if (this.f3254e != null) {
                factory = this.f3254e;
            } else {
                factory = LayoutInflater.from(getContext());
            }
            View view = factory.inflate(this.f3251b, parent, false);
            int i = this.f3252c;
            if (i != -1) {
                view.setId(i);
            }
            int index = parent.indexOfChild(this);
            parent.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                parent.addView(view, index, layoutParams);
            } else {
                parent.addView(view, index);
            }
            this.f3253d = new WeakReference<>(view);
            C0819a aVar = this.f3255f;
            if (aVar != null) {
                aVar.mo4299a(this, view);
            }
            return view;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void setOnInflateListener(C0819a inflateListener) {
        this.f3255f = inflateListener;
    }
}
