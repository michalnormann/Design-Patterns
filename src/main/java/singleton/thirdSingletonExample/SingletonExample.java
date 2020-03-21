package singleton.thirdSingletonExample;

public class SingletonExample {
    public static final SingletonExample INSTANCE = new SingletonExample();

    private SingletonExample() {
    }

    public void method() {
        System.out.println("Singleton example");
    }
}
