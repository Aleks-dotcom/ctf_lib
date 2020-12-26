package p000a.p025h.p038m.p039a0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p000a.p019f.p022b.C0317h;
import p000a.p025h.C0324b;
import p000a.p025h.p038m.p039a0.C0432f;

/* renamed from: a.h.m.a0.c */
public class C0424c {

    /* renamed from: d */
    public static int f1995d = 0;

    /* renamed from: a */
    public final AccessibilityNodeInfo f1996a;

    /* renamed from: b */
    public int f1997b = -1;

    /* renamed from: c */
    public int f1998c = -1;

    /* renamed from: a.h.m.a0.c$a */
    public static class C0425a {

        /* renamed from: e */
        public static final C0425a f1999e = new C0425a(16, (CharSequence) null);

        /* renamed from: f */
        public static final C0425a f2000f = new C0425a(262144, (CharSequence) null);

        /* renamed from: g */
        public static final C0425a f2001g = new C0425a(524288, (CharSequence) null);

        /* renamed from: h */
        public static final C0425a f2002h = new C0425a(1048576, (CharSequence) null);

        /* renamed from: a */
        public final Object f2003a;

        /* renamed from: b */
        public final int f2004b;

        /* renamed from: c */
        public final Class<? extends C0432f.C0433a> f2005c;

        /* renamed from: d */
        public final C0432f f2006d;

        static {
            Class<C0432f.C0435c> cls = C0432f.C0435c.class;
            Class<C0432f.C0434b> cls2 = C0432f.C0434b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new C0425a(1, (CharSequence) null);
            new C0425a(2, (CharSequence) null);
            new C0425a(4, (CharSequence) null);
            new C0425a(8, (CharSequence) null);
            new C0425a(32, (CharSequence) null);
            new C0425a(64, (CharSequence) null);
            new C0425a(128, (CharSequence) null);
            new C0425a(256, (CharSequence) null, cls2);
            new C0425a(512, (CharSequence) null, cls2);
            new C0425a(1024, (CharSequence) null, cls);
            new C0425a(2048, (CharSequence) null, cls);
            new C0425a(4096, (CharSequence) null);
            new C0425a(8192, (CharSequence) null);
            new C0425a(16384, (CharSequence) null);
            new C0425a(32768, (CharSequence) null);
            new C0425a(65536, (CharSequence) null);
            new C0425a(131072, (CharSequence) null, C0432f.C0439g.class);
            new C0425a(2097152, (CharSequence) null, C0432f.C0440h.class);
            int i = Build.VERSION.SDK_INT;
            new C0425a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (C0432f) null, (Class<? extends C0432f.C0433a>) null);
            new C0425a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (C0432f) null, C0432f.C0437e.class);
            new C0425a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C0432f) null, (Class<? extends C0432f.C0433a>) null);
            new C0425a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (C0432f) null, (Class<? extends C0432f.C0433a>) null);
            new C0425a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C0432f) null, (Class<? extends C0432f.C0433a>) null);
            new C0425a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (C0432f) null, (Class<? extends C0432f.C0433a>) null);
            new C0425a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (C0432f) null, (Class<? extends C0432f.C0433a>) null);
            new C0425a(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (C0432f) null, C0432f.C0438f.class);
            new C0425a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C0432f) null, C0432f.C0436d.class);
            new C0425a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C0432f) null, (Class<? extends C0432f.C0433a>) null);
            if (i >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new C0425a(accessibilityAction, 16908357, (CharSequence) null, (C0432f) null, (Class<? extends C0432f.C0433a>) null);
        }

        public C0425a(int actionId, CharSequence label) {
            this((Object) null, actionId, label, (C0432f) null, (Class<? extends C0432f.C0433a>) null);
        }

        public C0425a(int actionId, CharSequence label, Class<? extends C0432f.C0433a> viewCommandArgumentClass) {
            this((Object) null, actionId, label, (C0432f) null, viewCommandArgumentClass);
        }

        public C0425a(Object action, int id, CharSequence label, C0432f command, Class<? extends C0432f.C0433a> viewCommandArgumentClass) {
            this.f2004b = id;
            this.f2006d = command;
            if (Build.VERSION.SDK_INT < 21 || action != null) {
                this.f2003a = action;
            } else {
                this.f2003a = new AccessibilityNodeInfo.AccessibilityAction(id, label);
            }
            this.f2005c = viewCommandArgumentClass;
        }

        /* renamed from: b */
        public int mo2510b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2003a).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public boolean mo2511c(View view, Bundle arguments) {
            String className;
            if (this.f2006d == null) {
                return false;
            }
            C0432f.C0433a viewCommandArgument = null;
            Class<? extends C0432f.C0433a> cls = this.f2005c;
            if (cls != null) {
                try {
                    viewCommandArgument = (C0432f.C0433a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    viewCommandArgument.mo2522a(arguments);
                } catch (Exception e) {
                    Class<? extends C0432f.C0433a> cls2 = this.f2005c;
                    if (cls2 == null) {
                        className = "null";
                    } else {
                        className = cls2.getName();
                    }
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + className, e);
                }
            }
            return this.f2006d.mo2521a(view, viewCommandArgument);
        }

        /* renamed from: a */
        public C0425a mo2509a(CharSequence label, C0432f command) {
            return new C0425a((Object) null, this.f2004b, label, command, this.f2005c);
        }
    }

    /* renamed from: a.h.m.a0.c$b */
    public static class C0426b {

        /* renamed from: a */
        public final Object f2007a;

        /* renamed from: a */
        public static C0426b m2151a(int rowCount, int columnCount, boolean hierarchical, int selectionMode) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                return new C0426b(AccessibilityNodeInfo.CollectionInfo.obtain(rowCount, columnCount, hierarchical, selectionMode));
            }
            if (i >= 19) {
                return new C0426b(AccessibilityNodeInfo.CollectionInfo.obtain(rowCount, columnCount, hierarchical));
            }
            return new C0426b((Object) null);
        }

        public C0426b(Object info) {
            this.f2007a = info;
        }
    }

    /* renamed from: a.h.m.a0.c$c */
    public static class C0427c {

        /* renamed from: a */
        public final Object f2008a;

        /* renamed from: a */
        public static C0427c m2152a(int rowIndex, int rowSpan, int columnIndex, int columnSpan, boolean heading, boolean selected) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                return new C0427c(AccessibilityNodeInfo.CollectionItemInfo.obtain(rowIndex, rowSpan, columnIndex, columnSpan, heading, selected));
            }
            if (i >= 19) {
                return new C0427c(AccessibilityNodeInfo.CollectionItemInfo.obtain(rowIndex, rowSpan, columnIndex, columnSpan, heading));
            }
            return new C0427c((Object) null);
        }

        public C0427c(Object info) {
            this.f2008a = info;
        }
    }

    public C0424c(AccessibilityNodeInfo info) {
        this.f1996a = info;
    }

    /* renamed from: s0 */
    public static C0424c m2082s0(AccessibilityNodeInfo info) {
        return new C0424c(info);
    }

    /* renamed from: r0 */
    public AccessibilityNodeInfo mo2499r0() {
        return this.f1996a;
    }

    /* renamed from: K */
    public static C0424c m2078K(View source) {
        return m2082s0(AccessibilityNodeInfo.obtain(source));
    }

    /* renamed from: J */
    public static C0424c m2077J() {
        return m2082s0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: L */
    public static C0424c m2079L(C0424c info) {
        return m2082s0(AccessibilityNodeInfo.obtain(info.f1996a));
    }

    /* renamed from: o0 */
    public void mo2493o0(View root, int virtualDescendantId) {
        this.f1998c = virtualDescendantId;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1996a.setSource(root, virtualDescendantId);
        }
    }

    /* renamed from: m */
    public int mo2489m() {
        return this.f1996a.getChildCount();
    }

    /* renamed from: c */
    public void mo2468c(View root, int virtualDescendantId) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1996a.addChild(root, virtualDescendantId);
        }
    }

    /* renamed from: i */
    public int mo2481i() {
        return this.f1996a.getActions();
    }

    /* renamed from: a */
    public void mo2464a(int action) {
        this.f1996a.addAction(action);
    }

    /* renamed from: g */
    public final List<Integer> mo2477g(String key) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> list = this.f1996a.getExtras().getIntegerArrayList(key);
        if (list != null) {
            return list;
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        this.f1996a.getExtras().putIntegerArrayList(key, list2);
        return list2;
    }

    /* renamed from: b */
    public void mo2466b(C0425a action) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1996a.addAction((AccessibilityNodeInfo.AccessibilityAction) action.f2003a);
        }
    }

    /* renamed from: M */
    public boolean mo2450M(int action, Bundle arguments) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f1996a.performAction(action, arguments);
        }
        return false;
    }

    /* renamed from: j0 */
    public void mo2484j0(View parent) {
        this.f1997b = -1;
        this.f1996a.setParent(parent);
    }

    /* renamed from: k0 */
    public void mo2486k0(View root, int virtualDescendantId) {
        this.f1997b = virtualDescendantId;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1996a.setParent(root, virtualDescendantId);
        }
    }

    /* renamed from: k */
    public void mo2485k(Rect outBounds) {
        this.f1996a.getBoundsInParent(outBounds);
    }

    /* renamed from: R */
    public void mo2455R(Rect bounds) {
        this.f1996a.setBoundsInParent(bounds);
    }

    /* renamed from: l */
    public void mo2487l(Rect outBounds) {
        this.f1996a.getBoundsInScreen(outBounds);
    }

    /* renamed from: S */
    public void mo2456S(Rect bounds) {
        this.f1996a.setBoundsInScreen(bounds);
    }

    /* renamed from: y */
    public boolean mo2507y() {
        return this.f1996a.isCheckable();
    }

    /* renamed from: T */
    public void mo2457T(boolean checkable) {
        this.f1996a.setCheckable(checkable);
    }

    /* renamed from: z */
    public boolean mo2508z() {
        return this.f1996a.isChecked();
    }

    /* renamed from: U */
    public void mo2458U(boolean checked) {
        this.f1996a.setChecked(checked);
    }

    /* renamed from: C */
    public boolean mo2443C() {
        return this.f1996a.isFocusable();
    }

    /* renamed from: d0 */
    public void mo2471d0(boolean focusable) {
        this.f1996a.setFocusable(focusable);
    }

    /* renamed from: D */
    public boolean mo2444D() {
        return this.f1996a.isFocused();
    }

    /* renamed from: e0 */
    public void mo2473e0(boolean focused) {
        this.f1996a.setFocused(focused);
    }

    /* renamed from: q0 */
    public void mo2497q0(boolean visibleToUser) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1996a.setVisibleToUser(visibleToUser);
        }
    }

    /* renamed from: P */
    public void mo2453P(boolean focused) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1996a.setAccessibilityFocused(focused);
        }
    }

    /* renamed from: H */
    public boolean mo2448H() {
        return this.f1996a.isSelected();
    }

    /* renamed from: A */
    public boolean mo2441A() {
        return this.f1996a.isClickable();
    }

    /* renamed from: W */
    public void mo2460W(boolean clickable) {
        this.f1996a.setClickable(clickable);
    }

    /* renamed from: E */
    public boolean mo2445E() {
        return this.f1996a.isLongClickable();
    }

    /* renamed from: B */
    public boolean mo2442B() {
        return this.f1996a.isEnabled();
    }

    /* renamed from: b0 */
    public void mo2467b0(boolean enabled) {
        this.f1996a.setEnabled(enabled);
    }

    /* renamed from: F */
    public boolean mo2446F() {
        return this.f1996a.isPassword();
    }

    /* renamed from: G */
    public boolean mo2447G() {
        return this.f1996a.isScrollable();
    }

    /* renamed from: m0 */
    public void mo2490m0(boolean scrollable) {
        this.f1996a.setScrollable(scrollable);
    }

    /* renamed from: s */
    public CharSequence mo2500s() {
        return this.f1996a.getPackageName();
    }

    /* renamed from: h0 */
    public void mo2479h0(CharSequence packageName) {
        this.f1996a.setPackageName(packageName);
    }

    /* renamed from: n */
    public CharSequence mo2491n() {
        return this.f1996a.getClassName();
    }

    /* renamed from: V */
    public void mo2459V(CharSequence className) {
        this.f1996a.setClassName(className);
    }

    /* renamed from: u */
    public CharSequence mo2503u() {
        if (!mo2505w()) {
            return this.f1996a.getText();
        }
        List<Integer> starts = mo2477g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> ends = mo2477g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> flags = mo2477g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> ids = mo2477g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        Spannable spannable = new SpannableString(TextUtils.substring(this.f1996a.getText(), 0, this.f1996a.getText().length()));
        for (int i = 0; i < starts.size(); i++) {
            spannable.setSpan(new C0422a(ids.get(i).intValue(), this, mo2496q().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), starts.get(i).intValue(), ends.get(i).intValue(), flags.get(i).intValue());
        }
        return spannable;
    }

    /* renamed from: p0 */
    public void mo2495p0(CharSequence text) {
        this.f1996a.setText(text);
    }

    /* renamed from: e */
    public void mo2472e(CharSequence text, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            mo2475f();
            mo2452O(view);
            ClickableSpan[] spans = m2081o(text);
            if (spans != null && spans.length > 0) {
                mo2496q().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C0324b.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> tagSpans = mo2498r(view);
                int i2 = 0;
                while (spans != null && i2 < spans.length) {
                    int id = mo2506x(spans[i2], tagSpans);
                    tagSpans.put(id, new WeakReference(spans[i2]));
                    mo2470d(spans[i2], (Spanned) text, id);
                    i2++;
                }
            }
        }
    }

    /* renamed from: r */
    public final SparseArray<WeakReference<ClickableSpan>> mo2498r(View host) {
        SparseArray<WeakReference<ClickableSpan>> spans = mo2501t(host);
        if (spans != null) {
            return spans;
        }
        SparseArray<WeakReference<ClickableSpan>> spans2 = new SparseArray<>();
        host.setTag(C0324b.tag_accessibility_clickable_spans, spans2);
        return spans2;
    }

    /* renamed from: t */
    public final SparseArray<WeakReference<ClickableSpan>> mo2501t(View host) {
        return (SparseArray) host.getTag(C0324b.tag_accessibility_clickable_spans);
    }

    /* renamed from: o */
    public static ClickableSpan[] m2081o(CharSequence text) {
        if (text instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: x */
    public final int mo2506x(ClickableSpan span, SparseArray<WeakReference<ClickableSpan>> spans) {
        if (spans != null) {
            for (int i = 0; i < spans.size(); i++) {
                if (span.equals((ClickableSpan) spans.valueAt(i).get())) {
                    return spans.keyAt(i);
                }
            }
        }
        int i2 = f1995d;
        f1995d = i2 + 1;
        return i2;
    }

    /* renamed from: w */
    public final boolean mo2505w() {
        return !mo2477g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: f */
    public final void mo2475f() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1996a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f1996a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f1996a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f1996a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: d */
    public final void mo2470d(ClickableSpan span, Spanned spanned, int id) {
        mo2477g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(span)));
        mo2477g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(span)));
        mo2477g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(span)));
        mo2477g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(id));
    }

    /* renamed from: O */
    public final void mo2452O(View view) {
        SparseArray<WeakReference<ClickableSpan>> spans = mo2501t(view);
        if (spans != null) {
            List<Integer> toBeRemovedIndices = new ArrayList<>();
            for (int i = 0; i < spans.size(); i++) {
                if (spans.valueAt(i).get() == null) {
                    toBeRemovedIndices.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < toBeRemovedIndices.size(); i2++) {
                spans.remove(toBeRemovedIndices.get(i2).intValue());
            }
        }
    }

    /* renamed from: p */
    public CharSequence mo2494p() {
        return this.f1996a.getContentDescription();
    }

    /* renamed from: Z */
    public void mo2463Z(CharSequence contentDescription) {
        this.f1996a.setContentDescription(contentDescription);
    }

    /* renamed from: N */
    public void mo2451N() {
        this.f1996a.recycle();
    }

    /* renamed from: v */
    public String mo2504v() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f1996a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: X */
    public void mo2461X(Object collectionInfo) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1996a.setCollectionInfo(collectionInfo == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0426b) collectionInfo).f2007a);
        }
    }

    /* renamed from: Y */
    public void mo2462Y(Object collectionItemInfo) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1996a.setCollectionItemInfo(collectionItemInfo == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0427c) collectionItemInfo).f2008a);
        }
    }

    /* renamed from: a0 */
    public void mo2465a0(boolean contentInvalid) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1996a.setContentInvalid(contentInvalid);
        }
    }

    /* renamed from: g0 */
    public void mo2478g0(CharSequence hintText) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f1996a.setHintText(hintText);
        } else if (i >= 19) {
            this.f1996a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", hintText);
        }
    }

    /* renamed from: c0 */
    public void mo2469c0(CharSequence error) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1996a.setError(error);
        }
    }

    /* renamed from: q */
    public Bundle mo2496q() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f1996a.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: i0 */
    public void mo2482i0(CharSequence paneTitle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f1996a.setPaneTitle(paneTitle);
        } else if (i >= 19) {
            this.f1996a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", paneTitle);
        }
    }

    /* renamed from: l0 */
    public void mo2488l0(boolean screenReaderFocusable) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1996a.setScreenReaderFocusable(screenReaderFocusable);
        } else {
            mo2454Q(1, screenReaderFocusable);
        }
    }

    /* renamed from: I */
    public boolean mo2449I() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f1996a.isShowingHintText();
        }
        return mo2483j(4);
    }

    /* renamed from: n0 */
    public void mo2492n0(boolean showingHintText) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1996a.setShowingHintText(showingHintText);
        } else {
            mo2454Q(4, showingHintText);
        }
    }

    /* renamed from: f0 */
    public void mo2476f0(boolean isHeading) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1996a.setHeading(isHeading);
        } else {
            mo2454Q(2, isHeading);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1996a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0424c other = (C0424c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1996a;
        if (accessibilityNodeInfo == null) {
            if (other.f1996a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(other.f1996a)) {
            return false;
        }
        if (this.f1998c == other.f1998c && this.f1997b == other.f1997b) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        Rect bounds = new Rect();
        mo2485k(bounds);
        builder.append("; boundsInParent: " + bounds);
        mo2487l(bounds);
        builder.append("; boundsInScreen: " + bounds);
        builder.append("; packageName: ");
        builder.append(mo2500s());
        builder.append("; className: ");
        builder.append(mo2491n());
        builder.append("; text: ");
        builder.append(mo2503u());
        builder.append("; contentDescription: ");
        builder.append(mo2494p());
        builder.append("; viewId: ");
        builder.append(mo2504v());
        builder.append("; checkable: ");
        builder.append(mo2507y());
        builder.append("; checked: ");
        builder.append(mo2508z());
        builder.append("; focusable: ");
        builder.append(mo2443C());
        builder.append("; focused: ");
        builder.append(mo2444D());
        builder.append("; selected: ");
        builder.append(mo2448H());
        builder.append("; clickable: ");
        builder.append(mo2441A());
        builder.append("; longClickable: ");
        builder.append(mo2445E());
        builder.append("; enabled: ");
        builder.append(mo2442B());
        builder.append("; password: ");
        builder.append(mo2446F());
        builder.append("; scrollable: " + mo2447G());
        builder.append("; [");
        int actionBits = mo2481i();
        while (actionBits != 0) {
            int action = 1 << Integer.numberOfTrailingZeros(actionBits);
            actionBits &= ~action;
            builder.append(m2080h(action));
            if (actionBits != 0) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /* renamed from: Q */
    public final void mo2454Q(int property, boolean value) {
        Bundle extras = mo2496q();
        if (extras != null) {
            int i = 0;
            int booleanProperties = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~property);
            if (value) {
                i = property;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | booleanProperties);
        }
    }

    /* renamed from: j */
    public final boolean mo2483j(int property) {
        Bundle extras = mo2496q();
        if (extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & property) == property) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static String m2080h(int action) {
        if (action == 1) {
            return "ACTION_FOCUS";
        }
        if (action == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (action) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case C0317h.f1726p1:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }
}
