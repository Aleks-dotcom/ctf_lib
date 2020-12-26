package p000a.p025h.p040n;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* renamed from: a.h.n.g */
public final class C0488g {
    /* renamed from: a */
    public static void m2422a(ListView listView, int y) {
        View firstView;
        if (Build.VERSION.SDK_INT >= 19) {
            listView.scrollListBy(y);
            return;
        }
        int firstPosition = listView.getFirstVisiblePosition();
        if (firstPosition != -1 && (firstView = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstPosition, firstView.getTop() - y);
        }
    }
}
