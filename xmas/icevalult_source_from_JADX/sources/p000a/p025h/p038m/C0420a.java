package p000a.p025h.p038m;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p000a.p025h.C0324b;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p025h.p038m.p039a0.C0428d;

/* renamed from: a.h.m.a */
public class C0420a {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f1988c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f1989a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f1990b;

    /* renamed from: a.h.m.a$a */
    public static final class C0421a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C0420a f1991a;

        public C0421a(C0420a compat) {
            this.f1991a = compat;
        }

        public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            return this.f1991a.mo2419a(host, event);
        }

        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            this.f1991a.mo2423f(host, event);
        }

        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
            C0424c nodeInfoCompat = C0424c.m2082s0(info);
            nodeInfoCompat.mo2488l0(C0460r.m2238M(host));
            nodeInfoCompat.mo2476f0(C0460r.m2233H(host));
            nodeInfoCompat.mo2482i0(C0460r.m2272k(host));
            this.f1991a.mo2424g(host, nodeInfoCompat);
            nodeInfoCompat.mo2472e(info.getText(), host);
            List<C0424c.C0425a> c = C0420a.m2062c(host);
            for (int i = 0; i < c.size(); i++) {
                nodeInfoCompat.mo2466b(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            this.f1991a.mo2425h(host, event);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
            return this.f1991a.mo2426i(host, child, event);
        }

        public void sendAccessibilityEvent(View host, int eventType) {
            this.f1991a.mo2429l(host, eventType);
        }

        public void sendAccessibilityEventUnchecked(View host, AccessibilityEvent event) {
            this.f1991a.mo2430m(host, event);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View host) {
            C0428d provider = this.f1991a.mo2420b(host);
            if (provider != null) {
                return (AccessibilityNodeProvider) provider.mo2515d();
            }
            return null;
        }

        public boolean performAccessibilityAction(View host, int action, Bundle args) {
            return this.f1991a.mo2427j(host, action, args);
        }
    }

    public C0420a() {
        this(f1988c);
    }

    public C0420a(View.AccessibilityDelegate originalDelegate) {
        this.f1989a = originalDelegate;
        this.f1990b = new C0421a(this);
    }

    /* renamed from: d */
    public View.AccessibilityDelegate mo2421d() {
        return this.f1990b;
    }

    /* renamed from: l */
    public void mo2429l(View host, int eventType) {
        this.f1989a.sendAccessibilityEvent(host, eventType);
    }

    /* renamed from: m */
    public void mo2430m(View host, AccessibilityEvent event) {
        this.f1989a.sendAccessibilityEventUnchecked(host, event);
    }

    /* renamed from: a */
    public boolean mo2419a(View host, AccessibilityEvent event) {
        return this.f1989a.dispatchPopulateAccessibilityEvent(host, event);
    }

    /* renamed from: h */
    public void mo2425h(View host, AccessibilityEvent event) {
        this.f1989a.onPopulateAccessibilityEvent(host, event);
    }

    /* renamed from: f */
    public void mo2423f(View host, AccessibilityEvent event) {
        this.f1989a.onInitializeAccessibilityEvent(host, event);
    }

    /* renamed from: g */
    public void mo2424g(View host, C0424c info) {
        this.f1989a.onInitializeAccessibilityNodeInfo(host, info.mo2499r0());
    }

    /* renamed from: i */
    public boolean mo2426i(ViewGroup host, View child, AccessibilityEvent event) {
        return this.f1989a.onRequestSendAccessibilityEvent(host, child, event);
    }

    /* renamed from: b */
    public C0428d mo2420b(View host) {
        Object provider;
        if (Build.VERSION.SDK_INT < 16 || (provider = this.f1989a.getAccessibilityNodeProvider(host)) == null) {
            return null;
        }
        return new C0428d(provider);
    }

    /* renamed from: j */
    public boolean mo2427j(View host, int action, Bundle args) {
        boolean success = false;
        List<C0424c.C0425a> c = m2062c(host);
        int i = 0;
        while (true) {
            if (i >= c.size()) {
                break;
            }
            C0424c.C0425a actionCompat = c.get(i);
            if (actionCompat.mo2510b() == action) {
                success = actionCompat.mo2511c(host, args);
                break;
            }
            i++;
        }
        if (!success && Build.VERSION.SDK_INT >= 16) {
            success = this.f1989a.performAccessibilityAction(host, action, args);
        }
        if (success || action != C0324b.accessibility_action_clickable_span) {
            return success;
        }
        return mo2428k(args.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), host);
    }

    /* renamed from: k */
    public final boolean mo2428k(int clickableSpanId, View host) {
        WeakReference<ClickableSpan> reference;
        SparseArray<WeakReference<ClickableSpan>> spans = (SparseArray) host.getTag(C0324b.tag_accessibility_clickable_spans);
        if (spans == null || (reference = spans.get(clickableSpanId)) == null) {
            return false;
        }
        ClickableSpan span = (ClickableSpan) reference.get();
        if (!mo2422e(span, host)) {
            return false;
        }
        span.onClick(host);
        return true;
    }

    /* renamed from: e */
    public final boolean mo2422e(ClickableSpan span, View view) {
        if (span == null) {
            return false;
        }
        ClickableSpan[] spans = C0424c.m2081o(view.createAccessibilityNodeInfo().getText());
        int i = 0;
        while (spans != null && i < spans.length) {
            if (span.equals(spans[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: c */
    public static List<C0424c.C0425a> m2062c(View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = (List) view.getTag(C0324b.tag_accessibility_actions);
        return actions == null ? Collections.emptyList() : actions;
    }
}
