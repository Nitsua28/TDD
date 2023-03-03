package org.example;

import org.junit.*;
import org.junit.Assert;



public class CarTest {
    Car car;

    @Before
    public void setUp() {
        this.car = new Car(50, 400);
        //prius
    }

    @After
    public void cleanUp() {
        System.out.println("Cleaned up");
    }

    @Test
    public void testDrive() {
        
        Assert.assertEquals(100, car.drive(100));
    }

    @Test
    public void testFill() {
        car.fill(20);
        Assert.assertEquals(420, car.getGas(), 0.0f);
    }

    @Test
    public void testGetMileage() {
        
        Assert.assertEquals(50, car.getMileage());
    }

    @Test
    public void testSetMileage() {
        car.setMileage(200);
        Assert.assertEquals(200, car.getMileage());
    }
    
    @Test
    public void testGetGas() {
        
        Assert.assertEquals(400, car.getGas(), 0.0f);
    }
    @Test
    public void testSetGas() {
        car.setGas(500);
        Assert.assertEquals(500, car.getGas(), 0.0f);
    }
    @Test
    public void testToString() {
        
        Assert.assertEquals("Exercise3{mileage=50, gas=400.0}", car.toString());
    }
}
