package cn.niriqiang.cashPlayBook.web;

import cn.niriqiang.cashPlayBook.core.Result;
import cn.niriqiang.cashPlayBook.core.ResultGenerator;
import cn.niriqiang.cashPlayBook.model.Cost;
import cn.niriqiang.cashPlayBook.service.CostService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by fengyuwusong on 2017/11/29.
 */
@Api(value = "消费查询")
@RestController
@RequestMapping("/cost")
public class CostController {
    @Resource
    private CostService costService;

    @PostMapping
    public Result add(@RequestBody Cost cost) {
        costService.save(cost);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        costService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Cost cost) {
        costService.update(cost);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Cost cost = costService.findById(id);
        return ResultGenerator.genSuccessResult(cost);
    }

    @ApiOperation(value = "查询通过所有参数")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "start", dataType = "long", paramType = "form", value = "开始时间"),
            @ApiImplicitParam(name = "end", dataType = "long", paramType = "form", value = "结束时间"),
            @ApiImplicitParam(name = "type", dataType = "int", paramType = "form", value = "类型id"),
            @ApiImplicitParam(name = "baoxiao", dataType = "int", paramType = "form", value = "是否进行报销(1->报销 0->无)"),
            @ApiImplicitParam(name = "gtMoney", dataType = "int", paramType = "form", value = "最小金额"),
            @ApiImplicitParam(name = "ltMoney", dataType = "int", paramType = "form", value = "最大金额"),
            @ApiImplicitParam(name = "openid", dataType = "String", paramType = "form", value = "微信用户openid", required = true),
            @ApiImplicitParam(name = "page", dataType = "int", paramType = "form", value = "页码"),
            @ApiImplicitParam(name = "size", dataType = "int", paramType = "form", value = "页显示数")
    })
    @PostMapping("/findListByCondition")
    public Result findListByCondition(@RequestParam(value = "start", required = false) Long start,
                                      @RequestParam(value = "end", required = false) Long end,
                                      @RequestParam(value = "type", required = false) Integer type,
                                      @RequestParam(value = "baoxiao", required = false) Integer baoxiao,
                                      @RequestParam(value = "gtMoney", required = false) Integer gtMoney,
                                      @RequestParam(value = "ltMoney", required = false) Integer ltMoney,
                                      @RequestParam(value = "openid") String openid,
                                      @RequestParam(defaultValue = "0") Integer page,
                                      @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Cost> list = costService.findListByCondition(start, end, type, baoxiao, gtMoney, ltMoney, openid);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @ApiOperation(value = "获取时间段内的总金额")
    @GetMapping("/getSum")
    public Result getSum(@RequestParam("openid") String openid,
                         @RequestParam("start") long start,
                         @RequestParam("end") long end){
        double sum=costService.getSumByStartAndEnd(start, end, openid);
        return ResultGenerator.genSuccessResult(sum);
    }


}
