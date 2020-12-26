package p000a.p058q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.q.z */
public class C0731z implements C0663b0 {

    /* renamed from: a */
    public C0732a f2755a;

    public C0731z(Context context, ViewGroup hostView, View requestingView) {
        this.f2755a = new C0732a(context, hostView, requestingView, this);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.ViewGroup m3564f(android.view.View r3) {
        /*
            r0 = r3
        L_0x0001:
            if (r0 == 0) goto L_0x0024
            int r1 = r0.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L_0x0014
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0014
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            return r1
        L_0x0014:
            android.view.ViewParent r1 = r0.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0001
            android.view.ViewParent r1 = r0.getParent()
            r0 = r1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x0001
        L_0x0024:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p058q.C0731z.m3564f(android.view.View):android.view.ViewGroup");
    }

    /* renamed from: e */
    public static C0731z m3563e(View view) {
        ViewGroup contentView = m3564f(view);
        if (contentView == null) {
            return null;
        }
        int numChildren = contentView.getChildCount();
        for (int i = 0; i < numChildren; i++) {
            View child = contentView.getChildAt(i);
            if (child instanceof C0732a) {
                return ((C0732a) child).f2759e;
            }
        }
        return new C0725u(contentView.getContext(), contentView, view);
    }

    /* renamed from: d */
    public void mo3437d(Drawable drawable) {
        this.f2755a.mo3603a(drawable);
    }

    /* renamed from: b */
    public void mo3436b(Drawable drawable) {
        this.f2755a.mo3610f(drawable);
    }

    /* renamed from: a.q.z$a */
    public static class C0732a extends ViewGroup {

        /* renamed from: b */
        public ViewGroup f2756b;

        /* renamed from: c */
        public View f2757c;

        /* renamed from: d */
        public ArrayList<Drawable> f2758d = null;

        /* renamed from: e */
        public C0731z f2759e;

        /* renamed from: f */
        public boolean f2760f;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException e) {
            }
        }

        public C0732a(Context context, ViewGroup hostView, View requestingView, C0731z viewOverlay) {
            super(context);
            this.f2756b = hostView;
            this.f2757c = requestingView;
            setRight(hostView.getWidth());
            setBottom(hostView.getHeight());
            hostView.addView(this);
            this.f2759e = viewOverlay;
        }

        public boolean dispatchTouchEvent(MotionEvent ev) {
            return false;
        }

        /* renamed from: a */
        public void mo3603a(Drawable drawable) {
            mo3605c();
            if (this.f2758d == null) {
                this.f2758d = new ArrayList<>();
            }
            if (!this.f2758d.contains(drawable)) {
                this.f2758d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: f */
        public void mo3610f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f2758d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                mo3606d();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f2758d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f2758d
                if (r0 == 0) goto L_0x0011
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r0 = 0
                goto L_0x0014
            L_0x0013:
                r0 = 1
            L_0x0014:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p058q.C0731z.C0732a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: b */
        public void mo3604b(View child) {
            mo3605c();
            if (child.getParent() instanceof ViewGroup) {
                ViewGroup parent = (ViewGroup) child.getParent();
                if (!(parent == this.f2756b || parent.getParent() == null || !C0460r.m2234I(parent))) {
                    int[] parentLocation = new int[2];
                    int[] hostViewLocation = new int[2];
                    parent.getLocationOnScreen(parentLocation);
                    this.f2756b.getLocationOnScreen(hostViewLocation);
                    C0460r.m2240O(child, parentLocation[0] - hostViewLocation[0]);
                    C0460r.m2241P(child, parentLocation[1] - hostViewLocation[1]);
                }
                parent.removeView(child);
                if (child.getParent() != null) {
                    parent.removeView(child);
                }
            }
            super.addView(child);
        }

        /* renamed from: g */
        public void mo3611g(View view) {
            super.removeView(view);
            mo3606d();
        }

        /* renamed from: c */
        public final void mo3605c() {
            if (this.f2760f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        public final void mo3606d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f2758d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f2760f = true;
                    this.f2756b.removeView(this);
                }
            }
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        public void dispatchDraw(Canvas canvas) {
            int[] contentViewLocation = new int[2];
            int[] hostViewLocation = new int[2];
            this.f2756b.getLocationOnScreen(contentViewLocation);
            this.f2757c.getLocationOnScreen(hostViewLocation);
            int numDrawables = 0;
            canvas.translate((float) (hostViewLocation[0] - contentViewLocation[0]), (float) (hostViewLocation[1] - contentViewLocation[1]));
            canvas.clipRect(new Rect(0, 0, this.f2757c.getWidth(), this.f2757c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f2758d;
            if (arrayList != null) {
                numDrawables = arrayList.size();
            }
            for (int i = 0; i < numDrawables; i++) {
                this.f2758d.get(i).draw(canvas);
            }
        }

        public void onLayout(boolean changed, int l, int t, int r, int b) {
        }

        /* renamed from: e */
        public final void mo3609e(int[] offset) {
            int[] contentViewLocation = new int[2];
            int[] hostViewLocation = new int[2];
            this.f2756b.getLocationOnScreen(contentViewLocation);
            this.f2757c.getLocationOnScreen(hostViewLocation);
            offset[0] = hostViewLocation[0] - contentViewLocation[0];
            offset[1] = hostViewLocation[1] - contentViewLocation[1];
        }

        public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
            if (this.f2756b == null) {
                return null;
            }
            dirty.offset(location[0], location[1]);
            if (this.f2756b instanceof ViewGroup) {
                location[0] = 0;
                location[1] = 0;
                int[] offset = new int[2];
                mo3609e(offset);
                dirty.offset(offset[0], offset[1]);
                return super.invalidateChildInParent(location, dirty);
            }
            invalidate(dirty);
            return null;
        }
    }
}
