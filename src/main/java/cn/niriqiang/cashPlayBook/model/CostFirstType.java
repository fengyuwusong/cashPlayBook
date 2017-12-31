package cn.niriqiang.cashPlayBook.model;

import javax.persistence.*;

@Table(name = "cost_first_type")
public class CostFirstType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer uid;

    public CostFirstType(String name, Integer uid) {
        this.name = name;
        this.uid = uid;
    }

    public CostFirstType() {
    }

    @Override
    public String toString() {
        return "CostFirstType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uid=" + uid +
                '}';
    }

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }
}