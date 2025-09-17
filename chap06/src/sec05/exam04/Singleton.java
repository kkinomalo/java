package sec05.exam04;

public class Singleton {
    // 유일한 인스턴스를 저장하는 정적 필드
    private static Singleton singleton = new Singleton();

    // 생성자를 private으로 막아서 외부에서 new 불가능
    private Singleton() {}

    // 외부에서 단일 객체를 얻을 수 있는 정적 메소드
    static Singleton getInstance() {
        return singleton;
    }
}
