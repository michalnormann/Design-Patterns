package singleton.firstSingletonExample;

public class Main {

    public static void main(String[] args) {


        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getPullSize());

        // klasyczny singleton z enumem - taki powinien byc w javie
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        System.out.println(singleton2.getPullSize());
    }
}
