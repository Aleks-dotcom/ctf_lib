package p000a.p002b.p011p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: a.b.p.b */
public class C0128b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f791a;

    public C0128b(ActionBarContainer container) {
        this.f791a = container;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f791a;
        if (actionBarContainer.f3046i) {
            Drawable drawable = actionBarContainer.f3045h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f3043f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f791a;
        Drawable drawable3 = actionBarContainer2.f3044g;
        if (drawable3 != null && actionBarContainer2.f3047j) {
            drawable3.draw(canvas);
        }
    }

    public void setAlpha(int alpha) {
    }

    public void setColorFilter(ColorFilter cf) {
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f791a;
        if (actionBarContainer.f3046i) {
            Drawable drawable = actionBarContainer.f3045h;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f3043f;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }
}
