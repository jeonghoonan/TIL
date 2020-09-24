09-11-20 / 09-24

# Variables

* C 의 기본 문법 

        #include <stdio.h>
        
        int main(void) {
            return 0;
        }
        
* 설명 

        #include <stdio.h> // 하나의 라이브러리이다 // .printf 를 사용할수있게 한다 
        #include <limits.h> // int max가 포함하고 있다  // 각각의 변수들 자료형의 따른 한계점 한계값을 그런 범위들을 포함하고 있는 라이브러리이다 
        
        int main(void) {
        
            int x = INT_MAX; // int x 가 가질수 있는 최댓값 
            printf("int형의 최댓값 x는 %d 입니다.\n", x); // 214783647
            printf("x + 1은 %d입니다.\n", x + 1); // -2147483648 한바뀌를 건너뛰어서 최소값으로 돌아갔다. 이게 overflow이다 
            return 0;
        }
        
## 부가적인 정보
* 키워드 사용불가(int 로 변수명 선언 불가하다)   
* 공백 사용 불가 
* 첫 글자에 숫자 불가 

### 변수에 상수
* "scanf" 말고 소스에 직접 변수에 상수를 넣는 방법이 있다 
    * 상수 : 변하지 않는 직접적인 값
    * ex) num = 10; 
        * "+" 표시는 같다는게 아니고 저장하다 라는 의미이다 