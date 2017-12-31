package cn.niriqiang.cashPlayBook.model;

import javax.persistence.*;

@Table(name = "income_type")
public class IncomeType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer uid;

    public IncomeType(String name, Integer uid) {
        this.name = name;
        this.uid = uid;
    }

    public IncomeType() {
    }

    @Override
    public String toString() {
        return "IncomeType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uid=" + uid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}