package cn.niriqiang.cashPlayBook.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by fengyuwusong on 2017/12/21 19:38.
 */
@ApiModel
@Data
public class ConditionDto {
    @ApiModelProperty(value = "开始时间戳",dataType = "long")
    private Long start;
    @ApiModelProperty(value = "结束时间戳",dataType = "long")
    private Long end;
    @ApiModelProperty(value = "类型id",dataType = "int")
    private Integer type;
    @ApiModelProperty(value = "大于金额",dataType = "int")
    private Integer gtMoney;
    @ApiModelProperty(value = "小于金额",dataType = "int")
    private Integer ltMoney;
    @ApiModelProperty(value = "openid",dataType = "String",required = true)
    @NotNull
    private int uid;
    private Integer page=0;
    private Integer size=0;
}
