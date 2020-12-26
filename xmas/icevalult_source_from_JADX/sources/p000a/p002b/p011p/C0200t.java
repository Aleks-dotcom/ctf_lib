package p000a.p002b.p011p;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p000a.p002b.C0003a;

/* renamed from: a.b.p.t */
public class C0200t extends RatingBar {

    /* renamed from: b */
    public final C0196r f1034b;

    public C0200t(Context context, AttributeSet attrs) {
        this(context, attrs, C0003a.ratingBarStyle);
    }

    public C0200t(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        C0196r rVar = new C0196r(this);
        this.f1034b = rVar;
        rVar.mo1405c(attrs, defStyleAttr);
    }

    public synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Bitmap sampleTile = this.f1034b.mo1404b();
        if (sampleTile != null) {
            setMeasuredDimension(View.resolveSizeAndState(sampleTile.getWidth() * getNumStars(), widthMeasureSpec, 0), getMeasuredHeight());
        }
    }
}
