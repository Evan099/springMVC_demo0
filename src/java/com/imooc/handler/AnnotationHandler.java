package com.imooc.handler;

import com.imooc.entity.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

//基于注解
@Controller
public class AnnotationHandler {


    @RequestMapping("/modelAndViewTest")
    public ModelAndView modelAndViewTest(){
//        创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
//        填充模型数据
        modelAndView.addObject("name","Rose");
//        设置逻辑视图
        modelAndView.setViewName("show");

        return modelAndView;


    }

    /**
     *
     * 业务方法：Model传值，String进行视图解析
     *
     */


    @RequestMapping("/ModelTest")
    public String ModelTest(Model model){

//        填充模型数据
        model.addAttribute("name","jack");
//        设置逻辑视图
        return "show";

    }


    /**
     *
     * 业务方法：Map传值，String进行视图解析
     *
     */

    @RequestMapping("/MapTest")
    public String MapTest(Map<String,String> map){

//        填充模型数据
        map.put("name","map传值");
        return "show";


    }


    /**
     *
     * 业务方法：(实战)之添加商品并展示
     *
     */

    @RequestMapping("/addGoods")
    public ModelAndView addGoods(Goods goods){
        System.out.println(goods.getName()+"---"+goods.getPrice());

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("goods",goods);

        modelAndView.setViewName("show");

        return modelAndView;

    }


}
