public class decimaltobinary {
    public static void dTob(int n){
        int binary_num=0;
        int power=0;
        while(n>0){
            int reminder=n%2;
            binary_num=binary_num+(reminder*(int)Math.pow(10,power));
            power++;
            n=n/2;
        }
        System.out.println(binary_num);
    }
    public static void main(String[] args) {
        dTob(11);
    }
}
