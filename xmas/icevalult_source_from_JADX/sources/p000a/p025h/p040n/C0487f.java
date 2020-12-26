package p000a.p025h.p040n;

import android.widget.ListView;

/* renamed from: a.h.n.f */
public class C0487f extends C0480a {

    /* renamed from: t */
    public final ListView f2091t;

    public C0487f(ListView target) {
        super(target);
        this.f2091t = target;
    }

    /* renamed from: j */
    public void mo2627j(int deltaX, int deltaY) {
        C0488g.m2422a(this.f2091t, deltaY);
    }

    /* renamed from: a */
    public boolean mo2620a(int direction) {
        return false;
    }

    /* renamed from: b */
    public boolean mo2621b(int direction) {
        ListView target = this.f2091t;
        int itemCount = target.getCount();
        if (itemCount == 0) {
            return false;
        }
        int childCount = target.getChildCount();
        int firstPosition = target.getFirstVisiblePosition();
        int lastPosition = firstPosition + childCount;
        if (direction > 0) {
            if (lastPosition < itemCount || target.getChildAt(childCount - 1).getBottom() > target.getHeight()) {
                return true;
            }
            return false;
        } else if (direction >= 0) {
            return false;
        } else {
            if (firstPosition > 0 || target.getChildAt(0).getTop() < 0) {
                return true;
            }
            return false;
        }
    }
}
