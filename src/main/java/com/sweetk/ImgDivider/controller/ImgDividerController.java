package com.sweetk.ImgDivider.controller;

import com.sweetk.ImgDivider.domain.ImgDividerDomain;
import com.sweetk.ImgDivider.service.ImgDividerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class ImgDividerController {

    private static Logger logger = LoggerFactory.getLogger(ImgDividerController.class);

    @Autowired
    ImgDividerService ImgDividerService;

    // 전체 보기
    @GetMapping("/")
    public ModelAndView list() throws Exception{
        List<ImgDividerDomain> boardList = ImgDividerService.findAll();
        ModelAndView nextPage = new ModelAndView("ImgDivider/test");
        nextPage.addObject("boardList", boardList);
        return nextPage;
    }

    // 글 상세보기
//    @GetMapping("/board/{bno}")
//    public ModelAndView readOne(@PathVariable("bno") int bno) throws Exception{
//        ModelAndView popupPage = new ModelAndView("board/read");
//        popupPage.addObject("board", Seivice.findByBno(bno));
//        return popupPage;
//    }

    // TEST
    @GetMapping("/test")
    public ModelAndView readTest() throws Exception{
        List<ImgDividerDomain> boardList = ImgDividerService.findAll();
        ModelAndView nextPage = new ModelAndView("test");
        nextPage.addObject("boardList", boardList);
        return nextPage;
    }

}
