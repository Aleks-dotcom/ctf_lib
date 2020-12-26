package p000a.p019f.p022b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: a.f.b.f */
public class C0315f extends View {

    /* renamed from: b */
    public int f1619b;

    /* renamed from: c */
    public View f1620c;

    /* renamed from: d */
    public int f1621d;

    public void setEmptyVisibility(int visibility) {
        this.f1621d = visibility;
    }

    public int getEmptyVisibility() {
        return this.f1621d;
    }

    public View getContent() {
        return this.f1620c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect r = new Rect();
            canvas.getClipBounds(r);
            paint.setTextSize((float) r.height());
            int cHeight = r.height();
            int cWidth = r.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, "?".length(), r);
            canvas.drawText("?", ((((float) cWidth) / 2.0f) - (((float) r.width()) / 2.0f)) - ((float) r.left), ((((float) cHeight) / 2.0f) + (((float) r.height()) / 2.0f)) - ((float) r.bottom), paint);
        }
    }

    /* renamed from: b */
    public void mo2200b(ConstraintLayout container) {
        if (this.f1619b == -1 && !isInEditMode()) {
            setVisibility(this.f1621d);
        }
        View findViewById = container.findViewById(this.f1619b);
        this.f1620c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0820a) findViewById.getLayoutParams()).f3297Z = true;
            this.f1620c.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int id) {
        View v;
        if (this.f1619b != id) {
            View view = this.f1620c;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C0820a) this.f1620c.getLayoutParams()).f3297Z = false;
                this.f1620c = null;
            }
            this.f1619b = id;
            if (id != -1 && (v = ((View) getParent()).findViewById(id)) != null) {
                v.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public void mo2199a(ConstraintLayout container) {
        if (this.f1620c != null) {
            ConstraintLayout.C0820a layoutParams = (ConstraintLayout.C0820a) getLayoutParams();
            ConstraintLayout.C0820a layoutParamsContent = (ConstraintLayout.C0820a) this.f1620c.getLayoutParams();
            layoutParamsContent.f3319k0.mo2093x0(0);
            layoutParams.f3319k0.mo2095y0(layoutParamsContent.f3319k0.mo2022D());
            layoutParams.f3319k0.mo2050b0(layoutParamsContent.f3319k0.mo2079r());
            layoutParamsContent.f3319k0.mo2093x0(8);
        }
    }
}
