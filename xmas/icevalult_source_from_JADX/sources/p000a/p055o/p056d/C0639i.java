package p000a.p055o.p056d;

import java.util.List;
import p000a.p055o.p056d.C0610a;

/* renamed from: a.o.d.i */
public class C0639i {

    /* renamed from: a */
    public final C0640a f2565a;

    /* renamed from: a.o.d.i$a */
    public interface C0640a {
        /* renamed from: a */
        C0610a.C0612b mo3156a(int i, int i2, int i3, Object obj);

        /* renamed from: b */
        void mo3157b(C0610a.C0612b bVar);
    }

    public C0639i(C0640a callback) {
        this.f2565a = callback;
    }

    /* renamed from: b */
    public void mo3341b(List<C0610a.C0612b> ops) {
        while (true) {
            int a = mo3340a(ops);
            int badMove = a;
            if (a != -1) {
                mo3343d(ops, badMove, badMove + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo3343d(List<C0610a.C0612b> list, int badMove, int next) {
        C0610a.C0612b moveOp = list.get(badMove);
        C0610a.C0612b nextOp = list.get(next);
        int i = nextOp.f2435a;
        if (i == 1) {
            mo3342c(list, badMove, moveOp, next, nextOp);
        } else if (i == 2) {
            mo3344e(list, badMove, moveOp, next, nextOp);
        } else if (i == 4) {
            mo3345f(list, badMove, moveOp, next, nextOp);
        }
    }

    /* renamed from: e */
    public void mo3344e(List<C0610a.C0612b> list, int movePos, C0610a.C0612b moveOp, int removePos, C0610a.C0612b removeOp) {
        boolean moveIsBackwards;
        C0610a.C0612b extraRm = null;
        boolean revertedMove = false;
        int i = moveOp.f2436b;
        int i2 = moveOp.f2438d;
        if (i < i2) {
            moveIsBackwards = false;
            if (removeOp.f2436b == i && removeOp.f2438d == i2 - i) {
                revertedMove = true;
            }
        } else {
            moveIsBackwards = true;
            if (removeOp.f2436b == i2 + 1 && removeOp.f2438d == i - i2) {
                revertedMove = true;
            }
        }
        int i3 = removeOp.f2436b;
        if (i2 < i3) {
            removeOp.f2436b = i3 - 1;
        } else {
            int i4 = removeOp.f2438d;
            if (i2 < i3 + i4) {
                removeOp.f2438d = i4 - 1;
                moveOp.f2435a = 2;
                moveOp.f2438d = 1;
                if (removeOp.f2438d == 0) {
                    list.remove(removePos);
                    this.f2565a.mo3157b(removeOp);
                    return;
                }
                return;
            }
        }
        int i5 = moveOp.f2436b;
        int i6 = removeOp.f2436b;
        if (i5 <= i6) {
            removeOp.f2436b = i6 + 1;
        } else {
            int i7 = removeOp.f2438d;
            if (i5 < i6 + i7) {
                extraRm = this.f2565a.mo3156a(2, i5 + 1, (i6 + i7) - i5, (Object) null);
                removeOp.f2438d = moveOp.f2436b - removeOp.f2436b;
            }
        }
        if (revertedMove) {
            list.set(movePos, removeOp);
            list.remove(removePos);
            this.f2565a.mo3157b(moveOp);
            return;
        }
        if (moveIsBackwards) {
            if (extraRm != null) {
                int i8 = moveOp.f2436b;
                if (i8 > extraRm.f2436b) {
                    moveOp.f2436b = i8 - extraRm.f2438d;
                }
                int i9 = moveOp.f2438d;
                if (i9 > extraRm.f2436b) {
                    moveOp.f2438d = i9 - extraRm.f2438d;
                }
            }
            int i10 = moveOp.f2436b;
            if (i10 > removeOp.f2436b) {
                moveOp.f2436b = i10 - removeOp.f2438d;
            }
            int i11 = moveOp.f2438d;
            if (i11 > removeOp.f2436b) {
                moveOp.f2438d = i11 - removeOp.f2438d;
            }
        } else {
            if (extraRm != null) {
                int i12 = moveOp.f2436b;
                if (i12 >= extraRm.f2436b) {
                    moveOp.f2436b = i12 - extraRm.f2438d;
                }
                int i13 = moveOp.f2438d;
                if (i13 >= extraRm.f2436b) {
                    moveOp.f2438d = i13 - extraRm.f2438d;
                }
            }
            int i14 = moveOp.f2436b;
            if (i14 >= removeOp.f2436b) {
                moveOp.f2436b = i14 - removeOp.f2438d;
            }
            int i15 = moveOp.f2438d;
            if (i15 >= removeOp.f2436b) {
                moveOp.f2438d = i15 - removeOp.f2438d;
            }
        }
        list.set(movePos, removeOp);
        if (moveOp.f2436b != moveOp.f2438d) {
            list.set(removePos, moveOp);
        } else {
            list.remove(removePos);
        }
        if (extraRm != null) {
            list.add(movePos, extraRm);
        }
    }

    /* renamed from: c */
    public final void mo3342c(List<C0610a.C0612b> list, int move, C0610a.C0612b moveOp, int add, C0610a.C0612b addOp) {
        int offset = 0;
        int i = moveOp.f2438d;
        int i2 = addOp.f2436b;
        if (i < i2) {
            offset = 0 - 1;
        }
        int i3 = moveOp.f2436b;
        if (i3 < i2) {
            offset++;
        }
        if (i2 <= i3) {
            moveOp.f2436b = i3 + addOp.f2438d;
        }
        int i4 = addOp.f2436b;
        if (i4 <= i) {
            moveOp.f2438d = i + addOp.f2438d;
        }
        addOp.f2436b = i4 + offset;
        list.set(move, addOp);
        list.set(add, moveOp);
    }

    /* renamed from: f */
    public void mo3345f(List<C0610a.C0612b> list, int move, C0610a.C0612b moveOp, int update, C0610a.C0612b updateOp) {
        C0610a.C0612b extraUp1 = null;
        C0610a.C0612b extraUp2 = null;
        int i = moveOp.f2438d;
        int i2 = updateOp.f2436b;
        if (i < i2) {
            updateOp.f2436b = i2 - 1;
        } else {
            int i3 = updateOp.f2438d;
            if (i < i2 + i3) {
                updateOp.f2438d = i3 - 1;
                extraUp1 = this.f2565a.mo3156a(4, moveOp.f2436b, 1, updateOp.f2437c);
            }
        }
        int i4 = moveOp.f2436b;
        int i5 = updateOp.f2436b;
        if (i4 <= i5) {
            updateOp.f2436b = i5 + 1;
        } else {
            int i6 = updateOp.f2438d;
            if (i4 < i5 + i6) {
                int remaining = (i5 + i6) - i4;
                extraUp2 = this.f2565a.mo3156a(4, i4 + 1, remaining, updateOp.f2437c);
                updateOp.f2438d -= remaining;
            }
        }
        list.set(update, moveOp);
        if (updateOp.f2438d > 0) {
            list.set(move, updateOp);
        } else {
            list.remove(move);
            this.f2565a.mo3157b(updateOp);
        }
        if (extraUp1 != null) {
            list.add(move, extraUp1);
        }
        if (extraUp2 != null) {
            list.add(move, extraUp2);
        }
    }

    /* renamed from: a */
    public final int mo3340a(List<C0610a.C0612b> list) {
        boolean foundNonMove = false;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).f2435a != 8) {
                foundNonMove = true;
            } else if (foundNonMove) {
                return i;
            }
        }
        return -1;
    }
}
