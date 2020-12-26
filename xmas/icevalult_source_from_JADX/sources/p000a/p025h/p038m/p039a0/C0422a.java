package p000a.p025h.p038m.p039a0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: a.h.m.a0.a */
public final class C0422a extends ClickableSpan {

    /* renamed from: b */
    public final int f1992b;

    /* renamed from: c */
    public final C0424c f1993c;

    /* renamed from: d */
    public final int f1994d;

    public C0422a(int originalClickableSpanId, C0424c nodeInfoCompat, int clickableSpanActionId) {
        this.f1992b = originalClickableSpanId;
        this.f1993c = nodeInfoCompat;
        this.f1994d = clickableSpanActionId;
    }

    public void onClick(View unused) {
        Bundle arguments = new Bundle();
        arguments.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1992b);
        this.f1993c.mo2450M(this.f1994d, arguments);
    }
}
