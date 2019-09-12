package com.market.utils.reduce;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * @ClassName DefaultReduceRule
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/10
 * @Version V1.0
 **/
public class DefaultReduceRule implements ReduceRule {
    @Override
    public BigDecimal getReduce(BigDecimal totalReduce, BigDecimal leftReduce, int totalReduceTimes, int leftReduceTimes, int scale) {
        if (leftReduceTimes <= 0) {
            return new BigDecimal(0);
        }
        if (leftReduceTimes == 1) {
            return leftReduce;
        }

        BigDecimal minReduce = totalReduce.divide(BigDecimal.valueOf(totalReduceTimes).multiply(BigDecimal.valueOf(2)), RoundingMode.HALF_EVEN);
        double min = minReduce.doubleValue();
        double max = leftReduce.doubleValue() - min * leftReduceTimes;
        double adjustedMax = min + (leftReduceTimes > 10 ? max / 3 : max);
        double ratio = new Random().nextDouble();
        return BigDecimal.valueOf(min + (adjustedMax - min) * ratio).setScale(scale, RoundingMode.HALF_EVEN);
    }
}
