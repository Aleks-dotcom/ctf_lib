package p000a.p055o.p056d;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.d.n */
public abstract class C0648n extends RecyclerView.C0883r {

    /* renamed from: a */
    public RecyclerView f2574a;

    /* renamed from: b */
    public Scroller f2575b;

    /* renamed from: c */
    public final RecyclerView.C0885t f2576c = new C0649a();

    /* renamed from: c */
    public abstract int[] mo3331c(RecyclerView.C0876o oVar, View view);

    /* renamed from: h */
    public abstract View mo3332h(RecyclerView.C0876o oVar);

    /* renamed from: i */
    public abstract int mo3333i(RecyclerView.C0876o oVar, int i, int i2);

    /* renamed from: a.o.d.n$a */
    public class C0649a extends RecyclerView.C0885t {

        /* renamed from: a */
        public boolean f2577a = false;

        public C0649a() {
        }

        /* renamed from: a */
        public void mo3396a(RecyclerView recyclerView, int newState) {
            super.mo3396a(recyclerView, newState);
            if (newState == 0 && this.f2577a) {
                this.f2577a = false;
                C0648n.this.mo3395l();
            }
        }

        /* renamed from: b */
        public void mo3291b(RecyclerView recyclerView, int dx, int dy) {
            if (dx != 0 || dy != 0) {
                this.f2577a = true;
            }
        }
    }

    /* renamed from: a */
    public boolean mo3387a(int velocityX, int velocityY) {
        RecyclerView.C0876o layoutManager = this.f2574a.getLayoutManager();
        if (layoutManager == null || this.f2574a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f2574a.getMinFlingVelocity();
        if ((Math.abs(velocityY) > minFlingVelocity || Math.abs(velocityX) > minFlingVelocity) && mo3394k(layoutManager, velocityX, velocityY)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo3388b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2574a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                mo3392g();
            }
            this.f2574a = recyclerView;
            if (recyclerView != null) {
                mo3393j();
                this.f2575b = new Scroller(this.f2574a.getContext(), new DecelerateInterpolator());
                mo3395l();
            }
        }
    }

    /* renamed from: j */
    public final void mo3393j() {
        if (this.f2574a.getOnFlingListener() == null) {
            this.f2574a.addOnScrollListener(this.f2576c);
            this.f2574a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: g */
    public final void mo3392g() {
        this.f2574a.removeOnScrollListener(this.f2576c);
        this.f2574a.setOnFlingListener((RecyclerView.C0883r) null);
    }

    /* renamed from: d */
    public int[] mo3389d(int velocityX, int velocityY) {
        this.f2575b.fling(0, 0, velocityX, velocityY, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return new int[]{this.f2575b.getFinalX(), this.f2575b.getFinalY()};
    }

    /* renamed from: k */
    public final boolean mo3394k(RecyclerView.C0876o layoutManager, int velocityX, int velocityY) {
        RecyclerView.C0893z smoothScroller;
        int targetPosition;
        if (!(layoutManager instanceof RecyclerView.C0893z.C0895b) || (smoothScroller = mo3390e(layoutManager)) == null || (targetPosition = mo3333i(layoutManager, velocityX, velocityY)) == -1) {
            return false;
        }
        smoothScroller.mo5306p(targetPosition);
        layoutManager.mo5152J1(smoothScroller);
        return true;
    }

    /* renamed from: l */
    public void mo3395l() {
        RecyclerView.C0876o layoutManager;
        View snapView;
        RecyclerView recyclerView = this.f2574a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (snapView = mo3332h(layoutManager)) != null) {
            int[] snapDistance = mo3331c(layoutManager, snapView);
            if (snapDistance[0] != 0 || snapDistance[1] != 0) {
                this.f2574a.smoothScrollBy(snapDistance[0], snapDistance[1]);
            }
        }
    }

    /* renamed from: e */
    public RecyclerView.C0893z mo3390e(RecyclerView.C0876o layoutManager) {
        return mo3391f(layoutManager);
    }

    @Deprecated
    /* renamed from: f */
    public C0637g mo3391f(RecyclerView.C0876o layoutManager) {
        if (!(layoutManager instanceof RecyclerView.C0893z.C0895b)) {
            return null;
        }
        return new C0650b(this.f2574a.getContext());
    }

    /* renamed from: a.o.d.n$b */
    public class C0650b extends C0637g {
        public C0650b(Context context) {
            super(context);
        }

        /* renamed from: o */
        public void mo3322o(View targetView, RecyclerView.C0856a0 state, RecyclerView.C0893z.C0894a action) {
            C0648n nVar = C0648n.this;
            RecyclerView recyclerView = nVar.f2574a;
            if (recyclerView != null) {
                int[] snapDistances = nVar.mo3331c(recyclerView.getLayoutManager(), targetView);
                int dx = snapDistances[0];
                int dy = snapDistances[1];
                int time = mo3327w(Math.max(Math.abs(dx), Math.abs(dy)));
                if (time > 0) {
                    action.mo5312d(dx, dy, time, this.f2556j);
                }
            }
        }

        /* renamed from: v */
        public float mo3326v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }
}
