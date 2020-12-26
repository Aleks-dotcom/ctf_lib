package p000a.p058q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p018e.C0256a;
import p000a.p018e.C0261d;
import p000a.p018e.C0269g;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.q.m */
public abstract class C0706m implements Cloneable {

    /* renamed from: H */
    public static final int[] f2681H = {2, 1, 3, 4};

    /* renamed from: I */
    public static final C0691g f2682I = new C0707a();

    /* renamed from: J */
    public static ThreadLocal<C0256a<Animator, C0710d>> f2683J = new ThreadLocal<>();

    /* renamed from: A */
    public boolean f2684A = false;

    /* renamed from: B */
    public ArrayList<C0712f> f2685B = null;

    /* renamed from: C */
    public ArrayList<Animator> f2686C = new ArrayList<>();

    /* renamed from: D */
    public C0718p f2687D;

    /* renamed from: E */
    public C0711e f2688E;

    /* renamed from: F */
    public C0256a<String, String> f2689F;

    /* renamed from: G */
    public C0691g f2690G = f2682I;

    /* renamed from: b */
    public String f2691b = getClass().getName();

    /* renamed from: c */
    public long f2692c = -1;

    /* renamed from: d */
    public long f2693d = -1;

    /* renamed from: e */
    public TimeInterpolator f2694e = null;

    /* renamed from: f */
    public ArrayList<Integer> f2695f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<View> f2696g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<String> f2697h = null;

    /* renamed from: i */
    public ArrayList<Class<?>> f2698i = null;

    /* renamed from: j */
    public ArrayList<Integer> f2699j = null;

    /* renamed from: k */
    public ArrayList<View> f2700k = null;

    /* renamed from: l */
    public ArrayList<Class<?>> f2701l = null;

    /* renamed from: m */
    public ArrayList<String> f2702m = null;

    /* renamed from: n */
    public ArrayList<Integer> f2703n = null;

    /* renamed from: o */
    public ArrayList<View> f2704o = null;

    /* renamed from: p */
    public ArrayList<Class<?>> f2705p = null;

    /* renamed from: q */
    public C0724t f2706q = new C0724t();

    /* renamed from: r */
    public C0724t f2707r = new C0724t();

    /* renamed from: s */
    public C0719q f2708s = null;

    /* renamed from: t */
    public int[] f2709t = f2681H;

    /* renamed from: u */
    public ArrayList<C0723s> f2710u;

    /* renamed from: v */
    public ArrayList<C0723s> f2711v;

    /* renamed from: w */
    public boolean f2712w = false;

    /* renamed from: x */
    public ArrayList<Animator> f2713x = new ArrayList<>();

    /* renamed from: y */
    public int f2714y = 0;

    /* renamed from: z */
    public boolean f2715z = false;

    /* renamed from: a.q.m$e */
    public static abstract class C0711e {
    }

    /* renamed from: a.q.m$f */
    public interface C0712f {
        /* renamed from: a */
        void mo3496a(C0706m mVar);

        /* renamed from: b */
        void mo3472b(C0706m mVar);

        /* renamed from: c */
        void mo3473c(C0706m mVar);

        /* renamed from: d */
        void mo3474d(C0706m mVar);

        /* renamed from: e */
        void mo3475e(C0706m mVar);
    }

    /* renamed from: g */
    public abstract void mo3442g(C0723s sVar);

    /* renamed from: j */
    public abstract void mo3443j(C0723s sVar);

    /* renamed from: a.q.m$a */
    public static class C0707a extends C0691g {
        /* renamed from: a */
        public Path mo3500a(float startX, float startY, float endX, float endY) {
            Path path = new Path();
            path.moveTo(startX, startY);
            path.lineTo(endX, endY);
            return path;
        }
    }

    /* renamed from: U */
    public C0706m mo3543U(long duration) {
        this.f2693d = duration;
        return this;
    }

    /* renamed from: q */
    public long mo3564q() {
        return this.f2693d;
    }

    /* renamed from: Z */
    public C0706m mo3548Z(long startDelay) {
        this.f2692c = startDelay;
        return this;
    }

    /* renamed from: y */
    public long mo3572y() {
        return this.f2692c;
    }

    /* renamed from: W */
    public C0706m mo3545W(TimeInterpolator interpolator) {
        this.f2694e = interpolator;
        return this;
    }

    /* renamed from: s */
    public TimeInterpolator mo3566s() {
        return this.f2694e;
    }

    /* renamed from: D */
    public String[] mo3439D() {
        return null;
    }

    /* renamed from: n */
    public Animator mo3444n(ViewGroup sceneRoot, C0723s startValues, C0723s endValues) {
        return null;
    }

    /* renamed from: J */
    public final void mo3532J(C0256a<View, C0723s> unmatchedStart, C0256a<View, C0723s> unmatchedEnd) {
        C0723s end;
        for (int i = unmatchedStart.size() - 1; i >= 0; i--) {
            View view = unmatchedStart.mo1882i(i);
            if (view != null && mo3530G(view) && (end = unmatchedEnd.remove(view)) != null && mo3530G(end.f2742b)) {
                this.f2710u.add(unmatchedStart.mo1885k(i));
                this.f2711v.add(end);
            }
        }
    }

    /* renamed from: K */
    public final void mo3533K(C0256a<View, C0723s> unmatchedStart, C0256a<View, C0723s> unmatchedEnd, C0261d<View> startItemIds, C0261d<View> endItemIds) {
        View endView;
        int numStartIds = startItemIds.mo1796m();
        for (int i = 0; i < numStartIds; i++) {
            View startView = startItemIds.mo1797n(i);
            if (startView != null && mo3530G(startView) && (endView = endItemIds.mo1789f(startItemIds.mo1792i(i))) != null && mo3530G(endView)) {
                C0723s startValues = unmatchedStart.get(startView);
                C0723s endValues = unmatchedEnd.get(endView);
                if (!(startValues == null || endValues == null)) {
                    this.f2710u.add(startValues);
                    this.f2711v.add(endValues);
                    unmatchedStart.remove(startView);
                    unmatchedEnd.remove(endView);
                }
            }
        }
    }

    /* renamed from: I */
    public final void mo3531I(C0256a<View, C0723s> unmatchedStart, C0256a<View, C0723s> unmatchedEnd, SparseArray<View> startIds, SparseArray<View> endIds) {
        View endView;
        int numStartIds = startIds.size();
        for (int i = 0; i < numStartIds; i++) {
            View startView = startIds.valueAt(i);
            if (startView != null && mo3530G(startView) && (endView = endIds.get(startIds.keyAt(i))) != null && mo3530G(endView)) {
                C0723s startValues = unmatchedStart.get(startView);
                C0723s endValues = unmatchedEnd.get(endView);
                if (!(startValues == null || endValues == null)) {
                    this.f2710u.add(startValues);
                    this.f2711v.add(endValues);
                    unmatchedStart.remove(startView);
                    unmatchedEnd.remove(endView);
                }
            }
        }
    }

    /* renamed from: L */
    public final void mo3534L(C0256a<View, C0723s> unmatchedStart, C0256a<View, C0723s> unmatchedEnd, C0256a<String, View> startNames, C0256a<String, View> endNames) {
        View endView;
        int numStartNames = startNames.size();
        for (int i = 0; i < numStartNames; i++) {
            View startView = startNames.mo1887m(i);
            if (startView != null && mo3530G(startView) && (endView = endNames.get(startNames.mo1882i(i))) != null && mo3530G(endView)) {
                C0723s startValues = unmatchedStart.get(startView);
                C0723s endValues = unmatchedEnd.get(endView);
                if (!(startValues == null || endValues == null)) {
                    this.f2710u.add(startValues);
                    this.f2711v.add(endValues);
                    unmatchedStart.remove(startView);
                    unmatchedEnd.remove(endView);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo3553c(C0256a<View, C0723s> unmatchedStart, C0256a<View, C0723s> unmatchedEnd) {
        for (int i = 0; i < unmatchedStart.size(); i++) {
            C0723s start = unmatchedStart.mo1887m(i);
            if (mo3530G(start.f2742b)) {
                this.f2710u.add(start);
                this.f2711v.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < unmatchedEnd.size(); i2++) {
            C0723s end = unmatchedEnd.mo1887m(i2);
            if (mo3530G(end.f2742b)) {
                this.f2711v.add(end);
                this.f2710u.add((Object) null);
            }
        }
    }

    /* renamed from: M */
    public final void mo3535M(C0724t startValues, C0724t endValues) {
        ArrayMap<View, TransitionValues> unmatchedStart = new C0256a<>((C0269g) startValues.f2744a);
        ArrayMap<View, TransitionValues> unmatchedEnd = new C0256a<>((C0269g) endValues.f2744a);
        int i = 0;
        while (true) {
            int[] iArr = this.f2709t;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    mo3532J(unmatchedStart, unmatchedEnd);
                } else if (i2 == 2) {
                    mo3534L(unmatchedStart, unmatchedEnd, startValues.f2747d, endValues.f2747d);
                } else if (i2 == 3) {
                    mo3531I(unmatchedStart, unmatchedEnd, startValues.f2745b, endValues.f2745b);
                } else if (i2 == 4) {
                    mo3533K(unmatchedStart, unmatchedEnd, startValues.f2746c, endValues.f2746c);
                }
                i++;
            } else {
                mo3553c(unmatchedStart, unmatchedEnd);
                return;
            }
        }
    }

    /* renamed from: o */
    public void mo3562o(ViewGroup sceneRoot, C0724t startValues, C0724t endValues, ArrayList<C0723s> startValuesList, ArrayList<C0723s> endValuesList) {
        C0723s start;
        C0723s end;
        int i;
        int startValuesListCount;
        View view;
        C0723s infoValues;
        Animator animator;
        long minStartDelay;
        Animator animator2;
        Animator animator3;
        int i2;
        int numExistingAnims;
        ViewGroup viewGroup = sceneRoot;
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = m3440x();
        long minStartDelay2 = RecyclerView.FOREVER_NS;
        SparseIntArray startDelays = new SparseIntArray();
        int startValuesListCount2 = startValuesList.size();
        int i3 = 0;
        while (i3 < startValuesListCount2) {
            C0723s start2 = startValuesList.get(i3);
            C0723s end2 = endValuesList.get(i3);
            if (start2 == null || start2.f2743c.contains(this)) {
                start = start2;
            } else {
                start = null;
            }
            if (end2 == null || end2.f2743c.contains(this)) {
                end = end2;
            } else {
                end = null;
            }
            if (start == null && end == null) {
                startValuesListCount = startValuesListCount2;
                i = i3;
            } else {
                if (start == null || end == null || mo3507F(start, end)) {
                    Animator animator4 = mo3444n(viewGroup, start, end);
                    if (animator4 != null) {
                        C0723s infoValues2 = null;
                        if (end != null) {
                            View view2 = end.f2742b;
                            String[] properties = mo3439D();
                            if (properties != null) {
                                animator3 = animator4;
                                if (properties.length > 0) {
                                    C0723s infoValues3 = new C0723s(view2);
                                    startValuesListCount = startValuesListCount2;
                                    C0723s newValues = endValues.f2744a.get(view2);
                                    if (newValues != null) {
                                        int j = 0;
                                        while (j < properties.length) {
                                            infoValues3.f2741a.put(properties[j], newValues.f2741a.get(properties[j]));
                                            j++;
                                            ArrayList<C0723s> arrayList = startValuesList;
                                            ArrayList<C0723s> arrayList2 = endValuesList;
                                            i3 = i3;
                                            newValues = newValues;
                                        }
                                        i = i3;
                                    } else {
                                        i = i3;
                                    }
                                    int numExistingAnims2 = runningAnimators.size();
                                    int j2 = 0;
                                    while (true) {
                                        if (j2 >= numExistingAnims2) {
                                            infoValues2 = infoValues3;
                                            animator2 = animator3;
                                            break;
                                        }
                                        C0710d info = runningAnimators.get(runningAnimators.mo1882i(j2));
                                        if (info.f2721c != null && info.f2719a == view2) {
                                            numExistingAnims = numExistingAnims2;
                                            if (info.f2720b.equals(mo3569u()) && info.f2721c.equals(infoValues3)) {
                                                infoValues2 = infoValues3;
                                                animator2 = null;
                                                break;
                                            }
                                        } else {
                                            numExistingAnims = numExistingAnims2;
                                        }
                                        j2++;
                                        numExistingAnims2 = numExistingAnims;
                                    }
                                    animator = animator2;
                                    infoValues = infoValues2;
                                    view = view2;
                                } else {
                                    startValuesListCount = startValuesListCount2;
                                    i2 = i3;
                                }
                            } else {
                                animator3 = animator4;
                                startValuesListCount = startValuesListCount2;
                                i2 = i3;
                            }
                            animator2 = animator3;
                            animator = animator2;
                            infoValues = infoValues2;
                            view = view2;
                        } else {
                            startValuesListCount = startValuesListCount2;
                            i = i3;
                            infoValues = null;
                            view = start.f2742b;
                            animator = animator4;
                        }
                        if (animator != null) {
                            C0718p pVar = this.f2687D;
                            if (pVar != null) {
                                long delay = pVar.mo3583c(viewGroup, this, start, end);
                                startDelays.put(this.f2686C.size(), (int) delay);
                                minStartDelay = Math.min(delay, minStartDelay2);
                            } else {
                                minStartDelay = minStartDelay2;
                            }
                            runningAnimators.put(animator, new C0710d(view, mo3569u(), this, C0676c0.m3343d(sceneRoot), infoValues));
                            this.f2686C.add(animator);
                            minStartDelay2 = minStartDelay;
                        }
                    } else {
                        Animator animator5 = animator4;
                        startValuesListCount = startValuesListCount2;
                        i = i3;
                    }
                } else {
                    startValuesListCount = startValuesListCount2;
                    i = i3;
                }
            }
            i3 = i + 1;
            startValuesListCount2 = startValuesListCount;
        }
        int i4 = i3;
        if (startDelays.size() != 0) {
            for (int i5 = 0; i5 < startDelays.size(); i5++) {
                Animator animator6 = this.f2686C.get(startDelays.keyAt(i5));
                animator6.setStartDelay((((long) startDelays.valueAt(i5)) - minStartDelay2) + animator6.getStartDelay());
            }
        }
    }

    /* renamed from: G */
    public boolean mo3530G(View target) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int targetId = target.getId();
        ArrayList<Integer> arrayList3 = this.f2699j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(targetId))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f2700k;
        if (arrayList4 != null && arrayList4.contains(target)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f2701l;
        if (arrayList5 != null) {
            int numTypes = arrayList5.size();
            for (int i = 0; i < numTypes; i++) {
                if (this.f2701l.get(i).isInstance(target)) {
                    return false;
                }
            }
        }
        if (this.f2702m != null && C0460r.m2227B(target) != null && this.f2702m.contains(C0460r.m2227B(target))) {
            return false;
        }
        if ((this.f2695f.size() == 0 && this.f2696g.size() == 0 && (((arrayList = this.f2698i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f2697h) == null || arrayList2.isEmpty()))) || this.f2695f.contains(Integer.valueOf(targetId)) || this.f2696g.contains(target)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f2697h;
        if (arrayList6 != null && arrayList6.contains(C0460r.m2227B(target))) {
            return true;
        }
        if (this.f2698i != null) {
            for (int i2 = 0; i2 < this.f2698i.size(); i2++) {
                if (this.f2698i.get(i2).isInstance(target)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: x */
    public static C0256a<Animator, C0710d> m3440x() {
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = (C0256a) f2683J.get();
        if (runningAnimators != null) {
            return runningAnimators;
        }
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators2 = new C0256a<>();
        f2683J.set(runningAnimators2);
        return runningAnimators2;
    }

    /* renamed from: T */
    public void mo3542T() {
        mo3550a0();
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = m3440x();
        Iterator<Animator> it = this.f2686C.iterator();
        while (it.hasNext()) {
            Animator anim = it.next();
            if (runningAnimators.containsKey(anim)) {
                mo3550a0();
                mo3541S(anim, runningAnimators);
            }
        }
        this.f2686C.clear();
        mo3563p();
    }

    /* renamed from: S */
    public final void mo3541S(Animator animator, C0256a<Animator, C0710d> runningAnimators) {
        if (animator != null) {
            animator.addListener(new C0708b(runningAnimators));
            mo3555e(animator);
        }
    }

    /* renamed from: a.q.m$b */
    public class C0708b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C0256a f2716a;

        public C0708b(C0256a aVar) {
            this.f2716a = aVar;
        }

        public void onAnimationStart(Animator animation) {
            C0706m.this.f2713x.add(animation);
        }

        public void onAnimationEnd(Animator animation) {
            this.f2716a.remove(animation);
            C0706m.this.f2713x.remove(animation);
        }
    }

    /* renamed from: b */
    public C0706m mo3551b(View target) {
        this.f2696g.add(target);
        return this;
    }

    /* renamed from: Q */
    public C0706m mo3539Q(View target) {
        this.f2696g.remove(target);
        return this;
    }

    /* renamed from: z */
    public List<Integer> mo3573z() {
        return this.f2695f;
    }

    /* renamed from: C */
    public List<View> mo3528C() {
        return this.f2696g;
    }

    /* renamed from: A */
    public List<String> mo3526A() {
        return this.f2697h;
    }

    /* renamed from: B */
    public List<Class<?>> mo3527B() {
        return this.f2698i;
    }

    /* renamed from: k */
    public void mo3559k(ViewGroup sceneRoot, boolean start) {
        C0256a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo3560l(start);
        if ((this.f2695f.size() > 0 || this.f2696g.size() > 0) && (((arrayList = this.f2697h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f2698i) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f2695f.size(); i++) {
                View view = sceneRoot.findViewById(this.f2695f.get(i).intValue());
                if (view != null) {
                    C0723s values = new C0723s(view);
                    if (start) {
                        mo3443j(values);
                    } else {
                        mo3442g(values);
                    }
                    values.f2743c.add(this);
                    mo3558i(values);
                    if (start) {
                        m3439d(this.f2706q, view, values);
                    } else {
                        m3439d(this.f2707r, view, values);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f2696g.size(); i2++) {
                View view2 = this.f2696g.get(i2);
                C0723s values2 = new C0723s(view2);
                if (start) {
                    mo3443j(values2);
                } else {
                    mo3442g(values2);
                }
                values2.f2743c.add(this);
                mo3558i(values2);
                if (start) {
                    m3439d(this.f2706q, view2, values2);
                } else {
                    m3439d(this.f2707r, view2, values2);
                }
            }
        } else {
            mo3557h(sceneRoot, start);
        }
        if (!start && (aVar = this.f2689F) != null) {
            int numOverrides = aVar.size();
            ArrayList<View> overriddenViews = new ArrayList<>(numOverrides);
            for (int i3 = 0; i3 < numOverrides; i3++) {
                overriddenViews.add(this.f2706q.f2747d.remove(this.f2689F.mo1882i(i3)));
            }
            for (int i4 = 0; i4 < numOverrides; i4++) {
                View view3 = overriddenViews.get(i4);
                if (view3 != null) {
                    this.f2706q.f2747d.put(this.f2689F.mo1887m(i4), view3);
                }
            }
        }
    }

    /* renamed from: d */
    public static void m3439d(C0724t transitionValuesMaps, View view, C0723s transitionValues) {
        transitionValuesMaps.f2744a.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (transitionValuesMaps.f2745b.indexOfKey(id) >= 0) {
                transitionValuesMaps.f2745b.put(id, (Object) null);
            } else {
                transitionValuesMaps.f2745b.put(id, view);
            }
        }
        String name = C0460r.m2227B(view);
        if (name != null) {
            if (transitionValuesMaps.f2747d.containsKey(name)) {
                transitionValuesMaps.f2747d.put(name, null);
            } else {
                transitionValuesMaps.f2747d.put(name, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listview = (ListView) view.getParent();
            if (listview.getAdapter().hasStableIds()) {
                long itemId = listview.getItemIdAtPosition(listview.getPositionForView(view));
                if (transitionValuesMaps.f2746c.mo1791h(itemId) >= 0) {
                    View alreadyMatched = transitionValuesMaps.f2746c.mo1789f(itemId);
                    if (alreadyMatched != null) {
                        C0460r.m2273k0(alreadyMatched, false);
                        transitionValuesMaps.f2746c.mo1793j(itemId, null);
                        return;
                    }
                    return;
                }
                C0460r.m2273k0(view, true);
                transitionValuesMaps.f2746c.mo1793j(itemId, view);
            }
        }
    }

    /* renamed from: l */
    public void mo3560l(boolean start) {
        if (start) {
            this.f2706q.f2744a.clear();
            this.f2706q.f2745b.clear();
            this.f2706q.f2746c.mo1784b();
            return;
        }
        this.f2707r.f2744a.clear();
        this.f2707r.f2745b.clear();
        this.f2707r.f2746c.mo1784b();
    }

    /* renamed from: h */
    public final void mo3557h(View view, boolean start) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f2699j;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f2700k;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f2701l;
                    if (arrayList3 != null) {
                        int numTypes = arrayList3.size();
                        int i = 0;
                        while (i < numTypes) {
                            if (!this.f2701l.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C0723s values = new C0723s(view);
                        if (start) {
                            mo3443j(values);
                        } else {
                            mo3442g(values);
                        }
                        values.f2743c.add(this);
                        mo3558i(values);
                        if (start) {
                            m3439d(this.f2706q, view, values);
                        } else {
                            m3439d(this.f2707r, view, values);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f2703n;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f2704o;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f2705p;
                                if (arrayList6 != null) {
                                    int numTypes2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < numTypes2) {
                                        if (!this.f2705p.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup parent = (ViewGroup) view;
                                for (int i3 = 0; i3 < parent.getChildCount(); i3++) {
                                    mo3557h(parent.getChildAt(i3), start);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: E */
    public C0723s mo3529E(View view, boolean start) {
        C0719q qVar = this.f2708s;
        if (qVar != null) {
            return qVar.mo3529E(view, start);
        }
        return (start ? this.f2706q : this.f2707r).f2744a.get(view);
    }

    /* renamed from: t */
    public C0723s mo3567t(View view, boolean viewInStart) {
        C0719q qVar = this.f2708s;
        if (qVar != null) {
            return qVar.mo3567t(view, viewInStart);
        }
        ArrayList<C0723s> arrayList = viewInStart ? this.f2710u : this.f2711v;
        if (arrayList == null) {
            return null;
        }
        int count = arrayList.size();
        int index = -1;
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            }
            C0723s values = arrayList.get(i);
            if (values == null) {
                return null;
            }
            if (values.f2742b == view) {
                index = i;
                break;
            }
            i++;
        }
        if (index < 0) {
            return null;
        }
        return (viewInStart ? this.f2711v : this.f2710u).get(index);
    }

    /* renamed from: N */
    public void mo3536N(View sceneRoot) {
        if (!this.f2684A) {
            ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = m3440x();
            int numOldAnims = runningAnimators.size();
            C0713m0 windowId = C0676c0.m3343d(sceneRoot);
            for (int i = numOldAnims - 1; i >= 0; i--) {
                C0710d info = runningAnimators.mo1887m(i);
                if (info.f2719a != null && windowId.equals(info.f2722d)) {
                    C0659a.m3308b(runningAnimators.mo1882i(i));
                }
            }
            ArrayList<C0712f> arrayList = this.f2685B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f2685B.clone();
                int numListeners = tmpListeners.size();
                for (int i2 = 0; i2 < numListeners; i2++) {
                    ((C0712f) tmpListeners.get(i2)).mo3474d(this);
                }
            }
            this.f2715z = true;
        }
    }

    /* renamed from: R */
    public void mo3540R(View sceneRoot) {
        if (this.f2715z) {
            if (!this.f2684A) {
                ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = m3440x();
                int numOldAnims = runningAnimators.size();
                C0713m0 windowId = C0676c0.m3343d(sceneRoot);
                for (int i = numOldAnims - 1; i >= 0; i--) {
                    C0710d info = runningAnimators.mo1887m(i);
                    if (info.f2719a != null && windowId.equals(info.f2722d)) {
                        C0659a.m3309c(runningAnimators.mo1882i(i));
                    }
                }
                ArrayList<C0712f> arrayList = this.f2685B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f2685B.clone();
                    int numListeners = tmpListeners.size();
                    for (int i2 = 0; i2 < numListeners; i2++) {
                        ((C0712f) tmpListeners.get(i2)).mo3475e(this);
                    }
                }
            }
            this.f2715z = false;
        }
    }

    /* renamed from: O */
    public void mo3537O(ViewGroup sceneRoot) {
        C0710d oldInfo;
        this.f2710u = new ArrayList<>();
        this.f2711v = new ArrayList<>();
        mo3535M(this.f2706q, this.f2707r);
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = m3440x();
        int numOldAnims = runningAnimators.size();
        C0713m0 windowId = C0676c0.m3343d(sceneRoot);
        for (int i = numOldAnims - 1; i >= 0; i--) {
            Animator anim = runningAnimators.mo1882i(i);
            if (!(anim == null || (oldInfo = runningAnimators.get(anim)) == null || oldInfo.f2719a == null || !windowId.equals(oldInfo.f2722d))) {
                C0723s oldValues = oldInfo.f2721c;
                View oldView = oldInfo.f2719a;
                boolean cancel = true;
                C0723s startValues = mo3529E(oldView, true);
                C0723s endValues = mo3567t(oldView, true);
                if (startValues == null && endValues == null) {
                    endValues = this.f2707r.f2744a.get(oldView);
                }
                if ((startValues == null && endValues == null) || !oldInfo.f2723e.mo3507F(oldValues, endValues)) {
                    cancel = false;
                }
                if (cancel) {
                    if (anim.isRunning() || anim.isStarted()) {
                        anim.cancel();
                    } else {
                        runningAnimators.remove(anim);
                    }
                }
            }
        }
        mo3562o(sceneRoot, this.f2706q, this.f2707r, this.f2710u, this.f2711v);
        mo3542T();
    }

    /* renamed from: F */
    public boolean mo3507F(C0723s startValues, C0723s endValues) {
        if (startValues == null || endValues == null) {
            return false;
        }
        String[] properties = mo3439D();
        if (properties != null) {
            for (String property : properties) {
                if (m3438H(startValues, endValues, property)) {
                    return true;
                }
            }
            return false;
        }
        for (String key : startValues.f2741a.keySet()) {
            if (m3438H(startValues, endValues, key)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m3438H(C0723s oldValues, C0723s newValues, String key) {
        Object oldValue = oldValues.f2741a.get(key);
        Object newValue = newValues.f2741a.get(key);
        if (oldValue == null && newValue == null) {
            return false;
        }
        if (oldValue == null || newValue == null) {
            return true;
        }
        return !oldValue.equals(newValue);
    }

    /* renamed from: e */
    public void mo3555e(Animator animator) {
        if (animator == null) {
            mo3563p();
            return;
        }
        if (mo3564q() >= 0) {
            animator.setDuration(mo3564q());
        }
        if (mo3572y() >= 0) {
            animator.setStartDelay(mo3572y() + animator.getStartDelay());
        }
        if (mo3566s() != null) {
            animator.setInterpolator(mo3566s());
        }
        animator.addListener(new C0709c());
        animator.start();
    }

    /* renamed from: a.q.m$c */
    public class C0709c extends AnimatorListenerAdapter {
        public C0709c() {
        }

        public void onAnimationEnd(Animator animation) {
            C0706m.this.mo3563p();
            animation.removeListener(this);
        }
    }

    /* renamed from: a0 */
    public void mo3550a0() {
        if (this.f2714y == 0) {
            ArrayList<C0712f> arrayList = this.f2685B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f2685B.clone();
                int numListeners = tmpListeners.size();
                for (int i = 0; i < numListeners; i++) {
                    ((C0712f) tmpListeners.get(i)).mo3496a(this);
                }
            }
            this.f2684A = false;
        }
        this.f2714y++;
    }

    /* renamed from: p */
    public void mo3563p() {
        int i = this.f2714y - 1;
        this.f2714y = i;
        if (i == 0) {
            ArrayList<C0712f> arrayList = this.f2685B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f2685B.clone();
                int numListeners = tmpListeners.size();
                for (int i2 = 0; i2 < numListeners; i2++) {
                    ((C0712f) tmpListeners.get(i2)).mo3473c(this);
                }
            }
            for (int i3 = 0; i3 < this.f2706q.f2746c.mo1796m(); i3++) {
                View view = this.f2706q.f2746c.mo1797n(i3);
                if (view != null) {
                    C0460r.m2273k0(view, false);
                }
            }
            for (int i4 = 0; i4 < this.f2707r.f2746c.mo1796m(); i4++) {
                View view2 = this.f2707r.f2746c.mo1797n(i4);
                if (view2 != null) {
                    C0460r.m2273k0(view2, false);
                }
            }
            this.f2684A = true;
        }
    }

    /* renamed from: f */
    public void mo3556f() {
        for (int i = this.f2713x.size() - 1; i >= 0; i--) {
            this.f2713x.get(i).cancel();
        }
        ArrayList<C0712f> arrayList = this.f2685B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f2685B.clone();
            int numListeners = tmpListeners.size();
            for (int i2 = 0; i2 < numListeners; i2++) {
                ((C0712f) tmpListeners.get(i2)).mo3472b(this);
            }
        }
    }

    /* renamed from: a */
    public C0706m mo3549a(C0712f listener) {
        if (this.f2685B == null) {
            this.f2685B = new ArrayList<>();
        }
        this.f2685B.add(listener);
        return this;
    }

    /* renamed from: P */
    public C0706m mo3538P(C0712f listener) {
        ArrayList<C0712f> arrayList = this.f2685B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(listener);
        if (this.f2685B.size() == 0) {
            this.f2685B = null;
        }
        return this;
    }

    /* renamed from: X */
    public void mo3546X(C0691g pathMotion) {
        if (pathMotion == null) {
            this.f2690G = f2682I;
        } else {
            this.f2690G = pathMotion;
        }
    }

    /* renamed from: v */
    public C0691g mo3570v() {
        return this.f2690G;
    }

    /* renamed from: V */
    public void mo3544V(C0711e epicenterCallback) {
        this.f2688E = epicenterCallback;
    }

    /* renamed from: r */
    public C0711e mo3565r() {
        return this.f2688E;
    }

    /* renamed from: Y */
    public void mo3547Y(C0718p transitionPropagation) {
    }

    /* renamed from: w */
    public C0718p mo3571w() {
        return this.f2687D;
    }

    /* renamed from: i */
    public void mo3558i(C0723s transitionValues) {
        String[] propertyNames;
        if (this.f2687D != null && !transitionValues.f2741a.isEmpty() && (propertyNames = this.f2687D.mo3582b()) != null) {
            boolean containsAll = true;
            int i = 0;
            while (true) {
                if (i >= propertyNames.length) {
                    break;
                } else if (!transitionValues.f2741a.containsKey(propertyNames[i])) {
                    containsAll = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!containsAll) {
                this.f2687D.mo3581a(transitionValues);
            }
        }
    }

    public String toString() {
        return mo3552b0("");
    }

    /* renamed from: m */
    public C0706m clone() {
        try {
            C0706m clone = (C0706m) super.clone();
            clone.f2686C = new ArrayList<>();
            clone.f2706q = new C0724t();
            clone.f2707r = new C0724t();
            clone.f2710u = null;
            clone.f2711v = null;
            return clone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /* renamed from: u */
    public String mo3569u() {
        return this.f2691b;
    }

    /* renamed from: b0 */
    public String mo3552b0(String indent) {
        String result = indent + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f2693d != -1) {
            result = result + "dur(" + this.f2693d + ") ";
        }
        if (this.f2692c != -1) {
            result = result + "dly(" + this.f2692c + ") ";
        }
        if (this.f2694e != null) {
            result = result + "interp(" + this.f2694e + ") ";
        }
        if (this.f2695f.size() <= 0 && this.f2696g.size() <= 0) {
            return result;
        }
        String result2 = result + "tgts(";
        if (this.f2695f.size() > 0) {
            for (int i = 0; i < this.f2695f.size(); i++) {
                if (i > 0) {
                    result2 = result2 + ", ";
                }
                result2 = result2 + this.f2695f.get(i);
            }
        }
        if (this.f2696g.size() > 0) {
            for (int i2 = 0; i2 < this.f2696g.size(); i2++) {
                if (i2 > 0) {
                    result2 = result2 + ", ";
                }
                result2 = result2 + this.f2696g.get(i2);
            }
        }
        return result2 + ")";
    }

    /* renamed from: a.q.m$d */
    public static class C0710d {

        /* renamed from: a */
        public View f2719a;

        /* renamed from: b */
        public String f2720b;

        /* renamed from: c */
        public C0723s f2721c;

        /* renamed from: d */
        public C0713m0 f2722d;

        /* renamed from: e */
        public C0706m f2723e;

        public C0710d(View view, String name, C0706m transition, C0713m0 windowId, C0723s values) {
            this.f2719a = view;
            this.f2720b = name;
            this.f2721c = values;
            this.f2722d = windowId;
            this.f2723e = transition;
        }
    }
}
