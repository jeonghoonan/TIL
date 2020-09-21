09-18-20

# 구조체 (Structure)

* 객체 지향 프로그래밍에서 클래스(class)와 흡사한 개념으로 사용된다
    * 구조체 : 객체지향 프로그래밍에서 말하는 클래스의 모체가 되는것으로 여러개의 자료형을 묶어서 새로운 자료형을 만둘수 있는 방법이다 
    * 배열은 여러개의 같은 자료형들을 하나로 묶는것이었다면 구조체는 서로 다른 자료형들을 하나로 묶어서 한꺼번에 다루는것이다  
* 구조체는 struct 이라는 키워드에 의해 정의가 된다 
    
        struct 구조체이름 {
            자료형 멤버이름;
            자료형 멤버이름;
            ...
        }    
* ex)
        
        #include <stdio.h>
        #include <stdlib.h>
        
        struct student {
            int number; // 학생 번호 
            char name[10]; // 학생 이름 
            double grade; // 학점 
        };
        
        int main(void) {
            struct student s; // 구조체 student 그 변수를 s를 만들었다. 하나의 자료형을 스스로 만들어낸것이다. 
            s.number = 20150001; // 20150001 의 값이 int number 로 들어간다 
            strcpy(s.name, "홍길동"); // 홍길동이라는 문자열이 s.name으로 들어갈수있게 한다. 왜냐하면 char 배열이기때문에 이렇게 안정적으로 문자를 삽입할수있다 
            s.grade = 4.5;
            printf("학번 : %d\n", s.number);
            printf("이름 : %s\n", s.name);
            printf("학점 : %.1f\n", s.grade);
            return 0;
        }        