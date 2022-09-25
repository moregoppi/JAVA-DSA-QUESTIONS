import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //how many student marks have to be upload
        for(int i=1;i<=n;i++){
            int marks = sc.nextInt();
            if(marks>=90){
                System.out.println(marks+" good marks"+" "+i);
            }else if(89>=marks && marks>=60){
                System.out.println(marks+" also good marks"+" "+i);
            }else{
                System.out.println(marks+" good marks also"+" "+i);
            }
        }
    }
}
