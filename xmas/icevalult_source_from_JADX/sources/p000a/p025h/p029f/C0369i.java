package p000a.p025h.p029f;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: a.h.f.i */
public class C0369i {
    /* renamed from: e */
    public static File m1928e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String prefix = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (i < 100) {
            File file = new File(cacheDir, prefix + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException e) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        throw r2;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m1930g(java.io.File r7) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0025 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0025 }
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch:{ all -> 0x0019 }
            long r5 = r1.size()     // Catch:{ all -> 0x0019 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0019 }
            r3 = 0
            java.nio.MappedByteBuffer r2 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0019 }
            r0.close()     // Catch:{ IOException -> 0x0025 }
            return r2
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r3 = move-exception
            r1.addSuppressed(r3)     // Catch:{ IOException -> 0x0025 }
        L_0x0024:
            throw r2     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p025h.p029f.C0369i.m1930g(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        if (r2 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004f, code lost:
        throw r4;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m1929f(android.content.Context r10, android.os.CancellationSignal r11, android.net.Uri r12) {
        /*
            android.content.ContentResolver r0 = r10.getContentResolver()
            r1 = 0
            java.lang.String r2 = "r"
            android.os.ParcelFileDescriptor r2 = r0.openFileDescriptor(r12, r2, r11)     // Catch:{ IOException -> 0x0050 }
            if (r2 != 0) goto L_0x0014
            if (r2 == 0) goto L_0x0013
            r2.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0013:
            return r1
        L_0x0014:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0042 }
            java.io.FileDescriptor r4 = r2.getFileDescriptor()     // Catch:{ all -> 0x0042 }
            r3.<init>(r4)     // Catch:{ all -> 0x0042 }
            java.nio.channels.FileChannel r4 = r3.getChannel()     // Catch:{ all -> 0x0036 }
            long r8 = r4.size()     // Catch:{ all -> 0x0036 }
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0036 }
            r6 = 0
            java.nio.MappedByteBuffer r5 = r4.map(r5, r6, r8)     // Catch:{ all -> 0x0036 }
            r3.close()     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0035:
            return r5
        L_0x0036:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r5 = move-exception
            r3.close()     // Catch:{ all -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0042 }
        L_0x0041:
            throw r5     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r4 = move-exception
            if (r2 == 0) goto L_0x004f
            r2.close()     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r5 = move-exception
            r3.addSuppressed(r5)     // Catch:{ IOException -> 0x0050 }
        L_0x004f:
            throw r4     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            r2 = move-exception
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p025h.p029f.C0369i.m1929f(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    /* renamed from: b */
    public static ByteBuffer m1925b(Context context, Resources res, int id) {
        File tmpFile = m1928e(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!m1926c(tmpFile, res, id)) {
                return null;
            }
            ByteBuffer g = m1930g(tmpFile);
            tmpFile.delete();
            return g;
        } finally {
            tmpFile.delete();
        }
    }

    /* renamed from: d */
    public static boolean m1927d(File file, InputStream is) {
        FileOutputStream os = null;
        StrictMode.ThreadPolicy old = StrictMode.allowThreadDiskWrites();
        try {
            os = new FileOutputStream(file, false);
            byte[] buffer = new byte[1024];
            while (true) {
                int read = is.read(buffer);
                int readLen = read;
                if (read != -1) {
                    os.write(buffer, 0, readLen);
                } else {
                    return true;
                }
            }
        } catch (IOException e) {
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            return false;
        } finally {
            m1924a(os);
            StrictMode.setThreadPolicy(old);
        }
    }

    /* renamed from: c */
    public static boolean m1926c(File file, Resources res, int id) {
        InputStream is = null;
        try {
            is = res.openRawResource(id);
            return m1927d(file, is);
        } finally {
            m1924a(is);
        }
    }

    /* renamed from: a */
    public static void m1924a(Closeable c) {
        if (c != null) {
            try {
                c.close();
            } catch (IOException e) {
            }
        }
    }
}
