package p000a.p025h.p026d;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p025h.p027e.C0339a;

/* renamed from: a.h.d.g */
public final class C0337g implements Iterable<Intent> {

    /* renamed from: b */
    public final ArrayList<Intent> f1832b = new ArrayList<>();

    /* renamed from: c */
    public final Context f1833c;

    /* renamed from: a.h.d.g$a */
    public interface C0338a {
        /* renamed from: i */
        Intent mo57i();
    }

    public C0337g(Context a) {
        this.f1833c = a;
    }

    /* renamed from: d */
    public static C0337g m1768d(Context context) {
        return new C0337g(context);
    }

    /* renamed from: a */
    public C0337g mo2232a(Intent nextIntent) {
        this.f1832b.add(nextIntent);
        return this;
    }

    /* renamed from: b */
    public C0337g mo2233b(Activity sourceActivity) {
        Intent parent = null;
        if (sourceActivity instanceof C0338a) {
            parent = ((C0338a) sourceActivity).mo57i();
        }
        if (parent == null) {
            parent = C0335e.m1759a(sourceActivity);
        }
        if (parent != null) {
            ComponentName target = parent.getComponent();
            if (target == null) {
                target = parent.resolveActivity(this.f1833c.getPackageManager());
            }
            mo2234c(target);
            mo2232a(parent);
        }
        return this;
    }

    /* renamed from: c */
    public C0337g mo2234c(ComponentName sourceActivityName) {
        int insertAt = this.f1832b.size();
        try {
            Intent parent = C0335e.m1760b(this.f1833c, sourceActivityName);
            while (parent != null) {
                this.f1832b.add(insertAt, parent);
                parent = C0335e.m1760b(this.f1833c, parent.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1832b.iterator();
    }

    /* renamed from: e */
    public void mo2235e() {
        mo2236f((Bundle) null);
    }

    /* renamed from: f */
    public void mo2236f(Bundle options) {
        if (!this.f1832b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1832b;
            Intent[] intents = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intents[0] = new Intent(intents[0]).addFlags(268484608);
            if (!C0339a.m1778d(this.f1833c, intents, options)) {
                Intent topIntent = new Intent(intents[intents.length - 1]);
                topIntent.addFlags(268435456);
                this.f1833c.startActivity(topIntent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
