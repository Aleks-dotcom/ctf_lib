package p000a.p002b.p006m.p007a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p002b.p006m.p007a.C0063b;
import p000a.p002b.p006m.p007a.C0068d;
import p000a.p002b.p008n.C0071b;
import p000a.p002b.p011p.C0176m0;
import p000a.p018e.C0261d;
import p000a.p018e.C0270h;
import p000a.p025h.p027e.p028c.C0355g;
import p000a.p025h.p029f.p030j.C0371b;
import p000a.p059r.p060a.p061a.C0734b;
import p000a.p059r.p060a.p061a.C0744h;

@SuppressLint({"RestrictedAPI"})
/* renamed from: a.b.m.a.a */
public class C0055a extends C0068d implements C0371b {

    /* renamed from: p */
    public C0058c f409p;

    /* renamed from: q */
    public C0062g f410q;

    /* renamed from: r */
    public int f411r;

    /* renamed from: s */
    public int f412s;

    /* renamed from: t */
    public boolean f413t;

    static {
        C0055a.class.getSimpleName();
    }

    public C0055a() {
        this((C0058c) null, (Resources) null);
    }

    public C0055a(C0058c state, Resources res) {
        super((C0068d.C0069a) null);
        this.f411r = -1;
        this.f412s = -1;
        mo268h(new C0058c(state, this, res));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: m */
    public static C0055a m281m(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (name.equals("animated-selector")) {
            C0055a asl = new C0055a();
            asl.mo274n(context, resources, parser, attrs, theme);
            return asl;
        }
        throw new XmlPullParserException(parser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: n */
    public void mo274n(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        TypedArray a = C0355g.m1844k(resources, theme, attrs, C0071b.f476a);
        setVisible(a.getBoolean(C0071b.f478c, true), true);
        mo282t(a);
        mo320i(resources);
        a.recycle();
        mo275o(context, resources, parser, attrs, theme);
        mo277p();
    }

    public boolean setVisible(boolean visible, boolean restart) {
        boolean changed = super.setVisible(visible, restart);
        C0062g gVar = this.f410q;
        if (gVar != null && (changed || restart)) {
            if (visible) {
                gVar.mo283c();
            } else {
                jumpToCurrentState();
            }
        }
        return changed;
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C0062g gVar = this.f410q;
        if (gVar != null) {
            gVar.mo284d();
            this.f410q = null;
            mo307g(this.f411r);
            this.f411r = -1;
            this.f412s = -1;
        }
    }

    public boolean onStateChange(int[] stateSet) {
        int targetIndex = this.f409p.mo288F(stateSet);
        boolean changed = targetIndex != mo302c() && (mo280s(targetIndex) || mo307g(targetIndex));
        Drawable current = getCurrent();
        if (current != null) {
            return changed | current.setState(stateSet);
        }
        return changed;
    }

    /* renamed from: s */
    public final boolean mo280s(int toIndex) {
        int fromIndex;
        int transitionIndex;
        C0062g transition;
        C0062g currentTransition = this.f410q;
        if (currentTransition == null) {
            fromIndex = mo302c();
        } else if (toIndex == this.f411r) {
            return true;
        } else {
            if (toIndex != this.f412s || !currentTransition.mo295a()) {
                fromIndex = this.f411r;
                currentTransition.mo284d();
            } else {
                currentTransition.mo296b();
                this.f411r = this.f412s;
                this.f412s = toIndex;
                return true;
            }
        }
        this.f410q = null;
        this.f412s = -1;
        this.f411r = -1;
        C0058c state = this.f409p;
        int fromId = state.mo287E(fromIndex);
        int toId = state.mo287E(toIndex);
        if (toId == 0 || fromId == 0 || (transitionIndex = state.mo289G(fromId, toId)) < 0) {
            return false;
        }
        boolean hasReversibleFlag = state.mo291I(fromId, toId);
        mo307g(transitionIndex);
        Drawable d = getCurrent();
        if (d instanceof AnimationDrawable) {
            transition = new C0060e((AnimationDrawable) d, state.mo290H(fromId, toId), hasReversibleFlag);
        } else if (d instanceof C0734b) {
            transition = new C0059d((C0734b) d);
        } else if (!(d instanceof Animatable)) {
            return false;
        } else {
            transition = new C0057b((Animatable) d);
        }
        transition.mo283c();
        this.f410q = transition;
        this.f412s = fromIndex;
        this.f411r = toIndex;
        return true;
    }

    /* renamed from: a.b.m.a.a$g */
    public static abstract class C0062g {
        /* renamed from: c */
        public abstract void mo283c();

        /* renamed from: d */
        public abstract void mo284d();

        public C0062g() {
        }

        /* renamed from: b */
        public void mo296b() {
        }

        /* renamed from: a */
        public boolean mo295a() {
            return false;
        }
    }

    /* renamed from: a.b.m.a.a$b */
    public static class C0057b extends C0062g {

        /* renamed from: a */
        public final Animatable f414a;

        public C0057b(Animatable a) {
            super();
            this.f414a = a;
        }

        /* renamed from: c */
        public void mo283c() {
            this.f414a.start();
        }

        /* renamed from: d */
        public void mo284d() {
            this.f414a.stop();
        }
    }

    /* renamed from: a.b.m.a.a$e */
    public static class C0060e extends C0062g {

        /* renamed from: a */
        public final ObjectAnimator f418a;

        /* renamed from: b */
        public final boolean f419b;

        public C0060e(AnimationDrawable ad, boolean reversed, boolean hasReversibleFlag) {
            super();
            int frameCount = ad.getNumberOfFrames();
            int fromFrame = reversed ? frameCount - 1 : 0;
            int toFrame = reversed ? 0 : frameCount - 1;
            C0061f interp = new C0061f(ad, reversed);
            ObjectAnimator anim = ObjectAnimator.ofInt(ad, "currentIndex", new int[]{fromFrame, toFrame});
            if (Build.VERSION.SDK_INT >= 18) {
                anim.setAutoCancel(true);
            }
            anim.setDuration((long) interp.mo297a());
            anim.setInterpolator(interp);
            this.f419b = hasReversibleFlag;
            this.f418a = anim;
        }

        /* renamed from: a */
        public boolean mo295a() {
            return this.f419b;
        }

        /* renamed from: c */
        public void mo283c() {
            this.f418a.start();
        }

        /* renamed from: b */
        public void mo296b() {
            this.f418a.reverse();
        }

        /* renamed from: d */
        public void mo284d() {
            this.f418a.cancel();
        }
    }

    /* renamed from: a.b.m.a.a$d */
    public static class C0059d extends C0062g {

        /* renamed from: a */
        public final C0734b f417a;

        public C0059d(C0734b avd) {
            super();
            this.f417a = avd;
        }

        /* renamed from: c */
        public void mo283c() {
            this.f417a.start();
        }

        /* renamed from: d */
        public void mo284d() {
            this.f417a.stop();
        }
    }

    /* renamed from: t */
    public final void mo282t(TypedArray a) {
        C0058c state = this.f409p;
        if (Build.VERSION.SDK_INT >= 21) {
            state.f449d |= a.getChangingConfigurations();
        }
        state.mo366x(a.getBoolean(C0071b.f479d, state.f454i));
        state.mo362t(a.getBoolean(C0071b.f480e, state.f457l));
        state.mo363u(a.getInt(C0071b.f481f, state.f437A));
        state.mo364v(a.getInt(C0071b.f482g, state.f438B));
        setDither(a.getBoolean(C0071b.f477b, state.f469x));
    }

    /* renamed from: p */
    public final void mo277p() {
        onStateChange(getState());
    }

    /* renamed from: o */
    public final void mo275o(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int innerDepth = parser.getDepth() + 1;
        while (true) {
            int next = parser.next();
            int type = next;
            if (next != 1) {
                int depth = parser.getDepth();
                int depth2 = depth;
                if (depth < innerDepth && type == 3) {
                    return;
                }
                if (type == 2 && depth2 <= innerDepth) {
                    if (parser.getName().equals("item")) {
                        mo278q(context, resources, parser, attrs, theme);
                    } else if (parser.getName().equals("transition")) {
                        mo279r(context, resources, parser, attrs, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    public final int mo279r(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int next;
        int type;
        Resources.Theme theme2 = theme;
        TypedArray a = C0355g.m1844k(resources, theme2, attrs, C0071b.f486k);
        int fromId = a.getResourceId(C0071b.f489n, -1);
        int toId = a.getResourceId(C0071b.f488m, -1);
        Drawable dr = null;
        int drawableId = a.getResourceId(C0071b.f487l, -1);
        if (drawableId > 0) {
            dr = C0176m0.m948h().mo1254j(context, drawableId);
        } else {
            Context context2 = context;
        }
        boolean reversible = a.getBoolean(C0071b.f490o, false);
        a.recycle();
        if (dr == null) {
            do {
                next = parser.next();
                type = next;
            } while (next == 4);
            if (type != 2) {
                throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (parser.getName().equals("animated-vector")) {
                dr = C0734b.m3574a(context, resources, parser, attrs, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                dr = Drawable.createFromXmlInner(resources, parser, attrs, theme);
            } else {
                dr = Drawable.createFromXmlInner(resources, parser, attrs);
            }
        }
        if (dr == null) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (fromId != -1 && toId != -1) {
            return this.f409p.mo286C(fromId, toId, dr, reversible);
        } else {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: q */
    public final int mo278q(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int next;
        int type;
        TypedArray a = C0355g.m1844k(resources, theme, attrs, C0071b.f483h);
        int keyframeId = a.getResourceId(C0071b.f484i, 0);
        Drawable dr = null;
        int drawableId = a.getResourceId(C0071b.f485j, -1);
        if (drawableId > 0) {
            dr = C0176m0.m948h().mo1254j(context, drawableId);
        }
        a.recycle();
        int[] states = mo402k(attrs);
        if (dr == null) {
            do {
                next = parser.next();
                type = next;
            } while (next == 4);
            if (type != 2) {
                throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (parser.getName().equals("vector")) {
                dr = C0744h.m3607c(resources, parser, attrs, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                dr = Drawable.createFromXmlInner(resources, parser, attrs, theme);
            } else {
                dr = Drawable.createFromXmlInner(resources, parser, attrs);
            }
        }
        if (dr != null) {
            return this.f409p.mo285B(states, dr, keyframeId);
        }
        throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    public Drawable mutate() {
        if (!this.f413t) {
            super.mutate();
            if (this == this) {
                this.f409p.mo294r();
                this.f413t = true;
            }
        }
        return this;
    }

    /* renamed from: l */
    public C0058c mo270j() {
        return new C0058c(this.f409p, this, (Resources) null);
    }

    /* renamed from: a.b.m.a.a$c */
    public static class C0058c extends C0068d.C0069a {

        /* renamed from: K */
        public C0261d<Long> f415K;

        /* renamed from: L */
        public C0270h<Integer> f416L;

        public C0058c(C0058c orig, C0055a owner, Resources res) {
            super(orig, owner, res);
            if (orig != null) {
                this.f415K = orig.f415K;
                this.f416L = orig.f416L;
                return;
            }
            this.f415K = new C0261d<>();
            this.f416L = new C0270h<>();
        }

        /* renamed from: r */
        public void mo294r() {
            this.f415K = this.f415K.clone();
            this.f416L = this.f416L.clone();
        }

        /* renamed from: C */
        public int mo286C(int fromId, int toId, Drawable anim, boolean reversible) {
            int pos = super.mo342a(anim);
            long keyFromTo = m295D(fromId, toId);
            long reversibleBit = 0;
            if (reversible) {
                reversibleBit = 8589934592L;
            }
            this.f415K.mo1783a(keyFromTo, Long.valueOf(((long) pos) | reversibleBit));
            if (reversible) {
                this.f415K.mo1783a(m295D(toId, fromId), Long.valueOf(((long) pos) | 4294967296L | reversibleBit));
            } else {
                int i = fromId;
                int i2 = toId;
            }
            return pos;
        }

        /* renamed from: B */
        public int mo285B(int[] stateSet, Drawable drawable, int id) {
            int index = super.mo404z(stateSet, drawable);
            this.f416L.mo1905i(index, Integer.valueOf(id));
            return index;
        }

        /* renamed from: F */
        public int mo288F(int[] stateSet) {
            int index = super.mo403A(stateSet);
            if (index >= 0) {
                return index;
            }
            return super.mo403A(StateSet.WILD_CARD);
        }

        /* renamed from: E */
        public int mo287E(int index) {
            if (index < 0) {
                return 0;
            }
            return this.f416L.mo1902f(index, 0).intValue();
        }

        /* renamed from: G */
        public int mo289G(int fromId, int toId) {
            return (int) this.f415K.mo1790g(m295D(fromId, toId), -1L).longValue();
        }

        /* renamed from: H */
        public boolean mo290H(int fromId, int toId) {
            return (this.f415K.mo1790g(m295D(fromId, toId), -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: I */
        public boolean mo291I(int fromId, int toId) {
            return (this.f415K.mo1790g(m295D(fromId, toId), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new C0055a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources res) {
            return new C0055a(this, res);
        }

        /* renamed from: D */
        public static long m295D(int fromId, int toId) {
            return (((long) fromId) << 32) | ((long) toId);
        }
    }

    /* renamed from: h */
    public void mo268h(C0063b.C0066c state) {
        super.mo268h(state);
        if (state instanceof C0058c) {
            this.f409p = (C0058c) state;
        }
    }

    /* renamed from: a.b.m.a.a$f */
    public static class C0061f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f420a;

        /* renamed from: b */
        public int f421b;

        /* renamed from: c */
        public int f422c;

        public C0061f(AnimationDrawable d, boolean reversed) {
            mo298b(d, reversed);
        }

        /* renamed from: b */
        public int mo298b(AnimationDrawable d, boolean reversed) {
            int frameCount = d.getNumberOfFrames();
            this.f421b = frameCount;
            int[] iArr = this.f420a;
            if (iArr == null || iArr.length < frameCount) {
                this.f420a = new int[frameCount];
            }
            int[] frameTimes = this.f420a;
            int totalDuration = 0;
            for (int i = 0; i < frameCount; i++) {
                int duration = d.getDuration(reversed ? (frameCount - i) - 1 : i);
                frameTimes[i] = duration;
                totalDuration += duration;
            }
            this.f422c = totalDuration;
            return totalDuration;
        }

        /* renamed from: a */
        public int mo297a() {
            return this.f422c;
        }

        public float getInterpolation(float input) {
            float frameElapsed;
            int frameCount = this.f421b;
            int[] frameTimes = this.f420a;
            int remaining = (int) ((((float) this.f422c) * input) + 0.5f);
            int i = 0;
            while (i < frameCount && remaining >= frameTimes[i]) {
                remaining -= frameTimes[i];
                i++;
            }
            if (i < frameCount) {
                frameElapsed = ((float) remaining) / ((float) this.f422c);
            } else {
                frameElapsed = 0.0f;
            }
            return (((float) i) / ((float) frameCount)) + frameElapsed;
        }
    }
}
