
public class Ex02_Exception {

    public static void main(String[] args) {
        int num = 100;
        int result = 0;
        System.out.println("main Start");
        
        try {
            for(int i=0; i<10; i++) {
                result = num /(int) (Math.random()*10);   // 0~9까지의 정수값이 나온다.
                System.out.println("result : " + result + " i : " + i);
                
            }
            
        }catch(ArithmeticException e) {  // 하위 예외(구체화, 특수화)를 쓰는것이 좋다.(가독성이 좋다)
            System.out.println("문제가 발생 로그 기록 ... 관리자에게 메일 발송");
            System.out.println("원인 : " + e.getMessage());
        }catch(NullPointerException e) {  // catch : 상황에 따라 여러개 쓸수 있음
                                         // 하위 예외 먼저 선언 .. 상위 예외
        }catch(Exception e) { // ArithmeticException 아니고 NullPointerException 아닌 나머지 예외는 Exception이 해결
                              // 부모타입인 Exception을 나중에 선언(모든 예외를 다 먹기 때문에 가독성을 좋게 하기위해 하위 예외 먼저 선언하는 것)
            
        }
        
        
        System.out.println("main End");

    }

}
