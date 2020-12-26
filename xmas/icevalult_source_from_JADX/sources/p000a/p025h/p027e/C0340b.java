package p000a.p025h.p027e;

import android.content.Context;
import android.os.Process;
import p000a.p025h.p026d.C0333c;

/* renamed from: a.h.e.b */
public final class C0340b {
    /* renamed from: a */
    public static int m1779a(Context context, String permission, int pid, int uid, String packageName) {
        if (context.checkPermission(permission, pid, uid) == -1) {
            return -1;
        }
        String op = C0333c.m1757b(permission);
        if (op == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packageNames = context.getPackageManager().getPackagesForUid(uid);
            if (packageNames == null || packageNames.length <= 0) {
                return -1;
            }
            packageName = packageNames[0];
        }
        if (C0333c.m1756a(context, op, packageName) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m1780b(Context context, String permission) {
        return m1779a(context, permission, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
