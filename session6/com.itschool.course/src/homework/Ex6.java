package homework;

public class Ex6 {

    public static void main(String[] args) {

        int variableTemperature = 20;

        if(variableTemperature > 30){
            System.out.println("Hot");
        }else if(variableTemperature <= 30 && variableTemperature >= 20) {
            System.out.println("Warm");
        }else if(variableTemperature < 20){
            System.out.println("Cold");
        }
    }
}
