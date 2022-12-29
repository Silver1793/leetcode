class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>(); // Uses hashset to keep track of unique strings

        for (int i = 0; i < emails.length; i++) {
            StringBuilder str = new StringBuilder("");

            String[] temp = emails[i].split("@"); // splits by the "@"
            for (int j = 0; j < temp[0].length(); j++) {
                if (temp[0].charAt(j) == '.') // skip if . is seen
                    continue;
                if (temp[0].charAt(j) == '+') // skips the rest of the string if + is
                    break;
                str.append(temp[0].charAt(j));
            }
            str.append('@'); // appends "@" again since it was removed by split
            str.append(temp[1]); // appends the string after the original @
            set.add(str.toString()); // adds to the set
        }
        return set.size(); // returns the set size for how many unique elements there are
    }
}