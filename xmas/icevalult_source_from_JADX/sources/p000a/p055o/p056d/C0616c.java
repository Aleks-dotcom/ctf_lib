package p000a.p055o.p056d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.o.d.c */
public class C0616c extends C0647m {

    /* renamed from: s */
    public static TimeInterpolator f2444s;

    /* renamed from: h */
    public ArrayList<RecyclerView.C0862d0> f2445h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.C0862d0> f2446i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C0626j> f2447j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<C0625i> f2448k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.C0862d0>> f2449l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<C0626j>> f2450m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<C0625i>> f2451n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.C0862d0> f2452o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.C0862d0> f2453p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.C0862d0> f2454q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.C0862d0> f2455r = new ArrayList<>();

    /* renamed from: a.o.d.c$j */
    public static class C0626j {

        /* renamed from: a */
        public RecyclerView.C0862d0 f2490a;

        /* renamed from: b */
        public int f2491b;

        /* renamed from: c */
        public int f2492c;

        /* renamed from: d */
        public int f2493d;

        /* renamed from: e */
        public int f2494e;

        public C0626j(RecyclerView.C0862d0 holder, int fromX, int fromY, int toX, int toY) {
            this.f2490a = holder;
            this.f2491b = fromX;
            this.f2492c = fromY;
            this.f2493d = toX;
            this.f2494e = toY;
        }
    }

    /* renamed from: a.o.d.c$i */
    public static class C0625i {

        /* renamed from: a */
        public RecyclerView.C0862d0 f2484a;

        /* renamed from: b */
        public RecyclerView.C0862d0 f2485b;

        /* renamed from: c */
        public int f2486c;

        /* renamed from: d */
        public int f2487d;

        /* renamed from: e */
        public int f2488e;

        /* renamed from: f */
        public int f2489f;

        public C0625i(RecyclerView.C0862d0 oldHolder, RecyclerView.C0862d0 newHolder) {
            this.f2484a = oldHolder;
            this.f2485b = newHolder;
        }

        public C0625i(RecyclerView.C0862d0 oldHolder, RecyclerView.C0862d0 newHolder, int fromX, int fromY, int toX, int toY) {
            this(oldHolder, newHolder);
            this.f2486c = fromX;
            this.f2487d = fromY;
            this.f2488e = toX;
            this.f2489f = toY;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f2484a + ", newHolder=" + this.f2485b + ", fromX=" + this.f2486c + ", fromY=" + this.f2487d + ", toX=" + this.f2488e + ", toY=" + this.f2489f + '}';
        }
    }

    /* renamed from: u */
    public void mo3245u() {
        boolean removalsPending = !this.f2445h.isEmpty();
        boolean movesPending = !this.f2447j.isEmpty();
        boolean changesPending = !this.f2448k.isEmpty();
        boolean additionsPending = !this.f2446i.isEmpty();
        if (removalsPending || movesPending || additionsPending || changesPending) {
            Iterator<RecyclerView.C0862d0> it = this.f2445h.iterator();
            while (it.hasNext()) {
                mo3234T(it.next());
            }
            this.f2445h.clear();
            if (movesPending) {
                ArrayList<DefaultItemAnimator.MoveInfo> moves = new ArrayList<>();
                moves.addAll(this.f2447j);
                this.f2450m.add(moves);
                this.f2447j.clear();
                Runnable mover = new C0617a(moves);
                if (removalsPending) {
                    C0460r.m2248W(((C0626j) moves.get(0)).f2490a.f3608a, mover, mo5117o());
                } else {
                    mover.run();
                }
            }
            if (changesPending) {
                ArrayList<DefaultItemAnimator.ChangeInfo> changes = new ArrayList<>();
                changes.addAll(this.f2448k);
                this.f2451n.add(changes);
                this.f2448k.clear();
                Runnable changer = new C0618b(changes);
                if (removalsPending) {
                    C0460r.m2248W(((C0625i) changes.get(0)).f2484a.f3608a, changer, mo5117o());
                } else {
                    changer.run();
                }
            }
            if (additionsPending) {
                ArrayList<RecyclerView.ViewHolder> additions = new ArrayList<>();
                additions.addAll(this.f2446i);
                this.f2449l.add(additions);
                this.f2446i.clear();
                Runnable adder = new C0619c(additions);
                if (removalsPending || movesPending || changesPending) {
                    long changeDuration = 0;
                    long removeDuration = removalsPending ? mo5117o() : 0;
                    long moveDuration = movesPending ? mo5116n() : 0;
                    if (changesPending) {
                        changeDuration = mo5115m();
                    }
                    C0460r.m2248W(((RecyclerView.C0862d0) additions.get(0)).f3608a, adder, Math.max(moveDuration, changeDuration) + removeDuration);
                    return;
                }
                adder.run();
            }
        }
    }

    /* renamed from: a.o.d.c$a */
    public class C0617a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2456b;

        public C0617a(ArrayList arrayList) {
            this.f2456b = arrayList;
        }

        public void run() {
            Iterator it = this.f2456b.iterator();
            while (it.hasNext()) {
                C0626j moveInfo = (C0626j) it.next();
                C0616c.this.mo3233S(moveInfo.f2490a, moveInfo.f2491b, moveInfo.f2492c, moveInfo.f2493d, moveInfo.f2494e);
            }
            this.f2456b.clear();
            C0616c.this.f2450m.remove(this.f2456b);
        }
    }

    /* renamed from: a.o.d.c$b */
    public class C0618b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2458b;

        public C0618b(ArrayList arrayList) {
            this.f2458b = arrayList;
        }

        public void run() {
            Iterator it = this.f2458b.iterator();
            while (it.hasNext()) {
                C0616c.this.mo3232R((C0625i) it.next());
            }
            this.f2458b.clear();
            C0616c.this.f2451n.remove(this.f2458b);
        }
    }

    /* renamed from: a.o.d.c$c */
    public class C0619c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2460b;

        public C0619c(ArrayList arrayList) {
            this.f2460b = arrayList;
        }

        public void run() {
            Iterator it = this.f2460b.iterator();
            while (it.hasNext()) {
                C0616c.this.mo3231Q((RecyclerView.C0862d0) it.next());
            }
            this.f2460b.clear();
            C0616c.this.f2449l.remove(this.f2460b);
        }
    }

    /* renamed from: z */
    public boolean mo3249z(RecyclerView.C0862d0 holder) {
        mo3240Z(holder);
        this.f2445h.add(holder);
        return true;
    }

    /* renamed from: T */
    public final void mo3234T(RecyclerView.C0862d0 holder) {
        View view = holder.f3608a;
        ViewPropertyAnimator animation = view.animate();
        this.f2454q.add(holder);
        animation.setDuration(mo5117o()).alpha(0.0f).setListener(new C0620d(holder, animation, view)).start();
    }

    /* renamed from: a.o.d.c$d */
    public class C0620d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C0862d0 f2462a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f2463b;

        /* renamed from: c */
        public final /* synthetic */ View f2464c;

        public C0620d(RecyclerView.C0862d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2462a = d0Var;
            this.f2463b = viewPropertyAnimator;
            this.f2464c = view;
        }

        public void onAnimationStart(Animator animator) {
            C0616c.this.mo3373H(this.f2462a);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2463b.setListener((Animator.AnimatorListener) null);
            this.f2464c.setAlpha(1.0f);
            C0616c.this.mo3372G(this.f2462a);
            C0616c.this.f2454q.remove(this.f2462a);
            C0616c.this.mo3236V();
        }
    }

    /* renamed from: w */
    public boolean mo3246w(RecyclerView.C0862d0 holder) {
        mo3240Z(holder);
        holder.f3608a.setAlpha(0.0f);
        this.f2446i.add(holder);
        return true;
    }

    /* renamed from: Q */
    public void mo3231Q(RecyclerView.C0862d0 holder) {
        View view = holder.f3608a;
        ViewPropertyAnimator animation = view.animate();
        this.f2452o.add(holder);
        animation.alpha(1.0f).setDuration(mo5114l()).setListener(new C0621e(holder, view, animation)).start();
    }

    /* renamed from: a.o.d.c$e */
    public class C0621e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C0862d0 f2466a;

        /* renamed from: b */
        public final /* synthetic */ View f2467b;

        /* renamed from: c */
        public final /* synthetic */ ViewPropertyAnimator f2468c;

        public C0621e(RecyclerView.C0862d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2466a = d0Var;
            this.f2467b = view;
            this.f2468c = viewPropertyAnimator;
        }

        public void onAnimationStart(Animator animator) {
            C0616c.this.mo3367B(this.f2466a);
        }

        public void onAnimationCancel(Animator animator) {
            this.f2467b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2468c.setListener((Animator.AnimatorListener) null);
            C0616c.this.mo3366A(this.f2466a);
            C0616c.this.f2452o.remove(this.f2466a);
            C0616c.this.mo3236V();
        }
    }

    /* renamed from: y */
    public boolean mo3248y(RecyclerView.C0862d0 holder, int fromX, int fromY, int toX, int toY) {
        RecyclerView.C0862d0 d0Var = holder;
        View view = d0Var.f3608a;
        int fromX2 = fromX + ((int) d0Var.f3608a.getTranslationX());
        int fromY2 = fromY + ((int) d0Var.f3608a.getTranslationY());
        mo3240Z(holder);
        int deltaX = toX - fromX2;
        int deltaY = toY - fromY2;
        if (deltaX == 0 && deltaY == 0) {
            mo3370E(holder);
            return false;
        }
        if (deltaX != 0) {
            view.setTranslationX((float) (-deltaX));
        }
        if (deltaY != 0) {
            view.setTranslationY((float) (-deltaY));
        }
        this.f2447j.add(new C0626j(holder, fromX2, fromY2, toX, toY));
        return true;
    }

    /* renamed from: S */
    public void mo3233S(RecyclerView.C0862d0 holder, int fromX, int fromY, int toX, int toY) {
        RecyclerView.C0862d0 d0Var = holder;
        View view = d0Var.f3608a;
        int deltaX = toX - fromX;
        int deltaY = toY - fromY;
        if (deltaX != 0) {
            view.animate().translationX(0.0f);
        }
        if (deltaY != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animation = view.animate();
        this.f2453p.add(d0Var);
        animation.setDuration(mo5116n()).setListener(new C0622f(holder, deltaX, view, deltaY, animation)).start();
    }

    /* renamed from: a.o.d.c$f */
    public class C0622f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C0862d0 f2470a;

        /* renamed from: b */
        public final /* synthetic */ int f2471b;

        /* renamed from: c */
        public final /* synthetic */ View f2472c;

        /* renamed from: d */
        public final /* synthetic */ int f2473d;

        /* renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f2474e;

        public C0622f(RecyclerView.C0862d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2470a = d0Var;
            this.f2471b = i;
            this.f2472c = view;
            this.f2473d = i2;
            this.f2474e = viewPropertyAnimator;
        }

        public void onAnimationStart(Animator animator) {
            C0616c.this.mo3371F(this.f2470a);
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f2471b != 0) {
                this.f2472c.setTranslationX(0.0f);
            }
            if (this.f2473d != 0) {
                this.f2472c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f2474e.setListener((Animator.AnimatorListener) null);
            C0616c.this.mo3370E(this.f2470a);
            C0616c.this.f2453p.remove(this.f2470a);
            C0616c.this.mo3236V();
        }
    }

    /* renamed from: x */
    public boolean mo3247x(RecyclerView.C0862d0 oldHolder, RecyclerView.C0862d0 newHolder, int fromX, int fromY, int toX, int toY) {
        RecyclerView.C0862d0 d0Var = oldHolder;
        RecyclerView.C0862d0 d0Var2 = newHolder;
        if (d0Var == d0Var2) {
            return mo3248y(oldHolder, fromX, fromY, toX, toY);
        }
        float prevTranslationX = d0Var.f3608a.getTranslationX();
        float prevTranslationY = d0Var.f3608a.getTranslationY();
        float prevAlpha = d0Var.f3608a.getAlpha();
        mo3240Z(oldHolder);
        int deltaX = (int) (((float) (toX - fromX)) - prevTranslationX);
        int deltaY = (int) (((float) (toY - fromY)) - prevTranslationY);
        d0Var.f3608a.setTranslationX(prevTranslationX);
        d0Var.f3608a.setTranslationY(prevTranslationY);
        d0Var.f3608a.setAlpha(prevAlpha);
        if (d0Var2 != null) {
            mo3240Z(d0Var2);
            d0Var2.f3608a.setTranslationX((float) (-deltaX));
            d0Var2.f3608a.setTranslationY((float) (-deltaY));
            d0Var2.f3608a.setAlpha(0.0f);
        }
        ArrayList<C0625i> arrayList = this.f2448k;
        float f = prevTranslationX;
        C0625i iVar = r7;
        C0625i iVar2 = new C0625i(oldHolder, newHolder, fromX, fromY, toX, toY);
        arrayList.add(iVar);
        return true;
    }

    /* renamed from: R */
    public void mo3232R(C0625i changeInfo) {
        RecyclerView.C0862d0 holder = changeInfo.f2484a;
        View newView = null;
        View view = holder == null ? null : holder.f3608a;
        RecyclerView.C0862d0 newHolder = changeInfo.f2485b;
        if (newHolder != null) {
            newView = newHolder.f3608a;
        }
        if (view != null) {
            ViewPropertyAnimator oldViewAnim = view.animate().setDuration(mo5115m());
            this.f2455r.add(changeInfo.f2484a);
            oldViewAnim.translationX((float) (changeInfo.f2488e - changeInfo.f2486c));
            oldViewAnim.translationY((float) (changeInfo.f2489f - changeInfo.f2487d));
            oldViewAnim.alpha(0.0f).setListener(new C0623g(changeInfo, oldViewAnim, view)).start();
        }
        if (newView != null) {
            ViewPropertyAnimator newViewAnimation = newView.animate();
            this.f2455r.add(changeInfo.f2485b);
            newViewAnimation.translationX(0.0f).translationY(0.0f).setDuration(mo5115m()).alpha(1.0f).setListener(new C0624h(changeInfo, newViewAnimation, newView)).start();
        }
    }

    /* renamed from: a.o.d.c$g */
    public class C0623g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C0625i f2476a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f2477b;

        /* renamed from: c */
        public final /* synthetic */ View f2478c;

        public C0623g(C0625i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2476a = iVar;
            this.f2477b = viewPropertyAnimator;
            this.f2478c = view;
        }

        public void onAnimationStart(Animator animator) {
            C0616c.this.mo3369D(this.f2476a.f2484a, true);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2477b.setListener((Animator.AnimatorListener) null);
            this.f2478c.setAlpha(1.0f);
            this.f2478c.setTranslationX(0.0f);
            this.f2478c.setTranslationY(0.0f);
            C0616c.this.mo3368C(this.f2476a.f2484a, true);
            C0616c.this.f2455r.remove(this.f2476a.f2484a);
            C0616c.this.mo3236V();
        }
    }

    /* renamed from: a.o.d.c$h */
    public class C0624h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C0625i f2480a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f2481b;

        /* renamed from: c */
        public final /* synthetic */ View f2482c;

        public C0624h(C0625i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2480a = iVar;
            this.f2481b = viewPropertyAnimator;
            this.f2482c = view;
        }

        public void onAnimationStart(Animator animator) {
            C0616c.this.mo3369D(this.f2480a.f2485b, false);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2481b.setListener((Animator.AnimatorListener) null);
            this.f2482c.setAlpha(1.0f);
            this.f2482c.setTranslationX(0.0f);
            this.f2482c.setTranslationY(0.0f);
            C0616c.this.mo3368C(this.f2480a.f2485b, false);
            C0616c.this.f2455r.remove(this.f2480a.f2485b);
            C0616c.this.mo3236V();
        }
    }

    /* renamed from: W */
    public final void mo3237W(List<C0625i> infoList, RecyclerView.C0862d0 item) {
        for (int i = infoList.size() - 1; i >= 0; i--) {
            C0625i changeInfo = infoList.get(i);
            if (mo3239Y(changeInfo, item) && changeInfo.f2484a == null && changeInfo.f2485b == null) {
                infoList.remove(changeInfo);
            }
        }
    }

    /* renamed from: X */
    public final void mo3238X(C0625i changeInfo) {
        RecyclerView.C0862d0 d0Var = changeInfo.f2484a;
        if (d0Var != null) {
            mo3239Y(changeInfo, d0Var);
        }
        RecyclerView.C0862d0 d0Var2 = changeInfo.f2485b;
        if (d0Var2 != null) {
            mo3239Y(changeInfo, d0Var2);
        }
    }

    /* renamed from: Y */
    public final boolean mo3239Y(C0625i changeInfo, RecyclerView.C0862d0 item) {
        boolean oldItem = false;
        if (changeInfo.f2485b == item) {
            changeInfo.f2485b = null;
        } else if (changeInfo.f2484a != item) {
            return false;
        } else {
            changeInfo.f2484a = null;
            oldItem = true;
        }
        item.f3608a.setAlpha(1.0f);
        item.f3608a.setTranslationX(0.0f);
        item.f3608a.setTranslationY(0.0f);
        mo3368C(item, oldItem);
        return true;
    }

    /* renamed from: j */
    public void mo3242j(RecyclerView.C0862d0 item) {
        View view = item.f3608a;
        view.animate().cancel();
        int i = this.f2447j.size();
        while (true) {
            i--;
            if (i < 0) {
                break;
            } else if (this.f2447j.get(i).f2490a == item) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo3370E(item);
                this.f2447j.remove(i);
            }
        }
        mo3237W(this.f2448k, item);
        if (this.f2445h.remove(item)) {
            view.setAlpha(1.0f);
            mo3372G(item);
        }
        if (this.f2446i.remove(item)) {
            view.setAlpha(1.0f);
            mo3366A(item);
        }
        for (int i2 = this.f2451n.size() - 1; i2 >= 0; i2--) {
            ArrayList<DefaultItemAnimator.ChangeInfo> changes = this.f2451n.get(i2);
            mo3237W(changes, item);
            if (changes.isEmpty()) {
                this.f2451n.remove(i2);
            }
        }
        for (int i3 = this.f2450m.size() - 1; i3 >= 0; i3--) {
            ArrayList<DefaultItemAnimator.MoveInfo> moves = this.f2450m.get(i3);
            int j = moves.size() - 1;
            while (true) {
                if (j < 0) {
                    break;
                } else if (((C0626j) moves.get(j)).f2490a == item) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo3370E(item);
                    moves.remove(j);
                    if (moves.isEmpty()) {
                        this.f2450m.remove(i3);
                    }
                } else {
                    j--;
                }
            }
        }
        for (int i4 = this.f2449l.size() - 1; i4 >= 0; i4--) {
            ArrayList<RecyclerView.ViewHolder> additions = this.f2449l.get(i4);
            if (additions.remove(item)) {
                view.setAlpha(1.0f);
                mo3366A(item);
                if (additions.isEmpty()) {
                    this.f2449l.remove(i4);
                }
            }
        }
        this.f2454q.remove(item);
        this.f2452o.remove(item);
        this.f2455r.remove(item);
        this.f2453p.remove(item);
        mo3236V();
    }

    /* renamed from: Z */
    public final void mo3240Z(RecyclerView.C0862d0 holder) {
        if (f2444s == null) {
            f2444s = new ValueAnimator().getInterpolator();
        }
        holder.f3608a.animate().setInterpolator(f2444s);
        mo3242j(holder);
    }

    /* renamed from: p */
    public boolean mo3244p() {
        return !this.f2446i.isEmpty() || !this.f2448k.isEmpty() || !this.f2447j.isEmpty() || !this.f2445h.isEmpty() || !this.f2453p.isEmpty() || !this.f2454q.isEmpty() || !this.f2452o.isEmpty() || !this.f2455r.isEmpty() || !this.f2450m.isEmpty() || !this.f2449l.isEmpty() || !this.f2451n.isEmpty();
    }

    /* renamed from: V */
    public void mo3236V() {
        if (!mo3244p()) {
            mo5113i();
        }
    }

    /* renamed from: k */
    public void mo3243k() {
        for (int i = this.f2447j.size() - 1; i >= 0; i--) {
            C0626j item = this.f2447j.get(i);
            View view = item.f2490a.f3608a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo3370E(item.f2490a);
            this.f2447j.remove(i);
        }
        for (int i2 = this.f2445h.size() - 1; i2 >= 0; i2--) {
            mo3372G(this.f2445h.get(i2));
            this.f2445h.remove(i2);
        }
        for (int i3 = this.f2446i.size() - 1; i3 >= 0; i3--) {
            RecyclerView.C0862d0 item2 = this.f2446i.get(i3);
            item2.f3608a.setAlpha(1.0f);
            mo3366A(item2);
            this.f2446i.remove(i3);
        }
        for (int i4 = this.f2448k.size() - 1; i4 >= 0; i4--) {
            mo3238X(this.f2448k.get(i4));
        }
        this.f2448k.clear();
        if (mo3244p()) {
            for (int i5 = this.f2450m.size() - 1; i5 >= 0; i5--) {
                ArrayList<DefaultItemAnimator.MoveInfo> moves = this.f2450m.get(i5);
                for (int j = moves.size() - 1; j >= 0; j--) {
                    C0626j moveInfo = (C0626j) moves.get(j);
                    View view2 = moveInfo.f2490a.f3608a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo3370E(moveInfo.f2490a);
                    moves.remove(j);
                    if (moves.isEmpty()) {
                        this.f2450m.remove(moves);
                    }
                }
            }
            for (int i6 = this.f2449l.size() - 1; i6 >= 0; i6--) {
                ArrayList<RecyclerView.ViewHolder> additions = this.f2449l.get(i6);
                for (int j2 = additions.size() - 1; j2 >= 0; j2--) {
                    RecyclerView.C0862d0 item3 = (RecyclerView.C0862d0) additions.get(j2);
                    item3.f3608a.setAlpha(1.0f);
                    mo3366A(item3);
                    additions.remove(j2);
                    if (additions.isEmpty()) {
                        this.f2449l.remove(additions);
                    }
                }
            }
            for (int i7 = this.f2451n.size() - 1; i7 >= 0; i7--) {
                ArrayList<DefaultItemAnimator.ChangeInfo> changes = this.f2451n.get(i7);
                for (int j3 = changes.size() - 1; j3 >= 0; j3--) {
                    mo3238X((C0625i) changes.get(j3));
                    if (changes.isEmpty()) {
                        this.f2451n.remove(changes);
                    }
                }
            }
            mo3235U(this.f2454q);
            mo3235U(this.f2453p);
            mo3235U(this.f2452o);
            mo3235U(this.f2455r);
            mo5113i();
        }
    }

    /* renamed from: U */
    public void mo3235U(List<RecyclerView.C0862d0> viewHolders) {
        for (int i = viewHolders.size() - 1; i >= 0; i--) {
            viewHolders.get(i).f3608a.animate().cancel();
        }
    }

    /* renamed from: g */
    public boolean mo3241g(RecyclerView.C0862d0 viewHolder, List<Object> payloads) {
        return !payloads.isEmpty() || super.mo3241g(viewHolder, payloads);
    }
}
