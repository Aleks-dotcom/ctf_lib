package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p051m.C0577d;
import p000a.p051m.C0580e;
import p000a.p051m.C0582g;
import p000a.p057p.C0658b;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements C0580e {

    /* renamed from: a */
    public final C0658b f3755a;

    public Recreator(C0658b owner) {
        this.f3755a = owner;
    }

    /* renamed from: g */
    public void mo3103g(C0582g source, C0577d.C0578a event) {
        if (event == C0577d.C0578a.ON_CREATE) {
            source.mo2824a().mo3101c(this);
            Bundle bundle = this.f3755a.mo3433d().mo5433a("androidx.savedstate.Restarter");
            if (bundle != null) {
                ArrayList<String> classes = bundle.getStringArrayList("classes_to_restore");
                if (classes != null) {
                    Iterator<String> it = classes.iterator();
                    while (it.hasNext()) {
                        mo5432h(it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    /* renamed from: h */
    public final void mo5432h(String className) {
        try {
            Class<? extends U> asSubclass = Class.forName(className, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.C0906a.class);
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.C0906a) declaredConstructor.newInstance(new Object[0])).mo5436a(this.f3755a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + className, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + className + " wasn't found", e3);
        }
    }
}
