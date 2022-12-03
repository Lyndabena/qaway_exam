package problems.math;

public class FindLowestDifference {
    /*
     *
     * consider these below two arrays (array1 and array2)
     * find the lowest difference between the two arrays cells
     * hint: the lowest difference between cells is 1
     *
	 */

    public static void main(String[] args) {

        int[] array1 = {28, 10, 4, 5, 6, 20};
        int[] array2 = {15, 22, 43, 42, 15};
        int x=100;

        for (int A : array1){
            for (int B : array2){
                if (A>B){
                    if ((A-B)<x)
                        x=A-B;
                }else{
                    if((B-A)<x)
                        x=B-A;
                }
            }

        }
        System.out.println("the lowest difference between cells is "+x);

    }
}
