package com.techcourse.controller.annotationbase;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import nextstep.mvc.view.ModelAndView;
import nextstep.web.annotation.Controller;
import nextstep.web.annotation.RequestMapping;
import nextstep.web.support.RequestMethod;

@Controller
public class ForwardController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView indexPage(HttpServletRequest req, HttpServletResponse res) {
        return ModelAndView.fromJspView("/index.jsp");
    }
}