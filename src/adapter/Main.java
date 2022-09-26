package adapter;

public class Main {

    public static void main(String[] args) {
        System.out.println(Math.twoTime(30));
        System.out.println(Math.halfTime(25));
        System.out.println(Math.doubled(100.0));

        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(70f));
        System.out.println(adapter.twiceOf(5f));
        System.out.println(adapter.halfOf(4f));
        System.out.println(adapter.twiceOf(20f));
        System.out.println(adapter.halfOf(55f));
        System.out.println(adapter.twiceOf(3f));
        System.out.println(adapter.halfOf(30f));
        System.out.println(adapter.twiceOf(1f));
        System.out.println(adapter.halfOf(1000f));
        System.out.println(adapter.twiceOf(104f));
        System.out.println(adapter.halfOf(712f));
        System.out.println(adapter.twiceOf(120f));
        System.out.println(adapter.halfOf(170f));
        System.out.println(adapter.twiceOf(2100f));
        System.out.println(adapter.halfOf(370f));
        System.out.println(adapter.twiceOf(1100f));
        System.out.println(adapter.halfOf(770f));

    }
}
