package p000a.p046k.p047a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p025h.p037l.C0419h;

/* renamed from: a.k.a.h */
public abstract class C0525h<E> extends C0522e {

    /* renamed from: b */
    public final Activity f2190b;

    /* renamed from: c */
    public final Context f2191c;

    /* renamed from: d */
    public final Handler f2192d;

    /* renamed from: e */
    public final int f2193e;

    /* renamed from: f */
    public final C0529j f2194f;

    /* renamed from: m */
    public abstract E mo2830m();

    public C0525h(C0520d activity) {
        this(activity, activity, new Handler(), 0);
    }

    public C0525h(Activity activity, Context context, Handler handler, int windowAnimations) {
        this.f2194f = new C0529j();
        this.f2190b = activity;
        C0419h.m2061d(context, "context == null");
        this.f2191c = context;
        C0419h.m2061d(handler, "handler == null");
        this.f2192d = handler;
        this.f2193e = windowAnimations;
    }

    /* renamed from: l */
    public void mo2829l(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
    }

    /* renamed from: q */
    public boolean mo2834q(Fragment fragment) {
        return true;
    }

    /* renamed from: n */
    public LayoutInflater mo2831n() {
        return LayoutInflater.from(this.f2191c);
    }

    /* renamed from: r */
    public void mo2835r() {
    }

    /* renamed from: p */
    public boolean mo2833p() {
        return true;
    }

    /* renamed from: o */
    public int mo2832o() {
        return this.f2193e;
    }

    /* renamed from: f */
    public View mo2826f(int id) {
        return null;
    }

    /* renamed from: g */
    public boolean mo2827g() {
        return true;
    }

    /* renamed from: h */
    public Activity mo2863h() {
        return this.f2190b;
    }

    /* renamed from: i */
    public Context mo2864i() {
        return this.f2191c;
    }

    /* renamed from: j */
    public Handler mo2865j() {
        return this.f2192d;
    }

    /* renamed from: k */
    public void mo2828k(Fragment fragment) {
    }
}
