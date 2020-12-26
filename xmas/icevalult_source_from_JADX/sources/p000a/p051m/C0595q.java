package p000a.p051m;

/* renamed from: a.m.q */
public class C0595q {

    /* renamed from: a */
    public final C0596a f2400a;

    /* renamed from: b */
    public final C0598r f2401b;

    /* renamed from: a.m.q$a */
    public interface C0596a {
        /* renamed from: a */
        <T extends C0594p> T mo3027a(Class<T> cls);
    }

    /* renamed from: a.m.q$b */
    public static abstract class C0597b implements C0596a {
        /* renamed from: b */
        public abstract <T extends C0594p> T mo3135b(String str, Class<T> cls);

        /* renamed from: a */
        public <T extends C0594p> T mo3027a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }
    }

    public C0595q(C0598r store, C0596a factory) {
        this.f2400a = factory;
        this.f2401b = store;
    }

    /* renamed from: a */
    public <T extends C0594p> T mo3133a(Class<T> modelClass) {
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return mo3134b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends C0594p> T mo3134b(String key, Class<T> modelClass) {
        C0594p viewModel;
        C0594p viewModel2 = this.f2401b.mo3137b(key);
        if (modelClass.isInstance(viewModel2)) {
            return viewModel2;
        }
        C0596a aVar = this.f2400a;
        if (aVar instanceof C0597b) {
            viewModel = ((C0597b) aVar).mo3135b(key, modelClass);
        } else {
            viewModel = aVar.mo3027a(modelClass);
        }
        this.f2401b.mo3138c(key, viewModel);
        return viewModel;
    }
}
