public class Loops {
    public static void main(String[] args){
        int count = 0;

        while (count < 3){
            System.out.println(count);
            count = count +1;
        }

        System.out.println("outside the loop");
        System.out.println("Final count:" + count);


    }
}
