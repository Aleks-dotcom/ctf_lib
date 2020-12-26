package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.C0909a;
import p066b.p067a.p068a.p069a.p081l.C1030h;
import p066b.p067a.p068a.p069a.p081l.C1032j;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    public Map<View, Integer> f4963i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* renamed from: e0 */
    public FabTransformationBehavior.C1190e mo7180e0(Context context, boolean expanded) {
        int specRes;
        if (expanded) {
            specRes = C0909a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            specRes = C0909a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C1190e spec = new FabTransformationBehavior.C1190e();
        spec.f4957a = C1030h.m5433c(context, specRes);
        spec.f4958b = new C1032j(17, 0.0f, 0.0f);
        return spec;
    }

    /* renamed from: H */
    public boolean mo7156H(View dependency, View child, boolean expanded, boolean animated) {
        mo7191g0(child, expanded);
        return super.mo7156H(dependency, child, expanded, animated);
    }

    /* renamed from: g0 */
    public final void mo7191g0(View sheet, boolean expanded) {
        int i = Build.VERSION.SDK_INT;
        ViewParent viewParent = sheet.getParent();
        if (viewParent instanceof CoordinatorLayout) {
            CoordinatorLayout parent = (CoordinatorLayout) viewParent;
            int childCount = parent.getChildCount();
            if (i >= 16 && expanded) {
                this.f4963i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View child = parent.getChildAt(i2);
                boolean hasScrimBehavior = (child.getLayoutParams() instanceof CoordinatorLayout.C0827f) && (((CoordinatorLayout.C0827f) child.getLayoutParams()).mo4448f() instanceof FabTransformationScrimBehavior);
                if (child != sheet && !hasScrimBehavior) {
                    if (!expanded) {
                        Map<View, Integer> map = this.f4963i;
                        if (map != null && map.containsKey(child)) {
                            C0460r.m2275l0(child, this.f4963i.get(child).intValue());
                        }
                    } else {
                        if (i >= 16) {
                            this.f4963i.put(child, Integer.valueOf(child.getImportantForAccessibility()));
                        }
                        C0460r.m2275l0(child, 4);
                    }
                }
            }
            if (!expanded) {
                this.f4963i = null;
            }
        }
    }
}
