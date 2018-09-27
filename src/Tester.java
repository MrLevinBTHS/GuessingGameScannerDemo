public class Tester {

    public static void main(String[] args)
    {
        //String substring, indexOf

        String str1 = "uncanny";
        int num = str1.indexOf("can");
        str1 = str1.substring(num+3);

        System.out.println(str1);

        //length

        String str2 = "alphabet";
        int length = str2.length();
        for(int i = 0; i<length-3; i++)
        {
            str2 = str2.substring(1, str2.length());
        }
        System.out.println(str2);


        //while loops, double division

        double x  = 1000.0;
        int y = 10;
        while(y < x)
        {
            x = x/20;
        }
        System.out.println(x);

        String str4 = "abalone";
        String str5 = "kiwifruit";

        while (str4.compareTo(str5) < 0)
        {
            str4 = str4.substring(1);
            str5 = str5.substring(1);
        }
        System.out.println(str4);
        System.out.println(str5);


        int num1 = 1;
        int num2 = 150;
        for (int i = 0; num1<100 && num2>100; i++)
        {
            num1 += i;
            num2 -= 1;
        }
        System.out.println(num1);
        System.out.println(num2);
        double a  = 1234.0;
        double b = 10.0;
        while (a>1.0)
        {
            a = a/b;
            System.out.println("a : " + a);
        }

        int var1 = 0;
        int var2 = 2;
        while((var2!=0) && (var1/var2)>=0)
        {
            var1++;
            var2--;
        }
        System.out.println(var1);
        System.out.println(var2);




    }
}
