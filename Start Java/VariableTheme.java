public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("1. �������� ���������� � ����� �� �������� �� ������� ");
        byte nbyte;
        nbyte = 126;
        System.out.println("nbyte = " + nbyte);
        short shorts;
        shorts = -30000;
        System.out.println("shorts = " + shorts);
        int intle;
        intle = 288472;
        System.out.println("intle = " + intle);
        long longe;
        longe = -7842424l;
        System.out.println("longe = " + longe);
        float floatw;
        floatw = 2131f;
        System.out.println("floatw = " + floatw);
        double doublin;
        doublin = 16154;
        System.out.println("doublin = " + doublin);
        char charen;
        charen = 0;
        System.out.println("charen = " + charen);
        boolean boblean;
        boblean = false;
        System.out.println("boblean = " + boblean);

        System.out.println("2. ������ ��������� ������ �� �������");
        int x = 100;
        int y = 200;
        int c = x+y;//c-��� ����� �����
        int z = c/100;//z-��� 1 ������� �� �����
        int b = z*11;//b-����� ������
        int g = 300-b;//g-����� ��������� ������� �� �������
        System.out.println("����� ������ = " + b);
        System.out.println("����� ��������� ������� �� ������� = " + g);

        System.out.println("4. ����������� min � max �������� �������� ����� ������");
        byte mbyte;
        mbyte = 127;
        mbyte++;
        mbyte--;
        System.out.println("�������������� �������� nbyte = " + mbyte);
        System.out.println("�������� ����� ���������� nbyte = " + mbyte++);
        System.out.println("�������� ����� ���������� nbyte = " + mbyte--);

        System.out.println("5. ������������ �������� ����������");
        int a;
        int l;
        a = 1;
        b = 2;
        System.out.println("�������� �������� a = " + a);
        System.out.println("�������� �������� b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("C ������� ������� ���������� a = " + a);
        System.out.println("C ������� ������� ���������� b = " + b);
        int a1;
        int b1;
        a1 = 1;
        b1 = 2;
        a1 = a1 - b1;
        b1 = a1 + b1;
        a1 = -a1 + b1;
        System.out.println("C ������� �������������� �������� a = " + a1);
        System.out.println("C ������� �������������� �������� b = " + b1);

        System.out.println("6. ����� �������� � �� �����");
        int r = 35;
        int t = 38;
        int o = 64;
        int u = 94;
        int i = 95;
        char r1 = (char) r;
        System.out.print("��� �������: " + r);
        System.out.println(" ������ " + r1);
                char t1 = (char) t;
        System.out.print("��� �������: " + t);
        System.out.println(" ������ " + t1);
                char o1 = (char) o;
        System.out.print("��� �������: " + o);
        System.out.println(" ������ " + o1);
                char u1 = (char) u;
        System.out.print("��� �������: " + u);
        System.out.println(" ������ " + u1);
                char i1 = (char) i;
        System.out.print("��� �������: " + i);
        System.out.println(" ������ " + i1);

        System.out.println("7. ������������ � ����� ���� �����");
        int number = 345;
        int sum = 0;
        int currentDigit;
        currentDigit = number % 10;
        sum += currentDigit;
        number /= 10;
        currentDigit = number % 10;
        sum += currentDigit;
        number /= 10;
        currentDigit = number % 10;
        sum += currentDigit;
        System.out.println(sum);
        double firstNum = 345/100;
        double secondNum = 345/86.25;
        double thirdNum = 345/69;
        double proizvedenie = firstNum*secondNum*thirdNum;
        System.out.println(proizvedenie);
    }
}

