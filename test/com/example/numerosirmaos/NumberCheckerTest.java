package com.example.numerosirmaos;

import org.junit.Assert;
import org.junit.Test;

public class NumberCheckerTest {
    @Test
    public void testSolution() {
        NumberChecker nc = new NumberChecker();
        Assert.assertEquals(321,nc.solution(213));
        Assert.assertEquals(553,nc.solution(553));
        Assert.assertEquals(876,nc.solution(768));
        Assert.assertEquals(932,nc.solution(329));
        Assert.assertEquals(-1,nc.solution(902481238));
    }
}
