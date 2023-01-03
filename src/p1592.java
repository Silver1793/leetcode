class Solution {
    public String reorderSpaces(String text) {
        String[] arr = text.trim().split("\\s+");
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                spaceCount++;
        }
        if (arr.length == 1) {
            StringBuilder str = new StringBuilder("");
            str.append(arr[0]);
            for (int i = 0; i < spaceCount; i++) {
                str.append(" ");
            }
            return str.toString();
        }
        int spaceNum = spaceCount / (arr.length - 1);
        int spaceLeft = spaceCount % (arr.length - 1);

        StringBuilder str = new StringBuilder("");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            str.append(arr[i]);
            for (int j = 0; j < spaceNum; j++)
                str.append(" ");
        }
        str.append(arr[arr.length - 1]);
        for (int i = 0; i < spaceLeft; i++) {
            str.append(" ");
        }
        return str.toString();
    }
}