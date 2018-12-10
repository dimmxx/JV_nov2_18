package lesson.lesson5_10122018;

public class StrBuild {

    public static void main(String[] args) {

        String str = "";
        for (int i = 0; i < 100; i++){
            str += i;
        }
        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("1234567890123456781111111111");

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();


        StringBuilder sb1 = new StringBuilder();
        int temp = 0;

        for (int i = 0; i < 100; i++){
            int cap = sb1.capacity();
            sb1.append(i);
            System.out.println(sb1.capacity());
            if(cap != sb1.capacity()) temp += 1;
        }
        System.out.println(sb1);
        System.out.println(temp);
        System.out.println(sb1.capacity());




    }

}
