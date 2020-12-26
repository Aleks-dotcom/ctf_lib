package p000a.p046k.p047a;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000a.p018e.C0256a;
import p000a.p025h.p026d.C0336f;
import p000a.p025h.p038m.C0458p;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.k.a.o */
public class C0551o {

    /* renamed from: a */
    public static final int[] f2309a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    public static final C0562q f2310b = (Build.VERSION.SDK_INT >= 21 ? new C0557p() : null);

    /* renamed from: c */
    public static final C0562q f2311c = m2851x();

    /* renamed from: a.k.a.o$e */
    public static class C0556e {

        /* renamed from: a */
        public Fragment f2340a;

        /* renamed from: b */
        public boolean f2341b;

        /* renamed from: c */
        public C0516a f2342c;

        /* renamed from: d */
        public Fragment f2343d;

        /* renamed from: e */
        public boolean f2344e;

        /* renamed from: f */
        public C0516a f2345f;
    }

    /* renamed from: x */
    public static C0562q m2851x() {
        try {
            return (C0562q) Class.forName("a.q.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: C */
    public static void m2827C(C0529j fragmentManager, ArrayList<C0516a> records, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex, boolean isReordered) {
        if (fragmentManager.f2221q >= 1) {
            SparseArray<FragmentTransition.FragmentContainerTransition> transitioningFragments = new SparseArray<>();
            for (int i = startIndex; i < endIndex; i++) {
                C0516a record = records.get(i);
                if (isRecordPop.get(i).booleanValue()) {
                    m2832e(record, transitioningFragments, isReordered);
                } else {
                    m2830c(record, transitioningFragments, isReordered);
                }
            }
            if (transitioningFragments.size() != 0) {
                View nonExistentView = new View(fragmentManager.f2222r.mo2864i());
                int numContainers = transitioningFragments.size();
                for (int i2 = 0; i2 < numContainers; i2++) {
                    int containerId = transitioningFragments.keyAt(i2);
                    ArrayMap<String, String> nameOverrides = m2831d(containerId, records, isRecordPop, startIndex, endIndex);
                    C0556e containerTransition = (C0556e) transitioningFragments.valueAt(i2);
                    if (isReordered) {
                        m2842o(fragmentManager, containerId, containerTransition, nonExistentView, nameOverrides);
                    } else {
                        m2841n(fragmentManager, containerId, containerTransition, nonExistentView, nameOverrides);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public static C0256a<String, String> m2831d(int containerId, ArrayList<C0516a> records, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        ArrayList<String> sources;
        ArrayList<String> targets;
        ArrayMap<String, String> nameOverrides = new C0256a<>();
        for (int recordNum = endIndex - 1; recordNum >= startIndex; recordNum--) {
            C0516a record = records.get(recordNum);
            if (record.mo2786j(containerId)) {
                boolean isPop = isRecordPop.get(recordNum).booleanValue();
                ArrayList<String> arrayList = record.f2297n;
                if (arrayList != null) {
                    int numSharedElements = arrayList.size();
                    if (isPop) {
                        targets = record.f2297n;
                        sources = record.f2298o;
                    } else {
                        sources = record.f2297n;
                        targets = record.f2298o;
                    }
                    for (int i = 0; i < numSharedElements; i++) {
                        String sourceName = sources.get(i);
                        String targetName = targets.get(i);
                        String previousTarget = nameOverrides.remove(targetName);
                        if (previousTarget != null) {
                            nameOverrides.put(sourceName, previousTarget);
                        } else {
                            nameOverrides.put(sourceName, targetName);
                        }
                    }
                }
            }
        }
        return nameOverrides;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r14 = r10.f2340a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2842o(p000a.p046k.p047a.C0529j r23, int r24, p000a.p046k.p047a.C0551o.C0556e r25, android.view.View r26, p000a.p018e.C0256a<java.lang.String, java.lang.String> r27) {
        /*
            r0 = r23
            r10 = r25
            r11 = r26
            r1 = 0
            a.k.a.e r2 = r0.f2223s
            boolean r2 = r2.mo2827g()
            if (r2 == 0) goto L_0x001c
            a.k.a.e r2 = r0.f2223s
            r12 = r24
            android.view.View r2 = r2.mo2826f(r12)
            r1 = r2
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r13 = r1
            goto L_0x001f
        L_0x001c:
            r12 = r24
            r13 = r1
        L_0x001f:
            if (r13 != 0) goto L_0x0022
            return
        L_0x0022:
            androidx.fragment.app.Fragment r14 = r10.f2340a
            androidx.fragment.app.Fragment r15 = r10.f2343d
            a.k.a.q r9 = m2837j(r15, r14)
            if (r9 != 0) goto L_0x002d
            return
        L_0x002d:
            boolean r8 = r10.f2341b
            boolean r7 = r10.f2344e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5 = r1
            java.lang.Object r4 = m2845r(r9, r14, r8)
            java.lang.Object r3 = m2846s(r9, r15, r7)
            r1 = r9
            r2 = r13
            r16 = r3
            r3 = r26
            r17 = r4
            r4 = r27
            r18 = r5
            r5 = r25
            r19 = r6
            r6 = r18
            r20 = r7
            r7 = r19
            r21 = r8
            r8 = r17
            r0 = r9
            r9 = r16
            java.lang.Object r9 = m2840m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r8 != 0) goto L_0x0070
            if (r9 != 0) goto L_0x0070
            r7 = r16
            if (r7 != 0) goto L_0x0072
            return
        L_0x0070:
            r7 = r16
        L_0x0072:
            r6 = r18
            java.util.ArrayList r5 = m2838k(r0, r7, r15, r6, r11)
            r4 = r19
            java.util.ArrayList r3 = m2838k(r0, r8, r14, r4, r11)
            r1 = 4
            m2826B(r3, r1)
            r1 = r0
            r2 = r8
            r16 = r3
            r3 = r7
            r10 = r4
            r4 = r9
            r11 = r5
            r5 = r14
            r6 = r21
            java.lang.Object r6 = m2849v(r1, r2, r3, r4, r5, r6)
            if (r6 == 0) goto L_0x00c7
            m2850w(r0, r7, r15, r11)
            java.util.ArrayList r17 = r0.mo3072o(r10)
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r16
            r5 = r7
            r12 = r6
            r6 = r11
            r19 = r7
            r7 = r9
            r22 = r8
            r8 = r10
            r1.mo3052t(r2, r3, r4, r5, r6, r7, r8)
            r0.mo3044c(r13, r12)
            r2 = r0
            r3 = r13
            r4 = r18
            r5 = r10
            r6 = r17
            r7 = r27
            r2.mo3075x(r3, r4, r5, r6, r7)
            r1 = 0
            r2 = r16
            m2826B(r2, r1)
            r1 = r18
            r0.mo3056z(r9, r1, r10)
            goto L_0x00d0
        L_0x00c7:
            r12 = r6
            r19 = r7
            r22 = r8
            r2 = r16
            r1 = r18
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p046k.p047a.C0551o.m2842o(a.k.a.j, int, a.k.a.o$e, android.view.View, a.e.a):void");
    }

    /* renamed from: w */
    public static void m2850w(C0562q impl, Object exitTransition, Fragment exitingFragment, ArrayList<View> exitingViews) {
        if (exitingFragment != null && exitTransition != null && exitingFragment.f3462l && exitingFragment.f3476z && exitingFragment.f3442N) {
            exitingFragment.mo4635f1(true);
            impl.mo3051r(exitTransition, exitingFragment.mo4590K(), exitingViews);
            C0458p.m2224a(exitingFragment.f3435G, new C0552a(exitingViews));
        }
    }

    /* renamed from: a.k.a.o$a */
    public static class C0552a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2312b;

        public C0552a(ArrayList arrayList) {
            this.f2312b = arrayList;
        }

        public void run() {
            C0551o.m2826B(this.f2312b, 4);
        }
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r15 = r10.f2340a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2841n(p000a.p046k.p047a.C0529j r30, int r31, p000a.p046k.p047a.C0551o.C0556e r32, android.view.View r33, p000a.p018e.C0256a<java.lang.String, java.lang.String> r34) {
        /*
            r0 = r30
            r10 = r32
            r11 = r33
            r12 = r34
            r1 = 0
            a.k.a.e r2 = r0.f2223s
            boolean r2 = r2.mo2827g()
            if (r2 == 0) goto L_0x001e
            a.k.a.e r2 = r0.f2223s
            r13 = r31
            android.view.View r2 = r2.mo2826f(r13)
            r1 = r2
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r14 = r1
            goto L_0x0021
        L_0x001e:
            r13 = r31
            r14 = r1
        L_0x0021:
            if (r14 != 0) goto L_0x0024
            return
        L_0x0024:
            androidx.fragment.app.Fragment r15 = r10.f2340a
            androidx.fragment.app.Fragment r9 = r10.f2343d
            a.k.a.q r8 = m2837j(r9, r15)
            if (r8 != 0) goto L_0x002f
            return
        L_0x002f:
            boolean r7 = r10.f2341b
            boolean r6 = r10.f2344e
            java.lang.Object r5 = m2845r(r8, r15, r7)
            java.lang.Object r4 = m2846s(r8, r9, r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r1
            r1 = r8
            r24 = r2
            r2 = r14
            r25 = r3
            r3 = r33
            r16 = r4
            r4 = r34
            r26 = r5
            r5 = r32
            r27 = r6
            r6 = r25
            r28 = r7
            r7 = r24
            r0 = r8
            r8 = r26
            r13 = r9
            r9 = r16
            java.lang.Object r29 = m2839l(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r9 = r26
            if (r9 != 0) goto L_0x0074
            if (r29 != 0) goto L_0x0074
            r1 = r16
            if (r1 != 0) goto L_0x0076
            return
        L_0x0074:
            r1 = r16
        L_0x0076:
            r8 = r25
            java.util.ArrayList r25 = m2838k(r0, r1, r13, r8, r11)
            if (r25 == 0) goto L_0x0088
            boolean r2 = r25.isEmpty()
            if (r2 == 0) goto L_0x0085
            goto L_0x0088
        L_0x0085:
            r26 = r1
            goto L_0x008b
        L_0x0088:
            r4 = 0
            r26 = r4
        L_0x008b:
            r0.mo3042a(r9, r11)
            boolean r6 = r10.f2341b
            r1 = r0
            r2 = r9
            r3 = r26
            r4 = r29
            r5 = r15
            java.lang.Object r7 = m2849v(r1, r2, r3, r4, r5, r6)
            if (r7 == 0) goto L_0x00d5
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            r16 = r0
            r17 = r7
            r18 = r9
            r20 = r26
            r21 = r25
            r22 = r29
            r23 = r24
            r16.mo3052t(r17, r18, r19, r20, r21, r22, r23)
            r1 = r0
            r2 = r14
            r3 = r15
            r4 = r33
            r5 = r24
            r6 = r9
            r10 = r7
            r7 = r19
            r16 = r8
            r8 = r26
            r17 = r9
            r9 = r25
            m2853z(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r24
            r0.mo3074w(r14, r1, r12)
            r0.mo3044c(r14, r10)
            r0.mo3073s(r14, r1, r12)
            goto L_0x00dc
        L_0x00d5:
            r10 = r7
            r16 = r8
            r17 = r9
            r1 = r24
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p046k.p047a.C0551o.m2841n(a.k.a.j, int, a.k.a.o$e, android.view.View, a.e.a):void");
    }

    /* renamed from: a.k.a.o$b */
    public static class C0553b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Object f2313b;

        /* renamed from: c */
        public final /* synthetic */ C0562q f2314c;

        /* renamed from: d */
        public final /* synthetic */ View f2315d;

        /* renamed from: e */
        public final /* synthetic */ Fragment f2316e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f2317f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList f2318g;

        /* renamed from: h */
        public final /* synthetic */ ArrayList f2319h;

        /* renamed from: i */
        public final /* synthetic */ Object f2320i;

        public C0553b(Object obj, C0562q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2313b = obj;
            this.f2314c = qVar;
            this.f2315d = view;
            this.f2316e = fragment;
            this.f2317f = arrayList;
            this.f2318g = arrayList2;
            this.f2319h = arrayList3;
            this.f2320i = obj2;
        }

        public void run() {
            Object obj = this.f2313b;
            if (obj != null) {
                this.f2314c.mo3049p(obj, this.f2315d);
                this.f2318g.addAll(C0551o.m2838k(this.f2314c, this.f2313b, this.f2316e, this.f2317f, this.f2315d));
            }
            if (this.f2319h != null) {
                if (this.f2320i != null) {
                    ArrayList<View> tempExiting = new ArrayList<>();
                    tempExiting.add(this.f2315d);
                    this.f2314c.mo3050q(this.f2320i, this.f2319h, tempExiting);
                }
                this.f2319h.clear();
                this.f2319h.add(this.f2315d);
            }
        }
    }

    /* renamed from: z */
    public static void m2853z(C0562q impl, ViewGroup sceneRoot, Fragment inFragment, View nonExistentView, ArrayList<View> sharedElementsIn, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews) {
        ViewGroup viewGroup = sceneRoot;
        C0458p.m2224a(sceneRoot, new C0553b(enterTransition, impl, nonExistentView, inFragment, sharedElementsIn, enteringViews, exitingViews, exitTransition));
    }

    /* renamed from: j */
    public static C0562q m2837j(Fragment outFragment, Fragment inFragment) {
        ArrayList<Object> transitions = new ArrayList<>();
        if (outFragment != null) {
            Object exitTransition = outFragment.mo4669s();
            if (exitTransition != null) {
                transitions.add(exitTransition);
            }
            Object returnTransition = outFragment.mo4578E();
            if (returnTransition != null) {
                transitions.add(returnTransition);
            }
            Object sharedReturnTransition = outFragment.mo4582G();
            if (sharedReturnTransition != null) {
                transitions.add(sharedReturnTransition);
            }
        }
        if (inFragment != null) {
            Object enterTransition = inFragment.mo4665q();
            if (enterTransition != null) {
                transitions.add(enterTransition);
            }
            Object reenterTransition = inFragment.mo4572B();
            if (reenterTransition != null) {
                transitions.add(reenterTransition);
            }
            Object sharedEnterTransition = inFragment.mo4580F();
            if (sharedEnterTransition != null) {
                transitions.add(sharedEnterTransition);
            }
        }
        if (transitions.isEmpty()) {
            return null;
        }
        C0562q qVar = f2310b;
        if (qVar != null && m2834g(qVar, transitions)) {
            return qVar;
        }
        C0562q qVar2 = f2311c;
        if (qVar2 != null && m2834g(qVar2, transitions)) {
            return qVar2;
        }
        if (qVar == null && qVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: g */
    public static boolean m2834g(C0562q impl, List<Object> transitions) {
        int size = transitions.size();
        for (int i = 0; i < size; i++) {
            if (!impl.mo3045e(transitions.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: u */
    public static Object m2848u(C0562q impl, Fragment inFragment, Fragment outFragment, boolean isPop) {
        Object obj;
        if (inFragment == null || outFragment == null) {
            return null;
        }
        if (isPop) {
            obj = outFragment.mo4582G();
        } else {
            obj = inFragment.mo4580F();
        }
        return impl.mo3041A(impl.mo3046g(obj));
    }

    /* renamed from: r */
    public static Object m2845r(C0562q impl, Fragment inFragment, boolean isPop) {
        Object obj;
        if (inFragment == null) {
            return null;
        }
        if (isPop) {
            obj = inFragment.mo4572B();
        } else {
            obj = inFragment.mo4665q();
        }
        return impl.mo3046g(obj);
    }

    /* renamed from: s */
    public static Object m2846s(C0562q impl, Fragment outFragment, boolean isPop) {
        Object obj;
        if (outFragment == null) {
            return null;
        }
        if (isPop) {
            obj = outFragment.mo4578E();
        } else {
            obj = outFragment.mo4669s();
        }
        return impl.mo3046g(obj);
    }

    /* renamed from: m */
    public static Object m2840m(C0562q impl, ViewGroup sceneRoot, View nonExistentView, C0256a<String, String> nameOverrides, C0556e fragments, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, Object enterTransition, Object exitTransition) {
        Object sharedElementTransition;
        Object sharedElementTransition2;
        Object sharedElementTransition3;
        View epicenterView;
        Rect epicenter;
        ArrayMap<String, View> inSharedElements;
        C0562q qVar = impl;
        View view = nonExistentView;
        C0256a<String, String> aVar = nameOverrides;
        C0556e eVar = fragments;
        ArrayList<View> arrayList = sharedElementsOut;
        ArrayList<View> arrayList2 = sharedElementsIn;
        Object obj = enterTransition;
        Fragment inFragment = eVar.f2340a;
        Fragment outFragment = eVar.f2343d;
        if (inFragment != null) {
            inFragment.mo4620Z0().setVisibility(0);
        }
        if (inFragment == null) {
            ViewGroup viewGroup = sceneRoot;
            Fragment fragment = outFragment;
        } else if (outFragment == null) {
            ViewGroup viewGroup2 = sceneRoot;
            Fragment fragment2 = outFragment;
        } else {
            boolean inIsPop = eVar.f2341b;
            if (nameOverrides.isEmpty()) {
                sharedElementTransition = null;
            } else {
                sharedElementTransition = m2848u(qVar, inFragment, outFragment, inIsPop);
            }
            C0256a<String, View> i = m2836i(qVar, aVar, sharedElementTransition, eVar);
            ArrayMap<String, View> inSharedElements2 = m2835h(qVar, aVar, sharedElementTransition, eVar);
            if (nameOverrides.isEmpty()) {
                if (i != null) {
                    i.clear();
                }
                if (inSharedElements2 != null) {
                    inSharedElements2.clear();
                }
                sharedElementTransition2 = null;
            } else {
                m2828a(arrayList, i, nameOverrides.keySet());
                m2828a(arrayList2, inSharedElements2, nameOverrides.values());
                sharedElementTransition2 = sharedElementTransition;
            }
            if (obj == null && exitTransition == null && sharedElementTransition2 == null) {
                return null;
            }
            m2833f(inFragment, outFragment, inIsPop, i, true);
            if (sharedElementTransition2 != null) {
                arrayList2.add(view);
                qVar.mo3055y(sharedElementTransition2, view, arrayList);
                sharedElementTransition3 = sharedElementTransition2;
                inSharedElements = inSharedElements2;
                C0256a<String, View> aVar2 = i;
                m2825A(impl, sharedElementTransition2, exitTransition, i, eVar.f2344e, eVar.f2345f);
                Rect epicenter2 = new Rect();
                View epicenterView2 = m2847t(inSharedElements, eVar, obj, inIsPop);
                if (epicenterView2 != null) {
                    qVar.mo3053u(obj, epicenter2);
                }
                epicenter = epicenter2;
                epicenterView = epicenterView2;
            } else {
                sharedElementTransition3 = sharedElementTransition2;
                inSharedElements = inSharedElements2;
                C0256a<String, View> aVar3 = i;
                epicenter = null;
                epicenterView = null;
            }
            C0554c cVar = r0;
            boolean z = inIsPop;
            Fragment fragment3 = outFragment;
            C0554c cVar2 = new C0554c(inFragment, outFragment, inIsPop, inSharedElements, epicenterView, impl, epicenter);
            C0458p.m2224a(sceneRoot, cVar);
            return sharedElementTransition3;
        }
        return null;
    }

    /* renamed from: a.k.a.o$c */
    public static class C0554c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Fragment f2321b;

        /* renamed from: c */
        public final /* synthetic */ Fragment f2322c;

        /* renamed from: d */
        public final /* synthetic */ boolean f2323d;

        /* renamed from: e */
        public final /* synthetic */ C0256a f2324e;

        /* renamed from: f */
        public final /* synthetic */ View f2325f;

        /* renamed from: g */
        public final /* synthetic */ C0562q f2326g;

        /* renamed from: h */
        public final /* synthetic */ Rect f2327h;

        public C0554c(Fragment fragment, Fragment fragment2, boolean z, C0256a aVar, View view, C0562q qVar, Rect rect) {
            this.f2321b = fragment;
            this.f2322c = fragment2;
            this.f2323d = z;
            this.f2324e = aVar;
            this.f2325f = view;
            this.f2326g = qVar;
            this.f2327h = rect;
        }

        public void run() {
            C0551o.m2833f(this.f2321b, this.f2322c, this.f2323d, this.f2324e, false);
            View view = this.f2325f;
            if (view != null) {
                this.f2326g.mo3071k(view, this.f2327h);
            }
        }
    }

    /* renamed from: a */
    public static void m2828a(ArrayList<View> views, C0256a<String, View> sharedElements, Collection<String> nameOverridesSet) {
        for (int i = sharedElements.size() - 1; i >= 0; i--) {
            View view = sharedElements.mo1887m(i);
            if (nameOverridesSet.contains(C0460r.m2227B(view))) {
                views.add(view);
            }
        }
    }

    /* renamed from: l */
    public static Object m2839l(C0562q impl, ViewGroup sceneRoot, View nonExistentView, C0256a<String, String> nameOverrides, C0556e fragments, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, Object enterTransition, Object exitTransition) {
        Object sharedElementTransition;
        Object sharedElementTransition2;
        Rect inEpicenter;
        C0562q qVar = impl;
        C0556e eVar = fragments;
        ArrayList<View> arrayList = sharedElementsOut;
        Object obj = enterTransition;
        Fragment inFragment = eVar.f2340a;
        Fragment outFragment = eVar.f2343d;
        if (inFragment == null) {
            ViewGroup viewGroup = sceneRoot;
            Fragment fragment = outFragment;
            Fragment fragment2 = inFragment;
        } else if (outFragment == null) {
            ViewGroup viewGroup2 = sceneRoot;
            Fragment fragment3 = outFragment;
            Fragment fragment4 = inFragment;
        } else {
            boolean inIsPop = eVar.f2341b;
            if (nameOverrides.isEmpty()) {
                sharedElementTransition = null;
            } else {
                sharedElementTransition = m2848u(qVar, inFragment, outFragment, inIsPop);
            }
            C0256a<String, View> i = m2836i(qVar, nameOverrides, sharedElementTransition, eVar);
            if (nameOverrides.isEmpty()) {
                sharedElementTransition2 = null;
            } else {
                arrayList.addAll(i.values());
                sharedElementTransition2 = sharedElementTransition;
            }
            if (obj == null && exitTransition == null && sharedElementTransition2 == null) {
                return null;
            }
            m2833f(inFragment, outFragment, inIsPop, i, true);
            if (sharedElementTransition2 != null) {
                Rect inEpicenter2 = new Rect();
                qVar.mo3055y(sharedElementTransition2, nonExistentView, arrayList);
                C0256a<String, View> aVar = i;
                Rect inEpicenter3 = inEpicenter2;
                m2825A(impl, sharedElementTransition2, exitTransition, i, eVar.f2344e, eVar.f2345f);
                if (obj != null) {
                    qVar.mo3053u(obj, inEpicenter3);
                }
                inEpicenter = inEpicenter3;
            } else {
                C0256a<String, View> aVar2 = i;
                inEpicenter = null;
            }
            Object sharedElementTransition3 = sharedElementTransition2;
            C0555d dVar = r0;
            boolean z = inIsPop;
            Fragment fragment5 = outFragment;
            Fragment fragment6 = inFragment;
            C0555d dVar2 = new C0555d(impl, nameOverrides, sharedElementTransition2, fragments, sharedElementsIn, nonExistentView, inFragment, outFragment, inIsPop, sharedElementsOut, enterTransition, inEpicenter);
            C0458p.m2224a(sceneRoot, dVar);
            return sharedElementTransition3;
        }
        return null;
    }

    /* renamed from: a.k.a.o$d */
    public static class C0555d implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C0562q f2328b;

        /* renamed from: c */
        public final /* synthetic */ C0256a f2329c;

        /* renamed from: d */
        public final /* synthetic */ Object f2330d;

        /* renamed from: e */
        public final /* synthetic */ C0556e f2331e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f2332f;

        /* renamed from: g */
        public final /* synthetic */ View f2333g;

        /* renamed from: h */
        public final /* synthetic */ Fragment f2334h;

        /* renamed from: i */
        public final /* synthetic */ Fragment f2335i;

        /* renamed from: j */
        public final /* synthetic */ boolean f2336j;

        /* renamed from: k */
        public final /* synthetic */ ArrayList f2337k;

        /* renamed from: l */
        public final /* synthetic */ Object f2338l;

        /* renamed from: m */
        public final /* synthetic */ Rect f2339m;

        public C0555d(C0562q qVar, C0256a aVar, Object obj, C0556e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2328b = qVar;
            this.f2329c = aVar;
            this.f2330d = obj;
            this.f2331e = eVar;
            this.f2332f = arrayList;
            this.f2333g = view;
            this.f2334h = fragment;
            this.f2335i = fragment2;
            this.f2336j = z;
            this.f2337k = arrayList2;
            this.f2338l = obj2;
            this.f2339m = rect;
        }

        public void run() {
            ArrayMap<String, View> inSharedElements = C0551o.m2835h(this.f2328b, this.f2329c, this.f2330d, this.f2331e);
            if (inSharedElements != null) {
                this.f2332f.addAll(inSharedElements.values());
                this.f2332f.add(this.f2333g);
            }
            C0551o.m2833f(this.f2334h, this.f2335i, this.f2336j, inSharedElements, false);
            Object obj = this.f2330d;
            if (obj != null) {
                this.f2328b.mo3056z(obj, this.f2337k, this.f2332f);
                View inEpicenterView = C0551o.m2847t(inSharedElements, this.f2331e, this.f2338l, this.f2336j);
                if (inEpicenterView != null) {
                    this.f2328b.mo3071k(inEpicenterView, this.f2339m);
                }
            }
        }
    }

    /* renamed from: i */
    public static C0256a<String, View> m2836i(C0562q impl, C0256a<String, String> nameOverrides, Object sharedElementTransition, C0556e fragments) {
        ArrayList<String> names;
        C0336f sharedElementCallback;
        if (nameOverrides.isEmpty() || sharedElementTransition == null) {
            nameOverrides.clear();
            return null;
        }
        Fragment outFragment = fragments.f2343d;
        ArrayMap<String, View> outSharedElements = new C0256a<>();
        impl.mo3070j(outSharedElements, outFragment.mo4620Z0());
        C0516a outTransaction = fragments.f2345f;
        if (fragments.f2344e) {
            sharedElementCallback = outFragment.mo4667r();
            names = outTransaction.f2298o;
        } else {
            sharedElementCallback = outFragment.mo4671t();
            names = outTransaction.f2297n;
        }
        outSharedElements.mo1747o(names);
        if (sharedElementCallback != null) {
            sharedElementCallback.mo2229a(names, outSharedElements);
            for (int i = names.size() - 1; i >= 0; i--) {
                String name = names.get(i);
                View view = outSharedElements.get(name);
                if (view == null) {
                    nameOverrides.remove(name);
                } else if (!name.equals(C0460r.m2227B(view))) {
                    nameOverrides.put(C0460r.m2227B(view), nameOverrides.remove(name));
                }
            }
        } else {
            nameOverrides.mo1747o(outSharedElements.keySet());
        }
        return outSharedElements;
    }

    /* renamed from: h */
    public static C0256a<String, View> m2835h(C0562q impl, C0256a<String, String> nameOverrides, Object sharedElementTransition, C0556e fragments) {
        ArrayList<String> names;
        C0336f sharedElementCallback;
        String key;
        Fragment inFragment = fragments.f2340a;
        View fragmentView = inFragment.mo4590K();
        if (nameOverrides.isEmpty() || sharedElementTransition == null || fragmentView == null) {
            nameOverrides.clear();
            return null;
        }
        ArrayMap<String, View> inSharedElements = new C0256a<>();
        impl.mo3070j(inSharedElements, fragmentView);
        C0516a inTransaction = fragments.f2342c;
        if (fragments.f2341b) {
            sharedElementCallback = inFragment.mo4671t();
            names = inTransaction.f2297n;
        } else {
            sharedElementCallback = inFragment.mo4667r();
            names = inTransaction.f2298o;
        }
        if (names != null) {
            inSharedElements.mo1747o(names);
            inSharedElements.mo1747o(nameOverrides.values());
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.mo2229a(names, inSharedElements);
            for (int i = names.size() - 1; i >= 0; i--) {
                String name = names.get(i);
                View view = inSharedElements.get(name);
                if (view == null) {
                    String key2 = m2844q(nameOverrides, name);
                    if (key2 != null) {
                        nameOverrides.remove(key2);
                    }
                } else if (!name.equals(C0460r.m2227B(view)) && (key = m2844q(nameOverrides, name)) != null) {
                    nameOverrides.put(key, C0460r.m2227B(view));
                }
            }
        } else {
            m2852y(nameOverrides, inSharedElements);
        }
        return inSharedElements;
    }

    /* renamed from: q */
    public static String m2844q(C0256a<String, String> map, String value) {
        int numElements = map.size();
        for (int i = 0; i < numElements; i++) {
            if (value.equals(map.mo1887m(i))) {
                return map.mo1882i(i);
            }
        }
        return null;
    }

    /* renamed from: t */
    public static View m2847t(C0256a<String, View> inSharedElements, C0556e fragments, Object enterTransition, boolean inIsPop) {
        ArrayList<String> arrayList;
        String targetName;
        C0516a inTransaction = fragments.f2342c;
        if (enterTransition == null || inSharedElements == null || (arrayList = inTransaction.f2297n) == null || arrayList.isEmpty()) {
            return null;
        }
        if (inIsPop) {
            targetName = inTransaction.f2297n.get(0);
        } else {
            targetName = inTransaction.f2298o.get(0);
        }
        return inSharedElements.get(targetName);
    }

    /* renamed from: A */
    public static void m2825A(C0562q impl, Object sharedElementTransition, Object exitTransition, C0256a<String, View> outSharedElements, boolean outIsPop, C0516a outTransaction) {
        String sourceName;
        ArrayList<String> arrayList = outTransaction.f2297n;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (outIsPop) {
                sourceName = outTransaction.f2298o.get(0);
            } else {
                sourceName = outTransaction.f2297n.get(0);
            }
            View outEpicenterView = outSharedElements.get(sourceName);
            impl.mo3054v(sharedElementTransition, outEpicenterView);
            if (exitTransition != null) {
                impl.mo3054v(exitTransition, outEpicenterView);
            }
        }
    }

    /* renamed from: y */
    public static void m2852y(C0256a<String, String> nameOverrides, C0256a<String, View> namedViews) {
        for (int i = nameOverrides.size() - 1; i >= 0; i--) {
            if (!namedViews.containsKey(nameOverrides.mo1887m(i))) {
                nameOverrides.mo1885k(i);
            }
        }
    }

    /* renamed from: f */
    public static void m2833f(Fragment inFragment, Fragment outFragment, boolean isPop, C0256a<String, View> sharedElements, boolean isStart) {
        C0336f sharedElementCallback;
        if (isPop) {
            sharedElementCallback = outFragment.mo4667r();
        } else {
            sharedElementCallback = inFragment.mo4667r();
        }
        if (sharedElementCallback != null) {
            ArrayList<View> views = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>();
            int count = sharedElements == null ? 0 : sharedElements.size();
            for (int i = 0; i < count; i++) {
                names.add(sharedElements.mo1882i(i));
                views.add(sharedElements.mo1887m(i));
            }
            if (isStart) {
                sharedElementCallback.mo2231c(names, views, (List<View>) null);
            } else {
                sharedElementCallback.mo2230b(names, views, (List<View>) null);
            }
        }
    }

    /* renamed from: k */
    public static ArrayList<View> m2838k(C0562q impl, Object transition, Fragment fragment, ArrayList<View> sharedElements, View nonExistentView) {
        ArrayList<View> viewList = null;
        if (transition != null) {
            viewList = new ArrayList<>();
            View root = fragment.mo4590K();
            if (root != null) {
                impl.mo3069f(viewList, root);
            }
            if (sharedElements != null) {
                viewList.removeAll(sharedElements);
            }
            if (!viewList.isEmpty()) {
                viewList.add(nonExistentView);
                impl.mo3043b(transition, viewList);
            }
        }
        return viewList;
    }

    /* renamed from: B */
    public static void m2826B(ArrayList<View> views, int visibility) {
        if (views != null) {
            for (int i = views.size() - 1; i >= 0; i--) {
                views.get(i).setVisibility(visibility);
            }
        }
    }

    /* renamed from: v */
    public static Object m2849v(C0562q impl, Object enterTransition, Object exitTransition, Object sharedElementTransition, Fragment inFragment, boolean isPop) {
        boolean z;
        boolean overlap = true;
        if (!(enterTransition == null || exitTransition == null || inFragment == null)) {
            if (isPop) {
                z = inFragment.mo4649k();
            } else {
                z = inFragment.mo4646j();
            }
            overlap = z;
        }
        if (overlap) {
            return impl.mo3048n(exitTransition, enterTransition, sharedElementTransition);
        }
        return impl.mo3047m(exitTransition, enterTransition, sharedElementTransition);
    }

    /* renamed from: c */
    public static void m2830c(C0516a transaction, SparseArray<C0556e> transitioningFragments, boolean isReordered) {
        int numOps = transaction.f2284a.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            m2829b(transaction, transaction.f2284a.get(opNum), transitioningFragments, false, isReordered);
        }
    }

    /* renamed from: e */
    public static void m2832e(C0516a transaction, SparseArray<C0556e> transitioningFragments, boolean isReordered) {
        if (transaction.f2160r.f2223s.mo2827g()) {
            for (int opNum = transaction.f2284a.size() - 1; opNum >= 0; opNum--) {
                m2829b(transaction, transaction.f2284a.get(opNum), transitioningFragments, true, isReordered);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x012d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0114  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2829b(p000a.p046k.p047a.C0516a r22, p000a.p046k.p047a.C0549n.C0550a r23, android.util.SparseArray<p000a.p046k.p047a.C0551o.C0556e> r24, boolean r25, boolean r26) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            androidx.fragment.app.Fragment r10 = r1.f2302b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.f3474x
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f2309a
            int r5 = r1.f2301a
            r4 = r4[r5]
            goto L_0x001d
        L_0x001b:
            int r4 = r1.f2301a
        L_0x001d:
            r12 = r4
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            if (r12 == r9) goto L_0x00a6
            r13 = 3
            if (r12 == r13) goto L_0x0079
            r13 = 4
            if (r12 == r13) goto L_0x0057
            r13 = 5
            if (r12 == r13) goto L_0x003c
            r13 = 6
            if (r12 == r13) goto L_0x0079
            r13 = 7
            if (r12 == r13) goto L_0x00a6
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            goto L_0x00bb
        L_0x003c:
            if (r26 == 0) goto L_0x004d
            boolean r13 = r10.f3442N
            if (r13 == 0) goto L_0x004b
            boolean r13 = r10.f3476z
            if (r13 != 0) goto L_0x004b
            boolean r13 = r10.f3462l
            if (r13 == 0) goto L_0x004b
            r8 = 1
        L_0x004b:
            r4 = r8
            goto L_0x004f
        L_0x004d:
            boolean r4 = r10.f3476z
        L_0x004f:
            r7 = 1
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            goto L_0x00bb
        L_0x0057:
            if (r26 == 0) goto L_0x0068
            boolean r13 = r10.f3442N
            if (r13 == 0) goto L_0x0066
            boolean r13 = r10.f3462l
            if (r13 == 0) goto L_0x0066
            boolean r13 = r10.f3476z
            if (r13 == 0) goto L_0x0066
            r8 = 1
        L_0x0066:
            r6 = r8
            goto L_0x0072
        L_0x0068:
            boolean r13 = r10.f3462l
            if (r13 == 0) goto L_0x0071
            boolean r13 = r10.f3476z
            if (r13 != 0) goto L_0x0071
            r8 = 1
        L_0x0071:
            r6 = r8
        L_0x0072:
            r5 = 1
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            goto L_0x00bb
        L_0x0079:
            if (r26 == 0) goto L_0x0095
            boolean r13 = r10.f3462l
            if (r13 != 0) goto L_0x0092
            android.view.View r13 = r10.f3436H
            if (r13 == 0) goto L_0x0092
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L_0x0092
            float r13 = r10.f3443O
            r14 = 0
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 < 0) goto L_0x0092
            r8 = 1
            goto L_0x0093
        L_0x0092:
        L_0x0093:
            r6 = r8
            goto L_0x009f
        L_0x0095:
            boolean r13 = r10.f3462l
            if (r13 == 0) goto L_0x009e
            boolean r13 = r10.f3476z
            if (r13 != 0) goto L_0x009e
            r8 = 1
        L_0x009e:
            r6 = r8
        L_0x009f:
            r5 = 1
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            goto L_0x00bb
        L_0x00a6:
            if (r26 == 0) goto L_0x00ab
            boolean r4 = r10.f3441M
            goto L_0x00b5
        L_0x00ab:
            boolean r13 = r10.f3462l
            if (r13 != 0) goto L_0x00b4
            boolean r13 = r10.f3476z
            if (r13 != 0) goto L_0x00b4
            r8 = 1
        L_0x00b4:
            r4 = r8
        L_0x00b5:
            r7 = 1
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
        L_0x00bb:
            java.lang.Object r4 = r2.get(r11)
            a.k.a.o$e r4 = (p000a.p046k.p047a.C0551o.C0556e) r4
            if (r13 == 0) goto L_0x00d0
            a.k.a.o$e r4 = m2843p(r4, r2, r11)
            r4.f2340a = r10
            r4.f2341b = r3
            r4.f2342c = r0
            r8 = r4
            goto L_0x00d1
        L_0x00d0:
            r8 = r4
        L_0x00d1:
            r7 = 0
            if (r26 != 0) goto L_0x010f
            if (r16 == 0) goto L_0x010f
            if (r8 == 0) goto L_0x00de
            androidx.fragment.app.Fragment r4 = r8.f2343d
            if (r4 != r10) goto L_0x00de
            r8.f2343d = r7
        L_0x00de:
            a.k.a.j r6 = r0.f2160r
            int r4 = r10.f3452b
            if (r4 >= r9) goto L_0x0109
            int r4 = r6.f2221q
            if (r4 < r9) goto L_0x0109
            boolean r4 = r0.f2299p
            if (r4 != 0) goto L_0x0109
            r6.mo2895E0(r10)
            r9 = 1
            r17 = 0
            r18 = 0
            r19 = 0
            r4 = r6
            r5 = r10
            r20 = r6
            r6 = r9
            r9 = r7
            r7 = r17
            r21 = r8
            r8 = r18
            r1 = r9
            r9 = r19
            r4.mo2909M0(r5, r6, r7, r8, r9)
            goto L_0x0112
        L_0x0109:
            r20 = r6
            r1 = r7
            r21 = r8
            goto L_0x0112
        L_0x010f:
            r1 = r7
            r21 = r8
        L_0x0112:
            if (r15 == 0) goto L_0x0128
            r4 = r21
            if (r4 == 0) goto L_0x011c
            androidx.fragment.app.Fragment r5 = r4.f2343d
            if (r5 != 0) goto L_0x012a
        L_0x011c:
            a.k.a.o$e r8 = m2843p(r4, r2, r11)
            r8.f2343d = r10
            r8.f2344e = r3
            r8.f2345f = r0
            goto L_0x012b
        L_0x0128:
            r4 = r21
        L_0x012a:
            r8 = r4
        L_0x012b:
            if (r26 != 0) goto L_0x0137
            if (r14 == 0) goto L_0x0137
            if (r8 == 0) goto L_0x0137
            androidx.fragment.app.Fragment r4 = r8.f2340a
            if (r4 != r10) goto L_0x0137
            r8.f2340a = r1
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p046k.p047a.C0551o.m2829b(a.k.a.a, a.k.a.n$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: p */
    public static C0556e m2843p(C0556e containerTransition, SparseArray<C0556e> transitioningFragments, int containerId) {
        if (containerTransition != null) {
            return containerTransition;
        }
        C0556e containerTransition2 = new C0556e();
        transitioningFragments.put(containerId, containerTransition2);
        return containerTransition2;
    }
}
