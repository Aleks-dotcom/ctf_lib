package p000a.p025h.p026d;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: a.h.d.e */
public final class C0335e {
    /* renamed from: f */
    public static boolean m1764f(Activity sourceActivity, Intent targetIntent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return sourceActivity.shouldUpRecreateTask(targetIntent);
        }
        String action = sourceActivity.getIntent().getAction();
        return action != null && !action.equals("android.intent.action.MAIN");
    }

    /* renamed from: e */
    public static void m1763e(Activity sourceActivity, Intent upIntent) {
        if (Build.VERSION.SDK_INT >= 16) {
            sourceActivity.navigateUpTo(upIntent);
            return;
        }
        upIntent.addFlags(67108864);
        sourceActivity.startActivity(upIntent);
        sourceActivity.finish();
    }

    /* renamed from: a */
    public static Intent m1759a(Activity sourceActivity) {
        Intent result;
        if (Build.VERSION.SDK_INT >= 16 && (result = sourceActivity.getParentActivityIntent()) != null) {
            return result;
        }
        String parentName = m1761c(sourceActivity);
        if (parentName == null) {
            return null;
        }
        ComponentName target = new ComponentName(sourceActivity, parentName);
        try {
            if (m1762d(sourceActivity, target) == null) {
                return Intent.makeMainActivity(target);
            }
            return new Intent().setComponent(target);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + parentName + "' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m1760b(Context context, ComponentName componentName) {
        String parentActivity = m1762d(context, componentName);
        if (parentActivity == null) {
            return null;
        }
        ComponentName target = new ComponentName(componentName.getPackageName(), parentActivity);
        if (m1762d(context, target) == null) {
            return Intent.makeMainActivity(target);
        }
        return new Intent().setComponent(target);
    }

    /* renamed from: c */
    public static String m1761c(Activity sourceActivity) {
        try {
            return m1762d(sourceActivity, sourceActivity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public static String m1762d(Context context, ComponentName componentName) {
        int flags;
        String parentActivity;
        String result;
        PackageManager pm = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            flags = 128 | 512;
        } else {
            flags = 128 | 512;
        }
        ActivityInfo info = pm.getActivityInfo(componentName, flags);
        if (i >= 16 && (result = info.parentActivityName) != null) {
            return result;
        }
        Bundle bundle = info.metaData;
        if (bundle == null || (parentActivity = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (parentActivity.charAt(0) != '.') {
            return parentActivity;
        }
        return context.getPackageName() + parentActivity;
    }
}
