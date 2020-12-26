package p000a.p025h.p038m;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p025h.C0324b;
import p000a.p025h.p038m.C0420a;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p025h.p038m.p039a0.C0432f;

/* renamed from: a.h.m.r */
public class C0460r {

    /* renamed from: a */
    public static Field f2028a;

    /* renamed from: b */
    public static boolean f2029b;

    /* renamed from: c */
    public static Field f2030c;

    /* renamed from: d */
    public static boolean f2031d;

    /* renamed from: e */
    public static WeakHashMap<View, String> f2032e;

    /* renamed from: f */
    public static WeakHashMap<View, C0472v> f2033f = null;

    /* renamed from: g */
    public static Field f2034g;

    /* renamed from: h */
    public static boolean f2035h = false;

    /* renamed from: i */
    public static ThreadLocal<Rect> f2036i;

    /* renamed from: a.h.m.r$g */
    public interface C0467g {
        /* renamed from: a */
        boolean mo2590a(View view, KeyEvent keyEvent);
    }

    static {
        new AtomicInteger(1);
        int[] iArr = {C0324b.accessibility_custom_action_0, C0324b.accessibility_custom_action_1, C0324b.accessibility_custom_action_2, C0324b.accessibility_custom_action_3, C0324b.accessibility_custom_action_4, C0324b.accessibility_custom_action_5, C0324b.accessibility_custom_action_6, C0324b.accessibility_custom_action_7, C0324b.accessibility_custom_action_8, C0324b.accessibility_custom_action_9, C0324b.accessibility_custom_action_10, C0324b.accessibility_custom_action_11, C0324b.accessibility_custom_action_12, C0324b.accessibility_custom_action_13, C0324b.accessibility_custom_action_14, C0324b.accessibility_custom_action_15, C0324b.accessibility_custom_action_16, C0324b.accessibility_custom_action_17, C0324b.accessibility_custom_action_18, C0324b.accessibility_custom_action_19, C0324b.accessibility_custom_action_20, C0324b.accessibility_custom_action_21, C0324b.accessibility_custom_action_22, C0324b.accessibility_custom_action_23, C0324b.accessibility_custom_action_24, C0324b.accessibility_custom_action_25, C0324b.accessibility_custom_action_26, C0324b.accessibility_custom_action_27, C0324b.accessibility_custom_action_28, C0324b.accessibility_custom_action_29, C0324b.accessibility_custom_action_30, C0324b.accessibility_custom_action_31};
        new C0465e();
    }

    /* renamed from: r */
    public static Rect m2286r() {
        if (f2036i == null) {
            f2036i = new ThreadLocal<>();
        }
        Rect rect = f2036i.get();
        if (rect == null) {
            rect = new Rect();
            f2036i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: R */
    public static void m2243R(View v, C0424c info) {
        v.onInitializeAccessibilityNodeInfo(info.mo2499r0());
    }

    /* renamed from: c0 */
    public static void m2257c0(View v, C0420a delegate) {
        if (delegate == null && (m2268i(v) instanceof C0420a.C0421a)) {
            delegate = new C0420a();
        }
        v.setAccessibilityDelegate(delegate == null ? null : delegate.mo2421d());
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: u */
    public static int m2291u(View v) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: m0 */
    public static void m2277m0(View v, int mode) {
        if (Build.VERSION.SDK_INT >= 26) {
            v.setImportantForAutofill(mode);
        }
    }

    /* renamed from: h */
    public static C0420a m2266h(View view) {
        View.AccessibilityDelegate delegate = m2268i(view);
        if (delegate == null) {
            return null;
        }
        if (delegate instanceof C0420a.C0421a) {
            return ((C0420a.C0421a) delegate).f1991a;
        }
        return new C0420a(delegate);
    }

    /* renamed from: y */
    public static C0420a m2295y(View v) {
        C0420a delegateCompat = m2266h(v);
        if (delegateCompat == null) {
            delegateCompat = new C0420a();
        }
        m2257c0(v, delegateCompat);
        return delegateCompat;
    }

    /* renamed from: i */
    public static View.AccessibilityDelegate m2268i(View v) {
        if (f2035h) {
            return null;
        }
        if (f2034g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2034g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                f2035h = true;
                return null;
            }
        }
        try {
            Object o = f2034g.get(v);
            if (o instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) o;
            }
            return null;
        } catch (Throwable th2) {
            f2035h = true;
            return null;
        }
    }

    /* renamed from: G */
    public static boolean m2232G(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: k0 */
    public static void m2273k0(View view, boolean hasTransientState) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(hasTransientState);
        }
    }

    /* renamed from: U */
    public static void m2246U(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: V */
    public static void m2247V(View view, Runnable action) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(action);
        } else {
            view.postDelayed(action, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: W */
    public static void m2248W(View view, Runnable action, long delayMillis) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(action, delayMillis);
        } else {
            view.postDelayed(action, ValueAnimator.getFrameDelay() + delayMillis);
        }
    }

    /* renamed from: t */
    public static int m2290t(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: l0 */
    public static void m2275l0(View view, int mode) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            view.setImportantForAccessibility(mode);
        } else if (i >= 16) {
            if (mode == 4) {
                mode = 2;
            }
            view.setImportantForAccessibility(mode);
        }
    }

    /* renamed from: T */
    public static boolean m2245T(View view, int action, Bundle arguments) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(action, arguments);
        }
        return false;
    }

    /* renamed from: Z */
    public static void m2251Z(View view, C0424c.C0425a replacedAction, CharSequence label, C0432f command) {
        m2254b(view, replacedAction.mo2509a(label, command));
    }

    /* renamed from: b */
    public static void m2254b(View view, C0424c.C0425a action) {
        if (Build.VERSION.SDK_INT >= 21) {
            m2295y(view);
            m2250Y(action.mo2510b(), view);
            m2274l(view).add(action);
            m2239N(view, 0);
        }
    }

    /* renamed from: X */
    public static void m2249X(View view, int actionId) {
        if (Build.VERSION.SDK_INT >= 21) {
            m2250Y(actionId, view);
            m2239N(view, 0);
        }
    }

    /* renamed from: Y */
    public static void m2250Y(int actionId, View view) {
        List<C0424c.C0425a> l = m2274l(view);
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).mo2510b() == actionId) {
                l.remove(i);
                return;
            }
        }
    }

    /* renamed from: l */
    public static List<C0424c.C0425a> m2274l(View view) {
        int i = C0324b.tag_accessibility_actions;
        ArrayList<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = (ArrayList) view.getTag(i);
        if (actions != null) {
            return actions;
        }
        ArrayList<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions2 = new ArrayList<>();
        view.setTag(i, actions2);
        return actions2;
    }

    /* renamed from: v */
    public static int m2292v(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: j */
    public static int m2270j(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: e0 */
    public static void m2261e0(View view, int mode) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(mode);
        }
    }

    /* renamed from: A */
    public static int m2226A(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: z */
    public static int m2296z(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: o0 */
    public static void m2281o0(View view, int start, int top, int end, int bottom) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(start, top, end, bottom);
        } else {
            view.setPadding(start, top, end, bottom);
        }
    }

    /* renamed from: x */
    public static int m2294x(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f2029b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f2028a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f2029b = true;
        }
        Field field = f2028a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception e2) {
            return 0;
        }
    }

    /* renamed from: w */
    public static int m2293w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f2031d) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f2030c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f2031d = true;
        }
        Field field = f2030c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception e2) {
            return 0;
        }
    }

    /* renamed from: c */
    public static C0472v m2256c(View view) {
        if (f2033f == null) {
            f2033f = new WeakHashMap<>();
        }
        C0472v vpa = f2033f.get(view);
        if (vpa != null) {
            return vpa;
        }
        C0472v vpa2 = new C0472v(view);
        f2033f.put(view, vpa2);
        return vpa2;
    }

    /* renamed from: j0 */
    public static void m2271j0(View view, float elevation) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(elevation);
        }
    }

    /* renamed from: q */
    public static float m2284q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: q0 */
    public static void m2285q0(View view, String transitionName) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(transitionName);
            return;
        }
        if (f2032e == null) {
            f2032e = new WeakHashMap<>();
        }
        f2032e.put(view, transitionName);
    }

    /* renamed from: B */
    public static String m2227B(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f2032e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: C */
    public static int m2228C(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: a0 */
    public static void m2253a0(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: s */
    public static boolean m2288s(View v) {
        if (Build.VERSION.SDK_INT >= 16) {
            return v.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: n0 */
    public static void m2279n0(View v, C0457o listener) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (listener == null) {
            v.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            v.setOnApplyWindowInsetsListener(new C0461a(listener));
        }
    }

    /* renamed from: a.h.m.r$a */
    public static class C0461a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        public final /* synthetic */ C0457o f2037a;

        public C0461a(C0457o oVar) {
            this.f2037a = oVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
            return (WindowInsets) C0479z.m2367g(this.f2037a.mo171a(view, C0479z.m2368h(insets)));
        }
    }

    /* renamed from: Q */
    public static C0479z m2242Q(View view, C0479z insets) {
        if (Build.VERSION.SDK_INT < 21) {
            return insets;
        }
        WindowInsets unwrapped = (WindowInsets) C0479z.m2367g(insets);
        WindowInsets result = view.onApplyWindowInsets(unwrapped);
        if (!result.equals(unwrapped)) {
            unwrapped = new WindowInsets(result);
        }
        return C0479z.m2368h(unwrapped);
    }

    /* renamed from: F */
    public static boolean m2231F(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: L */
    public static boolean m2237L(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: f0 */
    public static void m2263f0(View view, Drawable background) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(background);
        } else {
            view.setBackgroundDrawable(background);
        }
    }

    /* renamed from: m */
    public static ColorStateList m2276m(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C0459q) {
            return ((C0459q) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: g0 */
    public static void m2265g0(View view, ColorStateList tintList) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintList(tintList);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean hasTint = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && hasTint) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0459q) {
            ((C0459q) view).setSupportBackgroundTintList(tintList);
        }
    }

    /* renamed from: n */
    public static PorterDuff.Mode m2278n(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof C0459q) {
            return ((C0459q) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: h0 */
    public static void m2267h0(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintMode(mode);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean hasTint = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && hasTint) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0459q) {
            ((C0459q) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: K */
    public static boolean m2236K(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C0451i) {
            return ((C0451i) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: r0 */
    public static void m2287r0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C0451i) {
            ((C0451i) view).stopNestedScroll();
        }
    }

    /* renamed from: J */
    public static boolean m2235J(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: D */
    public static float m2229D(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: P */
    public static void m2241P(View view, int offset) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            view.offsetTopAndBottom(offset);
        } else if (i >= 21) {
            Rect parentRect = m2286r();
            boolean needInvalidateWorkaround = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View p = (View) parent;
                parentRect.set(p.getLeft(), p.getTop(), p.getRight(), p.getBottom());
                needInvalidateWorkaround = !parentRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2260e(view, offset);
            if (needInvalidateWorkaround && parentRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(parentRect);
            }
        } else {
            m2260e(view, offset);
        }
    }

    /* renamed from: e */
    public static void m2260e(View view, int offset) {
        view.offsetTopAndBottom(offset);
        if (view.getVisibility() == 0) {
            m2289s0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2289s0((View) parent);
            }
        }
    }

    /* renamed from: O */
    public static void m2240O(View view, int offset) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            view.offsetLeftAndRight(offset);
        } else if (i >= 21) {
            Rect parentRect = m2286r();
            boolean needInvalidateWorkaround = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View p = (View) parent;
                parentRect.set(p.getLeft(), p.getTop(), p.getRight(), p.getBottom());
                needInvalidateWorkaround = !parentRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2258d(view, offset);
            if (needInvalidateWorkaround && parentRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(parentRect);
            }
        } else {
            m2258d(view, offset);
        }
    }

    /* renamed from: d */
    public static void m2258d(View view, int offset) {
        view.offsetLeftAndRight(offset);
        if (view.getVisibility() == 0) {
            m2289s0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2289s0((View) parent);
            }
        }
    }

    /* renamed from: s0 */
    public static void m2289s0(View view) {
        float y = view.getTranslationY();
        view.setTranslationY(1.0f + y);
        view.setTranslationY(y);
    }

    /* renamed from: i0 */
    public static void m2269i0(View view, Rect clipBounds) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(clipBounds);
        }
    }

    /* renamed from: o */
    public static Rect m2280o(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: I */
    public static boolean m2234I(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: E */
    public static boolean m2230E(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: p0 */
    public static void m2283p0(View view, int indicators, int mask) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(indicators, mask);
        }
    }

    /* renamed from: p */
    public static Display m2282p(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m2234I(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m2264g(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0468h.m2326a(root).mo2595f(evt);
    }

    /* renamed from: f */
    public static boolean m2262f(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0468h.m2326a(root).mo2591b(root, evt);
    }

    /* renamed from: M */
    public static boolean m2238M(View view) {
        Boolean result = m2255b0().mo2588f(view);
        if (result == null) {
            return false;
        }
        return result.booleanValue();
    }

    /* renamed from: a.h.m.r$b */
    public static class C0462b extends C0466f<Boolean> {
        public C0462b(int tagKey, Class type, int frameworkMinimumSdk) {
            super(tagKey, type, frameworkMinimumSdk);
        }

        /* renamed from: i */
        public Boolean mo2568d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* renamed from: j */
        public void mo2569e(View view, Boolean value) {
            view.setScreenReaderFocusable(value.booleanValue());
        }

        /* renamed from: k */
        public boolean mo2570h(Boolean oldValue, Boolean newValue) {
            return !mo2585a(oldValue, newValue);
        }
    }

    /* renamed from: b0 */
    public static C0466f<Boolean> m2255b0() {
        return new C0462b(C0324b.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: k */
    public static CharSequence m2272k(View view) {
        return m2244S().mo2588f(view);
    }

    /* renamed from: a.h.m.r$c */
    public static class C0463c extends C0466f<CharSequence> {
        public C0463c(int tagKey, Class type, int contentChangeType, int frameworkMinimumSdk) {
            super(tagKey, type, contentChangeType, frameworkMinimumSdk);
        }

        /* renamed from: i */
        public CharSequence mo2568d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: j */
        public void mo2569e(View view, CharSequence value) {
            view.setAccessibilityPaneTitle(value);
        }

        /* renamed from: k */
        public boolean mo2570h(CharSequence oldValue, CharSequence newValue) {
            return !TextUtils.equals(oldValue, newValue);
        }
    }

    /* renamed from: S */
    public static C0466f<CharSequence> m2244S() {
        return new C0463c(C0324b.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: H */
    public static boolean m2233H(View view) {
        Boolean result = m2252a().mo2588f(view);
        if (result == null) {
            return false;
        }
        return result.booleanValue();
    }

    /* renamed from: d0 */
    public static void m2259d0(View view, boolean isHeading) {
        m2252a().mo2589g(view, Boolean.valueOf(isHeading));
    }

    /* renamed from: a.h.m.r$d */
    public static class C0464d extends C0466f<Boolean> {
        public C0464d(int tagKey, Class type, int frameworkMinimumSdk) {
            super(tagKey, type, frameworkMinimumSdk);
        }

        /* renamed from: i */
        public Boolean mo2568d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* renamed from: j */
        public void mo2569e(View view, Boolean value) {
            view.setAccessibilityHeading(value.booleanValue());
        }

        /* renamed from: k */
        public boolean mo2570h(Boolean oldValue, Boolean newValue) {
            return !mo2585a(oldValue, newValue);
        }
    }

    /* renamed from: a */
    public static C0466f<Boolean> m2252a() {
        return new C0464d(C0324b.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: a.h.m.r$f */
    public static abstract class C0466f<T> {

        /* renamed from: a */
        public final int f2039a;

        /* renamed from: b */
        public final Class<T> f2040b;

        /* renamed from: c */
        public final int f2041c;

        /* renamed from: d */
        public abstract T mo2568d(View view);

        /* renamed from: e */
        public abstract void mo2569e(View view, T t);

        /* renamed from: h */
        public abstract boolean mo2570h(T t, T t2);

        public C0466f(int tagKey, Class<T> type, int frameworkMinimumSdk) {
            this(tagKey, type, 0, frameworkMinimumSdk);
        }

        public C0466f(int tagKey, Class<T> type, int contentChangeType, int frameworkMinimumSdk) {
            this.f2039a = tagKey;
            this.f2040b = type;
            this.f2041c = frameworkMinimumSdk;
        }

        /* renamed from: g */
        public void mo2589g(View view, T value) {
            if (mo2587c()) {
                mo2569e(view, value);
            } else if (mo2586b() && mo2570h(mo2588f(view), value)) {
                C0460r.m2295y(view);
                view.setTag(this.f2039a, value);
                C0460r.m2239N(view, 0);
            }
        }

        /* renamed from: f */
        public T mo2588f(View view) {
            if (mo2587c()) {
                return mo2568d(view);
            }
            if (!mo2586b()) {
                return null;
            }
            Object value = view.getTag(this.f2039a);
            if (this.f2040b.isInstance(value)) {
                return value;
            }
            return null;
        }

        /* renamed from: c */
        public final boolean mo2587c() {
            return Build.VERSION.SDK_INT >= this.f2041c;
        }

        /* renamed from: b */
        public final boolean mo2586b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: a */
        public boolean mo2585a(Boolean a, Boolean b) {
            if ((a == null ? false : a.booleanValue()) == (b == null ? false : b.booleanValue())) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: N */
    public static void m2239N(View view, int changeType) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean isAccessibilityPane = m2272k(view) != null;
            if (m2270j(view) != 0 || (isAccessibilityPane && view.getVisibility() == 0)) {
                AccessibilityEvent event = AccessibilityEvent.obtain();
                event.setEventType(isAccessibilityPane ? 32 : 2048);
                event.setContentChangeTypes(changeType);
                view.sendAccessibilityEventUnchecked(event);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, changeType);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: a.h.m.r$e */
    public static class C0465e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public WeakHashMap<View, Boolean> f2038b = new WeakHashMap<>();

        public void onGlobalLayout() {
            for (Map.Entry<View, Boolean> entry : this.f2038b.entrySet()) {
                mo2580a(entry.getKey(), entry.getValue().booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            mo2581b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }

        /* renamed from: a */
        public final void mo2580a(View pane, boolean oldVisibility) {
            boolean newVisibility = pane.getVisibility() == 0;
            if (oldVisibility != newVisibility) {
                if (newVisibility) {
                    C0460r.m2239N(pane, 16);
                }
                this.f2038b.put(pane, Boolean.valueOf(newVisibility));
            }
        }

        /* renamed from: b */
        public final void mo2581b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: a.h.m.r$h */
    public static class C0468h {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f2042d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f2043a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f2044b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f2045c = null;

        /* renamed from: d */
        public final SparseArray<WeakReference<View>> mo2593d() {
            if (this.f2044b == null) {
                this.f2044b = new SparseArray<>();
            }
            return this.f2044b;
        }

        /* renamed from: a */
        public static C0468h m2326a(View root) {
            int i = C0324b.tag_unhandled_key_event_manager;
            C0468h manager = (C0468h) root.getTag(i);
            if (manager != null) {
                return manager;
            }
            C0468h manager2 = new C0468h();
            root.setTag(i, manager2);
            return manager2;
        }

        /* renamed from: b */
        public boolean mo2591b(View root, KeyEvent event) {
            if (event.getAction() == 0) {
                mo2596g();
            }
            View consumer = mo2592c(root, event);
            if (event.getAction() == 0) {
                int keycode = event.getKeyCode();
                if (consumer != null && !KeyEvent.isModifierKey(keycode)) {
                    mo2593d().put(keycode, new WeakReference(consumer));
                }
            }
            return consumer != null;
        }

        /* renamed from: c */
        public final View mo2592c(View view, KeyEvent event) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2043a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup vg = (ViewGroup) view;
                for (int i = vg.getChildCount() - 1; i >= 0; i--) {
                    View consumer = mo2592c(vg.getChildAt(i), event);
                    if (consumer != null) {
                        return consumer;
                    }
                }
            }
            if (mo2594e(view, event)) {
                return view;
            }
            return null;
        }

        /* renamed from: f */
        public boolean mo2595f(KeyEvent event) {
            int idx;
            WeakReference<KeyEvent> weakReference = this.f2045c;
            if (weakReference != null && weakReference.get() == event) {
                return false;
            }
            this.f2045c = new WeakReference<>(event);
            WeakReference<View> currentReceiver = null;
            SparseArray<WeakReference<View>> capturedKeys = mo2593d();
            if (event.getAction() == 1 && (idx = capturedKeys.indexOfKey(event.getKeyCode())) >= 0) {
                currentReceiver = capturedKeys.valueAt(idx);
                capturedKeys.removeAt(idx);
            }
            if (currentReceiver == null) {
                currentReceiver = capturedKeys.get(event.getKeyCode());
            }
            if (currentReceiver == null) {
                return false;
            }
            View target = (View) currentReceiver.get();
            if (target != null && C0460r.m2234I(target)) {
                mo2594e(target, event);
            }
            return true;
        }

        /* renamed from: e */
        public final boolean mo2594e(View v, KeyEvent event) {
            ArrayList<ViewCompat.OnUnhandledKeyEventListenerCompat> viewListeners = (ArrayList) v.getTag(C0324b.tag_unhandled_key_listeners);
            if (viewListeners == null) {
                return false;
            }
            for (int i = viewListeners.size() - 1; i >= 0; i--) {
                if (((C0467g) viewListeners.get(i)).mo2590a(v, event)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final void mo2596g() {
            Boolean bool = Boolean.TRUE;
            WeakHashMap<View, Boolean> weakHashMap = this.f2043a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2042d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f2043a == null) {
                        this.f2043a = new WeakHashMap<>();
                    }
                    for (int i = arrayList.size() - 1; i >= 0; i--) {
                        ArrayList<WeakReference<View>> arrayList2 = f2042d;
                        View v = (View) arrayList2.get(i).get();
                        if (v == null) {
                            arrayList2.remove(i);
                        } else {
                            this.f2043a.put(v, bool);
                            for (ViewParent nxt = v.getParent(); nxt instanceof View; nxt = nxt.getParent()) {
                                this.f2043a.put((View) nxt, bool);
                            }
                        }
                    }
                }
            }
        }
    }
}
