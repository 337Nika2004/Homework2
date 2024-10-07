public class Main {
    public static void main(String[] args) {

        // Задача 1
        // В программе IDEA в новом созданном вами проекте присвойте:
        //переменной dog значение 8.0;//переменной cat значение 3.6;
        //переменной paper значение 763789.
        // Выведите значения каждой переменной в консоль.
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 2
        // Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.
        var dogResult = dog + 4;
        var catResult = cat + 4;
        var paperResult = paper + 4;
        System.out.println("Задача 2");
        System.out.println(dogResult);
        System.out.println(catResult);
        System.out.println(paperResult);
        // Задача 3
        // dog уменьшить на 3.5;
        // cat уменьшить на 1.6;
        // paper уменьшить на 7639.
        var dogResult1 = dog - 3.5;
        var catResult2 = cat - 1.6;
        var paperResult3 = paper - 7639;
        System.out.println("Задача 3");
        System.out.println(dogResult1);
        System.out.println(catResult2);
        System.out.println(paperResult3);
        // Задача 4
        // Инициализируйте (присвойте значение) переменную friend значением 19.
        // Увеличьте значение переменной на 2, после чего поделите значение на 7.
        //После каждой операции выводите значение переменной в консоль. В итоге у вас должно быть выведено 3 значения одной переменной.
        var friend = 19;
        System.out.println("Задача 4");
        System.out.println(friend);
        System.out.println(friend + 2);
        System.out.println((friend + 2) / 7);
        // Задача 5
        var frog = 3.5;
        System.out.println("Задача 5");
        System.out.println(frog);
        System.out.println(frog * 10);
        System.out.println(frog * 10 / 3.5);
        System.out.println((frog * 10 / 3.5) + 4);
        // Задача 6
        // В боксе перед каждым боем спортсменов взвешивают. Это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории и бой будет честным.//Масса одного боксера — 78.2 кг.
        //Масса второго боксера — 82.7 кг.
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println("Задача 6");
        System.out.println(secondBoxer - firstBoxer + " кг - разница между весами бойцов");
        // Задача 7
        // Найдите остаток от деления между двумя весами.System.out.println("Задача 7");
        System.out.println(secondBoxer % firstBoxer);
        // Задача 8
        // 640 часов работы поделено между сотрудниками.// Если каждый сотрудник посвящает работе 8 часов, то сколько всего работников в компании?
        // Выведите результат задачи в консоль в формате: «Всего работников в компании — … человек».// Посчитайте, сколько часов работы должно быть поделено между сотрудниками, если в компании работает на 94 человека больше.
        // Выведите результат задачи в консоль в формате: «Если в компании работает … человек, то всего … часов работы может быть поделено между сотрудниками».System.out.println("Задача 8");
        System.out.println( "Всего работников в компании — " + 640 / 8 + " человек" );
        System.out.println( "Если в компании работает " + ((640 / 8) + 94) + " человека, то всего " + (640 / ((640 / 8) + 94)) + " час работы может быть поделено между сотрудниками" );
    }
}