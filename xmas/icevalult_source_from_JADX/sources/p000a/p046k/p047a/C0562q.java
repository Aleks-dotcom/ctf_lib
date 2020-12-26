package p000a.p046k.p047a;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000a.p025h.p038m.C0458p;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.C0470t;

@SuppressLint({"UnknownNullness"})
/* renamed from: a.k.a.q */
public abstract class C0562q {
    /* renamed from: A */
    public abstract Object mo3041A(Object obj);

    /* renamed from: a */
    public abstract void mo3042a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo3043b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo3044c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo3045e(Object obj);

    /* renamed from: g */
    public abstract Object mo3046g(Object obj);

    /* renamed from: m */
    public abstract Object mo3047m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo3048n(Object obj, Object obj2, Object obj3);

    /* renamed from: p */
    public abstract void mo3049p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo3050q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo3051r(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: t */
    public abstract void mo3052t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo3053u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo3054v(Object obj, View view);

    /* renamed from: y */
    public abstract void mo3055y(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: z */
    public abstract void mo3056z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: k */
    public void mo3071k(View view, Rect epicenter) {
        int[] loc = new int[2];
        view.getLocationOnScreen(loc);
        epicenter.set(loc[0], loc[1], loc[0] + view.getWidth(), loc[1] + view.getHeight());
    }

    /* renamed from: o */
    public ArrayList<String> mo3072o(ArrayList<View> sharedElementsIn) {
        ArrayList<String> names = new ArrayList<>();
        int numSharedElements = sharedElementsIn.size();
        for (int i = 0; i < numSharedElements; i++) {
            View view = sharedElementsIn.get(i);
            names.add(C0460r.m2227B(view));
            C0460r.m2285q0(view, (String) null);
        }
        return names;
    }

    /* renamed from: x */
    public void mo3075x(View sceneRoot, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, ArrayList<String> inNames, Map<String, String> nameOverrides) {
        int numSharedElements = sharedElementsIn.size();
        ArrayList<String> outNames = new ArrayList<>();
        for (int i = 0; i < numSharedElements; i++) {
            View view = sharedElementsOut.get(i);
            String name = C0460r.m2227B(view);
            outNames.add(name);
            if (name != null) {
                C0460r.m2285q0(view, (String) null);
                String inName = nameOverrides.get(name);
                int j = 0;
                while (true) {
                    if (j >= numSharedElements) {
                        break;
                    } else if (inName.equals(inNames.get(j))) {
                        C0460r.m2285q0(sharedElementsIn.get(j), name);
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }
        C0458p.m2224a(sceneRoot, new C0563a(this, numSharedElements, sharedElementsIn, inNames, sharedElementsOut, outNames));
    }

    /* renamed from: a.k.a.q$a */
    public class C0563a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f2357b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f2358c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f2359d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f2360e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f2361f;

        public C0563a(C0562q this$0, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2357b = i;
            this.f2358c = arrayList;
            this.f2359d = arrayList2;
            this.f2360e = arrayList3;
            this.f2361f = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f2357b; i++) {
                C0460r.m2285q0((View) this.f2358c.get(i), (String) this.f2359d.get(i));
                C0460r.m2285q0((View) this.f2360e.get(i), (String) this.f2361f.get(i));
            }
        }
    }

    /* renamed from: f */
    public void mo3069f(ArrayList<View> transitioningViews, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0470t.m2338a(viewGroup)) {
                transitioningViews.add(viewGroup);
                return;
            }
            int count = viewGroup.getChildCount();
            for (int i = 0; i < count; i++) {
                mo3069f(transitioningViews, viewGroup.getChildAt(i));
            }
            return;
        }
        transitioningViews.add(view);
    }

    /* renamed from: j */
    public void mo3070j(Map<String, View> namedViews, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = C0460r.m2227B(view);
            if (transitionName != null) {
                namedViews.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int count = viewGroup.getChildCount();
                for (int i = 0; i < count; i++) {
                    mo3070j(namedViews, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a.k.a.q$b */
    public class C0564b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2362b;

        /* renamed from: c */
        public final /* synthetic */ Map f2363c;

        public C0564b(C0562q this$0, ArrayList arrayList, Map map) {
            this.f2362b = arrayList;
            this.f2363c = map;
        }

        public void run() {
            int numSharedElements = this.f2362b.size();
            for (int i = 0; i < numSharedElements; i++) {
                View view = (View) this.f2362b.get(i);
                String name = C0460r.m2227B(view);
                if (name != null) {
                    C0460r.m2285q0(view, C0562q.m2873i(this.f2363c, name));
                }
            }
        }
    }

    /* renamed from: w */
    public void mo3074w(View sceneRoot, ArrayList<View> sharedElementsIn, Map<String, String> nameOverrides) {
        C0458p.m2224a(sceneRoot, new C0564b(this, sharedElementsIn, nameOverrides));
    }

    /* renamed from: a.k.a.q$c */
    public class C0565c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2364b;

        /* renamed from: c */
        public final /* synthetic */ Map f2365c;

        public C0565c(C0562q this$0, ArrayList arrayList, Map map) {
            this.f2364b = arrayList;
            this.f2365c = map;
        }

        public void run() {
            int numSharedElements = this.f2364b.size();
            for (int i = 0; i < numSharedElements; i++) {
                View view = (View) this.f2364b.get(i);
                C0460r.m2285q0(view, (String) this.f2365c.get(C0460r.m2227B(view)));
            }
        }
    }

    /* renamed from: s */
    public void mo3073s(ViewGroup sceneRoot, ArrayList<View> sharedElementsIn, Map<String, String> nameOverrides) {
        C0458p.m2224a(sceneRoot, new C0565c(this, sharedElementsIn, nameOverrides));
    }

    /* renamed from: d */
    public static void m2871d(List<View> views, View startView) {
        int startIndex = views.size();
        if (!m2872h(views, startView, startIndex)) {
            views.add(startView);
            for (int index = startIndex; index < views.size(); index++) {
                View view = views.get(index);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int childIndex = 0; childIndex < childCount; childIndex++) {
                        View child = viewGroup.getChildAt(childIndex);
                        if (!m2872h(views, child, startIndex)) {
                            views.add(child);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public static boolean m2872h(List<View> views, View view, int maxIndex) {
        for (int i = 0; i < maxIndex; i++) {
            if (views.get(i) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m2874l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: i */
    public static String m2873i(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
