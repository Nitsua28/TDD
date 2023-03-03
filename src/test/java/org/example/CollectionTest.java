package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import org.junit.*;


public class CollectionTest {
    Collection collection;
    @Before
    public void setUp() {
        this.collection = new Collection();
        //prius
    }

    @After
    public void cleanUp() {
        System.out.println("Cleaned up");
    }

    @Test
    public void testMax() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(7);
        list.add(80);
        list.add(1);
        list.add(5);
        Assert.assertEquals(80, Collection.findMax(list));
    }

    @Test
    public void testMin() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(7);
        list.add(80);
        list.add(1);
        list.add(5);
        Assert.assertEquals(1, Collection.findMin(list));
    }

    @Test
    public void testRemoveLessThan() {
        Set<Integer> list = new TreeSet<Integer>();
        list.add(8);
        list.add(7);
        list.add(80);
        list.add(1);
        list.add(5);
        Set<Integer> listCompare = new TreeSet<Integer>();
        listCompare.add(80);
        listCompare.add(8);
        Collection.removeLessThan( list, 8);
        Assert.assertEquals(listCompare, list);
    }

    @Test
    public void testRemoveGreaterThan() {
        Set<Integer> list = new TreeSet<Integer>();
        list.add(8);
        list.add(7);
        list.add(80);
        list.add(1);
        list.add(5);
        Set<Integer> listCompare = new TreeSet<Integer>();
        listCompare.add(1);
        listCompare.add(5);
        listCompare.add(8);
        listCompare.add(7);
        Collection.removeGreaterThan( list, 8);
        Assert.assertEquals(listCompare, list);
    }

    public void removeHalf() {
        Queue<String> strings = new PriorityQueue<String>();
        strings.add("Bubba");
        strings.add("Tubba");
        strings.add("Lubba");
        strings.add("Hubba");
        Queue<String> stringsCompare = new PriorityQueue<String>();
        stringsCompare.add("Lubba");
        stringsCompare.add("Hubba");
        Collection.removeHalf(strings);
        Assert.assertEquals(stringsCompare, strings);
    }
}
