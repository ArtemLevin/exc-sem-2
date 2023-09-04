import java.util.Scanner;

//Задача 1:
//        Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
//        Если число отрицательное или равно нулю, программа должна выбрасывать исключение
//        InvalidNumberException с сообщением "Некорректное число". В противном случае,
//        программа должна выводить сообщение "Число корректно".
public class Main {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner input = new Scanner(System.in);
        System.out.print("enter an integer: ");
        int num = input.nextInt();
        try{
            if (num <= 0){
                throw new InvalidNumberException("Entered incorrect number");
            }

            System.out.println("Entered correct number");
        }
        catch (InvalidNumberException e){
            System.out.println("Entered incorrect number");
        }
        input.close();
    }
}