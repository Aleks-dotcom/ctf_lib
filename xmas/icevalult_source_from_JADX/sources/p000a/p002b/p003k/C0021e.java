package p000a.p002b.p003k;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p000a.p018e.C0258b;

/* renamed from: a.b.k.e */
public abstract class C0021e {

    /* renamed from: b */
    public static int f244b = -100;

    /* renamed from: c */
    public static final C0258b<WeakReference<C0021e>> f245c = new C0258b<>();

    /* renamed from: d */
    public static final Object f246d = new Object();

    /* renamed from: A */
    public abstract void mo85A(View view);

    /* renamed from: B */
    public abstract void mo86B(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: D */
    public abstract void mo88D(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo89c(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: g */
    public abstract <T extends View> T mo91g(int i);

    /* renamed from: j */
    public abstract MenuInflater mo93j();

    /* renamed from: k */
    public abstract C0013a mo94k();

    /* renamed from: l */
    public abstract void mo95l();

    /* renamed from: m */
    public abstract void mo96m();

    /* renamed from: p */
    public abstract void mo97p(Configuration configuration);

    /* renamed from: q */
    public abstract void mo98q(Bundle bundle);

    /* renamed from: r */
    public abstract void mo99r();

    /* renamed from: s */
    public abstract void mo100s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo101t();

    /* renamed from: u */
    public abstract void mo102u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo103v();

    /* renamed from: w */
    public abstract void mo104w();

    /* renamed from: y */
    public abstract boolean mo105y(int i);

    /* renamed from: z */
    public abstract void mo106z(int i);

    /* renamed from: e */
    public static C0021e m56e(Activity activity, C0020d callback) {
        return new C0022f(activity, callback);
    }

    /* renamed from: f */
    public static C0021e m57f(Dialog dialog, C0020d callback) {
        return new C0022f(dialog, callback);
    }

    /* renamed from: C */
    public void mo87C(int themeResId) {
    }

    /* renamed from: d */
    public void mo90d(Context context) {
    }

    /* renamed from: i */
    public int mo92i() {
        return -100;
    }

    /* renamed from: h */
    public static int m58h() {
        return f244b;
    }

    /* renamed from: n */
    public static void m59n(C0021e delegate) {
        synchronized (f246d) {
            m61x(delegate);
            f245c.add(new WeakReference(delegate));
        }
    }

    /* renamed from: o */
    public static void m60o(C0021e delegate) {
        synchronized (f246d) {
            m61x(delegate);
        }
    }

    /* renamed from: x */
    public static void m61x(C0021e toRemove) {
        synchronized (f246d) {
            Iterator<WeakReference<C0021e>> it = f245c.iterator();
            while (it.hasNext()) {
                C0021e delegate = (C0021e) it.next().get();
                if (delegate == toRemove || delegate == null) {
                    it.remove();
                }
            }
        }
    }
}
