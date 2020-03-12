public class Arrayrecap {


    //      We are able to store multiple variables in the array.

    //          Array is not collection

    public static void main(String[] args) {
        int[] i1 = new int[5];
        int[] i2 = new int[]{1, 2, 3, 4, 5};
        //        array is a fixed size

        String[] s1 = new String[]{"newJersey", "boston", "atlanta", "newJersey"};
        //change boston to newyork

        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals("boston")) {
                s1[i] = "newyork";
            }
        }
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }


//         Count Number Of Words In The String

        String s2 = "Count the words in the String";

        //        first solution
        String[] s3 = s2.split(" ");

        System.out.println("s2.length is here solution 1 = " + s3.length);


        //      create one int array and store variables 2 , 4, 5 ,6
//              sum all the numbers in the array

        int[] i4 = new int[]{2,4,5,6};

        int total = 0;
        for(int i = 0 ; i<i4.length ;i++){

            total = total + i4[i];
//            total += i4[i];

        }

        System.out.println("total of the array = " + total);

        System.out.println("------------------------");


        //      create one int array   2,6,8,7,5,2
//         if the number is odd sum it if the number is even minus it

        int[] int1 = new int[]{2,6,8,7,5,2};

        int result = 0 ;

        for(int i = 0 ; i<int1.length ; i++){

            if(int1[i]%2==1){

                result += int1[i];

            }else{

                result -= int1[i];
            }

        }

        System.out.println("if odd sum if even minus result ==   "+result);

//      Create one String ="44335566"
//           sum all the numbers

        String mystr="44335566";

        char[] numberChar = mystr.toCharArray();

        int total1 = 0 ;

        for(int i = 0 ; i< numberChar.length ; i++){

            total1 += Integer.parseInt( String.valueOf( numberChar[i] ) );

        }

        System.out.println(total1);

//         create int array  -      2,5,40 ,70 ,95, 98
//                   prints two numbers in that array whose sum equals to 100?
//                      If there are more than 1 pair , print all.

        System.out.println("------------------");

        int[] int2 = new int[]{2,5,40 ,70 ,95, 98};
        for(int i = 0 ;i<int2.length/2 ; i++){
            for(int j = 0 ; j<int2.length ;j++){

                if(int2[i] + int2[j] == 100) {
                    System.out.println( int2[i] + " " + int2[j] + " = " + 100 );
                }
            }

        }



    }





}
