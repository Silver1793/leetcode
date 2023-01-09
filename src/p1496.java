class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        HashSet<String> set = new HashSet<>();
        set.add(0 + " " + 0);
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            }
            if (path.charAt(i) == 'S') {
                y--;
            }
            if (path.charAt(i) == 'E') {
                x++;
            }
            if (path.charAt(i) == 'W') {
                x--;
            }
            String coord = x + " " + y;
            if (set.contains(coord))
                return true;
            set.add(coord);
        }
        return false;
    }
}