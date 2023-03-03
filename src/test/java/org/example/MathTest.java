package org.example;

import org.junit.*;

public class MathTest {
    Math math;

    @Before
    public void setUp() {
        this.math = new Math();
        
    }

    @After
    public void cleanUp() {
        System.out.println("Cleaned up");
    }

    @Test
    public void testGCF() {
        
        Assert.assertEquals(5, math.GCF(5, 15));
    }

    @Test
    public void testareaRectangle() {
        
        Assert.assertEquals(45, math.areaRectangle(3, 15));
    }

    @Test
    public void testareaTriangle() {
        
        Assert.assertEquals(30, math.areaTriangle(3, 20), 0.0f);
    }

    @Test
    public void testareaCircle() {
        
        Assert.assertEquals(3.14159265359 * 81, math.areaCircle(9), 0.0f);
    }

    @Test
    public void testFactorial() {
        
        Assert.assertEquals(24, math.factorial(4));
    }
}
