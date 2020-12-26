package p000a.p055o.p056d;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.d.l */
public class C0646l {
    /* renamed from: b */
    public static int m3223b(RecyclerView.C0856a0 state, C0641j orientation, View startChild, View endChild, RecyclerView.C0876o lm, boolean smoothScrollbarEnabled, boolean reverseLayout) {
        int itemsBefore;
        if (lm.mo5151J() == 0 || state.mo5029b() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        int minPosition = Math.min(lm.mo5193h0(startChild), lm.mo5193h0(endChild));
        int maxPosition = Math.max(lm.mo5193h0(startChild), lm.mo5193h0(endChild));
        if (reverseLayout) {
            itemsBefore = Math.max(0, (state.mo5029b() - maxPosition) - 1);
        } else {
            itemsBefore = Math.max(0, minPosition);
        }
        if (!smoothScrollbarEnabled) {
            return itemsBefore;
        }
        return Math.round((((float) itemsBefore) * (((float) Math.abs(orientation.mo3346d(endChild) - orientation.mo3349g(startChild))) / ((float) (Math.abs(lm.mo5193h0(startChild) - lm.mo5193h0(endChild)) + 1)))) + ((float) (orientation.mo3355m() - orientation.mo3349g(startChild))));
    }

    /* renamed from: a */
    public static int m3222a(RecyclerView.C0856a0 state, C0641j orientation, View startChild, View endChild, RecyclerView.C0876o lm, boolean smoothScrollbarEnabled) {
        if (lm.mo5151J() == 0 || state.mo5029b() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        if (!smoothScrollbarEnabled) {
            return Math.abs(lm.mo5193h0(startChild) - lm.mo5193h0(endChild)) + 1;
        }
        return Math.min(orientation.mo3356n(), orientation.mo3346d(endChild) - orientation.mo3349g(startChild));
    }

    /* renamed from: c */
    public static int m3224c(RecyclerView.C0856a0 state, C0641j orientation, View startChild, View endChild, RecyclerView.C0876o lm, boolean smoothScrollbarEnabled) {
        if (lm.mo5151J() == 0 || state.mo5029b() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        if (!smoothScrollbarEnabled) {
            return state.mo5029b();
        }
        return (int) ((((float) (orientation.mo3346d(endChild) - orientation.mo3349g(startChild))) / ((float) (Math.abs(lm.mo5193h0(startChild) - lm.mo5193h0(endChild)) + 1))) * ((float) state.mo5029b()));
    }
}
