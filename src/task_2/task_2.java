package task_2;

import task_1.InvalidNumberException;

import java.util.Scanner;

//Задача 2:
//        Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. Если второе число
//        равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением
//        "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.
//
//        Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от
//        класса Exception. Это позволяет нам определить специфическую причину ошибки и передать информацию
//        об ошибке для последующей обработки.
public class task_2{
    public static void main(String[] args) throws InvalidNumberException {
        Scanner input = new Scanner(System.in);
        System.out.print("enter dividend: ");
        int dividend = input.nextInt();
        System.out.print("enter divisor: ");
        int divisor = input.nextInt();
        try{
            if (divisor == 0){
                throw new InvalidNumberException("division by zero is not allowed");
            }

            double result = dividend/divisor;
            System.out.println("division result: " + result);
        }
        catch (InvalidNumberException e){
            System.out.println("division by zero is not allowed");
        }
        input.close();
    }
}
