class LeetcodeQ11{
    public static int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x = x / 10;

        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        int x=-123;
        LeetcodeQ11 solution=new LeetcodeQ11();
        System.out.println(solution.reverse(x));
    }
}