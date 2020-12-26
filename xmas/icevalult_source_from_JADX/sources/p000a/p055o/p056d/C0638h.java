package p000a.p055o.p056d;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.d.h */
public class C0638h extends C0648n {

    /* renamed from: d */
    public C0641j f2563d;

    /* renamed from: e */
    public C0641j f2564e;

    /* renamed from: c */
    public int[] mo3331c(RecyclerView.C0876o layoutManager, View targetView) {
        int[] out = new int[2];
        if (layoutManager.mo4795k()) {
            out[0] = mo3335n(layoutManager, targetView, mo3338q(layoutManager));
        } else {
            out[0] = 0;
        }
        if (layoutManager.mo4797l()) {
            out[1] = mo3335n(layoutManager, targetView, mo3339r(layoutManager));
        } else {
            out[1] = 0;
        }
        return out;
    }

    /* renamed from: i */
    public int mo3333i(RecyclerView.C0876o layoutManager, int velocityX, int velocityY) {
        int itemCount;
        View currentView;
        int currentPosition;
        PointF vectorForEnd;
        int hDeltaJump;
        int vDeltaJump;
        if (!(layoutManager instanceof RecyclerView.C0893z.C0895b) || (itemCount = layoutManager.mo5172Y()) == 0 || (currentView = mo3332h(layoutManager)) == null || (currentPosition = layoutManager.mo5193h0(currentView)) == -1 || (vectorForEnd = ((RecyclerView.C0893z.C0895b) layoutManager).mo4782a(itemCount - 1)) == null) {
            return -1;
        }
        if (layoutManager.mo4795k()) {
            hDeltaJump = mo3336o(layoutManager, mo3338q(layoutManager), velocityX, 0);
            if (vectorForEnd.x < 0.0f) {
                hDeltaJump = -hDeltaJump;
            }
        } else {
            hDeltaJump = 0;
        }
        if (layoutManager.mo4797l()) {
            vDeltaJump = mo3336o(layoutManager, mo3339r(layoutManager), 0, velocityY);
            if (vectorForEnd.y < 0.0f) {
                vDeltaJump = -vDeltaJump;
            }
        } else {
            vDeltaJump = 0;
        }
        int deltaJump = layoutManager.mo4797l() ? vDeltaJump : hDeltaJump;
        if (deltaJump == 0) {
            return -1;
        }
        int targetPos = currentPosition + deltaJump;
        if (targetPos < 0) {
            targetPos = 0;
        }
        if (targetPos >= itemCount) {
            return itemCount - 1;
        }
        return targetPos;
    }

    /* renamed from: h */
    public View mo3332h(RecyclerView.C0876o layoutManager) {
        if (layoutManager.mo4797l()) {
            return mo3337p(layoutManager, mo3339r(layoutManager));
        }
        if (layoutManager.mo4795k()) {
            return mo3337p(layoutManager, mo3338q(layoutManager));
        }
        return null;
    }

    /* renamed from: n */
    public final int mo3335n(RecyclerView.C0876o layoutManager, View targetView, C0641j helper) {
        return (helper.mo3349g(targetView) + (helper.mo3347e(targetView) / 2)) - (helper.mo3355m() + (helper.mo3356n() / 2));
    }

    /* renamed from: o */
    public final int mo3336o(RecyclerView.C0876o layoutManager, C0641j helper, int velocityX, int velocityY) {
        int[] distances = mo3389d(velocityX, velocityY);
        float distancePerChild = mo3334m(layoutManager, helper);
        if (distancePerChild <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(distances[0]) > Math.abs(distances[1]) ? distances[0] : distances[1])) / distancePerChild);
    }

    /* renamed from: p */
    public final View mo3337p(RecyclerView.C0876o layoutManager, C0641j helper) {
        int childCount = layoutManager.mo5151J();
        if (childCount == 0) {
            return null;
        }
        View closestChild = null;
        int center = helper.mo3355m() + (helper.mo3356n() / 2);
        int absClosest = Integer.MAX_VALUE;
        for (int i = 0; i < childCount; i++) {
            View child = layoutManager.mo5150I(i);
            int absDistance = Math.abs((helper.mo3349g(child) + (helper.mo3347e(child) / 2)) - center);
            if (absDistance < absClosest) {
                absClosest = absDistance;
                closestChild = child;
            }
        }
        return closestChild;
    }

    /* renamed from: m */
    public final float mo3334m(RecyclerView.C0876o layoutManager, C0641j helper) {
        int distance;
        View minPosView = null;
        View maxPosView = null;
        int minPos = Integer.MAX_VALUE;
        int maxPos = RecyclerView.UNDEFINED_DURATION;
        int childCount = layoutManager.mo5151J();
        if (childCount == 0) {
            return 1.0f;
        }
        for (int i = 0; i < childCount; i++) {
            View child = layoutManager.mo5150I(i);
            int pos = layoutManager.mo5193h0(child);
            if (pos != -1) {
                if (pos < minPos) {
                    minPos = pos;
                    minPosView = child;
                }
                if (pos > maxPos) {
                    maxPos = pos;
                    maxPosView = child;
                }
            }
        }
        if (minPosView == null || maxPosView == null || (distance = Math.max(helper.mo3346d(minPosView), helper.mo3346d(maxPosView)) - Math.min(helper.mo3349g(minPosView), helper.mo3349g(maxPosView))) == 0) {
            return 1.0f;
        }
        return (((float) distance) * 1.0f) / ((float) ((maxPos - minPos) + 1));
    }

    /* renamed from: r */
    public final C0641j mo3339r(RecyclerView.C0876o layoutManager) {
        C0641j jVar = this.f2563d;
        if (jVar == null || jVar.f2566a != layoutManager) {
            this.f2563d = C0641j.m3161c(layoutManager);
        }
        return this.f2563d;
    }

    /* renamed from: q */
    public final C0641j mo3338q(RecyclerView.C0876o layoutManager) {
        C0641j jVar = this.f2564e;
        if (jVar == null || jVar.f2566a != layoutManager) {
            this.f2564e = C0641j.m3159a(layoutManager);
        }
        return this.f2564e;
    }
}
