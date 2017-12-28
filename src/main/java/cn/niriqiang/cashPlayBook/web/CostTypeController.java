package cn.niriqiang.cashPlayBook.web;

import cn.niriqiang.cashPlayBook.core.Result;
import cn.niriqiang.cashPlayBook.core.ResultGenerator;
import cn.niriqiang.cashPlayBook.dto.CostTypeDto;
import cn.niriqiang.cashPlayBook.model.CostFirstType;
import cn.niriqiang.cashPlayBook.model.CostSecondType;
import cn.niriqiang.cashPlayBook.service.CostFirstTypeService;
import cn.niriqiang.cashPlayBook.service.CostSecondTypeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 消费类型控制器
 * Created by fengyuwusong on 2017/12/27.
 */
@RestController
@RequestMapping("/cost/type")
public class CostTypeController {
    @Resource
    private CostFirstTypeService costFirstTypeService;
    @Resource
    private CostSecondTypeService costSecondTypeService;


    @ApiOperation(value="获取用户所有类型并转成CostTypeDto")
    @GetMapping("/{uid}")
    public Result findAll(@PathVariable int uid){
        List<CostTypeDto> dtos=costSecondTypeService.findAllByUid(uid);
        return ResultGenerator.genSuccessResult(dtos);
    }

    @PostMapping("/first")
    public Result add(@RequestBody CostFirstType costFirstType) {
        costFirstTypeService.save(costFirstType);
        return ResultGenerator.genSuccessResult(costFirstType.getId());
    }

    @DeleteMapping("/first/{id}")
    public Result deleteFirst(@PathVariable Integer id) {
        costFirstTypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/first")
    public Result update(@RequestBody CostFirstType costFirstType) {
        costFirstTypeService.update(costFirstType);
        return ResultGenerator.genSuccessResult();
    }


    @PostMapping("second")
    public Result add(@RequestBody CostSecondType costSecondType) {
        costSecondTypeService.save(costSecondType);
        return ResultGenerator.genSuccessResult(costSecondType.getId());
    }

    @DeleteMapping("/second/{id}")
    public Result deleteSecond(@PathVariable Integer id) {
        costSecondTypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/second")
    public Result update(@RequestBody CostSecondType costSecondType) {
        costSecondTypeService.update(costSecondType);
        return ResultGenerator.genSuccessResult();
    }


}
