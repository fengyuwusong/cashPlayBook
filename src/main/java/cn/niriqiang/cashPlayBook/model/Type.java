package cn.niriqiang.cashPlayBook.model;

import javax.persistence.*;

public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    /**
     * 0->消费 1->收入
     */
    private Byte type;

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
     * @return type
     */
    public Byte getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Byte type) {
        this.type = type;
    }
}