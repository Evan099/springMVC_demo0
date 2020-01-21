package com.imooc.handler;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//基于xml
public class Myhanler implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {

//        创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();

//        填充模型数据
        modelAndView.addObject("name","Tom");

//        设置逻辑视图
        modelAndView.setViewName("show");

        return modelAndView;


    }
}
