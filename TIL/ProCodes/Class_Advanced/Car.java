package Class_Advanced;

/**
 * 생성자
 *  모든 클래스는 인스턴스화 될때 성성자를 사용한다
 *  특징
 *      리턴타입이 없다
 *      생성자를 만들지 않으면 매개변수가 없는 생성자가 컴파일할때 자동으로 만들어진다
 *      매개변수가 없는 생성자를 기본생성자라고 한다
 *      생성자를 하나라도 만들었다면 기본생성자는 자동으로 만들어지지 않는다
 *  역활
 *      객체가 될때 필드를 초기화 한다
 *
 */

public class Car {
    // 타입 필드명
    String name;
    int number;

    /**
     * Car클래스의 생성자 매개변수의 이름은 n 이라 무엇을 의미하는 변수인지 쉽게 알수없다
     */

//    public Car(String n) {
//        name = n;
//    }
//}

    public Car (String name) { // n 으로 쓰기 보다 name 으로 사용하는게 좋다
        // name = name; // 이렇게 바꾸면 가깝게 선언된 변수를 우선 사용해서
                    // 'name=name' 코드는 매개변수의 name 값을 매개변수 name에 대입하라는 뜻이된다
        /**
         * 필드는 바뀌지않는다. 이 경우 필드라는 것을 컴파일러와 JVM 에게 알려주기 위해 this키워드 사용
         * this 는 객체 자신을 참조하는 키워드
         */
        this.name = name; // 내 구성요소. 내 필드 네임 에다가 지금 들어온 네임을 넣어달라
        /**
         * 앞의 this.name 은 필드 name을 말하고 = 뒤의 name 은 매개변수를 의미
         * 매개변수의 값을 필드에 대입하라는 의미
         */
    }
}

class CarExam {
    public static void main(String[] args) {
        // Car c1 = new Car();
        Car c2 = new Car("소방차"); // new Car 부분이 생성자
        Car c3 = new Car("구급차");

        System.out.println(c2.name); // 소방차

    }
}

//public class Car {
//    String name;
//    int number;
//
//    public Car (String name) { <- 생성자(Constructor)
                                // "소방차" 를  String name 부분에 넣고
//                              그 소방차가 class Car String name 으로 저장한다
//        this.name = name;
//    }
//}
