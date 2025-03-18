class StaticDemo {
    static int staticVariable;

    static {
        staticVariable = 10;
        System.out.println("Static block executed. Static variable initialized to " + staticVariable);
    }

    static void staticMethod() {
        System.out.println("Static method called. Current value of static variable: " + staticVariable);
    }

    void changeStaticVariable(int newValue) {
        staticVariable = newValue;
        System.out.println("Static variable changed to: " + staticVariable);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        StaticDemo.staticMethod();

        StaticDemo demo = new StaticDemo();
        demo.changeStaticVariable(25);

        StaticDemo.staticMethod();
    }
}
