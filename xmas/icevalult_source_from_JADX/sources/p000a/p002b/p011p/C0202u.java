package p000a.p002b.p011p;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000a.p002b.C0003a;

/* renamed from: a.b.p.u */
public class C0202u extends SeekBar {

    /* renamed from: b */
    public final C0204v f1039b;

    public C0202u(Context context, AttributeSet attrs) {
        this(context, attrs, C0003a.seekBarStyle);
    }

    public C0202u(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        C0204v vVar = new C0204v(this);
        this.f1039b = vVar;
        vVar.mo1405c(attrs, defStyleAttr);
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1039b.mo1427g(canvas);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1039b.mo1428h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1039b.mo1429i();
    }
}
