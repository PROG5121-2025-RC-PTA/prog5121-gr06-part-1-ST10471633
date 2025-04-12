/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ndzalama;

import javax.lang.model.SourceVersion;

public class Login {

    public Login(){
    
    
    }   
   public boolean checkUserName(String username){
       
      if(username.contains("_") && username.length() <=5){
          return true;
      }else{
       return false;   
      }
   }
  public boolean checkPasswordComplexity(String password){
 
    String capital=".*[A-Z]*."; //Checks capital letters
    String small=".*[a-z]*.";  //Checks small letters
    String special=".*[!@#$%^&*(),.?\":{}|<>]*."; //Checks special letters
    String digit=".*[\\d]*."; //Checks digital characters
    
    if(password.length()>=8 && password.matches(capital) && password.matches(small) && password.matches(special) && password.matches(digit)){
      return true;       
    }else{
        return false;
    }}

   

public boolean checkCellPhoneNumber(String phone){

   String saCode="+27";
   String firstThreeChar= phone.substring(0,3);// gets index from index 0 to 2 (inclusive)

   int fourthDigit= Character.getNumericValue(phone.charAt(3));
   if(phone.length() <=12 && firstThreeChar.equals(saCode) && fourthDigit <=8){
     return true;
}
else{
    return false;
}
}

public  String registerUser(String username, String password, String phone){
  

   boolean validateUsername=checkUserName(username);
   boolean validatePassword=checkPasswordComplexity(password);
   boolean validatePhone= checkCellPhoneNumber(phone);

  if(validatePhone== true && validateUsername==true && validatePassword==true){
   return("User is successfully registered");
   }else{
    return("User registration failed!!");
}
}

public boolean loginUser(String username, String password){
    boolean validUsername=checkUserName(username);
    boolean validPassword=checkPasswordComplexity(password);
    
    if(validUsername==true && validPassword==true){
        return true;
    }else{
        return false;
    }
}

public String returnLoginStatus(String username,String password){
    boolean validUsername= checkUserName(username);
    boolean validPassword= checkPasswordComplexity(password);
    
    if(validUsername==true && validPassword==true){
        return "A successful login";
    }else{
        return"A failed login";
    }
}

 }         
   
       
   
   


