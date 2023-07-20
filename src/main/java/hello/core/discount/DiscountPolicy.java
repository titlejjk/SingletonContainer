package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /*
        @return 할인 대상 금액
        할인 정책이라는 인터페이스
        이걸 호출하고 나면 천원이 할인 됐어 라고 리턴해준다.
     */
    int discount(Member member, int price);
}
