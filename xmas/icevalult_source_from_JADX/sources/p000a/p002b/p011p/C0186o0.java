package p000a.p002b.p011p;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.b.p.o0 */
public class C0186o0 {

    /* renamed from: a */
    public int f970a = 0;

    /* renamed from: b */
    public int f971b = 0;

    /* renamed from: c */
    public int f972c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d */
    public int f973d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e */
    public int f974e = 0;

    /* renamed from: f */
    public int f975f = 0;

    /* renamed from: g */
    public boolean f976g = false;

    /* renamed from: h */
    public boolean f977h = false;

    /* renamed from: b */
    public int mo1331b() {
        return this.f970a;
    }

    /* renamed from: c */
    public int mo1332c() {
        return this.f971b;
    }

    /* renamed from: d */
    public int mo1333d() {
        return this.f976g ? this.f971b : this.f970a;
    }

    /* renamed from: a */
    public int mo1330a() {
        return this.f976g ? this.f970a : this.f971b;
    }

    /* renamed from: g */
    public void mo1336g(int start, int end) {
        this.f972c = start;
        this.f973d = end;
        this.f977h = true;
        if (this.f976g) {
            if (end != Integer.MIN_VALUE) {
                this.f970a = end;
            }
            if (start != Integer.MIN_VALUE) {
                this.f971b = start;
                return;
            }
            return;
        }
        if (start != Integer.MIN_VALUE) {
            this.f970a = start;
        }
        if (end != Integer.MIN_VALUE) {
            this.f971b = end;
        }
    }

    /* renamed from: e */
    public void mo1334e(int left, int right) {
        this.f977h = false;
        if (left != Integer.MIN_VALUE) {
            this.f974e = left;
            this.f970a = left;
        }
        if (right != Integer.MIN_VALUE) {
            this.f975f = right;
            this.f971b = right;
        }
    }

    /* renamed from: f */
    public void mo1335f(boolean isRtl) {
        if (isRtl != this.f976g) {
            this.f976g = isRtl;
            if (!this.f977h) {
                this.f970a = this.f974e;
                this.f971b = this.f975f;
            } else if (isRtl) {
                int i = this.f973d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f974e;
                }
                this.f970a = i;
                int i2 = this.f972c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f975f;
                }
                this.f971b = i2;
            } else {
                int i3 = this.f972c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f974e;
                }
                this.f970a = i3;
                int i4 = this.f973d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f975f;
                }
                this.f971b = i4;
            }
        }
    }
}
