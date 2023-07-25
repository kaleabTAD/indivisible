public class Main {
    public static void main(String[] args) {
        int []a={};
        System.out.println(isDivisible(a,12));
    }
    static int isDivisible(int []a,int b){

        for (int i=0;i<a.length;i++){
            if (a[i]%b!=0)return 0;
        }
        return 1;
    }
}