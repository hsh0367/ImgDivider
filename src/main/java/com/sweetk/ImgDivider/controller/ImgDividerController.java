package com.sweetk.ImgDivider.controller;

import com.sweetk.ImgDivider.domain.ImgDividerDomain;
import com.sweetk.ImgDivider.service.ImgDividerService;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
public class ImgDividerController {

    private static Logger logger = LoggerFactory.getLogger(ImgDividerController.class);

    @Autowired
    ImgDividerService ImgDividerService;

    @GetMapping("/")
    public ModelAndView readTest() throws Exception{
        List<ImgDividerDomain> person_list = ImgDividerService.findPerson_nm();
        ModelAndView nextPage = new ModelAndView("ImgDivider/ImgDivider");
        nextPage.addObject("personlist", person_list);
        return nextPage;
    }
    @GetMapping("/person/{personName}")
    public ModelAndView selectPerson( @PathVariable String personName) throws Exception{
        List<ImgDividerDomain> person_list = ImgDividerService.findPerson_nm();
        List<ImgDividerDomain> img_list = ImgDividerService.findByPerson_nm(personName);
        ModelAndView mv = new ModelAndView("/ImgDivider/ImgDivider");
        System.out.println(personName);
        mv.addObject("personlist", person_list);
        mv.addObject("imglist", img_list);
        return  mv;
    }

    @RequestMapping(value = "/img/{img_no}")
    @ResponseBody
    public void update(@RequestParam int img_no,@RequestParam int is_use)throws Exception{
        System.out.println("REQUST TEST update --- "+img_no);
        ImgDividerDomain img = ImgDividerService.findByImg_no(img_no);
        img.setIs_use(is_use);
        ImgDividerService.updateImg_no(img);
    }

}
