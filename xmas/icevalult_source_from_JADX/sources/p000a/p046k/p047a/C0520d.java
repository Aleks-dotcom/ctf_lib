package p000a.p046k.p047a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p001a.C0002c;
import p000a.p018e.C0270h;
import p000a.p025h.p026d.C0326a;
import p000a.p051m.C0577d;
import p000a.p051m.C0583h;
import p000a.p051m.C0598r;
import p000a.p051m.C0599s;
import p000a.p052n.p053a.C0600a;

/* renamed from: a.k.a.d */
public class C0520d extends ComponentActivity {

    /* renamed from: h */
    public final C0523f f2178h = C0523f.m2624b(new C0521a());

    /* renamed from: i */
    public final C0583h f2179i = new C0583h(this);

    /* renamed from: j */
    public boolean f2180j;

    /* renamed from: k */
    public boolean f2181k;

    /* renamed from: l */
    public boolean f2182l = true;

    /* renamed from: m */
    public boolean f2183m;

    /* renamed from: n */
    public boolean f2184n;

    /* renamed from: o */
    public int f2185o;

    /* renamed from: p */
    public C0270h<String> f2186p;

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.f2178h.mo2858v();
        int requestIndex = requestCode >> 16;
        if (requestIndex != 0) {
            int requestIndex2 = requestIndex - 1;
            String who = this.f2186p.mo1901e(requestIndex2);
            this.f2186p.mo1906j(requestIndex2);
            if (who == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment targetFragment = this.f2178h.mo2856t(who);
            if (targetFragment == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + who);
                return;
            }
            targetFragment.mo4609U(65535 & requestCode, resultCode, data);
            return;
        }
        C0326a.C0327a delegate = C0326a.m1744f();
        if (delegate == null || !delegate.mo2217a(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        this.f2178h.mo2846j(isInMultiWindowMode);
    }

    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        this.f2178h.mo2850n(isInPictureInPictureMode);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f2178h.mo2858v();
        this.f2178h.mo2840d(newConfig);
    }

    public void onCreate(Bundle savedInstanceState) {
        this.f2178h.mo2838a((Fragment) null);
        if (savedInstanceState != null) {
            this.f2178h.mo2860x(savedInstanceState.getParcelable("android:support:fragments"));
            if (savedInstanceState.containsKey("android:support:next_request_index")) {
                this.f2185o = savedInstanceState.getInt("android:support:next_request_index");
                int[] requestCodes = savedInstanceState.getIntArray("android:support:request_indicies");
                String[] fragmentWhos = savedInstanceState.getStringArray("android:support:request_fragment_who");
                if (requestCodes == null || fragmentWhos == null || requestCodes.length != fragmentWhos.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f2186p = new C0270h<>(requestCodes.length);
                    for (int i = 0; i < requestCodes.length; i++) {
                        this.f2186p.mo1905i(requestCodes[i], fragmentWhos[i]);
                    }
                }
            }
        }
        if (this.f2186p == null) {
            this.f2186p = new C0270h<>();
            this.f2185o = 0;
        }
        super.onCreate(savedInstanceState);
        this.f2179i.mo3107i(C0577d.C0578a.ON_CREATE);
        this.f2178h.mo2842f();
    }

    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        if (featureId == 0) {
            return super.onCreatePanelMenu(featureId, menu) | this.f2178h.mo2843g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(featureId, menu);
    }

    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        View v = mo2801m(parent, name, context, attrs);
        if (v == null) {
            return super.onCreateView(parent, name, context, attrs);
        }
        return v;
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View v = mo2801m((View) null, name, context, attrs);
        if (v == null) {
            return super.onCreateView(name, context, attrs);
        }
        return v;
    }

    /* renamed from: m */
    public final View mo2801m(View parent, String name, Context context, AttributeSet attrs) {
        return this.f2178h.mo2859w(parent, name, context, attrs);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f2178h.mo2844h();
        this.f2179i.mo3107i(C0577d.C0578a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f2178h.mo2845i();
    }

    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.f2178h.mo2847k(item);
        }
        if (featureId != 6) {
            return false;
        }
        return this.f2178h.mo2841e(item);
    }

    public void onPanelClosed(int featureId, Menu menu) {
        if (featureId == 0) {
            this.f2178h.mo2848l(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    public void onPause() {
        super.onPause();
        this.f2181k = false;
        this.f2178h.mo2849m();
        this.f2179i.mo3107i(C0577d.C0578a.ON_PAUSE);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f2178h.mo2858v();
    }

    public void onStateNotSaved() {
        this.f2178h.mo2858v();
    }

    public void onResume() {
        super.onResume();
        this.f2181k = true;
        this.f2178h.mo2858v();
        this.f2178h.mo2855s();
    }

    public void onPostResume() {
        super.onPostResume();
        mo2819s();
    }

    /* renamed from: s */
    public void mo2819s() {
        this.f2179i.mo3107i(C0577d.C0578a.ON_RESUME);
        this.f2178h.mo2852p();
    }

    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        if (featureId == 0) {
            return mo2818r(view, menu) | this.f2178h.mo2851o(menu);
        }
        return super.onPreparePanel(featureId, view, menu);
    }

    @Deprecated
    /* renamed from: r */
    public boolean mo2818r(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mo2803o();
        this.f2179i.mo3107i(C0577d.C0578a.ON_STOP);
        Parcelable p = this.f2178h.mo2861y();
        if (p != null) {
            outState.putParcelable("android:support:fragments", p);
        }
        if (this.f2186p.mo1907k() > 0) {
            outState.putInt("android:support:next_request_index", this.f2185o);
            int[] requestCodes = new int[this.f2186p.mo1907k()];
            String[] fragmentWhos = new String[this.f2186p.mo1907k()];
            for (int i = 0; i < this.f2186p.mo1907k(); i++) {
                requestCodes[i] = this.f2186p.mo1904h(i);
                fragmentWhos[i] = this.f2186p.mo1908l(i);
            }
            outState.putIntArray("android:support:request_indicies", requestCodes);
            outState.putStringArray("android:support:request_fragment_who", fragmentWhos);
        }
    }

    public void onStart() {
        super.onStart();
        this.f2182l = false;
        if (!this.f2180j) {
            this.f2180j = true;
            this.f2178h.mo2839c();
        }
        this.f2178h.mo2858v();
        this.f2178h.mo2855s();
        this.f2179i.mo3107i(C0577d.C0578a.ON_START);
        this.f2178h.mo2853q();
    }

    public void onStop() {
        super.onStop();
        this.f2182l = true;
        mo2803o();
        this.f2178h.mo2854r();
        this.f2179i.mo3107i(C0577d.C0578a.ON_STOP);
    }

    @Deprecated
    /* renamed from: t */
    public void mo78t() {
        invalidateOptionsMenu();
    }

    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(prefix, fd, writer, args);
        writer.print(prefix);
        writer.print("Local FragmentActivity ");
        writer.print(Integer.toHexString(System.identityHashCode(this)));
        writer.println(" State:");
        String innerPrefix = prefix + "  ";
        writer.print(innerPrefix);
        writer.print("mCreated=");
        writer.print(this.f2180j);
        writer.print(" mResumed=");
        writer.print(this.f2181k);
        writer.print(" mStopped=");
        writer.print(this.f2182l);
        if (getApplication() != null) {
            C0600a.m2972b(this).mo3139a(innerPrefix, fd, writer, args);
        }
        this.f2178h.mo2857u().mo2866a(prefix, fd, writer, args);
    }

    /* renamed from: q */
    public void mo2817q(Fragment fragment) {
    }

    /* renamed from: n */
    public C0526i mo2802n() {
        return this.f2178h.mo2857u();
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int requestCode) {
        if (!this.f2184n && requestCode != -1) {
            m2598l(requestCode);
        }
        super.startActivityForResult(intent, requestCode);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int requestCode, Bundle options) {
        if (!this.f2184n && requestCode != -1) {
            m2598l(requestCode);
        }
        super.startActivityForResult(intent, requestCode, options);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) {
        if (!this.f2183m && requestCode != -1) {
            m2598l(requestCode);
        }
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
        if (!this.f2183m && requestCode != -1) {
            m2598l(requestCode);
        }
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    /* renamed from: l */
    public static void m2598l(int requestCode) {
        if ((-65536 & requestCode) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        this.f2178h.mo2858v();
        int index = (requestCode >> 16) & 65535;
        if (index != 0) {
            int index2 = index - 1;
            String who = this.f2186p.mo1901e(index2);
            this.f2186p.mo1906j(index2);
            if (who == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment frag = this.f2178h.mo2856t(who);
            if (frag == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + who);
                return;
            }
            frag.mo4672t0(65535 & requestCode, permissions, grantResults);
        }
    }

    /* renamed from: a.k.a.d$a */
    public class C0521a extends C0525h<C0520d> implements C0599s, C0002c {
        public C0521a() {
            super(C0520d.this);
        }

        /* renamed from: a */
        public C0577d mo2824a() {
            return C0520d.this.f2179i;
        }

        /* renamed from: e */
        public C0598r mo2825e() {
            return C0520d.this.mo2825e();
        }

        /* renamed from: c */
        public OnBackPressedDispatcher mo8c() {
            return C0520d.this.mo8c();
        }

        /* renamed from: l */
        public void mo2829l(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            C0520d.this.dump(prefix, fd, writer, args);
        }

        /* renamed from: q */
        public boolean mo2834q(Fragment fragment) {
            return !C0520d.this.isFinishing();
        }

        /* renamed from: n */
        public LayoutInflater mo2831n() {
            return C0520d.this.getLayoutInflater().cloneInContext(C0520d.this);
        }

        /* renamed from: s */
        public C0520d mo2830m() {
            return C0520d.this;
        }

        /* renamed from: r */
        public void mo2835r() {
            C0520d.this.mo78t();
        }

        /* renamed from: p */
        public boolean mo2833p() {
            return C0520d.this.getWindow() != null;
        }

        /* renamed from: o */
        public int mo2832o() {
            Window w = C0520d.this.getWindow();
            if (w == null) {
                return 0;
            }
            return w.getAttributes().windowAnimations;
        }

        /* renamed from: k */
        public void mo2828k(Fragment fragment) {
            C0520d.this.mo2817q(fragment);
        }

        /* renamed from: f */
        public View mo2826f(int id) {
            return C0520d.this.findViewById(id);
        }

        /* renamed from: g */
        public boolean mo2827g() {
            Window w = C0520d.this.getWindow();
            return (w == null || w.peekDecorView() == null) ? false : true;
        }
    }

    /* renamed from: o */
    public final void mo2803o() {
        do {
        } while (m2599p(mo2802n(), C0577d.C0579b.CREATED));
    }

    /* renamed from: p */
    public static boolean m2599p(C0526i manager, C0577d.C0579b state) {
        boolean hadNotMarked = false;
        for (Fragment fragment : manager.mo2868c()) {
            if (fragment != null) {
                if (fragment.mo2824a().mo3100b().mo3102a(C0577d.C0579b.STARTED)) {
                    fragment.f3447S.mo3113p(state);
                    hadNotMarked = true;
                }
                if (fragment.mo4676v() != null) {
                    hadNotMarked |= m2599p(fragment.mo4658o(), state);
                }
            }
        }
        return hadNotMarked;
    }
}
