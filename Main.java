public class Main {
    
    public static void main(String[] args) {
        
        
        String Name = "Sharlorenz";
        int Age = 16;
        char MiddleIniatial = 'A';
        double weight = 48.18;
        
        int num1 = 10, num2 = 3 ;
        int add = num1 + num2 ; 
        int sub = num1 - num2 ;
        int mul = num1 * num2 ;
        int div = num1 / num2 ;
        int modulus = num1 % num2 ;
        
        boolean samebasila = num1 == num2 ;
        boolean maypagkakaiba = num1 != num2 ;
        boolean masmataas = num1 > num2 ;
        boolean masmababa = num1 < num2 ;
        boolean mataasorsakto = num1 >= num2 ;
        boolean mababaorsakto = num1 <= num2 ;
        boolean milktea = true;
        boolean coffee = false;
        boolean want = milktea || coffee;
        
        System.out.println("");
        System.out.println("Ako si " + Name);
        System.out.println(Age + " years old");
        System.out.println("10-3 = " + sub);
        System.out.println(samebasila);
        System.out.println(maypagkakaiba);
        System.out.println(masmataas);
        System.out.println(masmababa);
        System.out.println(mataasorsakto);
        System.out.println(mababaorsakto);
        System.out.println(want);
    }
    
}