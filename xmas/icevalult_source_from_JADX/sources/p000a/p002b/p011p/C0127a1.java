package p000a.p002b.p011p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p000a.p002b.C0006d;
import p000a.p002b.C0008f;
import p000a.p002b.C0009g;
import p000a.p002b.C0011i;

/* renamed from: a.b.p.a1 */
public class C0127a1 {

    /* renamed from: a */
    public final Context f784a;

    /* renamed from: b */
    public final View f785b;

    /* renamed from: c */
    public final TextView f786c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f787d;

    /* renamed from: e */
    public final Rect f788e = new Rect();

    /* renamed from: f */
    public final int[] f789f = new int[2];

    /* renamed from: g */
    public final int[] f790g = new int[2];

    public C0127a1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f787d = layoutParams;
        this.f784a = context;
        View inflate = LayoutInflater.from(context).inflate(C0009g.abc_tooltip, (ViewGroup) null);
        this.f785b = inflate;
        this.f786c = (TextView) inflate.findViewById(C0008f.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0011i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: e */
    public void mo941e(View anchorView, int anchorX, int anchorY, boolean fromTouch, CharSequence tooltipText) {
        if (mo940d()) {
            mo939c();
        }
        this.f786c.setText(tooltipText);
        mo938a(anchorView, anchorX, anchorY, fromTouch, this.f787d);
        ((WindowManager) this.f784a.getSystemService("window")).addView(this.f785b, this.f787d);
    }

    /* renamed from: c */
    public void mo939c() {
        if (mo940d()) {
            ((WindowManager) this.f784a.getSystemService("window")).removeView(this.f785b);
        }
    }

    /* renamed from: d */
    public boolean mo940d() {
        return this.f785b.getParent() != null;
    }

    /* renamed from: a */
    public final void mo938a(View anchorView, int anchorX, int anchorY, boolean fromTouch, WindowManager.LayoutParams outParams) {
        int offsetX;
        int offsetBelow;
        int offsetExtra;
        int statusBarHeight;
        WindowManager.LayoutParams layoutParams = outParams;
        layoutParams.token = anchorView.getApplicationWindowToken();
        int tooltipPreciseAnchorThreshold = this.f784a.getResources().getDimensionPixelOffset(C0006d.tooltip_precise_anchor_threshold);
        if (anchorView.getWidth() >= tooltipPreciseAnchorThreshold) {
            offsetX = anchorX;
        } else {
            offsetX = anchorView.getWidth() / 2;
        }
        if (anchorView.getHeight() >= tooltipPreciseAnchorThreshold) {
            int offsetExtra2 = this.f784a.getResources().getDimensionPixelOffset(C0006d.tooltip_precise_anchor_extra_offset);
            offsetBelow = anchorY + offsetExtra2;
            offsetExtra = anchorY - offsetExtra2;
        } else {
            offsetBelow = anchorView.getHeight();
            offsetExtra = 0;
        }
        layoutParams.gravity = 49;
        int tooltipOffset = this.f784a.getResources().getDimensionPixelOffset(fromTouch ? C0006d.tooltip_y_offset_touch : C0006d.tooltip_y_offset_non_touch);
        View appView = m731b(anchorView);
        if (appView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        appView.getWindowVisibleDisplayFrame(this.f788e);
        Rect rect = this.f788e;
        if (rect.left < 0 && rect.top < 0) {
            Resources res = this.f784a.getResources();
            int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId != 0) {
                statusBarHeight = res.getDimensionPixelSize(resourceId);
            } else {
                statusBarHeight = 0;
            }
            DisplayMetrics metrics = res.getDisplayMetrics();
            this.f788e.set(0, statusBarHeight, metrics.widthPixels, metrics.heightPixels);
        }
        appView.getLocationOnScreen(this.f790g);
        anchorView.getLocationOnScreen(this.f789f);
        int[] iArr = this.f789f;
        int i = iArr[0];
        int[] iArr2 = this.f790g;
        iArr[0] = i - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + offsetX) - (appView.getWidth() / 2);
        int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f785b.measure(spec, spec);
        int tooltipHeight = this.f785b.getMeasuredHeight();
        int[] iArr3 = this.f789f;
        int yAbove = ((iArr3[1] + offsetExtra) - tooltipOffset) - tooltipHeight;
        int yBelow = iArr3[1] + offsetBelow + tooltipOffset;
        if (fromTouch) {
            if (yAbove >= 0) {
                layoutParams.y = yAbove;
            } else {
                layoutParams.y = yBelow;
            }
        } else if (yBelow + tooltipHeight <= this.f788e.height()) {
            layoutParams.y = yBelow;
        } else {
            layoutParams.y = yAbove;
        }
    }

    /* renamed from: b */
    public static View m731b(View anchorView) {
        View rootView = anchorView.getRootView();
        ViewGroup.LayoutParams lp = rootView.getLayoutParams();
        if ((lp instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) lp).type == 2) {
            return rootView;
        }
        for (Context context = anchorView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
