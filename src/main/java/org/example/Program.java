package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
        С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом и продолжаем погружаться в ООП.
Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.

Например:
Должен быть класс Задачи (общий/родительский и подтипы)
У задачи должно быть длительность, дедлайн, приоритет, тема, ответсвенный... - параметры на Ваше усмотрение
**У задачи должна быть возможность включить или выключить нотификацию на разные события, например, приближение дедлайна.

Должен быть класс Календарь, в который можно добавлять Задачи.
*** При пересечении задач по времени - выводить сообщение пользователю.

**** Должна быть возможность выгрузки Календаря в файл (тип на Ваше усмотрение)
**** Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора и др
         */
public class Program {
    static Calendar<Task> calendar = new Calendar<>();
            public static void startInitTask() {

                calendar.addTask(new Task("Go to dentist", Priority.longTerm,
                        LocalDateTime.of(2023, 2, 13, 15, 0),
                        LocalDateTime.of(2023, 2, 6, 17, 0)));
                calendar.addTask(new Task("Do Homework 4 OOP", Priority.basic,
                        LocalDateTime.of(2023, 2, 2, 14, 0),
                        LocalDateTime.of(2023, 2, 9, 11, 0)));
                calendar.addTask(new Task("Buy new charge", Priority.urgent,
                        LocalDateTime.of(2023, 2, 21, 14, 0),
                        LocalDateTime.of(2023, 2, 21, 20, 0)));

            }

            public static void showAllTasks() {
                calendar.showAllTask();
            }

            public static void addNewTask() {
                Priority priority = Priority.basic;
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter the title of task: ");
                String title = sc1.nextLine();
                LocalDateTime start = createDate("Date start:").atStartOfDay();
                LocalDateTime end = createDate("Date end:").atStartOfDay();
                calendar.addTask(new Task(title, priority, start, end));
                }

            public static void deleteTask() {
                showAllTasks();
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Enter number of the task to delete: ");
                int num = sc2.nextInt();
                calendar.deleteTask((Task) calendar.getTasks().get(num - 1));
                System.out.println("Successfully deleted");
            }


            private static LocalDate createDate(String str) {
                System.out.println(str);
                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Enter date (дд.мм.гггг): ");
                String day = sc3.nextLine();

                return LocalDate.parse(day, df);
            }
        }