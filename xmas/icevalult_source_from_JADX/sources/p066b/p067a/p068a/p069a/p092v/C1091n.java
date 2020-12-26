package p066b.p067a.p068a.p069a.p092v;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p055o.p056d.C0637g;

/* renamed from: b.a.a.a.v.n */
public class C1091n extends LinearLayoutManager {
    public C1091n(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    /* renamed from: b.a.a.a.v.n$a */
    public class C1092a extends C0637g {
        public C1092a(C1091n this$0, Context x0) {
            super(x0);
        }

        /* renamed from: v */
        public float mo3326v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: I1 */
    public void mo4762I1(RecyclerView recyclerView, RecyclerView.C0856a0 state, int position) {
        C0637g linearSmoothScroller = new C1092a(this, recyclerView.getContext());
        linearSmoothScroller.mo5306p(position);
        mo5152J1(linearSmoothScroller);
    }
}
