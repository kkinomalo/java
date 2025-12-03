package sec01.exam03;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        // Key 객체를 식별자로 사용해 String 값을 저장하는 HashMap 생성
        HashMap<Key, String> hashMap = new HashMap<>();

        // 식별 키 new Key(1)로 "홍길동" 저장
        hashMap.put(new Key(1), "홍길동");

        // 동일한 값의 Key(1)이지만 새 객체라서 값을 가져오지 못함
        String value = hashMap.get(new Key(1));

        System.out.println(value);
    }
}
