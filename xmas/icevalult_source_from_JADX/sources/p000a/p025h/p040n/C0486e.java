package p000a.p025h.p040n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: a.h.n.e */
public class C0486e {
    /* renamed from: a */
    public static ColorStateList m2415a(ImageView view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getImageTintList();
        }
        if (view instanceof C0494l) {
            return ((C0494l) view).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: c */
    public static void m2417c(ImageView view, ColorStateList tintList) {
        Drawable imageViewDrawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setImageTintList(tintList);
            if (i == 21 && (imageViewDrawable = view.getDrawable()) != null && view.getImageTintList() != null) {
                if (imageViewDrawable.isStateful()) {
                    imageViewDrawable.setState(view.getDrawableState());
                }
                view.setImageDrawable(imageViewDrawable);
            }
        } else if (view instanceof C0494l) {
            ((C0494l) view).setSupportImageTintList(tintList);
        }
    }

    /* renamed from: b */
    public static PorterDuff.Mode m2416b(ImageView view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getImageTintMode();
        }
        if (view instanceof C0494l) {
            return ((C0494l) view).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: d */
    public static void m2418d(ImageView view, PorterDuff.Mode mode) {
        Drawable imageViewDrawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setImageTintMode(mode);
            if (i == 21 && (imageViewDrawable = view.getDrawable()) != null && view.getImageTintList() != null) {
                if (imageViewDrawable.isStateful()) {
                    imageViewDrawable.setState(view.getDrawableState());
                }
                view.setImageDrawable(imageViewDrawable);
            }
        } else if (view instanceof C0494l) {
            ((C0494l) view).setSupportImageTintMode(mode);
        }
    }
}
