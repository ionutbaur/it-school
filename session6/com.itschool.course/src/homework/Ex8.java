package homework;

public class Ex8 {

    public static void main(String[] args) {

        int a = 12;
        System.out.println("The factors are: ");

        for(int i = 1; i <= a ; i++){
            if(a % i == 0){
                System.out.println(i + " ");
            }
        }


    }
}
