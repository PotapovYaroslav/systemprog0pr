import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(GetSum(a, b));
    System.out.println(GetRek(a, b));
    System.out.println(GetSdwig(a, b));
    System.out.println(GetLog(a, b));
    System.out.println(GetDel(a, b));
}

public static int GetSum(int a, int b) {
    int x = 0;
    for (int i = 0; i < b; i++) {
        x += a;
    }
    return x;
}

public static int GetRek(int a, int b){
    if (b == 0){
        return 0;
    }
    return a + GetRek(a, b - 1);
}

public static int GetSdwig(int a, int b){
    int x = 0;
    while (b > 0){
        if ((b & 1) != 0){
            x += a;
        }
        a = a << 1;
        b = b >> 1;
    }
    return x;
}

public static int GetLog(int a, int b){
    double x = Math.log(a) + Math.log(b);
    double x1 = Math.pow(Math.E, x);
    int res = (int) Math.ceil(x1);
    return res;
}

public static  int GetDel(int a, int b){
    double a1 = (double) a;
    double b1 = (double) b;
    double x = a1 / (1 / b1);
    int res = (int) x;
    return res;
}




