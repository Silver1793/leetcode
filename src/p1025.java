class Solution {
    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }
}

/*
 * Whoever lands on 2 wins
 * For odd numbers it is impossible to land on 2 if you go first
 * For even numbers it is always possible to land on two if you go first
 * therefore the solution is just if n is divisible by 2 or not
 */