package p000a.p025h.p027e.p028c;

import java.lang.reflect.Array;

/* renamed from: a.h.e.c.e */
public final class C0350e {
    /* renamed from: b */
    public static <T> T[] m1822b(T[] array, int currentSize, T element) {
        if (currentSize <= array.length) {
            if (currentSize + 1 > array.length) {
                T[] newArray = (Object[]) Array.newInstance(array.getClass().getComponentType(), m1823c(currentSize));
                System.arraycopy(array, 0, newArray, 0, currentSize);
                array = newArray;
            }
            array[currentSize] = element;
            return array;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static int[] m1821a(int[] array, int currentSize, int element) {
        if (currentSize <= array.length) {
            if (currentSize + 1 > array.length) {
                int[] newArray = new int[m1823c(currentSize)];
                System.arraycopy(array, 0, newArray, 0, currentSize);
                array = newArray;
            }
            array[currentSize] = element;
            return array;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public static int m1823c(int currentSize) {
        if (currentSize <= 4) {
            return 8;
        }
        return currentSize * 2;
    }
}
