package cn.niriqiang.cashPlayBook.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 微信open_id
     */
    @Column(name = "open_id")
    @NotNull
    private String openId;

    @NotNull
    @Column(name = "nickName")
    private String nickname;

    private String language;

    private String city;

    private String province;

    private String country;

    @NotNull
    @Column(name = "avatar_url")
    private String avatarUrl;

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
     * 获取微信open_id
     *
     * @return open_id - 微信open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置微信open_id
     *
     * @param openId 微信open_id
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * @return nickName
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", nickname='" + nickname + '\'' +
                ", language='" + language + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    /**
     * @return avatar_url
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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