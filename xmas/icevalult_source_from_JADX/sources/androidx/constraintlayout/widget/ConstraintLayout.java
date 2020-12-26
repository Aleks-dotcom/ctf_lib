package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p000a.p019f.p020a.C0277f;
import p000a.p019f.p020a.p021j.C0282a;
import p000a.p019f.p020a.p021j.C0286e;
import p000a.p019f.p020a.p021j.C0291f;
import p000a.p019f.p020a.p021j.C0294g;
import p000a.p019f.p020a.p021j.C0296i;
import p000a.p019f.p020a.p021j.C0301m;
import p000a.p019f.p022b.C0308b;
import p000a.p019f.p022b.C0309c;
import p000a.p019f.p022b.C0314e;
import p000a.p019f.p022b.C0315f;
import p000a.p019f.p022b.C0317h;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: b */
    public SparseArray<View> f3256b = new SparseArray<>();

    /* renamed from: c */
    public ArrayList<C0308b> f3257c = new ArrayList<>(4);

    /* renamed from: d */
    public final ArrayList<C0291f> f3258d = new ArrayList<>(100);

    /* renamed from: e */
    public C0294g f3259e = new C0294g();

    /* renamed from: f */
    public int f3260f = 0;

    /* renamed from: g */
    public int f3261g = 0;

    /* renamed from: h */
    public int f3262h = Integer.MAX_VALUE;

    /* renamed from: i */
    public int f3263i = Integer.MAX_VALUE;

    /* renamed from: j */
    public boolean f3264j = true;

    /* renamed from: k */
    public int f3265k = 7;

    /* renamed from: l */
    public C0309c f3266l = null;

    /* renamed from: m */
    public int f3267m = -1;

    /* renamed from: n */
    public HashMap<String, Integer> f3268n = new HashMap<>();

    /* renamed from: o */
    public int f3269o = -1;

    /* renamed from: p */
    public int f3270p = -1;

    /* renamed from: q */
    public C0277f f3271q;

    /* renamed from: k */
    public void mo4321k(int type, Object value1, Object value2) {
        if (type == 0 && (value1 instanceof String) && (value2 instanceof Integer)) {
            if (this.f3268n == null) {
                this.f3268n = new HashMap<>();
            }
            String name = (String) value1;
            int index = name.indexOf("/");
            if (index != -1) {
                name = name.substring(index + 1);
            }
            this.f3268n.put(name, Integer.valueOf(((Integer) value2).intValue()));
        }
    }

    /* renamed from: c */
    public Object mo4303c(int type, Object value) {
        if (type != 0 || !(value instanceof String)) {
            return null;
        }
        String name = (String) value;
        HashMap<String, Integer> hashMap = this.f3268n;
        if (hashMap == null || !hashMap.containsKey(name)) {
            return null;
        }
        return this.f3268n.get(name);
    }

    public ConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        mo4309g(attrs);
    }

    public void setId(int id) {
        this.f3256b.remove(getId());
        super.setId(id);
        this.f3256b.put(getId(), this);
    }

    /* renamed from: g */
    public final void mo4309g(AttributeSet attrs) {
        this.f3259e.mo2044W(this);
        this.f3256b.put(getId(), this);
        this.f3266l = null;
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, C0317h.f1679a);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == C0317h.f1691e) {
                    this.f3260f = a.getDimensionPixelOffset(attr, this.f3260f);
                } else if (attr == C0317h.f1694f) {
                    this.f3261g = a.getDimensionPixelOffset(attr, this.f3261g);
                } else if (attr == C0317h.f1685c) {
                    this.f3262h = a.getDimensionPixelOffset(attr, this.f3262h);
                } else if (attr == C0317h.f1688d) {
                    this.f3263i = a.getDimensionPixelOffset(attr, this.f3263i);
                } else if (attr == C0317h.f1701h0) {
                    this.f3265k = a.getInt(attr, this.f3265k);
                } else if (attr == C0317h.f1703i) {
                    int id = a.getResourceId(attr, 0);
                    try {
                        C0309c cVar = new C0309c();
                        this.f3266l = cVar;
                        cVar.mo2178e(getContext(), id);
                    } catch (Resources.NotFoundException e) {
                        this.f3266l = null;
                    }
                    this.f3267m = id;
                }
            }
            a.recycle();
        }
        this.f3259e.mo2114c1(this.f3265k);
    }

    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(child);
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0291f widget = mo4308f(view);
        if ((view instanceof C0314e) && !(widget instanceof C0296i)) {
            C0820a layoutParams = (C0820a) view.getLayoutParams();
            C0296i iVar = new C0296i();
            layoutParams.f3319k0 = iVar;
            layoutParams.f3295X = true;
            iVar.mo2129M0(layoutParams.f3289R);
        }
        if (view instanceof C0308b) {
            C0308b helper = (C0308b) view;
            helper.mo2168f();
            ((C0820a) view.getLayoutParams()).f3296Y = true;
            if (!this.f3257c.contains(helper)) {
                this.f3257c.add(helper);
            }
        }
        this.f3256b.put(view.getId(), view);
        this.f3264j = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f3256b.remove(view.getId());
        C0291f widget = mo4308f(view);
        this.f3259e.mo2158L0(widget);
        this.f3257c.remove(view);
        this.f3258d.remove(widget);
        this.f3264j = true;
    }

    public void setMinWidth(int value) {
        if (value != this.f3260f) {
            this.f3260f = value;
            requestLayout();
        }
    }

    public void setMinHeight(int value) {
        if (value != this.f3261g) {
            this.f3261g = value;
            requestLayout();
        }
    }

    public int getMinWidth() {
        return this.f3260f;
    }

    public int getMinHeight() {
        return this.f3261g;
    }

    public void setMaxWidth(int value) {
        if (value != this.f3262h) {
            this.f3262h = value;
            requestLayout();
        }
    }

    public void setMaxHeight(int value) {
        if (value != this.f3263i) {
            this.f3263i = value;
            requestLayout();
        }
    }

    public int getMaxWidth() {
        return this.f3262h;
    }

    public int getMaxHeight() {
        return this.f3263i;
    }

    /* renamed from: n */
    public final void mo4324n() {
        int count = getChildCount();
        boolean recompute = false;
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                recompute = true;
                break;
            } else {
                i++;
            }
        }
        if (recompute) {
            this.f3258d.clear();
            mo4320j();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x020c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4320j() {
        /*
            r30 = this;
            r1 = r30
            int r2 = android.os.Build.VERSION.SDK_INT
            boolean r3 = r30.isInEditMode()
            int r4 = r30.getChildCount()
            r5 = 0
            r6 = -1
            if (r3 == 0) goto L_0x004e
            r0 = 0
            r7 = r0
        L_0x0012:
            if (r7 >= r4) goto L_0x004e
            android.view.View r8 = r1.getChildAt(r7)
            android.content.res.Resources r0 = r30.getResources()     // Catch:{ NotFoundException -> 0x004a }
            int r9 = r8.getId()     // Catch:{ NotFoundException -> 0x004a }
            java.lang.String r0 = r0.getResourceName(r9)     // Catch:{ NotFoundException -> 0x004a }
            int r9 = r8.getId()     // Catch:{ NotFoundException -> 0x004a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ NotFoundException -> 0x004a }
            r1.mo4321k(r5, r0, r9)     // Catch:{ NotFoundException -> 0x004a }
            r9 = 47
            int r9 = r0.indexOf(r9)     // Catch:{ NotFoundException -> 0x004a }
            if (r9 == r6) goto L_0x003e
            int r10 = r9 + 1
            java.lang.String r10 = r0.substring(r10)     // Catch:{ NotFoundException -> 0x004a }
            r0 = r10
        L_0x003e:
            int r10 = r8.getId()     // Catch:{ NotFoundException -> 0x004a }
            a.f.a.j.f r10 = r1.mo4305d(r10)     // Catch:{ NotFoundException -> 0x004a }
            r10.mo2045X(r0)     // Catch:{ NotFoundException -> 0x004a }
            goto L_0x004b
        L_0x004a:
            r0 = move-exception
        L_0x004b:
            int r7 = r7 + 1
            goto L_0x0012
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r0 >= r4) goto L_0x0062
            android.view.View r7 = r1.getChildAt(r0)
            a.f.a.j.f r8 = r1.mo4308f(r7)
            if (r8 != 0) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            r8.mo2040Q()
        L_0x005f:
            int r0 = r0 + 1
            goto L_0x004f
        L_0x0062:
            int r0 = r1.f3267m
            if (r0 == r6) goto L_0x0085
            r0 = 0
        L_0x0067:
            if (r0 >= r4) goto L_0x0085
            android.view.View r7 = r1.getChildAt(r0)
            int r8 = r7.getId()
            int r9 = r1.f3267m
            if (r8 != r9) goto L_0x0082
            boolean r8 = r7 instanceof p000a.p019f.p022b.C0312d
            if (r8 == 0) goto L_0x0082
            r8 = r7
            a.f.b.d r8 = (p000a.p019f.p022b.C0312d) r8
            a.f.b.c r8 = r8.getConstraintSet()
            r1.f3266l = r8
        L_0x0082:
            int r0 = r0 + 1
            goto L_0x0067
        L_0x0085:
            a.f.b.c r0 = r1.f3266l
            if (r0 == 0) goto L_0x008c
            r0.mo2174a(r1)
        L_0x008c:
            a.f.a.j.g r0 = r1.f3259e
            r0.mo2159M0()
            java.util.ArrayList<a.f.b.b> r0 = r1.f3257c
            int r7 = r0.size()
            if (r7 <= 0) goto L_0x00aa
            r0 = 0
        L_0x009a:
            if (r0 >= r7) goto L_0x00aa
            java.util.ArrayList<a.f.b.b> r8 = r1.f3257c
            java.lang.Object r8 = r8.get(r0)
            a.f.b.b r8 = (p000a.p019f.p022b.C0308b) r8
            r8.mo2167e(r1)
            int r0 = r0 + 1
            goto L_0x009a
        L_0x00aa:
            r0 = 0
        L_0x00ab:
            if (r0 >= r4) goto L_0x00be
            android.view.View r8 = r1.getChildAt(r0)
            boolean r9 = r8 instanceof p000a.p019f.p022b.C0315f
            if (r9 == 0) goto L_0x00bb
            r9 = r8
            a.f.b.f r9 = (p000a.p019f.p022b.C0315f) r9
            r9.mo2200b(r1)
        L_0x00bb:
            int r0 = r0 + 1
            goto L_0x00ab
        L_0x00be:
            r0 = 0
            r8 = r0
        L_0x00c0:
            if (r8 >= r4) goto L_0x0484
            android.view.View r9 = r1.getChildAt(r8)
            a.f.a.j.f r15 = r1.mo4308f(r9)
            if (r15 != 0) goto L_0x00d6
            r17 = r2
            r16 = r4
            r18 = r7
            r10 = -1
            r11 = 0
            goto L_0x0478
        L_0x00d6:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            r14 = r0
            androidx.constraintlayout.widget.ConstraintLayout$a r14 = (androidx.constraintlayout.widget.ConstraintLayout.C0820a) r14
            r14.mo4340a()
            boolean r0 = r14.f3321l0
            if (r0 == 0) goto L_0x00e7
            r14.f3321l0 = r5
            goto L_0x011a
        L_0x00e7:
            if (r3 == 0) goto L_0x011a
            android.content.res.Resources r0 = r30.getResources()     // Catch:{ NotFoundException -> 0x0119 }
            int r10 = r9.getId()     // Catch:{ NotFoundException -> 0x0119 }
            java.lang.String r0 = r0.getResourceName(r10)     // Catch:{ NotFoundException -> 0x0119 }
            int r10 = r9.getId()     // Catch:{ NotFoundException -> 0x0119 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NotFoundException -> 0x0119 }
            r1.mo4321k(r5, r0, r10)     // Catch:{ NotFoundException -> 0x0119 }
            java.lang.String r10 = "id/"
            int r10 = r0.indexOf(r10)     // Catch:{ NotFoundException -> 0x0119 }
            int r10 = r10 + 3
            java.lang.String r10 = r0.substring(r10)     // Catch:{ NotFoundException -> 0x0119 }
            r0 = r10
            int r10 = r9.getId()     // Catch:{ NotFoundException -> 0x0119 }
            a.f.a.j.f r10 = r1.mo4305d(r10)     // Catch:{ NotFoundException -> 0x0119 }
            r10.mo2045X(r0)     // Catch:{ NotFoundException -> 0x0119 }
            goto L_0x011a
        L_0x0119:
            r0 = move-exception
        L_0x011a:
            int r0 = r9.getVisibility()
            r15.mo2093x0(r0)
            boolean r0 = r14.f3297Z
            if (r0 == 0) goto L_0x012a
            r0 = 8
            r15.mo2093x0(r0)
        L_0x012a:
            r15.mo2044W(r9)
            a.f.a.j.g r0 = r1.f3259e
            r0.mo2156I0(r15)
            boolean r0 = r14.f3293V
            if (r0 == 0) goto L_0x013a
            boolean r0 = r14.f3292U
            if (r0 != 0) goto L_0x013f
        L_0x013a:
            java.util.ArrayList<a.f.a.j.f> r0 = r1.f3258d
            r0.add(r15)
        L_0x013f:
            boolean r0 = r14.f3295X
            r10 = 17
            if (r0 == 0) goto L_0x0175
            r0 = r15
            a.f.a.j.i r0 = (p000a.p019f.p020a.p021j.C0296i) r0
            int r11 = r14.f3313h0
            int r12 = r14.f3315i0
            float r13 = r14.f3317j0
            if (r2 >= r10) goto L_0x0156
            int r11 = r14.f3298a
            int r12 = r14.f3300b
            float r13 = r14.f3302c
        L_0x0156:
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x0160
            r0.mo2128L0(r13)
            goto L_0x016b
        L_0x0160:
            if (r11 == r6) goto L_0x0166
            r0.mo2126J0(r11)
            goto L_0x016b
        L_0x0166:
            if (r12 == r6) goto L_0x016b
            r0.mo2127K0(r12)
        L_0x016b:
            r17 = r2
            r16 = r4
            r18 = r7
            r10 = -1
            r11 = 0
            goto L_0x0478
        L_0x0175:
            int r0 = r14.f3304d
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3306e
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3308f
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3310g
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3326q
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3325p
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3327r
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3328s
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3312h
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3314i
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3316j
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3318k
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3320l
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3287P
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3288Q
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.f3322m
            if (r0 != r6) goto L_0x01bd
            int r0 = r14.width
            if (r0 == r6) goto L_0x01bd
            int r0 = r14.height
            if (r0 != r6) goto L_0x016b
        L_0x01bd:
            int r0 = r14.f3299a0
            int r11 = r14.f3301b0
            int r12 = r14.f3303c0
            int r13 = r14.f3305d0
            int r5 = r14.f3307e0
            int r6 = r14.f3309f0
            r16 = r0
            float r0 = r14.f3311g0
            if (r2 >= r10) goto L_0x0222
            int r10 = r14.f3304d
            int r11 = r14.f3306e
            int r12 = r14.f3308f
            int r13 = r14.f3310g
            int r5 = r14.f3329t
            int r6 = r14.f3331v
            float r0 = r14.f3335z
            r17 = r2
            r2 = -1
            if (r10 != r2) goto L_0x01f6
            if (r11 != r2) goto L_0x01f6
            r16 = r0
            int r0 = r14.f3326q
            if (r0 == r2) goto L_0x01ed
            int r0 = r14.f3326q
            goto L_0x01f9
        L_0x01ed:
            int r0 = r14.f3325p
            if (r0 == r2) goto L_0x01f8
            int r0 = r14.f3325p
            r11 = r0
            r0 = r10
            goto L_0x01f9
        L_0x01f6:
            r16 = r0
        L_0x01f8:
            r0 = r10
        L_0x01f9:
            r2 = -1
            if (r12 != r2) goto L_0x021a
            if (r13 != r2) goto L_0x021a
            int r10 = r14.f3327r
            if (r10 == r2) goto L_0x020c
            int r12 = r14.f3327r
            r2 = r16
            r29 = r13
            r13 = r11
            r11 = r29
            goto L_0x022c
        L_0x020c:
            int r10 = r14.f3328s
            if (r10 == r2) goto L_0x021a
            int r13 = r14.f3328s
            r2 = r16
            r29 = r13
            r13 = r11
            r11 = r29
            goto L_0x022c
        L_0x021a:
            r2 = r16
            r29 = r13
            r13 = r11
            r11 = r29
            goto L_0x022c
        L_0x0222:
            r17 = r2
            r2 = r0
            r0 = r16
            r29 = r13
            r13 = r11
            r11 = r29
        L_0x022c:
            int r10 = r14.f3322m
            r16 = r4
            r4 = -1
            if (r10 == r4) goto L_0x0251
            a.f.a.j.f r4 = r1.mo4305d(r10)
            if (r4 == 0) goto L_0x0243
            float r10 = r14.f3324o
            r18 = r7
            int r7 = r14.f3323n
            r15.mo2055f(r4, r10, r7)
            goto L_0x0245
        L_0x0243:
            r18 = r7
        L_0x0245:
            r20 = r0
            r21 = r9
            r19 = r11
            r9 = r12
            r4 = r13
            r7 = r14
            r14 = r15
            goto L_0x03c6
        L_0x0251:
            r18 = r7
            r4 = -1
            if (r0 == r4) goto L_0x0286
            a.f.a.j.f r4 = r1.mo4305d(r0)
            if (r4 == 0) goto L_0x0279
            a.f.a.j.e$d r7 = p000a.p019f.p020a.p021j.C0286e.C0290d.LEFT
            int r10 = r14.leftMargin
            r19 = r10
            r10 = r15
            r20 = r0
            r0 = r11
            r11 = r7
            r21 = r9
            r9 = r12
            r12 = r4
            r22 = r4
            r4 = r13
            r13 = r7
            r7 = r14
            r14 = r19
            r19 = r15
            r15 = r5
            r10.mo2033J(r11, r12, r13, r14, r15)
            goto L_0x02a8
        L_0x0279:
            r20 = r0
            r22 = r4
            r21 = r9
            r0 = r11
            r9 = r12
            r4 = r13
            r7 = r14
            r19 = r15
            goto L_0x02a8
        L_0x0286:
            r20 = r0
            r21 = r9
            r0 = r11
            r9 = r12
            r4 = r13
            r7 = r14
            r19 = r15
            r10 = -1
            if (r4 == r10) goto L_0x02a8
            a.f.a.j.f r22 = r1.mo4305d(r4)
            if (r22 == 0) goto L_0x02a9
            a.f.a.j.e$d r11 = p000a.p019f.p020a.p021j.C0286e.C0290d.LEFT
            a.f.a.j.e$d r13 = p000a.p019f.p020a.p021j.C0286e.C0290d.RIGHT
            int r14 = r7.leftMargin
            r10 = r19
            r12 = r22
            r15 = r5
            r10.mo2033J(r11, r12, r13, r14, r15)
            goto L_0x02a9
        L_0x02a8:
        L_0x02a9:
            r10 = -1
            if (r9 == r10) goto L_0x02c1
            a.f.a.j.f r22 = r1.mo4305d(r9)
            if (r22 == 0) goto L_0x02d8
            a.f.a.j.e$d r11 = p000a.p019f.p020a.p021j.C0286e.C0290d.RIGHT
            a.f.a.j.e$d r13 = p000a.p019f.p020a.p021j.C0286e.C0290d.LEFT
            int r14 = r7.rightMargin
            r10 = r19
            r12 = r22
            r15 = r6
            r10.mo2033J(r11, r12, r13, r14, r15)
            goto L_0x02d8
        L_0x02c1:
            r10 = -1
            if (r0 == r10) goto L_0x02d8
            a.f.a.j.f r22 = r1.mo4305d(r0)
            if (r22 == 0) goto L_0x02d9
            a.f.a.j.e$d r13 = p000a.p019f.p020a.p021j.C0286e.C0290d.RIGHT
            int r14 = r7.rightMargin
            r10 = r19
            r11 = r13
            r12 = r22
            r15 = r6
            r10.mo2033J(r11, r12, r13, r14, r15)
            goto L_0x02d9
        L_0x02d8:
        L_0x02d9:
            int r10 = r7.f3312h
            r11 = -1
            if (r10 == r11) goto L_0x02f3
            a.f.a.j.f r22 = r1.mo4305d(r10)
            if (r22 == 0) goto L_0x030e
            a.f.a.j.e$d r13 = p000a.p019f.p020a.p021j.C0286e.C0290d.TOP
            int r14 = r7.topMargin
            int r15 = r7.f3330u
            r10 = r19
            r11 = r13
            r12 = r22
            r10.mo2033J(r11, r12, r13, r14, r15)
            goto L_0x030e
        L_0x02f3:
            int r10 = r7.f3314i
            r11 = -1
            if (r10 == r11) goto L_0x030e
            a.f.a.j.f r22 = r1.mo4305d(r10)
            if (r22 == 0) goto L_0x030f
            a.f.a.j.e$d r11 = p000a.p019f.p020a.p021j.C0286e.C0290d.TOP
            a.f.a.j.e$d r13 = p000a.p019f.p020a.p021j.C0286e.C0290d.BOTTOM
            int r14 = r7.topMargin
            int r15 = r7.f3330u
            r10 = r19
            r12 = r22
            r10.mo2033J(r11, r12, r13, r14, r15)
            goto L_0x030f
        L_0x030e:
        L_0x030f:
            int r10 = r7.f3316j
            r11 = -1
            if (r10 == r11) goto L_0x032a
            a.f.a.j.f r22 = r1.mo4305d(r10)
            if (r22 == 0) goto L_0x0344
            a.f.a.j.e$d r11 = p000a.p019f.p020a.p021j.C0286e.C0290d.BOTTOM
            a.f.a.j.e$d r13 = p000a.p019f.p020a.p021j.C0286e.C0290d.TOP
            int r14 = r7.bottomMargin
            int r15 = r7.f3332w
            r10 = r19
            r12 = r22
            r10.mo2033J(r11, r12, r13, r14, r15)
            goto L_0x0344
        L_0x032a:
            int r10 = r7.f3318k
            r11 = -1
            if (r10 == r11) goto L_0x0344
            a.f.a.j.f r22 = r1.mo4305d(r10)
            if (r22 == 0) goto L_0x0345
            a.f.a.j.e$d r13 = p000a.p019f.p020a.p021j.C0286e.C0290d.BOTTOM
            int r14 = r7.bottomMargin
            int r15 = r7.f3332w
            r10 = r19
            r11 = r13
            r12 = r22
            r10.mo2033J(r11, r12, r13, r14, r15)
            goto L_0x0345
        L_0x0344:
        L_0x0345:
            int r10 = r7.f3320l
            r11 = -1
            if (r10 == r11) goto L_0x03a7
            android.util.SparseArray<android.view.View> r11 = r1.f3256b
            java.lang.Object r10 = r11.get(r10)
            android.view.View r10 = (android.view.View) r10
            int r11 = r7.f3320l
            a.f.a.j.f r11 = r1.mo4305d(r11)
            if (r11 == 0) goto L_0x03a2
            if (r10 == 0) goto L_0x03a2
            android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
            boolean r12 = r12 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0820a
            if (r12 == 0) goto L_0x03a2
            android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r12 = (androidx.constraintlayout.widget.ConstraintLayout.C0820a) r12
            r13 = 1
            r7.f3294W = r13
            r12.f3294W = r13
            a.f.a.j.e$d r13 = p000a.p019f.p020a.p021j.C0286e.C0290d.BASELINE
            r14 = r19
            a.f.a.j.e r15 = r14.mo2059h(r13)
            a.f.a.j.e r13 = r11.mo2059h(r13)
            r24 = 0
            r25 = -1
            a.f.a.j.e$c r26 = p000a.p019f.p020a.p021j.C0286e.C0289c.STRONG
            r27 = 0
            r28 = 1
            r22 = r15
            r23 = r13
            r22.mo2001a(r23, r24, r25, r26, r27, r28)
            r19 = r0
            a.f.a.j.e$d r0 = p000a.p019f.p020a.p021j.C0286e.C0290d.TOP
            a.f.a.j.e r0 = r14.mo2059h(r0)
            r0.mo2013m()
            a.f.a.j.e$d r0 = p000a.p019f.p020a.p021j.C0286e.C0290d.BOTTOM
            a.f.a.j.e r0 = r14.mo2059h(r0)
            r0.mo2013m()
            goto L_0x03ab
        L_0x03a2:
            r14 = r19
            r19 = r0
            goto L_0x03ab
        L_0x03a7:
            r14 = r19
            r19 = r0
        L_0x03ab:
            r0 = 1056964608(0x3f000000, float:0.5)
            r10 = 0
            int r11 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x03b9
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x03b9
            r14.mo2052d0(r2)
        L_0x03b9:
            float r11 = r7.f3272A
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x03c6
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x03c6
            r14.mo2080r0(r11)
        L_0x03c6:
            if (r3 == 0) goto L_0x03d6
            int r0 = r7.f3287P
            r10 = -1
            if (r0 != r10) goto L_0x03d1
            int r11 = r7.f3288Q
            if (r11 == r10) goto L_0x03d6
        L_0x03d1:
            int r10 = r7.f3288Q
            r14.mo2074o0(r0, r10)
        L_0x03d6:
            boolean r0 = r7.f3292U
            if (r0 != 0) goto L_0x0403
            int r0 = r7.width
            r10 = -1
            if (r0 != r10) goto L_0x03f9
            a.f.a.j.f$b r0 = p000a.p019f.p020a.p021j.C0291f.C0293b.MATCH_PARENT
            r14.mo2058g0(r0)
            a.f.a.j.e$d r0 = p000a.p019f.p020a.p021j.C0286e.C0290d.LEFT
            a.f.a.j.e r0 = r14.mo2059h(r0)
            int r10 = r7.leftMargin
            r0.f1360e = r10
            a.f.a.j.e$d r0 = p000a.p019f.p020a.p021j.C0286e.C0290d.RIGHT
            a.f.a.j.e r0 = r14.mo2059h(r0)
            int r10 = r7.rightMargin
            r0.f1360e = r10
            goto L_0x040d
        L_0x03f9:
            a.f.a.j.f$b r0 = p000a.p019f.p020a.p021j.C0291f.C0293b.MATCH_CONSTRAINT
            r14.mo2058g0(r0)
            r10 = 0
            r14.mo2095y0(r10)
            goto L_0x040d
        L_0x0403:
            a.f.a.j.f$b r0 = p000a.p019f.p020a.p021j.C0291f.C0293b.FIXED
            r14.mo2058g0(r0)
            int r0 = r7.width
            r14.mo2095y0(r0)
        L_0x040d:
            boolean r0 = r7.f3293V
            if (r0 != 0) goto L_0x043b
            int r0 = r7.height
            r10 = -1
            if (r0 != r10) goto L_0x0431
            a.f.a.j.f$b r0 = p000a.p019f.p020a.p021j.C0291f.C0293b.MATCH_PARENT
            r14.mo2087u0(r0)
            a.f.a.j.e$d r0 = p000a.p019f.p020a.p021j.C0286e.C0290d.TOP
            a.f.a.j.e r0 = r14.mo2059h(r0)
            int r11 = r7.topMargin
            r0.f1360e = r11
            a.f.a.j.e$d r0 = p000a.p019f.p020a.p021j.C0286e.C0290d.BOTTOM
            a.f.a.j.e r0 = r14.mo2059h(r0)
            int r11 = r7.bottomMargin
            r0.f1360e = r11
            r11 = 0
            goto L_0x0447
        L_0x0431:
            a.f.a.j.f$b r0 = p000a.p019f.p020a.p021j.C0291f.C0293b.MATCH_CONSTRAINT
            r14.mo2087u0(r0)
            r11 = 0
            r14.mo2050b0(r11)
            goto L_0x0447
        L_0x043b:
            r10 = -1
            r11 = 0
            a.f.a.j.f$b r0 = p000a.p019f.p020a.p021j.C0291f.C0293b.FIXED
            r14.mo2087u0(r0)
            int r0 = r7.height
            r14.mo2050b0(r0)
        L_0x0447:
            java.lang.String r0 = r7.f3273B
            if (r0 == 0) goto L_0x044e
            r14.mo2046Y(r0)
        L_0x044e:
            float r0 = r7.f3275D
            r14.mo2062i0(r0)
            float r0 = r7.f3276E
            r14.mo2091w0(r0)
            int r0 = r7.f3277F
            r14.mo2054e0(r0)
            int r0 = r7.f3278G
            r14.mo2082s0(r0)
            int r0 = r7.f3279H
            int r12 = r7.f3281J
            int r13 = r7.f3283L
            float r15 = r7.f3285N
            r14.mo2060h0(r0, r12, r13, r15)
            int r0 = r7.f3280I
            int r12 = r7.f3282K
            int r13 = r7.f3284M
            float r15 = r7.f3286O
            r14.mo2089v0(r0, r12, r13, r15)
        L_0x0478:
            int r8 = r8 + 1
            r4 = r16
            r2 = r17
            r7 = r18
            r5 = 0
            r6 = -1
            goto L_0x00c0
        L_0x0484:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo4320j():void");
    }

    /* renamed from: d */
    public final C0291f mo4305d(int id) {
        if (id == 0) {
            return this.f3259e;
        }
        View view = this.f3256b.get(id);
        if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f3259e;
        }
        if (view == null) {
            return null;
        }
        return ((C0820a) view.getLayoutParams()).f3319k0;
    }

    /* renamed from: f */
    public final C0291f mo4308f(View view) {
        if (view == this) {
            return this.f3259e;
        }
        if (view == null) {
            return null;
        }
        return ((C0820a) view.getLayoutParams()).f3319k0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        r13 = r8.f3293V;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4318h(int r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = r21.getPaddingTop()
            int r4 = r21.getPaddingBottom()
            int r3 = r3 + r4
            int r4 = r21.getPaddingLeft()
            int r5 = r21.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r21.getChildCount()
            r6 = 0
        L_0x001d:
            if (r6 >= r5) goto L_0x010d
            android.view.View r7 = r0.getChildAt(r6)
            int r8 = r7.getVisibility()
            r9 = 8
            if (r8 != r9) goto L_0x002f
            r18 = r3
            goto L_0x0103
        L_0x002f:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.C0820a) r8
            a.f.a.j.f r9 = r8.f3319k0
            boolean r10 = r8.f3295X
            if (r10 != 0) goto L_0x0101
            boolean r10 = r8.f3296Y
            if (r10 == 0) goto L_0x0043
            r18 = r3
            goto L_0x0103
        L_0x0043:
            int r10 = r7.getVisibility()
            r9.mo2093x0(r10)
            int r10 = r8.width
            int r11 = r8.height
            boolean r12 = r8.f3292U
            r14 = 1
            r15 = -1
            if (r12 != 0) goto L_0x006f
            boolean r13 = r8.f3293V
            if (r13 != 0) goto L_0x006f
            if (r12 != 0) goto L_0x005e
            int r12 = r8.f3279H
            if (r12 == r14) goto L_0x006f
        L_0x005e:
            int r12 = r8.width
            if (r12 == r15) goto L_0x006f
            if (r13 != 0) goto L_0x006d
            int r12 = r8.f3280I
            if (r12 == r14) goto L_0x006f
            int r12 = r8.height
            if (r12 != r15) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r12 = 0
            goto L_0x0070
        L_0x006f:
            r12 = 1
        L_0x0070:
            r13 = 0
            r16 = 0
            if (r12 == 0) goto L_0x00e0
            r14 = -2
            if (r10 != 0) goto L_0x0080
            int r17 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r14)
            r13 = 1
            r18 = r17
            goto L_0x0092
        L_0x0080:
            if (r10 != r15) goto L_0x0089
            int r17 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r15)
            r18 = r17
            goto L_0x0092
        L_0x0089:
            if (r10 != r14) goto L_0x008c
            r13 = 1
        L_0x008c:
            int r17 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r10)
            r18 = r17
        L_0x0092:
            if (r11 != 0) goto L_0x009d
            int r17 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r14)
            r16 = 1
            r15 = r17
            goto L_0x00b0
        L_0x009d:
            if (r11 != r15) goto L_0x00a6
            int r17 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r15)
            r15 = r17
            goto L_0x00b0
        L_0x00a6:
            if (r11 != r14) goto L_0x00aa
            r16 = 1
        L_0x00aa:
            int r17 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r11)
            r15 = r17
        L_0x00b0:
            r14 = r18
            r7.measure(r14, r15)
            a.f.a.f r1 = r0.f3271q
            if (r1 == 0) goto L_0x00c4
            r18 = r3
            long r2 = r1.f1291a
            r19 = 1
            long r2 = r2 + r19
            r1.f1291a = r2
            goto L_0x00c6
        L_0x00c4:
            r18 = r3
        L_0x00c6:
            r1 = -2
            if (r10 != r1) goto L_0x00cb
            r2 = 1
            goto L_0x00cc
        L_0x00cb:
            r2 = 0
        L_0x00cc:
            r9.mo2097z0(r2)
            if (r11 != r1) goto L_0x00d3
            r1 = 1
            goto L_0x00d4
        L_0x00d3:
            r1 = 0
        L_0x00d4:
            r9.mo2051c0(r1)
            int r10 = r7.getMeasuredWidth()
            int r11 = r7.getMeasuredHeight()
            goto L_0x00e2
        L_0x00e0:
            r18 = r3
        L_0x00e2:
            r9.mo2095y0(r10)
            r9.mo2050b0(r11)
            if (r13 == 0) goto L_0x00ed
            r9.mo2019B0(r10)
        L_0x00ed:
            if (r16 == 0) goto L_0x00f2
            r9.mo2017A0(r11)
        L_0x00f2:
            boolean r1 = r8.f3294W
            if (r1 == 0) goto L_0x0103
            int r1 = r7.getBaseline()
            r2 = -1
            if (r1 == r2) goto L_0x0103
            r9.mo2043V(r1)
            goto L_0x0103
        L_0x0101:
            r18 = r3
        L_0x0103:
            int r6 = r6 + 1
            r1 = r22
            r2 = r23
            r3 = r18
            goto L_0x001d
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo4318h(int, int):void");
    }

    /* renamed from: o */
    public final void mo4325o() {
        int widgetsCount = getChildCount();
        for (int i = 0; i < widgetsCount; i++) {
            View child = getChildAt(i);
            if (child instanceof C0315f) {
                ((C0315f) child).mo2199a(this);
            }
        }
        int helperCount = this.f3257c.size();
        if (helperCount > 0) {
            for (int i2 = 0; i2 < helperCount; i2++) {
                this.f3257c.get(i2).mo2166d(this);
            }
        }
    }

    /* renamed from: i */
    public final void mo4319i(int parentWidthSpec, int parentHeightSpec) {
        int i;
        int heightPadding;
        int i2;
        int widgetsCount;
        int childWidthMeasureSpec;
        int childHeightMeasureSpec;
        boolean didWrapMeasureWidth;
        int heightPadding2;
        int heightPadding3;
        int baseline;
        int i3 = parentWidthSpec;
        int i4 = parentHeightSpec;
        int heightPadding4 = getPaddingTop() + getPaddingBottom();
        int widthPadding = getPaddingLeft() + getPaddingRight();
        int widgetsCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            i = 8;
            if (i5 >= widgetsCount2) {
                break;
            }
            View child = getChildAt(i5);
            if (child.getVisibility() == 8) {
                heightPadding2 = heightPadding4;
            } else {
                C0820a params = (C0820a) child.getLayoutParams();
                C0291f widget = params.f3319k0;
                if (params.f3295X) {
                    heightPadding2 = heightPadding4;
                } else if (params.f3296Y) {
                    heightPadding2 = heightPadding4;
                } else {
                    widget.mo2093x0(child.getVisibility());
                    int width = params.width;
                    int height = params.height;
                    if (width == 0) {
                        heightPadding3 = heightPadding4;
                    } else if (height == 0) {
                        heightPadding3 = heightPadding4;
                    } else {
                        boolean didWrapMeasureWidth2 = false;
                        boolean didWrapMeasureHeight = false;
                        if (width == -2) {
                            didWrapMeasureWidth2 = true;
                        }
                        int childWidthMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, widthPadding, width);
                        if (height == -2) {
                            didWrapMeasureHeight = true;
                        }
                        child.measure(childWidthMeasureSpec2, ViewGroup.getChildMeasureSpec(i4, heightPadding4, height));
                        C0277f fVar = this.f3271q;
                        if (fVar != null) {
                            heightPadding2 = heightPadding4;
                            fVar.f1291a++;
                        } else {
                            heightPadding2 = heightPadding4;
                        }
                        widget.mo2097z0(width == -2);
                        widget.mo2051c0(height == -2);
                        int width2 = child.getMeasuredWidth();
                        int height2 = child.getMeasuredHeight();
                        widget.mo2095y0(width2);
                        widget.mo2050b0(height2);
                        if (didWrapMeasureWidth2) {
                            widget.mo2019B0(width2);
                        }
                        if (didWrapMeasureHeight) {
                            widget.mo2017A0(height2);
                        }
                        if (params.f3294W && (baseline = child.getBaseline()) != -1) {
                            widget.mo2043V(baseline);
                        }
                        if (params.f3292U != 0 && params.f3293V) {
                            widget.mo2092x().mo2147h(width2);
                            widget.mo2090w().mo2147h(height2);
                        }
                    }
                    widget.mo2092x().mo2150c();
                    widget.mo2090w().mo2150c();
                }
            }
            i5++;
            i4 = parentHeightSpec;
            heightPadding4 = heightPadding2;
        }
        int heightPadding5 = heightPadding4;
        this.f3259e.mo2116e1();
        int i6 = 0;
        while (i6 < widgetsCount2) {
            View child2 = getChildAt(i6);
            if (child2.getVisibility() == i) {
                i2 = i6;
                widgetsCount = widgetsCount2;
                heightPadding = heightPadding5;
            } else {
                C0820a params2 = (C0820a) child2.getLayoutParams();
                C0291f widget2 = params2.f3319k0;
                if (params2.f3295X) {
                    i2 = i6;
                    widgetsCount = widgetsCount2;
                    heightPadding = heightPadding5;
                } else if (params2.f3296Y) {
                    i2 = i6;
                    widgetsCount = widgetsCount2;
                    heightPadding = heightPadding5;
                } else {
                    widget2.mo2093x0(child2.getVisibility());
                    int width3 = params2.width;
                    int height3 = params2.height;
                    if (width3 == 0 || height3 == 0) {
                        C0286e.C0290d dVar = C0286e.C0290d.LEFT;
                        C0301m left = widget2.mo2059h(dVar).mo2006f();
                        C0286e.C0290d dVar2 = C0286e.C0290d.RIGHT;
                        C0301m right = widget2.mo2059h(dVar2).mo2006f();
                        boolean bothHorizontal = (widget2.mo2059h(dVar).mo2009i() == null || widget2.mo2059h(dVar2).mo2009i() == null) ? false : true;
                        C0286e.C0290d dVar3 = C0286e.C0290d.TOP;
                        C0301m top = widget2.mo2059h(dVar3).mo2006f();
                        C0286e.C0290d dVar4 = C0286e.C0290d.BOTTOM;
                        C0301m bottom = widget2.mo2059h(dVar4).mo2006f();
                        boolean bothVertical = (widget2.mo2059h(dVar3).mo2009i() == null || widget2.mo2059h(dVar4).mo2009i() == null) ? false : true;
                        if (width3 != 0 || height3 != 0 || !bothHorizontal || !bothVertical) {
                            boolean didWrapMeasureHeight2 = false;
                            widgetsCount = widgetsCount2;
                            C0291f.C0293b s = this.f3259e.mo2081s();
                            boolean didWrapMeasureWidth3 = false;
                            C0291f.C0293b bVar = C0291f.C0293b.WRAP_CONTENT;
                            boolean resolveWidth = s != bVar;
                            i2 = i6;
                            boolean resolveHeight = this.f3259e.mo2018B() != bVar;
                            if (!resolveWidth) {
                                widget2.mo2092x().mo2150c();
                            }
                            if (!resolveHeight) {
                                widget2.mo2090w().mo2150c();
                            }
                            if (width3 == 0) {
                                if (!resolveWidth || !widget2.mo2039P() || !bothHorizontal || !left.mo2151d() || !right.mo2151d()) {
                                    resolveWidth = false;
                                    didWrapMeasureWidth3 = true;
                                    childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding, -2);
                                } else {
                                    width3 = (int) (right.mo2138k() - left.mo2138k());
                                    widget2.mo2092x().mo2147h(width3);
                                    childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding, width3);
                                }
                            } else if (width3 == -1) {
                                childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding, -1);
                            } else {
                                if (width3 == -2) {
                                    didWrapMeasureWidth = true;
                                } else {
                                    didWrapMeasureWidth = false;
                                }
                                didWrapMeasureWidth3 = didWrapMeasureWidth;
                                childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding, width3);
                            }
                            if (height3 != 0) {
                                int i7 = parentHeightSpec;
                                boolean resolveHeight2 = resolveHeight;
                                if (height3 == -1) {
                                    resolveHeight = resolveHeight2;
                                    childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(i7, heightPadding5, -1);
                                } else {
                                    if (height3 == -2) {
                                        didWrapMeasureHeight2 = true;
                                    }
                                    childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(i7, heightPadding5, height3);
                                    resolveHeight = resolveHeight2;
                                }
                            } else if (!resolveHeight || !widget2.mo2038O() || !bothVertical || !top.mo2151d() || !bottom.mo2151d()) {
                                boolean z = resolveHeight;
                                didWrapMeasureHeight2 = true;
                                resolveHeight = false;
                                childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding5, -2);
                            } else {
                                height3 = (int) (bottom.mo2138k() - top.mo2138k());
                                widget2.mo2090w().mo2147h(height3);
                                childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding5, height3);
                            }
                            child2.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                            int i8 = childHeightMeasureSpec;
                            C0277f fVar2 = this.f3271q;
                            if (fVar2 != null) {
                                heightPadding = heightPadding5;
                                boolean z2 = bothVertical;
                                fVar2.f1291a++;
                            } else {
                                heightPadding = heightPadding5;
                                boolean z3 = bothVertical;
                            }
                            widget2.mo2097z0(width3 == -2);
                            widget2.mo2051c0(height3 == -2);
                            int width4 = child2.getMeasuredWidth();
                            int height4 = child2.getMeasuredHeight();
                            widget2.mo2095y0(width4);
                            widget2.mo2050b0(height4);
                            if (didWrapMeasureWidth3) {
                                widget2.mo2019B0(width4);
                            }
                            if (didWrapMeasureHeight2) {
                                widget2.mo2017A0(height4);
                            }
                            if (resolveWidth) {
                                widget2.mo2092x().mo2147h(width4);
                            } else {
                                widget2.mo2092x().mo2146g();
                            }
                            if (resolveHeight) {
                                widget2.mo2090w().mo2147h(height4);
                            } else {
                                widget2.mo2090w().mo2146g();
                            }
                            if (params2.f3294W) {
                                int baseline2 = child2.getBaseline();
                                if (baseline2 != -1) {
                                    widget2.mo2043V(baseline2);
                                }
                            }
                        } else {
                            i2 = i6;
                            widgetsCount = widgetsCount2;
                            heightPadding = heightPadding5;
                        }
                    } else {
                        i2 = i6;
                        widgetsCount = widgetsCount2;
                        heightPadding = heightPadding5;
                    }
                }
            }
            i6 = i2 + 1;
            i3 = parentWidthSpec;
            widgetsCount2 = widgetsCount;
            heightPadding5 = heightPadding;
            i = 8;
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int childState;
        int startingHeight;
        int startingWidth;
        int sizeDependentWidgetsCount;
        int startingHeight2;
        boolean containerWrapHeight;
        boolean containerWrapWidth;
        boolean needSolverPass;
        int startingWidth2;
        int i;
        int i2;
        int widthSpec;
        int heightSpec;
        int baseline;
        int i3 = widthMeasureSpec;
        int i4 = heightMeasureSpec;
        int i5 = Build.VERSION.SDK_INT;
        long time = System.currentTimeMillis();
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f3259e.mo2021C0(paddingLeft);
        this.f3259e.mo2023D0(paddingTop);
        this.f3259e.mo2066k0(this.f3262h);
        this.f3259e.mo2064j0(this.f3263i);
        if (i5 >= 17) {
            long j = time;
            this.f3259e.mo2115d1(getLayoutDirection() == 1);
        }
        mo4322l(widthMeasureSpec, heightMeasureSpec);
        int startingWidth3 = this.f3259e.mo2022D();
        int startingHeight3 = this.f3259e.mo2079r();
        boolean runAnalyzer = false;
        if (this.f3264j) {
            this.f3264j = false;
            mo4324n();
            runAnalyzer = true;
        }
        int REMEASURES_A = 0;
        boolean optimiseDimensions = (this.f3265k & 8) == 8;
        if (optimiseDimensions) {
            this.f3259e.mo2112a1();
            this.f3259e.mo2110Y0(startingWidth3, startingHeight3);
            mo4319i(widthMeasureSpec, heightMeasureSpec);
        } else {
            mo4318h(widthMeasureSpec, heightMeasureSpec);
        }
        mo4325o();
        if (getChildCount() > 0 && runAnalyzer) {
            C0282a.m1498a(this.f3259e);
        }
        C0294g gVar = this.f3259e;
        if (gVar.f1470x0 != 0) {
            boolean z = runAnalyzer;
            if (gVar.f1471y0 && widthMode == Integer.MIN_VALUE) {
                int i6 = gVar.f1452A0;
                if (i6 < widthSize) {
                    gVar.mo2095y0(i6);
                }
                this.f3259e.mo2058g0(C0291f.C0293b.FIXED);
            }
            C0294g gVar2 = this.f3259e;
            if (gVar2.f1472z0 && heightMode == Integer.MIN_VALUE) {
                int i7 = gVar2.f1453B0;
                if (i7 < heightSize) {
                    gVar2.mo2050b0(i7);
                }
                this.f3259e.mo2087u0(C0291f.C0293b.FIXED);
            }
        }
        if ((this.f3265k & 32) == 32) {
            int width = this.f3259e.mo2022D();
            int height = this.f3259e.mo2079r();
            if (this.f3269o == width || widthMode != 1073741824) {
            } else {
                int i8 = widthMode;
                C0282a.m1506i(this.f3259e.f1469w0, 0, width);
            }
            if (this.f3270p != height && heightMode == 1073741824) {
                C0282a.m1506i(this.f3259e.f1469w0, 1, height);
            }
            C0294g gVar3 = this.f3259e;
            if (gVar3.f1471y0 && gVar3.f1452A0 > widthSize) {
                C0282a.m1506i(gVar3.f1469w0, 0, widthSize);
            }
            C0294g gVar4 = this.f3259e;
            if (gVar4.f1472z0 && gVar4.f1453B0 > heightSize) {
                C0282a.m1506i(gVar4.f1469w0, 1, heightSize);
            }
        }
        if (getChildCount() > 0) {
            mo4323m("First pass");
        }
        int sizeDependentWidgetsCount2 = this.f3258d.size();
        int heightPadding = getPaddingBottom() + paddingTop;
        int widthPadding = paddingLeft + getPaddingRight();
        if (sizeDependentWidgetsCount2 > 0) {
            C0291f.C0293b s = this.f3259e.mo2081s();
            int i9 = widthSize;
            C0291f.C0293b bVar = C0291f.C0293b.WRAP_CONTENT;
            boolean containerWrapWidth2 = s == bVar;
            int i10 = heightMode;
            boolean containerWrapHeight2 = this.f3259e.mo2018B() == bVar;
            int i11 = heightSize;
            int minWidth = Math.max(this.f3259e.mo2022D(), this.f3260f);
            int i12 = paddingLeft;
            int minHeight = Math.max(this.f3259e.mo2079r(), this.f3261g);
            int widthSpec2 = 0;
            boolean needSolverPass2 = false;
            int i13 = paddingTop;
            int childState2 = 0;
            int minWidth2 = minWidth;
            int minWidth3 = i12;
            while (childState2 < sizeDependentWidgetsCount2) {
                int sizeDependentWidgetsCount3 = sizeDependentWidgetsCount2;
                C0291f widget = this.f3258d.get(childState2);
                int startingHeight4 = startingHeight3;
                View child = (View) widget.mo2069m();
                if (child == null) {
                    startingWidth2 = startingWidth3;
                    i = childState2;
                    i2 = widthSpec2;
                } else {
                    startingWidth2 = startingWidth3;
                    C0820a params = (C0820a) child.getLayoutParams();
                    i = childState2;
                    if (params.f3296Y != 0) {
                        i2 = widthSpec2;
                    } else if (params.f3295X) {
                        i2 = widthSpec2;
                    } else {
                        int childState3 = widthSpec2;
                        if (child.getVisibility() == 8) {
                            i2 = childState3;
                        } else if (!optimiseDimensions || !widget.mo2092x().mo2151d() || !widget.mo2090w().mo2151d()) {
                            int widthSpec3 = params.width;
                            if (widthSpec3 != -2 || !params.f3292U) {
                                widthSpec = View.MeasureSpec.makeMeasureSpec(widget.mo2022D(), 1073741824);
                            } else {
                                widthSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding, widthSpec3);
                            }
                            int i14 = params.height;
                            if (i14 != -2 || !params.f3293V) {
                                heightSpec = View.MeasureSpec.makeMeasureSpec(widget.mo2079r(), 1073741824);
                            } else {
                                heightSpec = ViewGroup.getChildMeasureSpec(i4, heightPadding, i14);
                            }
                            child.measure(widthSpec, heightSpec);
                            C0277f fVar = this.f3271q;
                            if (fVar != null) {
                                int i15 = heightSpec;
                                fVar.f1292b++;
                            }
                            REMEASURES_A++;
                            int measuredWidth = child.getMeasuredWidth();
                            int measuredHeight = child.getMeasuredHeight();
                            if (measuredWidth != widget.mo2022D()) {
                                widget.mo2095y0(measuredWidth);
                                if (optimiseDimensions) {
                                    widget.mo2092x().mo2147h(measuredWidth);
                                }
                                if (!containerWrapWidth2 || widget.mo2094y() <= minWidth2) {
                                } else {
                                    int i16 = measuredWidth;
                                    minWidth2 = Math.max(minWidth2, widget.mo2094y() + widget.mo2059h(C0286e.C0290d.RIGHT).mo2004d());
                                }
                                needSolverPass2 = true;
                            }
                            if (measuredHeight != widget.mo2079r()) {
                                widget.mo2050b0(measuredHeight);
                                if (optimiseDimensions) {
                                    widget.mo2090w().mo2147h(measuredHeight);
                                }
                                if (containerWrapHeight2 && widget.mo2067l() > minHeight) {
                                    minHeight = Math.max(minHeight, widget.mo2067l() + widget.mo2059h(C0286e.C0290d.BOTTOM).mo2004d());
                                }
                                needSolverPass2 = true;
                            }
                            if (!(!params.f3294W || (baseline = child.getBaseline()) == -1 || baseline == widget.mo2063j())) {
                                widget.mo2043V(baseline);
                                needSolverPass2 = true;
                            }
                            if (i5 >= 11) {
                                widthSpec2 = ViewGroup.combineMeasuredStates(childState3, child.getMeasuredState());
                            } else {
                                widthSpec2 = childState3;
                            }
                            childState2 = i + 1;
                            i3 = widthMeasureSpec;
                            i4 = heightMeasureSpec;
                            sizeDependentWidgetsCount2 = sizeDependentWidgetsCount3;
                            startingHeight3 = startingHeight4;
                            startingWidth3 = startingWidth2;
                        } else {
                            i2 = childState3;
                        }
                    }
                }
                widthSpec2 = i2;
                childState2 = i + 1;
                i3 = widthMeasureSpec;
                i4 = heightMeasureSpec;
                sizeDependentWidgetsCount2 = sizeDependentWidgetsCount3;
                startingHeight3 = startingHeight4;
                startingWidth3 = startingWidth2;
            }
            int startingWidth4 = startingWidth3;
            int startingHeight5 = startingHeight3;
            int sizeDependentWidgetsCount4 = sizeDependentWidgetsCount2;
            int i17 = childState2;
            int childState4 = widthSpec2;
            if (needSolverPass2) {
                startingWidth = startingWidth4;
                this.f3259e.mo2095y0(startingWidth);
                startingHeight = startingHeight5;
                this.f3259e.mo2050b0(startingHeight);
                if (optimiseDimensions) {
                    this.f3259e.mo2116e1();
                }
                mo4323m("2nd pass");
                boolean needSolverPass3 = false;
                if (this.f3259e.mo2022D() < minWidth2) {
                    this.f3259e.mo2095y0(minWidth2);
                    needSolverPass3 = true;
                }
                if (this.f3259e.mo2079r() < minHeight) {
                    this.f3259e.mo2050b0(minHeight);
                    needSolverPass = true;
                } else {
                    needSolverPass = needSolverPass3;
                }
                if (needSolverPass) {
                    mo4323m("3rd pass");
                }
            } else {
                startingHeight = startingHeight5;
                startingWidth = startingWidth4;
            }
            int i18 = 0;
            int REMEASURES_B = 0;
            while (true) {
                sizeDependentWidgetsCount = sizeDependentWidgetsCount4;
                if (i18 >= sizeDependentWidgetsCount) {
                    break;
                }
                C0291f widget2 = this.f3258d.get(i18);
                int startingWidth5 = startingWidth;
                View child2 = (View) widget2.mo2069m();
                if (child2 == null) {
                    startingHeight2 = startingHeight;
                    sizeDependentWidgetsCount4 = sizeDependentWidgetsCount;
                    containerWrapWidth = containerWrapWidth2;
                    containerWrapHeight = containerWrapHeight2;
                } else {
                    startingHeight2 = startingHeight;
                    sizeDependentWidgetsCount4 = sizeDependentWidgetsCount;
                    if (child2.getMeasuredWidth() == widget2.mo2022D() && child2.getMeasuredHeight() == widget2.mo2079r()) {
                        containerWrapWidth = containerWrapWidth2;
                        containerWrapHeight = containerWrapHeight2;
                    } else if (widget2.mo2020C() != 8) {
                        containerWrapWidth = containerWrapWidth2;
                        child2.measure(View.MeasureSpec.makeMeasureSpec(widget2.mo2022D(), 1073741824), View.MeasureSpec.makeMeasureSpec(widget2.mo2079r(), 1073741824));
                        C0277f fVar2 = this.f3271q;
                        if (fVar2 != null) {
                            containerWrapHeight = containerWrapHeight2;
                            C0291f fVar3 = widget2;
                            fVar2.f1292b++;
                        } else {
                            containerWrapHeight = containerWrapHeight2;
                            C0291f fVar4 = widget2;
                        }
                        REMEASURES_B++;
                    } else {
                        containerWrapWidth = containerWrapWidth2;
                        containerWrapHeight = containerWrapHeight2;
                        C0291f fVar5 = widget2;
                    }
                }
                i18++;
                containerWrapWidth2 = containerWrapWidth;
                containerWrapHeight2 = containerWrapHeight;
                startingHeight = startingHeight2;
                startingWidth = startingWidth5;
            }
            int i19 = startingHeight;
            int i20 = sizeDependentWidgetsCount;
            boolean z2 = containerWrapWidth2;
            boolean z3 = containerWrapHeight2;
            childState = childState4;
        } else {
            int i21 = startingHeight3;
            int i22 = sizeDependentWidgetsCount2;
            int i23 = widthSize;
            int i24 = heightMode;
            int i25 = heightSize;
            int i26 = paddingLeft;
            int i27 = paddingTop;
            childState = 0;
        }
        int androidLayoutWidth = this.f3259e.mo2022D() + widthPadding;
        int androidLayoutHeight = this.f3259e.mo2079r() + heightPadding;
        if (i5 >= 11) {
            int resolvedWidthSize = Math.min(this.f3262h, ViewGroup.resolveSizeAndState(androidLayoutWidth, widthMeasureSpec, childState) & 16777215);
            int resolvedHeightSize = Math.min(this.f3263i, ViewGroup.resolveSizeAndState(androidLayoutHeight, heightMeasureSpec, childState << 16) & 16777215);
            if (this.f3259e.mo2107V0()) {
                resolvedWidthSize |= 16777216;
            }
            if (this.f3259e.mo2105T0()) {
                resolvedHeightSize |= 16777216;
            }
            setMeasuredDimension(resolvedWidthSize, resolvedHeightSize);
            this.f3269o = resolvedWidthSize;
            this.f3270p = resolvedHeightSize;
            return;
        }
        int i28 = widthMeasureSpec;
        int i29 = heightMeasureSpec;
        setMeasuredDimension(androidLayoutWidth, androidLayoutHeight);
        this.f3269o = androidLayoutWidth;
        this.f3270p = androidLayoutHeight;
    }

    /* renamed from: l */
    public final void mo4322l(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int heightPadding = getPaddingTop() + getPaddingBottom();
        int widthPadding = getPaddingLeft() + getPaddingRight();
        C0291f.C0293b widthBehaviour = C0291f.C0293b.FIXED;
        C0291f.C0293b heightBehaviour = C0291f.C0293b.FIXED;
        int desiredWidth = 0;
        int desiredHeight = 0;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (widthMode == Integer.MIN_VALUE) {
            widthBehaviour = C0291f.C0293b.WRAP_CONTENT;
            desiredWidth = widthSize;
        } else if (widthMode == 0) {
            widthBehaviour = C0291f.C0293b.WRAP_CONTENT;
        } else if (widthMode == 1073741824) {
            desiredWidth = Math.min(this.f3262h, widthSize) - widthPadding;
        }
        if (heightMode == Integer.MIN_VALUE) {
            heightBehaviour = C0291f.C0293b.WRAP_CONTENT;
            desiredHeight = heightSize;
        } else if (heightMode == 0) {
            heightBehaviour = C0291f.C0293b.WRAP_CONTENT;
        } else if (heightMode == 1073741824) {
            desiredHeight = Math.min(this.f3263i, heightSize) - heightPadding;
        }
        this.f3259e.mo2070m0(0);
        this.f3259e.mo2068l0(0);
        this.f3259e.mo2058g0(widthBehaviour);
        this.f3259e.mo2095y0(desiredWidth);
        this.f3259e.mo2087u0(heightBehaviour);
        this.f3259e.mo2050b0(desiredHeight);
        this.f3259e.mo2070m0((this.f3260f - getPaddingLeft()) - getPaddingRight());
        this.f3259e.mo2068l0((this.f3261g - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: m */
    public void mo4323m(String reason) {
        this.f3259e.mo2098K0();
        C0277f fVar = this.f3271q;
        if (fVar != null) {
            fVar.f1293c++;
        }
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View content;
        int widgetsCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i = 0; i < widgetsCount; i++) {
            View child = getChildAt(i);
            C0820a params = (C0820a) child.getLayoutParams();
            C0291f widget = params.f3319k0;
            if ((child.getVisibility() != 8 || params.f3295X || params.f3296Y || isInEditMode) && !params.f3297Z) {
                int l = widget.mo2075p();
                int t = widget.mo2077q();
                int r = widget.mo2022D() + l;
                int b = widget.mo2079r() + t;
                child.layout(l, t, r, b);
                if ((child instanceof C0315f) && (content = ((C0315f) child).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(l, t, r, b);
                }
            }
        }
        int helperCount = this.f3257c.size();
        if (helperCount > 0) {
            for (int i2 = 0; i2 < helperCount; i2++) {
                this.f3257c.get(i2).mo2165c(this);
            }
        }
    }

    public void setOptimizationLevel(int level) {
        this.f3259e.mo2114c1(level);
    }

    public int getOptimizationLevel() {
        return this.f3259e.mo2103R0();
    }

    /* renamed from: b */
    public C0820a generateLayoutParams(AttributeSet attrs) {
        return new C0820a(getContext(), attrs);
    }

    /* renamed from: a */
    public C0820a generateDefaultLayoutParams() {
        return new C0820a(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new C0820a(p);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof C0820a;
    }

    public void setConstraintSet(C0309c set) {
        this.f3266l = set;
    }

    /* renamed from: e */
    public View mo4307e(int id) {
        return this.f3256b.get(id);
    }

    public void dispatchDraw(Canvas canvas) {
        float ow;
        float ch;
        float cw;
        int count;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int count2 = getChildCount();
            float cw2 = (float) getWidth();
            float ch2 = (float) getHeight();
            float ow2 = 1080.0f;
            int i = 0;
            while (i < count2) {
                View child = getChildAt(i);
                if (child.getVisibility() == 8) {
                    count = count2;
                    cw = cw2;
                    ch = ch2;
                    ow = ow2;
                } else {
                    Object tag = child.getTag();
                    if (tag == null || !(tag instanceof String)) {
                        count = count2;
                        cw = cw2;
                        ch = ch2;
                        ow = ow2;
                    } else {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int x = Integer.parseInt(split[0]);
                            int y = Integer.parseInt(split[1]);
                            int x2 = (int) ((((float) x) / ow2) * cw2);
                            int y2 = (int) ((((float) y) / 1920.0f) * ch2);
                            int w = (int) ((((float) Integer.parseInt(split[2])) / ow2) * cw2);
                            int h = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * ch2);
                            Paint paint = new Paint();
                            count = count2;
                            paint.setColor(-65536);
                            cw = cw2;
                            ch = ch2;
                            ow = ow2;
                            Canvas canvas2 = canvas;
                            Paint paint2 = paint;
                            canvas2.drawLine((float) x2, (float) y2, (float) (x2 + w), (float) y2, paint2);
                            canvas2.drawLine((float) (x2 + w), (float) y2, (float) (x2 + w), (float) (y2 + h), paint2);
                            canvas2.drawLine((float) (x2 + w), (float) (y2 + h), (float) x2, (float) (y2 + h), paint2);
                            canvas2.drawLine((float) x2, (float) (y2 + h), (float) x2, (float) y2, paint2);
                            paint.setColor(-16711936);
                            canvas2.drawLine((float) x2, (float) y2, (float) (x2 + w), (float) (y2 + h), paint2);
                            canvas2.drawLine((float) x2, (float) (y2 + h), (float) (x2 + w), (float) y2, paint2);
                        } else {
                            count = count2;
                            cw = cw2;
                            ch = ch2;
                            ow = ow2;
                        }
                    }
                }
                i++;
                count2 = count;
                cw2 = cw;
                ch2 = ch;
                ow2 = ow;
            }
            int i2 = count2;
            float f = cw2;
            float f2 = ch2;
            float f3 = ow2;
            return;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0820a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f3272A;

        /* renamed from: B */
        public String f3273B;

        /* renamed from: C */
        public int f3274C;

        /* renamed from: D */
        public float f3275D;

        /* renamed from: E */
        public float f3276E;

        /* renamed from: F */
        public int f3277F;

        /* renamed from: G */
        public int f3278G;

        /* renamed from: H */
        public int f3279H;

        /* renamed from: I */
        public int f3280I;

        /* renamed from: J */
        public int f3281J;

        /* renamed from: K */
        public int f3282K;

        /* renamed from: L */
        public int f3283L;

        /* renamed from: M */
        public int f3284M;

        /* renamed from: N */
        public float f3285N;

        /* renamed from: O */
        public float f3286O;

        /* renamed from: P */
        public int f3287P;

        /* renamed from: Q */
        public int f3288Q;

        /* renamed from: R */
        public int f3289R;

        /* renamed from: S */
        public boolean f3290S;

        /* renamed from: T */
        public boolean f3291T;

        /* renamed from: U */
        public boolean f3292U;

        /* renamed from: V */
        public boolean f3293V;

        /* renamed from: W */
        public boolean f3294W;

        /* renamed from: X */
        public boolean f3295X;

        /* renamed from: Y */
        public boolean f3296Y;

        /* renamed from: Z */
        public boolean f3297Z;

        /* renamed from: a */
        public int f3298a;

        /* renamed from: a0 */
        public int f3299a0;

        /* renamed from: b */
        public int f3300b;

        /* renamed from: b0 */
        public int f3301b0;

        /* renamed from: c */
        public float f3302c;

        /* renamed from: c0 */
        public int f3303c0;

        /* renamed from: d */
        public int f3304d;

        /* renamed from: d0 */
        public int f3305d0;

        /* renamed from: e */
        public int f3306e;

        /* renamed from: e0 */
        public int f3307e0;

        /* renamed from: f */
        public int f3308f;

        /* renamed from: f0 */
        public int f3309f0;

        /* renamed from: g */
        public int f3310g;

        /* renamed from: g0 */
        public float f3311g0;

        /* renamed from: h */
        public int f3312h;

        /* renamed from: h0 */
        public int f3313h0;

        /* renamed from: i */
        public int f3314i;

        /* renamed from: i0 */
        public int f3315i0;

        /* renamed from: j */
        public int f3316j;

        /* renamed from: j0 */
        public float f3317j0;

        /* renamed from: k */
        public int f3318k;

        /* renamed from: k0 */
        public C0291f f3319k0;

        /* renamed from: l */
        public int f3320l;

        /* renamed from: l0 */
        public boolean f3321l0;

        /* renamed from: m */
        public int f3322m;

        /* renamed from: n */
        public int f3323n;

        /* renamed from: o */
        public float f3324o;

        /* renamed from: p */
        public int f3325p;

        /* renamed from: q */
        public int f3326q;

        /* renamed from: r */
        public int f3327r;

        /* renamed from: s */
        public int f3328s;

        /* renamed from: t */
        public int f3329t;

        /* renamed from: u */
        public int f3330u;

        /* renamed from: v */
        public int f3331v;

        /* renamed from: w */
        public int f3332w;

        /* renamed from: x */
        public int f3333x;

        /* renamed from: y */
        public int f3334y;

        /* renamed from: z */
        public float f3335z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        public static class C0821a {

            /* renamed from: a */
            public static final SparseIntArray f3336a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f3336a = sparseIntArray;
                sparseIntArray.append(C0317h.f1643I, 8);
                sparseIntArray.append(C0317h.f1645J, 9);
                sparseIntArray.append(C0317h.f1649L, 10);
                sparseIntArray.append(C0317h.f1651M, 11);
                sparseIntArray.append(C0317h.f1661R, 12);
                sparseIntArray.append(C0317h.f1659Q, 13);
                sparseIntArray.append(C0317h.f1727q, 14);
                sparseIntArray.append(C0317h.f1724p, 15);
                sparseIntArray.append(C0317h.f1718n, 16);
                sparseIntArray.append(C0317h.f1730r, 2);
                sparseIntArray.append(C0317h.f1736t, 3);
                sparseIntArray.append(C0317h.f1733s, 4);
                sparseIntArray.append(C0317h.f1677Z, 49);
                sparseIntArray.append(C0317h.f1680a0, 50);
                sparseIntArray.append(C0317h.f1748x, 5);
                sparseIntArray.append(C0317h.f1751y, 6);
                sparseIntArray.append(C0317h.f1754z, 7);
                sparseIntArray.append(C0317h.f1682b, 1);
                sparseIntArray.append(C0317h.f1653N, 17);
                sparseIntArray.append(C0317h.f1655O, 18);
                sparseIntArray.append(C0317h.f1745w, 19);
                sparseIntArray.append(C0317h.f1742v, 20);
                sparseIntArray.append(C0317h.f1689d0, 21);
                sparseIntArray.append(C0317h.f1698g0, 22);
                sparseIntArray.append(C0317h.f1692e0, 23);
                sparseIntArray.append(C0317h.f1683b0, 24);
                sparseIntArray.append(C0317h.f1695f0, 25);
                sparseIntArray.append(C0317h.f1686c0, 26);
                sparseIntArray.append(C0317h.f1634E, 29);
                sparseIntArray.append(C0317h.f1663S, 30);
                sparseIntArray.append(C0317h.f1739u, 44);
                sparseIntArray.append(C0317h.f1639G, 45);
                sparseIntArray.append(C0317h.f1667U, 46);
                sparseIntArray.append(C0317h.f1637F, 47);
                sparseIntArray.append(C0317h.f1665T, 48);
                sparseIntArray.append(C0317h.f1712l, 27);
                sparseIntArray.append(C0317h.f1709k, 28);
                sparseIntArray.append(C0317h.f1669V, 31);
                sparseIntArray.append(C0317h.f1622A, 32);
                sparseIntArray.append(C0317h.f1673X, 33);
                sparseIntArray.append(C0317h.f1671W, 34);
                sparseIntArray.append(C0317h.f1675Y, 35);
                sparseIntArray.append(C0317h.f1628C, 36);
                sparseIntArray.append(C0317h.f1625B, 37);
                sparseIntArray.append(C0317h.f1631D, 38);
                sparseIntArray.append(C0317h.f1641H, 39);
                sparseIntArray.append(C0317h.f1657P, 40);
                sparseIntArray.append(C0317h.f1647K, 41);
                sparseIntArray.append(C0317h.f1721o, 42);
                sparseIntArray.append(C0317h.f1715m, 43);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0820a(Context c, AttributeSet attrs) {
            super(c, attrs);
            int commaIndex;
            int i = -1;
            this.f3298a = -1;
            this.f3300b = -1;
            this.f3302c = -1.0f;
            this.f3304d = -1;
            this.f3306e = -1;
            this.f3308f = -1;
            this.f3310g = -1;
            this.f3312h = -1;
            this.f3314i = -1;
            this.f3316j = -1;
            this.f3318k = -1;
            this.f3320l = -1;
            this.f3322m = -1;
            int i2 = 0;
            this.f3323n = 0;
            this.f3324o = 0.0f;
            this.f3325p = -1;
            this.f3326q = -1;
            this.f3327r = -1;
            this.f3328s = -1;
            this.f3329t = -1;
            this.f3330u = -1;
            this.f3331v = -1;
            this.f3332w = -1;
            this.f3333x = -1;
            this.f3334y = -1;
            this.f3335z = 0.5f;
            this.f3272A = 0.5f;
            this.f3273B = null;
            this.f3274C = 1;
            this.f3275D = -1.0f;
            this.f3276E = -1.0f;
            this.f3277F = 0;
            this.f3278G = 0;
            this.f3279H = 0;
            this.f3280I = 0;
            this.f3281J = 0;
            this.f3282K = 0;
            this.f3283L = 0;
            this.f3284M = 0;
            this.f3285N = 1.0f;
            this.f3286O = 1.0f;
            this.f3287P = -1;
            this.f3288Q = -1;
            this.f3289R = -1;
            this.f3290S = false;
            this.f3291T = false;
            this.f3292U = true;
            this.f3293V = true;
            this.f3294W = false;
            this.f3295X = false;
            this.f3296Y = false;
            this.f3297Z = false;
            this.f3299a0 = -1;
            this.f3301b0 = -1;
            this.f3303c0 = -1;
            this.f3305d0 = -1;
            this.f3307e0 = -1;
            this.f3309f0 = -1;
            this.f3311g0 = 0.5f;
            this.f3319k0 = new C0291f();
            this.f3321l0 = false;
            TypedArray a = c.obtainStyledAttributes(attrs, C0317h.f1679a);
            int N = a.getIndexCount();
            int i3 = 0;
            while (i3 < N) {
                int attr = a.getIndex(i3);
                int look = C0821a.f3336a.get(attr);
                switch (look) {
                    case 1:
                        this.f3289R = a.getInt(attr, this.f3289R);
                        break;
                    case 2:
                        int resourceId = a.getResourceId(attr, this.f3322m);
                        this.f3322m = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f3322m = a.getInt(attr, -1);
                            break;
                        }
                    case 3:
                        this.f3323n = a.getDimensionPixelSize(attr, this.f3323n);
                        break;
                    case 4:
                        float f = a.getFloat(attr, this.f3324o) % 360.0f;
                        this.f3324o = f;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f3324o = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f3298a = a.getDimensionPixelOffset(attr, this.f3298a);
                        break;
                    case 6:
                        this.f3300b = a.getDimensionPixelOffset(attr, this.f3300b);
                        break;
                    case 7:
                        this.f3302c = a.getFloat(attr, this.f3302c);
                        break;
                    case 8:
                        int resourceId2 = a.getResourceId(attr, this.f3304d);
                        this.f3304d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f3304d = a.getInt(attr, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = a.getResourceId(attr, this.f3306e);
                        this.f3306e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f3306e = a.getInt(attr, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = a.getResourceId(attr, this.f3308f);
                        this.f3308f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f3308f = a.getInt(attr, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = a.getResourceId(attr, this.f3310g);
                        this.f3310g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f3310g = a.getInt(attr, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = a.getResourceId(attr, this.f3312h);
                        this.f3312h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f3312h = a.getInt(attr, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = a.getResourceId(attr, this.f3314i);
                        this.f3314i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f3314i = a.getInt(attr, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = a.getResourceId(attr, this.f3316j);
                        this.f3316j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f3316j = a.getInt(attr, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = a.getResourceId(attr, this.f3318k);
                        this.f3318k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f3318k = a.getInt(attr, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = a.getResourceId(attr, this.f3320l);
                        this.f3320l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f3320l = a.getInt(attr, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = a.getResourceId(attr, this.f3325p);
                        this.f3325p = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f3325p = a.getInt(attr, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = a.getResourceId(attr, this.f3326q);
                        this.f3326q = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f3326q = a.getInt(attr, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = a.getResourceId(attr, this.f3327r);
                        this.f3327r = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f3327r = a.getInt(attr, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = a.getResourceId(attr, this.f3328s);
                        this.f3328s = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f3328s = a.getInt(attr, -1);
                            break;
                        }
                    case 21:
                        this.f3329t = a.getDimensionPixelSize(attr, this.f3329t);
                        break;
                    case 22:
                        this.f3330u = a.getDimensionPixelSize(attr, this.f3330u);
                        break;
                    case 23:
                        this.f3331v = a.getDimensionPixelSize(attr, this.f3331v);
                        break;
                    case 24:
                        this.f3332w = a.getDimensionPixelSize(attr, this.f3332w);
                        break;
                    case 25:
                        this.f3333x = a.getDimensionPixelSize(attr, this.f3333x);
                        break;
                    case 26:
                        this.f3334y = a.getDimensionPixelSize(attr, this.f3334y);
                        break;
                    case 27:
                        this.f3290S = a.getBoolean(attr, this.f3290S);
                        break;
                    case 28:
                        this.f3291T = a.getBoolean(attr, this.f3291T);
                        break;
                    case 29:
                        this.f3335z = a.getFloat(attr, this.f3335z);
                        break;
                    case 30:
                        this.f3272A = a.getFloat(attr, this.f3272A);
                        break;
                    case 31:
                        int i4 = a.getInt(attr, 0);
                        this.f3279H = i4;
                        if (i4 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i5 = a.getInt(attr, 0);
                        this.f3280I = i5;
                        if (i5 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f3281J = a.getDimensionPixelSize(attr, this.f3281J);
                            break;
                        } catch (Exception e) {
                            if (a.getInt(attr, this.f3281J) == -2) {
                                this.f3281J = -2;
                            }
                            break;
                        }
                    case 34:
                        try {
                            this.f3283L = a.getDimensionPixelSize(attr, this.f3283L);
                            break;
                        } catch (Exception e2) {
                            if (a.getInt(attr, this.f3283L) == -2) {
                                this.f3283L = -2;
                            }
                            break;
                        }
                    case 35:
                        this.f3285N = Math.max(0.0f, a.getFloat(attr, this.f3285N));
                        break;
                    case 36:
                        try {
                            this.f3282K = a.getDimensionPixelSize(attr, this.f3282K);
                            break;
                        } catch (Exception e3) {
                            if (a.getInt(attr, this.f3282K) == -2) {
                                this.f3282K = -2;
                            }
                            break;
                        }
                    case 37:
                        try {
                            this.f3284M = a.getDimensionPixelSize(attr, this.f3284M);
                            break;
                        } catch (Exception e4) {
                            if (a.getInt(attr, this.f3284M) == -2) {
                                this.f3284M = -2;
                            }
                            break;
                        }
                    case 38:
                        this.f3286O = Math.max(0.0f, a.getFloat(attr, this.f3286O));
                        break;
                    default:
                        switch (look) {
                            case 44:
                                String string = a.getString(attr);
                                this.f3273B = string;
                                this.f3274C = i;
                                if (string == null) {
                                    break;
                                } else {
                                    int len = string.length();
                                    int commaIndex2 = this.f3273B.indexOf(44);
                                    if (commaIndex2 <= 0 || commaIndex2 >= len - 1) {
                                        commaIndex = 0;
                                    } else {
                                        String dimension = this.f3273B.substring(i2, commaIndex2);
                                        if (dimension.equalsIgnoreCase("W")) {
                                            this.f3274C = i2;
                                        } else if (dimension.equalsIgnoreCase("H")) {
                                            this.f3274C = 1;
                                        }
                                        commaIndex = commaIndex2 + 1;
                                    }
                                    int colonIndex = this.f3273B.indexOf(58);
                                    if (colonIndex < 0 || colonIndex >= len - 1) {
                                        String r = this.f3273B.substring(commaIndex);
                                        if (r.length() > 0) {
                                            try {
                                                Float.parseFloat(r);
                                            } catch (NumberFormatException e5) {
                                            }
                                        }
                                    } else {
                                        String nominator = this.f3273B.substring(commaIndex, colonIndex);
                                        String denominator = this.f3273B.substring(colonIndex + 1);
                                        if (nominator.length() > 0 && denominator.length() > 0) {
                                            try {
                                                float nominatorValue = Float.parseFloat(nominator);
                                                float denominatorValue = Float.parseFloat(denominator);
                                                if (nominatorValue > 0.0f && denominatorValue > 0.0f) {
                                                    if (this.f3274C == 1) {
                                                        Math.abs(denominatorValue / nominatorValue);
                                                    } else {
                                                        Math.abs(nominatorValue / denominatorValue);
                                                    }
                                                }
                                            } catch (NumberFormatException e6) {
                                            }
                                        }
                                    }
                                    break;
                                }
                                break;
                            case 45:
                                this.f3275D = a.getFloat(attr, this.f3275D);
                                break;
                            case 46:
                                this.f3276E = a.getFloat(attr, this.f3276E);
                                break;
                            case 47:
                                this.f3277F = a.getInt(attr, i2);
                                break;
                            case 48:
                                this.f3278G = a.getInt(attr, i2);
                                break;
                            case 49:
                                this.f3287P = a.getDimensionPixelOffset(attr, this.f3287P);
                                break;
                            case 50:
                                this.f3288Q = a.getDimensionPixelOffset(attr, this.f3288Q);
                                break;
                        }
                }
                i3++;
                i = -1;
                i2 = 0;
            }
            a.recycle();
            mo4340a();
        }

        /* renamed from: a */
        public void mo4340a() {
            this.f3295X = false;
            this.f3292U = true;
            this.f3293V = true;
            int i = this.width;
            if (i == -2 && this.f3290S) {
                this.f3292U = false;
                this.f3279H = 1;
            }
            int i2 = this.height;
            if (i2 == -2 && this.f3291T) {
                this.f3293V = false;
                this.f3280I = 1;
            }
            if (i == 0 || i == -1) {
                this.f3292U = false;
                if (i == 0 && this.f3279H == 1) {
                    this.width = -2;
                    this.f3290S = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f3293V = false;
                if (i2 == 0 && this.f3280I == 1) {
                    this.height = -2;
                    this.f3291T = true;
                }
            }
            if (this.f3302c != -1.0f || this.f3298a != -1 || this.f3300b != -1) {
                this.f3295X = true;
                this.f3292U = true;
                this.f3293V = true;
                if (!(this.f3319k0 instanceof C0296i)) {
                    this.f3319k0 = new C0296i();
                }
                ((C0296i) this.f3319k0).mo2129M0(this.f3289R);
            }
        }

        public C0820a(int width, int height) {
            super(width, height);
            this.f3298a = -1;
            this.f3300b = -1;
            this.f3302c = -1.0f;
            this.f3304d = -1;
            this.f3306e = -1;
            this.f3308f = -1;
            this.f3310g = -1;
            this.f3312h = -1;
            this.f3314i = -1;
            this.f3316j = -1;
            this.f3318k = -1;
            this.f3320l = -1;
            this.f3322m = -1;
            this.f3323n = 0;
            this.f3324o = 0.0f;
            this.f3325p = -1;
            this.f3326q = -1;
            this.f3327r = -1;
            this.f3328s = -1;
            this.f3329t = -1;
            this.f3330u = -1;
            this.f3331v = -1;
            this.f3332w = -1;
            this.f3333x = -1;
            this.f3334y = -1;
            this.f3335z = 0.5f;
            this.f3272A = 0.5f;
            this.f3273B = null;
            this.f3274C = 1;
            this.f3275D = -1.0f;
            this.f3276E = -1.0f;
            this.f3277F = 0;
            this.f3278G = 0;
            this.f3279H = 0;
            this.f3280I = 0;
            this.f3281J = 0;
            this.f3282K = 0;
            this.f3283L = 0;
            this.f3284M = 0;
            this.f3285N = 1.0f;
            this.f3286O = 1.0f;
            this.f3287P = -1;
            this.f3288Q = -1;
            this.f3289R = -1;
            this.f3290S = false;
            this.f3291T = false;
            this.f3292U = true;
            this.f3293V = true;
            this.f3294W = false;
            this.f3295X = false;
            this.f3296Y = false;
            this.f3297Z = false;
            this.f3299a0 = -1;
            this.f3301b0 = -1;
            this.f3303c0 = -1;
            this.f3305d0 = -1;
            this.f3307e0 = -1;
            this.f3309f0 = -1;
            this.f3311g0 = 0.5f;
            this.f3319k0 = new C0291f();
            this.f3321l0 = false;
        }

        public C0820a(ViewGroup.LayoutParams source) {
            super(source);
            this.f3298a = -1;
            this.f3300b = -1;
            this.f3302c = -1.0f;
            this.f3304d = -1;
            this.f3306e = -1;
            this.f3308f = -1;
            this.f3310g = -1;
            this.f3312h = -1;
            this.f3314i = -1;
            this.f3316j = -1;
            this.f3318k = -1;
            this.f3320l = -1;
            this.f3322m = -1;
            this.f3323n = 0;
            this.f3324o = 0.0f;
            this.f3325p = -1;
            this.f3326q = -1;
            this.f3327r = -1;
            this.f3328s = -1;
            this.f3329t = -1;
            this.f3330u = -1;
            this.f3331v = -1;
            this.f3332w = -1;
            this.f3333x = -1;
            this.f3334y = -1;
            this.f3335z = 0.5f;
            this.f3272A = 0.5f;
            this.f3273B = null;
            this.f3274C = 1;
            this.f3275D = -1.0f;
            this.f3276E = -1.0f;
            this.f3277F = 0;
            this.f3278G = 0;
            this.f3279H = 0;
            this.f3280I = 0;
            this.f3281J = 0;
            this.f3282K = 0;
            this.f3283L = 0;
            this.f3284M = 0;
            this.f3285N = 1.0f;
            this.f3286O = 1.0f;
            this.f3287P = -1;
            this.f3288Q = -1;
            this.f3289R = -1;
            this.f3290S = false;
            this.f3291T = false;
            this.f3292U = true;
            this.f3293V = true;
            this.f3294W = false;
            this.f3295X = false;
            this.f3296Y = false;
            this.f3297Z = false;
            this.f3299a0 = -1;
            this.f3301b0 = -1;
            this.f3303c0 = -1;
            this.f3305d0 = -1;
            this.f3307e0 = -1;
            this.f3309f0 = -1;
            this.f3311g0 = 0.5f;
            this.f3319k0 = new C0291f();
            this.f3321l0 = false;
        }

        @TargetApi(17)
        public void resolveLayoutDirection(int layoutDirection) {
            int preLeftMargin = this.leftMargin;
            int preRightMargin = this.rightMargin;
            super.resolveLayoutDirection(layoutDirection);
            this.f3303c0 = -1;
            this.f3305d0 = -1;
            this.f3299a0 = -1;
            this.f3301b0 = -1;
            this.f3307e0 = -1;
            this.f3309f0 = -1;
            this.f3307e0 = this.f3329t;
            this.f3309f0 = this.f3331v;
            this.f3311g0 = this.f3335z;
            this.f3313h0 = this.f3298a;
            this.f3315i0 = this.f3300b;
            this.f3317j0 = this.f3302c;
            if (1 == getLayoutDirection()) {
                boolean startEndDefined = false;
                int i = this.f3325p;
                if (i != -1) {
                    this.f3303c0 = i;
                    startEndDefined = true;
                } else {
                    int i2 = this.f3326q;
                    if (i2 != -1) {
                        this.f3305d0 = i2;
                        startEndDefined = true;
                    }
                }
                int i3 = this.f3327r;
                if (i3 != -1) {
                    this.f3301b0 = i3;
                    startEndDefined = true;
                }
                int i4 = this.f3328s;
                if (i4 != -1) {
                    this.f3299a0 = i4;
                    startEndDefined = true;
                }
                int i5 = this.f3333x;
                if (i5 != -1) {
                    this.f3309f0 = i5;
                }
                int i6 = this.f3334y;
                if (i6 != -1) {
                    this.f3307e0 = i6;
                }
                if (startEndDefined) {
                    this.f3311g0 = 1.0f - this.f3335z;
                }
                if (this.f3295X && this.f3289R == 1) {
                    float f = this.f3302c;
                    if (f != -1.0f) {
                        this.f3317j0 = 1.0f - f;
                        this.f3313h0 = -1;
                        this.f3315i0 = -1;
                    } else {
                        int i7 = this.f3298a;
                        if (i7 != -1) {
                            this.f3315i0 = i7;
                            this.f3313h0 = -1;
                            this.f3317j0 = -1.0f;
                        } else {
                            int i8 = this.f3300b;
                            if (i8 != -1) {
                                this.f3313h0 = i8;
                                this.f3315i0 = -1;
                                this.f3317j0 = -1.0f;
                            }
                        }
                    }
                }
            } else {
                int i9 = this.f3325p;
                if (i9 != -1) {
                    this.f3301b0 = i9;
                }
                int i10 = this.f3326q;
                if (i10 != -1) {
                    this.f3299a0 = i10;
                }
                int i11 = this.f3327r;
                if (i11 != -1) {
                    this.f3303c0 = i11;
                }
                int i12 = this.f3328s;
                if (i12 != -1) {
                    this.f3305d0 = i12;
                }
                int i13 = this.f3333x;
                if (i13 != -1) {
                    this.f3307e0 = i13;
                }
                int i14 = this.f3334y;
                if (i14 != -1) {
                    this.f3309f0 = i14;
                }
            }
            if (this.f3327r == -1 && this.f3328s == -1 && this.f3326q == -1 && this.f3325p == -1) {
                int i15 = this.f3308f;
                if (i15 != -1) {
                    this.f3303c0 = i15;
                    if (this.rightMargin <= 0 && preRightMargin > 0) {
                        this.rightMargin = preRightMargin;
                    }
                } else {
                    int i16 = this.f3310g;
                    if (i16 != -1) {
                        this.f3305d0 = i16;
                        if (this.rightMargin <= 0 && preRightMargin > 0) {
                            this.rightMargin = preRightMargin;
                        }
                    }
                }
                int i17 = this.f3304d;
                if (i17 != -1) {
                    this.f3299a0 = i17;
                    if (this.leftMargin <= 0 && preLeftMargin > 0) {
                        this.leftMargin = preLeftMargin;
                        return;
                    }
                    return;
                }
                int i18 = this.f3306e;
                if (i18 != -1) {
                    this.f3301b0 = i18;
                    if (this.leftMargin <= 0 && preLeftMargin > 0) {
                        this.leftMargin = preLeftMargin;
                    }
                }
            }
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f3264j = true;
        this.f3269o = -1;
        this.f3270p = -1;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
