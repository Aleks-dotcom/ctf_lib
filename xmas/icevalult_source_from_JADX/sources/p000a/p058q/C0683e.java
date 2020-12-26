package p000a.p058q;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p000a.p046k.p047a.C0562q;
import p000a.p058q.C0706m;

@SuppressLint({"RestrictedApi"})
/* renamed from: a.q.e */
public class C0683e extends C0562q {
    /* renamed from: e */
    public boolean mo3045e(Object transition) {
        return transition instanceof C0706m;
    }

    /* renamed from: g */
    public Object mo3046g(Object transition) {
        if (transition != null) {
            return ((C0706m) transition).clone();
        }
        return null;
    }

    /* renamed from: A */
    public Object mo3041A(Object transition) {
        if (transition == null) {
            return null;
        }
        C0719q transitionSet = new C0719q();
        transitionSet.mo3586e0((C0706m) transition);
        return transitionSet;
    }

    /* renamed from: y */
    public void mo3055y(Object transitionObj, View nonExistentView, ArrayList<View> sharedViews) {
        C0719q transition = (C0719q) transitionObj;
        List<View> views = transition.mo3528C();
        views.clear();
        int count = sharedViews.size();
        for (int i = 0; i < count; i++) {
            C0562q.m2871d(views, sharedViews.get(i));
        }
        views.add(nonExistentView);
        sharedViews.add(nonExistentView);
        mo3043b(transition, sharedViews);
    }

    /* renamed from: v */
    public void mo3054v(Object transitionObj, View view) {
        if (view != null) {
            Rect epicenter = new Rect();
            mo3071k(view, epicenter);
            ((C0706m) transitionObj).mo3544V(new C0684a(this, epicenter));
        }
    }

    /* renamed from: a.q.e$a */
    public class C0684a extends C0706m.C0711e {
        public C0684a(C0683e this$0, Rect rect) {
        }
    }

    /* renamed from: b */
    public void mo3043b(Object transitionObj, ArrayList<View> views) {
        C0706m transition = (C0706m) transitionObj;
        if (transition != null) {
            if (transition instanceof C0719q) {
                C0719q set = (C0719q) transition;
                int numTransitions = set.mo3589h0();
                for (int i = 0; i < numTransitions; i++) {
                    mo3043b(set.mo3588g0(i), views);
                }
            } else if (!m3364B(transition) && C0562q.m2874l(transition.mo3528C())) {
                int numViews = views.size();
                for (int i2 = 0; i2 < numViews; i2++) {
                    transition.mo3551b(views.get(i2));
                }
            }
        }
    }

    /* renamed from: B */
    public static boolean m3364B(C0706m transition) {
        return !C0562q.m2874l(transition.mo3573z()) || !C0562q.m2874l(transition.mo3526A()) || !C0562q.m2874l(transition.mo3527B());
    }

    /* renamed from: n */
    public Object mo3048n(Object transition1, Object transition2, Object transition3) {
        C0719q transitionSet = new C0719q();
        if (transition1 != null) {
            transitionSet.mo3586e0((C0706m) transition1);
        }
        if (transition2 != null) {
            transitionSet.mo3586e0((C0706m) transition2);
        }
        if (transition3 != null) {
            transitionSet.mo3586e0((C0706m) transition3);
        }
        return transitionSet;
    }

    /* renamed from: a.q.e$b */
    public class C0685b implements C0706m.C0712f {

        /* renamed from: a */
        public final /* synthetic */ View f2635a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2636b;

        public C0685b(C0683e this$0, View view, ArrayList arrayList) {
            this.f2635a = view;
            this.f2636b = arrayList;
        }

        /* renamed from: a */
        public void mo3496a(C0706m transition) {
        }

        /* renamed from: c */
        public void mo3473c(C0706m transition) {
            transition.mo3538P(this);
            this.f2635a.setVisibility(8);
            int numViews = this.f2636b.size();
            for (int i = 0; i < numViews; i++) {
                ((View) this.f2636b.get(i)).setVisibility(0);
            }
        }

        /* renamed from: b */
        public void mo3472b(C0706m transition) {
        }

        /* renamed from: d */
        public void mo3474d(C0706m transition) {
        }

        /* renamed from: e */
        public void mo3475e(C0706m transition) {
        }
    }

    /* renamed from: r */
    public void mo3051r(Object exitTransitionObj, View fragmentView, ArrayList<View> exitingViews) {
        ((C0706m) exitTransitionObj).mo3549a(new C0685b(this, fragmentView, exitingViews));
    }

    /* renamed from: m */
    public Object mo3047m(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
        C0706m staggered = null;
        C0706m exitTransition = (C0706m) exitTransitionObj;
        C0706m enterTransition = (C0706m) enterTransitionObj;
        C0706m sharedElementTransition = (C0706m) sharedElementTransitionObj;
        if (exitTransition != null && enterTransition != null) {
            C0719q qVar = new C0719q();
            qVar.mo3586e0(exitTransition);
            qVar.mo3586e0(enterTransition);
            staggered = qVar.mo3594m0(1);
        } else if (exitTransition != null) {
            staggered = exitTransition;
        } else if (enterTransition != null) {
            staggered = enterTransition;
        }
        if (sharedElementTransition == null) {
            return staggered;
        }
        C0719q together = new C0719q();
        if (staggered != null) {
            together.mo3586e0(staggered);
        }
        together.mo3586e0(sharedElementTransition);
        return together;
    }

    /* renamed from: c */
    public void mo3044c(ViewGroup sceneRoot, Object transition) {
        C0715o.m3502a(sceneRoot, (C0706m) transition);
    }

    /* renamed from: a.q.e$c */
    public class C0686c extends C0714n {

        /* renamed from: a */
        public final /* synthetic */ Object f2637a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2638b;

        /* renamed from: c */
        public final /* synthetic */ Object f2639c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f2640d;

        /* renamed from: e */
        public final /* synthetic */ Object f2641e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f2642f;

        public C0686c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2637a = obj;
            this.f2638b = arrayList;
            this.f2639c = obj2;
            this.f2640d = arrayList2;
            this.f2641e = obj3;
            this.f2642f = arrayList3;
        }

        /* renamed from: a */
        public void mo3496a(C0706m transition) {
            Object obj = this.f2637a;
            if (obj != null) {
                C0683e.this.mo3050q(obj, this.f2638b, (ArrayList<View>) null);
            }
            Object obj2 = this.f2639c;
            if (obj2 != null) {
                C0683e.this.mo3050q(obj2, this.f2640d, (ArrayList<View>) null);
            }
            Object obj3 = this.f2641e;
            if (obj3 != null) {
                C0683e.this.mo3050q(obj3, this.f2642f, (ArrayList<View>) null);
            }
        }

        /* renamed from: c */
        public void mo3473c(C0706m transition) {
            transition.mo3538P(this);
        }
    }

    /* renamed from: t */
    public void mo3052t(Object overallTransitionObj, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews, Object sharedElementTransition, ArrayList<View> sharedElementsIn) {
        ((C0706m) overallTransitionObj).mo3549a(new C0686c(enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn));
    }

    /* renamed from: z */
    public void mo3056z(Object sharedElementTransitionObj, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn) {
        C0719q sharedElementTransition = (C0719q) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.mo3528C().clear();
            sharedElementTransition.mo3528C().addAll(sharedElementsIn);
            mo3050q(sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    /* renamed from: q */
    public void mo3050q(Object transitionObj, ArrayList<View> oldTargets, ArrayList<View> newTargets) {
        C0706m transition = (C0706m) transitionObj;
        if (transition instanceof C0719q) {
            C0719q set = (C0719q) transition;
            int numTransitions = set.mo3589h0();
            for (int i = 0; i < numTransitions; i++) {
                mo3050q(set.mo3588g0(i), oldTargets, newTargets);
            }
        } else if (!m3364B(transition)) {
            List<View> targets = transition.mo3528C();
            if (targets.size() == oldTargets.size() && targets.containsAll(oldTargets)) {
                int targetCount = newTargets == null ? 0 : newTargets.size();
                for (int i2 = 0; i2 < targetCount; i2++) {
                    transition.mo3551b(newTargets.get(i2));
                }
                for (int i3 = oldTargets.size() - 1; i3 >= 0; i3--) {
                    transition.mo3539Q(oldTargets.get(i3));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3042a(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((C0706m) transitionObj).mo3551b(view);
        }
    }

    /* renamed from: p */
    public void mo3049p(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((C0706m) transitionObj).mo3539Q(view);
        }
    }

    /* renamed from: u */
    public void mo3053u(Object transitionObj, Rect epicenter) {
        if (transitionObj != null) {
            ((C0706m) transitionObj).mo3544V(new C0687d(this, epicenter));
        }
    }

    /* renamed from: a.q.e$d */
    public class C0687d extends C0706m.C0711e {
        public C0687d(C0683e this$0, Rect rect) {
        }
    }
}
