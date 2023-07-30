import java.util.Arrays;

public class Lesson4_Home {

    public static void main(String[] args) {
        //
        int[] arr = {1, 2, 8, 10, 5, 15, 3, 9};
        int[] src = {7, 5, 1, 3, 2, 4, 6};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int [] mergeSort(int[] src)
    {
        if (src.length <=1) return src;
        int[] left = Arrays.copyOfRange(src, 0, src.length / 2);
        int[] right = Arrays.copyOfRange(src, left.length, src.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right)
    {
        int resIn = 0, leftIn = 0, rightIn = 0;
        int res[] = new int[left.length + right.length];


        while (leftIn < left.length && rightIn < right.length)
            if (left[leftIn] < right[rightIn])
                res[resIn++] = left[leftIn++];
            else res[resIn++] = right[rightIn++];

        while (resIn < res.length)
            if (leftIn != left.length)
                res[resIn++] = left[leftIn++];
        else res[resIn++] = right[rightIn++];

        return res;
    }

}
