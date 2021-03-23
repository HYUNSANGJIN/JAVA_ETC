import java.io.IOException;

/*
 * -> 게임 CD를 PC에 설치 할것이다
 * -> 설치파일을 C:\Temp 복사를 해놓고
 * -> 복사한 파일을 가지고 게임 설치가 된다.
 * -> 정상으로 설치가 되면 C:\Temp에 있는 복사한 파일을 삭제한다.
 * -> 비정상적인 문제가 발생해도 (강제종료) 복사한 파일을 삭제하고싶다.
 * 
 * 복사한 파일 삭제 (강제),,
 */
public class Ex03_finally {
    static void startInstall() {
        System.out.println("INSTALL");
    }
    static void copyFiles() {
        System.out.println("COPY FILES");
    }
    static void fileDelete() {
        System.out.println("FILE DELETE");
    }
    public static void main(String[] args) {
        // 3개의 함수가 다 정상적인 처리
        // 예외를 사용자가 필요에 따라서 강제할 수 있음.
        // 실제로는 예외가 아니지만  개발자가 어떠한 상황에 대해서 강제로 예외로 지칭할 수 있다.
        //  ㄴ 예) 1이면 정상이고 2이면 강제로 예외를 발생해서 catch...
        // 예외를 강제로 만드는 구문 -> throw new IOException() -> throw + new + IO + 함수 + ()
        
        try {
            copyFiles();
            startInstall();
            throw new IOException("install 도중 문제가 발생 ..");  // 개발자가 임의로 발생한 예외
            
        }catch(Exception e) {
            System.out.println("예외 메시지 출력 : " + e.getMessage());
           // fileDelete(); // 예외가 발생하지 않았을 경우 -> 파일을 안지운다.
            
        }finally { // 예외가 발생하던, 발생하지 않던 무조건 실행 되는 블럭!!
            fileDelete();  // 실제로 예외가 발생하던, 발생하지 않던 강제로 실행되는 것
            // 함수로 강제 종료(return을 만나면 함수를 종료) -> 예외적으로 finally블록은 return에 의해 종료되기 전에 호출이 된다.
        }
        //fileDelete(); 
        System.out.println("main end");


    }

}
