/*
 * String -> 클래스 -> new를 통해서 사용가능 -> 일반적인 값타입처럼 사용해도 문제가 없다.
 *                                             ㄴ 컴파일러가 일부는 알아서 한다...
 * String이 가지고 있는 수많은 함수  (문자열을 조작하는것이 필요하다(합치고, 자르고, 붙이고..))
 * String이 가지는 다양한 함수 활용(static 함수 + 일반 함수) 
 * 최소 15~20개 정도의 함수를 암기하면 편해진다......우웩                                                        
 */
public class Ex05_String_Class {

    public static void main(String[] args) {
        String str = "";
        System.out.println("> " + str + "<");
        // 사용방법 : int, double 같이 사용하면 된다
        
        String[] strarr = {"aaa","bbb","ccc"};
        for(String s : strarr) {
            System.out.println(s);
            // String str2 = null;// null이 가능한 이유 -> string도 클래스이고 메모리를 heap에 반환
        }
        ////////////////////////////////////////////////////////////////////////////////////////////
        String str2 = "현상진";
        System.out.println(str2.length());  // length : 문자열의 길이를 추출하는 함수
        System.out.println(str2.toString());// Object의 toString()을 재정의 했다. -> 주소값이 안나오고 문자가 나온다
        System.out.println(str2); // -> toString() 생략
        
        String str3 = new String("정아인");
        
        // 1. String name = "가나다라마";
        // String 클래스의 내부적으로 저장되는 자료구조가 char[]이다. -> [가][나][다][라][마]
        // class String extends Object {char[] value ... toString() ... length()}
        
        String str4 = "AAA";
        String str5 = "AAA";
        System.out.println(str4);
        System.out.println(str5.toString());
        System.out.println(str4 == str5);
        // ==연산자는 값을 비교하는 연산자이다.(같다) -> (str4(주소값), str5(주소값))
        // 같은 주소
        // 주소가 아니라 실제 가지고 있는 값을(문자열) 비교하고 싶은것.
        // String의 비교를 == 쓰면 안됨!!!!!
        
        String str6 = new String("BBB");
        String str7 = new String("BBB");
        
        // String을 만들때 new를 사용하면 강제적으로 메모리 할당 -> heap메모리에 같은 값이어도 다른 메모리에 생성이 된다.
        System.out.println(str6 == str7); // false
        // ******문자열의 비교는 equals를 사용 !!*******
        System.out.println(str6.equals(str7)); // true
        
        //넌센스
        String s = "A";
        s += "B";
        s += "C";
        System.out.println(s);
        s = "A";
        //질문(성능)
        // String에다가 1000개의 문자를 누적해라. -> 성능상 좋지 않다
        // ㄴ StringBuffer   -> 누적데이터
        // ㄴ StringBuilder  -> 누적데이터

    }

}
