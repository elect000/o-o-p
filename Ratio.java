public class Ratio
{
    private long num;
    private long denom;

    public Ratio (long num, long denom) {
        if (denom < 0) {
            num *= -1;
            denom *= -1;
        }
        long g = gcd (num, denom);
        this.num = num / g;
        this.denom = denom / g;
    }

    private long gcd (long p, long q) {
        
    }

}
