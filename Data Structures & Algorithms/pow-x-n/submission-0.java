class Solution {
    public double myPow(double x, int n) {
        double  sum=1;
        if(n<0){
            x=1/x;
            n=Math.abs(n);
        }
        for(int i=1;i<=n;i++){
            sum*=x;
        }
        return sum;
    }
}
