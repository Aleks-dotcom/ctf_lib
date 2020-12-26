package p000a.p046k.p047a;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a.k.a.p */
public class C0557p extends C0562q {
    /* renamed from: e */
    public boolean mo3045e(Object transition) {
        return transition instanceof Transition;
    }

    /* renamed from: g */
    public Object mo3046g(Object transition) {
        if (transition != null) {
            return ((Transition) transition).clone();
        }
        return null;
    }

    /* renamed from: A */
    public Object mo3041A(Object transition) {
        if (transition == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) transition);
        return transitionSet;
    }

    /* renamed from: y */
    public void mo3055y(Object transitionObj, View nonExistentView, ArrayList<View> sharedViews) {
        TransitionSet transition = (TransitionSet) transitionObj;
        List<View> views = transition.getTargets();
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
            ((Transition) transitionObj).setEpicenterCallback(new C0558a(this, epicenter));
        }
    }

    /* renamed from: a.k.a.p$a */
    public class C0558a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f2346a;

        public C0558a(C0557p this$0, Rect rect) {
            this.f2346a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f2346a;
        }
    }

    /* renamed from: b */
    public void mo3043b(Object transitionObj, ArrayList<View> views) {
        Transition transition = (Transition) transitionObj;
        if (transition != null) {
            if (transition instanceof TransitionSet) {
                TransitionSet set = (TransitionSet) transition;
                int numTransitions = set.getTransitionCount();
                for (int i = 0; i < numTransitions; i++) {
                    mo3043b(set.getTransitionAt(i), views);
                }
            } else if (!m2854B(transition) && C0562q.m2874l(transition.getTargets())) {
                int numViews = views.size();
                for (int i2 = 0; i2 < numViews; i2++) {
                    transition.addTarget(views.get(i2));
                }
            }
        }
    }

    /* renamed from: B */
    public static boolean m2854B(Transition transition) {
        return !C0562q.m2874l(transition.getTargetIds()) || !C0562q.m2874l(transition.getTargetNames()) || !C0562q.m2874l(transition.getTargetTypes());
    }

    /* renamed from: n */
    public Object mo3048n(Object transition1, Object transition2, Object transition3) {
        TransitionSet transitionSet = new TransitionSet();
        if (transition1 != null) {
            transitionSet.addTransition((Transition) transition1);
        }
        if (transition2 != null) {
            transitionSet.addTransition((Transition) transition2);
        }
        if (transition3 != null) {
            transitionSet.addTransition((Transition) transition3);
        }
        return transitionSet;
    }

    /* renamed from: a.k.a.p$b */
    public class C0559b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f2347a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2348b;

        public C0559b(C0557p this$0, View view, ArrayList arrayList) {
            this.f2347a = view;
            this.f2348b = arrayList;
        }

        public void onTransitionStart(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f2347a.setVisibility(8);
            int numViews = this.f2348b.size();
            for (int i = 0; i < numViews; i++) {
                ((View) this.f2348b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }
    }

    /* renamed from: r */
    public void mo3051r(Object exitTransitionObj, View fragmentView, ArrayList<View> exitingViews) {
        ((Transition) exitTransitionObj).addListener(new C0559b(this, fragmentView, exitingViews));
    }

    /* renamed from: m */
    public Object mo3047m(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
        Transition staggered = null;
        Transition exitTransition = (Transition) exitTransitionObj;
        Transition enterTransition = (Transition) enterTransitionObj;
        Transition sharedElementTransition = (Transition) sharedElementTransitionObj;
        if (exitTransition != null && enterTransition != null) {
            staggered = new TransitionSet().addTransition(exitTransition).addTransition(enterTransition).setOrdering(1);
        } else if (exitTransition != null) {
            staggered = exitTransition;
        } else if (enterTransition != null) {
            staggered = enterTransition;
        }
        if (sharedElementTransition == null) {
            return staggered;
        }
        TransitionSet together = new TransitionSet();
        if (staggered != null) {
            together.addTransition(staggered);
        }
        together.addTransition(sharedElementTransition);
        return together;
    }

    /* renamed from: c */
    public void mo3044c(ViewGroup sceneRoot, Object transition) {
        TransitionManager.beginDelayedTransition(sceneRoot, (Transition) transition);
    }

    /* renamed from: a.k.a.p$c */
    public class C0560c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f2349a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2350b;

        /* renamed from: c */
        public final /* synthetic */ Object f2351c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f2352d;

        /* renamed from: e */
        public final /* synthetic */ Object f2353e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f2354f;

        public C0560c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2349a = obj;
            this.f2350b = arrayList;
            this.f2351c = obj2;
            this.f2352d = arrayList2;
            this.f2353e = obj3;
            this.f2354f = arrayList3;
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f2349a;
            if (obj != null) {
                C0557p.this.mo3050q(obj, this.f2350b, (ArrayList<View>) null);
            }
            Object obj2 = this.f2351c;
            if (obj2 != null) {
                C0557p.this.mo3050q(obj2, this.f2352d, (ArrayList<View>) null);
            }
            Object obj3 = this.f2353e;
            if (obj3 != null) {
                C0557p.this.mo3050q(obj3, this.f2354f, (ArrayList<View>) null);
            }
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }
    }

    /* renamed from: t */
    public void mo3052t(Object overallTransitionObj, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews, Object sharedElementTransition, ArrayList<View> sharedElementsIn) {
        ((Transition) overallTransitionObj).addListener(new C0560c(enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn));
    }

    /* renamed from: z */
    public void mo3056z(Object sharedElementTransitionObj, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn) {
        TransitionSet sharedElementTransition = (TransitionSet) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.getTargets().clear();
            sharedElementTransition.getTargets().addAll(sharedElementsIn);
            mo3050q(sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    /* renamed from: q */
    public void mo3050q(Object transitionObj, ArrayList<View> oldTargets, ArrayList<View> newTargets) {
        List<View> targets;
        Transition transition = (Transition) transitionObj;
        if (transition instanceof TransitionSet) {
            TransitionSet set = (TransitionSet) transition;
            int numTransitions = set.getTransitionCount();
            for (int i = 0; i < numTransitions; i++) {
                mo3050q(set.getTransitionAt(i), oldTargets, newTargets);
            }
        } else if (!m2854B(transition) && (targets = transition.getTargets()) != null && targets.size() == oldTargets.size() && targets.containsAll(oldTargets)) {
            int targetCount = newTargets == null ? 0 : newTargets.size();
            for (int i2 = 0; i2 < targetCount; i2++) {
                transition.addTarget(newTargets.get(i2));
            }
            for (int i3 = oldTargets.size() - 1; i3 >= 0; i3--) {
                transition.removeTarget(oldTargets.get(i3));
            }
        }
    }

    /* renamed from: a */
    public void mo3042a(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((Transition) transitionObj).addTarget(view);
        }
    }

    /* renamed from: p */
    public void mo3049p(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((Transition) transitionObj).removeTarget(view);
        }
    }

    /* renamed from: u */
    public void mo3053u(Object transitionObj, Rect epicenter) {
        if (transitionObj != null) {
            ((Transition) transitionObj).setEpicenterCallback(new C0561d(this, epicenter));
        }
    }

    /* renamed from: a.k.a.p$d */
    public class C0561d extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f2356a;

        public C0561d(C0557p this$0, Rect rect) {
            this.f2356a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f2356a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f2356a;
        }
    }
}
