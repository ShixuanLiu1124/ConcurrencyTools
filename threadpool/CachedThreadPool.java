package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 描述：     TODO
 */
public class CachedThreadPool {

    public static void main(String[] args) {
        // 创建带缓存的线程池, 带有回收线程功能
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            executorService.execute(new Task());
        }
    }
}
