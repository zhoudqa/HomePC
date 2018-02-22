package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.UploadImageFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {
    @RequestMapping("/uploadImage")
    public ModelAndView upload(HttpServletRequest request, UploadImageFile file)
            throws IllegalStateException,IOException{
        String newFileName = "husky.jpg";
        File newFile=new File(request.getServletContext().getRealPath("/image"),newFileName);
        newFile.getParentFile().mkdirs();
        file.getImage().transferTo(newFile);

        ModelAndView modelAndView=new ModelAndView("showImage");
        modelAndView.addObject("imageName",newFileName);
        return modelAndView;
    }
}
