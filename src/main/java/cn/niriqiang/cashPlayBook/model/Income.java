package cn.niriqiang.cashPlayBook.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Income{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int uid;

    private Double money;

    private Integer type;

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", money=" + money +
                ", type=" + type +
                ", mark='" + mark + '\'' +
                ", createTime=" + createTime +
                '}';
    }

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
     * @return mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark
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