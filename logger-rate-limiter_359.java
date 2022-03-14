// Time Complexity : O(1)
// Space Complexity : O(n)where n is number of unique inputs
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
//Store the mesaage as key and value as current timestamp +10,
// whenever next instance of same message appears then check the timestamp in map to verify its  greater than value or not

class Logger {

    Map<String, Integer> logMap;
    public Logger() {
        logMap = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        int curr = logMap.getOrDefault(message, 0);
        if (timestamp >= curr) {
            logMap.put(message, timestamp+10);
            return true;
        }
        return false;
    }
}
