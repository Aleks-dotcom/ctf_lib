package p000a.p055o.p056d;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.d.g */
public class C0637g extends RecyclerView.C0893z {

    /* renamed from: i */
    public final LinearInterpolator f2555i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f2556j = new DecelerateInterpolator();

    /* renamed from: k */
    public PointF f2557k;

    /* renamed from: l */
    public final DisplayMetrics f2558l;

    /* renamed from: m */
    public boolean f2559m = false;

    /* renamed from: n */
    public float f2560n;

    /* renamed from: o */
    public int f2561o = 0;

    /* renamed from: p */
    public int f2562p = 0;

    public C0637g(Context context) {
        this.f2558l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: m */
    public void mo3320m() {
    }

    /* renamed from: o */
    public void mo3322o(View targetView, RecyclerView.C0856a0 state, RecyclerView.C0893z.C0894a action) {
        int dx = mo3324t(targetView, mo3330z());
        int dy = mo3325u(targetView, mo3317B());
        int time = mo3327w((int) Math.sqrt((double) ((dx * dx) + (dy * dy))));
        if (time > 0) {
            action.mo5312d(-dx, -dy, time, this.f2556j);
        }
    }

    /* renamed from: l */
    public void mo3319l(int dx, int dy, RecyclerView.C0856a0 state, RecyclerView.C0893z.C0894a action) {
        if (mo5297c() == 0) {
            mo5308r();
            return;
        }
        this.f2561o = mo3329y(this.f2561o, dx);
        int y = mo3329y(this.f2562p, dy);
        this.f2562p = y;
        if (this.f2561o == 0 && y == 0) {
            mo3318C(action);
        }
    }

    /* renamed from: n */
    public void mo3321n() {
        this.f2562p = 0;
        this.f2561o = 0;
        this.f2557k = null;
    }

    /* renamed from: v */
    public float mo3326v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: A */
    public final float mo3316A() {
        if (!this.f2559m) {
            this.f2560n = mo3326v(this.f2558l);
            this.f2559m = true;
        }
        return this.f2560n;
    }

    /* renamed from: w */
    public int mo3327w(int dx) {
        return (int) Math.ceil(((double) mo3328x(dx)) / 0.3356d);
    }

    /* renamed from: x */
    public int mo3328x(int dx) {
        return (int) Math.ceil((double) (((float) Math.abs(dx)) * mo3316A()));
    }

    /* renamed from: z */
    public int mo3330z() {
        PointF pointF = this.f2557k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: B */
    public int mo3317B() {
        PointF pointF = this.f2557k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: C */
    public void mo3318C(RecyclerView.C0893z.C0894a action) {
        PointF scrollVector = mo5295a(mo5300f());
        if (scrollVector == null || (scrollVector.x == 0.0f && scrollVector.y == 0.0f)) {
            action.mo5310b(mo5300f());
            mo5308r();
            return;
        }
        mo5303i(scrollVector);
        this.f2557k = scrollVector;
        this.f2561o = (int) (scrollVector.x * 10000.0f);
        this.f2562p = (int) (scrollVector.y * 10000.0f);
        action.mo5312d((int) (((float) this.f2561o) * 1.2f), (int) (((float) this.f2562p) * 1.2f), (int) (((float) mo3328x(10000)) * 1.2f), this.f2555i);
    }

    /* renamed from: y */
    public final int mo3329y(int tmpDt, int dt) {
        int before = tmpDt;
        int tmpDt2 = tmpDt - dt;
        if (before * tmpDt2 <= 0) {
            return 0;
        }
        return tmpDt2;
    }

    /* renamed from: s */
    public int mo3323s(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
        if (snapPreference == -1) {
            return boxStart - viewStart;
        }
        if (snapPreference == 0) {
            int dtStart = boxStart - viewStart;
            if (dtStart > 0) {
                return dtStart;
            }
            int dtEnd = boxEnd - viewEnd;
            if (dtEnd < 0) {
                return dtEnd;
            }
            return 0;
        } else if (snapPreference == 1) {
            return boxEnd - viewEnd;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: u */
    public int mo3325u(View view, int snapPreference) {
        RecyclerView.C0876o layoutManager = mo5299e();
        if (layoutManager == null || !layoutManager.mo4797l()) {
            return 0;
        }
        RecyclerView.C0881p params = (RecyclerView.C0881p) view.getLayoutParams();
        return mo3323s(layoutManager.mo5167U(view) - params.topMargin, layoutManager.mo5159O(view) + params.bottomMargin, layoutManager.mo5190g0(), layoutManager.mo5170W() - layoutManager.mo5183d0(), snapPreference);
    }

    /* renamed from: t */
    public int mo3324t(View view, int snapPreference) {
        RecyclerView.C0876o layoutManager = mo5299e();
        if (layoutManager == null || !layoutManager.mo4795k()) {
            return 0;
        }
        RecyclerView.C0881p params = (RecyclerView.C0881p) view.getLayoutParams();
        return mo3323s(layoutManager.mo5162Q(view) - params.leftMargin, layoutManager.mo5166T(view) + params.rightMargin, layoutManager.mo5185e0(), layoutManager.mo5207o0() - layoutManager.mo5188f0(), snapPreference);
    }
}
