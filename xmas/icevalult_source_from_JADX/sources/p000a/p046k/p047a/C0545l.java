package p000a.p046k.p047a;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000a.p051m.C0594p;
import p000a.p051m.C0595q;
import p000a.p051m.C0598r;

/* renamed from: a.k.a.l */
public class C0545l extends C0594p {

    /* renamed from: h */
    public static final C0595q.C0596a f2263h = new C0546a();

    /* renamed from: b */
    public final HashSet<Fragment> f2264b = new HashSet<>();

    /* renamed from: c */
    public final HashMap<String, C0545l> f2265c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, C0598r> f2266d = new HashMap<>();

    /* renamed from: e */
    public final boolean f2267e;

    /* renamed from: f */
    public boolean f2268f = false;

    /* renamed from: g */
    public boolean f2269g = false;

    /* renamed from: a.k.a.l$a */
    public static class C0546a implements C0595q.C0596a {
        /* renamed from: a */
        public <T extends C0594p> T mo3027a(Class<T> cls) {
            return new C0545l(true);
        }
    }

    /* renamed from: g */
    public static C0545l m2810g(C0598r viewModelStore) {
        return (C0545l) new C0595q(viewModelStore, f2263h).mo3133a(C0545l.class);
    }

    public C0545l(boolean stateAutomaticallySaved) {
        this.f2267e = stateAutomaticallySaved;
    }

    /* renamed from: c */
    public void mo3015c() {
        if (C0529j.f2197I) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2268f = true;
    }

    /* renamed from: j */
    public boolean mo3023j() {
        return this.f2268f;
    }

    /* renamed from: d */
    public boolean mo3016d(Fragment fragment) {
        return this.f2264b.add(fragment);
    }

    /* renamed from: h */
    public Collection<Fragment> mo3020h() {
        return this.f2264b;
    }

    /* renamed from: l */
    public boolean mo3025l(Fragment fragment) {
        if (!this.f2264b.contains(fragment)) {
            return true;
        }
        if (this.f2267e) {
            return this.f2268f;
        }
        return !this.f2269g;
    }

    /* renamed from: k */
    public boolean mo3024k(Fragment fragment) {
        return this.f2264b.remove(fragment);
    }

    /* renamed from: f */
    public C0545l mo3019f(Fragment f) {
        C0545l childNonConfig = this.f2265c.get(f.f3456f);
        if (childNonConfig != null) {
            return childNonConfig;
        }
        C0545l childNonConfig2 = new C0545l(this.f2267e);
        this.f2265c.put(f.f3456f, childNonConfig2);
        return childNonConfig2;
    }

    /* renamed from: i */
    public C0598r mo3022i(Fragment f) {
        C0598r viewModelStore = this.f2266d.get(f.f3456f);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        C0598r viewModelStore2 = new C0598r();
        this.f2266d.put(f.f3456f, viewModelStore2);
        return viewModelStore2;
    }

    /* renamed from: e */
    public void mo3017e(Fragment f) {
        if (C0529j.f2197I) {
            Log.d("FragmentManager", "Clearing non-config state for " + f);
        }
        C0545l childNonConfig = this.f2265c.get(f.f3456f);
        if (childNonConfig != null) {
            childNonConfig.mo3015c();
            this.f2265c.remove(f.f3456f);
        }
        C0598r viewModelStore = this.f2266d.get(f.f3456f);
        if (viewModelStore != null) {
            viewModelStore.mo3136a();
            this.f2266d.remove(f.f3456f);
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        C0545l that = (C0545l) o;
        if (!this.f2264b.equals(that.f2264b) || !this.f2265c.equals(that.f2265c) || !this.f2266d.equals(that.f2266d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f2264b.hashCode() * 31) + this.f2265c.hashCode()) * 31) + this.f2266d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> fragmentIterator = this.f2264b.iterator();
        while (fragmentIterator.hasNext()) {
            sb.append(fragmentIterator.next());
            if (fragmentIterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> childNonConfigIterator = this.f2265c.keySet().iterator();
        while (childNonConfigIterator.hasNext()) {
            sb.append(childNonConfigIterator.next());
            if (childNonConfigIterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> viewModelStoreIterator = this.f2266d.keySet().iterator();
        while (viewModelStoreIterator.hasNext()) {
            sb.append(viewModelStoreIterator.next());
            if (viewModelStoreIterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
