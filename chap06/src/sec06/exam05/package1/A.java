package sec06.exam05.package1;

public class A {
    public int field1;
    int field2;   // default
    private int field3;

    public A() {
        field1 = 1;
        field2 = 1;
        field3 = 1;   // private 필드라 클래스 내부에서는 수정 가능

        method1();
        method2();
        method3();    // private 메소드도 클래스 내부에서는 호출 가능
    }

    public void method1() {}
            void method2() {}   // default
    private void method3() {}
}
