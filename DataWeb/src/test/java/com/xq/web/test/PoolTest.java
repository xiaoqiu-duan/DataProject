package com.xq.web.test;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * Package: com.xq.web.test
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2018/11/30
 * Time: 10:05
 * Description:
 */
public class PoolTest {

    private static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(30, 30, 30, TimeUnit.SECONDS, new LinkedBlockingQueue<>(60), new ThreadPoolExecutor.AbortPolicy());


    static {
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }


    @Test
    public void testPool() {
        System.out.println("======start=======");
        threadPoolExecutor.execute(() -> {
            System.out.println("=============");
        });
        System.out.println("=========end========");
    }

    @Test
    public void testComparable() throws ExecutionException, InterruptedException {

        System.out.println("==========1=========");
        CompletableFuture<Integer> result = CompletableFuture.supplyAsync(() -> {
            System.out.println("==========2=========");
            return 1;
        });
        System.out.println("==========3=========");
        CompletableFuture<Integer> res = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("==========4=========");
                Thread.sleep(2000);
                System.out.println("==========5=========");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 2;
        });
        System.out.println("==========6=========");
        Integer x = result.get();
        System.out.println("==========7=========");
        Integer y = res.get();
        System.out.println("==========8=========");
        System.out.println(x + y);
        System.out.println("==========9=========");

    }


}
