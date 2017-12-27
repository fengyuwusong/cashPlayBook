package cn.niriqiang.cashPlayBook.dto;

import cn.niriqiang.cashPlayBook.model.CostSecondType;
import lombok.Data;

import java.util.List;

/**
 * 消费类型dto
 * Created by fengyuwusong on 2017/12/27 11:04.
 */
@Data
public class CostTypeDto {
    // 一级类型id
    private int firstTypeId;
    // 一级类型名称
    private String firstTypeName;
    //二级类型集合
    private List<CostSecondType> list;
}
