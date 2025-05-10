/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ndzalama;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
    
         Scanner scanner= new Scanner(System.in);
         
                
         //promt for recieving user input
         System.out.println("------------");
       System.out.println("--Registration--");
         System.out.println("------------");
         System.out.print("Enter First Name: ");
         String firstname=scanner.nextLine();
         System.out.print("Enter Last Name: ");
         String lastname=scanner.nextLine();
         System.out.print("Enter Username: ");
         String username=scanner.nextLine();
         System.out.print("Enter password: ");
         String password=scanner.nextLine();
         System.out.print("Enter Phone Number(starting with South African interernational code (+27): ");
         String phoneNumber=scanner.nextLine();
         
         Login login= new Login();//creates a Login Object
                
         boolean validateUsername=login.checkUserName(username);
         boolean validatePassword=login.checkPasswordComplexity(password);
         boolean validatePhone=login.checkCellPhoneNumber(phoneNumber);
         
         //Checks and validates username
         if(validateUsername==true){
             System.out.println("Username successfully captured.");             
         }else{
             System.out.println("Username is not correctly formatte, please ensure that your username contains an underscore and is no more than five characters in length.");
         }        
         
         //Checks and validates password
         if(validatePassword==true){
             System.out.println("Password successfully captured.");
         }else{
             System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters,a capital and small letter,a number,and a special character.");
         }
                         
         //Checks and validates phone number         
         if(validatePhone=true){
             System.out.println("Cellphone number successfully added.");
         }else{
             System.out.println("Cellphone number incorrectly formatted or does not contain international code.");
         }    
          
         if(validateUsername==true && validatePassword==true && validatePhone==true){
             System.out.println("User is successfuly registerd");
         
        
         String loginUsername;
         String loginPassword;
         
         System.out.println("-----");
       System.out.println("--LOGIN--");
         System.out.println("-----");
         
         System.out.println("Enter username: ");
         loginUsername=scanner.nextLine();
         System.out.println("Enter password: ");
         loginPassword=scanner.nextLine();
         
         if(loginUsername.equals(username) && loginPassword.equals(password)){
             System.out.println("Welcome" + "," + "it is great to see you again.");
         }else{
             System.out.println("Username or password incorrect please try again.");
         }
         }else{
                 System.out.println("User registration failed!");
                 main(null);
                 }
    
        
    
                 
                 
                 }}
              
         


    

