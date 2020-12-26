package p000a.p058q;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a.q.s */
public class C0723s {

    /* renamed from: a */
    public final Map<String, Object> f2741a = new HashMap();

    /* renamed from: b */
    public View f2742b;

    /* renamed from: c */
    public final ArrayList<C0706m> f2743c = new ArrayList<>();

    @Deprecated
    public C0723s() {
    }

    public C0723s(View view) {
        this.f2742b = view;
    }

    public boolean equals(Object other) {
        if (!(other instanceof C0723s) || this.f2742b != ((C0723s) other).f2742b || !this.f2741a.equals(((C0723s) other).f2741a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f2742b.hashCode() * 31) + this.f2741a.hashCode();
    }

    public String toString() {
        String returnValue = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2742b + "\n") + "    values:";
        for (String s : this.f2741a.keySet()) {
            returnValue = returnValue + "    " + s + ": " + this.f2741a.get(s) + "\n";
        }
        return returnValue;
    }
}
