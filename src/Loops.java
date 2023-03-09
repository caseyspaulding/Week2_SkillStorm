public class Loops {
    public static void main(String[] args){
        int count = 0;

        while (count < 3){
            System.out.println(count);
            count = count +1;
        }

        System.out.println("outside the loop");
        System.out.println("Final count:" + count);
        // same code
       // count = count + 1;
        //count += 1;
        // or count++; // post fix increment
        // works for all the operations
        // +=
        // -=
        // /=
        // *=
        // %=

        // variable = variable <operation> <equation>

        count = 0;
        while( count < 2) {
            System.out.println("\n******** Array Loop " + (count+1) +"********");
            loopThroughArray();
            count++;
        }
        loopThroughArray();
        String[] cookies = {"Choco chip",
                            "Oatmeal",
                            "Suger"};
        loopStrings(cookies);
    }

    public static void loopStrings(String[] cArray){
        int i = 0;
        System.out.println("Yesterday I ate a:  ");
        while (i< cArray.length){
            String temp = cArray[i] + " cookie";

            System.out.println(temp);
            i += 1;

        }

    }
//    mynumber1 = 0;
//    while (myNumber < myArray.length) {
//        System.out.println(myArray[myNumber++]);
//    }

    public static void loopThroughArray(){
        int[] nums = {23, 7, 13, 4, 15, 67, 42, 54, 45, 81 };
        int i = 0;

        // generalizes redundant steps
        while(i < nums.length){
            System.out.println(nums[i]);
            i++;
            // Same as i = i + 1;
        }
    }

}
