package p000a.p058q;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMap;
import androidx.transition.Transition;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p018e.C0256a;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.q.o */
public class C0715o {

    /* renamed from: a */
    public static C0706m f2724a = new C0662b();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<C0256a<ViewGroup, ArrayList<C0706m>>>> f2725b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f2726c = new ArrayList<>();

    /* renamed from: b */
    public static C0256a<ViewGroup, ArrayList<C0706m>> m3503b() {
        ArrayMap<ViewGroup, ArrayList<Transition>> transitions;
        WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> runningTransitions = f2725b.get();
        if (runningTransitions != null && (transitions = (C0256a) runningTransitions.get()) != null) {
            return transitions;
        }
        ArrayMap<ViewGroup, ArrayList<Transition>> transitions2 = new C0256a<>();
        f2725b.set(new WeakReference(transitions2));
        return transitions2;
    }

    /* renamed from: c */
    public static void m3504c(ViewGroup sceneRoot, C0706m transition) {
        if (transition != null && sceneRoot != null) {
            C0716a listener = new C0716a(transition, sceneRoot);
            sceneRoot.addOnAttachStateChangeListener(listener);
            sceneRoot.getViewTreeObserver().addOnPreDrawListener(listener);
        }
    }

    /* renamed from: a.q.o$a */
    public static class C0716a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public C0706m f2727b;

        /* renamed from: c */
        public ViewGroup f2728c;

        public C0716a(C0706m transition, ViewGroup sceneRoot) {
            this.f2727b = transition;
            this.f2728c = sceneRoot;
        }

        /* renamed from: a */
        public final void mo3577a() {
            this.f2728c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f2728c.removeOnAttachStateChangeListener(this);
        }

        public void onViewAttachedToWindow(View v) {
        }

        public void onViewDetachedFromWindow(View v) {
            mo3577a();
            C0715o.f2726c.remove(this.f2728c);
            ArrayList<Transition> runningTransitions = C0715o.m3503b().get(this.f2728c);
            if (runningTransitions != null && runningTransitions.size() > 0) {
                Iterator<Transition> it = runningTransitions.iterator();
                while (it.hasNext()) {
                    ((C0706m) it.next()).mo3540R(this.f2728c);
                }
            }
            this.f2727b.mo3560l(true);
        }

        public boolean onPreDraw() {
            mo3577a();
            if (!C0715o.f2726c.remove(this.f2728c)) {
                return true;
            }
            ArrayMap<ViewGroup, ArrayList<Transition>> runningTransitions = C0715o.m3503b();
            ArrayList<Transition> currentTransitions = runningTransitions.get(this.f2728c);
            ArrayList<Transition> previousRunningTransitions = null;
            if (currentTransitions == null) {
                currentTransitions = new ArrayList<>();
                runningTransitions.put(this.f2728c, currentTransitions);
            } else if (currentTransitions.size() > 0) {
                previousRunningTransitions = new ArrayList<>(currentTransitions);
            }
            currentTransitions.add(this.f2727b);
            this.f2727b.mo3549a(new C0717a(runningTransitions));
            this.f2727b.mo3559k(this.f2728c, false);
            if (previousRunningTransitions != null) {
                Iterator<Transition> it = previousRunningTransitions.iterator();
                while (it.hasNext()) {
                    ((C0706m) it.next()).mo3540R(this.f2728c);
                }
            }
            this.f2727b.mo3537O(this.f2728c);
            return true;
        }

        /* renamed from: a.q.o$a$a */
        public class C0717a extends C0714n {

            /* renamed from: a */
            public final /* synthetic */ C0256a f2729a;

            public C0717a(C0256a aVar) {
                this.f2729a = aVar;
            }

            /* renamed from: c */
            public void mo3473c(C0706m transition) {
                ((ArrayList) this.f2729a.get(C0716a.this.f2728c)).remove(transition);
                transition.mo3538P(this);
            }
        }
    }

    /* renamed from: d */
    public static void m3505d(ViewGroup sceneRoot, C0706m transition) {
        ArrayList<Transition> runningTransitions = m3503b().get(sceneRoot);
        if (runningTransitions != null && runningTransitions.size() > 0) {
            Iterator<Transition> it = runningTransitions.iterator();
            while (it.hasNext()) {
                ((C0706m) it.next()).mo3536N(sceneRoot);
            }
        }
        if (transition != null) {
            transition.mo3559k(sceneRoot, true);
        }
        C0704l previousScene = C0704l.m3435b(sceneRoot);
        if (previousScene != null) {
            previousScene.mo3523a();
        }
    }

    /* renamed from: a */
    public static void m3502a(ViewGroup sceneRoot, C0706m transition) {
        if (!f2726c.contains(sceneRoot) && C0460r.m2235J(sceneRoot)) {
            f2726c.add(sceneRoot);
            if (transition == null) {
                transition = f2724a;
            }
            C0706m transitionClone = transition.clone();
            m3505d(sceneRoot, transitionClone);
            C0704l.m3436c(sceneRoot, (C0704l) null);
            m3504c(sceneRoot, transitionClone);
        }
    }
}
