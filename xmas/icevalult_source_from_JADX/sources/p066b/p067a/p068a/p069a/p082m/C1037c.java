package p066b.p067a.p068a.p069a.p082m;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: b.a.a.a.m.c */
public class C1037c<V extends View> extends CoordinatorLayout.C0824c<V> {

    /* renamed from: a */
    public C1038d f4349a;

    /* renamed from: b */
    public int f4350b = 0;

    /* renamed from: c */
    public int f4351c = 0;

    public C1037c() {
    }

    public C1037c(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* renamed from: l */
    public boolean mo4425l(CoordinatorLayout parent, V child, int layoutDirection) {
        mo5889F(parent, child, layoutDirection);
        if (this.f4349a == null) {
            this.f4349a = new C1038d(child);
        }
        this.f4349a.mo5902c();
        this.f4349a.mo5900a();
        int i = this.f4350b;
        if (i != 0) {
            this.f4349a.mo5904e(i);
            this.f4350b = 0;
        }
        int i2 = this.f4351c;
        if (i2 == 0) {
            return true;
        }
        this.f4349a.mo5903d(i2);
        this.f4351c = 0;
        return true;
    }

    /* renamed from: F */
    public void mo5889F(CoordinatorLayout parent, V child, int layoutDirection) {
        parent.mo4350I(child, layoutDirection);
    }

    /* renamed from: G */
    public boolean mo5899G(int offset) {
        C1038d dVar = this.f4349a;
        if (dVar != null) {
            return dVar.mo5904e(offset);
        }
        this.f4350b = offset;
        return false;
    }

    /* renamed from: E */
    public int mo5898E() {
        C1038d dVar = this.f4349a;
        if (dVar != null) {
            return dVar.mo5901b();
        }
        return 0;
    }
}
