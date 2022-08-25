public class Main
{
    public static void printIt(String arr){
        int sum=0;
        for(int i=0;i<arr.length();i++){
            char a = (char)arr.charAt(i);
            if(a=='I'){
                sum++;
            }
            else if(a=='V'){
                sum+=5;
            }
            else if(a=='X'){
                sum+=10;
            }else if(a=='L'){
                sum+=50;
            }else if(a=='C'){
                sum+=100;
            }else if(a=='D'){
                sum+=500;
            }else if(a=='M'){
                sum+=1000;
            }
            
        }
        System.out.println(sum);
    }
	public static void main(String[] args) {
		String arr="LVIII";
		printIt(arr);
	}
}
