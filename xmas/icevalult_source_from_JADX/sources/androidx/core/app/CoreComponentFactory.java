package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory extends AppComponentFactory {

    /* renamed from: androidx.core.app.CoreComponentFactory$a */
    public interface C0832a {
        /* renamed from: a */
        Object mo4477a();
    }

    public Activity instantiateActivity(ClassLoader cl, String className, Intent intent) {
        return (Activity) m4079a(super.instantiateActivity(cl, className, intent));
    }

    public Application instantiateApplication(ClassLoader cl, String className) {
        return (Application) m4079a(super.instantiateApplication(cl, className));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader cl, String className, Intent intent) {
        return (BroadcastReceiver) m4079a(super.instantiateReceiver(cl, className, intent));
    }

    public ContentProvider instantiateProvider(ClassLoader cl, String className) {
        return (ContentProvider) m4079a(super.instantiateProvider(cl, className));
    }

    public Service instantiateService(ClassLoader cl, String className, Intent intent) {
        return (Service) m4079a(super.instantiateService(cl, className, intent));
    }

    /* renamed from: a */
    public static <T> T m4079a(T obj) {
        T wrapper;
        if (!(obj instanceof C0832a) || (wrapper = ((C0832a) obj).mo4477a()) == null) {
            return obj;
        }
        return wrapper;
    }
}
