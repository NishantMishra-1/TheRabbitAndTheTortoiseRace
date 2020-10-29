/*   Created by IntelliJ IDEA.
 *   Author: Nishant Mishra (NishantMishra-1)
 *   Date: 29-10-2020
 *   Time: 14:46
 *   File: race.java
 */

package main;

import thread.rabbit.Rabbit;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
    }
}
