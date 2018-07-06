package com.pattern.strategy.practice.enmus;

import com.pattern.strategy.practice.behavior.Calculate;
import com.pattern.strategy.practice.behavior.impl.AddCalculate;
import com.pattern.strategy.practice.behavior.impl.ErrCalculate;
import com.pattern.strategy.practice.behavior.impl.MultCalculate;
import com.pattern.strategy.practice.behavior.impl.ReduceCalculate;

public enum BehaviorEnum {

    ADD("add", new AddCalculate()),
    REDUCE("reduce", new ReduceCalculate()),
    MULT("mult", new MultCalculate()),
    ERR("err", new ErrCalculate());

    private String oper;
    private Calculate calculate;

    BehaviorEnum(String oper, Calculate calculate) {
        this.oper = oper;
        this.calculate = calculate;
    }

    public static Calculate getCalculate(String oper) {
        BehaviorEnum[] values = BehaviorEnum.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].oper.equals(oper)) {
                return values[i].calculate;
            }
        }
        return null;
    }
}
