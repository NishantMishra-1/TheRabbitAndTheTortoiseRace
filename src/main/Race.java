/*   Created by IntelliJ IDEA.
 *   Author: Nishant Mishra (NishantMishra-1)
 *   Date: 29-10-2020
 *   Time: 14:46
 *   File: race.java
 */

package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();
        rabbit.getRabbit().start();
        tortoise.start();
    }
}
