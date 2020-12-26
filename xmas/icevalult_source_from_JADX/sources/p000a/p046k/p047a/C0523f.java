package p000a.p046k.p047a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import p000a.p025h.p037l.C0419h;
import p000a.p051m.C0599s;

/* renamed from: a.k.a.f */
public class C0523f {

    /* renamed from: a */
    public final C0525h<?> f2188a;

    /* renamed from: b */
    public static C0523f m2624b(C0525h<?> callbacks) {
        C0419h.m2061d(callbacks, "callbacks == null");
        return new C0523f(callbacks);
    }

    public C0523f(C0525h<?> callbacks) {
        this.f2188a = callbacks;
    }

    /* renamed from: u */
    public C0526i mo2857u() {
        return this.f2188a.f2194f;
    }

    /* renamed from: t */
    public Fragment mo2856t(String who) {
        return this.f2188a.f2194f.mo2962l0(who);
    }

    /* renamed from: a */
    public void mo2838a(Fragment parent) {
        C0525h<?> hVar = this.f2188a;
        hVar.f2194f.mo2958k(hVar, hVar, parent);
    }

    /* renamed from: w */
    public View mo2859w(View parent, String name, Context context, AttributeSet attrs) {
        return this.f2188a.f2194f.onCreateView(parent, name, context, attrs);
    }

    /* renamed from: v */
    public void mo2858v() {
        this.f2188a.f2194f.mo2911N0();
    }

    /* renamed from: y */
    public Parcelable mo2861y() {
        return this.f2188a.f2194f.mo2934Z0();
    }

    /* renamed from: x */
    public void mo2860x(Parcelable state) {
        C0525h<?> hVar = this.f2188a;
        if (hVar instanceof C0599s) {
            hVar.f2194f.mo2931X0(state);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: f */
    public void mo2842f() {
        this.f2188a.f2194f.mo2986w();
    }

    /* renamed from: c */
    public void mo2839c() {
        this.f2188a.f2194f.mo2979t();
    }

    /* renamed from: q */
    public void mo2853q() {
        this.f2188a.f2194f.mo2932Y();
    }

    /* renamed from: p */
    public void mo2852p() {
        this.f2188a.f2194f.mo2930X();
    }

    /* renamed from: m */
    public void mo2849m() {
        this.f2188a.f2194f.mo2922T();
    }

    /* renamed from: r */
    public void mo2854r() {
        this.f2188a.f2194f.mo2935a0();
    }

    /* renamed from: h */
    public void mo2844h() {
        this.f2188a.f2194f.mo2990y();
    }

    /* renamed from: j */
    public void mo2846j(boolean isInMultiWindowMode) {
        this.f2188a.f2194f.mo2888B(isInMultiWindowMode);
    }

    /* renamed from: n */
    public void mo2850n(boolean isInPictureInPictureMode) {
        this.f2188a.f2194f.mo2924U(isInPictureInPictureMode);
    }

    /* renamed from: d */
    public void mo2840d(Configuration newConfig) {
        this.f2188a.f2194f.mo2982u(newConfig);
    }

    /* renamed from: i */
    public void mo2845i() {
        this.f2188a.f2194f.mo2886A();
    }

    /* renamed from: g */
    public boolean mo2843g(Menu menu, MenuInflater inflater) {
        return this.f2188a.f2194f.mo2988x(menu, inflater);
    }

    /* renamed from: o */
    public boolean mo2851o(Menu menu) {
        return this.f2188a.f2194f.mo2926V(menu);
    }

    /* renamed from: k */
    public boolean mo2847k(MenuItem item) {
        return this.f2188a.f2194f.mo2916Q(item);
    }

    /* renamed from: e */
    public boolean mo2841e(MenuItem item) {
        return this.f2188a.f2194f.mo2984v(item);
    }

    /* renamed from: l */
    public void mo2848l(Menu menu) {
        this.f2188a.f2194f.mo2918R(menu);
    }

    /* renamed from: s */
    public boolean mo2855s() {
        return this.f2188a.f2194f.mo2946f0();
    }
}
