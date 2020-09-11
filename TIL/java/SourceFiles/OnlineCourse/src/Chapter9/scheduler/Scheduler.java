package Chapter9.scheduler;

import java.io.IOException;

public interface Scheduler {
    public void getNextCall();
    public void sendCallToAgent();
}

class RoundRobin implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("상담 전화르 순서대로 대기열에서 가져옵니다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다른 순서의 상담원에게 배분합니다");
    }
}

class LeastJob implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("상담 전화르 순서대로 대기열에서 가져옵니다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("현재 상담없무가 없거나 상담대기가 가장 적은 상담원에게 할달합니다");
    }
}

class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("고객등급이 높은 고객의 call을 먼저 가져옵니다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 숙련도가 높은 상담원에게 먼저 배분합니다");
    }
}

class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담언 할당 방식을 선택하세요");
        System.out.println("R : 한명씩 차례대로");
        System.out.println("L : 대기가 적은 상담원 우선");
        System.out.println("P : 우선순위가 높은 고객우선 숙련도 높은 상담원");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}