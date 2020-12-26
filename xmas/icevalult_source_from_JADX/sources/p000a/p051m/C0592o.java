package p000a.p051m;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import p000a.p051m.C0577d;

/* renamed from: a.m.o */
public class C0592o extends Fragment {

    /* renamed from: b */
    public C0593a f2398b;

    /* renamed from: a.m.o$a */
    public interface C0593a {
        /* renamed from: a */
        void mo3129a();

        /* renamed from: b */
        void mo3130b();

        /* renamed from: c */
        void mo3131c();
    }

    /* renamed from: e */
    public static void m2952e(Activity activity) {
        FragmentManager manager = activity.getFragmentManager();
        if (manager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            manager.beginTransaction().add(new C0592o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            manager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void mo3120b(C0593a listener) {
        if (listener != null) {
            listener.mo3129a();
        }
    }

    /* renamed from: d */
    public final void mo3122d(C0593a listener) {
        if (listener != null) {
            listener.mo3131c();
        }
    }

    /* renamed from: c */
    public final void mo3121c(C0593a listener) {
        if (listener != null) {
            listener.mo3130b();
        }
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mo3120b(this.f2398b);
        mo3119a(C0577d.C0578a.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        mo3122d(this.f2398b);
        mo3119a(C0577d.C0578a.ON_START);
    }

    public void onResume() {
        super.onResume();
        mo3121c(this.f2398b);
        mo3119a(C0577d.C0578a.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        mo3119a(C0577d.C0578a.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        mo3119a(C0577d.C0578a.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        mo3119a(C0577d.C0578a.ON_DESTROY);
        this.f2398b = null;
    }

    /* renamed from: a */
    public final void mo3119a(C0577d.C0578a event) {
        Activity activity = getActivity();
        if (activity instanceof C0586i) {
            ((C0586i) activity).mo2824a().mo3107i(event);
        } else if (activity instanceof C0582g) {
            C0577d lifecycle = ((C0582g) activity).mo2824a();
            if (lifecycle instanceof C0583h) {
                ((C0583h) lifecycle).mo3107i(event);
            }
        }
    }
}
