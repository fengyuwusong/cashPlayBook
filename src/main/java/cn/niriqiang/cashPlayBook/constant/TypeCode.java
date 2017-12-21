package cn.niriqiang.cashPlayBook.constant;

/**
 * Created by fengyuwusong on 2017/12/20 22:28.
 */
//消费、收入分类常量
public enum TypeCode {
    EAT(1, "吃饭"),
    SNACKS(2,"零食"),
    SHOPPING(3,"超时购物"),
    FRUIT(4,"水果"),
    ALIMONY(100,"生活费"),
    SCHOLARSHIP(101,"奖学金")
    ;
    public int code;
    public String msg;

    TypeCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
