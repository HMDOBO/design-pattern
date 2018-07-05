package com.pattern.strategy.practice.enmus;

import com.pattern.strategy.practice.behavior.Calculate;
import com.pattern.strategy.practice.behavior.impl.AddCalculate;
import com.pattern.strategy.practice.behavior.impl.MultCalculate;
import com.pattern.strategy.practice.behavior.impl.ReduceCalculate;

public enum BehaviorEnum {

    ADD("add", AddCalculate), REDUCE("reduce", ReduceCalculate), MULT("mult", MultCalculate);

    private String oper;
    private Calculate calculate;

    private BehaviorEnum(String oper, Calculate calculate) {
        this.oper = oper;
        this.calculate = calculate;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public Calculate getCalculate() {
        return calculate;
    }

    public void setCalculate(Calculate calculate) {
        this.calculate = calculate;
    }
}
