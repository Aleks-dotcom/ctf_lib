package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C0989j;
import p066b.p067a.p068a.p069a.C1020k;
import p066b.p067a.p068a.p069a.p070a0.C0913c;
import p066b.p067a.p068a.p069a.p070a0.C0921g;

public class ChipGroup extends C0913c {

    /* renamed from: e */
    public int f4789e;

    /* renamed from: f */
    public int f4790f;

    /* renamed from: g */
    public boolean f4791g;

    /* renamed from: h */
    public C1160d f4792h;

    /* renamed from: i */
    public final C1158b f4793i;

    /* renamed from: j */
    public C1161e f4794j;

    /* renamed from: k */
    public int f4795k;

    /* renamed from: l */
    public boolean f4796l;

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C1160d {
        /* renamed from: a */
        void mo6812a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C1159c extends ViewGroup.MarginLayoutParams {
        public C1159c(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public C1159c(ViewGroup.LayoutParams source) {
            super(source);
        }

        public C1159c(int width, int height) {
            super(width, height);
        }
    }

    public ChipGroup(Context context, AttributeSet attrs) {
        this(context, attrs, C0924b.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f4793i = new C1158b();
        this.f4794j = new C1161e();
        this.f4795k = -1;
        this.f4796l = false;
        TypedArray a = C0921g.m5054k(context, attrs, C1020k.f4213c0, defStyleAttr, C0989j.Widget_MaterialComponents_ChipGroup, new int[0]);
        int chipSpacing = a.getDimensionPixelOffset(C1020k.f4223e0, 0);
        setChipSpacingHorizontal(a.getDimensionPixelOffset(C1020k.f4228f0, chipSpacing));
        setChipSpacingVertical(a.getDimensionPixelOffset(C1020k.f4233g0, chipSpacing));
        setSingleLine(a.getBoolean(C1020k.f4237h0, false));
        setSingleSelection(a.getBoolean(C1020k.f4241i0, false));
        int checkedChip = a.getResourceId(C1020k.f4218d0, -1);
        if (checkedChip != -1) {
            this.f4795k = checkedChip;
        }
        a.recycle();
        super.setOnHierarchyChangeListener(this.f4794j);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new C1159c(getContext(), attrs);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
        return new C1159c(lp);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1159c(-2, -2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return super.checkLayoutParams(p) && (p instanceof C1159c);
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f4794j.f4798a = listener;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f4795k;
        if (i != -1) {
            mo6793k(i, true);
            setCheckedId(this.f4795k);
        }
    }

    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (child instanceof Chip) {
            Chip chip = (Chip) child;
            if (chip.isChecked()) {
                int i = this.f4795k;
                if (i != -1 && this.f4791g) {
                    mo6793k(i, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(child, index, params);
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable divider) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable divider) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerHorizontal(int dividerMode) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int dividerMode) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int flexWrap) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public int getCheckedChipId() {
        if (this.f4791g) {
            return this.f4795k;
        }
        return -1;
    }

    /* renamed from: j */
    public void mo6792j() {
        this.f4796l = true;
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            if (child instanceof Chip) {
                ((Chip) child).setChecked(false);
            }
        }
        this.f4796l = false;
        setCheckedId(-1);
    }

    public void setOnCheckedChangeListener(C1160d listener) {
        this.f4792h = listener;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int checkedId) {
        this.f4795k = checkedId;
        C1160d dVar = this.f4792h;
        if (dVar != null && this.f4791g) {
            dVar.mo6812a(this, checkedId);
        }
    }

    /* renamed from: k */
    public final void mo6793k(int viewId, boolean checked) {
        View checkedView = findViewById(viewId);
        if (checkedView instanceof Chip) {
            this.f4796l = true;
            ((Chip) checkedView).setChecked(checked);
            this.f4796l = false;
        }
    }

    public void setChipSpacing(int chipSpacing) {
        setChipSpacingHorizontal(chipSpacing);
        setChipSpacingVertical(chipSpacing);
    }

    public void setChipSpacingResource(int id) {
        setChipSpacing(getResources().getDimensionPixelOffset(id));
    }

    public int getChipSpacingHorizontal() {
        return this.f4789e;
    }

    public void setChipSpacingHorizontal(int chipSpacingHorizontal) {
        if (this.f4789e != chipSpacingHorizontal) {
            this.f4789e = chipSpacingHorizontal;
            setItemSpacing(chipSpacingHorizontal);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int id) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(id));
    }

    public int getChipSpacingVertical() {
        return this.f4790f;
    }

    public void setChipSpacingVertical(int chipSpacingVertical) {
        if (this.f4790f != chipSpacingVertical) {
            this.f4790f = chipSpacingVertical;
            setLineSpacing(chipSpacingVertical);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int id) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(id));
    }

    /* renamed from: b */
    public boolean mo5488b() {
        return super.mo5488b();
    }

    public void setSingleLine(boolean singleLine) {
        super.setSingleLine(singleLine);
    }

    public void setSingleLine(int id) {
        setSingleLine(getResources().getBoolean(id));
    }

    public void setSingleSelection(boolean singleSelection) {
        if (this.f4791g != singleSelection) {
            this.f4791g = singleSelection;
            mo6792j();
        }
    }

    public void setSingleSelection(int id) {
        setSingleSelection(getResources().getBoolean(id));
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C1158b implements CompoundButton.OnCheckedChangeListener {
        public C1158b() {
        }

        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (!ChipGroup.this.f4796l) {
                int id = buttonView.getId();
                if (isChecked) {
                    if (!(ChipGroup.this.f4795k == -1 || ChipGroup.this.f4795k == id || !ChipGroup.this.f4791g)) {
                        ChipGroup chipGroup = ChipGroup.this;
                        chipGroup.mo6793k(chipGroup.f4795k, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                } else if (ChipGroup.this.f4795k == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    public class C1161e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        public ViewGroup.OnHierarchyChangeListener f4798a;

        public C1161e() {
        }

        public void onChildViewAdded(View parent, View child) {
            int id;
            if (parent == ChipGroup.this && (child instanceof Chip)) {
                if (child.getId() == -1) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        id = View.generateViewId();
                    } else {
                        id = child.hashCode();
                    }
                    child.setId(id);
                }
                ((Chip) child).setOnCheckedChangeListenerInternal(ChipGroup.this.f4793i);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f4798a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(parent, child);
            }
        }

        public void onChildViewRemoved(View parent, View child) {
            if (parent == ChipGroup.this && (child instanceof Chip)) {
                ((Chip) child).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f4798a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(parent, child);
            }
        }
    }
}
