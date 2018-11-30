package com.xq.service.impl;

import com.xq.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

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

    private static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(30, 30, 30, TimeUnit.SECONDS, new LinkedBlockingQueue<>(60), new ThreadPoolExecutor.AbortPolicy());

    static {
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override
    public void test() {
        logger.debug("====IndexServiceImpl test======");
        threadPoolExecutor.execute(() -> {
            int i=0;
        });
    }


    /*@PostConstruct*/

}
