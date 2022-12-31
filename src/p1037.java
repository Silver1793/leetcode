
class Solution {
    public boolean isBoomerang(int[][] points) {
        int firstWidth = points[0][0] - points[1][0];
        int firstHeight = points[0][1] - points[2][1];
        int firstArea = firstWidth * firstHeight;

        int secWidth = points[0][0] - points[2][0];
        int secHeight = points[0][1] - points[1][1];
        int secArea = secWidth * secHeight;

        return firstArea != secArea;
    }
}