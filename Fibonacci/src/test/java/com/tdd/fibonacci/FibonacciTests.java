package com.tdd.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTests {

    private Fibonacci fibonacci = new Fibonacci();

    /**
     * 피보나치는 0과 1로 시작.
     * 0번째 피보나치는 0.
     * 1번째 피보나치는 1.
     */
    @Test
    void 피보나치_TDD_0번째() {
        assertEquals(0, fibonacci.getFibonacci(0));
    }

    @Test
    void 피보나치_TDD_1번째() {
        assertEquals(1, fibonacci.getFibonacci(1));
    }

    /**
     * 피보나치 2부턴
     * 바로 앞 두 피보나치 수의 합
     */
    @Test
    void 피보나치_TDD_2번째() {
        assertEquals(1, fibonacci.getFibonacci(2));
    }

    /**
     * 피보나치 2번째: 피보나치 1번째 + 피보나치 0번째
     * 이제 재귀로 들어가야함
     */
    @Test
    void 피보나치_TDD_2번째는_재귀로() {
        assertEquals(1, fibonacci.getFibonacci(2));
    }

    /**
     * 피보나치 n번째: (피보나치 n - 1번째) + (피보나치 n - 2 번째)
     */
    @Test
    void 피보나치_TDD_N번째() {
        // 난수를 발생 ( 0 ~ 20 )
        int random = (int)Math.random() * 21;

        int fibo_1 = fibonacci.getFibonacci(random - 1);
        int fibo_2 = fibonacci.getFibonacci(random - 2);

        int expected_fibo = fibo_1 + fibo_2;

        assertEquals(expected_fibo, fibonacci.getFibonacci(random));
    }

}
