package cn.niriqiang.cashPlayBook.web;

import cn.niriqiang.cashPlayBook.Dto.ConditionDto;
import cn.niriqiang.cashPlayBook.core.Result;
import cn.niriqiang.cashPlayBook.core.ResultGenerator;
import cn.niriqiang.cashPlayBook.core.ServiceException;
import cn.niriqiang.cashPlayBook.model.Income;
import cn.niriqiang.cashPlayBook.service.IncomeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by fengyuwusong on 2017/11/29.
 */
@RestController
@RequestMapping("/income")
public class IncomeController {
    @Resource
    private IncomeService incomeService;
    private static final Logger LOGGER = LoggerFactory.getLogger(IncomeController.class);

    @PostMapping
    public Result add(@RequestBody Income income) {
        incomeService.save(income);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        incomeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Income income) {
        incomeService.update(income);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Income income = incomeService.findById(id);
        return ResultGenerator.genSuccessResult(income);
    }

    @PostMapping("/findListByCondition")
    public Result fondListByCondition(
            @Valid ConditionDto dto,
            BindingResult result,
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "0") Integer size) {
        if (result.hasErrors()) {
            for (ObjectError or : result.getAllErrors()) {
                LOGGER.warn("验证类型:" + or.getCode() + " \t错误消息:"
                        + or.getDefaultMessage());
            }
            throw new ServiceException("数据错误,请重试");
        }
        PageHelper.startPage(page, size);
        List<Income> list = incomeService.findListByCondition(dto);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @ApiOperation(value = "获取时间段内的总金额")
    @GetMapping("/getSum")
    public Result getSum(@RequestParam("openid") String openid,
                         @RequestParam("start") long start,
                         @RequestParam("end") long end){
        double sum=incomeService.getSumByStartAndEnd(start, end, openid);
        return ResultGenerator.genSuccessResult(sum);
    }

}
