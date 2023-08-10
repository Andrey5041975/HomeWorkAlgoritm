package lesson6;
/*
https://metanit.com/java/tutorial/3.9.php
https://developer.alexanderklimov.ru/android/java/object.php
 */
//динамические массивы
public class Lesson6 {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray(5);
        da.add(8);
        da.add(4);
        da.add(12);
        da.add(3);
        da.add(-1);
        da.add(13);
        System.out.println(da);
        da.add(2, -5);
//        System.out.println();
        System.out.println(da);
//        da.remove(3);
//        System.out.println(da);
        System.out.println(da.size());


        da.add(14);
        da.add(15);
        da.add(16);
        System.out.println(da);
        System.out.println(da.size()  );
        da.add(0,17);
        //da.add(3,18);
        System.out.println(da);
        System.out.println(da.size());

        da.add(1,18);
        da.add(2,19);
        System.out.println(da);
        System.out.println(da.size());



//        da.add(10,100);
//        System.out.println(da);
//        System.out.println(da.size());
    }


}
