package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import p000a.p002b.C0003a;
import p000a.p002b.p011p.C0175m;
import p000a.p025h.p038m.C0420a;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p043j.p044a.C0501a;

public class CheckableImageButton extends C0175m implements Checkable {

    /* renamed from: g */
    public static final int[] f4840g = {16842912};

    /* renamed from: d */
    public boolean f4841d;

    /* renamed from: e */
    public boolean f4842e;

    /* renamed from: f */
    public boolean f4843f;

    public CheckableImageButton(Context context, AttributeSet attrs) {
        this(context, attrs, C0003a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f4842e = true;
        this.f4843f = true;
        C0460r.m2257c0(this, new C1171a());
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public class C1171a extends C0420a {
        public C1171a() {
        }

        /* renamed from: f */
        public void mo2423f(View host, AccessibilityEvent event) {
            super.mo2423f(host, event);
            event.setChecked(CheckableImageButton.this.isChecked());
        }

        /* renamed from: g */
        public void mo2424g(View host, C0424c info) {
            super.mo2424g(host, info);
            info.mo2457T(CheckableImageButton.this.mo6944a());
            info.mo2458U(CheckableImageButton.this.isChecked());
        }
    }

    public void setChecked(boolean checked) {
        if (this.f4842e && this.f4841d != checked) {
            this.f4841d = checked;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public boolean isChecked() {
        return this.f4841d;
    }

    public void toggle() {
        setChecked(!this.f4841d);
    }

    public void setPressed(boolean pressed) {
        if (this.f4843f) {
            super.setPressed(pressed);
        }
    }

    public int[] onCreateDrawableState(int extraSpace) {
        if (!this.f4841d) {
            return super.onCreateDrawableState(extraSpace);
        }
        int[] iArr = f4840g;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(iArr.length + extraSpace), iArr);
    }

    public Parcelable onSaveInstanceState() {
        C1172b savedState = new C1172b(super.onSaveInstanceState());
        savedState.f4845d = this.f4841d;
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof C1172b)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C1172b savedState = (C1172b) state;
        super.onRestoreInstanceState(savedState.mo2682f());
        setChecked(savedState.f4845d);
    }

    public void setCheckable(boolean checkable) {
        if (this.f4842e != checkable) {
            this.f4842e = checkable;
            sendAccessibilityEvent(0);
        }
    }

    /* renamed from: a */
    public boolean mo6944a() {
        return this.f4842e;
    }

    public void setPressable(boolean pressable) {
        this.f4843f = pressable;
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    public static class C1172b extends C0501a {
        public static final Parcelable.Creator<C1172b> CREATOR = new C1173a();

        /* renamed from: d */
        public boolean f4845d;

        public C1172b(Parcelable superState) {
            super(superState);
        }

        public C1172b(Parcel source, ClassLoader loader) {
            super(source, loader);
            mo6954g(source);
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f4845d ? 1 : 0);
        }

        /* renamed from: g */
        public final void mo6954g(Parcel in) {
            boolean z = true;
            if (in.readInt() != 1) {
                z = false;
            }
            this.f4845d = z;
        }

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        public static class C1173a implements Parcelable.ClassLoaderCreator<C1172b> {
            /* renamed from: b */
            public C1172b createFromParcel(Parcel in, ClassLoader loader) {
                return new C1172b(in, loader);
            }

            /* renamed from: a */
            public C1172b createFromParcel(Parcel in) {
                return new C1172b(in, (ClassLoader) null);
            }

            /* renamed from: c */
            public C1172b[] newArray(int size) {
                return new C1172b[size];
            }
        }
    }
}
