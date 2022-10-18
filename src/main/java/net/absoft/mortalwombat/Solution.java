package net.absoft.mortalwombat;

import java.math.BigDecimal;

public class Solution {
    private BigDecimal x1 = null;
    private BigDecimal x2 = null;

    public Solution(Double a, Double b, Double c) {
        double D = b * b - 4 * a * c;

        if (!(D < 0)) {
            setX1(BigDecimal.valueOf(((-1) * b + Math.sqrt(D) / 2 * a)));
            setX2(BigDecimal.valueOf(((-1) * b - Math.sqrt(D) / 2 * a)));

        }
    }

    public BigDecimal getX1() {
        return x1;
    }

    private void setX1(BigDecimal x1) {
        this.x1 = x1;
    }

    public BigDecimal getX2() {
        return x2;
    }

    private void setX2(BigDecimal x2) {
        this.x2 = x2;
    }

}

