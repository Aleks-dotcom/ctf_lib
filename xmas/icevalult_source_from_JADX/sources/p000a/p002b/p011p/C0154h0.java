package p000a.p002b.p011p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p000a.p002b.p009o.p010j.C0118p;

/* renamed from: a.b.p.h0 */
public abstract class C0154h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final float f858b;

    /* renamed from: c */
    public final int f859c;

    /* renamed from: d */
    public final int f860d;

    /* renamed from: e */
    public final View f861e;

    /* renamed from: f */
    public Runnable f862f;

    /* renamed from: g */
    public Runnable f863g;

    /* renamed from: h */
    public boolean f864h;

    /* renamed from: i */
    public int f865i;

    /* renamed from: j */
    public final int[] f866j = new int[2];

    /* renamed from: b */
    public abstract C0118p mo968b();

    /* renamed from: c */
    public abstract boolean mo969c();

    public C0154h0(View src) {
        this.f861e = src;
        src.setLongClickable(true);
        src.addOnAttachStateChangeListener(this);
        this.f858b = (float) ViewConfiguration.get(src.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f859c = tapTimeout;
        this.f860d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public boolean onTouch(View v, MotionEvent event) {
        boolean forwarding;
        MotionEvent motionEvent = event;
        boolean wasForwarding = this.f864h;
        if (wasForwarding) {
            forwarding = mo1096f(motionEvent) || !mo970d();
        } else {
            forwarding = mo1097g(motionEvent) && mo969c();
            if (forwarding) {
                long now = SystemClock.uptimeMillis();
                MotionEvent e = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                this.f861e.onTouchEvent(e);
                e.recycle();
            }
        }
        this.f864h = forwarding;
        if (forwarding || wasForwarding) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View v) {
    }

    public void onViewDetachedFromWindow(View v) {
        this.f864h = false;
        this.f865i = -1;
        Runnable runnable = this.f862f;
        if (runnable != null) {
            this.f861e.removeCallbacks(runnable);
        }
    }

    /* renamed from: d */
    public boolean mo970d() {
        C0118p popup = mo968b();
        if (popup == null || !popup.mo572a()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006f;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1097g(android.view.MotionEvent r9) {
        /*
            r8 = this;
            android.view.View r0 = r8.f861e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r9.getActionMasked()
            if (r1 == 0) goto L_0x0042
            r3 = 1
            if (r1 == r3) goto L_0x003e
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r3 = 3
            if (r1 == r3) goto L_0x003e
            goto L_0x006f
        L_0x001a:
            int r4 = r8.f865i
            int r4 = r9.findPointerIndex(r4)
            if (r4 < 0) goto L_0x006f
            float r5 = r9.getX(r4)
            float r6 = r9.getY(r4)
            float r7 = r8.f858b
            boolean r7 = m843h(r0, r5, r6, r7)
            if (r7 != 0) goto L_0x003d
            r8.mo1094a()
            android.view.ViewParent r2 = r0.getParent()
            r2.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            goto L_0x006f
        L_0x003e:
            r8.mo1094a()
            goto L_0x006f
        L_0x0042:
            int r3 = r9.getPointerId(r2)
            r8.f865i = r3
            java.lang.Runnable r3 = r8.f862f
            if (r3 != 0) goto L_0x0053
            a.b.p.h0$a r3 = new a.b.p.h0$a
            r3.<init>()
            r8.f862f = r3
        L_0x0053:
            java.lang.Runnable r3 = r8.f862f
            int r4 = r8.f859c
            long r4 = (long) r4
            r0.postDelayed(r3, r4)
            java.lang.Runnable r3 = r8.f863g
            if (r3 != 0) goto L_0x0066
            a.b.p.h0$b r3 = new a.b.p.h0$b
            r3.<init>()
            r8.f863g = r3
        L_0x0066:
            java.lang.Runnable r3 = r8.f863g
            int r4 = r8.f860d
            long r4 = (long) r4
            r0.postDelayed(r3, r4)
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0154h0.mo1097g(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo1094a() {
        Runnable runnable = this.f863g;
        if (runnable != null) {
            this.f861e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f862f;
        if (runnable2 != null) {
            this.f861e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: e */
    public void mo1095e() {
        mo1094a();
        View src = this.f861e;
        if (src.isEnabled() && !src.isLongClickable() && mo969c()) {
            src.getParent().requestDisallowInterceptTouchEvent(true);
            long now = SystemClock.uptimeMillis();
            MotionEvent e = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
            src.onTouchEvent(e);
            e.recycle();
            this.f864h = true;
        }
    }

    /* renamed from: f */
    public final boolean mo1096f(MotionEvent srcEvent) {
        C0147f0 dst;
        View src = this.f861e;
        C0118p popup = mo968b();
        if (popup == null || !popup.mo572a() || (dst = (C0147f0) popup.mo574f()) == null || !dst.isShown()) {
            return false;
        }
        MotionEvent dstEvent = MotionEvent.obtainNoHistory(srcEvent);
        mo1098i(src, dstEvent);
        mo1099j(dst, dstEvent);
        boolean handled = dst.mo1058e(dstEvent, this.f865i);
        dstEvent.recycle();
        int action = srcEvent.getActionMasked();
        boolean keepForwarding = (action == 1 || action == 3) ? false : true;
        if (!handled || !keepForwarding) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m843h(View view, float localX, float localY, float slop) {
        return localX >= (-slop) && localY >= (-slop) && localX < ((float) (view.getRight() - view.getLeft())) + slop && localY < ((float) (view.getBottom() - view.getTop())) + slop;
    }

    /* renamed from: j */
    public final boolean mo1099j(View view, MotionEvent event) {
        int[] loc = this.f866j;
        view.getLocationOnScreen(loc);
        event.offsetLocation((float) (-loc[0]), (float) (-loc[1]));
        return true;
    }

    /* renamed from: i */
    public final boolean mo1098i(View view, MotionEvent event) {
        int[] loc = this.f866j;
        view.getLocationOnScreen(loc);
        event.offsetLocation((float) loc[0], (float) loc[1]);
        return true;
    }

    /* renamed from: a.b.p.h0$a */
    public class C0155a implements Runnable {
        public C0155a() {
        }

        public void run() {
            ViewParent parent = C0154h0.this.f861e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: a.b.p.h0$b */
    public class C0156b implements Runnable {
        public C0156b() {
        }

        public void run() {
            C0154h0.this.mo1095e();
        }
    }
}
