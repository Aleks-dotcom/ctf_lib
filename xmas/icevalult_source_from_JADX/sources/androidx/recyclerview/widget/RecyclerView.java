package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p025h.p034i.C0380a;
import p000a.p025h.p037l.C0419h;
import p000a.p025h.p038m.C0420a;
import p000a.p025h.p038m.C0451i;
import p000a.p025h.p038m.C0452j;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.C0469s;
import p000a.p025h.p038m.p039a0.C0423b;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p025h.p040n.C0485d;
import p000a.p043j.p044a.C0501a;
import p000a.p055o.C0607a;
import p000a.p055o.C0608b;
import p000a.p055o.C0609c;
import p000a.p055o.p056d.C0610a;
import p000a.p055o.p056d.C0613b;
import p000a.p055o.p056d.C0616c;
import p000a.p055o.p056d.C0627d;
import p000a.p055o.p056d.C0632e;
import p000a.p055o.p056d.C0644k;
import p000a.p055o.p056d.C0651o;
import p000a.p055o.p056d.C0654p;

public class RecyclerView extends ViewGroup implements C0451i {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    public static final boolean ALLOW_THREAD_GAP_WORK;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator = new C0859c();
    public C0644k mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public C0865g mAdapter;
    public C0610a mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private C0868j mChildDrawingOrderCallback;
    public C0613b mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C0869k mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public C0632e mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private C0884s mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public C0870l mItemAnimator;
    private C0870l.C0872b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList<C0875n> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    public C0876o mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C0890x mObserver;
    private List<C0882q> mOnChildAttachStateListeners;
    private C0883r mOnFlingListener;
    private final ArrayList<C0884s> mOnItemTouchListeners;
    public final List<C0862d0> mPendingAccessibilityImportanceChange;
    private C0891y mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public C0632e.C0634b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final C0888v mRecycler;
    public C0889w mRecyclerListener;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private C0885t mScrollListener;
    private List<C0885t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0452j mScrollingChildHelper;
    public final C0856a0 mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final C0860c0 mViewFlinger;
    private final C0654p.C0656b mViewInfoProcessCallback;
    public final C0654p mViewInfoStore;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C0858b0 {
        /* renamed from: a */
        public abstract View mo5037a(C0888v vVar, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C0868j {
        /* renamed from: a */
        int mo5110a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C0882q {
        /* renamed from: a */
        void mo5234a(View view);

        /* renamed from: b */
        void mo5235b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C0883r {
        /* renamed from: a */
        public abstract boolean mo3387a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C0884s {
        /* renamed from: a */
        void mo3269a(boolean z);

        /* renamed from: b */
        boolean mo3270b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo3271c(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface C0889w {
        /* renamed from: a */
        void mo5287a(C0862d0 d0Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            NESTED_SCROLLING_ATTRS = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 == r2) goto L_0x001c
            r2 = 19
            if (r1 == r2) goto L_0x001c
            r2 = 20
            if (r1 != r2) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r2 = 0
            goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            FORCE_INVALIDATE_DISPLAY_LIST = r2
            r2 = 23
            if (r1 < r2) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r2
            r2 = 16
            if (r1 < r2) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            POST_UPDATES_ON_ANIMATION = r2
            r2 = 21
            if (r1 < r2) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            ALLOW_THREAD_GAP_WORK = r2
            r2 = 15
            if (r1 > r2) goto L_0x0040
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            FORCE_ABS_FOCUS_SEARCH_DIRECTION = r4
            if (r1 > r2) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            IGNORE_DETACHED_FOCUSED_CHILD = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            sQuinticInterpolator = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class C0855a implements Runnable {
        public C0855a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class C0857b implements Runnable {
        public C0857b() {
        }

        public void run() {
            C0870l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.mo3245u();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public static class C0859c implements Interpolator {
        public float getInterpolation(float t) {
            float t2 = t - 1.0f;
            return (t2 * t2 * t2 * t2 * t2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C0861d implements C0654p.C0656b {
        public C0861d() {
        }

        /* renamed from: a */
        public void mo3426a(C0862d0 viewHolder, C0870l.C0873c info, C0870l.C0873c postInfo) {
            RecyclerView.this.mRecycler.mo5257J(viewHolder);
            RecyclerView.this.animateDisappearance(viewHolder, info, postInfo);
        }

        /* renamed from: d */
        public void mo3429d(C0862d0 viewHolder, C0870l.C0873c preInfo, C0870l.C0873c info) {
            RecyclerView.this.animateAppearance(viewHolder, preInfo, info);
        }

        /* renamed from: c */
        public void mo3428c(C0862d0 viewHolder, C0870l.C0873c preInfo, C0870l.C0873c postInfo) {
            viewHolder.mo5053G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.mo3383b(viewHolder, viewHolder, preInfo, postInfo)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.mo3385d(viewHolder, preInfo, postInfo)) {
                RecyclerView.this.postAnimationRunner();
            }
        }

        /* renamed from: b */
        public void mo3427b(C0862d0 viewHolder) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.mo5204m1(viewHolder.f3608a, recyclerView.mRecycler);
        }
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public RecyclerView(Context context, AttributeSet attrs) {
        this(context, attrs, C0607a.recyclerViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        int i;
        Context context2 = context;
        AttributeSet attributeSet = attrs;
        int i2 = defStyleAttr;
        this.mObserver = new C0890x();
        this.mRecycler = new C0888v();
        this.mViewInfoStore = new C0654p();
        this.mUpdateChildViewsRunnable = new C0855a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C0869k();
        this.mItemAnimator = new C0616c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C0860c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C0632e.C0634b() : null;
        this.mState = new C0856a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C0874m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new C0857b();
        this.mViewInfoProcessCallback = new C0861d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration vc = ViewConfiguration.get(context);
        this.mTouchSlop = vc.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C0469s.m2334b(vc, context2);
        this.mScaledVerticalScrollFactor = C0469s.m2336d(vc, context2);
        this.mMinFlingVelocity = vc.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = vc.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.mo5122v(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C0460r.m2290t(this) == 0) {
            C0460r.m2275l0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0644k(this));
        int[] iArr = C0609c.f2414a;
        TypedArray a = context2.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            i = i3;
            saveAttributeDataForStyleable(context, iArr, attrs, a, defStyleAttr, 0);
        } else {
            i = i3;
        }
        String layoutManagerName = a.getString(C0609c.f2423j);
        int descendantFocusability = a.getInt(C0609c.f2417d, -1);
        if (descendantFocusability == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = a.getBoolean(C0609c.f2416c, true);
        boolean z = a.getBoolean(C0609c.f2418e, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) a.getDrawable(C0609c.f2421h), a.getDrawable(C0609c.f2422i), (StateListDrawable) a.getDrawable(C0609c.f2419f), a.getDrawable(C0609c.f2420g));
        }
        a.recycle();
        createLayoutManager(context, layoutManagerName, attrs, defStyleAttr, 0);
        boolean nestedScrollingEnabled = true;
        int i4 = i;
        if (i4 >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray a2 = context2.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            if (i4 >= 29) {
                int i5 = descendantFocusability;
                saveAttributeDataForStyleable(context, iArr2, attrs, a2, defStyleAttr, 0);
            }
            nestedScrollingEnabled = a2.getBoolean(0, true);
            a2.recycle();
        }
        setNestedScrollingEnabled(nestedScrollingEnabled);
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C0460r.m2291u(this) == 0) {
            C0460r.m2277m0(this, 8);
        }
    }

    public C0644k getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void setAccessibilityDelegateCompat(C0644k accessibilityDelegate) {
        this.mAccessibilityDelegate = accessibilityDelegate;
        C0460r.m2257c0(this, accessibilityDelegate);
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    private void createLayoutManager(Context context, String className, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (className != null) {
            String className2 = className.trim();
            if (!className2.isEmpty()) {
                String className3 = getFullClassName(context, className2);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(className3, false, classLoader).asSubclass(C0876o.class);
                    Object[] constructorArgs = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        constructorArgs = new Object[]{context, attrs, Integer.valueOf(defStyleAttr), Integer.valueOf(defStyleRes)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0876o) constructor.newInstance(constructorArgs));
                } catch (NoSuchMethodException e1) {
                    e1.initCause(e);
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Error creating LayoutManager " + className3, e1);
                } catch (ClassNotFoundException e2) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Unable to find LayoutManager " + className3, e2);
                } catch (InvocationTargetException e3) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Could not instantiate the LayoutManager: " + className3, e3);
                } catch (InstantiationException e4) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Could not instantiate the LayoutManager: " + className3, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Cannot access non-public constructor " + className3, e5);
                } catch (ClassCastException e6) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Class is not a LayoutManager " + className3, e6);
                }
            }
        }
    }

    private String getFullClassName(Context context, String className) {
        if (className.charAt(0) == '.') {
            return context.getPackageName() + className;
        } else if (className.contains(".")) {
            return className;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + className;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public class C0863e implements C0613b.C0615b {
        public C0863e() {
        }

        /* renamed from: h */
        public int mo3227h() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: f */
        public void mo3225f(View child, int index) {
            RecyclerView.this.addView(child, index);
            RecyclerView.this.dispatchChildAttached(child);
        }

        /* renamed from: g */
        public int mo3226g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: i */
        public void mo3228i(int index) {
            View child = RecyclerView.this.getChildAt(index);
            if (child != null) {
                RecyclerView.this.dispatchChildDetached(child);
                child.clearAnimation();
            }
            RecyclerView.this.removeViewAt(index);
        }

        /* renamed from: a */
        public View mo3220a(int offset) {
            return RecyclerView.this.getChildAt(offset);
        }

        /* renamed from: j */
        public void mo3229j() {
            int count = mo3227h();
            for (int i = 0; i < count; i++) {
                View child = mo3220a(i);
                RecyclerView.this.dispatchChildDetached(child);
                child.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: k */
        public C0862d0 mo3230k(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        /* renamed from: d */
        public void mo3223d(View child, int index, ViewGroup.LayoutParams layoutParams) {
            C0862d0 vh = RecyclerView.getChildViewHolderInt(child);
            if (vh != null) {
                if (vh.mo5083x() || vh.mo5056J()) {
                    vh.mo5064f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + vh + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.attachViewToParent(child, index, layoutParams);
        }

        /* renamed from: b */
        public void mo3221b(int offset) {
            C0862d0 vh;
            View view = mo3220a(offset);
            if (!(view == null || (vh = RecyclerView.getChildViewHolderInt(view)) == null)) {
                if (!vh.mo5083x() || vh.mo5056J()) {
                    vh.mo5060b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + vh + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.detachViewFromParent(offset);
        }

        /* renamed from: e */
        public void mo3224e(View child) {
            C0862d0 vh = RecyclerView.getChildViewHolderInt(child);
            if (vh != null) {
                vh.mo5048B(RecyclerView.this);
            }
        }

        /* renamed from: c */
        public void mo3222c(View child) {
            C0862d0 vh = RecyclerView.getChildViewHolderInt(child);
            if (vh != null) {
                vh.mo5049C(RecyclerView.this);
            }
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C0613b(new C0863e());
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public class C0864f implements C0610a.C0611a {
        public C0864f() {
        }

        /* renamed from: e */
        public C0862d0 mo3182e(int position) {
            C0862d0 vh = RecyclerView.this.findViewHolderForPosition(position, true);
            if (vh != null && !RecyclerView.this.mChildHelper.mo3203n(vh.f3608a)) {
                return vh;
            }
            return null;
        }

        /* renamed from: g */
        public void mo3184g(int start, int count) {
            RecyclerView.this.offsetPositionRecordsForRemove(start, count, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f3584d += count;
        }

        /* renamed from: h */
        public void mo3185h(int positionStart, int itemCount) {
            RecyclerView.this.offsetPositionRecordsForRemove(positionStart, itemCount, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* renamed from: f */
        public void mo3183f(int positionStart, int itemCount, Object payload) {
            RecyclerView.this.viewRangeUpdate(positionStart, itemCount, payload);
            RecyclerView.this.mItemsChanged = true;
        }

        /* renamed from: c */
        public void mo3180c(C0610a.C0612b op) {
            mo5086i(op);
        }

        /* renamed from: i */
        public void mo5086i(C0610a.C0612b op) {
            int i = op.f2435a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.mo4710R0(recyclerView, op.f2436b, op.f2438d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.mo4716U0(recyclerView2, op.f2436b, op.f2438d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.mo4719W0(recyclerView3, op.f2436b, op.f2438d, op.f2437c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.mo4714T0(recyclerView4, op.f2436b, op.f2438d, 1);
            }
        }

        /* renamed from: b */
        public void mo3179b(C0610a.C0612b op) {
            mo5086i(op);
        }

        /* renamed from: d */
        public void mo3181d(int positionStart, int itemCount) {
            RecyclerView.this.offsetPositionRecordsForInsert(positionStart, itemCount);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* renamed from: a */
        public void mo3178a(int from, int to) {
            RecyclerView.this.offsetPositionRecordsForMove(from, to);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C0610a(new C0864f());
    }

    public void setHasFixedSize(boolean hasFixedSize) {
        this.mHasFixedSize = hasFixedSize;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public void setClipToPadding(boolean clipToPadding) {
        if (clipToPadding != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = clipToPadding;
        super.setClipToPadding(clipToPadding);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public void setScrollingTouchSlop(int slopConstant) {
        ViewConfiguration vc = ViewConfiguration.get(getContext());
        if (slopConstant != 0) {
            if (slopConstant != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + slopConstant + "; using default value");
            } else {
                this.mTouchSlop = vc.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = vc.getScaledTouchSlop();
    }

    public void swapAdapter(C0865g adapter, boolean removeAndRecycleExistingViews) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, removeAndRecycleExistingViews);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void setAdapter(C0865g adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void removeAndRecycleViews() {
        C0870l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo3243k();
        }
        C0876o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo5200k1(this.mRecycler);
            this.mLayout.mo5202l1(this.mRecycler);
        }
        this.mRecycler.mo5263c();
    }

    private void setAdapterInternal(C0865g adapter, boolean compatibleWithPrevious, boolean removeAndRecycleViews) {
        C0865g gVar = this.mAdapter;
        if (gVar != null) {
            gVar.mo5106t(this.mObserver);
            this.mAdapter.mo5099m(this);
        }
        if (!compatibleWithPrevious || removeAndRecycleViews) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.mo3176u();
        C0865g oldAdapter = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.mo5104r(this.mObserver);
            adapter.mo5095i(this);
        }
        C0876o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo5141E0(oldAdapter, this.mAdapter);
        }
        this.mRecycler.mo5284x(oldAdapter, this.mAdapter, compatibleWithPrevious);
        this.mState.f3587g = true;
    }

    public C0865g getAdapter() {
        return this.mAdapter;
    }

    public void setRecyclerListener(C0889w listener) {
        this.mRecyclerListener = listener;
    }

    public int getBaseline() {
        C0876o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo5145G();
        }
        return super.getBaseline();
    }

    public void addOnChildAttachStateChangeListener(C0882q listener) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(listener);
    }

    public void removeOnChildAttachStateChangeListener(C0882q listener) {
        List<C0882q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(listener);
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<C0882q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void setLayoutManager(C0876o layout) {
        if (layout != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                C0870l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.mo3243k();
                }
                this.mLayout.mo5200k1(this.mRecycler);
                this.mLayout.mo5202l1(this.mRecycler);
                this.mRecycler.mo5263c();
                if (this.mIsAttached) {
                    this.mLayout.mo5132A(this, this.mRecycler);
                }
                this.mLayout.mo5142E1((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.mo5263c();
            }
            this.mChildHelper.mo3204o();
            this.mLayout = layout;
            if (layout != null) {
                if (layout.f3640b == null) {
                    layout.mo5142E1(this);
                    if (this.mIsAttached) {
                        this.mLayout.mo5227z(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + layout + " is already attached to a RecyclerView:" + layout.f3640b.exceptionLabel());
                }
            }
            this.mRecycler.mo5258K();
            requestLayout();
        }
    }

    public void setOnFlingListener(C0883r onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    public C0883r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public Parcelable onSaveInstanceState() {
        C0891y state = new C0891y(super.onSaveInstanceState());
        C0891y yVar = this.mPendingSavedState;
        if (yVar != null) {
            state.mo5288g(yVar);
        } else {
            C0876o oVar = this.mLayout;
            if (oVar != null) {
                state.f3683d = oVar.mo4787d1();
            } else {
                state.f3683d = null;
            }
        }
        return state;
    }

    public void onRestoreInstanceState(Parcelable state) {
        Parcelable parcelable;
        if (!(state instanceof C0891y)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C0891y yVar = (C0891y) state;
        this.mPendingSavedState = yVar;
        super.onRestoreInstanceState(yVar.mo2682f());
        C0876o oVar = this.mLayout;
        if (oVar != null && (parcelable = this.mPendingSavedState.f3683d) != null) {
            oVar.mo4785c1(parcelable);
        }
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    private void addAnimatingView(C0862d0 viewHolder) {
        View view = viewHolder.f3608a;
        boolean alreadyParented = view.getParent() == this;
        this.mRecycler.mo5257J(getChildViewHolder(view));
        if (viewHolder.mo5083x()) {
            this.mChildHelper.mo3192c(view, -1, view.getLayoutParams(), true);
        } else if (!alreadyParented) {
            this.mChildHelper.mo3191b(view, true);
        } else {
            this.mChildHelper.mo3200k(view);
        }
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean removed = this.mChildHelper.mo3207r(view);
        if (removed) {
            C0862d0 viewHolder = getChildViewHolderInt(view);
            this.mRecycler.mo5257J(viewHolder);
            this.mRecycler.mo5250C(viewHolder);
        }
        stopInterceptRequestLayout(!removed);
        return removed;
    }

    public C0876o getLayoutManager() {
        return this.mLayout;
    }

    public C0886u getRecycledViewPool() {
        return this.mRecycler.mo5269i();
    }

    public void setRecycledViewPool(C0886u pool) {
        this.mRecycler.mo5252E(pool);
    }

    public void setViewCacheExtension(C0858b0 extension) {
        this.mRecycler.mo5253F(extension);
    }

    public void setItemViewCacheSize(int size) {
        this.mRecycler.mo5254G(size);
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public void setScrollState(int state) {
        if (state != this.mScrollState) {
            this.mScrollState = state;
            if (state != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(state);
        }
    }

    public void addItemDecoration(C0875n decor, int index) {
        C0876o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo4791g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (index < 0) {
            this.mItemDecorations.add(decor);
        } else {
            this.mItemDecorations.add(index, decor);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addItemDecoration(C0875n decor) {
        addItemDecoration(decor, -1);
    }

    public C0875n getItemDecorationAt(int index) {
        int size = getItemDecorationCount();
        if (index >= 0 && index < size) {
            return this.mItemDecorations.get(index);
        }
        throw new IndexOutOfBoundsException(index + " is an invalid index for size " + size);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public void removeItemDecorationAt(int index) {
        int size = getItemDecorationCount();
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index + " is an invalid index for size " + size);
        }
        removeItemDecoration(getItemDecorationAt(index));
    }

    public void removeItemDecoration(C0875n decor) {
        C0876o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo4791g("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(decor);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0868j childDrawingOrderCallback) {
        if (childDrawingOrderCallback != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = childDrawingOrderCallback;
            setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(C0885t listener) {
        this.mScrollListener = listener;
    }

    public void addOnScrollListener(C0885t listener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(listener);
    }

    public void removeOnScrollListener(C0885t listener) {
        List<C0885t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(listener);
        }
    }

    public void clearOnScrollListeners() {
        List<C0885t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void scrollToPosition(int position) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            C0876o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.mo4813x1(position);
            awakenScrollBars();
        }
    }

    public void jumpToPositionForSmoothScroller(int position) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.mo4813x1(position);
            awakenScrollBars();
        }
    }

    public void smoothScrollToPosition(int position) {
        if (!this.mLayoutSuppressed) {
            C0876o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.mo4762I1(this, this.mState, position);
            }
        }
    }

    public void scrollTo(int x, int y) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int x, int y) {
        C0876o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean canScrollHorizontal = oVar.mo4795k();
            boolean canScrollVertical = this.mLayout.mo4797l();
            if (canScrollHorizontal || canScrollVertical) {
                int i = 0;
                int i2 = canScrollHorizontal ? x : 0;
                if (canScrollVertical) {
                    i = y;
                }
                scrollByInternal(i2, i, (MotionEvent) null);
            }
        }
    }

    public void scrollStep(int dx, int dy, int[] consumed) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0380a.m1964a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int consumedX = 0;
        int consumedY = 0;
        if (dx != 0) {
            consumedX = this.mLayout.mo4741w1(dx, this.mRecycler, this.mState);
        }
        if (dy != 0) {
            consumedY = this.mLayout.mo4742y1(dy, this.mRecycler, this.mState);
        }
        C0380a.m1965b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (consumed != null) {
            consumed[0] = consumedX;
            consumed[1] = consumedY;
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C0380a.m1964a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C0380a.m1965b();
        } else if (this.mAdapterHelper.mo3171p()) {
            if (this.mAdapterHelper.mo3170o(4) && !this.mAdapterHelper.mo3170o(11)) {
                C0380a.m1964a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.mo3174s();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.mo3164i();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                C0380a.m1965b();
            } else if (this.mAdapterHelper.mo3171p()) {
                C0380a.m1964a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                C0380a.m1965b();
            }
        }
    }

    private boolean hasUpdatedView() {
        int childCount = this.mChildHelper.mo3196g();
        for (int i = 0; i < childCount; i++) {
            C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3195f(i));
            if (holder != null && !holder.mo5056J() && holder.mo5084y()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        if (r3 != 0) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean scrollByInternal(int r22, int r23, android.view.MotionEvent r24) {
        /*
            r21 = this;
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r21.consumePendingUpdateOperations()
            androidx.recyclerview.widget.RecyclerView$g r4 = r8.mAdapter
            r12 = 1
            r13 = 0
            if (r4 == 0) goto L_0x002d
            int[] r4 = r8.mReusableIntPair
            r4[r13] = r13
            r4[r12] = r13
            r8.scrollStep(r9, r10, r4)
            int[] r4 = r8.mReusableIntPair
            r2 = r4[r13]
            r3 = r4[r12]
            int r0 = r9 - r2
            int r1 = r10 - r3
            r14 = r0
            r15 = r1
            r7 = r2
            r6 = r3
            goto L_0x0031
        L_0x002d:
            r14 = r0
            r15 = r1
            r7 = r2
            r6 = r3
        L_0x0031:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$n> r0 = r8.mItemDecorations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003c
            r21.invalidate()
        L_0x003c:
            int[] r5 = r8.mReusableIntPair
            r5[r13] = r13
            r5[r12] = r13
            int[] r4 = r8.mScrollOffset
            r16 = 0
            r0 = r21
            r1 = r7
            r2 = r6
            r3 = r14
            r17 = r4
            r4 = r15
            r18 = r5
            r5 = r17
            r19 = r6
            r6 = r16
            r20 = r7
            r7 = r18
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.mReusableIntPair
            r1 = r0[r13]
            int r14 = r14 - r1
            r1 = r0[r12]
            int r15 = r15 - r1
            r1 = r0[r13]
            if (r1 != 0) goto L_0x0070
            r0 = r0[r12]
            if (r0 == 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r0 = 0
            goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            int r1 = r8.mLastTouchX
            int[] r2 = r8.mScrollOffset
            r3 = r2[r13]
            int r1 = r1 - r3
            r8.mLastTouchX = r1
            int r1 = r8.mLastTouchY
            r3 = r2[r12]
            int r1 = r1 - r3
            r8.mLastTouchY = r1
            int[] r1 = r8.mNestedOffsets
            r3 = r1[r13]
            r4 = r2[r13]
            int r3 = r3 + r4
            r1[r13] = r3
            r3 = r1[r12]
            r2 = r2[r12]
            int r3 = r3 + r2
            r1[r12] = r3
            int r1 = r21.getOverScrollMode()
            r2 = 2
            if (r1 == r2) goto L_0x00b2
            if (r11 == 0) goto L_0x00af
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r1 = p000a.p025h.p038m.C0450h.m2193a(r11, r1)
            if (r1 != 0) goto L_0x00af
            float r1 = r24.getX()
            float r2 = (float) r14
            float r3 = r24.getY()
            float r4 = (float) r15
            r8.pullGlows(r1, r2, r3, r4)
        L_0x00af:
            r21.considerReleasingGlowsOnScroll(r22, r23)
        L_0x00b2:
            r2 = r20
            if (r2 != 0) goto L_0x00bb
            r3 = r19
            if (r3 == 0) goto L_0x00c0
            goto L_0x00bd
        L_0x00bb:
            r3 = r19
        L_0x00bd:
            r8.dispatchOnScrolled(r2, r3)
        L_0x00c0:
            boolean r1 = r21.awakenScrollBars()
            if (r1 != 0) goto L_0x00c9
            r21.invalidate()
        L_0x00c9:
            if (r0 != 0) goto L_0x00d1
            if (r2 != 0) goto L_0x00d1
            if (r3 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            r12 = 0
        L_0x00d1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.scrollByInternal(int, int, android.view.MotionEvent):boolean");
    }

    public int computeHorizontalScrollOffset() {
        C0876o oVar = this.mLayout;
        if (oVar != null && oVar.mo4795k()) {
            return this.mLayout.mo4735r(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        C0876o oVar = this.mLayout;
        if (oVar != null && oVar.mo4795k()) {
            return this.mLayout.mo4805q(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C0876o oVar = this.mLayout;
        if (oVar != null && oVar.mo4795k()) {
            return this.mLayout.mo4736s(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C0876o oVar = this.mLayout;
        if (oVar != null && oVar.mo4797l()) {
            return this.mLayout.mo4738u(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C0876o oVar = this.mLayout;
        if (oVar != null && oVar.mo4797l()) {
            return this.mLayout.mo4809t(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C0876o oVar = this.mLayout;
        if (oVar != null && oVar.mo4797l()) {
            return this.mLayout.mo4740v(this.mState);
        }
        return 0;
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public void stopInterceptRequestLayout(boolean performLayoutChildren) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!performLayoutChildren && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (performLayoutChildren && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public final void suppressLayout(boolean suppress) {
        if (suppress != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!suppress) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long now = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Deprecated
    public void setLayoutFrozen(boolean frozen) {
        suppressLayout(frozen);
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition transition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (transition == null) {
                suppressLayout(false);
                return;
            } else if (transition.getAnimator(0) == null && transition.getAnimator(1) == null && transition.getAnimator(2) == null && transition.getAnimator(3) == null && transition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (transition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void smoothScrollBy(int dx, int dy) {
        smoothScrollBy(dx, dy, (Interpolator) null);
    }

    public void smoothScrollBy(int dx, int dy, Interpolator interpolator) {
        smoothScrollBy(dx, dy, interpolator, UNDEFINED_DURATION);
    }

    public void smoothScrollBy(int dx, int dy, Interpolator interpolator, int duration) {
        smoothScrollBy(dx, dy, interpolator, duration, false);
    }

    public void smoothScrollBy(int dx, int dy, Interpolator interpolator, int duration, boolean withNestedScrolling) {
        C0876o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            if (!oVar.mo4795k()) {
                dx = 0;
            }
            if (!this.mLayout.mo4797l()) {
                dy = 0;
            }
            if (dx != 0 || dy != 0) {
                if (duration == Integer.MIN_VALUE || duration > 0) {
                    if (withNestedScrolling) {
                        int nestedScrollAxis = 0;
                        if (dx != 0) {
                            nestedScrollAxis = 0 | 1;
                        }
                        if (dy != 0) {
                            nestedScrollAxis |= 2;
                        }
                        startNestedScroll(nestedScrollAxis, 1);
                    }
                    this.mViewFlinger.mo5044f(dx, dy, duration, interpolator);
                    return;
                }
                scrollBy(dx, dy);
            }
        }
    }

    public boolean fling(int velocityX, int velocityY) {
        C0876o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean canScrollHorizontal = oVar.mo4795k();
            boolean canScrollVertical = this.mLayout.mo4797l();
            if (!canScrollHorizontal || Math.abs(velocityX) < this.mMinFlingVelocity) {
                velocityX = 0;
            }
            if (!canScrollVertical || Math.abs(velocityY) < this.mMinFlingVelocity) {
                velocityY = 0;
            }
            if (!(velocityX == 0 && velocityY == 0) && !dispatchNestedPreFling((float) velocityX, (float) velocityY)) {
                boolean canScroll = canScrollHorizontal || canScrollVertical;
                dispatchNestedFling((float) velocityX, (float) velocityY, canScroll);
                C0883r rVar = this.mOnFlingListener;
                if (rVar != null && rVar.mo3387a(velocityX, velocityY)) {
                    return true;
                }
                if (canScroll) {
                    int nestedScrollAxis = 0;
                    if (canScrollHorizontal) {
                        nestedScrollAxis = 0 | 1;
                    }
                    if (canScrollVertical) {
                        nestedScrollAxis |= 2;
                    }
                    startNestedScroll(nestedScrollAxis, 1);
                    int i = this.mMaxFlingVelocity;
                    int velocityX2 = Math.max(-i, Math.min(velocityX, i));
                    int i2 = this.mMaxFlingVelocity;
                    this.mViewFlinger.mo5041c(velocityX2, Math.max(-i2, Math.min(velocityY, i2)));
                    return true;
                }
            }
            return false;
        }
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.mo5045g();
        C0876o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo5153K1();
        }
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    private void pullGlows(float x, float overscrollX, float y, float overscrollY) {
        boolean invalidate = false;
        if (overscrollX < 0.0f) {
            ensureLeftGlow();
            C0485d.m2414a(this.mLeftGlow, (-overscrollX) / ((float) getWidth()), 1.0f - (y / ((float) getHeight())));
            invalidate = true;
        } else if (overscrollX > 0.0f) {
            ensureRightGlow();
            C0485d.m2414a(this.mRightGlow, overscrollX / ((float) getWidth()), y / ((float) getHeight()));
            invalidate = true;
        }
        if (overscrollY < 0.0f) {
            ensureTopGlow();
            C0485d.m2414a(this.mTopGlow, (-overscrollY) / ((float) getHeight()), x / ((float) getWidth()));
            invalidate = true;
        } else if (overscrollY > 0.0f) {
            ensureBottomGlow();
            C0485d.m2414a(this.mBottomGlow, overscrollY / ((float) getHeight()), 1.0f - (x / ((float) getWidth())));
            invalidate = true;
        }
        if (invalidate || overscrollX != 0.0f || overscrollY != 0.0f) {
            C0460r.m2246U(this);
        }
    }

    private void releaseGlows() {
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            needsInvalidate = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            needsInvalidate |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            needsInvalidate |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            needsInvalidate |= this.mBottomGlow.isFinished();
        }
        if (needsInvalidate) {
            C0460r.m2246U(this);
        }
    }

    public void considerReleasingGlowsOnScroll(int dx, int dy) {
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished() && dx > 0) {
            this.mLeftGlow.onRelease();
            needsInvalidate = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && dx < 0) {
            this.mRightGlow.onRelease();
            needsInvalidate |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && dy > 0) {
            this.mTopGlow.onRelease();
            needsInvalidate |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && dy < 0) {
            this.mBottomGlow.onRelease();
            needsInvalidate |= this.mBottomGlow.isFinished();
        }
        if (needsInvalidate) {
            C0460r.m2246U(this);
        }
    }

    public void absorbGlows(int velocityX, int velocityY) {
        if (velocityX < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-velocityX);
            }
        } else if (velocityX > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(velocityX);
            }
        }
        if (velocityY < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-velocityY);
            }
        } else if (velocityY > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(velocityY);
            }
        }
        if (velocityX != 0 || velocityY != 0) {
            C0460r.m2246U(this);
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo5111a(this, 0);
            this.mLeftGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo5111a(this, 2);
            this.mRightGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo5111a(this, 1);
            this.mTopGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo5111a(this, 3);
            this.mBottomGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void setEdgeEffectFactory(C0869k edgeEffectFactory) {
        C0419h.m2060c(edgeEffectFactory);
        this.mEdgeEffectFactory = edgeEffectFactory;
        invalidateGlows();
    }

    public C0869k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public View focusSearch(View focused, int direction) {
        View result;
        View result2 = this.mLayout.mo5163Q0(focused, direction);
        if (result2 != null) {
            return result2;
        }
        boolean z = true;
        boolean canRunFocusFailure = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder ff = FocusFinder.getInstance();
        if (!canRunFocusFailure || !(direction == 2 || direction == 1)) {
            result = ff.findNextFocus(this, focused, direction);
            if (result == null && canRunFocusFailure) {
                consumePendingUpdateOperations();
                if (findContainingItemView(focused) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                result = this.mLayout.mo4702J0(focused, direction, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            boolean needsFocusFailureLayout = false;
            if (this.mLayout.mo4797l()) {
                int absDir = direction == 2 ? 130 : 33;
                needsFocusFailureLayout = ff.findNextFocus(this, focused, absDir) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    direction = absDir;
                }
            }
            if (!needsFocusFailureLayout && this.mLayout.mo4795k()) {
                int absDir2 = (direction == 2) ^ (this.mLayout.mo5173Z() == 1) ? 66 : 17;
                if (ff.findNextFocus(this, focused, absDir2) != null) {
                    z = false;
                }
                needsFocusFailureLayout = z;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    direction = absDir2;
                }
            }
            if (needsFocusFailureLayout) {
                consumePendingUpdateOperations();
                if (findContainingItemView(focused) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo4702J0(focused, direction, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            result = ff.findNextFocus(this, focused, direction);
        }
        if (result == null || result.hasFocusable()) {
            if (isPreferredNextFocus(focused, result, direction)) {
                return result;
            }
            return super.focusSearch(focused, direction);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(focused, direction);
        } else {
            requestChildOnScreen(result, (View) null);
            return focused;
        }
    }

    private boolean isPreferredNextFocus(View focused, View next, int direction) {
        if (next == null || next == this || findContainingItemView(next) == null) {
            return false;
        }
        if (focused == null || findContainingItemView(focused) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, focused.getWidth(), focused.getHeight());
        this.mTempRect2.set(0, 0, next.getWidth(), next.getHeight());
        offsetDescendantRectToMyCoords(focused, this.mTempRect);
        offsetDescendantRectToMyCoords(next, this.mTempRect2);
        int rtl = this.mLayout.mo5173Z() == 1 ? -1 : 1;
        int rightness = 0;
        Rect rect = this.mTempRect;
        int i = rect.left;
        Rect rect2 = this.mTempRect2;
        int i2 = rect2.left;
        if ((i < i2 || rect.right <= i2) && rect.right < rect2.right) {
            rightness = 1;
        } else {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || i >= i4) && i > i2) {
                rightness = -1;
            }
        }
        int downness = 0;
        int i5 = rect.top;
        int i6 = rect2.top;
        if ((i5 < i6 || rect.bottom <= i6) && rect.bottom < rect2.bottom) {
            downness = 1;
        } else {
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            if ((i7 > i8 || i5 >= i8) && i5 > i6) {
                downness = -1;
            }
        }
        if (direction != 1) {
            if (direction != 2) {
                if (direction != 17) {
                    if (direction != 33) {
                        if (direction != 66) {
                            if (direction != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + direction + exceptionLabel());
                            } else if (downness > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (rightness > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (downness < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (rightness < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (downness > 0 || (downness == 0 && rightness * rtl >= 0)) {
                return true;
            } else {
                return false;
            }
        } else if (downness < 0 || (downness == 0 && rightness * rtl <= 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void requestChildFocus(View child, View focused) {
        if (!this.mLayout.mo5179b1(this, this.mState, child, focused) && focused != null) {
            requestChildOnScreen(child, focused);
        }
        super.requestChildFocus(child, focused);
    }

    private void requestChildOnScreen(View child, View focused) {
        View rectView = focused != null ? focused : child;
        this.mTempRect.set(0, 0, rectView.getWidth(), rectView.getHeight());
        ViewGroup.LayoutParams focusedLayoutParams = rectView.getLayoutParams();
        if (focusedLayoutParams instanceof C0881p) {
            C0881p lp = (C0881p) focusedLayoutParams;
            if (!lp.f3665c) {
                Rect insets = lp.f3664b;
                Rect rect = this.mTempRect;
                rect.left -= insets.left;
                rect.right += insets.right;
                rect.top -= insets.top;
                rect.bottom += insets.bottom;
            }
        }
        if (focused != null) {
            offsetDescendantRectToMyCoords(focused, this.mTempRect);
            offsetRectIntoDescendantCoords(child, this.mTempRect);
        }
        this.mLayout.mo5215s1(this, child, this.mTempRect, !this.mFirstLayoutComplete, focused == null);
    }

    public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate) {
        return this.mLayout.mo5214r1(this, child, rect, immediate);
    }

    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        C0876o oVar = this.mLayout;
        if (oVar == null || !oVar.mo5143F0(this, views, direction, focusableMode)) {
            super.addFocusables(views, direction, focusableMode);
        }
    }

    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(direction, previouslyFocusedRect);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        C0876o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo5227z(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<C0632e> threadLocal = C0632e.f2531f;
            C0632e eVar = threadLocal.get();
            this.mGapWorker = eVar;
            if (eVar == null) {
                this.mGapWorker = new C0632e();
                Display display = C0460r.m2282p(this);
                float refreshRate = 60.0f;
                if (!isInEditMode() && display != null) {
                    float displayRefreshRate = display.getRefreshRate();
                    if (displayRefreshRate >= 30.0f) {
                        refreshRate = displayRefreshRate;
                    }
                }
                C0632e eVar2 = this.mGapWorker;
                eVar2.f2535d = (long) (1.0E9f / refreshRate);
                threadLocal.set(eVar2);
            }
            this.mGapWorker.mo3295a(this);
        }
    }

    public void onDetachedFromWindow() {
        C0632e eVar;
        super.onDetachedFromWindow();
        C0870l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo3243k();
        }
        stopScroll();
        this.mIsAttached = false;
        C0876o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo5132A(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.mo3418j();
        if (ALLOW_THREAD_GAP_WORK && (eVar = this.mGapWorker) != null) {
            eVar.mo3303j(this);
            this.mGapWorker = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public void assertInLayoutOrScroll(String message) {
        if (isComputingLayout()) {
            return;
        }
        if (message == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(message + exceptionLabel());
    }

    public void assertNotInLayoutOrScroll(String message) {
        if (isComputingLayout()) {
            if (message == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(message);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    public void addOnItemTouchListener(C0884s listener) {
        this.mOnItemTouchListeners.add(listener);
    }

    public void removeOnItemTouchListener(C0884s listener) {
        this.mOnItemTouchListeners.remove(listener);
        if (this.mInterceptingOnItemTouchListener == listener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent e) {
        C0884s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar != null) {
            sVar.mo3271c(this, e);
            int action = e.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (e.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(e);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent e) {
        int action = e.getAction();
        int listenerCount = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < listenerCount) {
            C0884s listener = this.mOnItemTouchListeners.get(i);
            if (!listener.mo3270b(this, e) || action == 3) {
                i++;
            } else {
                this.mInterceptingOnItemTouchListener = listener;
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent e) {
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(e)) {
            cancelScroll();
            return true;
        }
        C0876o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean canScrollHorizontally = oVar.mo4795k();
        boolean canScrollVertically = this.mLayout.mo4797l();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(e);
        int action = e.getActionMasked();
        int actionIndex = e.getActionIndex();
        if (action == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = e.getPointerId(0);
            int x = (int) (e.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (e.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int nestedScrollAxis = 0;
            if (canScrollHorizontally) {
                nestedScrollAxis = 0 | 1;
            }
            if (canScrollVertically) {
                nestedScrollAxis |= 2;
            }
            startNestedScroll(nestedScrollAxis, 0);
        } else if (action == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (action == 2) {
            int index = e.findPointerIndex(this.mScrollPointerId);
            if (index < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (e.getX(index) + 0.5f);
            int y2 = (int) (e.getY(index) + 0.5f);
            if (this.mScrollState != 1) {
                int dx = x2 - this.mInitialTouchX;
                int dy = y2 - this.mInitialTouchY;
                boolean startScroll = false;
                if (canScrollHorizontally && Math.abs(dx) > this.mTouchSlop) {
                    this.mLastTouchX = x2;
                    startScroll = true;
                }
                if (canScrollVertically && Math.abs(dy) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    startScroll = true;
                }
                if (startScroll) {
                    setScrollState(1);
                }
            }
        } else if (action == 3) {
            cancelScroll();
        } else if (action == 5) {
            this.mScrollPointerId = e.getPointerId(actionIndex);
            int x3 = (int) (e.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (e.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (action == 6) {
            onPointerUp(e);
        }
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        int listenerCount = this.mOnItemTouchListeners.size();
        for (int i = 0; i < listenerCount; i++) {
            this.mOnItemTouchListeners.get(i).mo3269a(disallowIntercept);
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public boolean onTouchEvent(MotionEvent e) {
        int dy;
        int dx;
        int dy2;
        char c;
        int dx2;
        MotionEvent motionEvent = e;
        int i = 0;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        int i2 = 1;
        if (dispatchToOnItemTouchListeners(e)) {
            cancelScroll();
            return true;
        }
        C0876o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean canScrollHorizontally = oVar.mo4795k();
        boolean canScrollVertically = this.mLayout.mo4797l();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        boolean eventAddedToVelocityTracker = false;
        int action = e.getActionMasked();
        int actionIndex = e.getActionIndex();
        if (action == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent vtev = MotionEvent.obtain(e);
        int[] iArr2 = this.mNestedOffsets;
        vtev.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (action == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (e.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (e.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            int nestedScrollAxis = 0;
            if (canScrollHorizontally) {
                nestedScrollAxis = 0 | 1;
            }
            if (canScrollVertically) {
                nestedScrollAxis |= 2;
            }
            startNestedScroll(nestedScrollAxis, 0);
        } else if (action == 1) {
            this.mVelocityTracker.addMovement(vtev);
            eventAddedToVelocityTracker = true;
            this.mVelocityTracker.computeCurrentVelocity(1000, (float) this.mMaxFlingVelocity);
            float xvel = canScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
            float yvel = canScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
            if ((xvel == 0.0f && yvel == 0.0f) || !fling((int) xvel, (int) yvel)) {
                setScrollState(0);
            }
            resetScroll();
        } else if (action == 2) {
            int index = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (index < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(index) + 0.5f);
            int y2 = (int) (motionEvent.getY(index) + 0.5f);
            int dx3 = this.mLastTouchX - x2;
            int dy3 = this.mLastTouchY - y2;
            if (this.mScrollState != 1) {
                boolean startScroll = false;
                if (canScrollHorizontally) {
                    if (dx3 > 0) {
                        dx3 = Math.max(0, dx3 - this.mTouchSlop);
                    } else {
                        dx3 = Math.min(0, this.mTouchSlop + dx3);
                    }
                    if (dx3 != 0) {
                        startScroll = true;
                    }
                }
                if (canScrollVertically) {
                    if (dy3 > 0) {
                        dy3 = Math.max(0, dy3 - this.mTouchSlop);
                    } else {
                        dy3 = Math.min(0, this.mTouchSlop + dy3);
                    }
                    if (dy3 != 0) {
                        startScroll = true;
                    }
                }
                if (startScroll) {
                    i2 = 1;
                    setScrollState(1);
                } else {
                    i2 = 1;
                }
                dx = dx3;
                dy = dy3;
            } else {
                dx = dx3;
                dy = dy3;
            }
            if (this.mScrollState == i2) {
                int[] iArr3 = this.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[i2] = 0;
                int y3 = y2;
                int x3 = x2;
                int i3 = index;
                if (dispatchNestedPreScroll(canScrollHorizontally ? dx : 0, canScrollVertically ? dy : 0, iArr3, this.mScrollOffset, 0)) {
                    int[] iArr4 = this.mReusableIntPair;
                    int dx4 = dx - iArr4[0];
                    c = 1;
                    int dy4 = dy - iArr4[1];
                    int[] iArr5 = this.mNestedOffsets;
                    int i4 = iArr5[0];
                    int[] iArr6 = this.mScrollOffset;
                    iArr5[0] = i4 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                    dx2 = dx4;
                    dy2 = dy4;
                } else {
                    c = 1;
                    dx2 = dx;
                    dy2 = dy;
                }
                int[] iArr7 = this.mScrollOffset;
                this.mLastTouchX = x3 - iArr7[0];
                this.mLastTouchY = y3 - iArr7[c];
                int i5 = canScrollHorizontally ? dx2 : 0;
                if (canScrollVertically) {
                    i = dy2;
                }
                if (scrollByInternal(i5, i, motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                C0632e eVar = this.mGapWorker;
                if (!(eVar == null || (dx2 == 0 && dy2 == 0))) {
                    eVar.mo3299f(this, dx2, dy2);
                }
            } else {
                int i6 = x2;
                int i7 = index;
            }
        } else if (action == 3) {
            cancelScroll();
        } else if (action == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        } else if (action == 6) {
            onPointerUp(e);
        }
        if (!eventAddedToVelocityTracker) {
            this.mVelocityTracker.addMovement(vtev);
        }
        vtev.recycle();
        return true;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    private void onPointerUp(MotionEvent e) {
        int actionIndex = e.getActionIndex();
        if (e.getPointerId(actionIndex) == this.mScrollPointerId) {
            int newIndex = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = e.getPointerId(newIndex);
            int x = (int) (e.getX(newIndex) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (e.getY(newIndex) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent event) {
        float hScroll;
        float vScroll;
        if (this.mLayout != null && !this.mLayoutSuppressed && event.getAction() == 8) {
            if ((event.getSource() & 2) != 0) {
                if (this.mLayout.mo4797l()) {
                    vScroll = -event.getAxisValue(9);
                } else {
                    vScroll = 0.0f;
                }
                if (this.mLayout.mo4795k()) {
                    hScroll = event.getAxisValue(10);
                } else {
                    hScroll = 0.0f;
                }
            } else if ((event.getSource() & 4194304) != 0) {
                float axisScroll = event.getAxisValue(26);
                if (this.mLayout.mo4797l()) {
                    vScroll = -axisScroll;
                    hScroll = 0.0f;
                } else if (this.mLayout.mo4795k()) {
                    float f = axisScroll;
                    vScroll = 0.0f;
                    hScroll = f;
                } else {
                    vScroll = 0.0f;
                    hScroll = 0.0f;
                }
            } else {
                vScroll = 0.0f;
                hScroll = 0.0f;
            }
            if (!(vScroll == 0.0f && hScroll == 0.0f)) {
                scrollByInternal((int) (this.mScaledHorizontalScrollFactor * hScroll), (int) (this.mScaledVerticalScrollFactor * vScroll), event);
            }
        }
        return false;
    }

    public void onMeasure(int widthSpec, int heightSpec) {
        C0876o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(widthSpec, heightSpec);
            return;
        }
        boolean measureSpecModeIsExactly = false;
        if (oVar.mo4808s0()) {
            int widthMode = View.MeasureSpec.getMode(widthSpec);
            int heightMode = View.MeasureSpec.getMode(heightSpec);
            this.mLayout.mo5174Z0(this.mRecycler, this.mState, widthSpec, heightSpec);
            if (widthMode == 1073741824 && heightMode == 1073741824) {
                measureSpecModeIsExactly = true;
            }
            if (!measureSpecModeIsExactly && this.mAdapter != null) {
                if (this.mState.f3585e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.mo5134A1(widthSpec, heightSpec);
                this.mState.f3590j = true;
                dispatchLayoutStep2();
                this.mLayout.mo5140D1(widthSpec, heightSpec);
                if (this.mLayout.mo4758G1()) {
                    this.mLayout.mo5134A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f3590j = true;
                    dispatchLayoutStep2();
                    this.mLayout.mo5140D1(widthSpec, heightSpec);
                }
            }
        } else if (this.mHasFixedSize != 0) {
            this.mLayout.mo5174Z0(this.mRecycler, this.mState, widthSpec, heightSpec);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                C0856a0 a0Var = this.mState;
                if (a0Var.f3592l) {
                    a0Var.f3588h = true;
                } else {
                    this.mAdapterHelper.mo3165j();
                    this.mState.f3588h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f3592l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0865g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.f3586f = gVar.mo5089c();
            } else {
                this.mState.f3586f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.mo5174Z0(this.mRecycler, this.mState, widthSpec, heightSpec);
            stopInterceptRequestLayout(false);
            this.mState.f3588h = false;
        }
    }

    public void defaultOnMeasure(int widthSpec, int heightSpec) {
        setMeasuredDimension(C0876o.m4568n(widthSpec, getPaddingLeft() + getPaddingRight(), C0460r.m2294x(this)), C0876o.m4568n(heightSpec, getPaddingTop() + getPaddingBottom(), C0460r.m2293w(this)));
    }

    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w != oldw || h != oldh) {
            invalidateGlows();
        }
    }

    public void setItemAnimator(C0870l animator) {
        C0870l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo3243k();
            this.mItemAnimator.mo5122v((C0870l.C0872b) null);
        }
        this.mItemAnimator = animator;
        if (animator != null) {
            animator.mo5122v(this.mItemAnimatorListener);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean enableChangeEvents) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (enableChangeEvents) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    private void dispatchContentChangedIfNecessary() {
        int flags = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (flags != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent event = AccessibilityEvent.obtain();
            event.setEventType(2048);
            C0423b.m2076b(event, flags);
            sendAccessibilityEventUnchecked(event);
        }
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent event) {
        if (!isComputingLayout()) {
            return false;
        }
        int type = 0;
        if (event != null) {
            type = C0423b.m2075a(event);
        }
        if (type == 0) {
            type = 0;
        }
        this.mEatenAccessibilityChangeFlags |= type;
        return true;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {
        if (!shouldDeferAccessibilityEvent(event)) {
            super.sendAccessibilityEventUnchecked(event);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        onPopulateAccessibilityEvent(event);
        return true;
    }

    public C0870l getItemAnimator() {
        return this.mItemAnimator;
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C0460r.m2247V(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo4703L1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.mo3176u();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo4712S0(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.mo3174s();
        } else {
            this.mAdapterHelper.mo3165j();
        }
        boolean z2 = false;
        boolean animationTypeSupported = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f3591k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || animationTypeSupported || this.mLayout.f3646h) && (!z || this.mAdapter.mo5093g());
        C0856a0 a0Var = this.mState;
        if (a0Var.f3591k && animationTypeSupported && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        a0Var.f3592l = z2;
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            C0856a0 a0Var = this.mState;
            a0Var.f3590j = false;
            if (a0Var.f3585e == 1) {
                dispatchLayoutStep1();
                this.mLayout.mo5229z1(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.mo3172q() && this.mLayout.mo5207o0() == getWidth() && this.mLayout.mo5170W() == getHeight()) {
                this.mLayout.mo5229z1(this);
            } else {
                this.mLayout.mo5229z1(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    private void saveFocusInfo() {
        int i;
        View child = null;
        if (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) {
            child = getFocusedChild();
        }
        C0862d0 focusedVh = child == null ? null : findContainingViewHolder(child);
        if (focusedVh == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f3594n = this.mAdapter.mo5093g() ? focusedVh.mo5069k() : -1;
        C0856a0 a0Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            i = -1;
        } else if (focusedVh.mo5081v()) {
            i = focusedVh.f3611d;
        } else {
            i = focusedVh.mo5068j();
        }
        a0Var.f3593m = i;
        this.mState.f3595o = getDeepestFocusedViewWithId(focusedVh.f3608a);
    }

    private void resetFocusInfo() {
        C0856a0 a0Var = this.mState;
        a0Var.f3594n = -1;
        a0Var.f3593m = -1;
        a0Var.f3595o = -1;
    }

    private View findNextViewToFocus() {
        C0862d0 nextFocus;
        C0856a0 a0Var = this.mState;
        int startFocusSearchIndex = a0Var.f3593m;
        if (startFocusSearchIndex == -1) {
            startFocusSearchIndex = 0;
        }
        int itemCount = a0Var.mo5029b();
        int i = startFocusSearchIndex;
        while (i < itemCount) {
            C0862d0 nextFocus2 = findViewHolderForAdapterPosition(i);
            if (nextFocus2 == null) {
                break;
            } else if (nextFocus2.f3608a.hasFocusable()) {
                return nextFocus2.f3608a;
            } else {
                i++;
            }
        }
        int i2 = Math.min(itemCount, startFocusSearchIndex) - 1;
        while (i2 >= 0 && (nextFocus = findViewHolderForAdapterPosition(i2)) != null) {
            if (nextFocus.f3608a.hasFocusable()) {
                return nextFocus.f3608a;
            }
            i2--;
        }
        return null;
    }

    private void recoverFocusFromState() {
        View child;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.mo3203n(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.mo3196g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                C0862d0 focusTarget = null;
                if (this.mState.f3594n != -1 && this.mAdapter.mo5093g()) {
                    focusTarget = findViewHolderForItemId(this.mState.f3594n);
                }
                View viewToFocus = null;
                if (focusTarget != null && !this.mChildHelper.mo3203n(focusTarget.f3608a) && focusTarget.f3608a.hasFocusable()) {
                    viewToFocus = focusTarget.f3608a;
                } else if (this.mChildHelper.mo3196g() > 0) {
                    viewToFocus = findNextViewToFocus();
                }
                if (viewToFocus != null) {
                    int i = this.mState.f3595o;
                    if (!(((long) i) == -1 || (child = viewToFocus.findViewById(i)) == null || !child.isFocusable())) {
                        viewToFocus = child;
                    }
                    viewToFocus.requestFocus();
                }
            }
        }
    }

    private int getDeepestFocusedViewWithId(View view) {
        int lastKnownId = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                lastKnownId = view.getId();
            }
        }
        return lastKnownId;
    }

    public final void fillRemainingScrollValues(C0856a0 state) {
        if (getScrollState() == 2) {
            OverScroller scroller = this.mViewFlinger.f3601d;
            state.f3596p = scroller.getFinalX() - scroller.getCurrX();
            state.f3597q = scroller.getFinalY() - scroller.getCurrY();
            return;
        }
        state.f3596p = 0;
        state.f3597q = 0;
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.mo5028a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f3590j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.mo3414f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0856a0 a0Var = this.mState;
        if (!a0Var.f3591k || !this.mItemsChanged) {
            z = false;
        }
        a0Var.f3589i = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0Var.f3588h = a0Var.f3592l;
        a0Var.f3586f = this.mAdapter.mo5089c();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f3591k) {
            int count = this.mChildHelper.mo3196g();
            for (int i = 0; i < count; i++) {
                C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3195f(i));
                if (!holder.mo5056J() && (!holder.mo5078t() || this.mAdapter.mo5093g())) {
                    this.mViewInfoStore.mo3413e(holder, this.mItemAnimator.mo5121t(this.mState, holder, C0870l.m4533e(holder), holder.mo5073o()));
                    if (this.mState.f3589i && holder.mo5084y() && !holder.mo5081v() && !holder.mo5056J() && !holder.mo5078t()) {
                        this.mViewInfoStore.mo3411c(getChangedHolderKey(holder), holder);
                    }
                }
            }
        }
        if (this.mState.f3592l) {
            saveOldPositions();
            C0856a0 a0Var2 = this.mState;
            boolean didStructureChange = a0Var2.f3587g;
            a0Var2.f3587g = false;
            this.mLayout.mo4721X0(this.mRecycler, a0Var2);
            this.mState.f3587g = didStructureChange;
            for (int i2 = 0; i2 < this.mChildHelper.mo3196g(); i2++) {
                C0862d0 viewHolder = getChildViewHolderInt(this.mChildHelper.mo3195f(i2));
                if (!viewHolder.mo5056J() && !this.mViewInfoStore.mo3417i(viewHolder)) {
                    int flags = C0870l.m4533e(viewHolder);
                    boolean wasHidden = viewHolder.mo5074p(8192);
                    if (!wasHidden) {
                        flags |= 4096;
                    }
                    C0870l.C0873c animationInfo = this.mItemAnimator.mo5121t(this.mState, viewHolder, flags, viewHolder.mo5073o());
                    if (wasHidden) {
                        recordAnimationInfoIfBouncedHiddenView(viewHolder, animationInfo);
                    } else {
                        this.mViewInfoStore.mo3409a(viewHolder, animationInfo);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f3585e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.mo5028a(6);
        this.mAdapterHelper.mo3165j();
        this.mState.f3586f = this.mAdapter.mo5089c();
        C0856a0 a0Var = this.mState;
        a0Var.f3584d = 0;
        a0Var.f3588h = false;
        this.mLayout.mo4721X0(this.mRecycler, a0Var);
        C0856a0 a0Var2 = this.mState;
        a0Var2.f3587g = false;
        this.mPendingSavedState = null;
        a0Var2.f3591k = a0Var2.f3591k && this.mItemAnimator != null;
        a0Var2.f3585e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.mo5028a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0856a0 a0Var = this.mState;
        a0Var.f3585e = 1;
        if (a0Var.f3591k) {
            for (int i = this.mChildHelper.mo3196g() - 1; i >= 0; i--) {
                C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3195f(i));
                if (!holder.mo5056J()) {
                    long key = getChangedHolderKey(holder);
                    C0870l.C0873c animationInfo = this.mItemAnimator.mo5120s(this.mState, holder);
                    C0862d0 oldChangeViewHolder = this.mViewInfoStore.mo3415g(key);
                    if (oldChangeViewHolder == null || oldChangeViewHolder.mo5056J()) {
                        this.mViewInfoStore.mo3412d(holder, animationInfo);
                    } else {
                        boolean oldDisappearing = this.mViewInfoStore.mo3416h(oldChangeViewHolder);
                        boolean newDisappearing = this.mViewInfoStore.mo3416h(holder);
                        if (!oldDisappearing || oldChangeViewHolder != holder) {
                            C0870l.C0873c preInfo = this.mViewInfoStore.mo3422n(oldChangeViewHolder);
                            this.mViewInfoStore.mo3412d(holder, animationInfo);
                            C0870l.C0873c postInfo = this.mViewInfoStore.mo3421m(holder);
                            if (preInfo == null) {
                                handleMissingPreInfoForChangeError(key, holder, oldChangeViewHolder);
                            } else {
                                animateChange(oldChangeViewHolder, holder, preInfo, postInfo, oldDisappearing, newDisappearing);
                            }
                        } else {
                            this.mViewInfoStore.mo3412d(holder, animationInfo);
                        }
                    }
                }
            }
            this.mViewInfoStore.mo3423o(this.mViewInfoProcessCallback);
        }
        this.mLayout.mo5202l1(this.mRecycler);
        C0856a0 a0Var2 = this.mState;
        a0Var2.f3583c = a0Var2.f3586f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.f3591k = false;
        a0Var2.f3592l = false;
        this.mLayout.f3646h = false;
        ArrayList<C0862d0> arrayList = this.mRecycler.f3674b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C0876o oVar = this.mLayout;
        if (oVar.f3652n) {
            oVar.f3651m = 0;
            oVar.f3652n = false;
            this.mRecycler.mo5258K();
        }
        this.mLayout.mo4723Y0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.mo3414f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private void handleMissingPreInfoForChangeError(long key, C0862d0 holder, C0862d0 oldChangeViewHolder) {
        int childCount = this.mChildHelper.mo3196g();
        for (int i = 0; i < childCount; i++) {
            C0862d0 other = getChildViewHolderInt(this.mChildHelper.mo3195f(i));
            if (other != holder && getChangedHolderKey(other) == key) {
                C0865g gVar = this.mAdapter;
                if (gVar == null || !gVar.mo5093g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + other + " \n View Holder 2:" + holder + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + other + " \n View Holder 2:" + holder + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + oldChangeViewHolder + " cannot be found but it is necessary for " + holder + exceptionLabel());
    }

    public void recordAnimationInfoIfBouncedHiddenView(C0862d0 viewHolder, C0870l.C0873c animationInfo) {
        viewHolder.mo5052F(0, 8192);
        if (this.mState.f3589i && viewHolder.mo5084y() && !viewHolder.mo5081v() && !viewHolder.mo5056J()) {
            this.mViewInfoStore.mo3411c(getChangedHolderKey(viewHolder), viewHolder);
        }
        this.mViewInfoStore.mo3413e(viewHolder, animationInfo);
    }

    private void findMinMaxChildLayoutPositions(int[] into) {
        int count = this.mChildHelper.mo3196g();
        if (count == 0) {
            into[0] = -1;
            into[1] = -1;
            return;
        }
        int minPositionPreLayout = Integer.MAX_VALUE;
        int maxPositionPreLayout = UNDEFINED_DURATION;
        for (int i = 0; i < count; i++) {
            C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3195f(i));
            if (!holder.mo5056J()) {
                int pos = holder.mo5071m();
                if (pos < minPositionPreLayout) {
                    minPositionPreLayout = pos;
                }
                if (pos > maxPositionPreLayout) {
                    maxPositionPreLayout = pos;
                }
            }
        }
        into[0] = minPositionPreLayout;
        into[1] = maxPositionPreLayout;
    }

    private boolean didChildRangeChange(int minPositionPreLayout, int maxPositionPreLayout) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == minPositionPreLayout && iArr[1] == maxPositionPreLayout) ? false : true;
    }

    public void removeDetachedView(View child, boolean animate) {
        C0862d0 vh = getChildViewHolderInt(child);
        if (vh != null) {
            if (vh.mo5083x()) {
                vh.mo5064f();
            } else if (!vh.mo5056J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + vh + exceptionLabel());
            }
        }
        child.clearAnimation();
        dispatchChildDetached(child);
        super.removeDetachedView(child, animate);
    }

    public long getChangedHolderKey(C0862d0 holder) {
        return this.mAdapter.mo5093g() ? holder.mo5069k() : (long) holder.f3610c;
    }

    public void animateAppearance(C0862d0 itemHolder, C0870l.C0873c preLayoutInfo, C0870l.C0873c postLayoutInfo) {
        itemHolder.mo5053G(false);
        if (this.mItemAnimator.mo3382a(itemHolder, preLayoutInfo, postLayoutInfo)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(C0862d0 holder, C0870l.C0873c preLayoutInfo, C0870l.C0873c postLayoutInfo) {
        addAnimatingView(holder);
        holder.mo5053G(false);
        if (this.mItemAnimator.mo3384c(holder, preLayoutInfo, postLayoutInfo)) {
            postAnimationRunner();
        }
    }

    private void animateChange(C0862d0 oldHolder, C0862d0 newHolder, C0870l.C0873c preInfo, C0870l.C0873c postInfo, boolean oldHolderDisappearing, boolean newHolderDisappearing) {
        oldHolder.mo5053G(false);
        if (oldHolderDisappearing) {
            addAnimatingView(oldHolder);
        }
        if (oldHolder != newHolder) {
            if (newHolderDisappearing) {
                addAnimatingView(newHolder);
            }
            oldHolder.f3615h = newHolder;
            addAnimatingView(oldHolder);
            this.mRecycler.mo5257J(oldHolder);
            newHolder.mo5053G(false);
            newHolder.f3616i = oldHolder;
        }
        if (this.mItemAnimator.mo3383b(oldHolder, newHolder, preInfo, postInfo)) {
            postAnimationRunner();
        }
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        C0380a.m1964a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C0380a.m1965b();
        this.mFirstLayoutComplete = true;
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void markItemDecorInsetsDirty() {
        int childCount = this.mChildHelper.mo3199j();
        for (int i = 0; i < childCount; i++) {
            ((C0881p) this.mChildHelper.mo3198i(i).getLayoutParams()).f3665c = true;
        }
        this.mRecycler.mo5279s();
    }

    public void draw(Canvas c) {
        super.draw(c);
        int count = this.mItemDecorations.size();
        for (int i = 0; i < count; i++) {
            this.mItemDecorations.get(i).mo3272i(c, this, this.mState);
        }
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int restore = c.save();
            int padding = this.mClipToPadding ? getPaddingBottom() : 0;
            c.rotate(270.0f);
            c.translate((float) ((-getHeight()) + padding), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            needsInvalidate = edgeEffect2 != null && edgeEffect2.draw(c);
            c.restoreToCount(restore);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int restore2 = c.save();
            if (this.mClipToPadding) {
                c.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            needsInvalidate |= edgeEffect4 != null && edgeEffect4.draw(c);
            c.restoreToCount(restore2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int restore3 = c.save();
            int width = getWidth();
            int padding2 = this.mClipToPadding ? getPaddingTop() : 0;
            c.rotate(90.0f);
            c.translate((float) (-padding2), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            needsInvalidate |= edgeEffect6 != null && edgeEffect6.draw(c);
            c.restoreToCount(restore3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int restore4 = c.save();
            c.rotate(180.0f);
            if (this.mClipToPadding) {
                c.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                c.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 == null || !edgeEffect8.draw(c)) {
                z = false;
            }
            needsInvalidate |= z;
            c.restoreToCount(restore4);
        }
        if (!needsInvalidate && this.mItemAnimator != null && this.mItemDecorations.size() > 0 && this.mItemAnimator.mo3244p()) {
            needsInvalidate = true;
        }
        if (needsInvalidate) {
            C0460r.m2246U(this);
        }
    }

    public void onDraw(Canvas c) {
        super.onDraw(c);
        int count = this.mItemDecorations.size();
        for (int i = 0; i < count; i++) {
            this.mItemDecorations.get(i).mo5130g(c, this, this.mState);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return (p instanceof C0881p) && this.mLayout.mo4734m((C0881p) p);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0876o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo4698D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        C0876o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo4699E(getContext(), attrs);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        C0876o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo4701F(p);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public boolean isAnimating() {
        C0870l lVar = this.mItemAnimator;
        return lVar != null && lVar.mo3244p();
    }

    public void saveOldPositions() {
        int childCount = this.mChildHelper.mo3199j();
        for (int i = 0; i < childCount; i++) {
            C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3198i(i));
            if (!holder.mo5056J()) {
                holder.mo5051E();
            }
        }
    }

    public void clearOldPositions() {
        int childCount = this.mChildHelper.mo3199j();
        for (int i = 0; i < childCount; i++) {
            C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3198i(i));
            if (!holder.mo5056J()) {
                holder.mo5061c();
            }
        }
        this.mRecycler.mo5264d();
    }

    public void offsetPositionRecordsForMove(int from, int to) {
        int inBetweenOffset;
        int end;
        int start;
        int i;
        int childCount = this.mChildHelper.mo3199j();
        if (from < to) {
            start = from;
            end = to;
            inBetweenOffset = -1;
        } else {
            start = to;
            end = from;
            inBetweenOffset = 1;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3198i(i2));
            if (holder != null && (i = holder.f3610c) >= start && i <= end) {
                if (i == from) {
                    holder.mo5047A(to - from, false);
                } else {
                    holder.mo5047A(inBetweenOffset, false);
                }
                this.mState.f3587g = true;
            }
        }
        this.mRecycler.mo5282v(from, to);
        requestLayout();
    }

    public void offsetPositionRecordsForInsert(int positionStart, int itemCount) {
        int childCount = this.mChildHelper.mo3199j();
        for (int i = 0; i < childCount; i++) {
            C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3198i(i));
            if (holder != null && !holder.mo5056J() && holder.f3610c >= positionStart) {
                holder.mo5047A(itemCount, false);
                this.mState.f3587g = true;
            }
        }
        this.mRecycler.mo5281u(positionStart, itemCount);
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int positionStart, int itemCount, boolean applyToPreLayout) {
        int positionEnd = positionStart + itemCount;
        int childCount = this.mChildHelper.mo3199j();
        for (int i = 0; i < childCount; i++) {
            C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3198i(i));
            if (holder != null && !holder.mo5056J()) {
                int i2 = holder.f3610c;
                if (i2 >= positionEnd) {
                    holder.mo5047A(-itemCount, applyToPreLayout);
                    this.mState.f3587g = true;
                } else if (i2 >= positionStart) {
                    holder.mo5067i(positionStart - 1, -itemCount, applyToPreLayout);
                    this.mState.f3587g = true;
                }
            }
        }
        this.mRecycler.mo5283w(positionStart, itemCount, applyToPreLayout);
        requestLayout();
    }

    public void viewRangeUpdate(int positionStart, int itemCount, Object payload) {
        int i;
        int childCount = this.mChildHelper.mo3199j();
        int positionEnd = positionStart + itemCount;
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = this.mChildHelper.mo3198i(i2);
            C0862d0 holder = getChildViewHolderInt(child);
            if (holder != null && !holder.mo5056J() && (i = holder.f3610c) >= positionStart && i < positionEnd) {
                holder.mo5060b(2);
                holder.mo5059a(payload);
                ((C0881p) child.getLayoutParams()).f3665c = true;
            }
        }
        this.mRecycler.mo5260M(positionStart, itemCount);
    }

    public boolean canReuseUpdatedViewHolder(C0862d0 viewHolder) {
        C0870l lVar = this.mItemAnimator;
        return lVar == null || lVar.mo3241g(viewHolder, viewHolder.mo5073o());
    }

    public void processDataSetCompletelyChanged(boolean dispatchItemsChanged) {
        this.mDispatchItemsChangedEvent |= dispatchItemsChanged;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void markKnownViewsInvalid() {
        int childCount = this.mChildHelper.mo3199j();
        for (int i = 0; i < childCount; i++) {
            C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3198i(i));
            if (holder != null && !holder.mo5056J()) {
                holder.mo5060b(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.mo5280t();
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            C0876o oVar = this.mLayout;
            if (oVar != null) {
                oVar.mo4791g("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public void setPreserveFocusAfterLayout(boolean preserveFocusAfterLayout) {
        this.mPreserveFocusAfterLayout = preserveFocusAfterLayout;
    }

    public C0862d0 getChildViewHolder(View child) {
        ViewParent parent = child.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(child);
        }
        throw new IllegalArgumentException("View " + child + " is not a direct child of " + this);
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public C0862d0 findContainingViewHolder(View view) {
        View itemView = findContainingItemView(view);
        if (itemView == null) {
            return null;
        }
        return getChildViewHolder(itemView);
    }

    public static C0862d0 getChildViewHolderInt(View child) {
        if (child == null) {
            return null;
        }
        return ((C0881p) child.getLayoutParams()).f3663a;
    }

    @Deprecated
    public int getChildPosition(View child) {
        return getChildAdapterPosition(child);
    }

    public int getChildAdapterPosition(View child) {
        C0862d0 holder = getChildViewHolderInt(child);
        if (holder != null) {
            return holder.mo5068j();
        }
        return -1;
    }

    public int getChildLayoutPosition(View child) {
        C0862d0 holder = getChildViewHolderInt(child);
        if (holder != null) {
            return holder.mo5071m();
        }
        return -1;
    }

    public long getChildItemId(View child) {
        C0862d0 holder;
        C0865g gVar = this.mAdapter;
        if (gVar == null || !gVar.mo5093g() || (holder = getChildViewHolderInt(child)) == null) {
            return -1;
        }
        return holder.mo5069k();
    }

    @Deprecated
    public C0862d0 findViewHolderForPosition(int position) {
        return findViewHolderForPosition(position, false);
    }

    public C0862d0 findViewHolderForLayoutPosition(int position) {
        return findViewHolderForPosition(position, false);
    }

    public C0862d0 findViewHolderForAdapterPosition(int position) {
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int childCount = this.mChildHelper.mo3199j();
        C0862d0 hidden = null;
        for (int i = 0; i < childCount; i++) {
            C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3198i(i));
            if (holder != null && !holder.mo5081v() && getAdapterPositionFor(holder) == position) {
                if (!this.mChildHelper.mo3203n(holder.f3608a)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    public C0862d0 findViewHolderForPosition(int position, boolean checkNewPosition) {
        int childCount = this.mChildHelper.mo3199j();
        C0862d0 hidden = null;
        for (int i = 0; i < childCount; i++) {
            C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3198i(i));
            if (holder != null && !holder.mo5081v()) {
                if (checkNewPosition) {
                    if (holder.f3610c != position) {
                        continue;
                    }
                } else if (holder.mo5071m() != position) {
                    continue;
                }
                if (!this.mChildHelper.mo3203n(holder.f3608a)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    public C0862d0 findViewHolderForItemId(long id) {
        C0865g gVar = this.mAdapter;
        if (gVar == null || !gVar.mo5093g()) {
            return null;
        }
        int childCount = this.mChildHelper.mo3199j();
        C0862d0 hidden = null;
        for (int i = 0; i < childCount; i++) {
            C0862d0 holder = getChildViewHolderInt(this.mChildHelper.mo3198i(i));
            if (holder != null && !holder.mo5081v() && holder.mo5069k() == id) {
                if (!this.mChildHelper.mo3203n(holder.f3608a)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    public View findChildViewUnder(float x, float y) {
        for (int i = this.mChildHelper.mo3196g() - 1; i >= 0; i--) {
            View child = this.mChildHelper.mo3195f(i);
            float translationX = child.getTranslationX();
            float translationY = child.getTranslationY();
            if (x >= ((float) child.getLeft()) + translationX && x <= ((float) child.getRight()) + translationX && y >= ((float) child.getTop()) + translationY && y <= ((float) child.getBottom()) + translationY) {
                return child;
            }
        }
        return null;
    }

    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        return super.drawChild(canvas, child, drawingTime);
    }

    public void offsetChildrenVertical(int dy) {
        int childCount = this.mChildHelper.mo3196g();
        for (int i = 0; i < childCount; i++) {
            this.mChildHelper.mo3195f(i).offsetTopAndBottom(dy);
        }
    }

    public void onChildAttachedToWindow(View child) {
    }

    public void onChildDetachedFromWindow(View child) {
    }

    public void offsetChildrenHorizontal(int dx) {
        int childCount = this.mChildHelper.mo3196g();
        for (int i = 0; i < childCount; i++) {
            this.mChildHelper.mo3195f(i).offsetLeftAndRight(dx);
        }
    }

    public void getDecoratedBoundsWithMargins(View view, Rect outBounds) {
        getDecoratedBoundsWithMarginsInt(view, outBounds);
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect outBounds) {
        C0881p lp = (C0881p) view.getLayoutParams();
        Rect insets = lp.f3664b;
        outBounds.set((view.getLeft() - insets.left) - lp.leftMargin, (view.getTop() - insets.top) - lp.topMargin, view.getRight() + insets.right + lp.rightMargin, view.getBottom() + insets.bottom + lp.bottomMargin);
    }

    public Rect getItemDecorInsetsForChild(View child) {
        C0881p lp = (C0881p) child.getLayoutParams();
        if (!lp.f3665c) {
            return lp.f3664b;
        }
        if (this.mState.mo5032e() && (lp.mo5231b() || lp.mo5233d())) {
            return lp.f3664b;
        }
        Rect insets = lp.f3664b;
        insets.set(0, 0, 0, 0);
        int decorCount = this.mItemDecorations.size();
        for (int i = 0; i < decorCount; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).mo5128e(this.mTempRect, child, this, this.mState);
            int i2 = insets.left;
            Rect rect = this.mTempRect;
            insets.left = i2 + rect.left;
            insets.top += rect.top;
            insets.right += rect.right;
            insets.bottom += rect.bottom;
        }
        lp.f3665c = false;
        return insets;
    }

    public void onScrolled(int dx, int dy) {
    }

    public void dispatchOnScrolled(int hresult, int vresult) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - hresult, scrollY - vresult);
        onScrolled(hresult, vresult);
        C0885t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo3291b(this, hresult, vresult);
        }
        List<C0885t> list = this.mScrollListeners;
        if (list != null) {
            for (int i = list.size() - 1; i >= 0; i--) {
                this.mScrollListeners.get(i).mo3291b(this, hresult, vresult);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void onScrollStateChanged(int state) {
    }

    public void dispatchOnScrollStateChanged(int state) {
        C0876o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo5186e1(state);
        }
        onScrollStateChanged(state);
        C0885t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo3396a(this, state);
        }
        List<C0885t> list = this.mScrollListeners;
        if (list != null) {
            for (int i = list.size() - 1; i >= 0; i--) {
                this.mScrollListeners.get(i).mo3396a(this, state);
            }
        }
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mo3171p();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    public class C0860c0 implements Runnable {

        /* renamed from: b */
        public int f3599b;

        /* renamed from: c */
        public int f3600c;

        /* renamed from: d */
        public OverScroller f3601d;

        /* renamed from: e */
        public Interpolator f3602e;

        /* renamed from: f */
        public boolean f3603f = false;

        /* renamed from: g */
        public boolean f3604g = false;

        public C0860c0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f3602e = interpolator;
            this.f3601d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void run() {
            boolean z;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                mo5045g();
                return;
            }
            this.f3604g = false;
            this.f3603f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller scroller = this.f3601d;
            if (scroller.computeScrollOffset()) {
                int x = scroller.getCurrX();
                int y = scroller.getCurrY();
                int unconsumedX = x - this.f3599b;
                int unconsumedY = y - this.f3600c;
                this.f3599b = x;
                this.f3600c = y;
                int consumedX = 0;
                int consumedY = 0;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(unconsumedX, unconsumedY, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    unconsumedX -= iArr2[0];
                    unconsumedY -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(unconsumedX, unconsumedY);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(unconsumedX, unconsumedY, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    consumedX = iArr4[0];
                    consumedY = iArr4[1];
                    unconsumedX -= consumedX;
                    unconsumedY -= consumedY;
                    C0893z smoothScroller = recyclerView4.mLayout.f3645g;
                    if (smoothScroller != null && !smoothScroller.mo5301g() && smoothScroller.mo5302h()) {
                        int adapterSize = RecyclerView.this.mState.mo5029b();
                        if (adapterSize == 0) {
                            smoothScroller.mo5308r();
                        } else if (smoothScroller.mo5300f() >= adapterSize) {
                            smoothScroller.mo5306p(adapterSize - 1);
                            smoothScroller.mo5304j(consumedX, consumedY);
                        } else {
                            smoothScroller.mo5304j(consumedX, consumedY);
                        }
                    }
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(consumedX, consumedY, unconsumedX, unconsumedY, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int unconsumedX2 = unconsumedX - iArr6[0];
                int unconsumedY2 = unconsumedY - iArr6[1];
                if (!(consumedX == 0 && consumedY == 0)) {
                    recyclerView6.dispatchOnScrolled(consumedX, consumedY);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean doneScrolling = scroller.isFinished() || (((scroller.getCurrX() == scroller.getFinalX()) || unconsumedX2 != 0) && ((scroller.getCurrY() == scroller.getFinalY()) || unconsumedY2 != 0));
                C0893z smoothScroller2 = RecyclerView.this.mLayout.f3645g;
                if ((smoothScroller2 != null && smoothScroller2.mo5301g()) || !doneScrolling) {
                    mo5043e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    C0632e eVar = recyclerView7.mGapWorker;
                    if (eVar != null) {
                        eVar.mo3299f(recyclerView7, consumedX, consumedY);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int vel = (int) scroller.getCurrVelocity();
                        OverScroller overScroller = scroller;
                        RecyclerView.this.absorbGlows(unconsumedX2 < 0 ? -vel : unconsumedX2 > 0 ? vel : 0, unconsumedY2 < 0 ? -vel : unconsumedY2 > 0 ? vel : 0);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.mo3308b();
                    }
                }
            }
            C0893z smoothScroller3 = RecyclerView.this.mLayout.f3645g;
            if (smoothScroller3 == null || !smoothScroller3.mo5301g()) {
                z = false;
            } else {
                z = false;
                smoothScroller3.mo5304j(0, 0);
            }
            this.f3603f = z;
            if (this.f3604g) {
                mo5042d();
                return;
            }
            RecyclerView.this.setScrollState(z ? 1 : 0);
            RecyclerView.this.stopNestedScroll(1);
        }

        /* renamed from: e */
        public void mo5043e() {
            if (this.f3603f) {
                this.f3604g = true;
            } else {
                mo5042d();
            }
        }

        /* renamed from: d */
        public final void mo5042d() {
            RecyclerView.this.removeCallbacks(this);
            C0460r.m2247V(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void mo5041c(int velocityX, int velocityY) {
            RecyclerView.this.setScrollState(2);
            this.f3600c = 0;
            this.f3599b = 0;
            Interpolator interpolator = this.f3602e;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f3602e = interpolator2;
                this.f3601d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3601d.fling(0, 0, velocityX, velocityY, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
            mo5043e();
        }

        /* renamed from: f */
        public void mo5044f(int dx, int dy, int duration, Interpolator interpolator) {
            if (duration == Integer.MIN_VALUE) {
                duration = mo5039a(dx, dy, 0, 0);
            }
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f3602e != interpolator) {
                this.f3602e = interpolator;
                this.f3601d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3600c = 0;
            this.f3599b = 0;
            RecyclerView.this.setScrollState(2);
            this.f3601d.startScroll(0, 0, dx, dy, duration);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3601d.computeScrollOffset();
            }
            mo5043e();
        }

        /* renamed from: b */
        public final float mo5040b(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: a */
        public final int mo5039a(int dx, int dy, int vx, int vy) {
            int duration;
            int absDx = Math.abs(dx);
            int absDy = Math.abs(dy);
            boolean horizontal = absDx > absDy;
            int velocity = (int) Math.sqrt((double) ((vx * vx) + (vy * vy)));
            int delta = (int) Math.sqrt((double) ((dx * dx) + (dy * dy)));
            RecyclerView recyclerView = RecyclerView.this;
            int containerSize = horizontal ? recyclerView.getWidth() : recyclerView.getHeight();
            int halfContainerSize = containerSize / 2;
            float distance = ((float) halfContainerSize) + (((float) halfContainerSize) * mo5040b(Math.min(1.0f, (((float) delta) * 1.0f) / ((float) containerSize))));
            if (velocity > 0) {
                duration = Math.round(Math.abs(distance / ((float) velocity)) * 1000.0f) * 4;
            } else {
                duration = (int) (((((float) (horizontal ? absDx : absDy)) / ((float) containerSize)) + 1.0f) * 300.0f);
            }
            return Math.min(duration, RecyclerView.MAX_SCROLL_DURATION);
        }

        /* renamed from: g */
        public void mo5045g() {
            RecyclerView.this.removeCallbacks(this);
            this.f3601d.abortAnimation();
        }
    }

    public void repositionShadowingViews() {
        C0862d0 d0Var;
        int count = this.mChildHelper.mo3196g();
        for (int i = 0; i < count; i++) {
            View view = this.mChildHelper.mo3195f(i);
            C0862d0 holder = getChildViewHolder(view);
            if (!(holder == null || (d0Var = holder.f3616i) == null)) {
                View shadowingView = d0Var.f3608a;
                int left = view.getLeft();
                int top = view.getTop();
                if (left != shadowingView.getLeft() || top != shadowingView.getTop()) {
                    shadowingView.layout(left, top, shadowingView.getWidth() + left, shadowingView.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public class C0890x extends C0867i {
        public C0890x() {
        }

        /* renamed from: a */
        public void mo5109a() {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f3587g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.mo3171p()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C0869k {
        /* renamed from: a */
        public EdgeEffect mo5111a(RecyclerView view, int direction) {
            return new EdgeEffect(view.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0886u {

        /* renamed from: a */
        public SparseArray<C0887a> f3667a = new SparseArray<>();

        /* renamed from: b */
        public int f3668b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        public static class C0887a {

            /* renamed from: a */
            public final ArrayList<C0862d0> f3669a = new ArrayList<>();

            /* renamed from: b */
            public int f3670b = 5;

            /* renamed from: c */
            public long f3671c = 0;

            /* renamed from: d */
            public long f3672d = 0;
        }

        /* renamed from: b */
        public void mo5237b() {
            for (int i = 0; i < this.f3667a.size(); i++) {
                this.f3667a.valueAt(i).f3669a.clear();
            }
        }

        /* renamed from: f */
        public C0862d0 mo5241f(int viewType) {
            C0887a scrapData = this.f3667a.get(viewType);
            if (scrapData == null || scrapData.f3669a.isEmpty()) {
                return null;
            }
            ArrayList<C0862d0> arrayList = scrapData.f3669a;
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                if (!arrayList.get(i).mo5076r()) {
                    return arrayList.remove(i);
                }
            }
            return null;
        }

        /* renamed from: i */
        public void mo5244i(C0862d0 scrap) {
            int viewType = scrap.mo5070l();
            ArrayList<C0862d0> arrayList = mo5242g(viewType).f3669a;
            if (this.f3667a.get(viewType).f3670b > arrayList.size()) {
                scrap.mo5050D();
                arrayList.add(scrap);
            }
        }

        /* renamed from: j */
        public long mo5245j(long oldAverage, long newValue) {
            if (oldAverage == 0) {
                return newValue;
            }
            return ((oldAverage / 4) * 3) + (newValue / 4);
        }

        /* renamed from: e */
        public void mo5240e(int viewType, long createTimeNs) {
            C0887a scrapData = mo5242g(viewType);
            scrapData.f3671c = mo5245j(scrapData.f3671c, createTimeNs);
        }

        /* renamed from: d */
        public void mo5239d(int viewType, long bindTimeNs) {
            C0887a scrapData = mo5242g(viewType);
            scrapData.f3672d = mo5245j(scrapData.f3672d, bindTimeNs);
        }

        /* renamed from: l */
        public boolean mo5247l(int viewType, long approxCurrentNs, long deadlineNs) {
            long expectedDurationNs = mo5242g(viewType).f3671c;
            return expectedDurationNs == 0 || approxCurrentNs + expectedDurationNs < deadlineNs;
        }

        /* renamed from: k */
        public boolean mo5246k(int viewType, long approxCurrentNs, long deadlineNs) {
            long expectedDurationNs = mo5242g(viewType).f3672d;
            return expectedDurationNs == 0 || approxCurrentNs + expectedDurationNs < deadlineNs;
        }

        /* renamed from: a */
        public void mo5236a() {
            this.f3668b++;
        }

        /* renamed from: c */
        public void mo5238c() {
            this.f3668b--;
        }

        /* renamed from: h */
        public void mo5243h(C0865g oldAdapter, C0865g newAdapter, boolean compatibleWithPrevious) {
            if (oldAdapter != null) {
                mo5238c();
            }
            if (!compatibleWithPrevious && this.f3668b == 0) {
                mo5237b();
            }
            if (newAdapter != null) {
                mo5236a();
            }
        }

        /* renamed from: g */
        public final C0887a mo5242g(int viewType) {
            C0887a scrapData = this.f3667a.get(viewType);
            if (scrapData != null) {
                return scrapData;
            }
            C0887a scrapData2 = new C0887a();
            this.f3667a.put(viewType, scrapData2);
            return scrapData2;
        }
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup parent = (ViewGroup) view;
        int count = parent.getChildCount();
        for (int i = 0; i < count; i++) {
            RecyclerView descendant = findNestedRecyclerView(parent.getChildAt(i));
            if (descendant != null) {
                return descendant;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void clearNestedRecyclerViewIfNotNested(androidx.recyclerview.widget.RecyclerView.C0862d0 r3) {
        /*
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r0 = r3.f3609b
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L_0x000a:
            if (r0 == 0) goto L_0x001f
            android.view.View r1 = r3.f3608a
            if (r0 != r1) goto L_0x0011
            return
        L_0x0011:
            android.view.ViewParent r1 = r0.getParent()
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L_0x001d
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            goto L_0x000a
        L_0x001f:
            r1 = 0
            r3.f3609b = r1
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.clearNestedRecyclerViewIfNotNested(androidx.recyclerview.widget.RecyclerView$d0):void");
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C0888v {

        /* renamed from: a */
        public final ArrayList<C0862d0> f3673a;

        /* renamed from: b */
        public ArrayList<C0862d0> f3674b = null;

        /* renamed from: c */
        public final ArrayList<C0862d0> f3675c = new ArrayList<>();

        /* renamed from: d */
        public final List<C0862d0> f3676d;

        /* renamed from: e */
        public int f3677e;

        /* renamed from: f */
        public int f3678f;

        /* renamed from: g */
        public C0886u f3679g;

        /* renamed from: h */
        public C0858b0 f3680h;

        public C0888v() {
            ArrayList<C0862d0> arrayList = new ArrayList<>();
            this.f3673a = arrayList;
            this.f3676d = Collections.unmodifiableList(arrayList);
            this.f3677e = 2;
            this.f3678f = 2;
        }

        /* renamed from: c */
        public void mo5263c() {
            this.f3673a.clear();
            mo5286z();
        }

        /* renamed from: G */
        public void mo5254G(int viewCount) {
            this.f3677e = viewCount;
            mo5258K();
        }

        /* renamed from: K */
        public void mo5258K() {
            C0876o oVar = RecyclerView.this.mLayout;
            this.f3678f = this.f3677e + (oVar != null ? oVar.f3651m : 0);
            for (int i = this.f3675c.size() - 1; i >= 0 && this.f3675c.size() > this.f3678f; i--) {
                mo5248A(i);
            }
        }

        /* renamed from: k */
        public List<C0862d0> mo5271k() {
            return this.f3676d;
        }

        /* renamed from: L */
        public boolean mo5259L(C0862d0 holder) {
            if (holder.mo5081v()) {
                return RecyclerView.this.mState.mo5032e();
            }
            int i = holder.f3610c;
            if (i < 0 || i >= RecyclerView.this.mAdapter.mo5089c()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + holder + RecyclerView.this.exceptionLabel());
            } else if (!RecyclerView.this.mState.mo5032e() && RecyclerView.this.mAdapter.mo5091e(holder.f3610c) != holder.mo5070l()) {
                return false;
            } else {
                if (!RecyclerView.this.mAdapter.mo5093g() || holder.mo5069k() == RecyclerView.this.mAdapter.mo5090d(holder.f3610c)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: H */
        public final boolean mo5255H(C0862d0 holder, int offsetPosition, int position, long deadlineNs) {
            holder.f3625r = RecyclerView.this;
            int viewType = holder.mo5070l();
            long startBindNs = RecyclerView.this.getNanoTime();
            if (deadlineNs != RecyclerView.FOREVER_NS && !this.f3679g.mo5246k(viewType, startBindNs, deadlineNs)) {
                return false;
            }
            RecyclerView.this.mAdapter.mo5087a(holder, offsetPosition);
            this.f3679g.mo5239d(holder.mo5070l(), RecyclerView.this.getNanoTime() - startBindNs);
            mo5262b(holder);
            if (!RecyclerView.this.mState.mo5032e()) {
                return true;
            }
            holder.f3614g = position;
            return true;
        }

        /* renamed from: f */
        public int mo5266f(int position) {
            if (position < 0 || position >= RecyclerView.this.mState.mo5029b()) {
                throw new IndexOutOfBoundsException("invalid position " + position + ". State item count is " + RecyclerView.this.mState.mo5029b() + RecyclerView.this.exceptionLabel());
            } else if (!RecyclerView.this.mState.mo5032e()) {
                return position;
            } else {
                return RecyclerView.this.mAdapterHelper.mo3168m(position);
            }
        }

        /* renamed from: o */
        public View mo5275o(int position) {
            return mo5276p(position, false);
        }

        /* renamed from: p */
        public View mo5276p(int position, boolean dryRun) {
            return mo5256I(position, dryRun, RecyclerView.FOREVER_NS).f3608a;
        }

        /* renamed from: I */
        public C0862d0 mo5256I(int position, boolean dryRun, long deadlineNs) {
            C0862d0 holder;
            boolean fromScrapOrHiddenOrCache;
            C0881p rvLayoutParams;
            RecyclerView innerView;
            C0858b0 b0Var;
            View view;
            int i = position;
            boolean z = dryRun;
            if (i < 0 || i >= RecyclerView.this.mState.mo5029b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + RecyclerView.this.mState.mo5029b() + RecyclerView.this.exceptionLabel());
            }
            boolean fromScrapOrHiddenOrCache2 = false;
            C0862d0 holder2 = null;
            boolean z2 = true;
            if (RecyclerView.this.mState.mo5032e()) {
                holder2 = mo5268h(position);
                fromScrapOrHiddenOrCache2 = holder2 != null;
            }
            if (holder2 == null && (holder2 = mo5273m(position, dryRun)) != null) {
                if (!mo5259L(holder2)) {
                    if (!z) {
                        holder2.mo5060b(4);
                        if (holder2.mo5082w()) {
                            RecyclerView.this.removeDetachedView(holder2.f3608a, false);
                            holder2.mo5057K();
                        } else if (holder2.mo5058L()) {
                            holder2.mo5063e();
                        }
                        mo5250C(holder2);
                    }
                    holder2 = null;
                } else {
                    fromScrapOrHiddenOrCache2 = true;
                }
            }
            if (holder2 == null) {
                int offsetPosition = RecyclerView.this.mAdapterHelper.mo3168m(i);
                if (offsetPosition < 0 || offsetPosition >= RecyclerView.this.mAdapter.mo5089c()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + offsetPosition + ").state:" + RecyclerView.this.mState.mo5029b() + RecyclerView.this.exceptionLabel());
                }
                int type = RecyclerView.this.mAdapter.mo5091e(offsetPosition);
                if (RecyclerView.this.mAdapter.mo5093g() && (holder2 = mo5272l(RecyclerView.this.mAdapter.mo5090d(offsetPosition), type, z)) != null) {
                    holder2.f3610c = offsetPosition;
                    fromScrapOrHiddenOrCache2 = true;
                }
                if (!(holder2 != null || (b0Var = this.f3680h) == null || (view = b0Var.mo5037a(this, i, type)) == null)) {
                    holder2 = RecyclerView.this.getChildViewHolder(view);
                    if (holder2 == null) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + RecyclerView.this.exceptionLabel());
                    } else if (holder2.mo5056J()) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + RecyclerView.this.exceptionLabel());
                    }
                }
                if (holder2 == null && (holder2 = mo5269i().mo5241f(type)) != null) {
                    holder2.mo5050D();
                    if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                        mo5278r(holder2);
                    }
                }
                if (holder2 == null) {
                    long start = RecyclerView.this.getNanoTime();
                    if (deadlineNs != RecyclerView.FOREVER_NS && !this.f3679g.mo5247l(type, start, deadlineNs)) {
                        return null;
                    }
                    RecyclerView recyclerView = RecyclerView.this;
                    C0862d0 holder3 = recyclerView.mAdapter.mo5088b(recyclerView, type);
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && (innerView = RecyclerView.findNestedRecyclerView(holder3.f3608a)) != null) {
                        holder3.f3609b = new WeakReference<>(innerView);
                    }
                    this.f3679g.mo5240e(type, RecyclerView.this.getNanoTime() - start);
                    fromScrapOrHiddenOrCache = fromScrapOrHiddenOrCache2;
                    holder = holder3;
                } else {
                    fromScrapOrHiddenOrCache = fromScrapOrHiddenOrCache2;
                    holder = holder2;
                }
            } else {
                fromScrapOrHiddenOrCache = fromScrapOrHiddenOrCache2;
                holder = holder2;
            }
            if (fromScrapOrHiddenOrCache && !RecyclerView.this.mState.mo5032e() && holder.mo5074p(8192)) {
                holder.mo5052F(0, 8192);
                if (RecyclerView.this.mState.f3591k) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(holder, recyclerView2.mItemAnimator.mo5121t(recyclerView2.mState, holder, C0870l.m4533e(holder) | 4096, holder.mo5073o()));
                }
            }
            boolean bound = false;
            if (RecyclerView.this.mState.mo5032e() && holder.mo5077s()) {
                holder.f3614g = i;
            } else if (!holder.mo5077s() || holder.mo5085z() || holder.mo5078t()) {
                bound = mo5255H(holder, RecyclerView.this.mAdapterHelper.mo3168m(i), position, deadlineNs);
            }
            ViewGroup.LayoutParams lp = holder.f3608a.getLayoutParams();
            if (lp == null) {
                rvLayoutParams = (C0881p) RecyclerView.this.generateDefaultLayoutParams();
                holder.f3608a.setLayoutParams(rvLayoutParams);
            } else if (!RecyclerView.this.checkLayoutParams(lp)) {
                rvLayoutParams = (C0881p) RecyclerView.this.generateLayoutParams(lp);
                holder.f3608a.setLayoutParams(rvLayoutParams);
            } else {
                rvLayoutParams = (C0881p) lp;
            }
            rvLayoutParams.f3663a = holder;
            if (!fromScrapOrHiddenOrCache || !bound) {
                z2 = false;
            }
            rvLayoutParams.f3666d = z2;
            return holder;
        }

        /* renamed from: b */
        public final void mo5262b(C0862d0 holder) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View itemView = holder.f3608a;
                if (C0460r.m2290t(itemView) == 0) {
                    C0460r.m2275l0(itemView, 1);
                }
                C0644k kVar = RecyclerView.this.mAccessibilityDelegate;
                if (kVar != null) {
                    C0420a itemDelegate = kVar.mo3362n();
                    if (itemDelegate instanceof C0644k.C0645a) {
                        ((C0644k.C0645a) itemDelegate).mo3365o(itemView);
                    }
                    C0460r.m2257c0(itemView, itemDelegate);
                }
            }
        }

        /* renamed from: r */
        public final void mo5278r(C0862d0 holder) {
            View view = holder.f3608a;
            if (view instanceof ViewGroup) {
                mo5277q((ViewGroup) view, false);
            }
        }

        /* renamed from: q */
        public final void mo5277q(ViewGroup viewGroup, boolean invalidateThis) {
            for (int i = viewGroup.getChildCount() - 1; i >= 0; i--) {
                View view = viewGroup.getChildAt(i);
                if (view instanceof ViewGroup) {
                    mo5277q((ViewGroup) view, true);
                }
            }
            if (invalidateThis) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: B */
        public void mo5249B(View view) {
            C0862d0 holder = RecyclerView.getChildViewHolderInt(view);
            if (holder.mo5083x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (holder.mo5082w()) {
                holder.mo5057K();
            } else if (holder.mo5058L()) {
                holder.mo5063e();
            }
            mo5250C(holder);
            if (RecyclerView.this.mItemAnimator != null && !holder.mo5080u()) {
                RecyclerView.this.mItemAnimator.mo3242j(holder);
            }
        }

        /* renamed from: z */
        public void mo5286z() {
            for (int i = this.f3675c.size() - 1; i >= 0; i--) {
                mo5248A(i);
            }
            this.f3675c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.mo3308b();
            }
        }

        /* renamed from: A */
        public void mo5248A(int cachedViewIndex) {
            mo5261a(this.f3675c.get(cachedViewIndex), true);
            this.f3675c.remove(cachedViewIndex);
        }

        /* renamed from: C */
        public void mo5250C(C0862d0 holder) {
            boolean z = false;
            if (holder.mo5082w() || holder.f3608a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(holder.mo5082w());
                sb.append(" isAttached:");
                if (holder.f3608a.getParent() != null) {
                    z = true;
                }
                sb.append(z);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (holder.mo5083x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + holder + RecyclerView.this.exceptionLabel());
            } else if (!holder.mo5056J()) {
                boolean transientStatePreventsRecycling = holder.mo5066h();
                C0865g gVar = RecyclerView.this.mAdapter;
                boolean cached = false;
                boolean recycled = false;
                if ((gVar != null && transientStatePreventsRecycling && gVar.mo5100n(holder)) || holder.mo5080u()) {
                    if (this.f3678f > 0 && !holder.mo5074p(526)) {
                        int cachedViewSize = this.f3675c.size();
                        if (cachedViewSize >= this.f3678f && cachedViewSize > 0) {
                            mo5248A(0);
                            cachedViewSize--;
                        }
                        int targetCacheIndex = cachedViewSize;
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && cachedViewSize > 0 && !RecyclerView.this.mPrefetchRegistry.mo3310d(holder.f3610c)) {
                            int cacheIndex = cachedViewSize - 1;
                            while (cacheIndex >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.mo3310d(this.f3675c.get(cacheIndex).f3610c)) {
                                    break;
                                }
                                cacheIndex--;
                            }
                            targetCacheIndex = cacheIndex + 1;
                        }
                        this.f3675c.add(targetCacheIndex, holder);
                        cached = true;
                    }
                    if (!cached) {
                        mo5261a(holder, true);
                        recycled = true;
                    }
                }
                RecyclerView.this.mViewInfoStore.mo3425q(holder);
                if (!cached && !recycled && transientStatePreventsRecycling) {
                    holder.f3625r = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
        }

        /* renamed from: a */
        public void mo5261a(C0862d0 holder, boolean dispatchRecycled) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(holder);
            View itemView = holder.f3608a;
            C0644k kVar = RecyclerView.this.mAccessibilityDelegate;
            if (kVar != null) {
                C0420a itemDelegate = kVar.mo3362n();
                C0420a originalDelegate = null;
                if (itemDelegate instanceof C0644k.C0645a) {
                    originalDelegate = ((C0644k.C0645a) itemDelegate).mo3364n(itemView);
                }
                C0460r.m2257c0(itemView, originalDelegate);
            }
            if (dispatchRecycled) {
                mo5267g(holder);
            }
            holder.f3625r = null;
            mo5269i().mo5244i(holder);
        }

        /* renamed from: y */
        public void mo5285y(View view) {
            C0862d0 holder = RecyclerView.getChildViewHolderInt(view);
            holder.f3621n = null;
            holder.f3622o = false;
            holder.mo5063e();
            mo5250C(holder);
        }

        /* renamed from: D */
        public void mo5251D(View view) {
            C0862d0 holder = RecyclerView.getChildViewHolderInt(view);
            if (!holder.mo5074p(12) && holder.mo5084y() && !RecyclerView.this.canReuseUpdatedViewHolder(holder)) {
                if (this.f3674b == null) {
                    this.f3674b = new ArrayList<>();
                }
                holder.mo5054H(this, true);
                this.f3674b.add(holder);
            } else if (!holder.mo5078t() || holder.mo5081v() || RecyclerView.this.mAdapter.mo5093g()) {
                holder.mo5054H(this, false);
                this.f3673a.add(holder);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        /* renamed from: J */
        public void mo5257J(C0862d0 holder) {
            if (holder.f3622o) {
                this.f3674b.remove(holder);
            } else {
                this.f3673a.remove(holder);
            }
            holder.f3621n = null;
            holder.f3622o = false;
            holder.mo5063e();
        }

        /* renamed from: j */
        public int mo5270j() {
            return this.f3673a.size();
        }

        /* renamed from: n */
        public View mo5274n(int index) {
            return this.f3673a.get(index).f3608a;
        }

        /* renamed from: e */
        public void mo5265e() {
            this.f3673a.clear();
            ArrayList<C0862d0> arrayList = this.f3674b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: h */
        public C0862d0 mo5268h(int position) {
            int offsetPosition;
            ArrayList<C0862d0> arrayList = this.f3674b;
            if (arrayList != null) {
                int size = arrayList.size();
                int changedScrapSize = size;
                if (size != 0) {
                    int i = 0;
                    while (i < changedScrapSize) {
                        C0862d0 holder = this.f3674b.get(i);
                        if (holder.mo5058L() || holder.mo5071m() != position) {
                            i++;
                        } else {
                            holder.mo5060b(32);
                            return holder;
                        }
                    }
                    if (RecyclerView.this.mAdapter.mo5093g() && (offsetPosition = RecyclerView.this.mAdapterHelper.mo3168m(position)) > 0 && offsetPosition < RecyclerView.this.mAdapter.mo5089c()) {
                        long id = RecyclerView.this.mAdapter.mo5090d(offsetPosition);
                        int i2 = 0;
                        while (i2 < changedScrapSize) {
                            C0862d0 holder2 = this.f3674b.get(i2);
                            if (holder2.mo5058L() || holder2.mo5069k() != id) {
                                i2++;
                            } else {
                                holder2.mo5060b(32);
                                return holder2;
                            }
                        }
                    }
                    return null;
                }
            }
            return null;
        }

        /* renamed from: m */
        public C0862d0 mo5273m(int position, boolean dryRun) {
            View view;
            int scrapCount = this.f3673a.size();
            int i = 0;
            while (i < scrapCount) {
                C0862d0 holder = this.f3673a.get(i);
                if (holder.mo5058L() || holder.mo5071m() != position || holder.mo5078t() || (!RecyclerView.this.mState.f3588h && holder.mo5081v())) {
                    i++;
                } else {
                    holder.mo5060b(32);
                    return holder;
                }
            }
            if (dryRun || (view = RecyclerView.this.mChildHelper.mo3194e(position)) == null) {
                int cacheSize = this.f3675c.size();
                int i2 = 0;
                while (i2 < cacheSize) {
                    C0862d0 holder2 = this.f3675c.get(i2);
                    if (holder2.mo5078t() || holder2.mo5071m() != position || holder2.mo5076r()) {
                        i2++;
                    } else {
                        if (!dryRun) {
                            this.f3675c.remove(i2);
                        }
                        return holder2;
                    }
                }
                return null;
            }
            C0862d0 vh = RecyclerView.getChildViewHolderInt(view);
            RecyclerView.this.mChildHelper.mo3208s(view);
            int layoutIndex = RecyclerView.this.mChildHelper.mo3202m(view);
            if (layoutIndex != -1) {
                RecyclerView.this.mChildHelper.mo3193d(layoutIndex);
                mo5251D(view);
                vh.mo5060b(8224);
                return vh;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + vh + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: l */
        public C0862d0 mo5272l(long id, int type, boolean dryRun) {
            for (int i = this.f3673a.size() - 1; i >= 0; i--) {
                C0862d0 holder = this.f3673a.get(i);
                if (holder.mo5069k() == id && !holder.mo5058L()) {
                    if (type == holder.mo5070l()) {
                        holder.mo5060b(32);
                        if (holder.mo5081v() && !RecyclerView.this.mState.mo5032e()) {
                            holder.mo5052F(2, 14);
                        }
                        return holder;
                    } else if (!dryRun) {
                        this.f3673a.remove(i);
                        RecyclerView.this.removeDetachedView(holder.f3608a, false);
                        mo5285y(holder.f3608a);
                    }
                }
            }
            for (int i2 = this.f3675c.size() - 1; i2 >= 0; i2--) {
                C0862d0 holder2 = this.f3675c.get(i2);
                if (holder2.mo5069k() == id && !holder2.mo5076r()) {
                    if (type == holder2.mo5070l()) {
                        if (!dryRun) {
                            this.f3675c.remove(i2);
                        }
                        return holder2;
                    } else if (!dryRun) {
                        mo5248A(i2);
                        return null;
                    }
                }
            }
            return null;
        }

        /* renamed from: g */
        public void mo5267g(C0862d0 holder) {
            C0889w wVar = RecyclerView.this.mRecyclerListener;
            if (wVar != null) {
                wVar.mo5287a(holder);
            }
            C0865g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.mo5103q(holder);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.mo3425q(holder);
            }
        }

        /* renamed from: x */
        public void mo5284x(C0865g oldAdapter, C0865g newAdapter, boolean compatibleWithPrevious) {
            mo5263c();
            mo5269i().mo5243h(oldAdapter, newAdapter, compatibleWithPrevious);
        }

        /* renamed from: v */
        public void mo5282v(int from, int to) {
            int inBetweenOffset;
            int end;
            int start;
            int i;
            if (from < to) {
                start = from;
                end = to;
                inBetweenOffset = -1;
            } else {
                start = to;
                end = from;
                inBetweenOffset = 1;
            }
            int cachedCount = this.f3675c.size();
            for (int i2 = 0; i2 < cachedCount; i2++) {
                C0862d0 holder = this.f3675c.get(i2);
                if (holder != null && (i = holder.f3610c) >= start && i <= end) {
                    if (i == from) {
                        holder.mo5047A(to - from, false);
                    } else {
                        holder.mo5047A(inBetweenOffset, false);
                    }
                }
            }
        }

        /* renamed from: u */
        public void mo5281u(int insertedAt, int count) {
            int cachedCount = this.f3675c.size();
            for (int i = 0; i < cachedCount; i++) {
                C0862d0 holder = this.f3675c.get(i);
                if (holder != null && holder.f3610c >= insertedAt) {
                    holder.mo5047A(count, true);
                }
            }
        }

        /* renamed from: w */
        public void mo5283w(int removedFrom, int count, boolean applyToPreLayout) {
            int removedEnd = removedFrom + count;
            for (int i = this.f3675c.size() - 1; i >= 0; i--) {
                C0862d0 holder = this.f3675c.get(i);
                if (holder != null) {
                    int i2 = holder.f3610c;
                    if (i2 >= removedEnd) {
                        holder.mo5047A(-count, applyToPreLayout);
                    } else if (i2 >= removedFrom) {
                        holder.mo5060b(8);
                        mo5248A(i);
                    }
                }
            }
        }

        /* renamed from: F */
        public void mo5253F(C0858b0 extension) {
        }

        /* renamed from: E */
        public void mo5252E(C0886u pool) {
            C0886u uVar = this.f3679g;
            if (uVar != null) {
                uVar.mo5238c();
            }
            this.f3679g = pool;
            if (pool != null && RecyclerView.this.getAdapter() != null) {
                this.f3679g.mo5236a();
            }
        }

        /* renamed from: i */
        public C0886u mo5269i() {
            if (this.f3679g == null) {
                this.f3679g = new C0886u();
            }
            return this.f3679g;
        }

        /* renamed from: M */
        public void mo5260M(int positionStart, int itemCount) {
            int pos;
            int positionEnd = positionStart + itemCount;
            for (int i = this.f3675c.size() - 1; i >= 0; i--) {
                C0862d0 holder = this.f3675c.get(i);
                if (holder != null && (pos = holder.f3610c) >= positionStart && pos < positionEnd) {
                    holder.mo5060b(2);
                    mo5248A(i);
                }
            }
        }

        /* renamed from: t */
        public void mo5280t() {
            int cachedCount = this.f3675c.size();
            for (int i = 0; i < cachedCount; i++) {
                C0862d0 holder = this.f3675c.get(i);
                if (holder != null) {
                    holder.mo5060b(6);
                    holder.mo5059a((Object) null);
                }
            }
            C0865g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.mo5093g()) {
                mo5286z();
            }
        }

        /* renamed from: d */
        public void mo5264d() {
            int cachedCount = this.f3675c.size();
            for (int i = 0; i < cachedCount; i++) {
                this.f3675c.get(i).mo5061c();
            }
            int scrapCount = this.f3673a.size();
            for (int i2 = 0; i2 < scrapCount; i2++) {
                this.f3673a.get(i2).mo5061c();
            }
            ArrayList<C0862d0> arrayList = this.f3674b;
            if (arrayList != null) {
                int changedScrapCount = arrayList.size();
                for (int i3 = 0; i3 < changedScrapCount; i3++) {
                    this.f3674b.get(i3).mo5061c();
                }
            }
        }

        /* renamed from: s */
        public void mo5279s() {
            int cachedCount = this.f3675c.size();
            for (int i = 0; i < cachedCount; i++) {
                C0881p layoutParams = (C0881p) this.f3675c.get(i).f3608a.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f3665c = true;
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C0865g<VH extends C0862d0> {

        /* renamed from: a */
        public final C0866h f3628a = new C0866h();

        /* renamed from: b */
        public boolean f3629b = false;

        /* renamed from: c */
        public abstract int mo5089c();

        /* renamed from: j */
        public abstract void mo5096j(VH vh, int i);

        /* renamed from: l */
        public abstract VH mo5098l(ViewGroup viewGroup, int i);

        /* renamed from: k */
        public void mo5097k(VH holder, int position, List<Object> list) {
            mo5096j(holder, position);
        }

        /* renamed from: b */
        public final VH mo5088b(ViewGroup parent, int viewType) {
            try {
                C0380a.m1964a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH holder = mo5098l(parent, viewType);
                if (holder.f3608a.getParent() == null) {
                    holder.f3613f = viewType;
                    return holder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0380a.m1965b();
            }
        }

        /* renamed from: a */
        public final void mo5087a(VH holder, int position) {
            holder.f3610c = position;
            if (mo5093g()) {
                holder.f3612e = mo5090d(position);
            }
            holder.mo5052F(1, 519);
            C0380a.m1964a(RecyclerView.TRACE_BIND_VIEW_TAG);
            mo5097k(holder, position, holder.mo5073o());
            holder.mo5062d();
            ViewGroup.LayoutParams layoutParams = holder.f3608a.getLayoutParams();
            if (layoutParams instanceof C0881p) {
                ((C0881p) layoutParams).f3665c = true;
            }
            C0380a.m1965b();
        }

        /* renamed from: e */
        public int mo5091e(int position) {
            return 0;
        }

        /* renamed from: s */
        public void mo5105s(boolean hasStableIds) {
            if (!mo5092f()) {
                this.f3629b = hasStableIds;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: d */
        public long mo5090d(int position) {
            return -1;
        }

        /* renamed from: g */
        public final boolean mo5093g() {
            return this.f3629b;
        }

        /* renamed from: q */
        public void mo5103q(VH vh) {
        }

        /* renamed from: n */
        public boolean mo5100n(VH vh) {
            return false;
        }

        /* renamed from: o */
        public void mo5101o(VH vh) {
        }

        /* renamed from: p */
        public void mo5102p(VH vh) {
        }

        /* renamed from: f */
        public final boolean mo5092f() {
            return this.f3628a.mo5107a();
        }

        /* renamed from: r */
        public void mo5104r(C0867i observer) {
            this.f3628a.registerObserver(observer);
        }

        /* renamed from: t */
        public void mo5106t(C0867i observer) {
            this.f3628a.unregisterObserver(observer);
        }

        /* renamed from: i */
        public void mo5095i(RecyclerView recyclerView) {
        }

        /* renamed from: m */
        public void mo5099m(RecyclerView recyclerView) {
        }

        /* renamed from: h */
        public final void mo5094h() {
            this.f3628a.mo5108b();
        }
    }

    public void dispatchChildDetached(View child) {
        C0862d0 viewHolder = getChildViewHolderInt(child);
        onChildDetachedFromWindow(child);
        C0865g gVar = this.mAdapter;
        if (!(gVar == null || viewHolder == null)) {
            gVar.mo5102p(viewHolder);
        }
        List<C0882q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int i = list.size() - 1; i >= 0; i--) {
                this.mOnChildAttachStateListeners.get(i).mo5234a(child);
            }
        }
    }

    public void dispatchChildAttached(View child) {
        C0862d0 viewHolder = getChildViewHolderInt(child);
        onChildAttachedToWindow(child);
        C0865g gVar = this.mAdapter;
        if (!(gVar == null || viewHolder == null)) {
            gVar.mo5101o(viewHolder);
        }
        List<C0882q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int i = list.size() - 1; i >= 0; i--) {
                this.mOnChildAttachStateListeners.get(i).mo5235b(child);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C0876o {

        /* renamed from: a */
        public C0613b f3639a;

        /* renamed from: b */
        public RecyclerView f3640b;

        /* renamed from: c */
        public final C0651o.C0653b f3641c;

        /* renamed from: d */
        public final C0651o.C0653b f3642d;

        /* renamed from: e */
        public C0651o f3643e;

        /* renamed from: f */
        public C0651o f3644f;

        /* renamed from: g */
        public C0893z f3645g;

        /* renamed from: h */
        public boolean f3646h = false;

        /* renamed from: i */
        public boolean f3647i = false;

        /* renamed from: j */
        public boolean f3648j = false;

        /* renamed from: k */
        public boolean f3649k = true;

        /* renamed from: l */
        public boolean f3650l = true;

        /* renamed from: m */
        public int f3651m;

        /* renamed from: n */
        public boolean f3652n;

        /* renamed from: o */
        public int f3653o;

        /* renamed from: p */
        public int f3654p;

        /* renamed from: q */
        public int f3655q;

        /* renamed from: r */
        public int f3656r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C0879c {
            /* renamed from: a */
            void mo3307a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C0880d {

            /* renamed from: a */
            public int f3659a;

            /* renamed from: b */
            public int f3660b;

            /* renamed from: c */
            public boolean f3661c;

            /* renamed from: d */
            public boolean f3662d;
        }

        /* renamed from: D */
        public abstract C0881p mo4698D();

        public C0876o() {
            C0877a aVar = new C0877a();
            this.f3641c = aVar;
            C0878b bVar = new C0878b();
            this.f3642d = bVar;
            this.f3643e = new C0651o(aVar);
            this.f3644f = new C0651o(bVar);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        public class C0877a implements C0651o.C0653b {
            public C0877a() {
            }

            /* renamed from: a */
            public View mo3404a(int index) {
                return C0876o.this.mo5150I(index);
            }

            /* renamed from: c */
            public int mo3406c() {
                return C0876o.this.mo5185e0();
            }

            /* renamed from: b */
            public int mo3405b() {
                return C0876o.this.mo5207o0() - C0876o.this.mo5188f0();
            }

            /* renamed from: e */
            public int mo3408e(View view) {
                return C0876o.this.mo5162Q(view) - ((C0881p) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: d */
            public int mo3407d(View view) {
                return C0876o.this.mo5166T(view) + ((C0881p) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        public class C0878b implements C0651o.C0653b {
            public C0878b() {
            }

            /* renamed from: a */
            public View mo3404a(int index) {
                return C0876o.this.mo5150I(index);
            }

            /* renamed from: c */
            public int mo3406c() {
                return C0876o.this.mo5190g0();
            }

            /* renamed from: b */
            public int mo3405b() {
                return C0876o.this.mo5170W() - C0876o.this.mo5183d0();
            }

            /* renamed from: e */
            public int mo3408e(View view) {
                return C0876o.this.mo5167U(view) - ((C0881p) view.getLayoutParams()).topMargin;
            }

            /* renamed from: d */
            public int mo3407d(View view) {
                return C0876o.this.mo5159O(view) + ((C0881p) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: E1 */
        public void mo5142E1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f3640b = null;
                this.f3639a = null;
                this.f3655q = 0;
                this.f3656r = 0;
            } else {
                this.f3640b = recyclerView;
                this.f3639a = recyclerView.mChildHelper;
                this.f3655q = recyclerView.getWidth();
                this.f3656r = recyclerView.getHeight();
            }
            this.f3653o = 1073741824;
            this.f3654p = 1073741824;
        }

        /* renamed from: A1 */
        public void mo5134A1(int wSpec, int hSpec) {
            this.f3655q = View.MeasureSpec.getSize(wSpec);
            int mode = View.MeasureSpec.getMode(wSpec);
            this.f3653o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f3655q = 0;
            }
            this.f3656r = View.MeasureSpec.getSize(hSpec);
            int mode2 = View.MeasureSpec.getMode(hSpec);
            this.f3654p = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f3656r = 0;
            }
        }

        /* renamed from: D1 */
        public void mo5140D1(int widthSpec, int heightSpec) {
            int count = mo5151J();
            if (count == 0) {
                this.f3640b.defaultOnMeasure(widthSpec, heightSpec);
                return;
            }
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = RecyclerView.UNDEFINED_DURATION;
            int maxY = RecyclerView.UNDEFINED_DURATION;
            for (int i = 0; i < count; i++) {
                View child = mo5150I(i);
                Rect bounds = this.f3640b.mTempRect;
                mo5161P(child, bounds);
                if (bounds.left < minX) {
                    minX = bounds.left;
                }
                if (bounds.right > maxX) {
                    maxX = bounds.right;
                }
                if (bounds.top < minY) {
                    minY = bounds.top;
                }
                if (bounds.bottom > maxY) {
                    maxY = bounds.bottom;
                }
            }
            this.f3640b.mTempRect.set(minX, minY, maxX, maxY);
            mo4697C1(this.f3640b.mTempRect, widthSpec, heightSpec);
        }

        /* renamed from: C1 */
        public void mo4697C1(Rect childrenBounds, int wSpec, int hSpec) {
            mo5137B1(m4568n(wSpec, childrenBounds.width() + mo5185e0() + mo5188f0(), mo5181c0()), m4568n(hSpec, childrenBounds.height() + mo5190g0() + mo5183d0(), mo5178b0()));
        }

        /* renamed from: t1 */
        public void mo5217t1() {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: n */
        public static int m4568n(int spec, int desired, int min) {
            int mode = View.MeasureSpec.getMode(spec);
            int size = View.MeasureSpec.getSize(spec);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(desired, min));
            }
            if (mode != 1073741824) {
                return Math.max(desired, min);
            }
            return size;
        }

        /* renamed from: g */
        public void mo4791g(String message) {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(message);
            }
        }

        /* renamed from: s0 */
        public boolean mo4808s0() {
            return this.f3648j;
        }

        /* renamed from: L1 */
        public boolean mo4703L1() {
            return false;
        }

        /* renamed from: u0 */
        public final boolean mo5218u0() {
            return this.f3650l;
        }

        /* renamed from: o */
        public void mo4801o(int dx, int dy, C0856a0 state, C0879c layoutPrefetchRegistry) {
        }

        /* renamed from: p */
        public void mo4803p(int adapterItemCount, C0879c layoutPrefetchRegistry) {
        }

        /* renamed from: z */
        public void mo5227z(RecyclerView view) {
            this.f3647i = true;
            mo5146G0(view);
        }

        /* renamed from: A */
        public void mo5132A(RecyclerView view, C0888v recycler) {
            this.f3647i = false;
            mo4761I0(view, recycler);
        }

        /* renamed from: r0 */
        public boolean mo5213r0() {
            return this.f3647i;
        }

        /* renamed from: o1 */
        public boolean mo5208o1(Runnable action) {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(action);
            }
            return false;
        }

        /* renamed from: G0 */
        public void mo5146G0(RecyclerView view) {
        }

        @Deprecated
        /* renamed from: H0 */
        public void mo5148H0(RecyclerView view) {
        }

        /* renamed from: I0 */
        public void mo4761I0(RecyclerView view, C0888v recycler) {
            mo5148H0(view);
        }

        /* renamed from: M */
        public boolean mo5156M() {
            RecyclerView recyclerView = this.f3640b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        /* renamed from: X0 */
        public void mo4721X0(C0888v recycler, C0856a0 state) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: Y0 */
        public void mo4723Y0(C0856a0 state) {
        }

        /* renamed from: m */
        public boolean mo4734m(C0881p lp) {
            return lp != null;
        }

        /* renamed from: F */
        public C0881p mo4701F(ViewGroup.LayoutParams lp) {
            if (lp instanceof C0881p) {
                return new C0881p((C0881p) lp);
            }
            if (lp instanceof ViewGroup.MarginLayoutParams) {
                return new C0881p((ViewGroup.MarginLayoutParams) lp);
            }
            return new C0881p(lp);
        }

        /* renamed from: E */
        public C0881p mo4699E(Context c, AttributeSet attrs) {
            return new C0881p(c, attrs);
        }

        /* renamed from: w1 */
        public int mo4741w1(int dx, C0888v recycler, C0856a0 state) {
            return 0;
        }

        /* renamed from: y1 */
        public int mo4742y1(int dy, C0888v recycler, C0856a0 state) {
            return 0;
        }

        /* renamed from: k */
        public boolean mo4795k() {
            return false;
        }

        /* renamed from: l */
        public boolean mo4797l() {
            return false;
        }

        /* renamed from: x1 */
        public void mo4813x1(int position) {
        }

        /* renamed from: I1 */
        public void mo4762I1(RecyclerView recyclerView, C0856a0 state, int position) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: J1 */
        public void mo5152J1(C0893z smoothScroller) {
            C0893z zVar = this.f3645g;
            if (!(zVar == null || smoothScroller == zVar || !zVar.mo5302h())) {
                this.f3645g.mo5308r();
            }
            this.f3645g = smoothScroller;
            smoothScroller.mo5307q(this.f3640b, this);
        }

        /* renamed from: x0 */
        public boolean mo5224x0() {
            C0893z zVar = this.f3645g;
            return zVar != null && zVar.mo5302h();
        }

        /* renamed from: Z */
        public int mo5173Z() {
            return C0460r.m2292v(this.f3640b);
        }

        /* renamed from: b */
        public void mo5177b(View child) {
            mo5180c(child, -1);
        }

        /* renamed from: c */
        public void mo5180c(View child, int index) {
            mo5187f(child, index, true);
        }

        /* renamed from: d */
        public void mo5182d(View child) {
            mo5184e(child, -1);
        }

        /* renamed from: e */
        public void mo5184e(View child, int index) {
            mo5187f(child, index, false);
        }

        /* renamed from: f */
        public final void mo5187f(View child, int index, boolean disappearing) {
            C0862d0 holder = RecyclerView.getChildViewHolderInt(child);
            if (disappearing || holder.mo5081v()) {
                this.f3640b.mViewInfoStore.mo3410b(holder);
            } else {
                this.f3640b.mViewInfoStore.mo3424p(holder);
            }
            C0881p lp = (C0881p) child.getLayoutParams();
            if (holder.mo5058L() || holder.mo5082w()) {
                if (holder.mo5082w()) {
                    holder.mo5057K();
                } else {
                    holder.mo5063e();
                }
                this.f3639a.mo3192c(child, index, child.getLayoutParams(), false);
            } else if (child.getParent() == this.f3640b) {
                int currentIndex = this.f3639a.mo3202m(child);
                if (index == -1) {
                    index = this.f3639a.mo3196g();
                }
                if (currentIndex == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3640b.indexOfChild(child) + this.f3640b.exceptionLabel());
                } else if (currentIndex != index) {
                    this.f3640b.mLayout.mo5136B0(currentIndex, index);
                }
            } else {
                this.f3639a.mo3190a(child, index, false);
                lp.f3665c = true;
                C0893z zVar = this.f3645g;
                if (zVar != null && zVar.mo5302h()) {
                    this.f3645g.mo5305k(child);
                }
            }
            if (lp.f3666d) {
                holder.f3608a.invalidate();
                lp.f3666d = false;
            }
        }

        /* renamed from: p1 */
        public void mo5210p1(View child) {
            this.f3639a.mo3205p(child);
        }

        /* renamed from: q1 */
        public void mo5212q1(int index) {
            if (mo5150I(index) != null) {
                this.f3639a.mo3206q(index);
            }
        }

        /* renamed from: G */
        public int mo5145G() {
            return -1;
        }

        /* renamed from: h0 */
        public int mo5193h0(View view) {
            return ((C0881p) view.getLayoutParams()).mo5230a();
        }

        /* renamed from: B */
        public View mo5135B(View view) {
            View found;
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView == null || (found = recyclerView.findContainingItemView(view)) == null || this.f3639a.mo3203n(found)) {
                return null;
            }
            return found;
        }

        /* renamed from: C */
        public View mo4754C(int position) {
            int childCount = mo5151J();
            for (int i = 0; i < childCount; i++) {
                View child = mo5150I(i);
                C0862d0 vh = RecyclerView.getChildViewHolderInt(child);
                if (vh != null && vh.mo5071m() == position && !vh.mo5056J() && (this.f3640b.mState.mo5032e() || !vh.mo5081v())) {
                    return child;
                }
            }
            return null;
        }

        /* renamed from: x */
        public void mo5223x(int index) {
            mo5225y(index, mo5150I(index));
        }

        /* renamed from: y */
        public final void mo5225y(int index, View view) {
            this.f3639a.mo3193d(index);
        }

        /* renamed from: i */
        public void mo5195i(View child, int index, C0881p lp) {
            C0862d0 vh = RecyclerView.getChildViewHolderInt(child);
            if (vh.mo5081v()) {
                this.f3640b.mViewInfoStore.mo3410b(vh);
            } else {
                this.f3640b.mViewInfoStore.mo3424p(vh);
            }
            this.f3639a.mo3192c(child, index, lp, vh.mo5081v());
        }

        /* renamed from: h */
        public void mo5192h(View child, int index) {
            mo5195i(child, index, (C0881p) child.getLayoutParams());
        }

        /* renamed from: B0 */
        public void mo5136B0(int fromIndex, int toIndex) {
            View view = mo5150I(fromIndex);
            if (view != null) {
                mo5223x(fromIndex);
                mo5192h(view, toIndex);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + fromIndex + this.f3640b.toString());
        }

        /* renamed from: m1 */
        public void mo5204m1(View child, C0888v recycler) {
            mo5210p1(child);
            recycler.mo5249B(child);
        }

        /* renamed from: n1 */
        public void mo5206n1(int index, C0888v recycler) {
            View view = mo5150I(index);
            mo5212q1(index);
            recycler.mo5249B(view);
        }

        /* renamed from: J */
        public int mo5151J() {
            C0613b bVar = this.f3639a;
            if (bVar != null) {
                return bVar.mo3196g();
            }
            return 0;
        }

        /* renamed from: I */
        public View mo5150I(int index) {
            C0613b bVar = this.f3639a;
            if (bVar != null) {
                return bVar.mo3195f(index);
            }
            return null;
        }

        /* renamed from: p0 */
        public int mo5209p0() {
            return this.f3653o;
        }

        /* renamed from: X */
        public int mo5171X() {
            return this.f3654p;
        }

        /* renamed from: o0 */
        public int mo5207o0() {
            return this.f3655q;
        }

        /* renamed from: W */
        public int mo5170W() {
            return this.f3656r;
        }

        /* renamed from: e0 */
        public int mo5185e0() {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: g0 */
        public int mo5190g0() {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: f0 */
        public int mo5188f0() {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: d0 */
        public int mo5183d0() {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: V */
        public View mo5168V() {
            View focused;
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView == null || (focused = recyclerView.getFocusedChild()) == null || this.f3639a.mo3203n(focused)) {
                return null;
            }
            return focused;
        }

        /* renamed from: Y */
        public int mo5172Y() {
            RecyclerView recyclerView = this.f3640b;
            C0865g a = recyclerView != null ? recyclerView.getAdapter() : null;
            if (a != null) {
                return a.mo5089c();
            }
            return 0;
        }

        /* renamed from: C0 */
        public void mo5138C0(int dx) {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(dx);
            }
        }

        /* renamed from: D0 */
        public void mo5139D0(int dy) {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(dy);
            }
        }

        /* renamed from: w */
        public void mo5222w(C0888v recycler) {
            for (int i = mo5151J() - 1; i >= 0; i--) {
                mo5221v1(recycler, i, mo5150I(i));
            }
        }

        /* renamed from: v1 */
        public final void mo5221v1(C0888v recycler, int index, View view) {
            C0862d0 viewHolder = RecyclerView.getChildViewHolderInt(view);
            if (!viewHolder.mo5056J()) {
                if (!viewHolder.mo5078t() || viewHolder.mo5081v() || this.f3640b.mAdapter.mo5093g()) {
                    mo5223x(index);
                    recycler.mo5251D(view);
                    this.f3640b.mViewInfoStore.mo3419k(viewHolder);
                    return;
                }
                mo5212q1(index);
                recycler.mo5250C(viewHolder);
            }
        }

        /* renamed from: l1 */
        public void mo5202l1(C0888v recycler) {
            int scrapCount = recycler.mo5270j();
            for (int i = scrapCount - 1; i >= 0; i--) {
                View scrap = recycler.mo5274n(i);
                C0862d0 vh = RecyclerView.getChildViewHolderInt(scrap);
                if (!vh.mo5056J()) {
                    vh.mo5053G(false);
                    if (vh.mo5083x()) {
                        this.f3640b.removeDetachedView(scrap, false);
                    }
                    C0870l lVar = this.f3640b.mItemAnimator;
                    if (lVar != null) {
                        lVar.mo3242j(vh);
                    }
                    vh.mo5053G(true);
                    recycler.mo5285y(scrap);
                }
            }
            recycler.mo5265e();
            if (scrapCount > 0) {
                this.f3640b.invalidate();
            }
        }

        /* renamed from: H1 */
        public boolean mo5149H1(View child, int widthSpec, int heightSpec, C0881p lp) {
            return !this.f3649k || !m4569w0(child.getMeasuredWidth(), widthSpec, lp.width) || !m4569w0(child.getMeasuredHeight(), heightSpec, lp.height);
        }

        /* renamed from: F1 */
        public boolean mo5144F1(View child, int widthSpec, int heightSpec, C0881p lp) {
            return child.isLayoutRequested() || !this.f3649k || !m4569w0(child.getWidth(), widthSpec, lp.width) || !m4569w0(child.getHeight(), heightSpec, lp.height);
        }

        /* renamed from: w0 */
        public static boolean m4569w0(int childSize, int spec, int dimension) {
            int specMode = View.MeasureSpec.getMode(spec);
            int specSize = View.MeasureSpec.getSize(spec);
            if (dimension > 0 && childSize != dimension) {
                return false;
            }
            if (specMode != Integer.MIN_VALUE) {
                if (specMode == 0) {
                    return true;
                }
                if (specMode == 1073741824 && specSize == childSize) {
                    return true;
                }
                return false;
            } else if (specSize >= childSize) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: A0 */
        public void mo5133A0(View child, int widthUsed, int heightUsed) {
            C0881p lp = (C0881p) child.getLayoutParams();
            Rect insets = this.f3640b.getItemDecorInsetsForChild(child);
            int widthUsed2 = widthUsed + insets.left + insets.right;
            int heightUsed2 = heightUsed + insets.top + insets.bottom;
            int widthSpec = m4566K(mo5207o0(), mo5209p0(), mo5185e0() + mo5188f0() + lp.leftMargin + lp.rightMargin + widthUsed2, lp.width, mo4795k());
            int heightSpec = m4566K(mo5170W(), mo5171X(), mo5190g0() + mo5183d0() + lp.topMargin + lp.bottomMargin + heightUsed2, lp.height, mo4797l());
            if (mo5144F1(child, widthSpec, heightSpec, lp)) {
                child.measure(widthSpec, heightSpec);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
            if (r8 != 1073741824) goto L_0x0043;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m4566K(int r7, int r8, int r9, int r10, boolean r11) {
            /*
                int r0 = r7 - r9
                r1 = 0
                int r0 = java.lang.Math.max(r1, r0)
                r1 = 0
                r2 = 0
                r3 = 1073741824(0x40000000, float:2.0)
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = -2
                r6 = -1
                if (r11 == 0) goto L_0x002c
                if (r10 < 0) goto L_0x0017
                r1 = r10
                r2 = 1073741824(0x40000000, float:2.0)
                goto L_0x0043
            L_0x0017:
                if (r10 != r6) goto L_0x0027
                if (r8 == r4) goto L_0x0023
                if (r8 == 0) goto L_0x0020
                if (r8 == r3) goto L_0x0023
                goto L_0x0026
            L_0x0020:
                r1 = 0
                r2 = 0
                goto L_0x0026
            L_0x0023:
                r1 = r0
                r2 = r8
            L_0x0026:
                goto L_0x0043
            L_0x0027:
                if (r10 != r5) goto L_0x0043
                r1 = 0
                r2 = 0
                goto L_0x0043
            L_0x002c:
                if (r10 < 0) goto L_0x0032
                r1 = r10
                r2 = 1073741824(0x40000000, float:2.0)
                goto L_0x0043
            L_0x0032:
                if (r10 != r6) goto L_0x0037
                r1 = r0
                r2 = r8
                goto L_0x0043
            L_0x0037:
                if (r10 != r5) goto L_0x0043
                r1 = r0
                if (r8 == r4) goto L_0x0041
                if (r8 != r3) goto L_0x003f
                goto L_0x0041
            L_0x003f:
                r2 = 0
                goto L_0x0043
            L_0x0041:
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x0043:
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0876o.m4566K(int, int, int, int, boolean):int");
        }

        /* renamed from: S */
        public int mo5165S(View child) {
            Rect insets = ((C0881p) child.getLayoutParams()).f3664b;
            return child.getMeasuredWidth() + insets.left + insets.right;
        }

        /* renamed from: R */
        public int mo5164R(View child) {
            Rect insets = ((C0881p) child.getLayoutParams()).f3664b;
            return child.getMeasuredHeight() + insets.top + insets.bottom;
        }

        /* renamed from: z0 */
        public void mo5228z0(View child, int left, int top, int right, int bottom) {
            C0881p lp = (C0881p) child.getLayoutParams();
            Rect insets = lp.f3664b;
            child.layout(insets.left + left + lp.leftMargin, insets.top + top + lp.topMargin, (right - insets.right) - lp.rightMargin, (bottom - insets.bottom) - lp.bottomMargin);
        }

        /* renamed from: n0 */
        public void mo5205n0(View child, boolean includeDecorInsets, Rect out) {
            Matrix childMatrix;
            if (includeDecorInsets) {
                Rect insets = ((C0881p) child.getLayoutParams()).f3664b;
                out.set(-insets.left, -insets.top, child.getWidth() + insets.right, child.getHeight() + insets.bottom);
            } else {
                out.set(0, 0, child.getWidth(), child.getHeight());
            }
            if (!(this.f3640b == null || (childMatrix = child.getMatrix()) == null || childMatrix.isIdentity())) {
                RectF tempRectF = this.f3640b.mTempRectF;
                tempRectF.set(out);
                childMatrix.mapRect(tempRectF);
                out.set((int) Math.floor((double) tempRectF.left), (int) Math.floor((double) tempRectF.top), (int) Math.ceil((double) tempRectF.right), (int) Math.ceil((double) tempRectF.bottom));
            }
            out.offset(child.getLeft(), child.getTop());
        }

        /* renamed from: P */
        public void mo5161P(View view, Rect outBounds) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, outBounds);
        }

        /* renamed from: Q */
        public int mo5162Q(View child) {
            return child.getLeft() - mo5175a0(child);
        }

        /* renamed from: U */
        public int mo5167U(View child) {
            return child.getTop() - mo5203m0(child);
        }

        /* renamed from: T */
        public int mo5166T(View child) {
            return child.getRight() + mo5198j0(child);
        }

        /* renamed from: O */
        public int mo5159O(View child) {
            return child.getBottom() + mo5147H(child);
        }

        /* renamed from: j */
        public void mo5197j(View child, Rect outRect) {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView == null) {
                outRect.set(0, 0, 0, 0);
            } else {
                outRect.set(recyclerView.getItemDecorInsetsForChild(child));
            }
        }

        /* renamed from: m0 */
        public int mo5203m0(View child) {
            return ((C0881p) child.getLayoutParams()).f3664b.top;
        }

        /* renamed from: H */
        public int mo5147H(View child) {
            return ((C0881p) child.getLayoutParams()).f3664b.bottom;
        }

        /* renamed from: a0 */
        public int mo5175a0(View child) {
            return ((C0881p) child.getLayoutParams()).f3664b.left;
        }

        /* renamed from: j0 */
        public int mo5198j0(View child) {
            return ((C0881p) child.getLayoutParams()).f3664b.right;
        }

        /* renamed from: J0 */
        public View mo4702J0(View focused, int direction, C0888v recycler, C0856a0 state) {
            return null;
        }

        /* renamed from: Q0 */
        public View mo5163Q0(View focused, int direction) {
            return null;
        }

        /* renamed from: L */
        public final int[] mo5154L(View child, Rect rect) {
            int dx;
            int dy;
            Rect rect2 = rect;
            int[] out = new int[2];
            int parentLeft = mo5185e0();
            int parentTop = mo5190g0();
            int parentRight = mo5207o0() - mo5188f0();
            int parentBottom = mo5170W() - mo5183d0();
            int childLeft = (child.getLeft() + rect2.left) - child.getScrollX();
            int childTop = (child.getTop() + rect2.top) - child.getScrollY();
            int childRight = rect.width() + childLeft;
            int offScreenLeft = Math.min(0, childLeft - parentLeft);
            int offScreenTop = Math.min(0, childTop - parentTop);
            int offScreenRight = Math.max(0, childRight - parentRight);
            int offScreenBottom = Math.max(0, (rect.height() + childTop) - parentBottom);
            if (mo5173Z() == 1) {
                if (offScreenRight != 0) {
                    dx = offScreenRight;
                } else {
                    dx = Math.max(offScreenLeft, childRight - parentRight);
                }
            } else if (offScreenLeft != 0) {
                dx = offScreenLeft;
            } else {
                dx = Math.min(childLeft - parentLeft, offScreenRight);
            }
            if (offScreenTop != 0) {
                dy = offScreenTop;
            } else {
                dy = Math.min(childTop - parentTop, offScreenBottom);
            }
            out[0] = dx;
            out[1] = dy;
            return out;
        }

        /* renamed from: r1 */
        public boolean mo5214r1(RecyclerView parent, View child, Rect rect, boolean immediate) {
            return mo5215s1(parent, child, rect, immediate, false);
        }

        /* renamed from: s1 */
        public boolean mo5215s1(RecyclerView parent, View child, Rect rect, boolean immediate, boolean focusedChildVisible) {
            int[] scrollAmount = mo5154L(child, rect);
            int dx = scrollAmount[0];
            int dy = scrollAmount[1];
            if ((focusedChildVisible && !mo5216t0(parent, dx, dy)) || (dx == 0 && dy == 0)) {
                return false;
            }
            if (immediate) {
                parent.scrollBy(dx, dy);
            } else {
                parent.smoothScrollBy(dx, dy);
            }
            return true;
        }

        /* renamed from: y0 */
        public boolean mo5226y0(View child, boolean completelyVisible, boolean acceptEndPointInclusion) {
            boolean isViewFullyVisible = this.f3643e.mo3398b(child, 24579) && this.f3644f.mo3398b(child, 24579);
            if (completelyVisible) {
                return isViewFullyVisible;
            }
            if (!isViewFullyVisible) {
                return true;
            }
            return false;
        }

        /* renamed from: t0 */
        public final boolean mo5216t0(RecyclerView parent, int dx, int dy) {
            View focusedChild = parent.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int parentLeft = mo5185e0();
            int parentTop = mo5190g0();
            int parentRight = mo5207o0() - mo5188f0();
            int parentBottom = mo5170W() - mo5183d0();
            Rect bounds = this.f3640b.mTempRect;
            mo5161P(focusedChild, bounds);
            if (bounds.left - dx >= parentRight || bounds.right - dx <= parentLeft || bounds.top - dy >= parentBottom || bounds.bottom - dy <= parentTop) {
                return false;
            }
            return true;
        }

        @Deprecated
        /* renamed from: a1 */
        public boolean mo5176a1(RecyclerView parent, View child, View focused) {
            return mo5224x0() || parent.isComputingLayout();
        }

        /* renamed from: b1 */
        public boolean mo5179b1(RecyclerView parent, C0856a0 state, View child, View focused) {
            return mo5176a1(parent, child, focused);
        }

        /* renamed from: E0 */
        public void mo5141E0(C0865g oldAdapter, C0865g newAdapter) {
        }

        /* renamed from: F0 */
        public boolean mo5143F0(RecyclerView recyclerView, ArrayList<View> arrayList, int direction, int focusableMode) {
            return false;
        }

        /* renamed from: S0 */
        public void mo4712S0(RecyclerView recyclerView) {
        }

        /* renamed from: R0 */
        public void mo4710R0(RecyclerView recyclerView, int positionStart, int itemCount) {
        }

        /* renamed from: U0 */
        public void mo4716U0(RecyclerView recyclerView, int positionStart, int itemCount) {
        }

        /* renamed from: V0 */
        public void mo5169V0(RecyclerView recyclerView, int positionStart, int itemCount) {
        }

        /* renamed from: W0 */
        public void mo4719W0(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
            mo5169V0(recyclerView, positionStart, itemCount);
        }

        /* renamed from: T0 */
        public void mo4714T0(RecyclerView recyclerView, int from, int to, int itemCount) {
        }

        /* renamed from: q */
        public int mo4805q(C0856a0 state) {
            return 0;
        }

        /* renamed from: r */
        public int mo4735r(C0856a0 state) {
            return 0;
        }

        /* renamed from: s */
        public int mo4736s(C0856a0 state) {
            return 0;
        }

        /* renamed from: t */
        public int mo4809t(C0856a0 state) {
            return 0;
        }

        /* renamed from: u */
        public int mo4738u(C0856a0 state) {
            return 0;
        }

        /* renamed from: v */
        public int mo4740v(C0856a0 state) {
            return 0;
        }

        /* renamed from: Z0 */
        public void mo5174Z0(C0888v recycler, C0856a0 state, int widthSpec, int heightSpec) {
            this.f3640b.defaultOnMeasure(widthSpec, heightSpec);
        }

        /* renamed from: B1 */
        public void mo5137B1(int widthSize, int heightSize) {
            this.f3640b.setMeasuredDimension(widthSize, heightSize);
        }

        /* renamed from: c0 */
        public int mo5181c0() {
            return C0460r.m2294x(this.f3640b);
        }

        /* renamed from: b0 */
        public int mo5178b0() {
            return C0460r.m2293w(this.f3640b);
        }

        /* renamed from: d1 */
        public Parcelable mo4787d1() {
            return null;
        }

        /* renamed from: c1 */
        public void mo4785c1(Parcelable state) {
        }

        /* renamed from: K1 */
        public void mo5153K1() {
            C0893z zVar = this.f3645g;
            if (zVar != null) {
                zVar.mo5308r();
            }
        }

        /* renamed from: f1 */
        public void mo5189f1(C0893z smoothScroller) {
            if (this.f3645g == smoothScroller) {
                this.f3645g = null;
            }
        }

        /* renamed from: e1 */
        public void mo5186e1(int state) {
        }

        /* renamed from: k1 */
        public void mo5200k1(C0888v recycler) {
            for (int i = mo5151J() - 1; i >= 0; i--) {
                if (!RecyclerView.getChildViewHolderInt(mo5150I(i)).mo5056J()) {
                    mo5206n1(i, recycler);
                }
            }
        }

        /* renamed from: M0 */
        public void mo5157M0(C0424c info) {
            RecyclerView recyclerView = this.f3640b;
            mo5158N0(recyclerView.mRecycler, recyclerView.mState, info);
        }

        /* renamed from: N0 */
        public void mo5158N0(C0888v recycler, C0856a0 state, C0424c info) {
            if (this.f3640b.canScrollVertically(-1) || this.f3640b.canScrollHorizontally(-1)) {
                info.mo2464a(8192);
                info.mo2490m0(true);
            }
            if (this.f3640b.canScrollVertically(1) || this.f3640b.canScrollHorizontally(1)) {
                info.mo2464a(4096);
                info.mo2490m0(true);
            }
            info.mo2461X(C0424c.C0426b.m2151a(mo4733k0(recycler, state), mo4704N(recycler, state), mo5220v0(recycler, state), mo5201l0(recycler, state)));
        }

        /* renamed from: K0 */
        public void mo4765K0(AccessibilityEvent event) {
            RecyclerView recyclerView = this.f3640b;
            mo5155L0(recyclerView.mRecycler, recyclerView.mState, event);
        }

        /* renamed from: L0 */
        public void mo5155L0(C0888v recycler, C0856a0 state, AccessibilityEvent event) {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView != null && event != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3640b.canScrollVertically(-1) && !this.f3640b.canScrollHorizontally(-1) && !this.f3640b.canScrollHorizontally(1)) {
                    z = false;
                }
                event.setScrollable(z);
                C0865g gVar = this.f3640b.mAdapter;
                if (gVar != null) {
                    event.setItemCount(gVar.mo5089c());
                }
            }
        }

        /* renamed from: O0 */
        public void mo5160O0(View host, C0424c info) {
            C0862d0 vh = RecyclerView.getChildViewHolderInt(host);
            if (vh != null && !vh.mo5081v() && !this.f3639a.mo3203n(vh.f3608a)) {
                RecyclerView recyclerView = this.f3640b;
                mo4708P0(recyclerView.mRecycler, recyclerView.mState, host, info);
            }
        }

        /* renamed from: P0 */
        public void mo4708P0(C0888v recycler, C0856a0 state, View host, C0424c info) {
            info.mo2462Y(C0424c.C0427c.m2152a(mo4797l() ? mo5193h0(host) : 0, 1, mo4795k() ? mo5193h0(host) : 0, 1, false, false));
        }

        /* renamed from: u1 */
        public void mo5219u1() {
            this.f3646h = true;
        }

        /* renamed from: l0 */
        public int mo5201l0(C0888v recycler, C0856a0 state) {
            return 0;
        }

        /* renamed from: k0 */
        public int mo4733k0(C0888v recycler, C0856a0 state) {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo4797l()) {
                return 1;
            }
            return this.f3640b.mAdapter.mo5089c();
        }

        /* renamed from: N */
        public int mo4704N(C0888v recycler, C0856a0 state) {
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo4795k()) {
                return 1;
            }
            return this.f3640b.mAdapter.mo5089c();
        }

        /* renamed from: v0 */
        public boolean mo5220v0(C0888v recycler, C0856a0 state) {
            return false;
        }

        /* renamed from: g1 */
        public boolean mo5191g1(int action, Bundle args) {
            RecyclerView recyclerView = this.f3640b;
            return mo5194h1(recyclerView.mRecycler, recyclerView.mState, action, args);
        }

        /* renamed from: h1 */
        public boolean mo5194h1(C0888v recycler, C0856a0 state, int action, Bundle args) {
            int i = action;
            RecyclerView recyclerView = this.f3640b;
            if (recyclerView == null) {
                return false;
            }
            int vScroll = 0;
            int hScroll = 0;
            if (i == 4096) {
                if (recyclerView.canScrollVertically(1)) {
                    vScroll = (mo5170W() - mo5190g0()) - mo5183d0();
                }
                if (this.f3640b.canScrollHorizontally(1)) {
                    hScroll = (mo5207o0() - mo5185e0()) - mo5188f0();
                }
            } else if (i == 8192) {
                if (recyclerView.canScrollVertically(-1)) {
                    vScroll = -((mo5170W() - mo5190g0()) - mo5183d0());
                }
                if (this.f3640b.canScrollHorizontally(-1)) {
                    hScroll = -((mo5207o0() - mo5185e0()) - mo5188f0());
                }
            }
            if (vScroll == 0 && hScroll == 0) {
                return false;
            }
            this.f3640b.smoothScrollBy(hScroll, vScroll, (Interpolator) null, RecyclerView.UNDEFINED_DURATION, true);
            return true;
        }

        /* renamed from: i1 */
        public boolean mo5196i1(View view, int action, Bundle args) {
            RecyclerView recyclerView = this.f3640b;
            return mo5199j1(recyclerView.mRecycler, recyclerView.mState, view, action, args);
        }

        /* renamed from: j1 */
        public boolean mo5199j1(C0888v recycler, C0856a0 state, View view, int action, Bundle args) {
            return false;
        }

        /* renamed from: i0 */
        public static C0880d m4567i0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            C0880d properties = new C0880d();
            TypedArray a = context.obtainStyledAttributes(attrs, C0609c.f2414a, defStyleAttr, defStyleRes);
            properties.f3659a = a.getInt(C0609c.f2415b, 1);
            properties.f3660b = a.getInt(C0609c.f2425l, 1);
            properties.f3661c = a.getBoolean(C0609c.f2424k, false);
            properties.f3662d = a.getBoolean(C0609c.f2426m, false);
            a.recycle();
            return properties;
        }

        /* renamed from: z1 */
        public void mo5229z1(RecyclerView recyclerView) {
            mo5134A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: G1 */
        public boolean mo4758G1() {
            return false;
        }

        /* renamed from: q0 */
        public boolean mo5211q0() {
            int childCount = mo5151J();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams lp = mo5150I(i).getLayoutParams();
                if (lp.width < 0 && lp.height < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C0875n {
        /* renamed from: g */
        public void mo5130g(Canvas c, RecyclerView parent, C0856a0 state) {
            mo5129f(c, parent);
        }

        @Deprecated
        /* renamed from: f */
        public void mo5129f(Canvas c, RecyclerView parent) {
        }

        /* renamed from: i */
        public void mo3272i(Canvas c, RecyclerView parent, C0856a0 state) {
            mo5131h(c, parent);
        }

        @Deprecated
        /* renamed from: h */
        public void mo5131h(Canvas c, RecyclerView parent) {
        }

        @Deprecated
        /* renamed from: d */
        public void mo5127d(Rect outRect, int itemPosition, RecyclerView parent) {
            outRect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo5128e(Rect outRect, View view, RecyclerView parent, C0856a0 state) {
            mo5127d(outRect, ((C0881p) view.getLayoutParams()).mo5230a(), parent);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C0885t {
        /* renamed from: a */
        public void mo3396a(RecyclerView recyclerView, int newState) {
        }

        /* renamed from: b */
        public void mo3291b(RecyclerView recyclerView, int dx, int dy) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C0862d0 {

        /* renamed from: s */
        public static final List<Object> f3607s = Collections.emptyList();

        /* renamed from: a */
        public final View f3608a;

        /* renamed from: b */
        public WeakReference<RecyclerView> f3609b;

        /* renamed from: c */
        public int f3610c = -1;

        /* renamed from: d */
        public int f3611d = -1;

        /* renamed from: e */
        public long f3612e = -1;

        /* renamed from: f */
        public int f3613f = -1;

        /* renamed from: g */
        public int f3614g = -1;

        /* renamed from: h */
        public C0862d0 f3615h = null;

        /* renamed from: i */
        public C0862d0 f3616i = null;

        /* renamed from: j */
        public int f3617j;

        /* renamed from: k */
        public List<Object> f3618k = null;

        /* renamed from: l */
        public List<Object> f3619l = null;

        /* renamed from: m */
        public int f3620m = 0;

        /* renamed from: n */
        public C0888v f3621n = null;

        /* renamed from: o */
        public boolean f3622o = false;

        /* renamed from: p */
        public int f3623p = 0;

        /* renamed from: q */
        public int f3624q = -1;

        /* renamed from: r */
        public RecyclerView f3625r;

        public C0862d0(View itemView) {
            if (itemView != null) {
                this.f3608a = itemView;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: i */
        public void mo5067i(int mNewPosition, int offset, boolean applyToPreLayout) {
            mo5060b(8);
            mo5047A(offset, applyToPreLayout);
            this.f3610c = mNewPosition;
        }

        /* renamed from: A */
        public void mo5047A(int offset, boolean applyToPreLayout) {
            if (this.f3611d == -1) {
                this.f3611d = this.f3610c;
            }
            if (this.f3614g == -1) {
                this.f3614g = this.f3610c;
            }
            if (applyToPreLayout) {
                this.f3614g += offset;
            }
            this.f3610c += offset;
            if (this.f3608a.getLayoutParams() != null) {
                ((C0881p) this.f3608a.getLayoutParams()).f3665c = true;
            }
        }

        /* renamed from: c */
        public void mo5061c() {
            this.f3611d = -1;
            this.f3614g = -1;
        }

        /* renamed from: E */
        public void mo5051E() {
            if (this.f3611d == -1) {
                this.f3611d = this.f3610c;
            }
        }

        /* renamed from: J */
        public boolean mo5056J() {
            return (this.f3617j & 128) != 0;
        }

        /* renamed from: m */
        public final int mo5071m() {
            int i = this.f3614g;
            return i == -1 ? this.f3610c : i;
        }

        /* renamed from: j */
        public final int mo5068j() {
            RecyclerView recyclerView = this.f3625r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        /* renamed from: n */
        public final int mo5072n() {
            return this.f3611d;
        }

        /* renamed from: k */
        public final long mo5069k() {
            return this.f3612e;
        }

        /* renamed from: l */
        public final int mo5070l() {
            return this.f3613f;
        }

        /* renamed from: w */
        public boolean mo5082w() {
            return this.f3621n != null;
        }

        /* renamed from: K */
        public void mo5057K() {
            this.f3621n.mo5257J(this);
        }

        /* renamed from: L */
        public boolean mo5058L() {
            return (this.f3617j & 32) != 0;
        }

        /* renamed from: e */
        public void mo5063e() {
            this.f3617j &= -33;
        }

        /* renamed from: f */
        public void mo5064f() {
            this.f3617j &= -257;
        }

        /* renamed from: H */
        public void mo5054H(C0888v recycler, boolean isChangeScrap) {
            this.f3621n = recycler;
            this.f3622o = isChangeScrap;
        }

        /* renamed from: t */
        public boolean mo5078t() {
            return (this.f3617j & 4) != 0;
        }

        /* renamed from: z */
        public boolean mo5085z() {
            return (this.f3617j & 2) != 0;
        }

        /* renamed from: s */
        public boolean mo5077s() {
            return (this.f3617j & 1) != 0;
        }

        /* renamed from: v */
        public boolean mo5081v() {
            return (this.f3617j & 8) != 0;
        }

        /* renamed from: p */
        public boolean mo5074p(int flags) {
            return (this.f3617j & flags) != 0;
        }

        /* renamed from: x */
        public boolean mo5083x() {
            return (this.f3617j & 256) != 0;
        }

        /* renamed from: r */
        public boolean mo5076r() {
            return (this.f3608a.getParent() == null || this.f3608a.getParent() == this.f3625r) ? false : true;
        }

        /* renamed from: q */
        public boolean mo5075q() {
            return (this.f3617j & 512) != 0 || mo5078t();
        }

        /* renamed from: F */
        public void mo5052F(int flags, int mask) {
            this.f3617j = (this.f3617j & (~mask)) | (flags & mask);
        }

        /* renamed from: b */
        public void mo5060b(int flags) {
            this.f3617j |= flags;
        }

        /* renamed from: a */
        public void mo5059a(Object payload) {
            if (payload == null) {
                mo5060b(1024);
            } else if ((1024 & this.f3617j) == 0) {
                mo5065g();
                this.f3618k.add(payload);
            }
        }

        /* renamed from: g */
        public final void mo5065g() {
            if (this.f3618k == null) {
                ArrayList arrayList = new ArrayList();
                this.f3618k = arrayList;
                this.f3619l = Collections.unmodifiableList(arrayList);
            }
        }

        /* renamed from: d */
        public void mo5062d() {
            List<Object> list = this.f3618k;
            if (list != null) {
                list.clear();
            }
            this.f3617j &= -1025;
        }

        /* renamed from: o */
        public List<Object> mo5073o() {
            if ((this.f3617j & 1024) != 0) {
                return f3607s;
            }
            List<Object> list = this.f3618k;
            if (list == null || list.size() == 0) {
                return f3607s;
            }
            return this.f3619l;
        }

        /* renamed from: D */
        public void mo5050D() {
            this.f3617j = 0;
            this.f3610c = -1;
            this.f3611d = -1;
            this.f3612e = -1;
            this.f3614g = -1;
            this.f3620m = 0;
            this.f3615h = null;
            this.f3616i = null;
            mo5062d();
            this.f3623p = 0;
            this.f3624q = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* renamed from: B */
        public void mo5048B(RecyclerView parent) {
            int i = this.f3624q;
            if (i != -1) {
                this.f3623p = i;
            } else {
                this.f3623p = C0460r.m2290t(this.f3608a);
            }
            parent.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* renamed from: C */
        public void mo5049C(RecyclerView parent) {
            parent.setChildImportantForAccessibilityInternal(this, this.f3623p);
            this.f3623p = 0;
        }

        public String toString() {
            String className = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(className + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3610c + " id=" + this.f3612e + ", oldPos=" + this.f3611d + ", pLpos:" + this.f3614g);
            if (mo5082w()) {
                sb.append(" scrap ");
                sb.append(this.f3622o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo5078t()) {
                sb.append(" invalid");
            }
            if (!mo5077s()) {
                sb.append(" unbound");
            }
            if (mo5085z()) {
                sb.append(" update");
            }
            if (mo5081v()) {
                sb.append(" removed");
            }
            if (mo5056J()) {
                sb.append(" ignored");
            }
            if (mo5083x()) {
                sb.append(" tmpDetached");
            }
            if (!mo5080u()) {
                sb.append(" not recyclable(" + this.f3620m + ")");
            }
            if (mo5075q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3608a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: G */
        public final void mo5053G(boolean recyclable) {
            int i = this.f3620m;
            int i2 = recyclable ? i - 1 : i + 1;
            this.f3620m = i2;
            if (i2 < 0) {
                this.f3620m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!recyclable && i2 == 1) {
                this.f3617j |= 16;
            } else if (recyclable && i2 == 0) {
                this.f3617j &= -17;
            }
        }

        /* renamed from: u */
        public final boolean mo5080u() {
            return (this.f3617j & 16) == 0 && !C0460r.m2232G(this.f3608a);
        }

        /* renamed from: I */
        public boolean mo5055I() {
            return (this.f3617j & 16) != 0;
        }

        /* renamed from: h */
        public boolean mo5066h() {
            return (this.f3617j & 16) == 0 && C0460r.m2232G(this.f3608a);
        }

        /* renamed from: y */
        public boolean mo5084y() {
            return (this.f3617j & 2) != 0;
        }
    }

    public boolean setChildImportantForAccessibilityInternal(C0862d0 viewHolder, int importantForAccessibility) {
        if (isComputingLayout()) {
            viewHolder.f3624q = importantForAccessibility;
            this.mPendingAccessibilityImportanceChange.add(viewHolder);
            return false;
        }
        C0460r.m2275l0(viewHolder.f3608a, importantForAccessibility);
        return true;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int state;
        for (int i = this.mPendingAccessibilityImportanceChange.size() - 1; i >= 0; i--) {
            C0862d0 viewHolder = this.mPendingAccessibilityImportanceChange.get(i);
            if (viewHolder.f3608a.getParent() == this && !viewHolder.mo5056J() && (state = viewHolder.f3624q) != -1) {
                C0460r.m2275l0(viewHolder.f3608a, state);
                viewHolder.f3624q = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public int getAdapterPositionFor(C0862d0 viewHolder) {
        if (viewHolder.mo5074p(524) || !viewHolder.mo5077s()) {
            return -1;
        }
        return this.mAdapterHelper.mo3160e(viewHolder.f3610c);
    }

    public void initFastScroller(StateListDrawable verticalThumbDrawable, Drawable verticalTrackDrawable, StateListDrawable horizontalThumbDrawable, Drawable horizontalTrackDrawable) {
        if (verticalThumbDrawable == null || verticalTrackDrawable == null || horizontalThumbDrawable == null || horizontalTrackDrawable == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new C0627d(this, verticalThumbDrawable, verticalTrackDrawable, horizontalThumbDrawable, horizontalTrackDrawable, resources.getDimensionPixelSize(C0608b.fastscroll_default_thickness), resources.getDimensionPixelSize(C0608b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0608b.fastscroll_margin));
    }

    public void setNestedScrollingEnabled(boolean enabled) {
        getScrollingChildHelper().mo2540n(enabled);
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo2539m();
    }

    public boolean startNestedScroll(int axes) {
        return getScrollingChildHelper().mo2542p(axes);
    }

    public boolean startNestedScroll(int axes, int type) {
        return getScrollingChildHelper().mo2543q(axes, type);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo2544r();
    }

    public void stopNestedScroll(int type) {
        getScrollingChildHelper().mo2545s(type);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo2537k();
    }

    public boolean hasNestedScrollingParent(int type) {
        return getScrollingChildHelper().mo2538l(type);
    }

    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return getScrollingChildHelper().mo2532f(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return getScrollingChildHelper().mo2533g(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    public final void dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        getScrollingChildHelper().mo2531e(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, consumed);
    }

    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return getScrollingChildHelper().mo2529c(dx, dy, consumed, offsetInWindow);
    }

    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return getScrollingChildHelper().mo2530d(dx, dy, consumed, offsetInWindow, type);
    }

    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return getScrollingChildHelper().mo2527a(velocityX, velocityY, consumed);
    }

    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return getScrollingChildHelper().mo2528b(velocityX, velocityY);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C0881p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public C0862d0 f3663a;

        /* renamed from: b */
        public final Rect f3664b = new Rect();

        /* renamed from: c */
        public boolean f3665c = true;

        /* renamed from: d */
        public boolean f3666d = false;

        public C0881p(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public C0881p(int width, int height) {
            super(width, height);
        }

        public C0881p(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public C0881p(ViewGroup.LayoutParams source) {
            super(source);
        }

        public C0881p(C0881p source) {
            super(source);
        }

        /* renamed from: d */
        public boolean mo5233d() {
            return this.f3663a.mo5078t();
        }

        /* renamed from: c */
        public boolean mo5232c() {
            return this.f3663a.mo5081v();
        }

        /* renamed from: b */
        public boolean mo5231b() {
            return this.f3663a.mo5084y();
        }

        /* renamed from: a */
        public int mo5230a() {
            return this.f3663a.mo5071m();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C0867i {
        /* renamed from: a */
        public void mo5109a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C0893z {

        /* renamed from: a */
        public int f3684a = -1;

        /* renamed from: b */
        public RecyclerView f3685b;

        /* renamed from: c */
        public C0876o f3686c;

        /* renamed from: d */
        public boolean f3687d;

        /* renamed from: e */
        public boolean f3688e;

        /* renamed from: f */
        public View f3689f;

        /* renamed from: g */
        public final C0894a f3690g = new C0894a(0, 0);

        /* renamed from: h */
        public boolean f3691h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface C0895b {
            /* renamed from: a */
            PointF mo4782a(int i);
        }

        /* renamed from: l */
        public abstract void mo3319l(int i, int i2, C0856a0 a0Var, C0894a aVar);

        /* renamed from: m */
        public abstract void mo3320m();

        /* renamed from: n */
        public abstract void mo3321n();

        /* renamed from: o */
        public abstract void mo3322o(View view, C0856a0 a0Var, C0894a aVar);

        /* renamed from: q */
        public void mo5307q(RecyclerView recyclerView, C0876o layoutManager) {
            recyclerView.mViewFlinger.mo5045g();
            if (this.f3691h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3685b = recyclerView;
            this.f3686c = layoutManager;
            int i = this.f3684a;
            if (i != -1) {
                recyclerView.mState.f3581a = i;
                this.f3688e = true;
                this.f3687d = true;
                this.f3689f = mo5296b(mo5300f());
                mo3320m();
                this.f3685b.mViewFlinger.mo5043e();
                this.f3691h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: p */
        public void mo5306p(int targetPosition) {
            this.f3684a = targetPosition;
        }

        /* renamed from: a */
        public PointF mo5295a(int targetPosition) {
            C0876o layoutManager = mo5299e();
            if (layoutManager instanceof C0895b) {
                return ((C0895b) layoutManager).mo4782a(targetPosition);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C0895b.class.getCanonicalName());
            return null;
        }

        /* renamed from: e */
        public C0876o mo5299e() {
            return this.f3686c;
        }

        /* renamed from: r */
        public final void mo5308r() {
            if (this.f3688e) {
                this.f3688e = false;
                mo3321n();
                this.f3685b.mState.f3581a = -1;
                this.f3689f = null;
                this.f3684a = -1;
                this.f3687d = false;
                this.f3686c.mo5189f1(this);
                this.f3686c = null;
                this.f3685b = null;
            }
        }

        /* renamed from: g */
        public boolean mo5301g() {
            return this.f3687d;
        }

        /* renamed from: h */
        public boolean mo5302h() {
            return this.f3688e;
        }

        /* renamed from: f */
        public int mo5300f() {
            return this.f3684a;
        }

        /* renamed from: j */
        public void mo5304j(int dx, int dy) {
            PointF pointF;
            RecyclerView recyclerView = this.f3685b;
            if (this.f3684a == -1 || recyclerView == null) {
                mo5308r();
            }
            if (this.f3687d && this.f3689f == null && this.f3686c != null && (pointF = mo5295a(this.f3684a)) != null) {
                float f = pointF.x;
                if (!(f == 0.0f && pointF.y == 0.0f)) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(pointF.y), (int[]) null);
                }
            }
            this.f3687d = false;
            View view = this.f3689f;
            if (view != null) {
                if (mo5298d(view) == this.f3684a) {
                    mo3322o(this.f3689f, recyclerView.mState, this.f3690g);
                    this.f3690g.mo5311c(recyclerView);
                    mo5308r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f3689f = null;
                }
            }
            if (this.f3688e) {
                mo3319l(dx, dy, recyclerView.mState, this.f3690g);
                boolean hadJumpTarget = this.f3690g.mo5309a();
                this.f3690g.mo5311c(recyclerView);
                if (hadJumpTarget && this.f3688e) {
                    this.f3687d = true;
                    recyclerView.mViewFlinger.mo5043e();
                }
            }
        }

        /* renamed from: d */
        public int mo5298d(View view) {
            return this.f3685b.getChildLayoutPosition(view);
        }

        /* renamed from: c */
        public int mo5297c() {
            return this.f3685b.mLayout.mo5151J();
        }

        /* renamed from: b */
        public View mo5296b(int position) {
            return this.f3685b.mLayout.mo4754C(position);
        }

        /* renamed from: k */
        public void mo5305k(View child) {
            if (mo5298d(child) == mo5300f()) {
                this.f3689f = child;
            }
        }

        /* renamed from: i */
        public void mo5303i(PointF scrollVector) {
            float f = scrollVector.x;
            float f2 = scrollVector.y;
            float magnitude = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            scrollVector.x /= magnitude;
            scrollVector.y /= magnitude;
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class C0894a {

            /* renamed from: a */
            public int f3692a;

            /* renamed from: b */
            public int f3693b;

            /* renamed from: c */
            public int f3694c;

            /* renamed from: d */
            public int f3695d;

            /* renamed from: e */
            public Interpolator f3696e;

            /* renamed from: f */
            public boolean f3697f;

            /* renamed from: g */
            public int f3698g;

            public C0894a(int dx, int dy) {
                this(dx, dy, RecyclerView.UNDEFINED_DURATION, (Interpolator) null);
            }

            public C0894a(int dx, int dy, int duration, Interpolator interpolator) {
                this.f3695d = -1;
                this.f3697f = false;
                this.f3698g = 0;
                this.f3692a = dx;
                this.f3693b = dy;
                this.f3694c = duration;
                this.f3696e = interpolator;
            }

            /* renamed from: b */
            public void mo5310b(int targetPosition) {
                this.f3695d = targetPosition;
            }

            /* renamed from: a */
            public boolean mo5309a() {
                return this.f3695d >= 0;
            }

            /* renamed from: c */
            public void mo5311c(RecyclerView recyclerView) {
                if (this.f3695d >= 0) {
                    int position = this.f3695d;
                    this.f3695d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(position);
                    this.f3697f = false;
                } else if (this.f3697f != 0) {
                    mo5313e();
                    recyclerView.mViewFlinger.mo5044f(this.f3692a, this.f3693b, this.f3694c, this.f3696e);
                    int i = this.f3698g + 1;
                    this.f3698g = i;
                    if (i > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3697f = false;
                } else {
                    this.f3698g = 0;
                }
            }

            /* renamed from: e */
            public final void mo5313e() {
                if (this.f3696e != null && this.f3694c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3694c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: d */
            public void mo5312d(int dx, int dy, int duration, Interpolator interpolator) {
                this.f3692a = dx;
                this.f3693b = dy;
                this.f3694c = duration;
                this.f3696e = interpolator;
                this.f3697f = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static class C0866h extends Observable<C0867i> {
        /* renamed from: a */
        public boolean mo5107a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo5108b() {
            for (int i = this.mObservers.size() - 1; i >= 0; i--) {
                ((C0867i) this.mObservers.get(i)).mo5109a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C0891y extends C0501a {
        public static final Parcelable.Creator<C0891y> CREATOR = new C0892a();

        /* renamed from: d */
        public Parcelable f3683d;

        public C0891y(Parcel in, ClassLoader loader) {
            super(in, loader);
            ClassLoader classLoader;
            if (loader != null) {
                classLoader = loader;
            } else {
                classLoader = C0876o.class.getClassLoader();
            }
            this.f3683d = in.readParcelable(classLoader);
        }

        public C0891y(Parcelable superState) {
            super(superState);
        }

        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeParcelable(this.f3683d, 0);
        }

        /* renamed from: g */
        public void mo5288g(C0891y other) {
            this.f3683d = other.f3683d;
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        public static class C0892a implements Parcelable.ClassLoaderCreator<C0891y> {
            /* renamed from: b */
            public C0891y createFromParcel(Parcel in, ClassLoader loader) {
                return new C0891y(in, loader);
            }

            /* renamed from: a */
            public C0891y createFromParcel(Parcel in) {
                return new C0891y(in, (ClassLoader) null);
            }

            /* renamed from: c */
            public C0891y[] newArray(int size) {
                return new C0891y[size];
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C0856a0 {

        /* renamed from: a */
        public int f3581a = -1;

        /* renamed from: b */
        public SparseArray<Object> f3582b;

        /* renamed from: c */
        public int f3583c = 0;

        /* renamed from: d */
        public int f3584d = 0;

        /* renamed from: e */
        public int f3585e = 1;

        /* renamed from: f */
        public int f3586f = 0;

        /* renamed from: g */
        public boolean f3587g = false;

        /* renamed from: h */
        public boolean f3588h = false;

        /* renamed from: i */
        public boolean f3589i = false;

        /* renamed from: j */
        public boolean f3590j = false;

        /* renamed from: k */
        public boolean f3591k = false;

        /* renamed from: l */
        public boolean f3592l = false;

        /* renamed from: m */
        public int f3593m;

        /* renamed from: n */
        public long f3594n;

        /* renamed from: o */
        public int f3595o;

        /* renamed from: p */
        public int f3596p;

        /* renamed from: q */
        public int f3597q;

        /* renamed from: a */
        public void mo5028a(int accepted) {
            if ((this.f3585e & accepted) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(accepted) + " but it is " + Integer.toBinaryString(this.f3585e));
            }
        }

        /* renamed from: f */
        public void mo5033f(C0865g adapter) {
            this.f3585e = 1;
            this.f3586f = adapter.mo5089c();
            this.f3588h = false;
            this.f3589i = false;
            this.f3590j = false;
        }

        /* renamed from: e */
        public boolean mo5032e() {
            return this.f3588h;
        }

        /* renamed from: g */
        public boolean mo5034g() {
            return this.f3592l;
        }

        /* renamed from: c */
        public int mo5030c() {
            return this.f3581a;
        }

        /* renamed from: d */
        public boolean mo5031d() {
            return this.f3581a != -1;
        }

        /* renamed from: b */
        public int mo5029b() {
            return this.f3588h ? this.f3583c - this.f3584d : this.f3586f;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3581a + ", mData=" + this.f3582b + ", mItemCount=" + this.f3586f + ", mIsMeasuring=" + this.f3590j + ", mPreviousLayoutItemCount=" + this.f3583c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3584d + ", mStructureChanged=" + this.f3587g + ", mInPreLayout=" + this.f3588h + ", mRunSimpleAnimations=" + this.f3591k + ", mRunPredictiveAnimations=" + this.f3592l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public class C0874m implements C0870l.C0872b {
        public C0874m() {
        }

        /* renamed from: a */
        public void mo5124a(C0862d0 item) {
            item.mo5053G(true);
            if (item.f3615h != null && item.f3616i == null) {
                item.f3615h = null;
            }
            item.f3616i = null;
            if (!item.mo5055I() && !RecyclerView.this.removeAnimatingView(item.f3608a) && item.mo5083x()) {
                RecyclerView.this.removeDetachedView(item.f3608a, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C0870l {

        /* renamed from: a */
        public C0872b f3630a = null;

        /* renamed from: b */
        public ArrayList<C0871a> f3631b = new ArrayList<>();

        /* renamed from: c */
        public long f3632c = 120;

        /* renamed from: d */
        public long f3633d = 120;

        /* renamed from: e */
        public long f3634e = 250;

        /* renamed from: f */
        public long f3635f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface C0871a {
            /* renamed from: a */
            void mo5123a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public interface C0872b {
            /* renamed from: a */
            void mo5124a(C0862d0 d0Var);
        }

        /* renamed from: a */
        public abstract boolean mo3382a(C0862d0 d0Var, C0873c cVar, C0873c cVar2);

        /* renamed from: b */
        public abstract boolean mo3383b(C0862d0 d0Var, C0862d0 d0Var2, C0873c cVar, C0873c cVar2);

        /* renamed from: c */
        public abstract boolean mo3384c(C0862d0 d0Var, C0873c cVar, C0873c cVar2);

        /* renamed from: d */
        public abstract boolean mo3385d(C0862d0 d0Var, C0873c cVar, C0873c cVar2);

        /* renamed from: f */
        public abstract boolean mo3386f(C0862d0 d0Var);

        /* renamed from: j */
        public abstract void mo3242j(C0862d0 d0Var);

        /* renamed from: k */
        public abstract void mo3243k();

        /* renamed from: p */
        public abstract boolean mo3244p();

        /* renamed from: u */
        public abstract void mo3245u();

        /* renamed from: n */
        public long mo5116n() {
            return this.f3634e;
        }

        /* renamed from: l */
        public long mo5114l() {
            return this.f3632c;
        }

        /* renamed from: o */
        public long mo5117o() {
            return this.f3633d;
        }

        /* renamed from: m */
        public long mo5115m() {
            return this.f3635f;
        }

        /* renamed from: v */
        public void mo5122v(C0872b listener) {
            this.f3630a = listener;
        }

        /* renamed from: t */
        public C0873c mo5121t(C0856a0 state, C0862d0 viewHolder, int changeFlags, List<Object> list) {
            C0873c q = mo5118q();
            q.mo5125a(viewHolder);
            return q;
        }

        /* renamed from: s */
        public C0873c mo5120s(C0856a0 state, C0862d0 viewHolder) {
            C0873c q = mo5118q();
            q.mo5125a(viewHolder);
            return q;
        }

        /* renamed from: e */
        public static int m4533e(C0862d0 viewHolder) {
            int flags = viewHolder.f3617j & 14;
            if (viewHolder.mo5078t()) {
                return 4;
            }
            if ((flags & 4) != 0) {
                return flags;
            }
            int oldPos = viewHolder.mo5072n();
            int pos = viewHolder.mo5068j();
            if (oldPos == -1 || pos == -1 || oldPos == pos) {
                return flags;
            }
            return flags | 2048;
        }

        /* renamed from: h */
        public final void mo5112h(C0862d0 viewHolder) {
            mo5119r(viewHolder);
            C0872b bVar = this.f3630a;
            if (bVar != null) {
                bVar.mo5124a(viewHolder);
            }
        }

        /* renamed from: r */
        public void mo5119r(C0862d0 viewHolder) {
        }

        /* renamed from: g */
        public boolean mo3241g(C0862d0 viewHolder, List<Object> list) {
            return mo3386f(viewHolder);
        }

        /* renamed from: i */
        public final void mo5113i() {
            int count = this.f3631b.size();
            for (int i = 0; i < count; i++) {
                this.f3631b.get(i).mo5123a();
            }
            this.f3631b.clear();
        }

        /* renamed from: q */
        public C0873c mo5118q() {
            return new C0873c();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C0873c {

            /* renamed from: a */
            public int f3636a;

            /* renamed from: b */
            public int f3637b;

            /* renamed from: a */
            public C0873c mo5125a(C0862d0 holder) {
                mo5126b(holder, 0);
                return this;
            }

            /* renamed from: b */
            public C0873c mo5126b(C0862d0 holder, int flags) {
                View view = holder.f3608a;
                this.f3636a = view.getLeft();
                this.f3637b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }
    }

    public int getChildDrawingOrder(int childCount, int i) {
        C0868j jVar = this.mChildDrawingOrderCallback;
        if (jVar == null) {
            return super.getChildDrawingOrder(childCount, i);
        }
        return jVar.mo5110a(childCount, i);
    }

    private C0452j getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0452j(this);
        }
        return this.mScrollingChildHelper;
    }
}
