package p066b.p067a.p068a.p069a.p082m;

import android.view.View;
import p000a.p025h.p038m.C0460r;

/* renamed from: b.a.a.a.m.d */
public class C1038d {

    /* renamed from: a */
    public final View f4352a;

    /* renamed from: b */
    public int f4353b;

    /* renamed from: c */
    public int f4354c;

    /* renamed from: d */
    public int f4355d;

    /* renamed from: e */
    public int f4356e;

    /* renamed from: f */
    public boolean f4357f = true;

    /* renamed from: g */
    public boolean f4358g = true;

    public C1038d(View view) {
        this.f4352a = view;
    }

    /* renamed from: c */
    public void mo5902c() {
        this.f4353b = this.f4352a.getTop();
        this.f4354c = this.f4352a.getLeft();
    }

    /* renamed from: a */
    public void mo5900a() {
        View view = this.f4352a;
        C0460r.m2241P(view, this.f4355d - (view.getTop() - this.f4353b));
        View view2 = this.f4352a;
        C0460r.m2240O(view2, this.f4356e - (view2.getLeft() - this.f4354c));
    }

    /* renamed from: e */
    public boolean mo5904e(int offset) {
        if (!this.f4357f || this.f4355d == offset) {
            return false;
        }
        this.f4355d = offset;
        mo5900a();
        return true;
    }

    /* renamed from: d */
    public boolean mo5903d(int offset) {
        if (!this.f4358g || this.f4356e == offset) {
            return false;
        }
        this.f4356e = offset;
        mo5900a();
        return true;
    }

    /* renamed from: b */
    public int mo5901b() {
        return this.f4355d;
    }
}
