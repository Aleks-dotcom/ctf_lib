package p000a.p058q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.q.c */
public class C0664c extends C0706m {

    /* renamed from: N */
    public static final String[] f2596N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: O */
    public static final Property<Drawable, PointF> f2597O = new C0666b(PointF.class, "boundsOrigin");

    /* renamed from: P */
    public static final Property<C0675k, PointF> f2598P = new C0667c(PointF.class, "topLeft");

    /* renamed from: Q */
    public static final Property<C0675k, PointF> f2599Q = new C0668d(PointF.class, "bottomRight");

    /* renamed from: R */
    public static final Property<View, PointF> f2600R = new C0669e(PointF.class, "bottomRight");

    /* renamed from: S */
    public static final Property<View, PointF> f2601S = new C0670f(PointF.class, "topLeft");

    /* renamed from: T */
    public static final Property<View, PointF> f2602T = new C0671g(PointF.class, "position");

    /* renamed from: U */
    public static C0702k f2603U = new C0702k();

    /* renamed from: K */
    public int[] f2604K = new int[2];

    /* renamed from: L */
    public boolean f2605L = false;

    /* renamed from: M */
    public boolean f2606M = false;

    /* renamed from: a.q.c$b */
    public static class C0666b extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f2611a = new Rect();

        public C0666b(Class x0, String x1) {
            super(x0, x1);
        }

        /* renamed from: b */
        public void set(Drawable object, PointF value) {
            object.copyBounds(this.f2611a);
            this.f2611a.offsetTo(Math.round(value.x), Math.round(value.y));
            object.setBounds(this.f2611a);
        }

        /* renamed from: a */
        public PointF get(Drawable object) {
            object.copyBounds(this.f2611a);
            Rect rect = this.f2611a;
            return new PointF((float) rect.left, (float) rect.top);
        }
    }

    /* renamed from: a.q.c$c */
    public static class C0667c extends Property<C0675k, PointF> {
        public C0667c(Class x0, String x1) {
            super(x0, x1);
        }

        /* renamed from: b */
        public void set(C0675k viewBounds, PointF topLeft) {
            viewBounds.mo3478c(topLeft);
        }

        /* renamed from: a */
        public PointF get(C0675k viewBounds) {
            return null;
        }
    }

    /* renamed from: a.q.c$d */
    public static class C0668d extends Property<C0675k, PointF> {
        public C0668d(Class x0, String x1) {
            super(x0, x1);
        }

        /* renamed from: b */
        public void set(C0675k viewBounds, PointF bottomRight) {
            viewBounds.mo3476a(bottomRight);
        }

        /* renamed from: a */
        public PointF get(C0675k viewBounds) {
            return null;
        }
    }

    /* renamed from: a.q.c$e */
    public static class C0669e extends Property<View, PointF> {
        public C0669e(Class x0, String x1) {
            super(x0, x1);
        }

        /* renamed from: b */
        public void set(View view, PointF bottomRight) {
            C0676c0.m3345f(view, view.getLeft(), view.getTop(), Math.round(bottomRight.x), Math.round(bottomRight.y));
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }
    }

    /* renamed from: a.q.c$f */
    public static class C0670f extends Property<View, PointF> {
        public C0670f(Class x0, String x1) {
            super(x0, x1);
        }

        /* renamed from: b */
        public void set(View view, PointF topLeft) {
            C0676c0.m3345f(view, Math.round(topLeft.x), Math.round(topLeft.y), view.getRight(), view.getBottom());
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }
    }

    /* renamed from: a.q.c$g */
    public static class C0671g extends Property<View, PointF> {
        public C0671g(Class x0, String x1) {
            super(x0, x1);
        }

        /* renamed from: b */
        public void set(View view, PointF topLeft) {
            int left = Math.round(topLeft.x);
            int top = Math.round(topLeft.y);
            C0676c0.m3345f(view, left, top, view.getWidth() + left, view.getHeight() + top);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }
    }

    /* renamed from: D */
    public String[] mo3439D() {
        return f2596N;
    }

    /* renamed from: c0 */
    public final void mo3440c0(C0723s values) {
        View view = values.f2742b;
        if (C0460r.m2235J(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            values.f2741a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            values.f2741a.put("android:changeBounds:parent", values.f2742b.getParent());
            if (this.f2606M) {
                values.f2742b.getLocationInWindow(this.f2604K);
                values.f2741a.put("android:changeBounds:windowX", Integer.valueOf(this.f2604K[0]));
                values.f2741a.put("android:changeBounds:windowY", Integer.valueOf(this.f2604K[1]));
            }
            if (this.f2605L) {
                values.f2741a.put("android:changeBounds:clip", C0460r.m2280o(view));
            }
        }
    }

    /* renamed from: j */
    public void mo3443j(C0723s transitionValues) {
        mo3440c0(transitionValues);
    }

    /* renamed from: g */
    public void mo3442g(C0723s transitionValues) {
        mo3440c0(transitionValues);
    }

    /* renamed from: d0 */
    public final boolean mo3441d0(View startParent, View endParent) {
        if (!this.f2606M) {
            return true;
        }
        boolean parentMatches = true;
        C0723s endValues = mo3567t(startParent, true);
        if (endValues == null) {
            if (startParent != endParent) {
                parentMatches = false;
            }
            return parentMatches;
        }
        if (endParent != endValues.f2742b) {
            parentMatches = false;
        }
        return parentMatches;
    }

    /* renamed from: n */
    public Animator mo3444n(ViewGroup sceneRoot, C0723s startValues, C0723s endValues) {
        boolean z;
        View view;
        Animator anim;
        int endLeft;
        int startTop;
        int startLeft;
        ObjectAnimator positionAnimator;
        Rect startClip;
        int i;
        Rect endClip;
        Rect startClip2;
        C0723s sVar = startValues;
        C0723s sVar2 = endValues;
        if (sVar == null) {
            ViewGroup viewGroup = sceneRoot;
            C0723s sVar3 = sVar2;
            return null;
        } else if (sVar2 == null) {
            ViewGroup viewGroup2 = sceneRoot;
            C0723s sVar4 = sVar2;
            return null;
        } else {
            Map<String, Object> startParentVals = sVar.f2741a;
            Map<String, Object> endParentVals = sVar2.f2741a;
            ViewGroup startParent = (ViewGroup) startParentVals.get("android:changeBounds:parent");
            ViewGroup endParent = (ViewGroup) endParentVals.get("android:changeBounds:parent");
            if (startParent == null) {
                ViewGroup viewGroup3 = sceneRoot;
                Map<String, Object> map = startParentVals;
                Map<String, Object> map2 = endParentVals;
                ViewGroup viewGroup4 = startParent;
                ViewGroup viewGroup5 = endParent;
                C0723s sVar5 = sVar2;
                return null;
            } else if (endParent == null) {
                ViewGroup viewGroup6 = sceneRoot;
                Map<String, Object> map3 = startParentVals;
                Map<String, Object> map4 = endParentVals;
                ViewGroup viewGroup7 = startParent;
                ViewGroup viewGroup8 = endParent;
                C0723s sVar6 = sVar2;
                return null;
            } else {
                View view2 = sVar2.f2742b;
                if (mo3441d0(startParent, endParent)) {
                    Rect startBounds = (Rect) sVar.f2741a.get("android:changeBounds:bounds");
                    Rect endBounds = (Rect) sVar2.f2741a.get("android:changeBounds:bounds");
                    int startLeft2 = startBounds.left;
                    int endLeft2 = endBounds.left;
                    int startTop2 = startBounds.top;
                    int endTop = endBounds.top;
                    int startRight = startBounds.right;
                    Map<String, Object> map5 = startParentVals;
                    int endRight = endBounds.right;
                    Map<String, Object> map6 = endParentVals;
                    int startBottom = startBounds.bottom;
                    ViewGroup viewGroup9 = startParent;
                    int endBottom = endBounds.bottom;
                    ViewGroup viewGroup10 = endParent;
                    int startWidth = startRight - startLeft2;
                    Rect rect = startBounds;
                    int startHeight = startBottom - startTop2;
                    Rect rect2 = endBounds;
                    int endWidth = endRight - endLeft2;
                    int endHeight = endBottom - endTop;
                    View view3 = view2;
                    Rect startClip3 = (Rect) sVar.f2741a.get("android:changeBounds:clip");
                    Rect endClip2 = (Rect) sVar2.f2741a.get("android:changeBounds:clip");
                    int numChanges = 0;
                    if (!((startWidth == 0 || startHeight == 0) && (endWidth == 0 || endHeight == 0))) {
                        if (!(startLeft2 == endLeft2 && startTop2 == endTop)) {
                            numChanges = 0 + 1;
                        }
                        if (!(startRight == endRight && startBottom == endBottom)) {
                            numChanges++;
                        }
                    }
                    if ((startClip3 != null && !startClip3.equals(endClip2)) || (startClip3 == null && endClip2 != null)) {
                        numChanges++;
                    }
                    if (numChanges > 0) {
                        Rect startClip4 = startClip3;
                        Rect endClip3 = endClip2;
                        if (!this.f2605L) {
                            View view4 = view3;
                            C0676c0.m3345f(view4, startLeft2, startTop2, startRight, startBottom);
                            if (numChanges != 2) {
                                int endHeight2 = endHeight;
                                int endWidth2 = endWidth;
                                int startHeight2 = startHeight;
                                int i2 = numChanges;
                                int startWidth2 = startWidth;
                                View view5 = view4;
                                if (startLeft2 != endLeft2) {
                                    view = view5;
                                } else if (startTop2 != endTop) {
                                    view = view5;
                                } else {
                                    view = view5;
                                    anim = C0689f.m3390a(view, f2600R, mo3570v().mo3500a((float) startRight, (float) startBottom, (float) endRight, (float) endBottom));
                                    int i3 = endLeft2;
                                    int i4 = startRight;
                                    int i5 = endTop;
                                    int i6 = endRight;
                                    Rect rect3 = startClip4;
                                    int i7 = endHeight2;
                                    int i8 = startHeight2;
                                    int i9 = endWidth2;
                                    int i10 = startWidth2;
                                    z = true;
                                    int endWidth3 = startTop2;
                                    int endHeight3 = startLeft2;
                                    int startHeight3 = startBottom;
                                }
                                anim = C0689f.m3390a(view, f2601S, mo3570v().mo3500a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                                int i11 = endLeft2;
                                int i12 = startRight;
                                int i13 = endTop;
                                int i14 = endRight;
                                Rect rect4 = startClip4;
                                int i15 = endHeight2;
                                int i16 = startHeight2;
                                int i17 = endWidth2;
                                int i18 = startWidth2;
                                z = true;
                                int endWidth4 = startTop2;
                                int endHeight4 = startLeft2;
                                int startHeight4 = startBottom;
                            } else if (startWidth == endWidth && startHeight == endHeight) {
                                int i19 = numChanges;
                                int endHeight5 = endHeight;
                                anim = C0689f.m3390a(view4, f2602T, mo3570v().mo3500a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                                int i20 = endLeft2;
                                int i21 = startRight;
                                int i22 = endTop;
                                int i23 = endRight;
                                int i24 = startWidth;
                                view = view4;
                                Rect rect5 = startClip4;
                                int i25 = endHeight5;
                                int i26 = startHeight;
                                int i27 = endWidth;
                                z = true;
                                int endWidth5 = startTop2;
                                int endHeight6 = startLeft2;
                                int startHeight5 = startBottom;
                            } else {
                                int endHeight7 = endHeight;
                                int endWidth6 = endWidth;
                                int startHeight6 = startHeight;
                                int i28 = numChanges;
                                C0675k viewBounds = new C0675k(view4);
                                Path topLeftPath = mo3570v().mo3500a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop);
                                ObjectAnimator topLeftAnimator = C0689f.m3390a(viewBounds, f2598P, topLeftPath);
                                Path path = topLeftPath;
                                View view6 = view4;
                                ObjectAnimator bottomRightAnimator = C0689f.m3390a(viewBounds, f2599Q, mo3570v().mo3500a((float) startRight, (float) startBottom, (float) endRight, (float) endBottom));
                                AnimatorSet set = new AnimatorSet();
                                set.playTogether(new Animator[]{topLeftAnimator, bottomRightAnimator});
                                set.addListener(new C0672h(this, viewBounds));
                                int i29 = startRight;
                                int i30 = endTop;
                                int i31 = endRight;
                                anim = set;
                                Rect rect6 = startClip4;
                                int i32 = endHeight7;
                                int i33 = startHeight6;
                                int i34 = endWidth6;
                                int i35 = startWidth;
                                view = view6;
                                z = true;
                                int i36 = endLeft2;
                                int endWidth7 = startTop2;
                                int endHeight8 = startLeft2;
                                int startHeight7 = startBottom;
                            }
                        } else {
                            int i37 = endWidth;
                            int i38 = startHeight;
                            view = view3;
                            int i39 = numChanges;
                            int numChanges2 = startWidth;
                            int maxWidth = Math.max(numChanges2, endWidth);
                            int startRight2 = startRight;
                            int i40 = startBottom;
                            C0676c0.m3345f(view, startLeft2, startTop2, startLeft2 + maxWidth, startTop2 + Math.max(startHeight, endHeight));
                            if (startLeft2 == endLeft2 && startTop2 == endTop) {
                                endLeft = endLeft2;
                                positionAnimator = null;
                                startTop = startTop2;
                                startLeft = startLeft2;
                            } else {
                                startLeft = startLeft2;
                                startTop = startTop2;
                                endLeft = endLeft2;
                                positionAnimator = C0689f.m3390a(view, f2602T, mo3570v().mo3500a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                            }
                            int i41 = startTop;
                            Rect finalClip = endClip3;
                            if (startClip4 == null) {
                                i = 0;
                                startClip = new Rect(0, 0, numChanges2, startHeight);
                            } else {
                                i = 0;
                                startClip = startClip4;
                            }
                            if (endClip3 == null) {
                                endClip = new Rect(i, i, endWidth, endHeight);
                            } else {
                                endClip = endClip3;
                            }
                            ObjectAnimator clipAnimator = null;
                            if (!startClip.equals(endClip)) {
                                C0460r.m2269i0(view, startClip);
                                int i42 = endHeight;
                                int i43 = numChanges2;
                                C0673i iVar = r0;
                                int i44 = maxWidth;
                                Rect rect7 = endClip;
                                int i45 = startRight2;
                                ObjectAnimator clipAnimator2 = ObjectAnimator.ofObject(view, "clipBounds", f2603U, new Object[]{startClip, endClip});
                                int i46 = startLeft;
                                startClip2 = startClip;
                                int i47 = endWidth;
                                int i48 = startHeight;
                                int startHeight8 = endRight;
                                int i49 = endTop;
                                int i50 = endRight;
                                z = true;
                                C0673i iVar2 = new C0673i(this, view, finalClip, endLeft, endTop, startHeight8, endBottom);
                                clipAnimator2.addListener(iVar);
                                clipAnimator = clipAnimator2;
                            } else {
                                Rect rect8 = endClip;
                                int i51 = endWidth;
                                int i52 = startHeight;
                                int i53 = endTop;
                                int i54 = numChanges2;
                                int i55 = endRight;
                                int i56 = maxWidth;
                                int i57 = startRight2;
                                int startRight3 = startLeft;
                                z = true;
                                startClip2 = startClip;
                            }
                            anim = C0722r.m3548c(positionAnimator, clipAnimator);
                            Rect rect9 = startClip2;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup parent = (ViewGroup) view.getParent();
                            C0728x.m3560c(parent, z);
                            mo3549a(new C0674j(this, parent));
                        }
                        return anim;
                    }
                    int i58 = endHeight;
                    int i59 = endLeft2;
                    int i60 = startRight;
                    int i61 = startTop2;
                    int i62 = startLeft2;
                    int i63 = endWidth;
                    int i64 = startHeight;
                    int i65 = endTop;
                    Rect rect10 = endClip2;
                    int i66 = endRight;
                    int i67 = startBottom;
                    int i68 = startWidth;
                    Rect rect11 = startClip3;
                    View view7 = view3;
                    int i69 = numChanges;
                    C0723s sVar7 = startValues;
                    C0723s sVar8 = endValues;
                    return null;
                }
                Map<String, Object> map7 = startParentVals;
                Map<String, Object> map8 = endParentVals;
                ViewGroup viewGroup11 = startParent;
                ViewGroup viewGroup12 = endParent;
                View view8 = view2;
                C0723s sVar9 = startValues;
                int startX = ((Integer) sVar9.f2741a.get("android:changeBounds:windowX")).intValue();
                int startY = ((Integer) sVar9.f2741a.get("android:changeBounds:windowY")).intValue();
                C0723s sVar10 = endValues;
                int endX = ((Integer) sVar10.f2741a.get("android:changeBounds:windowX")).intValue();
                int endY = ((Integer) sVar10.f2741a.get("android:changeBounds:windowY")).intValue();
                if (startX == endX && startY == endY) {
                    return null;
                }
                sceneRoot.getLocationInWindow(this.f2604K);
                Bitmap bitmap = Bitmap.createBitmap(view8.getWidth(), view8.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                view8.draw(canvas);
                BitmapDrawable drawable = new BitmapDrawable(bitmap);
                float transitionAlpha = C0676c0.m3342c(view8);
                C0676c0.m3346g(view8, 0.0f);
                C0676c0.m3341b(sceneRoot).mo3437d(drawable);
                C0691g v = mo3570v();
                int[] iArr = this.f2604K;
                Canvas canvas2 = canvas;
                Bitmap bitmap2 = bitmap;
                BitmapDrawable bitmapDrawable = drawable;
                C0665a aVar = r0;
                int i70 = startX;
                ObjectAnimator anim2 = ObjectAnimator.ofPropertyValuesHolder(drawable, new PropertyValuesHolder[]{C0695i.m3402a(f2597O, v.mo3500a((float) (startX - iArr[0]), (float) (startY - iArr[1]), (float) (endX - iArr[0]), (float) (endY - iArr[1])))});
                C0665a aVar2 = new C0665a(this, sceneRoot, drawable, view8, transitionAlpha);
                anim2.addListener(aVar);
                return anim2;
            }
        }
    }

    /* renamed from: a.q.c$h */
    public class C0672h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C0675k f2612a;
        private C0675k mViewBounds;

        public C0672h(C0664c this$0, C0675k kVar) {
            this.f2612a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: a.q.c$i */
    public class C0673i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f2613a;

        /* renamed from: b */
        public final /* synthetic */ View f2614b;

        /* renamed from: c */
        public final /* synthetic */ Rect f2615c;

        /* renamed from: d */
        public final /* synthetic */ int f2616d;

        /* renamed from: e */
        public final /* synthetic */ int f2617e;

        /* renamed from: f */
        public final /* synthetic */ int f2618f;

        /* renamed from: g */
        public final /* synthetic */ int f2619g;

        public C0673i(C0664c this$0, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f2614b = view;
            this.f2615c = rect;
            this.f2616d = i;
            this.f2617e = i2;
            this.f2618f = i3;
            this.f2619g = i4;
        }

        public void onAnimationCancel(Animator animation) {
            this.f2613a = true;
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f2613a) {
                C0460r.m2269i0(this.f2614b, this.f2615c);
                C0676c0.m3345f(this.f2614b, this.f2616d, this.f2617e, this.f2618f, this.f2619g);
            }
        }
    }

    /* renamed from: a.q.c$j */
    public class C0674j extends C0714n {

        /* renamed from: a */
        public boolean f2620a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f2621b;

        public C0674j(C0664c this$0, ViewGroup viewGroup) {
            this.f2621b = viewGroup;
        }

        /* renamed from: b */
        public void mo3472b(C0706m transition) {
            C0728x.m3560c(this.f2621b, false);
            this.f2620a = true;
        }

        /* renamed from: c */
        public void mo3473c(C0706m transition) {
            if (!this.f2620a) {
                C0728x.m3560c(this.f2621b, false);
            }
            transition.mo3538P(this);
        }

        /* renamed from: d */
        public void mo3474d(C0706m transition) {
            C0728x.m3560c(this.f2621b, false);
        }

        /* renamed from: e */
        public void mo3475e(C0706m transition) {
            C0728x.m3560c(this.f2621b, true);
        }
    }

    /* renamed from: a.q.c$a */
    public class C0665a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f2607a;

        /* renamed from: b */
        public final /* synthetic */ BitmapDrawable f2608b;

        /* renamed from: c */
        public final /* synthetic */ View f2609c;

        /* renamed from: d */
        public final /* synthetic */ float f2610d;

        public C0665a(C0664c this$0, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f2607a = viewGroup;
            this.f2608b = bitmapDrawable;
            this.f2609c = view;
            this.f2610d = f;
        }

        public void onAnimationEnd(Animator animation) {
            C0676c0.m3341b(this.f2607a).mo3436b(this.f2608b);
            C0676c0.m3346g(this.f2609c, this.f2610d);
        }
    }

    /* renamed from: a.q.c$k */
    public static class C0675k {

        /* renamed from: a */
        public int f2622a;

        /* renamed from: b */
        public int f2623b;

        /* renamed from: c */
        public int f2624c;

        /* renamed from: d */
        public int f2625d;

        /* renamed from: e */
        public View f2626e;

        /* renamed from: f */
        public int f2627f;

        /* renamed from: g */
        public int f2628g;

        public C0675k(View view) {
            this.f2626e = view;
        }

        /* renamed from: c */
        public void mo3478c(PointF topLeft) {
            this.f2622a = Math.round(topLeft.x);
            this.f2623b = Math.round(topLeft.y);
            int i = this.f2627f + 1;
            this.f2627f = i;
            if (i == this.f2628g) {
                mo3477b();
            }
        }

        /* renamed from: a */
        public void mo3476a(PointF bottomRight) {
            this.f2624c = Math.round(bottomRight.x);
            this.f2625d = Math.round(bottomRight.y);
            int i = this.f2628g + 1;
            this.f2628g = i;
            if (this.f2627f == i) {
                mo3477b();
            }
        }

        /* renamed from: b */
        public final void mo3477b() {
            C0676c0.m3345f(this.f2626e, this.f2622a, this.f2623b, this.f2624c, this.f2625d);
            this.f2627f = 0;
            this.f2628g = 0;
        }
    }
}
