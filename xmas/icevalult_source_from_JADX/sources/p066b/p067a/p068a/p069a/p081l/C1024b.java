package p066b.p067a.p068a.p069a.p081l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* renamed from: b.a.a.a.l.b */
public class C1024b {
    /* renamed from: a */
    public static void m5421a(AnimatorSet animatorSet, List<Animator> items) {
        long totalDuration = 0;
        int count = items.size();
        for (int i = 0; i < count; i++) {
            Animator animator = items.get(i);
            totalDuration = Math.max(totalDuration, animator.getStartDelay() + animator.getDuration());
        }
        Animator fix = ValueAnimator.ofInt(new int[]{0, 0});
        fix.setDuration(totalDuration);
        items.add(0, fix);
        animatorSet.playTogether(items);
    }
}
