class Solution {
    public int minSteps(int n) {
        if(n==1) return 0;
        int sum=0;
        for(int num:primeFactorization(n))   {
            sum+=num;
        }
        return sum;
    }
    public static List<Integer> primeFactorization(int number) {
        List<Integer> factors = new ArrayList<>();
        while (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }
    
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
    
        if (number > 2) {
            factors.add(number);
        }
        
        return factors;
    }
}