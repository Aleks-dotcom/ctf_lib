package p000a.p002b.p009o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p000a.p002b.C0003a;
import p000a.p002b.C0004b;
import p000a.p002b.C0006d;
import p000a.p002b.C0012j;

/* renamed from: a.b.o.a */
public class C0072a {

    /* renamed from: a */
    public Context f491a;

    /* renamed from: b */
    public static C0072a m362b(Context context) {
        return new C0072a(context);
    }

    public C0072a(Context context) {
        this.f491a = context;
    }

    /* renamed from: d */
    public int mo407d() {
        Configuration configuration = this.f491a.getResources().getConfiguration();
        int widthDp = configuration.screenWidthDp;
        int heightDp = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || widthDp > 600) {
            return 5;
        }
        if (widthDp > 960 && heightDp > 720) {
            return 5;
        }
        if (widthDp > 720 && heightDp > 960) {
            return 5;
        }
        if (widthDp >= 500) {
            return 4;
        }
        if (widthDp > 640 && heightDp > 480) {
            return 4;
        }
        if (widthDp > 480 && heightDp > 640) {
            return 4;
        }
        if (widthDp >= 360) {
            return 3;
        }
        return 2;
    }

    /* renamed from: h */
    public boolean mo411h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f491a).hasPermanentMenuKey();
    }

    /* renamed from: c */
    public int mo406c() {
        return this.f491a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: g */
    public boolean mo410g() {
        return this.f491a.getResources().getBoolean(C0004b.abc_action_bar_embed_tabs);
    }

    /* renamed from: f */
    public int mo409f() {
        TypedArray a = this.f491a.obtainStyledAttributes((AttributeSet) null, C0012j.f112a, C0003a.actionBarStyle, 0);
        int height = a.getLayoutDimension(C0012j.f157j, 0);
        Resources r = this.f491a.getResources();
        if (!mo410g()) {
            height = Math.min(height, r.getDimensionPixelSize(C0006d.abc_action_bar_stacked_max_height));
        }
        a.recycle();
        return height;
    }

    /* renamed from: a */
    public boolean mo405a() {
        return this.f491a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: e */
    public int mo408e() {
        return this.f491a.getResources().getDimensionPixelSize(C0006d.abc_action_bar_stacked_tab_max_width);
    }
}
