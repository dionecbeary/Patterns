public class PatternMaker {
    public static void main(String[] args) {
        PatternMaker stripes = new PatternMaker();
    }
    public PatternMaker(){
        pattern6();
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
}
