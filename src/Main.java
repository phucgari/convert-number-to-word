import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter the number that you want to convert to word");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        String result = "";
        int hundred=num/100;
        int dozen=(num%100)/10;
        int unit=(num%100)%10;
        if(num>99){
            switch (hundred){
                case 1:
                    result+="one";
                    break;
                case 2:
                    result+="two";
                    break;
                case 3:
                    result+="three";
                    break;
                case 4:
                    result+="four";
                    break;
                case 5:
                    result+="five";
                    break;
                case 6:
                    result+="six";
                    break;
                case 7:
                    result+="seven";
                    break;
                case 8:
                    result+="eight";
                    break;
                case 9:
                    result+="nine";
                    break;
            }
            result+=" hundred and ";
        }
        if(dozen!=1){
            switch (dozen){
                case 2:
                    result+="twenty ";
                    break;
                case 3:
                    result+="thirty ";
                    break;
                case 4:
                    result+="forty ";
                    break;
                case 5:
                    result+="fifty ";
                    break;
                case 6:
                    result+="sixty ";
                    break;
                case 7:
                    result+="seventy ";
                    break;
                case 8:
                    result+="eighty ";
                    break;
                case 9:
                    result+="ninety ";
                    break;
            }
            switch (unit){
                case 1:
                    result+="one";
                    break;
                case 2:
                    result+="two";
                    break;
                case 3:
                    result+="three";
                    break;
                case 4:
                    result+="four";
                    break;
                case 5:
                    result+="five";
                    break;
                case 6:
                    result+="six";
                    break;
                case 7:
                    result+="seven";
                    break;
                case 8:
                    result+="eight";
                    break;
                case 9:
                    result+="nine";
                    break;
            }
        }
        if(dozen==1){
            switch(unit){
                case 0:
                    result+="ten";
                    break;
                case 1:
                    result+="eleven";
                    break;
                case 2:
                    result+="twelve";
                    break;
                case 3:
                    result+="thirteen";
                    break;
                case 4:
                    result+="fourteen";
                    break;
                case 5:
                    result+="fifteen";
                    break;
                case 6:
                    result+="sixteen";
                    break;
                case 7:
                    result+="seventeen";
                    break;
                case 8:
                    result+="eighteen";
                    break;
                case 9:
                    result+="nineteen";
                    break;
            }
        }
        System.out.println(result);
    }
}