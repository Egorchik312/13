import java.util.Scanner;

public class LearningWebsite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("����� ���������� �� ��������� ����!");
        System.out.println("�������� ������� ��� ��������:");
        System.out.println("1. ����������");
        System.out.println("2. ������");
        System.out.println("3. �������");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                showMathLessons();
                break;
            case 2:
                showPhysicsLessons();
                break;
            case 3:
                showHistoryLessons();
                break;
            default:
                System.out.println("������������ �����. ���������� ��� ���.");
        }
    }
    
    public static void showMathLessons() {
        System.out.println("� ������� ���������� �������� ��������� �����:");
        System.out.println("1. ����������");
        System.out.println("2. �������");
        System.out.println("3. ���������");
    }
    
    public static void showPhysicsLessons() {
        System.out.println("� ������� ������ �������� ��������� �����:");
        System.out.println("1. ����������");
        System.out.println("2. ��������");
        System.out.println("3. �������������");
    }
    
    public static void showHistoryLessons() {
        System.out.println("� ������� ������� �������� ��������� �����:");
        System.out.println("1. ������� ������");
        System.out.println("2. �������������");
        System.out.println("3. ����� �����");
    }
}