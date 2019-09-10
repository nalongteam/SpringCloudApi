package com.market.utils.reduce;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @ClassName StatelessReduceRule
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/10
 * @Version V1.0
 **/
public class StatelessReduceRule implements ReduceRule {
    private DefaultReduceRule rule;

    public StatelessReduceRule(){
        this.rule=new DefaultReduceRule();
    }

    @Override
    public BigDecimal getReduce(BigDecimal totalReduce, BigDecimal leftTotalReduce, int totalReduceTimes, int leftReduceTimes, int scale) {
        if (totalReduceTimes == 1) {
            return totalReduce;
        }

        int firstN = Math.max(totalReduceTimes / 3, 1); // 前1/3的人
        BigDecimal halfReduce = totalReduce.divide(BigDecimal.valueOf(2), RoundingMode.HALF_EVEN).setScale(scale, RoundingMode.HALF_EVEN);
        int leftN = totalReduceTimes - firstN;
        BigDecimal theOtherHalf = totalReduce.subtract(halfReduce);

        if (totalReduceTimes - leftReduceTimes < firstN) {
            // 前1/3的人砍掉一半
            BigDecimal leftTotal = halfReduce.subtract(totalReduce.subtract(leftTotalReduce));
            return rule.getReduce(halfReduce, leftTotal, firstN, firstN - (totalReduceTimes - leftReduceTimes), scale);
        } else {
            // 剩下的人砍掉一半
            return rule.getReduce(theOtherHalf, leftTotalReduce, leftN, leftReduceTimes, scale);
        }
    }
}
