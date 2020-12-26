package p066b.p067a.p068a.p069a.p092v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C1020k;
import p066b.p067a.p068a.p069a.p073d0.C0931b;
import p066b.p067a.p068a.p069a.p073d0.C0932c;

/* renamed from: b.a.a.a.v.c */
public final class C1065c {

    /* renamed from: a */
    public final C1064b f4481a;

    /* renamed from: b */
    public final C1064b f4482b;

    /* renamed from: c */
    public final C1064b f4483c;

    /* renamed from: d */
    public final C1064b f4484d;

    /* renamed from: e */
    public final C1064b f4485e;

    /* renamed from: f */
    public final C1064b f4486f;

    /* renamed from: g */
    public final C1064b f4487g;

    /* renamed from: h */
    public final Paint f4488h;

    public C1065c(Context context) {
        TypedArray calendarAttributes = context.obtainStyledAttributes(C0931b.m5071c(context, C0924b.materialCalendarStyle, C1069g.class.getCanonicalName()), C1020k.f4155O0);
        this.f4481a = C1064b.m5734a(context, calendarAttributes.getResourceId(C1020k.f4167R0, 0));
        this.f4487g = C1064b.m5734a(context, calendarAttributes.getResourceId(C1020k.f4159P0, 0));
        this.f4482b = C1064b.m5734a(context, calendarAttributes.getResourceId(C1020k.f4163Q0, 0));
        this.f4483c = C1064b.m5734a(context, calendarAttributes.getResourceId(C1020k.f4171S0, 0));
        ColorStateList rangeFillColorList = C0932c.m5073a(context, calendarAttributes, C1020k.f4175T0);
        this.f4484d = C1064b.m5734a(context, calendarAttributes.getResourceId(C1020k.f4183V0, 0));
        this.f4485e = C1064b.m5734a(context, calendarAttributes.getResourceId(C1020k.f4179U0, 0));
        this.f4486f = C1064b.m5734a(context, calendarAttributes.getResourceId(C1020k.f4187W0, 0));
        Paint paint = new Paint();
        this.f4488h = paint;
        paint.setColor(rangeFillColorList.getDefaultColor());
        calendarAttributes.recycle();
    }
}
