package p000a.p046k.p047a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: a.k.a.i */
public abstract class C0526i {

    /* renamed from: c */
    public static final C0524g f2195c = new C0524g();

    /* renamed from: b */
    public C0524g f2196b = null;

    /* renamed from: a.k.a.i$a */
    public static abstract class C0527a {
        /* renamed from: a */
        public abstract void mo2871a(C0526i iVar, Fragment fragment, Bundle bundle);

        /* renamed from: b */
        public abstract void mo2872b(C0526i iVar, Fragment fragment, Context context);

        /* renamed from: c */
        public abstract void mo2873c(C0526i iVar, Fragment fragment, Bundle bundle);

        /* renamed from: d */
        public abstract void mo2874d(C0526i iVar, Fragment fragment);

        /* renamed from: e */
        public abstract void mo2875e(C0526i iVar, Fragment fragment);

        /* renamed from: f */
        public abstract void mo2876f(C0526i iVar, Fragment fragment);

        /* renamed from: g */
        public abstract void mo2877g(C0526i iVar, Fragment fragment, Context context);

        /* renamed from: h */
        public abstract void mo2878h(C0526i iVar, Fragment fragment, Bundle bundle);

        /* renamed from: i */
        public abstract void mo2879i(C0526i iVar, Fragment fragment);

        /* renamed from: j */
        public abstract void mo2880j(C0526i iVar, Fragment fragment, Bundle bundle);

        /* renamed from: k */
        public abstract void mo2881k(C0526i iVar, Fragment fragment);

        /* renamed from: l */
        public abstract void mo2882l(C0526i iVar, Fragment fragment);

        /* renamed from: m */
        public abstract void mo2883m(C0526i iVar, Fragment fragment, View view, Bundle bundle);

        /* renamed from: n */
        public abstract void mo2884n(C0526i iVar, Fragment fragment);
    }

    /* renamed from: a.k.a.i$b */
    public interface C0528b {
        /* renamed from: a */
        void mo2885a();
    }

    /* renamed from: a */
    public abstract void mo2866a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract List<Fragment> mo2868c();

    /* renamed from: d */
    public abstract boolean mo2869d();

    /* renamed from: e */
    public void mo2870e(C0524g fragmentFactory) {
        this.f2196b = fragmentFactory;
    }

    /* renamed from: b */
    public C0524g mo2867b() {
        if (this.f2196b == null) {
            this.f2196b = f2195c;
        }
        return this.f2196b;
    }
}
