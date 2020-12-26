package p000a.p002b.p003k;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p000a.p002b.C0003a;

/* renamed from: a.b.k.b */
public class C0017b extends C0042g implements DialogInterface {

    /* renamed from: d */
    public final AlertController f239d = new AlertController(getContext(), this, getWindow());

    public C0017b(Context context, int themeResId) {
        super(context, m28i(context, themeResId));
    }

    /* renamed from: i */
    public static int m28i(Context context, int resid) {
        if (((resid >>> 24) & 255) >= 1) {
            return resid;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(C0003a.alertDialogTheme, outValue, true);
        return outValue.resourceId;
    }

    /* renamed from: h */
    public ListView mo30h() {
        return this.f239d.mo3834d();
    }

    public void setTitle(CharSequence title) {
        super.setTitle(title);
        this.f239d.mo3846q(title);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f239d.mo3835e();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (this.f239d.mo3836g(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (this.f239d.mo3837h(keyCode, event)) {
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }

    /* renamed from: a.b.k.b$a */
    public static class C0018a {

        /* renamed from: a */
        public final AlertController.C0770f f240a;

        /* renamed from: b */
        public final int f241b;

        public C0018a(Context context) {
            this(context, C0017b.m28i(context, 0));
        }

        public C0018a(Context context, int themeResId) {
            this.f240a = new AlertController.C0770f(new ContextThemeWrapper(context, C0017b.m28i(context, themeResId)));
            this.f241b = themeResId;
        }

        /* renamed from: b */
        public Context mo36b() {
            return this.f240a.f2964a;
        }

        /* renamed from: h */
        public C0018a mo42h(CharSequence title) {
            this.f240a.f2969f = title;
            return this;
        }

        /* renamed from: d */
        public C0018a mo38d(View customTitleView) {
            this.f240a.f2970g = customTitleView;
            return this;
        }

        /* renamed from: e */
        public C0018a mo39e(Drawable icon) {
            this.f240a.f2967d = icon;
            return this;
        }

        /* renamed from: f */
        public C0018a mo40f(DialogInterface.OnKeyListener onKeyListener) {
            this.f240a.f2984u = onKeyListener;
            return this;
        }

        /* renamed from: c */
        public C0018a mo37c(ListAdapter adapter, DialogInterface.OnClickListener listener) {
            AlertController.C0770f fVar = this.f240a;
            fVar.f2986w = adapter;
            fVar.f2987x = listener;
            return this;
        }

        /* renamed from: g */
        public C0018a mo41g(ListAdapter adapter, int checkedItem, DialogInterface.OnClickListener listener) {
            AlertController.C0770f fVar = this.f240a;
            fVar.f2986w = adapter;
            fVar.f2987x = listener;
            fVar.f2957I = checkedItem;
            fVar.f2956H = true;
            return this;
        }

        /* renamed from: a */
        public C0017b mo35a() {
            C0017b dialog = new C0017b(this.f240a.f2964a, this.f241b);
            this.f240a.mo3862a(dialog.f239d);
            dialog.setCancelable(this.f240a.f2981r);
            if (this.f240a.f2981r) {
                dialog.setCanceledOnTouchOutside(true);
            }
            dialog.setOnCancelListener(this.f240a.f2982s);
            dialog.setOnDismissListener(this.f240a.f2983t);
            DialogInterface.OnKeyListener onKeyListener = this.f240a.f2984u;
            if (onKeyListener != null) {
                dialog.setOnKeyListener(onKeyListener);
            }
            return dialog;
        }
    }
}
