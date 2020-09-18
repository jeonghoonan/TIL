09-14-20

# 이곳저곳에서 정보.. 

## I
* 가끔 버퍼가 프로그램 동작을 방해한다
* C언어에서는 간단하게 getchar() 함수로 버퍼의 공백 문자를 받아낼수 있다
* scanf() 함수를 사용할때는 변수 이름 앞에 &를 붙여야한다
    * && 붙이면 and가 되니 유의
* 변수는 내부에 있는 값을 프로그래밍이 실행되는 도중에 언제든지 교체할수있다
    * 하지만 상수는 한번 설정되면 프로그램이 종료될때까지 변경되지 않느 데이터이다 
* C언어에서는 String대신 char 를 사용한다  

## II
* C언어에서 사용자 정의 함수, 배열, 문자열, 포인터 다룰줄 알아야 한다
* 포인터는 C 언어의 특징이자 기본적인 자료 형태이다 
* 포인터는 특정한 데이터가 저장되어 있는 메모리의 주소 그 자체를 저장하는 변수로서 C언어를 고급스럽게 활용하기 위해서 필수적으로 알아야 한다        

## III
* C언어는 자바(Java) 나 C++ 과 같은 언어에 비해 개발이 까다롭다 
* 객체지향에서의 모듈들을 C에서 적용하기 어렵다 
* 객체지향 프로그래밍에서 클래스(Class) 와 흡사한 개념으로 사용되는건 구조체(Structure) 이다 
    * 구조체 : 개체지향 프로그래밍에서 말하는 클래스의 모체가 되는것으로 여러개의 자료형을 묶어서 새로운 자료형을 만들수 있는 방법이다 
    
## stdio.h VS stdlib.h

### <stdio.h>
* Standard Input Output 
* declaration of printf() and scanf()
* contains 'File related Input/Output' functions

### <stdlib.h>
* Standard Library     
* declaration of malloc() and free()
* contains 'Memory Allocation/Freeing' functions