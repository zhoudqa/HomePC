package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;

@Controller
public class ProductController {

    @RequestMapping("/showProduct")
    public ModelAndView pdd(Product abc,String message) throws Exception {
        ModelAndView mav = new ModelAndView("showProduct");
        return mav;
    }
}