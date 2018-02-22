package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("enter index()");
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello Spring MVC");
        System.out.println("leave index()");
        return mav;
    }

    @RequestMapping("/jump")
    public ModelAndView jump() {
        ModelAndView mav = new ModelAndView("redirect:/index");
        return mav;
    }

    @RequestMapping("/check")
    public ModelAndView check(HttpSession session){
        Integer i=(Integer)session.getAttribute("count");
        if(i==null)
            i=0;
        i++;
        session.setAttribute("count",i);
        ModelAndView modelAndView=new ModelAndView("/check");
        return modelAndView;

    }

    @RequestMapping("/clear")
    public ModelAndView clear(HttpSession session){
        session.setAttribute("count",-1);
        ModelAndView modelAndView=new ModelAndView("redirect:/check");
        return modelAndView;
    }

}
