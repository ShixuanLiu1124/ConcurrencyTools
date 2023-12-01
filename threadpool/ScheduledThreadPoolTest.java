package threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 描述：     TODO
 */
public class ScheduledThreadPoolTest {

    public static void main(String[] args) {
        // 创建 Scheduled 线程池, 能够定时及周期性任务执行
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(10);
        // 开始时延迟 秒执行
//        threadPool.schedule(new Task(), 5, TimeUnit.SECONDS);
        // 一开始延迟1秒钟执行, 之后每隔3秒钟执行一次
        threadPool.scheduleAtFixedRate(new Task(), 1, 3, TimeUnit.SECONDS);
    }
}
