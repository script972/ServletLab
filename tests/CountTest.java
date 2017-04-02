import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by script972 on 15.02.2017.
 */
public class CountTest {
    @Test
    public void summArrY() throws Exception {
        Count count=new Count(2.8, -0.3, 4);
        count.createArray(0.002,0,2);
        assertEquals(999, count.summArrY(),0.1);
    }

    @Test
    public void midleSummArrY() throws Exception {
        Count count=new Count(2.8, -0.3, 4);
        count.createArray(0.002,0,2);
        assertEquals(1, count.midleSummArrY(),0.1);
    }


    @Test
    public void minArrY() throws Exception {
        Count count=new Count(2.8, -0.3, 4);
        count.createArray(0.002,0,2);
        assertEquals(0.984, count.minArrY(),0.1);

    }

    @Test
    public void maxArrY() throws Exception {
        Count count=new Count(2.8, -0.3, 4);
        count.createArray(0.002,0,2);
        assertEquals(9.0529, count.maxArrY(),0.1);
    }

    @Test
    public void getX() throws Exception {
        Count count=new Count(2.8, -0.3, 4);
        count.createArray(0.002,0,2);
        assertEquals(0, count.getX(0),0);

        count.createArray(0.002,0,2);
        assertEquals(1.4, count.getX(700),0.001);

        count.createArray(0.002,0,2);
        assertEquals(1.9980, count.getX(999),0.001);

    }

    @Test
    public void getY() throws Exception {
        Count count=new Count(2.8, -0.3, 4);
        count.createArray(0.002,0,2);
        assertEquals(4, count.getY(0),0);

        count.createArray(0.002,0,2);
        assertEquals(1.3833, count.getY(700),0.001);

        count.createArray(0.002,0,2);
        assertEquals(0.9849, count.getY(999),0.001);
    }

    @Test
    public void tablH() throws Exception {
        Count count=new Count(0,0,0);
        assertEquals(3, count.tablH(1, 1, 4));

        count=new Count(0,0,0);
        assertEquals(3, count.tablH(2, 3, 10));
    }

    @Test
    public void resultY() throws Exception {
        Count count=new Count(2.8, -0.3, 4);
        assertEquals(3.72, count.resultY(1.4),0.02);

        count=new Count(2, 0.3, 1);
        assertEquals(4.24, count.resultY(1.2),0.02);

    }










}