package p000a.p025h.p038m.p039a0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a.h.m.a0.d */
public class C0428d {

    /* renamed from: a */
    public final Object f2009a;

    /* renamed from: a.h.m.a0.d$a */
    public static class C0429a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C0428d f2010a;

        public C0429a(C0428d compat) {
            this.f2010a = compat;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
            C0424c compatInfo = this.f2010a.mo2512a(virtualViewId);
            if (compatInfo == null) {
                return null;
            }
            return compatInfo.mo2499r0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String text, int virtualViewId) {
            List<C0424c> b = this.f2010a.mo2513b(text, virtualViewId);
            if (b == null) {
                return null;
            }
            List<AccessibilityNodeInfo> infoList = new ArrayList<>();
            int infoCount = b.size();
            for (int i = 0; i < infoCount; i++) {
                infoList.add(b.get(i).mo2499r0());
            }
            return infoList;
        }

        public boolean performAction(int virtualViewId, int action, Bundle arguments) {
            return this.f2010a.mo2516e(virtualViewId, action, arguments);
        }
    }

    /* renamed from: a.h.m.a0.d$b */
    public static class C0430b extends C0429a {
        public C0430b(C0428d compat) {
            super(compat);
        }

        public AccessibilityNodeInfo findFocus(int focus) {
            C0424c compatInfo = this.f2010a.mo2514c(focus);
            if (compatInfo == null) {
                return null;
            }
            return compatInfo.mo2499r0();
        }
    }

    public C0428d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            this.f2009a = new C0430b(this);
        } else if (i >= 16) {
            this.f2009a = new C0429a(this);
        } else {
            this.f2009a = null;
        }
    }

    public C0428d(Object provider) {
        this.f2009a = provider;
    }

    /* renamed from: d */
    public Object mo2515d() {
        return this.f2009a;
    }

    /* renamed from: a */
    public C0424c mo2512a(int virtualViewId) {
        return null;
    }

    /* renamed from: e */
    public boolean mo2516e(int virtualViewId, int action, Bundle arguments) {
        return false;
    }

    /* renamed from: b */
    public List<C0424c> mo2513b(String text, int virtualViewId) {
        return null;
    }

    /* renamed from: c */
    public C0424c mo2514c(int focus) {
        return null;
    }
}
