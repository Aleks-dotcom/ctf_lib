package p000a.p025h.p026d;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: a.h.d.c */
public final class C0333c {
    /* renamed from: b */
    public static String m1757b(String permission) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(permission);
        }
        return null;
    }

    /* renamed from: a */
    public static int m1756a(Context context, String op, String proxiedPackageName) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(op, proxiedPackageName);
        }
        return 1;
    }
}
