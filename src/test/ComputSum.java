package test;

public class ComputSum {
    public static void main(String[] args) {
        System.out.println(1+2+"3"+4+"5");
        new ComputSum().sum(3, 5);
    }

    private void sum(int number, int length) {
        if (number <=9 && number >= 1) {
            long sum = 0;
            int tmp = 0;
            String ret = "";
            for(int i=0;i<length;i++) {
                tmp = tmp * 10 + number;
                sum += tmp;
                System.out.println(sum);
                ret += String.valueOf(tmp) + " + ";
                System.out.println(Integer.valueOf(tmp).toString());
            }
            System.out.println(ret);
        } else {
            System.out.println("请给出正确的数字");
        }
    }
}
