public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        int count = 0, number = 2;
        while (count<=20){
            boolean check = true;
            for(int i = 2; i<=number/2; i++){
                if(number%i==0){
                    check=false;
                }
            }
            if(check){
                System.out.print(number +" ");
                count++;
            }
            number++;

        }
    }
}
