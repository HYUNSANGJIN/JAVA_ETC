/*
 * 예외처리 : 틀린걸 고쳐주는건 아님!
 * 
 * 프로그램을 하다보면 [오류]가 생긴다.
 *               ㄴ 에러와 예외라고 한다. 둘은 다른 의미다.
 *               ㄴ 에러(error) : 네트워크 장애, 메모리 이상, 하드웨어  -> 개발자가 코드적으로 해결 불가한 것
 *               ㄴ 예외(exception) : 개발자의 코드 실수에 의해 발생된 것 -> 방어적(프로그램이 강제 종료하는 것을 막는다)인 코드를 만들어야 한다. (예외처리)
 *                 ㄴ 개발을 하고 예외가 발생하면 원래 프로그램은 강제 종료된다. -> 비정상적인 종료
 *                 
 * // 예외 처리가 나도 함수를 끝까지 클라이언트 모르게 실행할때 쓰는 문장           
 * try{
 *     -> 문제가 발생할 수 있는 코드
 *     -> 문제가 발생하면 catch로 보내겠다.
 *     
 * }catch(Exception e){
 *     -> 문제가 생기면 catch에서 문제를 파악하겠다.
 *     -> 처리 유도
 *     -> 1. 관리자에게 알려준다.(메일로 알려주거나,,)
 *     -> 2. 로그파일에 문제 기록
 *     -> 3. 강제 종료는 막는다.
 *     -> 개발자의 코드 수정이 필요하다.
 *     
 * } finally{
 *     -> 문제가 발생하던, 발생하지 않던 강제로 수행되어야 할 코드
 *     -> 예) Db 연결 해제,,,
 * 
 * }
 * 
 * 예외가 발생하면 개발자는 예외발생에 대해서 파악하고싶다(어떤 자원, 어떤 행동에 의해서 발생되었는지,,)
 * 예외에 관련된 클래스를 미리 설계 -> 예외가 발생하면 자동으로 그 예외에 맞는 클래스를 객체로 생성 -> 다양한 정보를 그 객체에 넣어준다
 * 
 */
public class Ex01_Exception {

    public static void main(String[] args) {
        System.out.println("main start");
        
        try {
            System.out.println(0/0);  // 문제가 되는 코드를 try블록 안에 넣는다
                                      // new ArithmeticException()  -> 연산 객체가 생성이 되고 그 정보를 가져온다.
            
        }catch (Exception e) {  // Exception 클래스는 ArithmeticException의 부모 타입이다.(다형성)
                                // java.lang.Object
                                // java.lang.Throwable
                                // java.lang.Exception
                                // java.lang.RuntimeException
                                // java.lang.ArithmeticException
            // 문제에 대한 파악 가능
           // System.out.println("발생 원인 : " + e.getMessage());
            e.printStackTrace();  // 문제발생시 추적하는 것
        }
        
       // System.out.println(0/0); // 원래 자바는 0으로 나눌수가 없다.
        // xception in thread "main" java.lang.ArithmeticException: / by zero
        // 프로그랭 강제종료(비정상적인 종료) -> 예외 발생
        
        System.out.println("main end");

    }

}
