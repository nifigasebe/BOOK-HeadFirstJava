/**
 * Created by alexeychizhov on 15.06.2014.
 */

class A {

    int ivar = 7;

    void m1() {
        System.out.println("A's m1, ");
    }

    void m2() {
        System.out.println("A's m2, ");
    }

    void m3() {
        System.out.println("A's m3, ");
    }

}

class B extends A {

    void m1() {
        System.out.println("B's m1, ");
    }

}

class C extends B {

    void m3() {
        System.out.println("C's m3, " + (ivar + 6));
    }

}

public class Mixed2 {

    public static void main (String [] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        System.out.println("Var1");
        b.m1();
        c.m2();
        a.m3();
        System.out.println(" - ");

        System.out.println("Var2");
        c.m1();
        c.m2();
        c.m3();
        System.out.println(" - ");

        System.out.println("Var3");
        a.m1();
        b.m2();
        c.m3();
        System.out.println(" - ");

        System.out.println("Var4");
        a2.m1();
        a2.m2();
        a2.m3();
        System.out.println(" - ");
    }

}