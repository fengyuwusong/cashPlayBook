package cn.niriqiang.cashPlayBook.web;

import cn.niriqiang.cashPlayBook.core.Result;
import cn.niriqiang.cashPlayBook.core.ResultGenerator;
import cn.niriqiang.cashPlayBook.model.User;
import cn.niriqiang.cashPlayBook.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;

/**
 * Created by fengyuwusong on 2017/11/29.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation(value = "添加新用户")
    @PostMapping
    public Result add(@RequestBody User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult(user.getId());
    }

    @ApiIgnore
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiIgnore
    @PutMapping
    public Result update(@RequestBody User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value="用户详情")
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    //    通过openId查找
    @ApiOperation(value = "查询用户通过openId")
    @GetMapping("/openid/{openId}")
    public Result findByOpenId(@PathVariable String openId) {
        User user = userService.findBy("openId", openId);
        return ResultGenerator.genSuccessResult(user);
    }
}
