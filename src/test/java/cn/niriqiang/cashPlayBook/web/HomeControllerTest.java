package cn.niriqiang.cashPlayBook.web;

import cn.niriqiang.cashPlayBook.Tester;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by fengyuwusong on 2017/12/31 23:17.
 */
public class HomeControllerTest extends Tester{
    @Resource
    HomeController homeController;
    @Test
    public void addType() throws Exception {
        homeController.addType(25);
    }

}