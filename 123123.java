import java.util.Scanner;

public class LearningWebsite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Добро пожаловать на обучающий сайт!");
        System.out.println("Выберите предмет для изучения:");
        System.out.println("1. Математика");
        System.out.println("2. Физика");
        System.out.println("3. История");
        
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
                System.out.println("Неправильный выбор. Попробуйте ещё раз.");
        }
    }
    
    public static void showMathLessons() {
        System.out.println("В разделе Математика доступны следующие уроки:");
        System.out.println("1. Арифметика");
        System.out.println("2. Алгебра");
        System.out.println("3. Геометрия");
    }
    
    public static void showPhysicsLessons() {
        System.out.println("В разделе Физика доступны следующие уроки:");
        System.out.println("1. Кинематика");
        System.out.println("2. Динамика");
        System.out.println("3. Термодинамика");
    }
    
    public static void showHistoryLessons() {
        System.out.println("В разделе История доступны следующие уроки:");
        System.out.println("1. Древний Восток");
        System.out.println("2. Средневековье");
        System.out.println("3. Новое время");
    }
}