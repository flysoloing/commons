package com.flysoloing.commons.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 抽奖工具类
 *
 * @author laitao
 * @date 2015-03-24 18:57:00
 */
public class LuckDrawUtils {

    /**
     * 按照传入的抽奖中奖率抽奖，使用的是伪随机算法
     *
     * @param rates 抽奖商品中奖概率列表
     * @return -1：无法抽奖；<br>其他：对应的商品序号
     */
    public static int luckDraw(List<BigDecimal> rates) {
        // 如果抽奖率列表为空，则返回-1表示无法抽奖
        if (rates == null || rates.isEmpty()) {
            return -1;
        }

        // 当前参与抽奖奖品的数量
        int size = rates.size();

        // 计算总概率
        BigDecimal sumRate = new BigDecimal("0");
        for (BigDecimal rate : rates) {
            sumRate = sumRate.add(rate);
        }

        // 计算每个奖品在总概率基础下的概率，并重排序
        List<BigDecimal> sortRates = new ArrayList<BigDecimal>(size);
        BigDecimal tempSumRate = new BigDecimal("0");
        for (BigDecimal rate : rates) {
            tempSumRate = tempSumRate.add(rate);
            BigDecimal r = tempSumRate.divide(sumRate, 10, BigDecimal.ROUND_HALF_UP);
            sortRates.add(r);
        }

        // 抽取随机值，并加入已排序的抽奖概率列表
        double nextDouble = Math.random();
        BigDecimal index = new BigDecimal(nextDouble);
        sortRates.add(index);
        Collections.sort(sortRates);

        // 返回随机值所在抽奖概率列表的索引
        return sortRates.indexOf(index);
    }
}
