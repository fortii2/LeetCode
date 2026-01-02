/*
 * @lc app=leetcode id=933 lang=java
 *
 * [933] Number of Recent Calls
 */

// @lc code=start

import java.util.ArrayList;

class RecentCounter {
    ArrayList<Integer> requestTime;

    public RecentCounter() {
        requestTime = new ArrayList<>();
    }

    public int ping(int t) {
        requestTime.add(t);
        int counter = 0;

        for (Integer time : requestTime) {
            if (time + 3000 >= t) {
                counter++;
            }
        }

        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
// @lc code=end
