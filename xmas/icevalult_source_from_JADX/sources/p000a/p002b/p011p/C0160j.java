package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p000a.p002b.C0003a;
import p000a.p002b.C0005c;
import p000a.p002b.C0007e;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p002b.p011p.C0176m0;
import p000a.p025h.p029f.C0356a;

/* renamed from: a.b.p.j */
public final class C0160j {

    /* renamed from: b */
    public static final PorterDuff.Mode f892b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C0160j f893c;

    /* renamed from: a */
    public C0176m0 f894a;

    /* renamed from: h */
    public static synchronized void m885h() {
        synchronized (C0160j.class) {
            if (f893c == null) {
                C0160j jVar = new C0160j();
                f893c = jVar;
                jVar.f894a = C0176m0.m948h();
                f893c.f894a.mo1262u(new C0161a());
            }
        }
    }

    /* renamed from: a.b.p.j$a */
    public static class C0161a implements C0176m0.C0181e {

        /* renamed from: a */
        public final int[] f895a = {C0007e.abc_textfield_search_default_mtrl_alpha, C0007e.abc_textfield_default_mtrl_alpha, C0007e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f896b = {C0007e.abc_ic_commit_search_api_mtrl_alpha, C0007e.abc_seekbar_tick_mark_material, C0007e.abc_ic_menu_share_mtrl_alpha, C0007e.abc_ic_menu_copy_mtrl_am_alpha, C0007e.abc_ic_menu_cut_mtrl_alpha, C0007e.abc_ic_menu_selectall_mtrl_alpha, C0007e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f897c = {C0007e.abc_textfield_activated_mtrl_alpha, C0007e.abc_textfield_search_activated_mtrl_alpha, C0007e.abc_cab_background_top_mtrl_alpha, C0007e.abc_text_cursor_material, C0007e.abc_text_select_handle_left_mtrl_dark, C0007e.abc_text_select_handle_middle_mtrl_dark, C0007e.abc_text_select_handle_right_mtrl_dark, C0007e.abc_text_select_handle_left_mtrl_light, C0007e.abc_text_select_handle_middle_mtrl_light, C0007e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        public final int[] f898d = {C0007e.abc_popup_background_mtrl_mult, C0007e.abc_cab_background_internal_bg, C0007e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f899e = {C0007e.abc_tab_indicator_material, C0007e.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f900f = {C0007e.abc_btn_check_material, C0007e.abc_btn_radio_material, C0007e.abc_btn_check_material_anim, C0007e.abc_btn_radio_material_anim};

        /* renamed from: j */
        public final ColorStateList mo1178j(Context context) {
            return mo1176h(context, C0197r0.m1039b(context, C0003a.colorButtonNormal));
        }

        /* renamed from: g */
        public final ColorStateList mo1175g(Context context) {
            return mo1176h(context, 0);
        }

        /* renamed from: i */
        public final ColorStateList mo1177i(Context context) {
            return mo1176h(context, C0197r0.m1039b(context, C0003a.colorAccent));
        }

        /* renamed from: h */
        public final ColorStateList mo1176h(Context context, int baseColor) {
            int[][] states = new int[4][];
            int[] colors = new int[4];
            int colorControlHighlight = C0197r0.m1039b(context, C0003a.f7v);
            int disabledColor = C0197r0.m1038a(context, C0003a.colorButtonNormal);
            states[0] = C0197r0.f1025b;
            colors[0] = disabledColor;
            int i = 0 + 1;
            states[i] = C0197r0.f1027d;
            colors[i] = C0356a.m1847b(colorControlHighlight, baseColor);
            int i2 = i + 1;
            states[i2] = C0197r0.f1026c;
            colors[i2] = C0356a.m1847b(colorControlHighlight, baseColor);
            int i3 = i2 + 1;
            states[i3] = C0197r0.f1029f;
            colors[i3] = baseColor;
            int i4 = i3 + 1;
            return new ColorStateList(states, colors);
        }

        /* renamed from: k */
        public final ColorStateList mo1179k(Context context) {
            int[][] states = new int[3][];
            int[] colors = new int[3];
            int i = C0003a.colorSwitchThumbNormal;
            ColorStateList thumbColor = C0197r0.m1041d(context, i);
            if (thumbColor == null || !thumbColor.isStateful()) {
                states[0] = C0197r0.f1025b;
                colors[0] = C0197r0.m1038a(context, i);
                int i2 = 0 + 1;
                states[i2] = C0197r0.f1028e;
                colors[i2] = C0197r0.m1039b(context, C0003a.f6u);
                int i3 = i2 + 1;
                states[i3] = C0197r0.f1029f;
                colors[i3] = C0197r0.m1039b(context, i);
                int i4 = i3 + 1;
            } else {
                states[0] = C0197r0.f1025b;
                colors[0] = thumbColor.getColorForState(states[0], 0);
                int i5 = 0 + 1;
                states[i5] = C0197r0.f1028e;
                colors[i5] = C0197r0.m1039b(context, C0003a.f6u);
                int i6 = i5 + 1;
                states[i6] = C0197r0.f1029f;
                colors[i6] = thumbColor.getDefaultColor();
                int i7 = i6 + 1;
            }
            return new ColorStateList(states, colors);
        }

        /* renamed from: a */
        public Drawable mo1169a(C0176m0 resourceManager, Context context, int resId) {
            if (resId != C0007e.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{resourceManager.mo1254j(context, C0007e.abc_cab_background_internal_bg), resourceManager.mo1254j(context, C0007e.abc_cab_background_top_mtrl_alpha)});
        }

        /* renamed from: l */
        public final void mo1180l(Drawable d, int color, PorterDuff.Mode mode) {
            if (C0145e0.m824a(d)) {
                d = d.mutate();
            }
            d.setColorFilter(C0160j.m884e(color, mode == null ? C0160j.f892b : mode));
        }

        /* renamed from: d */
        public boolean mo1172d(Context context, int resId, Drawable drawable) {
            if (resId == C0007e.abc_seekbar_track_material) {
                LayerDrawable ld = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = ld.findDrawableByLayerId(16908288);
                int i = C0003a.colorControlNormal;
                mo1180l(findDrawableByLayerId, C0197r0.m1039b(context, i), C0160j.f892b);
                mo1180l(ld.findDrawableByLayerId(16908303), C0197r0.m1039b(context, i), C0160j.f892b);
                mo1180l(ld.findDrawableByLayerId(16908301), C0197r0.m1039b(context, C0003a.f6u), C0160j.f892b);
                return true;
            } else if (resId != C0007e.abc_ratingbar_material && resId != C0007e.abc_ratingbar_indicator_material && resId != C0007e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable ld2 = (LayerDrawable) drawable;
                mo1180l(ld2.findDrawableByLayerId(16908288), C0197r0.m1038a(context, C0003a.colorControlNormal), C0160j.f892b);
                Drawable findDrawableByLayerId2 = ld2.findDrawableByLayerId(16908303);
                int i2 = C0003a.f6u;
                mo1180l(findDrawableByLayerId2, C0197r0.m1039b(context, i2), C0160j.f892b);
                mo1180l(ld2.findDrawableByLayerId(16908301), C0197r0.m1039b(context, i2), C0160j.f892b);
                return true;
            }
        }

        /* renamed from: f */
        public final boolean mo1174f(int[] array, int value) {
            for (int id : array) {
                if (id == value) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public ColorStateList mo1170b(Context context, int resId) {
            if (resId == C0007e.abc_edit_text_material) {
                return C0053a.m276c(context, C0005c.abc_tint_edittext);
            }
            if (resId == C0007e.abc_switch_track_mtrl_alpha) {
                return C0053a.m276c(context, C0005c.abc_tint_switch_track);
            }
            if (resId == C0007e.abc_switch_thumb_material) {
                return mo1179k(context);
            }
            if (resId == C0007e.abc_btn_default_mtrl_shape) {
                return mo1178j(context);
            }
            if (resId == C0007e.abc_btn_borderless_material) {
                return mo1175g(context);
            }
            if (resId == C0007e.abc_btn_colored_material) {
                return mo1177i(context);
            }
            if (resId == C0007e.abc_spinner_mtrl_am_alpha || resId == C0007e.abc_spinner_textfield_background_material) {
                return C0053a.m276c(context, C0005c.abc_tint_spinner);
            }
            if (mo1174f(this.f896b, resId)) {
                return C0197r0.m1041d(context, C0003a.colorControlNormal);
            }
            if (mo1174f(this.f899e, resId)) {
                return C0053a.m276c(context, C0005c.abc_tint_default);
            }
            if (mo1174f(this.f900f, resId)) {
                return C0053a.m276c(context, C0005c.abc_tint_btn_checkable);
            }
            if (resId == C0007e.abc_seekbar_thumb_material) {
                return C0053a.m276c(context, C0005c.abc_tint_seek_thumb);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo1171c(Context context, int resId, Drawable drawable) {
            PorterDuff.Mode tintMode = C0160j.f892b;
            boolean colorAttrSet = false;
            int colorAttr = 0;
            int alpha = -1;
            if (mo1174f(this.f895a, resId)) {
                colorAttr = C0003a.colorControlNormal;
                colorAttrSet = true;
            } else if (mo1174f(this.f897c, resId)) {
                colorAttr = C0003a.f6u;
                colorAttrSet = true;
            } else if (mo1174f(this.f898d, resId)) {
                colorAttr = 16842801;
                colorAttrSet = true;
                tintMode = PorterDuff.Mode.MULTIPLY;
            } else if (resId == C0007e.abc_list_divider_mtrl_alpha) {
                colorAttr = 16842800;
                colorAttrSet = true;
                alpha = Math.round(40.8f);
            } else if (resId == C0007e.abc_dialog_material_background) {
                colorAttr = 16842801;
                colorAttrSet = true;
            }
            if (!colorAttrSet) {
                return false;
            }
            if (C0145e0.m824a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(C0160j.m884e(C0197r0.m1039b(context, colorAttr), tintMode));
            if (alpha == -1) {
                return true;
            }
            drawable.setAlpha(alpha);
            return true;
        }

        /* renamed from: e */
        public PorterDuff.Mode mo1173e(int resId) {
            if (resId == C0007e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized C0160j m883b() {
        C0160j jVar;
        synchronized (C0160j.class) {
            if (f893c == null) {
                m885h();
            }
            jVar = f893c;
        }
        return jVar;
    }

    /* renamed from: c */
    public synchronized Drawable mo1165c(Context context, int resId) {
        return this.f894a.mo1254j(context, resId);
    }

    /* renamed from: d */
    public synchronized Drawable mo1166d(Context context, int resId, boolean failIfNotKnown) {
        return this.f894a.mo1255k(context, resId, failIfNotKnown);
    }

    /* renamed from: g */
    public synchronized void mo1168g(Context context) {
        this.f894a.mo1260s(context);
    }

    /* renamed from: f */
    public synchronized ColorStateList mo1167f(Context context, int resId) {
        return this.f894a.mo1256m(context, resId);
    }

    /* renamed from: i */
    public static void m886i(Drawable drawable, C0203u0 tint, int[] state) {
        C0176m0.m952w(drawable, tint, state);
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m884e(int color, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C0160j.class) {
            l = C0176m0.m949l(color, mode);
        }
        return l;
    }
}
