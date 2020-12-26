package p000a.p052n.p053a;

import android.os.Bundle;
import android.util.Log;
import androidx.loader.app.LoaderManagerImpl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p018e.C0270h;
import p000a.p025h.p037l.C0412a;
import p000a.p051m.C0582g;
import p000a.p051m.C0589l;
import p000a.p051m.C0590m;
import p000a.p051m.C0594p;
import p000a.p051m.C0595q;
import p000a.p051m.C0598r;
import p000a.p052n.p054b.C0606a;

/* renamed from: a.n.a.b */
public class C0601b extends C0600a {

    /* renamed from: c */
    public static boolean f2403c = false;

    /* renamed from: a */
    public final C0582g f2404a;

    /* renamed from: b */
    public final C0604c f2405b;

    /* renamed from: a.n.a.b$b */
    public static class C0603b<D> implements C0590m<D> {
    }

    /* renamed from: a.n.a.b$a */
    public static class C0602a<D> extends C0589l<D> {

        /* renamed from: j */
        public final int f2406j;

        /* renamed from: k */
        public final Bundle f2407k;

        /* renamed from: l */
        public final C0606a<D> f2408l;

        /* renamed from: m */
        public C0582g f2409m;

        /* renamed from: n */
        public C0603b<D> f2410n;

        /* renamed from: o */
        public C0606a<D> f2411o;

        /* renamed from: e */
        public void mo3142e() {
            if (C0601b.f2403c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f2408l.mo3154d();
            throw null;
        }

        /* renamed from: f */
        public void mo3143f() {
            if (C0601b.f2403c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f2408l.mo3155e();
            throw null;
        }

        /* renamed from: k */
        public void mo3147k() {
            C0582g lifecycleOwner = this.f2409m;
            LoaderManagerImpl.LoaderObserver<D> observer = this.f2410n;
            if (lifecycleOwner != null && observer != null) {
                super.mo3144g(observer);
                mo4690d(lifecycleOwner, observer);
            }
        }

        /* renamed from: g */
        public void mo3144g(C0590m<? super D> observer) {
            super.mo3144g(observer);
            this.f2409m = null;
        }

        /* renamed from: i */
        public C0606a<D> mo3145i(boolean reset) {
            if (C0601b.f2403c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f2408l.mo3151a();
            throw null;
        }

        /* renamed from: h */
        public void mo3116h(D value) {
            super.mo3116h(value);
            C0606a<D> aVar = this.f2411o;
            if (aVar != null) {
                aVar.mo3153c();
                throw null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2406j);
            sb.append(" : ");
            C0412a.m2047a(this.f2408l, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* renamed from: j */
        public void mo3146j(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            writer.print(prefix);
            writer.print("mId=");
            writer.print(this.f2406j);
            writer.print(" mArgs=");
            writer.println(this.f2407k);
            writer.print(prefix);
            writer.print("mLoader=");
            writer.println(this.f2408l);
            C0606a<D> aVar = this.f2408l;
            aVar.mo3152b(prefix + "  ", fd, writer, args);
            throw null;
        }
    }

    /* renamed from: a.n.a.b$c */
    public static class C0604c extends C0594p {

        /* renamed from: c */
        public static final C0595q.C0596a f2412c = new C0605a();

        /* renamed from: b */
        public C0270h<C0602a> f2413b = new C0270h<>();

        /* renamed from: a.n.a.b$c$a */
        public static class C0605a implements C0595q.C0596a {
            /* renamed from: a */
            public <T extends C0594p> T mo3027a(Class<T> cls) {
                return new C0604c();
            }
        }

        /* renamed from: e */
        public static C0604c m2984e(C0598r viewModelStore) {
            return (C0604c) new C0595q(viewModelStore, f2412c).mo3133a(C0604c.class);
        }

        /* renamed from: f */
        public void mo3150f() {
            int size = this.f2413b.mo1907k();
            for (int index = 0; index < size; index++) {
                this.f2413b.mo1908l(index).mo3147k();
            }
        }

        /* renamed from: c */
        public void mo3015c() {
            super.mo3015c();
            if (0 >= this.f2413b.mo1907k()) {
                this.f2413b.mo1897b();
            } else {
                this.f2413b.mo1908l(0).mo3145i(true);
                throw null;
            }
        }

        /* renamed from: d */
        public void mo3149d(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            if (this.f2413b.mo1907k() > 0) {
                writer.print(prefix);
                writer.println("Loaders:");
                String str = prefix + "    ";
                if (0 < this.f2413b.mo1907k()) {
                    C0602a info = this.f2413b.mo1908l(0);
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(this.f2413b.mo1904h(0));
                    writer.print(": ");
                    writer.println(info.toString());
                    info.mo3146j(str, fd, writer, args);
                    throw null;
                }
            }
        }
    }

    public C0601b(C0582g lifecycleOwner, C0598r viewModelStore) {
        this.f2404a = lifecycleOwner;
        this.f2405b = C0604c.m2984e(viewModelStore);
    }

    /* renamed from: c */
    public void mo3140c() {
        this.f2405b.mo3150f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0412a.m2047a(this.f2404a, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public void mo3139a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        this.f2405b.mo3149d(prefix, fd, writer, args);
    }
}
