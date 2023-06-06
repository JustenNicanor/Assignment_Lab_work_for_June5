public class FibonacciSeries {
    public class Main {
        public static void main(String[] args) {
            int n = 10;
            int t1 = 0, t2 = 1, t3;
            System.out.print("First " + n + " terms: ");
            System.out.print(t1 +" "+ t2);
            
            for(int i=2; i<n ;++i){
                t3= t1 + t2;
                System.out.print(" "+t3);
                t1 = t2;
                t2 = t3;
            }
        }
    }
}
