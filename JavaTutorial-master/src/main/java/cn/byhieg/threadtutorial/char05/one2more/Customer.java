package cn.byhieg.threadtutorial.char05.one2more;

import cn.byhieg.threadtutorial.char05.one2one.list.*;

/**
 * Created by byhieg on 17/2/1.
 * Mail to byhieg@gmail.com
 */
public class Customer implements Runnable {

    private MyQueue queue;

    public Customer(MyQueue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        for (;;) {
            System.out.println(queue.pop());
        }
    }
}
