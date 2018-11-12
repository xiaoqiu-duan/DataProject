package com.xq.web.api;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Package: com.xq.web.controller.com.xq.web.api
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2018/11/5
 * Time: 18:44
 * Description:
 */
@RequestMapping("/api/index")
@Controller
public class IndexApiController {

    @RequestMapping("/test.ajax")
    @ResponseBody
    public String test() {
        return "test";
    }

}



