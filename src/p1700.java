class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int numCircle = 0;
        int numSquare = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0)
                numCircle++;
            else
                numSquare++;
        }
        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 0) {
                if (numCircle == 0)
                    return numSquare;
                numCircle--;
            } else {
                if (numSquare == 0)
                    return numCircle;
                numSquare--;
            }
        }
        return 0;
    }
}