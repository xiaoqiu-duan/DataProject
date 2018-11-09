package com.xq.service.impl;

import com.xq.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Package: com.xq.service.impl
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2018/11/5
 * Time: 18:06
 * Description:
 */
@Service
public class IndexServiceImpl implements IndexService {
    private static final Logger logger = LoggerFactory.getLogger(IndexServiceImpl.class);


    @PostConstruct
    public void init() {
        while (true) {
            logger.debug("======init=====");
        }

    }

}
