package p000a.p025h.p038m;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: a.h.m.u */
public final class C0471u {
    @Deprecated
    /* renamed from: h */
    public static boolean m2346h(ViewParent parent, View child, AccessibilityEvent event) {
        return parent.requestSendAccessibilityEvent(child, event);
    }

    /* renamed from: f */
    public static boolean m2344f(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof C0453k) {
            return ((C0453k) parent).mo2550o(child, target, nestedScrollAxes, type);
        }
        if (type != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onStartNestedScroll(child, target, nestedScrollAxes);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        } else if (parent instanceof C0455m) {
            return ((C0455m) parent).onStartNestedScroll(child, target, nestedScrollAxes);
        } else {
            return false;
        }
    }

    /* renamed from: e */
    public static void m2343e(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof C0453k) {
            ((C0453k) parent).mo2546i(child, target, nestedScrollAxes, type);
        } else if (type != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedScrollAccepted(child, target, nestedScrollAxes);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e);
                }
            } else if (parent instanceof C0455m) {
                ((C0455m) parent).onNestedScrollAccepted(child, target, nestedScrollAxes);
            }
        }
    }

    /* renamed from: g */
    public static void m2345g(ViewParent parent, View target, int type) {
        if (parent instanceof C0453k) {
            ((C0453k) parent).mo2548m(target, type);
        } else if (type != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onStopNestedScroll(target);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStopNestedScroll", e);
                }
            } else if (parent instanceof C0455m) {
                ((C0455m) parent).onStopNestedScroll(target);
            }
        }
    }

    /* renamed from: d */
    public static void m2342d(ViewParent parent, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        ViewParent viewParent = parent;
        if (viewParent instanceof C0454l) {
            ((C0454l) viewParent).mo2551k(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type, consumed);
            return;
        }
        consumed[0] = consumed[0] + dxUnconsumed;
        consumed[1] = consumed[1] + dyUnconsumed;
        if (viewParent instanceof C0453k) {
            ((C0453k) viewParent).mo2547l(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
        } else if (type != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScroll", e);
                }
            } else if (viewParent instanceof C0455m) {
                ((C0455m) viewParent).onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
            }
        }
    }

    /* renamed from: c */
    public static void m2341c(ViewParent parent, View target, int dx, int dy, int[] consumed, int type) {
        if (parent instanceof C0453k) {
            ((C0453k) parent).mo2549n(target, dx, dy, consumed, type);
        } else if (type != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedPreScroll(target, dx, dy, consumed);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedPreScroll", e);
                }
            } else if (parent instanceof C0455m) {
                ((C0455m) parent).onNestedPreScroll(target, dx, dy, consumed);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2339a(ViewParent parent, View target, float velocityX, float velocityY, boolean consumed) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onNestedFling(target, velocityX, velocityY, consumed);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedFling", e);
                return false;
            }
        } else if (parent instanceof C0455m) {
            return ((C0455m) parent).onNestedFling(target, velocityX, velocityY, consumed);
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m2340b(ViewParent parent, View target, float velocityX, float velocityY) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onNestedPreFling(target, velocityX, velocityY);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        } else if (parent instanceof C0455m) {
            return ((C0455m) parent).onNestedPreFling(target, velocityX, velocityY);
        } else {
            return false;
        }
    }
}
