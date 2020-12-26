package p000a.p002b.p009o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p025h.p038m.C0472v;
import p000a.p025h.p038m.C0476w;
import p000a.p025h.p038m.C0477x;

/* renamed from: a.b.o.h */
public class C0083h {

    /* renamed from: a */
    public final ArrayList<C0472v> f552a = new ArrayList<>();

    /* renamed from: b */
    public long f553b = -1;

    /* renamed from: c */
    public Interpolator f554c;

    /* renamed from: d */
    public C0476w f555d;

    /* renamed from: e */
    public boolean f556e;

    /* renamed from: f */
    public final C0477x f557f = new C0084a();

    /* renamed from: c */
    public C0083h mo462c(C0472v animator) {
        if (!this.f556e) {
            this.f552a.add(animator);
        }
        return this;
    }

    /* renamed from: d */
    public C0083h mo463d(C0472v anim1, C0472v anim2) {
        this.f552a.add(anim1);
        anim2.mo2604h(anim1.mo2599c());
        this.f552a.add(anim2);
        return this;
    }

    /* renamed from: h */
    public void mo467h() {
        if (!this.f556e) {
            Iterator<C0472v> it = this.f552a.iterator();
            while (it.hasNext()) {
                C0472v animator = it.next();
                long j = this.f553b;
                if (j >= 0) {
                    animator.mo2600d(j);
                }
                Interpolator interpolator = this.f554c;
                if (interpolator != null) {
                    animator.mo2601e(interpolator);
                }
                if (this.f555d != null) {
                    animator.mo2602f(this.f557f);
                }
                animator.mo2606j();
            }
            this.f556e = true;
        }
    }

    /* renamed from: b */
    public void mo461b() {
        this.f556e = false;
    }

    /* renamed from: a */
    public void mo460a() {
        if (this.f556e) {
            Iterator<C0472v> it = this.f552a.iterator();
            while (it.hasNext()) {
                it.next().mo2598b();
            }
            this.f556e = false;
        }
    }

    /* renamed from: e */
    public C0083h mo464e(long duration) {
        if (!this.f556e) {
            this.f553b = duration;
        }
        return this;
    }

    /* renamed from: f */
    public C0083h mo465f(Interpolator interpolator) {
        if (!this.f556e) {
            this.f554c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C0083h mo466g(C0476w listener) {
        if (!this.f556e) {
            this.f555d = listener;
        }
        return this;
    }

    /* renamed from: a.b.o.h$a */
    public class C0084a extends C0477x {

        /* renamed from: a */
        public boolean f558a = false;

        /* renamed from: b */
        public int f559b = 0;

        public C0084a() {
        }

        /* renamed from: b */
        public void mo177b(View view) {
            if (!this.f558a) {
                this.f558a = true;
                C0476w wVar = C0083h.this.f555d;
                if (wVar != null) {
                    wVar.mo177b((View) null);
                }
            }
        }

        /* renamed from: d */
        public void mo468d() {
            this.f559b = 0;
            this.f558a = false;
            C0083h.this.mo461b();
        }

        /* renamed from: a */
        public void mo176a(View view) {
            int i = this.f559b + 1;
            this.f559b = i;
            if (i == C0083h.this.f552a.size()) {
                C0476w wVar = C0083h.this.f555d;
                if (wVar != null) {
                    wVar.mo176a((View) null);
                }
                mo468d();
            }
        }
    }
}
