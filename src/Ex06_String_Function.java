
public class Ex06_String_Function {

    public static void main(String[] args) {
        // 일상적으로 다루는 데이터 : 문자열, 숫자, 날짜  -> 함수로 만들어져있다.(시스템 함수)
        String str = "hello";
       String concatstr = str.concat(" world");   // concat -> 결합
       System.out.println(concatstr);
       
       boolean bo = str.contains("ello");
       System.out.println(bo);
       
        bo = str.contains("elo");  // false -> 순서대로 값이 이루어지지 않음
       System.out.println(bo);
       
       String str2 = "a b c d"; // [a][][b][][c][][d]
       System.out.println(str2.length()); // 값 7 -> (빈칸도 갯수로 친다)
       
       String filename = "hello java world";
       System.out.println(filename.indexOf("j"));  // 문자열의 몇번째 숫자인지.. hello java world중 h는 0번째 문자
       System.out.println(filename.indexOf("java"));
       System.out.println(filename.indexOf("개폭망"));  // **배열에서 값이 없다라는 건 return -1이다**
       // 예) 신문사설... 단어.. 문자포함
       //     ㄴ 폭망이라는 문자가 있을까... 0보다 큰 값이 나오면 최소 1개는 사설안에 포함된다.
       // -1이 return 폭망이라는 단어가 없구나,,
       if(filename.indexOf("wo") != -1) {
       System.out.println("wo 하나라도 가지고 있구나");
       }
       System.out.println(filename.lastIndexOf("a"));  // 값 9 -> java라는 단어의 마지막 a -> last가 들어갔으니깐.
       
       // length(), indexOf(), substring(), replace(), split()
       //                       ㄴ 예)동해물과백두산이 에서 동해물과만 뽑아라
       
       String result = "superman";
       System.out.println(result.substring(0));    // 하나가 있으면 그 시점부터 뒤에꺼 까지 다나옴 -> superman
       System.out.println(result.substring(2));    // perman
       System.out.println(result.substring(1,2));  // u -> endindex = -1 -> 자기자신이 출력 -> 1자리는 u 2 자리는 p이지만 마지막 2자리는 -1 해주므로 u
       System.out.println(result.substring(0,0));  // (0, -1) 안나옴
       System.out.println(result.substring(0,1));  // s
       System.out.println(result.substring(2,3));
       
       // Quiz
       String filename2 = "h.jpejg"; // 또는 파일명이 hong.png 또는 파일명이 h.tmp
       // 여기서 파일명과 확장자를 분리해서 화면에 출력하세요
       // 예) 파일명은 h
       //    확장자는 jpeg
       // 기준점 찾기
       int position = filename2.indexOf("j");
       String file = filename2.substring(0,position);
       
       String extention2 = filename2.substring(position+1, filename2.length()); // 점 다음부터 ~ filename2의 길이까지 뽑아라
       String extention = filename2.substring(++position); // . 다음자리부터 뽑아라
       
       System.out.println(file);
       System.out.println(extention);
       System.out.println(extention2);
       
       // replace (치환함수)
       // 앞의 문자열을 뒤의 문자열로 바꿔줌
       String str3 = "ABCDADDDDDA";
       String result3 = str3.replace("DDDD", "오늘은 월요일");
       System.out.println(result3); // ABCDA오늘은 월요일DA
       
       result3 = str3.replace("A", "a");
       System.out.println(result3); // 대문자 A가 소문자 a로 치환
       
       // ETC
       // n번째 자리 실행
       System.out.println(str3.charAt(0));
       System.out.println(str3.charAt(3)); 
       
       System.out.println(str3.endsWith("DDDA")); // 포함되어 있는지 안되어있는지 판단  , true
       System.out.println(str3.endsWith("BDDDA")); // false
       
       System.out.println(str3.equalsIgnoreCase("abcDADDDDDA")); // 대소문자 구별하지 않는다 , true
       
       // Today Point (Split)
       /*
       String str4 = "슈퍼맨,팬티,노란색,우하하,우하하";
       String[] namearray = str4.split(","); // 위 데이터에서 [,] 를 부분잡아 뽑아줌
       for(String s : namearray) {
           System.out.println(s);
       }
       */
       String path = "C:\\Temp"; //  \\ -> 역슬러시 하나랑 같은 말(\)
       String str4 = "슈퍼맨.팬티.노란색.우하하.우하하";
       String[] namearray = str4.split("\\."); // 위 데이터에서 [,] 를 부분잡아 뽑아줌
                                     // ㄴ 자바는 \ -> 이스케이프 문자로 본다. \\. -> .으로 처리
       for(String s : namearray) {
           System.out.println(s);
       }
       
       // **********카페과제**********
       // String[] java.lang.String.split(String regex)(split에 나오는 얘기)
       // ㄴ 정규표현식 문법...(표준화)
       // java, javascript, Oracle, c# -> 모든 언어에서 정규표현식을 도입했당.
       // 어떠한 문자를 만들때 [규칙]을 부여하자!! -> 유효성에 대한 판단 근거를 만들자
       //  ㄴ 예) 주민번호 숫자 6자리, - 숫자까지 7자리 맞으면 true, 틀리면 false
       //        ㄴ :{\d6}-{\d7} -> 6은자리수
       //        ㄴ 123-1234567 -> false
       //        ㄴ 123456-1234567 -> true
       //  ㄴ 예) 핸드폰, 차량번호, 우편번호, 한글 처리, 도메인 주소, 이메일 주소
       //        ㄴ 이런것들의 정규표현은 이미 다 있다(하지만 정규표현식을 읽을 수 있어야한다)
       
       
     //TIP) Java 특수문자
     //이스케이프 문자 >> 특정 문자 앞에 \
     char sing = '\''; 
     
     // 야 나는 ' 하나를 표현하고 싶어 .... 역슬러시라는 문자와 결합해서 사용하면 ... 문자 인정 
     System.out.println(sing);

     //홍"길"동 이라는 문자를 String 변수에 저장하고 화면에 출력
     String ename = "홍\"길\"동";
     System.out.println(ename);
     
       // 정규표현식
       
       
       //
       
       // 넌센스
       // 저장할때 공백을 제거하고 싶다...(공백을 제거하는 함수는 없음)
       String str6 = "홍          길           동";
       System.out.println(str6.replace(" ", ""));
       
       String str7 = "         홍길동                ";
       System.out.println(">" + str7.trim()+"<"); //-> trim함수 -> 양쪽 공백을 제거해주는 함수
       
       String str8 = "   홍          길          동       ";
       String result5 = str8.trim();
       String result6 = result5.replace(" ","");
       System.out.println(result6);
       
       // 자바에서 여러개의 함수를 적용할때에는 (method chain 기법) 사용
       System.out.println(str8.trim().replace(" ", "").substring(2));
       
       // Quiz -1
       int sum = 0;
       String[] numarr = {"1","2","3","4","5"};
       // 문제 : 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 : 결과 15
       for(String s : numarr) {
           sum+=Integer.parseInt(s);  // -> 문자를 숫자로(문자열 값을 정수로)
           //Double.parseDouble(result6) -> 문자열 값을 실수로..
       }
       System.out.println("주민번호 합  : " + sum);
       
       
       //Quiz-2
       String jumin="123456-1234567";
       //위 주민번호의 합을 구하세요_1
       int sum2=0;
       for(int i = 0 ; i < jumin.length() ; i++) {
           String numstr =jumin.substring(i, i+1);
           if(numstr.equals("-")) continue;
           sum2+= Integer.parseInt(numstr);
       } 
       System.out.println("주민번호 합:" + sum2);
       
     //위 주민번호의 합을 구하세요_2
     //String jumin="123456-1234567";
       String[] numarr2 = jumin.replace("-","").split("");
       int sum3=0;
       for(String i : numarr2) {
           sum3+= Integer.parseInt(i);
       }
       System.out.println("주민번호 합2:" + sum3);
       
     //위 주민번호의 합을 구하세요_3
       String jumin4 = jumin.replace("-", "");
       int sum4=0;
       for(int i = 0 ; i < jumin4.length() ;i++) {
           sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
       }
       System.out.println("주민번호 합4:" + sum4);
       
    
    
}

}
