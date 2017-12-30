package cn.niriqiang.cashPlayBook.dto;

import cn.niriqiang.cashPlayBook.model.IncomeType;

/**
 * Created by fengyuwusong on 2017/12/31 0:05.
 */
public class IncomeAndTypeDto {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    private int uid;

    private Double money;

    private Integer type;
    private String mark;

    private Long createTime;

    private IncomeType incomeType;

    @Override
    public String toString() {
        return "IncomeAndTypeDto{" +
                "openId='" + uid + '\'' +
                ", money=" + money +
                ", type=" + type +
                ", mark='" + mark + '\'' +
                ", createTime=" + createTime +
                ", incomeType=" + incomeType +
                '}';
    }

    public int getOpenId() {
        return uid;
    }

    public void setOpenId(int uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public IncomeType getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(IncomeType incomeType) {
        this.incomeType = incomeType;
    }
}
