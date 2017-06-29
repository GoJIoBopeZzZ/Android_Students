package com.innopolis.android.androidstudents;

import android.content.Intent;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import Models.ContactType;
import Models.Contacts;
import Models.Passport;
import Models.Student;

import static Models.Sex.FEMALE;
import static Models.Sex.MALE;

/**
 * Created by _red_ on 28.06.17.
 */

public class StudentsCloneFactory {
    private static StudentsCloneFactory studentsCloneFactory;
    private static List<Student> studentsList;

    private StudentsCloneFactory() {
        studentsList = new ArrayList<>(100);
        Contacts contacts = new Contacts();
        contacts.add(ContactType.ADDRESS, "Домашний адрес студента");
        contacts.add(ContactType.EMAIL, "student@email.ru");
        contacts.add(ContactType.SKYPE, "studentsSkype");
        contacts.add(ContactType.VK, "http://vk.ru/StudentsVK");
        contacts.add(ContactType.TELEGRAM, "@StudentTelegram");
        contacts.add(ContactType.FACEBOOK, "Facebook");
        contacts.add(ContactType.GOOGLE_PLUS, "Google+");
        contacts.add(ContactType.TWITTER, "Twitter");

        for (int i = 0; i < 20; i++)
            switch (i) {
                case 0: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", MALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.a));
                    break;
                case 1: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", FEMALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.b));
                    break;
                case 2: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", MALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.c));
                    break;
                case 3: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", FEMALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.d));
                    break;
                case 4: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", MALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.e));
                    break;
                case 5: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", FEMALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.f));
                    break;
                case 6: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", MALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.g));
                    break;
                case 7: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", FEMALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.h));
                    break;
                case 8: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", MALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.i));
                    break;
                case 9: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", FEMALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.j));
                    break;
                case 10: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", MALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.k));
                    break;
                case 11: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", FEMALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.l));
                    break;
                case 12: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", MALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.m));
                    break;
                case 13: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", FEMALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.n));
                    break;
                case 14: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", MALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.o));
                    break;
                case 15: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", FEMALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.p));
                    break;
                case 16: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", MALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.q));
                    break;
                case 17: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", FEMALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.r));
                    break;
                case 18: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", MALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.s));
                    break;
                case 19: studentsList.add(new Student("Имя №" + i, "Фамилия №" + i, "Отчество №" + i,
                        "18.11.1990", FEMALE, new Passport(String.valueOf(i), String.valueOf(i)),
                        Long.valueOf(i), contacts, R.drawable.t));
                    break;
                default: break;
            }

    }

    public static List<Student> getCloneList() {
        if(studentsCloneFactory == null){
            studentsCloneFactory = new StudentsCloneFactory();
        }
        return studentsList;
    }
}
