import java.util.ArrayList;

/*
 * 자바가 가지고있는 8가지 기본타입(값타입)
 *  ㄴ JAVA API가 제공
 *  
 * 8가지 기본 타입에 대해서 설계도를 생성 -> 8가지 기본타입도 객체 형태로 사용 가능 -> Wrapper class
 * 
 * 값 타입 대신에 객체 형태의 타입을 쓰는 곳 -> generic(참조형태의 parameter)
 *  ㄴ 1. 매개변수(parameter) 객체 타입이 요구될때
 *  ㄴ 2. 기본형 값이 아닌 객체 형태로 저장
 *  ㄴ 3. 객체간 값 비교
 *  ㄴ 4. 타입 변환시 비교
 *  
 */
public class Ex08_Wrapper_Class {

    public static void main(String[] args) {
        int i = 100;
        
        Integer n = new Integer(500); // is deprecated(밑줄그어진거) : 추후 버전에서 사라짐..
        System.out.println(n);  // 사실은 n 주소값 출력(toString() 재정의)
        System.out.println(n.MAX_VALUE);
        System.out.println(n.MIN_VALUE);
        
        // POINT
        // Integer 함수의 parameter
        // generic
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(100);
        // li.add("A"); -> 타입을 강제해서 막아버리기때문에 오류
        for(int value : li) {
            System.out.println(value);
        }
        
        // char -> Character
        // int -> Integer
        // 나머지는 앞글자 대문자(클래스 이름이니깐)
    }

}
