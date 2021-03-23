package kr.or.bit;

import java.io.IOException;

// 설계도 = 타입 = 클래스

// 내 설계도를 사용하는 개발자가 [예외를 강제]로 처리했으면 좋겠는데..

// 생성자 함수 같은거는 강제로 예외를 처리할 수 있게 한다.

// throws -> 예외들을 던진다.-> 현재 메소드에서 상위 메소드로 예외를 던진다
public class MyClass {
    public MyClass(String path) throws IOException , NullPointerException{
        System.out.println(path);
    }

}
