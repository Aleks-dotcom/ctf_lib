package p000a.p019f.p022b;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: a.f.b.e */
public class C0314e extends View {
    public C0314e(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setVisibility(int visibility) {
    }

    public void draw(Canvas canvas) {
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int margin) {
        ConstraintLayout.C0820a params = (ConstraintLayout.C0820a) getLayoutParams();
        params.f3298a = margin;
        setLayoutParams(params);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.C0820a params = (ConstraintLayout.C0820a) getLayoutParams();
        params.f3300b = margin;
        setLayoutParams(params);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.C0820a params = (ConstraintLayout.C0820a) getLayoutParams();
        params.f3302c = ratio;
        setLayoutParams(params);
    }
}
