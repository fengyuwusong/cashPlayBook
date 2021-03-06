package cn.niriqiang.cashPlayBook.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int uid;

    private Double money;


    private Integer type;


    @Override
    public String toString() {
        return "Cost{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", money=" + money +
                ", type=" + type +
                ", necessary=" + necessary +
                ", mark='" + mark + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    /**
     * 0->不必要的 1->必要的
     */
    @Column(name = "necessary")
    private Integer necessary;

    /**
     * 备注
     */
    private String mark;

    @Column(name = "create_time")
    private Long createTime;

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
     * @return uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(int uid) {
        this.uid = uid;
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
     * @return necessary - 0->不可报销 1->可报销
     */
    public Integer getNecessary() {
        return necessary;
    }

    /**
     * 设置0->不可报销 1->可报销
     *
     * @param necessary 0->不可报销 1->可报销
     */
    public void setNecessary(Integer necessary) {
        this.necessary = necessary;
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
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}