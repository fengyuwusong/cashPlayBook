package cn.niriqiang.cashPlayBook.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class Cost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "open_id")
    private String openId;

    private Double money;

    @Override
    public String toString() {
        return "Cost{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", money=" + money +
                ", type=" + type +
                ", baoxiao=" + baoxiao +
                ", mark='" + mark + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    private Integer type;

    /**
     * 0->不可报销 1->可报销
     */
    private Integer baoxiao;

    /**
     * 备注
     */
    private String mark;

    @Column(name = "create_time")
    private long createTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * @return money
     */
    public Double getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取0->不可报销 1->可报销
     *
     * @return baoxiao - 0->不可报销 1->可报销
     */
    public Integer getBaoxiao() {
        return baoxiao;
    }

    /**
     * 设置0->不可报销 1->可报销
     *
     * @param baoxiao 0->不可报销 1->可报销
     */
    public void setBaoxiao(Integer baoxiao) {
        this.baoxiao = baoxiao;
    }

    /**
     * 获取备注
     *
     * @return mark - 备注
     */
    public String getMark() {
        return mark;
    }

    /**
     * 设置备注
     *
     * @param mark 备注
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return create_time
     */
    public long getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
}