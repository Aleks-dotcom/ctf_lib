package p000a.p043j.p045b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p000a.p018e.C0270h;
import p000a.p025h.p038m.C0420a;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.C0471u;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p025h.p038m.p039a0.C0428d;
import p000a.p025h.p038m.p039a0.C0431e;
import p000a.p043j.p045b.C0508b;

/* renamed from: a.j.b.a */
public abstract class C0504a extends C0420a {

    /* renamed from: n */
    public static final Rect f2118n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o */
    public static final C0508b.C0509a<C0424c> f2119o = new C0505a();

    /* renamed from: p */
    public static final C0508b.C0510b<C0270h<C0424c>, C0424c> f2120p = new C0506b();

    /* renamed from: d */
    public final Rect f2121d = new Rect();

    /* renamed from: e */
    public final Rect f2122e = new Rect();

    /* renamed from: f */
    public final Rect f2123f = new Rect();

    /* renamed from: g */
    public final int[] f2124g = new int[2];

    /* renamed from: h */
    public final AccessibilityManager f2125h;

    /* renamed from: i */
    public final View f2126i;

    /* renamed from: j */
    public C0507c f2127j;

    /* renamed from: k */
    public int f2128k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l */
    public int f2129l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m */
    private int f2130m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: B */
    public abstract int mo2691B(float f, float f2);

    /* renamed from: C */
    public abstract void mo2692C(List<Integer> list);

    /* renamed from: J */
    public abstract boolean mo2697J(int i, int i2, Bundle bundle);

    /* renamed from: N */
    public abstract void mo2701N(int i, C0424c cVar);

    public C0504a(View host) {
        if (host != null) {
            this.f2126i = host;
            this.f2125h = (AccessibilityManager) host.getContext().getSystemService("accessibility");
            host.setFocusable(true);
            if (C0460r.m2290t(host) == 0) {
                C0460r.m2275l0(host, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: b */
    public C0428d mo2420b(View host) {
        if (this.f2127j == null) {
            this.f2127j = new C0507c();
        }
        return this.f2127j;
    }

    /* renamed from: v */
    public final boolean mo2718v(MotionEvent event) {
        if (!this.f2125h.isEnabled() || !this.f2125h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int virtualViewId = mo2691B(event.getX(), event.getY());
            mo2709V(virtualViewId);
            if (virtualViewId != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f2130m == Integer.MIN_VALUE) {
            return false;
        } else {
            mo2709V(RecyclerView.UNDEFINED_DURATION);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo2719w(KeyEvent event) {
        boolean handled = false;
        if (event.getAction() == 1) {
            return false;
        }
        int keyCode = event.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!event.hasNoModifiers()) {
                            return false;
                        }
                        int direction = m2468F(keyCode);
                        int count = event.getRepeatCount() + 1;
                        for (int i = 0; i < count && mo2694G(direction, (Rect) null); i++) {
                            handled = true;
                        }
                        return handled;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!event.hasNoModifiers() || event.getRepeatCount() != 0) {
                return false;
            }
            mo2712p();
            return true;
        } else if (event.hasNoModifiers()) {
            return mo2694G(2, (Rect) null);
        } else {
            if (event.hasModifiers(1)) {
                return mo2694G(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: I */
    public final void mo2696I(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        int i = this.f2129l;
        if (i != Integer.MIN_VALUE) {
            mo2711o(i);
        }
        if (gainFocus) {
            mo2694G(direction, previouslyFocusedRect);
        }
    }

    /* renamed from: x */
    public final int mo2720x() {
        return this.f2128k;
    }

    /* renamed from: A */
    public final int mo2690A() {
        return this.f2129l;
    }

    /* renamed from: F */
    public static int m2468F(int keyCode) {
        if (keyCode == 19) {
            return 33;
        }
        if (keyCode == 21) {
            return 17;
        }
        if (keyCode != 22) {
            return 130;
        }
        return 66;
    }

    /* renamed from: z */
    public final void mo2722z(int virtualViewId, Rect outBounds) {
        mo2695H(virtualViewId).mo2485k(outBounds);
    }

    /* renamed from: a.j.b.a$a */
    public static class C0505a implements C0508b.C0509a<C0424c> {
        /* renamed from: b */
        public void mo2723a(C0424c node, Rect outBounds) {
            node.mo2485k(outBounds);
        }
    }

    /* renamed from: a.j.b.a$b */
    public static class C0506b implements C0508b.C0510b<C0270h<C0424c>, C0424c> {
        /* renamed from: c */
        public C0424c mo2726b(C0270h<C0424c> collection, int index) {
            return collection.mo1908l(index);
        }

        /* renamed from: d */
        public int mo2725a(C0270h<C0424c> collection) {
            return collection.mo1907k();
        }
    }

    /* renamed from: G */
    public final boolean mo2694G(int direction, Rect previouslyFocusedRect) {
        C0424c focusedNode;
        C0424c nextFocusedNode;
        int index;
        C0270h<C0424c> y = mo2721y();
        int focusedNodeId = this.f2129l;
        if (focusedNodeId == Integer.MIN_VALUE) {
            focusedNode = null;
        } else {
            focusedNode = y.mo1901e(focusedNodeId);
        }
        if (direction == 1 || direction == 2) {
            nextFocusedNode = (C0424c) C0508b.m2517d(y, f2120p, f2119o, focusedNode, direction, C0460r.m2292v(this.f2126i) == 1, false);
        } else if (direction == 17 || direction == 33 || direction == 66 || direction == 130) {
            Rect selectedRect = new Rect();
            int i = this.f2129l;
            if (i != Integer.MIN_VALUE) {
                mo2722z(i, selectedRect);
            } else if (previouslyFocusedRect != null) {
                selectedRect.set(previouslyFocusedRect);
            } else {
                m2467D(this.f2126i, direction, selectedRect);
            }
            nextFocusedNode = (C0424c) C0508b.m2516c(y, f2120p, f2119o, focusedNode, selectedRect, direction);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (nextFocusedNode == null) {
            index = RecyclerView.UNDEFINED_DURATION;
        } else {
            index = y.mo1904h(y.mo1903g(nextFocusedNode));
        }
        return mo2707T(index);
    }

    /* renamed from: y */
    public final C0270h<C0424c> mo2721y() {
        List<Integer> virtualViewIds = new ArrayList<>();
        mo2692C(virtualViewIds);
        SparseArrayCompat<AccessibilityNodeInfoCompat> allNodes = new C0270h<>();
        for (int virtualViewId = 0; virtualViewId < virtualViewIds.size(); virtualViewId++) {
            allNodes.mo1905i(virtualViewId, mo2716t(virtualViewId));
        }
        return allNodes;
    }

    /* renamed from: D */
    public static Rect m2467D(View host, int direction, Rect outBounds) {
        int w = host.getWidth();
        int h = host.getHeight();
        if (direction == 17) {
            outBounds.set(w, 0, w, h);
        } else if (direction == 33) {
            outBounds.set(0, h, w, h);
        } else if (direction == 66) {
            outBounds.set(-1, 0, -1, h);
        } else if (direction == 130) {
            outBounds.set(0, -1, w, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return outBounds;
    }

    /* renamed from: p */
    public final boolean mo2712p() {
        int i = this.f2129l;
        return i != Integer.MIN_VALUE && mo2697J(i, 16, (Bundle) null);
    }

    /* renamed from: U */
    public final boolean mo2708U(int virtualViewId, int eventType) {
        ViewParent parent;
        if (virtualViewId == Integer.MIN_VALUE || !this.f2125h.isEnabled() || (parent = this.f2126i.getParent()) == null) {
            return false;
        }
        return C0471u.m2346h(parent, this.f2126i, mo2713q(virtualViewId, eventType));
    }

    /* renamed from: O */
    public void mo2702O(int virtualViewId, boolean hasFocus) {
    }

    /* renamed from: V */
    public final void mo2709V(int virtualViewId) {
        if (this.f2130m != virtualViewId) {
            int previousVirtualViewId = this.f2130m;
            this.f2130m = virtualViewId;
            mo2708U(virtualViewId, 128);
            mo2708U(previousVirtualViewId, 256);
        }
    }

    /* renamed from: q */
    public final AccessibilityEvent mo2713q(int virtualViewId, int eventType) {
        if (virtualViewId != -1) {
            return mo2714r(virtualViewId, eventType);
        }
        return mo2715s(eventType);
    }

    /* renamed from: s */
    public final AccessibilityEvent mo2715s(int eventType) {
        AccessibilityEvent event = AccessibilityEvent.obtain(eventType);
        this.f2126i.onInitializeAccessibilityEvent(event);
        return event;
    }

    /* renamed from: f */
    public void mo2423f(View host, AccessibilityEvent event) {
        super.mo2423f(host, event);
        mo2698K(event);
    }

    /* renamed from: r */
    public final AccessibilityEvent mo2714r(int virtualViewId, int eventType) {
        AccessibilityEvent event = AccessibilityEvent.obtain(eventType);
        C0424c node = mo2695H(virtualViewId);
        event.getText().add(node.mo2503u());
        event.setContentDescription(node.mo2494p());
        event.setScrollable(node.mo2447G());
        event.setPassword(node.mo2446F());
        event.setEnabled(node.mo2442B());
        event.setChecked(node.mo2508z());
        mo2699L(virtualViewId, event);
        if (!event.getText().isEmpty() || event.getContentDescription() != null) {
            event.setClassName(node.mo2491n());
            C0431e.m2160c(event, this.f2126i, virtualViewId);
            event.setPackageName(this.f2126i.getContext().getPackageName());
            return event;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: H */
    public C0424c mo2695H(int virtualViewId) {
        if (virtualViewId == -1) {
            return mo2717u();
        }
        return mo2716t(virtualViewId);
    }

    /* renamed from: u */
    public final C0424c mo2717u() {
        C0424c info = C0424c.m2078K(this.f2126i);
        C0460r.m2243R(this.f2126i, info);
        ArrayList<Integer> virtualViewIds = new ArrayList<>();
        mo2692C(virtualViewIds);
        if (info.mo2489m() <= 0 || virtualViewIds.size() <= 0) {
            int count = virtualViewIds.size();
            for (int i = 0; i < count; i++) {
                info.mo2468c(this.f2126i, virtualViewIds.get(i).intValue());
            }
            return info;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: g */
    public void mo2424g(View host, C0424c info) {
        super.mo2424g(host, info);
        mo2700M(info);
    }

    /* renamed from: t */
    public final C0424c mo2716t(int virtualViewId) {
        C0424c node = C0424c.m2077J();
        node.mo2467b0(true);
        node.mo2471d0(true);
        node.mo2459V("android.view.View");
        Rect rect = f2118n;
        node.mo2455R(rect);
        node.mo2456S(rect);
        node.mo2484j0(this.f2126i);
        mo2701N(virtualViewId, node);
        if (node.mo2503u() == null && node.mo2494p() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        node.mo2485k(this.f2122e);
        if (!this.f2122e.equals(rect)) {
            int actions = node.mo2481i();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                node.mo2479h0(this.f2126i.getContext().getPackageName());
                node.mo2493o0(this.f2126i, virtualViewId);
                if (this.f2128k == virtualViewId) {
                    node.mo2453P(true);
                    node.mo2464a(128);
                } else {
                    node.mo2453P(false);
                    node.mo2464a(64);
                }
                boolean isFocused = this.f2129l == virtualViewId;
                if (isFocused) {
                    node.mo2464a(2);
                } else if (node.mo2443C()) {
                    node.mo2464a(1);
                }
                node.mo2473e0(isFocused);
                this.f2126i.getLocationOnScreen(this.f2124g);
                node.mo2487l(this.f2121d);
                if (this.f2121d.equals(rect)) {
                    node.mo2485k(this.f2121d);
                    if (node.f1997b != -1) {
                        C0424c parentNode = C0424c.m2077J();
                        for (int virtualDescendantId = node.f1997b; virtualDescendantId != -1; virtualDescendantId = parentNode.f1997b) {
                            parentNode.mo2486k0(this.f2126i, -1);
                            parentNode.mo2455R(f2118n);
                            mo2701N(virtualDescendantId, parentNode);
                            parentNode.mo2485k(this.f2122e);
                            Rect rect2 = this.f2121d;
                            Rect rect3 = this.f2122e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        parentNode.mo2451N();
                    }
                    this.f2121d.offset(this.f2124g[0] - this.f2126i.getScrollX(), this.f2124g[1] - this.f2126i.getScrollY());
                }
                if (this.f2126i.getLocalVisibleRect(this.f2123f)) {
                    this.f2123f.offset(this.f2124g[0] - this.f2126i.getScrollX(), this.f2124g[1] - this.f2126i.getScrollY());
                    if (this.f2121d.intersect(this.f2123f)) {
                        node.mo2456S(this.f2121d);
                        if (mo2693E(this.f2121d)) {
                            node.mo2497q0(true);
                        }
                    }
                }
                return node;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: P */
    public boolean mo2703P(int virtualViewId, int action, Bundle arguments) {
        if (virtualViewId != -1) {
            return mo2704Q(virtualViewId, action, arguments);
        }
        return mo2705R(action, arguments);
    }

    /* renamed from: R */
    public final boolean mo2705R(int action, Bundle arguments) {
        return C0460r.m2245T(this.f2126i, action, arguments);
    }

    /* renamed from: Q */
    public final boolean mo2704Q(int virtualViewId, int action, Bundle arguments) {
        if (action == 1) {
            return mo2707T(virtualViewId);
        }
        if (action == 2) {
            return mo2711o(virtualViewId);
        }
        if (action == 64) {
            return mo2706S(virtualViewId);
        }
        if (action != 128) {
            return mo2697J(virtualViewId, action, arguments);
        }
        return mo2710n(virtualViewId);
    }

    /* renamed from: E */
    public final boolean mo2693E(Rect localRect) {
        if (localRect == null || localRect.isEmpty() || this.f2126i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent viewParent = this.f2126i.getParent();
        while (viewParent instanceof View) {
            View view = (View) viewParent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            viewParent = view.getParent();
        }
        if (viewParent != null) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public final boolean mo2706S(int virtualViewId) {
        int i;
        if (!this.f2125h.isEnabled() || !this.f2125h.isTouchExplorationEnabled() || (i = this.f2128k) == virtualViewId) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            mo2710n(i);
        }
        this.f2128k = virtualViewId;
        this.f2126i.invalidate();
        mo2708U(virtualViewId, 32768);
        return true;
    }

    /* renamed from: n */
    public final boolean mo2710n(int virtualViewId) {
        if (this.f2128k != virtualViewId) {
            return false;
        }
        this.f2128k = RecyclerView.UNDEFINED_DURATION;
        this.f2126i.invalidate();
        mo2708U(virtualViewId, 65536);
        return true;
    }

    /* renamed from: T */
    public final boolean mo2707T(int virtualViewId) {
        int i;
        if ((!this.f2126i.isFocused() && !this.f2126i.requestFocus()) || (i = this.f2129l) == virtualViewId) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            mo2711o(i);
        }
        this.f2129l = virtualViewId;
        mo2702O(virtualViewId, true);
        mo2708U(virtualViewId, 8);
        return true;
    }

    /* renamed from: o */
    public final boolean mo2711o(int virtualViewId) {
        if (this.f2129l != virtualViewId) {
            return false;
        }
        this.f2129l = RecyclerView.UNDEFINED_DURATION;
        mo2702O(virtualViewId, false);
        mo2708U(virtualViewId, 8);
        return true;
    }

    /* renamed from: L */
    public void mo2699L(int virtualViewId, AccessibilityEvent event) {
    }

    /* renamed from: K */
    public void mo2698K(AccessibilityEvent event) {
    }

    /* renamed from: M */
    public void mo2700M(C0424c node) {
    }

    /* renamed from: a.j.b.a$c */
    public class C0507c extends C0428d {
        public C0507c() {
        }

        /* renamed from: a */
        public C0424c mo2512a(int virtualViewId) {
            return C0424c.m2079L(C0504a.this.mo2695H(virtualViewId));
        }

        /* renamed from: e */
        public boolean mo2516e(int virtualViewId, int action, Bundle arguments) {
            return C0504a.this.mo2703P(virtualViewId, action, arguments);
        }

        /* renamed from: c */
        public C0424c mo2514c(int focusType) {
            int focusedId = focusType == 2 ? C0504a.this.f2128k : C0504a.this.f2129l;
            if (focusedId == Integer.MIN_VALUE) {
                return null;
            }
            return mo2512a(focusedId);
        }
    }
}
