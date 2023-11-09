public class Solution {
    public static void main (String[] args){
        int n = 3;
        String day;
        String dayType;
        switch(n){
            case 1 :
            day ="Monday";
            break;

            case 2 :
            day = "Tuesday";
            break;

            case 3:
            day="Wednesday";
            break;

             case 4:
            day="Thursday";
            break;

             case 5:
            day="Friday";
            break;

             case 6:
            day="Saturday";
            break;

             case 7:
            day="Sunday";
            break;

            default:
            day="Invalid";
        }
        switch(n){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            dayType="Weekday";
            break;
            case 6:
            case 7:
            dayType="Weekend";
            break;
            default:
            dayType="Invalid";
        }
        System.out.println(day+" is "+dayType);

int a=10; 
        do{
            a++;
            System.out.println(a);
        }while(a<=20);
    }
}

