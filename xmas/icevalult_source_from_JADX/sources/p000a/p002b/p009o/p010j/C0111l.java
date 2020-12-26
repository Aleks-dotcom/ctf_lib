package p000a.p002b.p009o.p010j;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import p000a.p002b.p009o.p010j.C0113m;
import p000a.p025h.p038m.C0444c;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.b.o.j.l */
public class C0111l {

    /* renamed from: a */
    public final Context f720a;

    /* renamed from: b */
    public final C0098g f721b;

    /* renamed from: c */
    public final boolean f722c;

    /* renamed from: d */
    public final int f723d;

    /* renamed from: e */
    public final int f724e;

    /* renamed from: f */
    public View f725f;

    /* renamed from: g */
    public int f726g;

    /* renamed from: h */
    public boolean f727h;

    /* renamed from: i */
    public C0113m.C0114a f728i;

    /* renamed from: j */
    public C0110k f729j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f730k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f731l;

    public C0111l(Context context, C0098g menu, View anchorView, boolean overflowOnly, int popupStyleAttr) {
        this(context, menu, anchorView, overflowOnly, popupStyleAttr, 0);
    }

    public C0111l(Context context, C0098g menu, View anchorView, boolean overflowOnly, int popupStyleAttr, int popupStyleRes) {
        this.f726g = 8388611;
        this.f731l = new C0112a();
        this.f720a = context;
        this.f721b = menu;
        this.f725f = anchorView;
        this.f722c = overflowOnly;
        this.f723d = popupStyleAttr;
        this.f724e = popupStyleRes;
    }

    /* renamed from: i */
    public void mo840i(PopupWindow.OnDismissListener listener) {
        this.f730k = listener;
    }

    /* renamed from: f */
    public void mo837f(View anchor) {
        this.f725f = anchor;
    }

    /* renamed from: g */
    public void mo838g(boolean forceShowIcon) {
        this.f727h = forceShowIcon;
        C0110k kVar = this.f729j;
        if (kVar != null) {
            kVar.mo582r(forceShowIcon);
        }
    }

    /* renamed from: h */
    public void mo839h(int gravity) {
        this.f726g = gravity;
    }

    /* renamed from: k */
    public void mo842k() {
        if (!mo844m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: c */
    public C0110k mo834c() {
        if (this.f729j == null) {
            this.f729j = mo832a();
        }
        return this.f729j;
    }

    /* renamed from: m */
    public boolean mo844m() {
        if (mo835d()) {
            return true;
        }
        if (this.f725f == null) {
            return false;
        }
        mo843l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean mo845n(int x, int y) {
        if (mo835d()) {
            return true;
        }
        if (this.f725f == null) {
            return false;
        }
        mo843l(x, y, true, true);
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [a.b.o.j.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000a.p002b.p009o.p010j.C0110k mo832a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f720a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r1 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 17
            if (r3 < r4) goto L_0x001d
            r1.getRealSize(r2)
            goto L_0x0020
        L_0x001d:
            r1.getSize(r2)
        L_0x0020:
            int r3 = r2.x
            int r4 = r2.y
            int r3 = java.lang.Math.min(r3, r4)
            android.content.Context r4 = r14.f720a
            android.content.res.Resources r4 = r4.getResources()
            int r5 = p000a.p002b.C0006d.abc_cascading_menus_min_smallest_width
            int r4 = r4.getDimensionPixelSize(r5)
            if (r3 < r4) goto L_0x0038
            r5 = 1
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x004c
            a.b.o.j.d r12 = new a.b.o.j.d
            android.content.Context r7 = r14.f720a
            android.view.View r8 = r14.f725f
            int r9 = r14.f723d
            int r10 = r14.f724e
            boolean r11 = r14.f722c
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x005e
        L_0x004c:
            a.b.o.j.q r6 = new a.b.o.j.q
            android.content.Context r8 = r14.f720a
            a.b.o.j.g r9 = r14.f721b
            android.view.View r10 = r14.f725f
            int r11 = r14.f723d
            int r12 = r14.f724e
            boolean r13 = r14.f722c
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            a.b.o.j.g r7 = r14.f721b
            r6.mo577l(r7)
            android.widget.PopupWindow$OnDismissListener r7 = r14.f731l
            r6.mo585u(r7)
            android.view.View r7 = r14.f725f
            r6.mo581p(r7)
            a.b.o.j.m$a r7 = r14.f728i
            r6.mo548d(r7)
            boolean r7 = r14.f727h
            r6.mo582r(r7)
            int r7 = r14.f726g
            r6.mo583s(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p009o.p010j.C0111l.mo832a():a.b.o.j.k");
    }

    /* renamed from: l */
    public final void mo843l(int xOffset, int yOffset, boolean useOffsets, boolean showTitle) {
        C0110k popup = mo834c();
        popup.mo586v(showTitle);
        if (useOffsets) {
            if ((C0444c.m2174b(this.f726g, C0460r.m2292v(this.f725f)) & 7) == 5) {
                xOffset -= this.f725f.getWidth();
            }
            popup.mo584t(xOffset);
            popup.mo587w(yOffset);
            int halfSize = (int) ((48.0f * this.f720a.getResources().getDisplayMetrics().density) / 2.0f);
            popup.mo831q(new Rect(xOffset - halfSize, yOffset - halfSize, xOffset + halfSize, yOffset + halfSize));
        }
        popup.mo576j();
    }

    /* renamed from: b */
    public void mo833b() {
        if (mo835d()) {
            this.f729j.dismiss();
        }
    }

    /* renamed from: e */
    public void mo836e() {
        this.f729j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f730k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public boolean mo835d() {
        C0110k kVar = this.f729j;
        return kVar != null && kVar.mo572a();
    }

    /* renamed from: j */
    public void mo841j(C0113m.C0114a cb) {
        this.f728i = cb;
        C0110k kVar = this.f729j;
        if (kVar != null) {
            kVar.mo548d(cb);
        }
    }

    /* renamed from: a.b.o.j.l$a */
    public class C0112a implements PopupWindow.OnDismissListener {
        public C0112a() {
        }

        public void onDismiss() {
            C0111l.this.mo836e();
        }
    }
}
