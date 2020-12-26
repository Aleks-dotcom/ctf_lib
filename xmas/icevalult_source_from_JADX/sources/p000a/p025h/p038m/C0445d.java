package p000a.p025h.p038m;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.h.m.d */
public class C0445d {

    /* renamed from: a */
    public static boolean f2012a = false;

    /* renamed from: b */
    public static Method f2013b = null;

    /* renamed from: c */
    public static boolean f2014c = false;

    /* renamed from: d */
    public static Field f2015d = null;

    /* renamed from: a.h.m.d$a */
    public interface C0446a {
        /* renamed from: h */
        boolean mo221h(KeyEvent keyEvent);
    }

    /* renamed from: d */
    public static boolean m2178d(View root, KeyEvent event) {
        return C0460r.m2264g(root, event);
    }

    /* renamed from: e */
    public static boolean m2179e(C0446a component, View root, Window.Callback callback, KeyEvent event) {
        if (component == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return component.mo221h(event);
        }
        if (callback instanceof Activity) {
            return m2176b((Activity) callback, event);
        }
        if (callback instanceof Dialog) {
            return m2177c((Dialog) callback, event);
        }
        if ((root == null || !C0460r.m2262f(root, event)) && !component.mo221h(event)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m2175a(ActionBar actionBar, KeyEvent event) {
        if (!f2012a) {
            try {
                f2013b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException e) {
            }
            f2012a = true;
        }
        Method method = f2013b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{event})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException e2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m2176b(Activity activity, KeyEvent event) {
        activity.onUserInteraction();
        Window win = activity.getWindow();
        if (win.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (event.getKeyCode() == 82 && actionBar != null && m2175a(actionBar, event)) {
                return true;
            }
        }
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (C0460r.m2262f(decor, event)) {
            return true;
        }
        return event.dispatch(activity, decor != null ? decor.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: f */
    public static DialogInterface.OnKeyListener m2180f(Dialog dialog) {
        if (!f2014c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2015d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f2014c = true;
        }
        Field field = f2015d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException e2) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m2177c(Dialog dialog, KeyEvent event) {
        DialogInterface.OnKeyListener onKeyListener = m2180f(dialog);
        if (onKeyListener != null && onKeyListener.onKey(dialog, event.getKeyCode(), event)) {
            return true;
        }
        Window win = dialog.getWindow();
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (C0460r.m2262f(decor, event)) {
            return true;
        }
        return event.dispatch(dialog, decor != null ? decor.getKeyDispatcherState() : null, dialog);
    }
}
