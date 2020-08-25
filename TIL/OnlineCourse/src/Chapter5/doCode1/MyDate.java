package Chapter5.doCode1;

/**
 * 정보은닉 - 날자의 유효성을 검증하는 프로그램 구현
 *  day, month, year 변수는 private으로 선언
 *  각 변수의 getter, setter를 public으로 구현
 *  MyDate(int day, int month, int year)생성자를 만든다
 *  public boolean isValid() 메서드를 만들어 날짜가 유효한지 확인
 *  MyDateTest클래스에서 생성한 MyDate날짜가 유효한지 확인
 */

public class MyDate {
    private int day;
    private int month;
    private int year;

    public boolean isValid = true;



}

class MyDateTest {
    public static void main(String[] args) {


    }
}
