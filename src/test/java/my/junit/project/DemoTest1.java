package my.junit.project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoTest1 {

    @Before
    public void demoTest1Before() {
        System.out.println("This a before method in demoTest 1 Before method...................");
    }

    @Test
    public void demoTest1Test() {
        System.out.println("UNIT Test Demo Test 1 test method executed.......................... ");
        System.out.println("TEST ONE Successfully Passed");
    }

    @After
    public void demoTest1After() {
        System.out.println("This a before method in demoTest 1 Before method...................");
    }

}
