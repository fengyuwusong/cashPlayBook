package cn.niriqiang.cashPlayBook.web;

import cn.niriqiang.cashPlayBook.core.Result;
import cn.niriqiang.cashPlayBook.core.ResultGenerator;
import cn.niriqiang.cashPlayBook.model.IncomeType;
import cn.niriqiang.cashPlayBook.service.IncomeTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by fengyuwusong on 2017/12/27.
*/
@RestController
@RequestMapping("/income/type")
public class IncomeTypeController {
    @Resource
    private IncomeTypeService incomeTypeService;

    @PostMapping
    public Result add(@RequestBody IncomeType incomeType) {
        incomeTypeService.save(incomeType);
        return ResultGenerator.genSuccessResult(incomeType.getId());
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        incomeTypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody IncomeType incomeType) {
        incomeTypeService.update(incomeType);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{uid}")
    public Result findListByUid(@PathVariable int uid){
        List<IncomeType > list=incomeTypeService.findListByUid(uid);
        return ResultGenerator.genSuccessResult(list);
    }



}
