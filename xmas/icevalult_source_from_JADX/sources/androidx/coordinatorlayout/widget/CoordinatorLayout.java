package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000a.p023g.C0318a;
import p000a.p023g.C0319b;
import p000a.p023g.C0320c;
import p000a.p023g.p024d.C0321a;
import p000a.p023g.p024d.C0322b;
import p000a.p025h.p027e.C0339a;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p037l.C0414c;
import p000a.p025h.p037l.C0416e;
import p000a.p025h.p037l.C0418g;
import p000a.p025h.p038m.C0444c;
import p000a.p025h.p038m.C0453k;
import p000a.p025h.p038m.C0454l;
import p000a.p025h.p038m.C0456n;
import p000a.p025h.p038m.C0457o;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.C0479z;
import p000a.p043j.p044a.C0501a;

public class CoordinatorLayout extends ViewGroup implements C0453k, C0454l {

    /* renamed from: v */
    public static final String f3337v;

    /* renamed from: w */
    public static final Class<?>[] f3338w = {Context.class, AttributeSet.class};

    /* renamed from: x */
    public static final ThreadLocal<Map<String, Constructor<C0824c>>> f3339x = new ThreadLocal<>();

    /* renamed from: y */
    public static final Comparator<View> f3340y;

    /* renamed from: z */
    public static final C0416e<Rect> f3341z = new C0418g(12);

    /* renamed from: b */
    public final List<View> f3342b;

    /* renamed from: c */
    public final C0321a<View> f3343c;

    /* renamed from: d */
    public final List<View> f3344d;

    /* renamed from: e */
    public final List<View> f3345e;

    /* renamed from: f */
    public Paint f3346f;

    /* renamed from: g */
    public final int[] f3347g;

    /* renamed from: h */
    public final int[] f3348h;

    /* renamed from: i */
    public boolean f3349i;

    /* renamed from: j */
    public boolean f3350j;

    /* renamed from: k */
    public int[] f3351k;

    /* renamed from: l */
    public View f3352l;

    /* renamed from: m */
    public View f3353m;

    /* renamed from: n */
    public C0828g f3354n;

    /* renamed from: o */
    public boolean f3355o;

    /* renamed from: p */
    public C0479z f3356p;

    /* renamed from: q */
    public boolean f3357q;

    /* renamed from: r */
    public Drawable f3358r;

    /* renamed from: s */
    public ViewGroup.OnHierarchyChangeListener f3359s;

    /* renamed from: t */
    public C0457o f3360t;

    /* renamed from: u */
    public final C0456n f3361u;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0823b {
        C0824c getBehavior();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0825d {
        Class<? extends C0824c> value();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r2 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            f3337v = r2
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f3340y = r0
            goto L_0x0021
        L_0x001f:
            f3340y = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f3338w = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f3339x = r0
            a.h.l.g r0 = new a.h.l.g
            r1 = 12
            r0.<init>(r1)
            f3341z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    /* renamed from: a */
    public static Rect m3979a() {
        Rect rect = f3341z.mo2417b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* renamed from: O */
    public static void m3975O(Rect rect) {
        rect.setEmpty();
        f3341z.mo2416a(rect);
    }

    public CoordinatorLayout(Context context, AttributeSet attrs) {
        this(context, attrs, C0318a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a;
        this.f3342b = new ArrayList();
        this.f3343c = new C0321a<>();
        this.f3344d = new ArrayList();
        this.f3345e = new ArrayList();
        this.f3347g = new int[2];
        this.f3348h = new int[2];
        this.f3361u = new C0456n(this);
        if (defStyleAttr == 0) {
            a = context.obtainStyledAttributes(attrs, C0320c.f1757a, 0, C0319b.Widget_Support_CoordinatorLayout);
        } else {
            a = context.obtainStyledAttributes(attrs, C0320c.f1757a, defStyleAttr, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (defStyleAttr == 0) {
                saveAttributeDataForStyleable(context, C0320c.f1757a, attrs, a, 0, C0319b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, C0320c.f1757a, attrs, a, defStyleAttr, 0);
            }
        }
        int keylineArrayRes = a.getResourceId(C0320c.f1758b, 0);
        if (keylineArrayRes != 0) {
            Resources res = context.getResources();
            this.f3351k = res.getIntArray(keylineArrayRes);
            float density = res.getDisplayMetrics().density;
            int count = this.f3351k.length;
            for (int i = 0; i < count; i++) {
                int[] iArr = this.f3351k;
                iArr[i] = (int) (((float) iArr[i]) * density);
            }
        }
        this.f3358r = a.getDrawable(C0320c.f1759c);
        a.recycle();
        mo4360X();
        super.setOnHierarchyChangeListener(new C0826e());
        if (C0460r.m2290t(this) == 0) {
            C0460r.m2275l0(this, 1);
        }
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3359s = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo4356Q(false);
        if (this.f3355o) {
            if (this.f3354n == null) {
                this.f3354n = new C0828g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3354n);
        }
        if (this.f3356p == null && C0460r.m2288s(this)) {
            C0460r.m2253a0(this);
        }
        this.f3350j = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo4356Q(false);
        if (this.f3355o && this.f3354n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3354n);
        }
        View view = this.f3353m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3350j = false;
    }

    public void setStatusBarBackground(Drawable bg) {
        Drawable drawable = this.f3358r;
        if (drawable != bg) {
            Drawable drawable2 = null;
            if (drawable != null) {
                drawable.setCallback((Drawable.Callback) null);
            }
            if (bg != null) {
                drawable2 = bg.mutate();
            }
            this.f3358r = drawable2;
            if (drawable2 != null) {
                if (drawable2.isStateful()) {
                    this.f3358r.setState(getDrawableState());
                }
                C0370a.m1943m(this.f3358r, C0460r.m2292v(this));
                this.f3358r.setVisible(getVisibility() == 0, false);
                this.f3358r.setCallback(this);
            }
            C0460r.m2246U(this);
        }
    }

    public Drawable getStatusBarBackground() {
        return this.f3358r;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] state = getDrawableState();
        boolean changed = false;
        Drawable d = this.f3358r;
        if (d != null && d.isStateful()) {
            changed = false | d.setState(state);
        }
        if (changed) {
            invalidate();
        }
    }

    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.f3358r;
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        boolean visible = visibility == 0;
        Drawable drawable = this.f3358r;
        if (drawable != null && drawable.isVisible() != visible) {
            this.f3358r.setVisible(visible, false);
        }
    }

    public void setStatusBarBackgroundResource(int resId) {
        setStatusBarBackground(resId != 0 ? C0339a.m1777c(getContext(), resId) : null);
    }

    public void setStatusBarBackgroundColor(int color) {
        setStatusBarBackground(new ColorDrawable(color));
    }

    /* renamed from: W */
    public final C0479z mo4359W(C0479z insets) {
        if (C0414c.m2049a(this.f3356p, insets)) {
            return insets;
        }
        this.f3356p = insets;
        boolean z = true;
        boolean z2 = insets != null && insets.mo2615d() > 0;
        this.f3357q = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0479z insets2 = mo4366e(insets);
        requestLayout();
        return insets2;
    }

    public final C0479z getLastWindowInsets() {
        return this.f3356p;
    }

    /* renamed from: Q */
    public final void mo4356Q(boolean notifyOnInterceptTouchEvent) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            C0824c b = ((C0827f) child.getLayoutParams()).mo4448f();
            if (b != null) {
                long now = SystemClock.uptimeMillis();
                MotionEvent cancelEvent = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                if (notifyOnInterceptTouchEvent) {
                    b.mo4424k(this, child, cancelEvent);
                } else {
                    b.mo4413D(this, child, cancelEvent);
                }
                cancelEvent.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0827f) getChildAt(i2).getLayoutParams()).mo4455m();
        }
        this.f3352l = null;
        this.f3349i = false;
    }

    /* renamed from: z */
    public final void mo4408z(List<View> out) {
        out.clear();
        boolean useCustomOrder = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            out.add(getChildAt(useCustomOrder ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f3340y;
        if (comparator != null) {
            Collections.sort(out, comparator);
        }
    }

    /* renamed from: L */
    public final boolean mo4352L(MotionEvent ev, int type) {
        MotionEvent motionEvent = ev;
        int i = type;
        boolean intercepted = false;
        boolean newBlock = false;
        MotionEvent cancelEvent = null;
        int action = ev.getActionMasked();
        List<View> topmostChildList = this.f3344d;
        mo4408z(topmostChildList);
        int childCount = topmostChildList.size();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = topmostChildList.get(i2);
            C0827f lp = (C0827f) child.getLayoutParams();
            C0824c b = lp.mo4448f();
            boolean z = true;
            if ((!intercepted && !newBlock) || action == 0) {
                if (!intercepted && b != null) {
                    if (i == 0) {
                        intercepted = b.mo4424k(this, child, motionEvent);
                    } else if (i == 1) {
                        intercepted = b.mo4413D(this, child, motionEvent);
                    }
                    if (intercepted) {
                        this.f3352l = child;
                    }
                }
                boolean wasBlocking = lp.mo4445c();
                boolean isBlocking = lp.mo4451i(this, child);
                if (!isBlocking || wasBlocking) {
                    z = false;
                }
                newBlock = z;
                if (isBlocking && !newBlock) {
                    break;
                }
            } else if (b != null) {
                if (cancelEvent == null) {
                    long now = SystemClock.uptimeMillis();
                    cancelEvent = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    b.mo4424k(this, child, cancelEvent);
                } else if (i == 1) {
                    b.mo4413D(this, child, cancelEvent);
                }
            }
        }
        topmostChildList.clear();
        return intercepted;
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            mo4356Q(true);
        }
        boolean intercepted = mo4352L(ev, 0);
        if (action == 1 || action == 3) {
            mo4356Q(true);
        }
        return intercepted;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r6 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 0
            r3 = 0
            r4 = 0
            int r5 = r19.getActionMasked()
            android.view.View r6 = r0.f3352l
            r7 = 1
            if (r6 != 0) goto L_0x0017
            boolean r6 = r0.mo4352L(r1, r7)
            r3 = r6
            if (r6 == 0) goto L_0x002b
        L_0x0017:
            android.view.View r6 = r0.f3352l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0827f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r8 = r6.mo4448f()
            if (r8 == 0) goto L_0x002b
            android.view.View r9 = r0.f3352l
            boolean r2 = r8.mo4413D(r0, r9, r1)
        L_0x002b:
            android.view.View r6 = r0.f3352l
            if (r6 != 0) goto L_0x0035
            boolean r6 = super.onTouchEvent(r19)
            r2 = r2 | r6
            goto L_0x004c
        L_0x0035:
            if (r3 == 0) goto L_0x004c
            if (r4 != 0) goto L_0x0049
            long r16 = android.os.SystemClock.uptimeMillis()
            r12 = 3
            r13 = 0
            r14 = 0
            r15 = 0
            r8 = r16
            r10 = r16
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r8, r10, r12, r13, r14, r15)
        L_0x0049:
            super.onTouchEvent(r4)
        L_0x004c:
            if (r4 == 0) goto L_0x0051
            r4.recycle()
        L_0x0051:
            if (r5 == r7) goto L_0x0056
            r6 = 3
            if (r5 != r6) goto L_0x005a
        L_0x0056:
            r6 = 0
            r0.mo4356Q(r6)
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
        if (disallowIntercept && !this.f3349i) {
            mo4356Q(false);
            this.f3349i = true;
        }
    }

    /* renamed from: w */
    public final int mo4405w(int index) {
        int[] iArr = this.f3351k;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + index);
            return 0;
        } else if (index >= 0 && index < iArr.length) {
            return iArr[index];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + index + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: K */
    public static C0824c m3974K(Context context, AttributeSet attrs, String name) {
        String fullName;
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        if (name.startsWith(".")) {
            fullName = context.getPackageName() + name;
        } else if (name.indexOf(46) >= 0) {
            fullName = name;
        } else {
            String str = f3337v;
            if (!TextUtils.isEmpty(str)) {
                fullName = str + '.' + name;
            } else {
                fullName = name;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<C0824c>>> threadLocal = f3339x;
            Map<String, Constructor<Behavior>> constructors = threadLocal.get();
            if (constructors == null) {
                constructors = new HashMap<>();
                threadLocal.set(constructors);
            }
            Constructor<?> constructor = constructors.get(fullName);
            if (constructor == null) {
                constructor = Class.forName(fullName, false, context.getClassLoader()).getConstructor(f3338w);
                constructor.setAccessible(true);
                constructors.put(fullName, constructor);
            }
            return (C0824c) constructor.newInstance(new Object[]{context, attrs});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + fullName, e);
        }
    }

    /* renamed from: y */
    public C0827f mo4407y(View child) {
        C0827f result = (C0827f) child.getLayoutParams();
        if (!result.f3365b) {
            if (child instanceof C0823b) {
                C0824c attachedBehavior = ((C0823b) child).getBehavior();
                if (attachedBehavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                result.mo4457o(attachedBehavior);
                result.f3365b = true;
            } else {
                C0825d defaultBehavior = null;
                for (Class cls = child.getClass(); cls != null; cls = cls.getSuperclass()) {
                    C0825d dVar = (C0825d) cls.getAnnotation(C0825d.class);
                    defaultBehavior = dVar;
                    if (dVar != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        result.mo4457o((C0824c) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                result.f3365b = true;
            }
        }
        return result;
    }

    /* renamed from: M */
    public final void mo4353M() {
        this.f3342b.clear();
        this.f3343c.mo2208c();
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View view = getChildAt(i);
            C0827f lp = mo4407y(view);
            lp.mo4446d(this, view);
            this.f3343c.mo2207b(view);
            for (int j = 0; j < count; j++) {
                if (j != i) {
                    View other = getChildAt(j);
                    if (lp.mo4444b(this, view, other)) {
                        if (!this.f3343c.mo2209d(other)) {
                            this.f3343c.mo2207b(other);
                        }
                        this.f3343c.mo2206a(other, view);
                    }
                }
            }
        }
        this.f3342b.addAll(this.f3343c.mo2214i());
        Collections.reverse(this.f3342b);
    }

    /* renamed from: t */
    public void mo4401t(View descendant, Rect out) {
        C0322b.m1740a(this, descendant, out);
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: J */
    public void mo4351J(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        measureChildWithMargins(child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0139, code lost:
        if (r29.mo4426m(r35, r21, r26, r23, r28, 0) == false) goto L_0x014a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r36, int r37) {
        /*
            r35 = this;
            r7 = r35
            r35.mo4353M()
            r35.mo4368g()
            int r8 = r35.getPaddingLeft()
            int r9 = r35.getPaddingTop()
            int r10 = r35.getPaddingRight()
            int r11 = r35.getPaddingBottom()
            int r12 = p000a.p025h.p038m.C0460r.m2292v(r35)
            r0 = 1
            if (r12 != r0) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            r14 = r1
            int r15 = android.view.View.MeasureSpec.getMode(r36)
            int r16 = android.view.View.MeasureSpec.getSize(r36)
            int r6 = android.view.View.MeasureSpec.getMode(r37)
            int r17 = android.view.View.MeasureSpec.getSize(r37)
            int r18 = r8 + r10
            int r19 = r9 + r11
            int r1 = r35.getSuggestedMinimumWidth()
            int r2 = r35.getSuggestedMinimumHeight()
            r3 = 0
            a.h.m.z r4 = r7.f3356p
            if (r4 == 0) goto L_0x004b
            boolean r4 = p000a.p025h.p038m.C0460r.m2288s(r35)
            if (r4 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            r20 = r0
            java.util.List<android.view.View> r0 = r7.f3342b
            int r5 = r0.size()
            r0 = 0
            r4 = r0
            r34 = r3
            r3 = r1
            r1 = r34
        L_0x005b:
            if (r4 >= r5) goto L_0x0194
            java.util.List<android.view.View> r0 = r7.f3342b
            java.lang.Object r0 = r0.get(r4)
            r21 = r0
            android.view.View r21 = (android.view.View) r21
            int r0 = r21.getVisibility()
            r13 = 8
            if (r0 != r13) goto L_0x0079
            r24 = r4
            r25 = r5
            r27 = r6
            r22 = 0
            goto L_0x018c
        L_0x0079:
            android.view.ViewGroup$LayoutParams r0 = r21.getLayoutParams()
            r13 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r13 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0827f) r13
            r0 = 0
            r23 = r0
            int r0 = r13.f3368e
            if (r0 < 0) goto L_0x00cb
            if (r15 == 0) goto L_0x00cb
            int r0 = r7.mo4405w(r0)
            r24 = r1
            int r1 = r13.f3366c
            int r1 = m3978T(r1)
            int r1 = p000a.p025h.p038m.C0444c.m2174b(r1, r12)
            r1 = r1 & 7
            r25 = r2
            r2 = 3
            if (r1 != r2) goto L_0x00a2
            if (r14 == 0) goto L_0x00a7
        L_0x00a2:
            r2 = 5
            if (r1 != r2) goto L_0x00b4
            if (r14 == 0) goto L_0x00b4
        L_0x00a7:
            int r2 = r16 - r10
            int r2 = r2 - r0
            r27 = r3
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            r23 = r2
            goto L_0x00d2
        L_0x00b4:
            r27 = r3
            if (r1 != r2) goto L_0x00ba
            if (r14 == 0) goto L_0x00bf
        L_0x00ba:
            r2 = 3
            if (r1 != r2) goto L_0x00c9
            if (r14 == 0) goto L_0x00c9
        L_0x00bf:
            int r2 = r0 - r8
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            r23 = r2
            goto L_0x00d2
        L_0x00c9:
            r3 = 0
            goto L_0x00d2
        L_0x00cb:
            r24 = r1
            r25 = r2
            r27 = r3
            r3 = 0
        L_0x00d2:
            r0 = r36
            r1 = r37
            if (r20 == 0) goto L_0x010b
            boolean r2 = p000a.p025h.p038m.C0460r.m2288s(r21)
            if (r2 != 0) goto L_0x010b
            a.h.m.z r2 = r7.f3356p
            int r2 = r2.mo2613b()
            a.h.m.z r3 = r7.f3356p
            int r3 = r3.mo2614c()
            int r2 = r2 + r3
            a.h.m.z r3 = r7.f3356p
            int r3 = r3.mo2615d()
            r26 = r0
            a.h.m.z r0 = r7.f3356p
            int r0 = r0.mo2612a()
            int r3 = r3 + r0
            int r0 = r16 - r2
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r15)
            r26 = r0
            int r0 = r17 - r3
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            r28 = r1
            goto L_0x010f
        L_0x010b:
            r26 = r0
            r28 = r1
        L_0x010f:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r29 = r13.mo4448f()
            if (r29 == 0) goto L_0x013c
            r30 = 0
            r0 = r29
            r3 = r24
            r1 = r35
            r31 = r25
            r2 = r21
            r33 = r3
            r32 = r27
            r22 = 0
            r3 = r26
            r24 = r4
            r4 = r23
            r25 = r5
            r5 = r28
            r27 = r6
            r6 = r30
            boolean r0 = r0.mo4426m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0158
            goto L_0x014a
        L_0x013c:
            r33 = r24
            r31 = r25
            r32 = r27
            r22 = 0
            r24 = r4
            r25 = r5
            r27 = r6
        L_0x014a:
            r5 = 0
            r0 = r35
            r1 = r21
            r2 = r26
            r3 = r23
            r4 = r28
            r0.mo4351J(r1, r2, r3, r4, r5)
        L_0x0158:
            int r0 = r21.getMeasuredWidth()
            int r0 = r18 + r0
            int r1 = r13.leftMargin
            int r0 = r0 + r1
            int r1 = r13.rightMargin
            int r0 = r0 + r1
            r1 = r32
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = r21.getMeasuredHeight()
            int r1 = r19 + r1
            int r2 = r13.topMargin
            int r1 = r1 + r2
            int r2 = r13.bottomMargin
            int r1 = r1 + r2
            r2 = r31
            int r1 = java.lang.Math.max(r2, r1)
            int r2 = r21.getMeasuredState()
            r3 = r33
            int r2 = android.view.View.combineMeasuredStates(r3, r2)
            r3 = r0
            r34 = r2
            r2 = r1
            r1 = r34
        L_0x018c:
            int r4 = r24 + 1
            r5 = r25
            r6 = r27
            goto L_0x005b
        L_0x0194:
            r24 = r4
            r25 = r5
            r27 = r6
            r34 = r3
            r3 = r1
            r1 = r34
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r3
            r4 = r36
            int r0 = android.view.View.resolveSizeAndState(r1, r4, r0)
            int r5 = r3 << 16
            r6 = r37
            int r5 = android.view.View.resolveSizeAndState(r2, r6, r5)
            r7.setMeasuredDimension(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* renamed from: e */
    public final C0479z mo4366e(C0479z insets) {
        C0824c b;
        if (insets.mo2616e()) {
            return insets;
        }
        int z = getChildCount();
        for (int i = 0; i < z; i++) {
            View child = getChildAt(i);
            if (C0460r.m2288s(child) && (b = ((C0827f) child.getLayoutParams()).mo4448f()) != null) {
                insets = b.mo4419f(this, child, insets);
                if (insets.mo2616e()) {
                    break;
                }
            }
        }
        return insets;
    }

    /* renamed from: I */
    public void mo4350I(View child, int layoutDirection) {
        C0827f lp = (C0827f) child.getLayoutParams();
        if (!lp.mo4443a()) {
            View view = lp.f3374k;
            if (view != null) {
                mo4345D(child, view, layoutDirection);
                return;
            }
            int i = lp.f3368e;
            if (i >= 0) {
                mo4346E(child, i, layoutDirection);
            } else {
                mo4344C(child, layoutDirection);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        C0824c behavior;
        int layoutDirection = C0460r.m2292v(this);
        int childCount = this.f3342b.size();
        for (int i = 0; i < childCount; i++) {
            View child = this.f3342b.get(i);
            if (child.getVisibility() != 8 && ((behavior = ((C0827f) child.getLayoutParams()).mo4448f()) == null || !behavior.mo4425l(this, child, layoutDirection))) {
                mo4350I(child, layoutDirection);
            }
        }
    }

    public void onDraw(Canvas c) {
        super.onDraw(c);
        if (this.f3357q && this.f3358r != null) {
            C0479z zVar = this.f3356p;
            int inset = zVar != null ? zVar.mo2615d() : 0;
            if (inset > 0) {
                this.f3358r.setBounds(0, 0, getWidth(), inset);
                this.f3358r.draw(c);
            }
        }
    }

    public void setFitsSystemWindows(boolean fitSystemWindows) {
        super.setFitsSystemWindows(fitSystemWindows);
        mo4360X();
    }

    /* renamed from: N */
    public void mo4354N(View child, Rect r) {
        ((C0827f) child.getLayoutParams()).mo4459q(r);
    }

    /* renamed from: x */
    public void mo4406x(View child, Rect out) {
        out.set(((C0827f) child.getLayoutParams()).mo4450h());
    }

    /* renamed from: q */
    public void mo4390q(View child, boolean transform, Rect out) {
        if (child.isLayoutRequested() || child.getVisibility() == 8) {
            out.setEmpty();
        } else if (transform) {
            mo4401t(child, out);
        } else {
            out.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
        }
    }

    /* renamed from: v */
    public final void mo4403v(View child, int layoutDirection, Rect anchorRect, Rect out, C0827f lp, int childWidth, int childHeight) {
        int left;
        int top;
        int i = layoutDirection;
        Rect rect = anchorRect;
        C0827f fVar = lp;
        int absGravity = C0444c.m2174b(m3976R(fVar.f3366c), i);
        int absAnchorGravity = C0444c.m2174b(m3977S(fVar.f3367d), i);
        int hgrav = absGravity & 7;
        int vgrav = absGravity & 112;
        int anchorHgrav = absAnchorGravity & 7;
        int anchorVgrav = absAnchorGravity & 112;
        if (anchorHgrav == 1) {
            left = rect.left + (anchorRect.width() / 2);
        } else if (anchorHgrav != 5) {
            left = rect.left;
        } else {
            left = rect.right;
        }
        if (anchorVgrav == 16) {
            top = rect.top + (anchorRect.height() / 2);
        } else if (anchorVgrav != 80) {
            top = rect.top;
        } else {
            top = rect.bottom;
        }
        if (hgrav == 1) {
            left -= childWidth / 2;
        } else if (hgrav != 5) {
            left -= childWidth;
        }
        if (vgrav == 16) {
            top -= childHeight / 2;
        } else if (vgrav != 80) {
            top -= childHeight;
        }
        out.set(left, top, left + childWidth, top + childHeight);
    }

    /* renamed from: d */
    public final void mo4363d(C0827f lp, Rect out, int childWidth, int childHeight) {
        int width = getWidth();
        int height = getHeight();
        int left = Math.max(getPaddingLeft() + lp.leftMargin, Math.min(out.left, ((width - getPaddingRight()) - childWidth) - lp.rightMargin));
        int top = Math.max(getPaddingTop() + lp.topMargin, Math.min(out.top, ((height - getPaddingBottom()) - childHeight) - lp.bottomMargin));
        out.set(left, top, left + childWidth, top + childHeight);
    }

    /* renamed from: u */
    public void mo4402u(View child, int layoutDirection, Rect anchorRect, Rect out) {
        C0827f lp = (C0827f) child.getLayoutParams();
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        mo4403v(child, layoutDirection, anchorRect, out, lp, childWidth, childHeight);
        mo4363d(lp, out, childWidth, childHeight);
    }

    /* renamed from: D */
    public final void mo4345D(View child, View anchor, int layoutDirection) {
        Rect anchorRect = m3979a();
        Rect childRect = m3979a();
        try {
            mo4401t(anchor, anchorRect);
            mo4402u(child, layoutDirection, anchorRect, childRect);
            child.layout(childRect.left, childRect.top, childRect.right, childRect.bottom);
        } finally {
            m3975O(anchorRect);
            m3975O(childRect);
        }
    }

    /* renamed from: E */
    public final void mo4346E(View child, int keyline, int layoutDirection) {
        int keyline2;
        int i = layoutDirection;
        C0827f lp = (C0827f) child.getLayoutParams();
        int absGravity = C0444c.m2174b(m3978T(lp.f3366c), i);
        int hgrav = absGravity & 7;
        int vgrav = absGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        if (i == 1) {
            keyline2 = width - keyline;
        } else {
            keyline2 = keyline;
        }
        int left = mo4405w(keyline2) - childWidth;
        int top = 0;
        if (hgrav == 1) {
            left += childWidth / 2;
        } else if (hgrav == 5) {
            left += childWidth;
        }
        if (vgrav == 16) {
            top = 0 + (childHeight / 2);
        } else if (vgrav == 80) {
            top = 0 + childHeight;
        }
        int left2 = Math.max(getPaddingLeft() + lp.leftMargin, Math.min(left, ((width - getPaddingRight()) - childWidth) - lp.rightMargin));
        int top2 = Math.max(getPaddingTop() + lp.topMargin, Math.min(top, ((height - getPaddingBottom()) - childHeight) - lp.bottomMargin));
        child.layout(left2, top2, left2 + childWidth, top2 + childHeight);
    }

    /* renamed from: C */
    public final void mo4344C(View child, int layoutDirection) {
        C0827f lp = (C0827f) child.getLayoutParams();
        Rect parent = m3979a();
        parent.set(getPaddingLeft() + lp.leftMargin, getPaddingTop() + lp.topMargin, (getWidth() - getPaddingRight()) - lp.rightMargin, (getHeight() - getPaddingBottom()) - lp.bottomMargin);
        if (this.f3356p != null && C0460r.m2288s(this) && !C0460r.m2288s(child)) {
            parent.left += this.f3356p.mo2613b();
            parent.top += this.f3356p.mo2615d();
            parent.right -= this.f3356p.mo2614c();
            parent.bottom -= this.f3356p.mo2612a();
        }
        Rect out = m3979a();
        C0444c.m2173a(m3977S(lp.f3366c), child.getMeasuredWidth(), child.getMeasuredHeight(), parent, out, layoutDirection);
        child.layout(out.left, out.top, out.right, out.bottom);
        m3975O(parent);
        m3975O(out);
    }

    /* renamed from: S */
    public static int m3977S(int gravity) {
        if ((gravity & 7) == 0) {
            gravity |= 8388611;
        }
        if ((gravity & 112) == 0) {
            return gravity | 48;
        }
        return gravity;
    }

    /* renamed from: T */
    public static int m3978T(int gravity) {
        if (gravity == 0) {
            return 8388661;
        }
        return gravity;
    }

    /* renamed from: R */
    public static int m3976R(int gravity) {
        if (gravity == 0) {
            return 17;
        }
        return gravity;
    }

    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        C0827f lp = (C0827f) child.getLayoutParams();
        C0824c cVar = lp.f3364a;
        if (cVar != null) {
            float scrimAlpha = cVar.mo4417d(this, child);
            if (scrimAlpha > 0.0f) {
                if (this.f3346f == null) {
                    this.f3346f = new Paint();
                }
                this.f3346f.setColor(lp.f3364a.mo4416c(this, child));
                this.f3346f.setAlpha(m3980c(Math.round(255.0f * scrimAlpha), 0, 255));
                int saved = canvas.save();
                if (child.isOpaque()) {
                    canvas.clipRect((float) child.getLeft(), (float) child.getTop(), (float) child.getRight(), (float) child.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f3346f);
                canvas.restoreToCount(saved);
            }
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    /* renamed from: c */
    public static int m3980c(int value, int min, int max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    /* renamed from: H */
    public final void mo4349H(int type) {
        boolean handled;
        int i = type;
        int layoutDirection = C0460r.m2292v(this);
        int childCount = this.f3342b.size();
        Rect inset = m3979a();
        Rect drawRect = m3979a();
        Rect lastDrawRect = m3979a();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = this.f3342b.get(i2);
            C0827f lp = (C0827f) child.getLayoutParams();
            if (i != 0 || child.getVisibility() != 8) {
                for (int j = 0; j < i2; j++) {
                    if (lp.f3375l == this.f3342b.get(j)) {
                        mo4348G(child, layoutDirection);
                    }
                }
                mo4390q(child, true, drawRect);
                if (lp.f3370g != 0 && !drawRect.isEmpty()) {
                    int absInsetEdge = C0444c.m2174b(lp.f3370g, layoutDirection);
                    int i3 = absInsetEdge & 112;
                    if (i3 == 48) {
                        inset.top = Math.max(inset.top, drawRect.bottom);
                    } else if (i3 == 80) {
                        inset.bottom = Math.max(inset.bottom, getHeight() - drawRect.top);
                    }
                    int i4 = absInsetEdge & 7;
                    if (i4 == 3) {
                        inset.left = Math.max(inset.left, drawRect.right);
                    } else if (i4 == 5) {
                        inset.right = Math.max(inset.right, getWidth() - drawRect.left);
                    }
                }
                if (lp.f3371h != 0 && child.getVisibility() == 0) {
                    mo4347F(child, inset, layoutDirection);
                }
                int i5 = 2;
                if (i != 2) {
                    mo4406x(child, lastDrawRect);
                    if (!lastDrawRect.equals(drawRect)) {
                        mo4354N(child, drawRect);
                    }
                }
                int j2 = i2 + 1;
                while (j2 < childCount) {
                    View checkChild = this.f3342b.get(j2);
                    C0827f checkLp = (C0827f) checkChild.getLayoutParams();
                    C0824c b = checkLp.mo4448f();
                    if (b != null && b.mo4418e(this, checkChild, child)) {
                        if (i != 0 || !checkLp.mo4449g()) {
                            if (i != i5) {
                                handled = b.mo4421h(this, checkChild, child);
                            } else {
                                b.mo4422i(this, checkChild, child);
                                handled = true;
                            }
                            if (i == 1) {
                                checkLp.mo4458p(handled);
                            }
                        } else {
                            checkLp.mo4453k();
                        }
                    }
                    j2++;
                    i5 = 2;
                }
            }
        }
        m3975O(inset);
        m3975O(drawRect);
        m3975O(lastDrawRect);
    }

    /* renamed from: F */
    public final void mo4347F(View child, Rect inset, int layoutDirection) {
        int distance;
        int i;
        int distance2;
        int i2;
        int distance3;
        int i3;
        int distance4;
        int i4;
        if (C0460r.m2235J(child) && child.getWidth() > 0 && child.getHeight() > 0) {
            C0827f lp = (C0827f) child.getLayoutParams();
            C0824c behavior = lp.mo4448f();
            Rect dodgeRect = m3979a();
            Rect bounds = m3979a();
            bounds.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
            if (behavior == null || !behavior.mo4415b(this, child, dodgeRect)) {
                dodgeRect.set(bounds);
            } else if (!bounds.contains(dodgeRect)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + dodgeRect.toShortString() + " | Bounds:" + bounds.toShortString());
            }
            m3975O(bounds);
            if (dodgeRect.isEmpty()) {
                m3975O(dodgeRect);
                return;
            }
            int absDodgeInsetEdges = C0444c.m2174b(lp.f3371h, layoutDirection);
            boolean offsetY = false;
            if ((absDodgeInsetEdges & 48) == 48 && (distance4 = (dodgeRect.top - lp.topMargin) - lp.f3373j) < (i4 = inset.top)) {
                mo4358V(child, i4 - distance4);
                offsetY = true;
            }
            if ((absDodgeInsetEdges & 80) == 80 && (distance3 = ((getHeight() - dodgeRect.bottom) - lp.bottomMargin) + lp.f3373j) < (i3 = inset.bottom)) {
                mo4358V(child, distance3 - i3);
                offsetY = true;
            }
            if (!offsetY) {
                mo4358V(child, 0);
            }
            boolean offsetX = false;
            if ((absDodgeInsetEdges & 3) == 3 && (distance2 = (dodgeRect.left - lp.leftMargin) - lp.f3372i) < (i2 = inset.left)) {
                mo4357U(child, i2 - distance2);
                offsetX = true;
            }
            if ((absDodgeInsetEdges & 5) == 5 && (distance = ((getWidth() - dodgeRect.right) - lp.rightMargin) + lp.f3372i) < (i = inset.right)) {
                mo4357U(child, distance - i);
                offsetX = true;
            }
            if (!offsetX) {
                mo4357U(child, 0);
            }
            m3975O(dodgeRect);
        }
    }

    /* renamed from: U */
    public final void mo4357U(View child, int offsetX) {
        C0827f lp = (C0827f) child.getLayoutParams();
        int i = lp.f3372i;
        if (i != offsetX) {
            C0460r.m2240O(child, offsetX - i);
            lp.f3372i = offsetX;
        }
    }

    /* renamed from: V */
    public final void mo4358V(View child, int offsetY) {
        C0827f lp = (C0827f) child.getLayoutParams();
        int i = lp.f3373j;
        if (i != offsetY) {
            C0460r.m2241P(child, offsetY - i);
            lp.f3373j = offsetY;
        }
    }

    /* renamed from: f */
    public void mo4367f(View view) {
        List<View> dependents = this.f3343c.mo2212g(view);
        if (dependents != null && !dependents.isEmpty()) {
            for (int i = 0; i < dependents.size(); i++) {
                View child = dependents.get(i);
                C0824c b = ((C0827f) child.getLayoutParams()).mo4448f();
                if (b != null) {
                    b.mo4421h(this, child, view);
                }
            }
        }
    }

    /* renamed from: r */
    public List<View> mo4391r(View child) {
        List<View> dependencies = this.f3343c.mo2213h(child);
        this.f3345e.clear();
        if (dependencies != null) {
            this.f3345e.addAll(dependencies);
        }
        return this.f3345e;
    }

    /* renamed from: s */
    public List<View> mo4394s(View child) {
        List<View> edges = this.f3343c.mo2212g(child);
        this.f3345e.clear();
        if (edges != null) {
            this.f3345e.addAll(edges);
        }
        return this.f3345e;
    }

    public final List<View> getDependencySortedChildren() {
        mo4353M();
        return Collections.unmodifiableList(this.f3342b);
    }

    /* renamed from: g */
    public void mo4368g() {
        boolean hasDependencies = false;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (mo4342A(getChildAt(i))) {
                hasDependencies = true;
                break;
            } else {
                i++;
            }
        }
        if (hasDependencies == this.f3355o) {
            return;
        }
        if (hasDependencies) {
            mo4361b();
        } else {
            mo4355P();
        }
    }

    /* renamed from: A */
    public final boolean mo4342A(View child) {
        return this.f3343c.mo2215j(child);
    }

    /* renamed from: b */
    public void mo4361b() {
        if (this.f3350j) {
            if (this.f3354n == null) {
                this.f3354n = new C0828g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3354n);
        }
        this.f3355o = true;
    }

    /* renamed from: P */
    public void mo4355P() {
        if (this.f3350j && this.f3354n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3354n);
        }
        this.f3355o = false;
    }

    /* renamed from: G */
    public void mo4348G(View child, int layoutDirection) {
        C0824c b;
        View view = child;
        C0827f lp = (C0827f) child.getLayoutParams();
        if (lp.f3374k != null) {
            Rect anchorRect = m3979a();
            Rect childRect = m3979a();
            Rect desiredChildRect = m3979a();
            mo4401t(lp.f3374k, anchorRect);
            boolean z = false;
            mo4390q(view, false, childRect);
            int childWidth = child.getMeasuredWidth();
            int childHeight = child.getMeasuredHeight();
            int childHeight2 = childHeight;
            mo4403v(child, layoutDirection, anchorRect, desiredChildRect, lp, childWidth, childHeight);
            if (!(desiredChildRect.left == childRect.left && desiredChildRect.top == childRect.top)) {
                z = true;
            }
            boolean changed = z;
            mo4363d(lp, desiredChildRect, childWidth, childHeight2);
            int dx = desiredChildRect.left - childRect.left;
            int dy = desiredChildRect.top - childRect.top;
            if (dx != 0) {
                C0460r.m2240O(view, dx);
            }
            if (dy != 0) {
                C0460r.m2241P(view, dy);
            }
            if (changed && (b = lp.mo4448f()) != null) {
                b.mo4421h(this, view, lp.f3374k);
            }
            m3975O(anchorRect);
            m3975O(childRect);
            m3975O(desiredChildRect);
        }
    }

    /* renamed from: B */
    public boolean mo4343B(View child, int x, int y) {
        Rect r = m3979a();
        mo4401t(child, r);
        try {
            return r.contains(x, y);
        } finally {
            m3975O(r);
        }
    }

    /* renamed from: j */
    public C0827f generateLayoutParams(AttributeSet attrs) {
        return new C0827f(getContext(), attrs);
    }

    /* renamed from: p */
    public C0827f generateLayoutParams(ViewGroup.LayoutParams p) {
        if (p instanceof C0827f) {
            return new C0827f((C0827f) p);
        }
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new C0827f((ViewGroup.MarginLayoutParams) p);
        }
        return new C0827f(p);
    }

    /* renamed from: h */
    public C0827f generateDefaultLayoutParams() {
        return new C0827f(-2, -2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return (p instanceof C0827f) && super.checkLayoutParams(p);
    }

    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return mo2550o(child, target, nestedScrollAxes, 0);
    }

    /* renamed from: o */
    public boolean mo2550o(View child, View target, int axes, int type) {
        int i = type;
        int childCount = getChildCount();
        boolean handled = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            if (view.getVisibility() != 8) {
                C0827f lp = (C0827f) view.getLayoutParams();
                C0824c viewBehavior = lp.mo4448f();
                if (viewBehavior != null) {
                    boolean accepted = viewBehavior.mo4410A(this, view, child, target, axes, type);
                    lp.mo4460r(i, accepted);
                    handled |= accepted;
                } else {
                    lp.mo4460r(i, false);
                }
            }
        }
        return handled;
    }

    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes) {
        mo2546i(child, target, nestedScrollAxes, 0);
    }

    /* renamed from: i */
    public void mo2546i(View child, View target, int nestedScrollAxes, int type) {
        C0824c viewBehavior;
        View view = target;
        int i = type;
        this.f3361u.mo2561c(child, view, nestedScrollAxes, i);
        this.f3353m = view;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View view2 = getChildAt(i2);
            C0827f lp = (C0827f) view2.getLayoutParams();
            if (lp.mo4452j(i) && (viewBehavior = lp.mo4448f()) != null) {
                viewBehavior.mo4435v(this, view2, child, target, nestedScrollAxes, type);
            }
        }
    }

    public void onStopNestedScroll(View target) {
        mo2548m(target, 0);
    }

    /* renamed from: m */
    public void mo2548m(View target, int type) {
        this.f3361u.mo2562d(target, type);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            C0827f lp = (C0827f) view.getLayoutParams();
            if (lp.mo4452j(type)) {
                C0824c viewBehavior = lp.mo4448f();
                if (viewBehavior != null) {
                    viewBehavior.mo4412C(this, view, target, type);
                }
                lp.mo4454l(type);
                lp.mo4453k();
            }
        }
        this.f3353m = null;
    }

    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        mo2547l(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, 0);
    }

    /* renamed from: l */
    public void mo2547l(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        mo2551k(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, 0, this.f3348h);
    }

    /* renamed from: k */
    public void mo2551k(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        int childCount;
        int xConsumed;
        int yConsumed;
        int childCount2 = getChildCount();
        boolean accepted = false;
        int xConsumed2 = 0;
        int yConsumed2 = 0;
        int i = 0;
        while (i < childCount2) {
            View view = getChildAt(i);
            if (view.getVisibility() == 8) {
                childCount = childCount2;
            } else {
                C0827f lp = (C0827f) view.getLayoutParams();
                if (!lp.mo4452j(type)) {
                    childCount = childCount2;
                } else {
                    C0824c viewBehavior = lp.mo4448f();
                    if (viewBehavior != null) {
                        int[] iArr = this.f3347g;
                        iArr[0] = 0;
                        iArr[1] = 0;
                        C0827f fVar = lp;
                        childCount = childCount2;
                        viewBehavior.mo4433t(this, view, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type, iArr);
                        int[] iArr2 = this.f3347g;
                        if (dxUnconsumed > 0) {
                            xConsumed = Math.max(xConsumed2, iArr2[0]);
                        } else {
                            xConsumed = Math.min(xConsumed2, iArr2[0]);
                        }
                        int[] iArr3 = this.f3347g;
                        if (dyUnconsumed > 0) {
                            yConsumed = Math.max(yConsumed2, iArr3[1]);
                        } else {
                            yConsumed = Math.min(yConsumed2, iArr3[1]);
                        }
                        xConsumed2 = xConsumed;
                        yConsumed2 = yConsumed;
                        accepted = true;
                    } else {
                        childCount = childCount2;
                    }
                }
            }
            i++;
            childCount2 = childCount;
        }
        consumed[0] = consumed[0] + xConsumed2;
        consumed[1] = consumed[1] + yConsumed2;
        if (accepted) {
            mo4349H(1);
        }
    }

    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        mo2549n(target, dx, dy, consumed, 0);
    }

    /* renamed from: n */
    public void mo2549n(View target, int dx, int dy, int[] consumed, int type) {
        int xConsumed;
        int yConsumed;
        int childCount = getChildCount();
        int xConsumed2 = 0;
        int yConsumed2 = 0;
        boolean accepted = false;
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            if (view.getVisibility() != 8) {
                C0827f lp = (C0827f) view.getLayoutParams();
                if (lp.mo4452j(type)) {
                    C0824c viewBehavior = lp.mo4448f();
                    if (viewBehavior != null) {
                        int[] iArr = this.f3347g;
                        iArr[0] = 0;
                        iArr[1] = 0;
                        C0827f fVar = lp;
                        viewBehavior.mo4430q(this, view, target, dx, dy, iArr, type);
                        int[] iArr2 = this.f3347g;
                        if (dx > 0) {
                            xConsumed = Math.max(xConsumed2, iArr2[0]);
                        } else {
                            xConsumed = Math.min(xConsumed2, iArr2[0]);
                        }
                        int[] iArr3 = this.f3347g;
                        if (dy > 0) {
                            yConsumed = Math.max(yConsumed2, iArr3[1]);
                        } else {
                            yConsumed = Math.min(yConsumed2, iArr3[1]);
                        }
                        xConsumed2 = xConsumed;
                        yConsumed2 = yConsumed;
                        accepted = true;
                    }
                }
            }
        }
        consumed[0] = xConsumed2;
        consumed[1] = yConsumed2;
        if (accepted) {
            mo4349H(1);
        }
    }

    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        C0824c viewBehavior;
        int childCount = getChildCount();
        boolean handled = false;
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            if (view.getVisibility() != 8) {
                C0827f lp = (C0827f) view.getLayoutParams();
                if (lp.mo4452j(0) && (viewBehavior = lp.mo4448f()) != null) {
                    handled = viewBehavior.mo4427n(this, view, target, velocityX, velocityY, consumed) | handled;
                }
            }
        }
        if (handled) {
            mo4349H(1);
        }
        return handled;
    }

    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        C0824c viewBehavior;
        boolean handled = false;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            if (view.getVisibility() != 8) {
                C0827f lp = (C0827f) view.getLayoutParams();
                if (lp.mo4452j(0) && (viewBehavior = lp.mo4448f()) != null) {
                    handled |= viewBehavior.mo4428o(this, view, target, velocityX, velocityY);
                }
            }
        }
        return handled;
    }

    public int getNestedScrollAxes() {
        return this.f3361u.mo2559a();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class C0828g implements ViewTreeObserver.OnPreDrawListener {
        public C0828g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo4349H(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C0831i implements Comparator<View> {
        /* renamed from: a */
        public int compare(View lhs, View rhs) {
            float lz = C0460r.m2229D(lhs);
            float rz = C0460r.m2229D(rhs);
            if (lz > rz) {
                return -1;
            }
            if (lz < rz) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0824c<V extends View> {
        public C0824c() {
        }

        public C0824c(Context context, AttributeSet attrs) {
        }

        /* renamed from: g */
        public void mo4420g(C0827f params) {
        }

        /* renamed from: j */
        public void mo4423j() {
        }

        /* renamed from: k */
        public boolean mo4424k(CoordinatorLayout parent, V v, MotionEvent ev) {
            return false;
        }

        /* renamed from: D */
        public boolean mo4413D(CoordinatorLayout parent, V v, MotionEvent ev) {
            return false;
        }

        /* renamed from: c */
        public int mo4416c(CoordinatorLayout parent, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float mo4417d(CoordinatorLayout parent, V v) {
            return 0.0f;
        }

        /* renamed from: a */
        public boolean mo4414a(CoordinatorLayout parent, V child) {
            return mo4417d(parent, child) > 0.0f;
        }

        /* renamed from: e */
        public boolean mo4418e(CoordinatorLayout parent, V v, View dependency) {
            return false;
        }

        /* renamed from: h */
        public boolean mo4421h(CoordinatorLayout parent, V v, View dependency) {
            return false;
        }

        /* renamed from: i */
        public void mo4422i(CoordinatorLayout parent, V v, View dependency) {
        }

        /* renamed from: m */
        public boolean mo4426m(CoordinatorLayout parent, V v, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
            return false;
        }

        /* renamed from: l */
        public boolean mo4425l(CoordinatorLayout parent, V v, int layoutDirection) {
            return false;
        }

        @Deprecated
        /* renamed from: z */
        public boolean mo4439z(CoordinatorLayout coordinatorLayout, V v, View directTargetChild, View target, int axes) {
            return false;
        }

        /* renamed from: A */
        public boolean mo4410A(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int axes, int type) {
            if (type == 0) {
                return mo4439z(coordinatorLayout, child, directTargetChild, target, axes);
            }
            return false;
        }

        @Deprecated
        /* renamed from: u */
        public void mo4434u(CoordinatorLayout coordinatorLayout, V v, View directTargetChild, View target, int axes) {
        }

        /* renamed from: v */
        public void mo4435v(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int axes, int type) {
            if (type == 0) {
                mo4434u(coordinatorLayout, child, directTargetChild, target, axes);
            }
        }

        @Deprecated
        /* renamed from: B */
        public void mo4411B(CoordinatorLayout coordinatorLayout, V v, View target) {
        }

        /* renamed from: C */
        public void mo4412C(CoordinatorLayout coordinatorLayout, V child, View target, int type) {
            if (type == 0) {
                mo4411B(coordinatorLayout, child, target);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void mo4431r(CoordinatorLayout coordinatorLayout, V v, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        }

        @Deprecated
        /* renamed from: s */
        public void mo4432s(CoordinatorLayout coordinatorLayout, V child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
            if (type == 0) {
                mo4431r(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
            }
        }

        /* renamed from: t */
        public void mo4433t(CoordinatorLayout coordinatorLayout, V child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
            consumed[0] = consumed[0] + dxUnconsumed;
            consumed[1] = consumed[1] + dyUnconsumed;
            mo4432s(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
        }

        @Deprecated
        /* renamed from: p */
        public void mo4429p(CoordinatorLayout coordinatorLayout, V v, View target, int dx, int dy, int[] consumed) {
        }

        /* renamed from: q */
        public void mo4430q(CoordinatorLayout coordinatorLayout, V child, View target, int dx, int dy, int[] consumed, int type) {
            if (type == 0) {
                mo4429p(coordinatorLayout, child, target, dx, dy, consumed);
            }
        }

        /* renamed from: n */
        public boolean mo4427n(CoordinatorLayout coordinatorLayout, V v, View target, float velocityX, float velocityY, boolean consumed) {
            return false;
        }

        /* renamed from: o */
        public boolean mo4428o(CoordinatorLayout coordinatorLayout, V v, View target, float velocityX, float velocityY) {
            return false;
        }

        /* renamed from: f */
        public C0479z mo4419f(CoordinatorLayout coordinatorLayout, V v, C0479z insets) {
            return insets;
        }

        /* renamed from: w */
        public boolean mo4436w(CoordinatorLayout coordinatorLayout, V v, Rect rectangle, boolean immediate) {
            return false;
        }

        /* renamed from: x */
        public void mo4437x(CoordinatorLayout parent, V v, Parcelable state) {
        }

        /* renamed from: y */
        public Parcelable mo4438y(CoordinatorLayout parent, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: b */
        public boolean mo4415b(CoordinatorLayout parent, V v, Rect rect) {
            return false;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0827f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public C0824c f3364a;

        /* renamed from: b */
        public boolean f3365b = false;

        /* renamed from: c */
        public int f3366c = 0;

        /* renamed from: d */
        public int f3367d = 0;

        /* renamed from: e */
        public int f3368e = -1;

        /* renamed from: f */
        public int f3369f = -1;

        /* renamed from: g */
        public int f3370g = 0;

        /* renamed from: h */
        public int f3371h = 0;

        /* renamed from: i */
        public int f3372i;

        /* renamed from: j */
        public int f3373j;

        /* renamed from: k */
        public View f3374k;

        /* renamed from: l */
        public View f3375l;

        /* renamed from: m */
        public boolean f3376m;

        /* renamed from: n */
        public boolean f3377n;

        /* renamed from: o */
        public boolean f3378o;

        /* renamed from: p */
        public boolean f3379p;

        /* renamed from: q */
        public final Rect f3380q = new Rect();

        public C0827f(int width, int height) {
            super(width, height);
        }

        public C0827f(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a = context.obtainStyledAttributes(attrs, C0320c.f1760d);
            this.f3366c = a.getInteger(C0320c.f1761e, 0);
            this.f3369f = a.getResourceId(C0320c.f1762f, -1);
            this.f3367d = a.getInteger(C0320c.f1763g, 0);
            this.f3368e = a.getInteger(C0320c.f1767k, -1);
            this.f3370g = a.getInt(C0320c.f1766j, 0);
            this.f3371h = a.getInt(C0320c.f1765i, 0);
            int i = C0320c.f1764h;
            boolean hasValue = a.hasValue(i);
            this.f3365b = hasValue;
            if (hasValue) {
                this.f3364a = CoordinatorLayout.m3974K(context, attrs, a.getString(i));
            }
            a.recycle();
            C0824c cVar = this.f3364a;
            if (cVar != null) {
                cVar.mo4420g(this);
            }
        }

        public C0827f(C0827f p) {
            super(p);
        }

        public C0827f(ViewGroup.MarginLayoutParams p) {
            super(p);
        }

        public C0827f(ViewGroup.LayoutParams p) {
            super(p);
        }

        /* renamed from: e */
        public int mo4447e() {
            return this.f3369f;
        }

        /* renamed from: f */
        public C0824c mo4448f() {
            return this.f3364a;
        }

        /* renamed from: o */
        public void mo4457o(C0824c behavior) {
            C0824c cVar = this.f3364a;
            if (cVar != behavior) {
                if (cVar != null) {
                    cVar.mo4423j();
                }
                this.f3364a = behavior;
                this.f3365b = true;
                if (behavior != null) {
                    behavior.mo4420g(this);
                }
            }
        }

        /* renamed from: q */
        public void mo4459q(Rect r) {
            this.f3380q.set(r);
        }

        /* renamed from: h */
        public Rect mo4450h() {
            return this.f3380q;
        }

        /* renamed from: a */
        public boolean mo4443a() {
            return this.f3374k == null && this.f3369f != -1;
        }

        /* renamed from: c */
        public boolean mo4445c() {
            if (this.f3364a == null) {
                this.f3376m = false;
            }
            return this.f3376m;
        }

        /* renamed from: i */
        public boolean mo4451i(CoordinatorLayout parent, View child) {
            boolean z = this.f3376m;
            if (z) {
                return true;
            }
            C0824c cVar = this.f3364a;
            boolean a = z | (cVar != null ? cVar.mo4414a(parent, child) : false);
            this.f3376m = a;
            return a;
        }

        /* renamed from: m */
        public void mo4455m() {
            this.f3376m = false;
        }

        /* renamed from: l */
        public void mo4454l(int type) {
            mo4460r(type, false);
        }

        /* renamed from: r */
        public void mo4460r(int type, boolean accept) {
            if (type == 0) {
                this.f3377n = accept;
            } else if (type == 1) {
                this.f3378o = accept;
            }
        }

        /* renamed from: j */
        public boolean mo4452j(int type) {
            if (type == 0) {
                return this.f3377n;
            }
            if (type != 1) {
                return false;
            }
            return this.f3378o;
        }

        /* renamed from: g */
        public boolean mo4449g() {
            return this.f3379p;
        }

        /* renamed from: p */
        public void mo4458p(boolean changed) {
            this.f3379p = changed;
        }

        /* renamed from: k */
        public void mo4453k() {
            this.f3379p = false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f3364a;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4444b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f3375l
                if (r4 == r0) goto L_0x001b
                int r0 = p000a.p025h.p038m.C0460r.m2292v(r2)
                boolean r0 = r1.mo4461s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f3364a
                if (r0 == 0) goto L_0x0019
                boolean r0 = r0.mo4418e(r2, r3, r4)
                if (r0 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r0 = 0
                goto L_0x001c
            L_0x001b:
                r0 = 1
            L_0x001c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.C0827f.mo4444b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* renamed from: d */
        public View mo4446d(CoordinatorLayout parent, View forChild) {
            if (this.f3369f == -1) {
                this.f3375l = null;
                this.f3374k = null;
                return null;
            }
            if (this.f3374k == null || !mo4462t(forChild, parent)) {
                mo4456n(forChild, parent);
            }
            return this.f3374k;
        }

        /* renamed from: n */
        public final void mo4456n(View forChild, CoordinatorLayout parent) {
            View findViewById = parent.findViewById(this.f3369f);
            this.f3374k = findViewById;
            if (findViewById != null) {
                if (findViewById != parent) {
                    View directChild = this.f3374k;
                    ViewParent p = findViewById.getParent();
                    while (p != parent && p != null) {
                        if (p != forChild) {
                            if (p instanceof View) {
                                directChild = (View) p;
                            }
                            p = p.getParent();
                        } else if (parent.isInEditMode()) {
                            this.f3375l = null;
                            this.f3374k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f3375l = directChild;
                } else if (parent.isInEditMode()) {
                    this.f3375l = null;
                    this.f3374k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (parent.isInEditMode()) {
                this.f3375l = null;
                this.f3374k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + parent.getResources().getResourceName(this.f3369f) + " to anchor view " + forChild);
            }
        }

        /* renamed from: t */
        public final boolean mo4462t(View forChild, CoordinatorLayout parent) {
            if (this.f3374k.getId() != this.f3369f) {
                return false;
            }
            View directChild = this.f3374k;
            for (ViewParent p = this.f3374k.getParent(); p != parent; p = p.getParent()) {
                if (p == null || p == forChild) {
                    this.f3375l = null;
                    this.f3374k = null;
                    return false;
                }
                if (p instanceof View) {
                    directChild = (View) p;
                }
            }
            this.f3375l = directChild;
            return true;
        }

        /* renamed from: s */
        public final boolean mo4461s(View other, int layoutDirection) {
            int absInset = C0444c.m2174b(((C0827f) other.getLayoutParams()).f3370g, layoutDirection);
            return absInset != 0 && (C0444c.m2174b(this.f3371h, layoutDirection) & absInset) == absInset;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class C0826e implements ViewGroup.OnHierarchyChangeListener {
        public C0826e() {
        }

        public void onChildViewAdded(View parent, View child) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3359s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(parent, child);
            }
        }

        public void onChildViewRemoved(View parent, View child) {
            CoordinatorLayout.this.mo4349H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3359s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(parent, child);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable state) {
        Parcelable savedState;
        if (!(state instanceof C0829h)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C0829h ss = (C0829h) state;
        super.onRestoreInstanceState(ss.mo2682f());
        SparseArray<Parcelable> behaviorStates = ss.f3382d;
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            int childId = child.getId();
            C0824c b = mo4407y(child).mo4448f();
            if (!(childId == -1 || b == null || (savedState = behaviorStates.get(childId)) == null)) {
                b.mo4437x(this, child, savedState);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable state;
        C0829h ss = new C0829h(super.onSaveInstanceState());
        SparseArray<Parcelable> behaviorStates = new SparseArray<>();
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            int childId = child.getId();
            C0824c b = ((C0827f) child.getLayoutParams()).mo4448f();
            if (!(childId == -1 || b == null || (state = b.mo4438y(this, child)) == null)) {
                behaviorStates.append(childId, state);
            }
        }
        ss.f3382d = behaviorStates;
        return ss;
    }

    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        C0824c behavior = ((C0827f) child.getLayoutParams()).mo4448f();
        if (behavior == null || !behavior.mo4436w(this, child, rectangle, immediate)) {
            return super.requestChildRectangleOnScreen(child, rectangle, immediate);
        }
        return true;
    }

    /* renamed from: X */
    public final void mo4360X() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C0460r.m2288s(this)) {
                if (this.f3360t == null) {
                    this.f3360t = new C0822a();
                }
                C0460r.m2279n0(this, this.f3360t);
                setSystemUiVisibility(1280);
                return;
            }
            C0460r.m2279n0(this, (C0457o) null);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0822a implements C0457o {
        public C0822a() {
        }

        /* renamed from: a */
        public C0479z mo171a(View v, C0479z insets) {
            return CoordinatorLayout.this.mo4359W(insets);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0829h extends C0501a {
        public static final Parcelable.Creator<C0829h> CREATOR = new C0830a();

        /* renamed from: d */
        public SparseArray<Parcelable> f3382d;

        public C0829h(Parcel source, ClassLoader loader) {
            super(source, loader);
            int size = source.readInt();
            int[] ids = new int[size];
            source.readIntArray(ids);
            Parcelable[] states = source.readParcelableArray(loader);
            this.f3382d = new SparseArray<>(size);
            for (int i = 0; i < size; i++) {
                this.f3382d.append(ids[i], states[i]);
            }
        }

        public C0829h(Parcelable superState) {
            super(superState);
        }

        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            SparseArray<Parcelable> sparseArray = this.f3382d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            dest.writeInt(size);
            int[] ids = new int[size];
            Parcelable[] states = new Parcelable[size];
            for (int i = 0; i < size; i++) {
                ids[i] = this.f3382d.keyAt(i);
                states[i] = this.f3382d.valueAt(i);
            }
            dest.writeIntArray(ids);
            dest.writeParcelableArray(states, flags);
        }

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        public static class C0830a implements Parcelable.ClassLoaderCreator<C0829h> {
            /* renamed from: b */
            public C0829h createFromParcel(Parcel in, ClassLoader loader) {
                return new C0829h(in, loader);
            }

            /* renamed from: a */
            public C0829h createFromParcel(Parcel in) {
                return new C0829h(in, (ClassLoader) null);
            }

            /* renamed from: c */
            public C0829h[] newArray(int size) {
                return new C0829h[size];
            }
        }
    }
}
