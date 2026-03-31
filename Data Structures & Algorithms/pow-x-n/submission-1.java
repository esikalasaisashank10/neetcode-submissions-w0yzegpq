class Solution {
    public double myPow(double x, int n) {
      
        long N = n;              // use long to handle -2147483648

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1.0;

        while (N > 0) {
            if (N % 2 == 1) {    // if odd
                ans *= x;
            }
            x *= x;              // square base
            N /= 2;              // reduce exponent
        }

        return ans;
    }
}


