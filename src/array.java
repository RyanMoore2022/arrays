public class array {
    public static void main(String[] args){
    Pattern1();
    Pattern3();
    Pattern4();
    Pattern5();
    }
    public static void Pattern1(){
        int maxTimes = 5;
        for (int times = 6; times > 0; times--){
            System.out.println("******");
        }

    }

    public static void Pattern4(){
        int maxTimes = 5;
        for (int times = 6; times > 0; times--){
            System.out.println("");
            for (int j=times; j<7;j++) {
                System.out.print("*");
            }
        }

    }

    public static void Pattern3(){
        int maxTimes = 5;
        for (int times = 6; times > 0; times--) {
            System.out.println("");
            for(int j=1; j<7; j++){
                System.out.print(j);
            }
        }
    }
    public static void Pattern5(){
        int maxTimes = 5;
        int number = 1;
        for (int times = 6; times > 0; times--){
            System.out.println("");
            for (int j=times; j<7;j++) {
                System.out.print(number);
            }
        }
    }
}
