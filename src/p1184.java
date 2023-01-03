class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int left = 0;
        int right = 0;

        int copyStart = start;
        int copyEnd = destination;

        while (copyStart != destination) {
            left += distance[copyStart++];
            if (copyStart >= distance.length)
                copyStart = 0;
        }
        copyStart = start;
        while (copyStart != destination) {
            if (copyStart == 0) {
                right += distance[distance.length - 1];
                copyStart = distance.length - 1;
            } else {
                right += distance[--copyStart];
            }
        }
        System.out.println(right);
        return Math.min(left, right);
    }
}