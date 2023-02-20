package sem4;
//1. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        int num = 0;

        while (true){
            System.out.println();
            System.out.println("Введите строку: ");
            String inputString = in.nextLine();


            if (inputString.length() == 0) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }

            if (inputString.equals("print")){
                for (int i = 0; i < wordsList.size(); i++) {
                    System.out.println(wordsList.get(i));
                }
                continue;
            }

            if(inputString.equals("revert")){
                wordsList.removeFirst();
                continue;
            }

            if(inputString.equals("stop")){
                break;
            }

            else{
                wordsList.addFirst(inputString);
            }
        }
    }
    }

