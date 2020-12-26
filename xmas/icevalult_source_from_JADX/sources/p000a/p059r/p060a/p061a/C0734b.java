package p000a.p059r.p060a.p061a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p000a.p018e.C0256a;
import p000a.p025h.p027e.p028c.C0355g;
import p000a.p025h.p029f.p030j.C0370a;

/* renamed from: a.r.a.a.b */
public class C0734b extends C0743g implements Animatable {

    /* renamed from: c */
    public C0736b f2773c;

    /* renamed from: d */
    public Context f2774d;

    /* renamed from: e */
    public ArgbEvaluator f2775e;

    /* renamed from: f */
    public final Drawable.Callback f2776f;

    public C0734b() {
        this((Context) null, (C0736b) null, (Resources) null);
    }

    public C0734b(Context context) {
        this(context, (C0736b) null, (Resources) null);
    }

    public C0734b(Context context, C0736b state, Resources res) {
        this.f2775e = null;
        C0735a aVar = new C0735a();
        this.f2776f = aVar;
        this.f2774d = context;
        if (state != null) {
            this.f2773c = state;
        } else {
            this.f2773c = new C0736b(context, state, aVar, res);
        }
    }

    public Drawable mutate() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* renamed from: a */
    public static C0734b m3574a(Context context, Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        C0734b drawable = new C0734b(context);
        drawable.inflate(r, parser, attrs, theme);
        return drawable;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f2788b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0737c(this.f2788b.getConstantState());
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f2773c.f2778a;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f2773c.f2779b.draw(canvas);
        if (this.f2773c.f2780c.isStarted()) {
            invalidateSelf();
        }
    }

    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.setBounds(bounds);
        } else {
            this.f2773c.f2779b.setBounds(bounds);
        }
    }

    public boolean onStateChange(int[] state) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.setState(state);
        }
        return this.f2773c.f2779b.setState(state);
    }

    public boolean onLevelChange(int level) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        return this.f2773c.f2779b.setLevel(level);
    }

    public int getAlpha() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return C0370a.m1934d(drawable);
        }
        return this.f2773c.f2779b.getAlpha();
    }

    public void setAlpha(int alpha) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        } else {
            this.f2773c.f2779b.setAlpha(alpha);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2773c.f2779b.setColorFilter(colorFilter);
        }
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return C0370a.m1935e(drawable);
        }
        return this.f2773c.f2779b.getColorFilter();
    }

    public void setTint(int tint) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1944n(drawable, tint);
        } else {
            this.f2773c.f2779b.setTint(tint);
        }
    }

    public void setTintList(ColorStateList tint) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1945o(drawable, tint);
        } else {
            this.f2773c.f2779b.setTintList(tint);
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1946p(drawable, tintMode);
        } else {
            this.f2773c.f2779b.setTintMode(tintMode);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.setVisible(visible, restart);
        }
        this.f2773c.f2779b.setVisible(visible, restart);
        return super.setVisible(visible, restart);
    }

    public boolean isStateful() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f2773c.f2779b.isStateful();
    }

    public int getOpacity() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f2773c.f2779b.getOpacity();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f2773c.f2779b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f2773c.f2779b.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return C0370a.m1938h(drawable);
        }
        return this.f2773c.f2779b.isAutoMirrored();
    }

    public void setAutoMirrored(boolean mirrored) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1940j(drawable, mirrored);
        } else {
            this.f2773c.f2779b.setAutoMirrored(mirrored);
        }
    }

    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1937g(drawable, res, parser, attrs, theme);
            return;
        }
        int eventType = parser.getEventType();
        int innerDepth = parser.getDepth() + 1;
        while (eventType != 1 && (parser.getDepth() >= innerDepth || eventType != 3)) {
            if (eventType == 2) {
                String tagName = parser.getName();
                if ("animated-vector".equals(tagName)) {
                    TypedArray a = C0355g.m1844k(res, theme, attrs, C0733a.f2765e);
                    int drawableRes = a.getResourceId(0, 0);
                    if (drawableRes != 0) {
                        C0744h vectorDrawable = C0744h.m3606b(res, drawableRes, theme);
                        vectorDrawable.mo3689h(false);
                        vectorDrawable.setCallback(this.f2776f);
                        C0744h hVar = this.f2773c.f2779b;
                        if (hVar != null) {
                            hVar.setCallback((Drawable.Callback) null);
                        }
                        this.f2773c.f2779b = vectorDrawable;
                    }
                    a.recycle();
                } else if ("target".equals(tagName)) {
                    TypedArray a2 = res.obtainAttributes(attrs, C0733a.f2766f);
                    String target = a2.getString(0);
                    int id = a2.getResourceId(1, 0);
                    if (id != 0) {
                        Context context = this.f2774d;
                        if (context != null) {
                            mo3617b(target, C0739d.m3588i(context, id));
                        } else {
                            a2.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    a2.recycle();
                } else {
                    continue;
                }
            }
            eventType = parser.next();
        }
        this.f2773c.mo3646a();
    }

    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs) {
        inflate(res, parser, attrs, (Resources.Theme) null);
    }

    public void applyTheme(Resources.Theme t) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1931a(drawable, t);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return C0370a.m1932b(drawable);
        }
        return false;
    }

    /* renamed from: a.r.a.a.b$c */
    public static class C0737c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f2783a;

        public C0737c(Drawable.ConstantState state) {
            this.f2783a = state;
        }

        public Drawable newDrawable() {
            C0734b drawableCompat = new C0734b();
            Drawable newDrawable = this.f2783a.newDrawable();
            drawableCompat.f2788b = newDrawable;
            newDrawable.setCallback(drawableCompat.f2776f);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res) {
            C0734b drawableCompat = new C0734b();
            Drawable newDrawable = this.f2783a.newDrawable(res);
            drawableCompat.f2788b = newDrawable;
            newDrawable.setCallback(drawableCompat.f2776f);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res, Resources.Theme theme) {
            C0734b drawableCompat = new C0734b();
            Drawable newDrawable = this.f2783a.newDrawable(res, theme);
            drawableCompat.f2788b = newDrawable;
            newDrawable.setCallback(drawableCompat.f2776f);
            return drawableCompat;
        }

        public boolean canApplyTheme() {
            return this.f2783a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f2783a.getChangingConfigurations();
        }
    }

    /* renamed from: a.r.a.a.b$b */
    public static class C0736b extends Drawable.ConstantState {

        /* renamed from: a */
        public int f2778a;

        /* renamed from: b */
        public C0744h f2779b;

        /* renamed from: c */
        public AnimatorSet f2780c;

        /* renamed from: d */
        public ArrayList<Animator> f2781d;

        /* renamed from: e */
        public C0256a<Animator, String> f2782e;

        public C0736b(Context context, C0736b copy, Drawable.Callback owner, Resources res) {
            if (copy != null) {
                this.f2778a = copy.f2778a;
                C0744h hVar = copy.f2779b;
                if (hVar != null) {
                    Drawable.ConstantState cs = hVar.getConstantState();
                    if (res != null) {
                        this.f2779b = (C0744h) cs.newDrawable(res);
                    } else {
                        this.f2779b = (C0744h) cs.newDrawable();
                    }
                    C0744h hVar2 = this.f2779b;
                    hVar2.mutate();
                    C0744h hVar3 = hVar2;
                    this.f2779b = hVar3;
                    hVar3.setCallback(owner);
                    this.f2779b.setBounds(copy.f2779b.getBounds());
                    this.f2779b.mo3689h(false);
                }
                ArrayList<Animator> arrayList = copy.f2781d;
                if (arrayList != null) {
                    int numAnimators = arrayList.size();
                    this.f2781d = new ArrayList<>(numAnimators);
                    this.f2782e = new C0256a<>(numAnimators);
                    for (int i = 0; i < numAnimators; i++) {
                        Animator anim = copy.f2781d.get(i);
                        Animator animClone = anim.clone();
                        String targetName = copy.f2782e.get(anim);
                        animClone.setTarget(this.f2779b.mo3678d(targetName));
                        this.f2781d.add(animClone);
                        this.f2782e.put(animClone, targetName);
                    }
                    mo3646a();
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources res) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.f2778a;
        }

        /* renamed from: a */
        public void mo3646a() {
            if (this.f2780c == null) {
                this.f2780c = new AnimatorSet();
            }
            this.f2780c.playTogether(this.f2781d);
        }
    }

    /* renamed from: c */
    public final void mo3618c(Animator animator) {
        List<Animator> childAnimators;
        if ((animator instanceof AnimatorSet) && (childAnimators = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimators.size(); i++) {
                mo3618c(childAnimators.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnim = (ObjectAnimator) animator;
            String propertyName = objectAnim.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f2775e == null) {
                    this.f2775e = new ArgbEvaluator();
                }
                objectAnim.setEvaluator(this.f2775e);
            }
        }
    }

    /* renamed from: b */
    public final void mo3617b(String name, Animator animator) {
        animator.setTarget(this.f2773c.f2779b.mo3678d(name));
        if (Build.VERSION.SDK_INT < 21) {
            mo3618c(animator);
        }
        C0736b bVar = this.f2773c;
        if (bVar.f2781d == null) {
            bVar.f2781d = new ArrayList<>();
            this.f2773c.f2782e = new C0256a<>();
        }
        this.f2773c.f2781d.add(animator);
        this.f2773c.f2782e.put(animator, name);
    }

    public boolean isRunning() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f2773c.f2780c.isRunning();
    }

    public void start() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f2773c.f2780c.isStarted()) {
            this.f2773c.f2780c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2773c.f2780c.end();
        }
    }

    /* renamed from: a.r.a.a.b$a */
    public class C0735a implements Drawable.Callback {
        public C0735a() {
        }

        public void invalidateDrawable(Drawable who) {
            C0734b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            C0734b.this.scheduleSelf(what, when);
        }

        public void unscheduleDrawable(Drawable who, Runnable what) {
            C0734b.this.unscheduleSelf(what);
        }
    }
}
