package cn.niriqiang.cashPlayBook.dto;

import cn.niriqiang.cashPlayBook.model.CostFirstType;
import cn.niriqiang.cashPlayBook.model.CostSecondType;

/**
 * Created by fengyuwusong on 2017/12/30 23:56.
 */
public class CostAndFirstSecondTypeDto {
    private Integer id;

    private int uid;

    private Double money;

    @Override
    public String toString() {
        return "CostAndFirstSecondTypeDto{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                ", type=" + type +
                ", necessary=" + necessary +
                ", mark='" + mark + '\'' +
                ", createTime=" + createTime +
                ", firstType=" + firstType +
                ", secondType=" + secondType +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
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

    public Integer getNecessary() {
        return necessary;
    }

    public void setNecessary(Integer necessary) {
        this.necessary = necessary;
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

    private Integer type;
    private Integer necessary;

    private String mark;

    private Long createTime;

    private CostFirstType firstType;
    private CostSecondType secondType;

    public CostFirstType getFirstType() {
        return firstType;
    }

    public void setFirstType(CostFirstType firstType) {
        this.firstType = firstType;
    }

    public CostSecondType getSecondType() {
        return secondType;
    }

    public void setSecondType(CostSecondType secondType) {
        this.secondType = secondType;
    }
}
