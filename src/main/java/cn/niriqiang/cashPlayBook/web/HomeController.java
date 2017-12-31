package cn.niriqiang.cashPlayBook.web;

import cn.niriqiang.cashPlayBook.core.Result;
import cn.niriqiang.cashPlayBook.core.ResultGenerator;
import cn.niriqiang.cashPlayBook.core.ServiceException;
import cn.niriqiang.cashPlayBook.dto.ConditionDto;
import cn.niriqiang.cashPlayBook.model.*;
import cn.niriqiang.cashPlayBook.service.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 用于组织打开主页时一连串的请求
 * Created by fengyuwusong on 2017/12/31 22:54.
 */
@RestController
@RequestMapping("/home")
public class HomeController {
    @Resource
    private UserService userService;
    @Resource
    private CostFirstTypeService costFirstTypeService;
    @Resource
    private CostSecondTypeService costSecondTypeService;
    @Resource
    private IncomeTypeService incomeTypeService;
    @Resource
    private CostService costService;
    @Resource
    private IncomeService incomeService;

    @PostMapping("/{start}")
    public Result home(@RequestBody User user, @PathVariable("start") long start) {
        User findUser = userService.findBy("openId", user.getOpenId());
        List<Cost> costs=null;
        List<Income> incomes=null;
        Double incomeSum=0d;
        Double costSum=0d;
        //不存在则添加
        if (findUser == null) {
            userService.save(user);
            addType(user.getId());
        } else {
            user = findUser;
            long now = System.currentTimeMillis() / 1000;
            //获取收入总和
            incomeSum = incomeService.getSumByStartAndEnd(start, now, user.getId());
            //获取支出总额
            costSum = costService.getSumByStartAndEnd(start, now, user.getId());
            try{
                //查看最近一天的支出列表
                costs=costService.findListByCondition(now- 24 * 60 * 60 * 3,now,null,null,null,null,user.getId());
            }catch (ServiceException e){
                System.out.println(e.getMessage());
            }
            try {
                //查看最近一天的收入列表
                ConditionDto dto=new ConditionDto(now- 24 * 60 * 60 * 3,now,null,null,null,user.getId(),null,null);
                incomes=incomeService.findListByCondition(dto);
            }catch (ServiceException e){
                System.out.println(e.getMessage());
            }
        }
        HashMap<String,Object> res=new HashMap<>();
        res.put("user",user);
        res.put("incomeSum",incomeSum);
        res.put("costSum",costSum);
        res.put("costList",costs);
        res.put("incomeList",incomes);
        return ResultGenerator.genSuccessResult(res);
    }

    //给用户添加新类型
    public void addType(int uid) {
        //给新用户添加默认类型 收入->工资  奖金  支出->吃饭 早中午   购物 ->零食  日用品
        List<CostFirstType> firstTypes = new ArrayList<>();
        CostFirstType eatType = new CostFirstType("吃饭", uid);
        CostFirstType shoppingType = new CostFirstType("购物", uid);
        firstTypes.add(eatType);
        firstTypes.add(shoppingType);
        costFirstTypeService.save(firstTypes);
        List<CostSecondType> secondTypes = new ArrayList<>();
        secondTypes.add(new CostSecondType("早餐", eatType.getId(), uid));
        secondTypes.add(new CostSecondType("午餐", eatType.getId(), uid));
        secondTypes.add(new CostSecondType("晚餐", eatType.getId(), uid));
        secondTypes.add(new CostSecondType("零食", shoppingType.getId(), uid));
        secondTypes.add(new CostSecondType("日用品", shoppingType.getId(), uid));
        costSecondTypeService.save(secondTypes);
        List<IncomeType> incomeTypes = new ArrayList<>();
        incomeTypes.add(new IncomeType("工资", uid));
        incomeTypes.add(new IncomeType("奖金", uid));
        incomeTypeService.save(incomeTypes);
    }


}
