import java.util.*;
public class averagefunction {
    public static void printAverage(double a, double b, double c) {
    double average = (a+b+c)/3;
    System.out.println(average);
    return;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    printAverage(a,b,c);
    sc.close();
}
}   
