import java.util.*;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight:");
        Double weight = sc.nextDouble();
        System.out.println("Enter your height:");
        Double height = sc.nextDouble();
        Double Bmical = weight/(height*height);
        System.out.printf("Your BMI is :%2f\n",Bmical);
        if(Bmical<15){
            System.out.println("Under weight");
        }else if(Bmical>=15 && Bmical <=25){
            System.out.println("Normal weight");
        }else if(Bmical >=26 && Bmical<=35){
            System.out.println("Over weight");
        }else{
            System.out.println("Overr weight");
        }
    }
}
