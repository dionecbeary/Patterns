public class PatternMaker {
    public static void main(String[] args) {
        PatternMaker stripes = new PatternMaker();
    }
    public PatternMaker(){
        pattern10();
    }
    public void pattern1(){
        for (int x = 0; x < 6; x++){
            System.out.println(x*5);
        }
    }
    public void pattern2(){
        for (int x = 0; x < 6; x++){
            System.out.println(2+x*5);
        }
    }
    public void pattern3(){
        for (int i = 21; i > 0; i= i-4){
            System.out.print(i+"\t");
        }
    }
    public void pattern4(){
        int num = 1;
        for (int i = 3; i < 15; i = i+2){
            System.out.print(num +"\t");
            num = num + i;
        }
    }
    public void pattern5(){
        for (int a = 0; a < 4; a++){
            for (int b = 0; b < 4; b++){
                System.out.print(b + 1);
            }
            System.out.println();
        }
    }
    public void pattern6(){
        for (int x = 0; x < 5; x++){
            for (int y = 0; y < x; y++){
                System.out.print(" ");
            }
            System.out.println(x+ 1);
        }
    }
    public void pattern7(){
        for (int x = 0; x < 5; x++){
            for (int y = 5-x ; y > 0;y--){
                System.out.print(x + 1);
            }
            System.out.println();
        }
    }
    public void pattern8(){
        for (int x = 0; x < 5; x ++){
            for (int z = 0; z < x; z ++ ){
                System.out.print(" ");
            }
            for (int y = 5-x ; y > 0;y--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern9(){
        for (int x = 8; x > -9; x = x-2){
            int n = Math.abs(x);
            for (int a = 0; a < (n/2) +1; a ++){
                System.out.print(" ");
            }
            for (int b = 0; b < 9-n; b ++){
                System.out.print("*");
            }
            for (int a = 0; a < (n/2) +1; a ++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public void pattern10(){
        //UNFINISHED
        for (int x = 4; x > -5; x --){
            int n = 4 - Math.abs(x);
            for (int y = 0; y < n; y ++){
                System.out.print(" ");
            }
            if (x != 0){
                System.out.print("*");
                for (int m = 0; m < 7 - 2*n; m ++){
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (x == 0){
                System.out.print("*");
            }
            for (int y = 0; y < n; y ++){
                System.out.print(" ");
            }
            System.out.println();
        }
//        for (int x = 9; x > -10; x = x-2) {
//            int n = Math.abs(x);
//            for (int y = 0; y > (9 - n)/2; y++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int z = 0; z > n - 2; z++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int y = 0; y > (9 - n)/2; y++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
    }
    public void pattern11(){
        for (int i = 0; i < 5; i ++ ){
            for (int n = 0; n < i+1; n ++ ){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public void pattern12(){
        for (int i = 0; i < 5; i ++ ){
            for (int n = 0; n < i+1; n ++ ){
                System.out.print("#");
            }
            for (int m = 0; m < 4 - i; m ++){
                System.out.print(" ");
            }
            for (int m = 0; m < 4 - i; m ++){
                System.out.print(" ");
            }
            for (int n = 0; n < i+1; n ++ ){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
