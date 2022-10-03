package DemoUnitTesting.DemoUnitTest;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UnitTestSimple {
    Unit unit = new Unit();



    @Test
    void test1(){
        assertEquals(unit.sum(1,1),2);
    }
    @Test
    void test2(){
        assertEquals(unit.sum(1,1),3);
    }
    @Test
    void test3(){
        assertEquals(unit.sum(1,2),3);
    }
}
