/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan6.guided.projectspeak;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Dog guffy = new Dog();
        Duck donald = new Duck();
        MorleySafer morley = new MorleySafer();
        Owl woodsy = new Owl();
        
        guffy.nama = "Guffy";
        donald.nama = "DOnald";
        morley.nama = "Morley Safer";
        woodsy.nama = "woodsy";
           
        System.out.println("First we'll  get the dog to speak");
        guffy.speak();
        System.out.println("");
        
        System.out.println("First we'll  get the duck to speak");
        donald.speak();
        System.out.println("");
        
        System.out.println("First we'll  get the morley to speak");
        morley.speak();
        System.out.println("");
        
        System.out.println("First we'll  get the owl to speak");
        woodsy.speak();
        System.out.println("");
        
        System.out.println("Sleep");
        guffy.sleep();
        donald.sleep();
        morley.sleep();
        woodsy.sleep();

    }
}
