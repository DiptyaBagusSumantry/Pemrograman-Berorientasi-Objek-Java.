/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan8.guided.perusahaan;

/**
 *
 * @author Asus
 */
public class Main {
     public static void main(String[] args) {

        SalariedEmployee salaried = new SalariedEmployee(500000,"Diptya","0000121", 0, 0);
        CommissionEmployee commission = new CommissionEmployee(100,"Bagus","0000122",6000000, 50000);
        ProjectPlanner project = new ProjectPlanner(10, "Sumantry","0000123",10000000, 100000);

        System.out.println("DATA SALARIED EMPLOYEE");
        salaried.cetakSE();

        System.out.println("\nDATA COMMISSION EMPLOYEE");
        commission.cetakCE();

        System.out.println("\nDATA PROJECT PLANNER");
        project.cetakPP();
        }
}
