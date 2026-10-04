/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        Stack<Integer> ends = new Stack<>();
        for (Interval i : intervals) {
            if (!ends.isEmpty()) {
                int n = ends.pop();
                if (n > i.start) {
                    return false;
                }
            }
            ends.push(i.end);
        }
        return true;
    }
}
