package com.spring.project.ProjectSpring;

public class Calc {
    Long myMethod ( String dzialania, Long liczba1, Long liczba2){
        if (dzialania.equals("dodawanie")){
            return liczba1+liczba2;
        }else if (dzialania.equals("odejmowanie")){
            return liczba1-liczba2;
        }else if (dzialania.equals("mnozenie")) {
            return liczba1 * liczba2;
        }else return liczba1;
    }
}
