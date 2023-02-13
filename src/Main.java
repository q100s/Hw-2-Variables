public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var sumOfWeights = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Two boxers weight " + sumOfWeights + " kilos");
        var weightsDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Difference between two boxers is " + weightsDifference + " kilos");
    }
    public static void task7() {
        System.out.println("Задача 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var weightsDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Difference between two boxers is " + weightsDifference + " kilos");
        var differenceOfWeights = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Difference between two boxers is " + differenceOfWeights + " kilos");
    }
    public static void task8() {
        System.out.println("Задача 8");
        var workingHours = 640;
        var hoursForOneEmployee = 8;
        var numberOfEmployees = workingHours / hoursForOneEmployee;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");
        numberOfEmployees = numberOfEmployees + 94;
        var newNumberOfWorkingHours = numberOfEmployees * hoursForOneEmployee;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + newNumberOfWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}