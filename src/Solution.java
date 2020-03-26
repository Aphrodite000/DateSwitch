import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int year=sc.nextInt();
            int mon=sc.nextInt();
            int date=sc.nextInt();
            int day=0;
            if(year<=0||mon<=0||mon>12||date<=0||date>31){
                System.out.println(-1);
                break;
            }
            for(int i=1;i<mon;i++){
                if( i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12 ){
                    day+=31;
                }else if(i==4||i==6||i==9||i==11){
                    day+=30;
                }else if(i==2&&(year%4==0&&year%100!=0||year%400==0)){
                    day+=29;
                }else{
                    day+=28;
                }
            }
            day=date+day;
            System.out.println(day);
        }
    }

}
