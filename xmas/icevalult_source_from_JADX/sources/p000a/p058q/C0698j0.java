package p000a.p058q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p000a.p058q.C0659a;
import p000a.p058q.C0706m;

/* renamed from: a.q.j0 */
public abstract class C0698j0 extends C0706m {

    /* renamed from: L */
    public static final String[] f2658L = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: K */
    public int f2659K = 3;

    /* renamed from: a.q.j0$c */
    public static class C0701c {

        /* renamed from: a */
        public boolean f2670a;

        /* renamed from: b */
        public boolean f2671b;

        /* renamed from: c */
        public int f2672c;

        /* renamed from: d */
        public int f2673d;

        /* renamed from: e */
        public ViewGroup f2674e;

        /* renamed from: f */
        public ViewGroup f2675f;
    }

    /* renamed from: e0 */
    public abstract Animator mo3487e0(ViewGroup viewGroup, View view, C0723s sVar, C0723s sVar2);

    /* renamed from: g0 */
    public abstract Animator mo3488g0(ViewGroup viewGroup, View view, C0723s sVar, C0723s sVar2);

    /* renamed from: i0 */
    public void mo3512i0(int mode) {
        if ((mode & -4) == 0) {
            this.f2659K = mode;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: D */
    public String[] mo3439D() {
        return f2658L;
    }

    /* renamed from: c0 */
    public final void mo3508c0(C0723s transitionValues) {
        transitionValues.f2741a.put("android:visibility:visibility", Integer.valueOf(transitionValues.f2742b.getVisibility()));
        transitionValues.f2741a.put("android:visibility:parent", transitionValues.f2742b.getParent());
        int[] loc = new int[2];
        transitionValues.f2742b.getLocationOnScreen(loc);
        transitionValues.f2741a.put("android:visibility:screenLocation", loc);
    }

    /* renamed from: j */
    public void mo3443j(C0723s transitionValues) {
        mo3508c0(transitionValues);
    }

    /* renamed from: g */
    public void mo3442g(C0723s transitionValues) {
        mo3508c0(transitionValues);
    }

    /* renamed from: d0 */
    public final C0701c mo3509d0(C0723s startValues, C0723s endValues) {
        C0701c visInfo = new C0701c();
        visInfo.f2670a = false;
        visInfo.f2671b = false;
        if (startValues == null || !startValues.f2741a.containsKey("android:visibility:visibility")) {
            visInfo.f2672c = -1;
            visInfo.f2674e = null;
        } else {
            visInfo.f2672c = ((Integer) startValues.f2741a.get("android:visibility:visibility")).intValue();
            visInfo.f2674e = (ViewGroup) startValues.f2741a.get("android:visibility:parent");
        }
        if (endValues == null || !endValues.f2741a.containsKey("android:visibility:visibility")) {
            visInfo.f2673d = -1;
            visInfo.f2675f = null;
        } else {
            visInfo.f2673d = ((Integer) endValues.f2741a.get("android:visibility:visibility")).intValue();
            visInfo.f2675f = (ViewGroup) endValues.f2741a.get("android:visibility:parent");
        }
        if (startValues != null && endValues != null) {
            int i = visInfo.f2672c;
            int i2 = visInfo.f2673d;
            if (i == i2 && visInfo.f2674e == visInfo.f2675f) {
                return visInfo;
            }
            if (i != i2) {
                if (i == 0) {
                    visInfo.f2671b = false;
                    visInfo.f2670a = true;
                } else if (i2 == 0) {
                    visInfo.f2671b = true;
                    visInfo.f2670a = true;
                }
            } else if (visInfo.f2675f == null) {
                visInfo.f2671b = false;
                visInfo.f2670a = true;
            } else if (visInfo.f2674e == null) {
                visInfo.f2671b = true;
                visInfo.f2670a = true;
            }
        } else if (startValues == null && visInfo.f2673d == 0) {
            visInfo.f2671b = true;
            visInfo.f2670a = true;
        } else if (endValues == null && visInfo.f2672c == 0) {
            visInfo.f2671b = false;
            visInfo.f2670a = true;
        }
        return visInfo;
    }

    /* renamed from: n */
    public Animator mo3444n(ViewGroup sceneRoot, C0723s startValues, C0723s endValues) {
        C0701c visInfo = mo3509d0(startValues, endValues);
        if (!visInfo.f2670a) {
            return null;
        }
        if (visInfo.f2674e == null && visInfo.f2675f == null) {
            return null;
        }
        if (visInfo.f2671b) {
            return mo3510f0(sceneRoot, startValues, visInfo.f2672c, endValues, visInfo.f2673d);
        }
        return mo3511h0(sceneRoot, startValues, visInfo.f2672c, endValues, visInfo.f2673d);
    }

    /* renamed from: f0 */
    public Animator mo3510f0(ViewGroup sceneRoot, C0723s startValues, int startVisibility, C0723s endValues, int endVisibility) {
        if ((this.f2659K & 1) != 1 || endValues == null) {
            return null;
        }
        if (startValues == null) {
            View endParent = (View) endValues.f2742b.getParent();
            if (mo3509d0(mo3567t(endParent, false), mo3529E(endParent, false)).f2670a) {
                return null;
            }
        }
        return mo3487e0(sceneRoot, endValues.f2742b, startValues, endValues);
    }

    /* renamed from: h0 */
    public Animator mo3511h0(ViewGroup sceneRoot, C0723s startValues, int startVisibility, C0723s endValues, int endVisibility) {
        ViewGroup viewGroup = sceneRoot;
        C0723s sVar = startValues;
        C0723s sVar2 = endValues;
        int i = endVisibility;
        if ((this.f2659K & 2) != 2 || sVar == null) {
            return null;
        }
        View startView = sVar.f2742b;
        View endView = sVar2 != null ? sVar2.f2742b : null;
        View overlayView = null;
        View viewToKeep = null;
        boolean reusingOverlayView = false;
        int i2 = C0697j.save_overlay_view;
        View savedOverlayView = (View) startView.getTag(i2);
        if (savedOverlayView != null) {
            overlayView = savedOverlayView;
            reusingOverlayView = true;
            View view = endView;
        } else {
            boolean needOverlayForStartView = false;
            if (endView == null || endView.getParent() == null) {
                if (endView != null) {
                    overlayView = endView;
                } else {
                    needOverlayForStartView = true;
                }
            } else if (i == 4) {
                viewToKeep = endView;
            } else if (startView == endView) {
                viewToKeep = endView;
            } else {
                needOverlayForStartView = true;
            }
            if (!needOverlayForStartView) {
            } else if (startView.getParent() == null) {
                overlayView = startView;
                View view2 = endView;
            } else if (startView.getParent() instanceof View) {
                View startParent = (View) startView.getParent();
                C0723s startParentValues = mo3529E(startParent, true);
                View view3 = endView;
                C0723s sVar3 = startParentValues;
                if (!mo3509d0(startParentValues, mo3567t(startParent, true)).f2670a) {
                    overlayView = C0722r.m3546a(viewGroup, startView, startParent);
                } else {
                    int id = startParent.getId();
                    if (startParent.getParent() == null) {
                        View view4 = startParent;
                        if (!(id == -1 || viewGroup.findViewById(id) == null || !this.f2712w)) {
                            overlayView = startView;
                        }
                    }
                }
            }
        }
        if (overlayView != null) {
            if (!reusingOverlayView) {
                int[] screenLoc = (int[]) sVar.f2741a.get("android:visibility:screenLocation");
                int screenX = screenLoc[0];
                int screenY = screenLoc[1];
                int[] loc = new int[2];
                viewGroup.getLocationOnScreen(loc);
                overlayView.offsetLeftAndRight((screenX - loc[0]) - overlayView.getLeft());
                overlayView.offsetTopAndBottom((screenY - loc[1]) - overlayView.getTop());
                C0728x.m3558a(sceneRoot).mo3601c(overlayView);
            }
            Animator animator = mo3488g0(viewGroup, overlayView, sVar, sVar2);
            if (!reusingOverlayView) {
                if (animator == null) {
                    C0728x.m3558a(sceneRoot).mo3600a(overlayView);
                } else {
                    startView.setTag(i2, overlayView);
                    mo3549a(new C0699a(sceneRoot, overlayView, startView));
                }
            }
            return animator;
        } else if (viewToKeep == null) {
            return null;
        } else {
            int originalVisibility = viewToKeep.getVisibility();
            C0676c0.m3347h(viewToKeep, 0);
            Animator animator2 = mo3488g0(viewGroup, viewToKeep, sVar, sVar2);
            if (animator2 != null) {
                C0700b disappearListener = new C0700b(viewToKeep, i, true);
                animator2.addListener(disappearListener);
                C0659a.m3307a(animator2, disappearListener);
                mo3549a(disappearListener);
            } else {
                C0676c0.m3347h(viewToKeep, originalVisibility);
            }
            return animator2;
        }
    }

    /* renamed from: a.q.j0$a */
    public class C0699a extends C0714n {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f2660a;

        /* renamed from: b */
        public final /* synthetic */ View f2661b;

        /* renamed from: c */
        public final /* synthetic */ View f2662c;

        public C0699a(ViewGroup viewGroup, View view, View view2) {
            this.f2660a = viewGroup;
            this.f2661b = view;
            this.f2662c = view2;
        }

        /* renamed from: d */
        public void mo3474d(C0706m transition) {
            C0728x.m3558a(this.f2660a).mo3600a(this.f2661b);
        }

        /* renamed from: e */
        public void mo3475e(C0706m transition) {
            if (this.f2661b.getParent() == null) {
                C0728x.m3558a(this.f2660a).mo3601c(this.f2661b);
            } else {
                C0698j0.this.mo3556f();
            }
        }

        /* renamed from: c */
        public void mo3473c(C0706m transition) {
            this.f2662c.setTag(C0697j.save_overlay_view, (Object) null);
            C0728x.m3558a(this.f2660a).mo3600a(this.f2661b);
            transition.mo3538P(this);
        }
    }

    /* renamed from: F */
    public boolean mo3507F(C0723s startValues, C0723s newValues) {
        if (startValues == null && newValues == null) {
            return false;
        }
        if (startValues != null && newValues != null && newValues.f2741a.containsKey("android:visibility:visibility") != startValues.f2741a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0701c changeInfo = mo3509d0(startValues, newValues);
        if (!changeInfo.f2670a) {
            return false;
        }
        if (changeInfo.f2672c == 0 || changeInfo.f2673d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a.q.j0$b */
    public static class C0700b extends AnimatorListenerAdapter implements C0706m.C0712f, C0659a.C0660a {

        /* renamed from: a */
        public final View f2664a;

        /* renamed from: b */
        public final int f2665b;

        /* renamed from: c */
        public final ViewGroup f2666c;

        /* renamed from: d */
        public final boolean f2667d;

        /* renamed from: e */
        public boolean f2668e;

        /* renamed from: f */
        public boolean f2669f = false;

        public C0700b(View view, int finalVisibility, boolean suppressLayout) {
            this.f2664a = view;
            this.f2665b = finalVisibility;
            this.f2666c = (ViewGroup) view.getParent();
            this.f2667d = suppressLayout;
            mo3514g(true);
        }

        public void onAnimationPause(Animator animation) {
            if (!this.f2669f) {
                C0676c0.m3347h(this.f2664a, this.f2665b);
            }
        }

        public void onAnimationResume(Animator animation) {
            if (!this.f2669f) {
                C0676c0.m3347h(this.f2664a, 0);
            }
        }

        public void onAnimationCancel(Animator animation) {
            this.f2669f = true;
        }

        public void onAnimationRepeat(Animator animation) {
        }

        public void onAnimationStart(Animator animation) {
        }

        public void onAnimationEnd(Animator animation) {
            mo3513f();
        }

        /* renamed from: a */
        public void mo3496a(C0706m transition) {
        }

        /* renamed from: c */
        public void mo3473c(C0706m transition) {
            mo3513f();
            transition.mo3538P(this);
        }

        /* renamed from: b */
        public void mo3472b(C0706m transition) {
        }

        /* renamed from: d */
        public void mo3474d(C0706m transition) {
            mo3514g(false);
        }

        /* renamed from: e */
        public void mo3475e(C0706m transition) {
            mo3514g(true);
        }

        /* renamed from: f */
        public final void mo3513f() {
            if (!this.f2669f) {
                C0676c0.m3347h(this.f2664a, this.f2665b);
                ViewGroup viewGroup = this.f2666c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo3514g(false);
        }

        /* renamed from: g */
        public final void mo3514g(boolean suppress) {
            ViewGroup viewGroup;
            if (this.f2667d && this.f2668e != suppress && (viewGroup = this.f2666c) != null) {
                this.f2668e = suppress;
                C0728x.m3560c(viewGroup, suppress);
            }
        }
    }
}
