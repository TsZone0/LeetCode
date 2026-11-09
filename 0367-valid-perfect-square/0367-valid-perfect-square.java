class Solution {

    public boolean square(int s, int e, int mid, int num) {

        if (s > e) {
            return false;
        }

        long square = (long) mid * mid;

        if (square == num) {
            return true;
        }
        else if (square > num) {
            return square(s, mid - 1, s + (mid - 1 - s) / 2, num);
        }
        else {
            return square(mid + 1, e, mid + 1 + (e - mid - 1) / 2, num);
        }
    }

    public boolean isPerfectSquare(int num) {
        return square(1, num, 1 + (num - 1) / 2, num);
    }
}