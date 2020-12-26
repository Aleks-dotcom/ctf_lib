package p000a.p058q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: a.q.a */
public class C0659a {

    /* renamed from: a.q.a$a */
    public interface C0660a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    /* renamed from: a */
    public static void m3307a(Animator animator, AnimatorListenerAdapter listener) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.addPauseListener(listener);
        }
    }

    /* renamed from: b */
    public static void m3308b(Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.pause();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener listener = listeners.get(i);
                if (listener instanceof C0660a) {
                    ((C0660a) listener).onAnimationPause(animator);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m3309c(Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.resume();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener listener = listeners.get(i);
                if (listener instanceof C0660a) {
                    ((C0660a) listener).onAnimationResume(animator);
                }
            }
        }
    }
}
