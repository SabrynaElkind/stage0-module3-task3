package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1, linkToFirst = 1;
        int second = 10, linkToSecond = 10;
        int third = 100, linkToThird = 100;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


        first = 15;
        second = 6;
        third = 4;


        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
    }
}
