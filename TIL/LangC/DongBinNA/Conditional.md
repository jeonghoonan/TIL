09-14-20

# 조건문

## if ~ else

        if (배고고프다) {
        밥을 먹는다;
        } else if (심심하다) {
        게임을 한다;
        } else if (숙제가 있다) {
        공부한다;
        } else {
        잠잔다;
        }

## switch ~ break
* if ~ else 와 switch ~ break 는 서로 바꾸어 작성이 가능하다 
* default 는 if ~ else 의 else 역활을 한다 
    * 어떤 case 에도 조건이 걸리지 않았다면, default 를 수행한다 


        switch (조건) {
        case A:
        문장 a;
        break;
        case B:
        문장 b;
        break;
        case C:
        case D:
        문장 d;
        break;
        default:
        문장 e;
        }