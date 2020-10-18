package com.example.first;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    MainActivity mm = new MainActivity();

    @Test
    public void max_isCorrect() {
        assertEquals("2",mm.Max(1,2));
    }

    @Test
    public void max_isNotCorrect(){
        assertEquals("Null",mm.Max(null,null));
    }

    @Test
    public void max_isEqual(){
        assertEquals("2", mm.Max(2,2));
    }

    @Test
    public void max_isZero(){
        assertEquals("3",mm.Max(0,3));
    }

    @Test
    public void min_isCorrect() {
        assertEquals("1",mm.Min(1,2));
    }

    @Test
    public void min_isNotCorrect(){
        assertEquals("Null",mm.Min(null,null));
    }

    @Test
    public void min_isEqual(){
        assertEquals("2", mm.Min(2,2));
    }

    @Test
    public void min_isZero(){
        assertEquals("0",mm.Min(0,3));
    }
}