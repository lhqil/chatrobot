package zhongji;

/**
 * Created by lihanqing3 on 2018/6/1.
 */
public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                int second=0;
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                    System.out.printf("当前已沉睡%d秒%n",second++);
                }
            }

        };
        t1.start();
    }
}
