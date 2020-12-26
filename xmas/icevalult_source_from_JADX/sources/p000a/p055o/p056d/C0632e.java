package p000a.p055o.p056d;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p000a.p025h.p034i.C0380a;

/* renamed from: a.o.d.e */
public final class C0632e implements Runnable {

    /* renamed from: f */
    public static final ThreadLocal<C0632e> f2531f = new ThreadLocal<>();

    /* renamed from: g */
    public static Comparator<C0635c> f2532g = new C0633a();

    /* renamed from: b */
    public ArrayList<RecyclerView> f2533b = new ArrayList<>();

    /* renamed from: c */
    public long f2534c;

    /* renamed from: d */
    public long f2535d;

    /* renamed from: e */
    public ArrayList<C0635c> f2536e = new ArrayList<>();

    /* renamed from: a.o.d.e$c */
    public static class C0635c {

        /* renamed from: a */
        public boolean f2541a;

        /* renamed from: b */
        public int f2542b;

        /* renamed from: c */
        public int f2543c;

        /* renamed from: d */
        public RecyclerView f2544d;

        /* renamed from: e */
        public int f2545e;

        /* renamed from: a */
        public void mo3312a() {
            this.f2541a = false;
            this.f2542b = 0;
            this.f2543c = 0;
            this.f2544d = null;
            this.f2545e = 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: a.o.d.e$b */
    public static class C0634b implements RecyclerView.C0876o.C0879c {

        /* renamed from: a */
        public int f2537a;

        /* renamed from: b */
        public int f2538b;

        /* renamed from: c */
        public int[] f2539c;

        /* renamed from: d */
        public int f2540d;

        /* renamed from: e */
        public void mo3311e(int dx, int dy) {
            this.f2537a = dx;
            this.f2538b = dy;
        }

        /* renamed from: c */
        public void mo3309c(RecyclerView view, boolean nested) {
            this.f2540d = 0;
            int[] iArr = this.f2539c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C0876o layout = view.mLayout;
            if (view.mAdapter != null && layout != null && layout.mo5218u0()) {
                if (nested) {
                    if (!view.mAdapterHelper.mo3171p()) {
                        layout.mo4803p(view.mAdapter.mo5089c(), this);
                    }
                } else if (!view.hasPendingAdapterUpdates()) {
                    layout.mo4801o(this.f2537a, this.f2538b, view.mState, this);
                }
                int i = this.f2540d;
                if (i > layout.f3651m) {
                    layout.f3651m = i;
                    layout.f3652n = nested;
                    view.mRecycler.mo5258K();
                }
            }
        }

        /* renamed from: a */
        public void mo3307a(int layoutPosition, int pixelDistance) {
            if (layoutPosition < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (pixelDistance >= 0) {
                int storagePosition = this.f2540d * 2;
                int[] iArr = this.f2539c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f2539c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (storagePosition >= iArr.length) {
                    int[] oldArray = this.f2539c;
                    int[] iArr3 = new int[(storagePosition * 2)];
                    this.f2539c = iArr3;
                    System.arraycopy(oldArray, 0, iArr3, 0, oldArray.length);
                }
                int[] oldArray2 = this.f2539c;
                oldArray2[storagePosition] = layoutPosition;
                oldArray2[storagePosition + 1] = pixelDistance;
                this.f2540d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: d */
        public boolean mo3310d(int position) {
            if (this.f2539c == null) {
                return false;
            }
            int count = this.f2540d * 2;
            for (int i = 0; i < count; i += 2) {
                if (this.f2539c[i] == position) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo3308b() {
            int[] iArr = this.f2539c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2540d = 0;
        }
    }

    /* renamed from: a */
    public void mo3295a(RecyclerView recyclerView) {
        this.f2533b.add(recyclerView);
    }

    /* renamed from: j */
    public void mo3303j(RecyclerView recyclerView) {
        boolean remove = this.f2533b.remove(recyclerView);
    }

    /* renamed from: f */
    public void mo3299f(RecyclerView recyclerView, int prefetchDx, int prefetchDy) {
        if (recyclerView.isAttachedToWindow() && this.f2534c == 0) {
            this.f2534c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.mo3311e(prefetchDx, prefetchDy);
    }

    /* renamed from: a.o.d.e$a */
    public static class C0633a implements Comparator<C0635c> {
        /* renamed from: a */
        public int compare(C0635c lhs, C0635c rhs) {
            RecyclerView recyclerView = lhs.f2544d;
            if ((recyclerView == null) == (rhs.f2544d == null)) {
                boolean z = lhs.f2541a;
                if (z == rhs.f2541a) {
                    int deltaViewVelocity = rhs.f2542b - lhs.f2542b;
                    if (deltaViewVelocity != 0) {
                        return deltaViewVelocity;
                    }
                    int deltaDistanceToItem = lhs.f2543c - rhs.f2543c;
                    if (deltaDistanceToItem != 0) {
                        return deltaDistanceToItem;
                    }
                    return 0;
                } else if (z) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (recyclerView == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: b */
    public final void mo3296b() {
        C0635c task;
        int viewCount = this.f2533b.size();
        int totalTaskCount = 0;
        for (int i = 0; i < viewCount; i++) {
            RecyclerView view = this.f2533b.get(i);
            if (view.getWindowVisibility() == 0) {
                view.mPrefetchRegistry.mo3309c(view, false);
                totalTaskCount += view.mPrefetchRegistry.f2540d;
            }
        }
        this.f2536e.ensureCapacity(totalTaskCount);
        int totalTaskIndex = 0;
        for (int i2 = 0; i2 < viewCount; i2++) {
            RecyclerView view2 = this.f2533b.get(i2);
            if (view2.getWindowVisibility() == 0) {
                C0634b prefetchRegistry = view2.mPrefetchRegistry;
                int viewVelocity = Math.abs(prefetchRegistry.f2537a) + Math.abs(prefetchRegistry.f2538b);
                for (int j = 0; j < prefetchRegistry.f2540d * 2; j += 2) {
                    if (totalTaskIndex >= this.f2536e.size()) {
                        task = new C0635c();
                        this.f2536e.add(task);
                    } else {
                        task = this.f2536e.get(totalTaskIndex);
                    }
                    int[] iArr = prefetchRegistry.f2539c;
                    int distanceToItem = iArr[j + 1];
                    task.f2541a = distanceToItem <= viewVelocity;
                    task.f2542b = viewVelocity;
                    task.f2543c = distanceToItem;
                    task.f2544d = view2;
                    task.f2545e = iArr[j];
                    totalTaskIndex++;
                }
            }
        }
        Collections.sort(this.f2536e, f2532g);
    }

    /* renamed from: e */
    public static boolean m3108e(RecyclerView view, int position) {
        int childCount = view.mChildHelper.mo3199j();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.C0862d0 holder = RecyclerView.getChildViewHolderInt(view.mChildHelper.mo3198i(i));
            if (holder.f3610c == position && !holder.mo5078t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final RecyclerView.C0862d0 mo3302i(RecyclerView view, int position, long deadlineNs) {
        if (m3108e(view, position)) {
            return null;
        }
        RecyclerView.C0888v recycler = view.mRecycler;
        try {
            view.onEnterLayoutOrScroll();
            RecyclerView.C0862d0 holder = recycler.mo5256I(position, false, deadlineNs);
            if (holder != null) {
                if (!holder.mo5077s() || holder.mo5078t()) {
                    recycler.mo5261a(holder, false);
                } else {
                    recycler.mo5249B(holder.f3608a);
                }
            }
            return holder;
        } finally {
            view.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: h */
    public final void mo3301h(RecyclerView innerView, long deadlineNs) {
        if (innerView != null) {
            if (innerView.mDataSetHasChangedAfterLayout && innerView.mChildHelper.mo3199j() != 0) {
                innerView.removeAndRecycleViews();
            }
            C0634b innerPrefetchRegistry = innerView.mPrefetchRegistry;
            innerPrefetchRegistry.mo3309c(innerView, true);
            if (innerPrefetchRegistry.f2540d != 0) {
                try {
                    C0380a.m1964a(RecyclerView.TRACE_NESTED_PREFETCH_TAG);
                    innerView.mState.mo5033f(innerView.mAdapter);
                    for (int i = 0; i < innerPrefetchRegistry.f2540d * 2; i += 2) {
                        mo3302i(innerView, innerPrefetchRegistry.f2539c[i], deadlineNs);
                    }
                } finally {
                    C0380a.m1965b();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo3297c(C0635c task, long deadlineNs) {
        RecyclerView.C0862d0 holder = mo3302i(task.f2544d, task.f2545e, task.f2541a ? RecyclerView.FOREVER_NS : deadlineNs);
        if (holder != null && holder.f3609b != null && holder.mo5077s() && !holder.mo5078t()) {
            mo3301h((RecyclerView) holder.f3609b.get(), deadlineNs);
        }
    }

    /* renamed from: d */
    public final void mo3298d(long deadlineNs) {
        int i = 0;
        while (i < this.f2536e.size()) {
            C0635c task = this.f2536e.get(i);
            if (task.f2544d != null) {
                mo3297c(task, deadlineNs);
                task.mo3312a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public void mo3300g(long deadlineNs) {
        mo3296b();
        mo3298d(deadlineNs);
    }

    public void run() {
        try {
            C0380a.m1964a(RecyclerView.TRACE_PREFETCH_TAG);
            if (!this.f2533b.isEmpty()) {
                int size = this.f2533b.size();
                long latestFrameVsyncMs = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView view = this.f2533b.get(i);
                    if (view.getWindowVisibility() == 0) {
                        latestFrameVsyncMs = Math.max(view.getDrawingTime(), latestFrameVsyncMs);
                    }
                }
                if (latestFrameVsyncMs == 0) {
                    this.f2534c = 0;
                    C0380a.m1965b();
                    return;
                }
                mo3300g(TimeUnit.MILLISECONDS.toNanos(latestFrameVsyncMs) + this.f2535d);
                this.f2534c = 0;
                C0380a.m1965b();
            }
        } finally {
            this.f2534c = 0;
            C0380a.m1965b();
        }
    }
}
