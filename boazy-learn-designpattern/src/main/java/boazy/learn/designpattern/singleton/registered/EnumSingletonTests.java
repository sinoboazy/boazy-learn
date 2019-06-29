package boazy.learn.designpattern.singleton.registered;

import java.util.concurrent.CountDownLatch;

/**
 * @author boazy
 * @date 2018/8/4
 */
public class EnumSingletonTests {

    public static void main(String[] args) {
        int count = 200;
        final CountDownLatch latch = new CountDownLatch(count);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200; i++) {
            new Thread(() -> {
                System.out.println(System.currentTimeMillis() + ": " + EnumSingleton.INSTANCE.getData());
                latch.countDown();
            }).start();
        }

        try {
            latch.await();
            System.out.println("Enum耗时(ms)：" + (System.currentTimeMillis() - startTime));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
