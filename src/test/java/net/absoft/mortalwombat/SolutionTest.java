package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {
    @Test
    public void DmoreZero() {
        Solution s = Runner.InputNumber(1.0, 2.0, -4.0);
        Assert.assertNotEquals(s.getX1(), s.getX2());
    }

    @Test
    public void DequalZero() {
        Solution s = Runner.InputNumber(1.0, -2.0, 1.0);
        Assert.assertEquals(s.getX1(), s.getX2());
    }

    @Test
    public void DlessZero() {
        Solution s = Runner.InputNumber(1.0, -3.0, 5.0);
        Assert.assertNull(s.getX1(), "NE PUSTO");
        Assert.assertNull(s.getX2(), "NE PUSTO");
    }
}
