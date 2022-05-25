package com.yurchinho;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
// log2(x) = log(x) / log(2);                                             g

    static void Task1(int x, int y) {
        boolean bool = true;
        double f = Math.ceil((Math.pow(x, 2) + (Math.log(x) / Math.log(2)) * x * y - Math.pow(y, 2)) / (1 + Math.pow(x, 2) + Math.pow(y, 2)));

        System.out.println("F = "+ f);
    }

    static void Task2( int choice) {
        float avg = 0;
        int i = 1;
        switch(choice) {
            case 1:
            {
                for (; i <= 100; i++) {
                    if (i % 5 == 0) {
                        avg += (float) i;
                    }
                }
                avg = avg / 19;
                System.out.println(avg);
                break;
            }
            case 2:
            {
                while(i <= 100)
                {
                    if(i % 5 == 0)
                    {
                        avg += (float) i;
                    }
                    i++;
                }
                avg = avg / 19;
                System.out.println( avg);
                break;
            }
            case 3:
            {
                do {
                    if (i % 5 == 0) {
                        avg += (float) i;
                    }
                    i++;
                } while (i <= 100);
                avg = avg / 19;
                System.out.println(avg);
            }
        }
    }

    static void Task3(float x, int n) {
        float sum  = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += x / j;
            }
        }
        System.out.println("Результати обчислення:  " + Math.ceil(sum));
    }

    static void Task4() {
        double b = Math.PI;
        double dx = Math.PI / 10;

        for (double x = Math.PI * -1; x <= Math.PI; x += Math.PI / 10) {
            System.out.println("x = " + x + " f(x) = " + (5 * x + Math.sin(x)));
        }

    }



    public static void main(String[] args) {

        boolean bool = true;
        int choice = 0;

        while (bool) {
            System.out.println("Головне меню.\n\t1 - Завдання №1.\n\t2 - Завдання №2\n\t3 - Завдання №3\n\t4 - Завдання №4");
            System.out.print("Введіть цифру від 1 до 4: ");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case 1: {
                    while (true) {
                        try {
                            int x, y;
                            System.out.print("\tВведіть x: ");
                            x = in.nextInt();
                            System.out.print("\n\tВведіть y: ");
                            y = in.nextInt();
                            if(x == 0 || y == 0 || x < 0 || y < 0) throw new Exception();
                            System.out.println("\tЗадані значення цілих змінних x,y. Обчислити значення функції:");
                            Task1(x, y);
                            break;
                        } catch (Exception ex) {
                            in.skip(".*");
                            System.out.println("Некоректно введені дані! Введіть ще раз.");
                            continue;

                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("\t1 - Цикл з параметром;\n\t2 - Цикл з передумовою;\n\t3 - Цикл з післяумовою;");
                    int choice3 = in.nextInt();
                    if(choice3 == 1)
                    {
                        System.out.print("Обчислити середнє арифметичне всіх чисел, кратних 5, у діапазоні (1;100)\n");
                        Task2(choice3);
                    }
                    else if(choice3 == 2)
                    {
                        System.out.print("Обчислити середнє арифметичне всіх чисел, кратних 5, у діапазоні (1;100)\n");
                        Task2(choice3);
                    }
                    else if(choice3 == 3)
                    {
                        System.out.print("Обчислити середнє арифметичне всіх чисел, кратних 5, у діапазоні (1;100)\n");
                        Task2(choice3);
                    }
                    else System.out.println("Невірно введені дані!");

                    break;
                }
                case 3: {
                    try{
                        System.out.println("Задані натуральне число n та дійсне число x. Обчислити:");
                        int n;
                        System.out.print("\tВведіть n: ");
                        n = in.nextInt();
                        float x1;
                        System.out.print("\tВведіть x: ");
                        x1 = in.nextFloat();
                        if(n <= 0 || x1 <= 0) throw new ArithmeticException();
                        Task3(x1,n);
                        break;
                    } catch (ArithmeticException ex) {
                        in.skip(".*");
                        System.out.println("Некоректно введені дані! Введіть ще раз.");
                        continue;
                    }

                }
                case 4: {
                    System.out.println("Обчислити функцію: ");
                    System.out.println("Результат обчислення функції: ");
                    Task4();
                    break;
                }
                default: {
                    System.out.println("Введено помилкове значення!");
                }

            }
            System.out.println("Якщо хочете прожовжити або закінчити програму натисніть:\n\t1 - Якщо хочете продовжити.\n\t2 - Якщо хочете закінчити.");
            Scanner in2 = new Scanner(System.in);
            int choice2 = in2.nextInt();
            if(choice2 == 1)
            {
                bool = true;
            }
            else
            {
                bool = false;
            }
        }


    }



}

