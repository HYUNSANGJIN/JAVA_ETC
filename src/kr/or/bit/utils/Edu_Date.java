package kr.or.bit.utils;

import java.util.Calendar;

// 날짜의 형식을 제공하는 설계도
// 많이사용 -> 편하게 -> 어떠한 기능이 자주 사용된다면 -> new(x) -> static 함수 -> 하나의 이름으로 (오버로딩)
// 

public class Edu_Date {
    
    public static String DateString(Calendar date) {
        
      return  date.get(Calendar.YEAR) + "년" + 
             (date.get(Calendar.MONTH)+1) + "월" + 
              date.get(Calendar.DATE)+ "일";
        
    }
    
    public static String DateString(Calendar date, String opr) {
        
    return  date.get(Calendar.YEAR) + opr + 
           (date.get(Calendar.MONTH)+1) + opr + 
            date.get(Calendar.DATE);

}
    // 요구사항
    // 2021-2-17
    // 1~9월 -> 01,02 ...
    // 10 11 12 월은 그대로 
    public static String monthFormat_DateString(Calendar date) {
        String month = "";
        if((date.get(Calendar.MONTH)+1)<10) {
            month = "0" + (date.get(Calendar.MONTH)+1);
        }else {
            month = String.valueOf((date.get(Calendar.MONTH)+1));
        }
        return date.get(Calendar.YEAR) + "년"
                + month + "월"
                + date.get(Calendar.DATE) + "일";
    }


}
