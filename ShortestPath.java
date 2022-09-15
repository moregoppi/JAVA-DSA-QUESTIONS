import java.util.*;
public class shortestpath {
    public static  float checkShortestPath(String str){
        int x=0, y=0;
        //here we are checking the direnctions in which user move us
        for(int i=0;i<str.length();i++){
            int direction=str.charAt(i);
            if(direction=='N'){
                y++;
            }else if(direction=='E'){
                x++;
            }else if(direction=='S'){
                y--;
            }else{
                x--;
            }
        }
        //here we getting the diaplacement with formula displacement=square root of(x^2+y^2)
        int xsquare=x*x;
        int ysquare=y*y;
        float displacement=(float)Math.sqrt(xsquare+ysquare);
        return displacement;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(checkShortestPath(str));
    }
}
