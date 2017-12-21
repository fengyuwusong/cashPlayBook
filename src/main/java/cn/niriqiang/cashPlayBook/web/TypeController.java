package cn.niriqiang.cashPlayBook.web;

import cn.niriqiang.cashPlayBook.core.Result;
import cn.niriqiang.cashPlayBook.core.ResultGenerator;
import cn.niriqiang.cashPlayBook.model.Type;
import cn.niriqiang.cashPlayBook.service.TypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by fengyuwusong on 2017/12/21.
 */
@RestController
@RequestMapping("/type")
public class TypeController {
    @Resource
    private TypeService typeService;

    @PostMapping
    public Result add(@RequestBody Type type) {
        typeService.save(type);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        typeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Type type) {
        typeService.update(type);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Type type = typeService.findById(id);
        return ResultGenerator.genSuccessResult(type);
    }

    @ApiOperation(value = "通过收入、消费类型查询")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "类型 0->消费 1->收入", name = "type", paramType = "query", dataType = "int"),
            @ApiImplicitParam(value = "用户id", name = "uid", paramType = "query", dataType = "int")})
    @GetMapping
    public Result findListByType(@RequestParam(defaultValue = "0") Integer page,
                                 @RequestParam(defaultValue = "0") Integer size,
                                 @RequestParam int type,
                                 @RequestParam int uid) {
        PageHelper.startPage(page, size);
        List<Type> list = typeService.findListByType(type, uid);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
