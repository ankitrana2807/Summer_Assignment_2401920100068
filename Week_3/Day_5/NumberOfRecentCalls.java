package Week_3.Day_5;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {

        queue.offer(t);

        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}

public class NumberOfRecentCalls {

    public static void main(String[] args) {

        RecentCounter recentCounter = new RecentCounter();

        System.out.println(recentCounter.ping(1));     // 1
        System.out.println(recentCounter.ping(100));   // 2
        System.out.println(recentCounter.ping(3001));  // 3
        System.out.println(recentCounter.ping(3002));  // 3
    }
}