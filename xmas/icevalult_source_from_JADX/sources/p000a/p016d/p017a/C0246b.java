package p000a.p016d.p017a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p000a.p016d.p017a.C0254h;

/* renamed from: a.d.a.b */
public class C0246b extends C0249d {

    /* renamed from: a.d.a.b$a */
    public class C0247a implements C0254h.C0255a {
        public C0247a(C0246b this$0) {
        }

        /* renamed from: a */
        public void mo1676a(Canvas canvas, RectF bounds, float cornerRadius, Paint paint) {
            canvas.drawRoundRect(bounds, cornerRadius, cornerRadius, paint);
        }
    }

    /* renamed from: l */
    public void mo1675l() {
        C0254h.f1181r = new C0247a(this);
    }
}
