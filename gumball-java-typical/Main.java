public class Main {
    public static void main(String[] args) {
        GumballMachine m1 = new GumballMachine(2, 25, "quater");
        System.out.println("GumballMachine 1: ");
        m1.insertQuarter(10);
        m1.turnCrank();
        m1.insertQuarter(25);
        m1.turnCrank();
        m1.insertQuarter(25);
        m1.turnCrank();
        m1.turnCrank();

        GumballMachine m2 = new GumballMachine(3, 50, "quater");
        System.out.println("GumballMachine 2: ");
        m2.insertQuarter(10);
        m2.turnCrank();
        m2.insertQuarter(25);
        m2.insertQuarter(25);
        m2.insertQuarter(10);
        m2.insertQuarter(10);
        m2.turnCrank();

        GumballMachine m3 = new GumballMachine(3, 50, "any");
        System.out.println("GumballMachine 3: ");
        m3.insertQuarter(10);
        m3.insertQuarter(50);
        m3.turnCrank();
        m3.insertQuarter(25);
        m3.insertQuarter(10);
        m3.insertQuarter(10);
        m3.insertQuarter(10);
        m3.turnCrank();
        m3.turnCrank();
    }
}
