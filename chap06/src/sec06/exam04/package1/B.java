package sec06.exam04.package1;

public class B {
    // 필드
    A a1 = new A(true);
    A a2 = new A(1);          // 같은 패키지라 default 생성자 접근 가능
    // A a3 = new A("문자열"); // private 생성자는 접근 불가
}
