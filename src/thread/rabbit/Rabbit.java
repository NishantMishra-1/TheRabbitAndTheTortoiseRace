/*   Created by IntelliJ IDEA.
 *   Author: Nishant Mishra (NishantMishra-1)
 *   Date: 29-10-2020
 *   Time: 14:54
 *   File: Rabbit.java
 */

package thread.rabbit;

public class Rabbit implements Runnable {

    private static final int MILESTONES = 5;

    private final Thread rabbit;

    public Rabbit() {
        this.rabbit = new Thread(this, "Rabbit");
    }

    public Thread getRabbit() {
        return rabbit;
    }

    @Override
    public void run() {

    }
}
