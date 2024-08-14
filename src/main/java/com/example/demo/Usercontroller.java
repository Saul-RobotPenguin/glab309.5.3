package com.example.demo;




import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import model.User;


@Controller
public class Usercontroller {

/*This method demonstrates the use @ModelAttribute annotation at the method level.
  * This method creates a list and returns a list of countries
  * @return list of countries
  */
@ModelAttribute("countries")
public ArrayList <String> getUserCountries() {
   ArrayList <String> countries = new ArrayList<>();
   countries.add("UK");
   countries.add("USA");
   countries.add("Japan");

   return countries;
}

/* This method is the variation of the above method. It will accept a model and save values in this model. These saved values will be available on the frontend to the custom  */
@ModelAttribute
public void getUsers (Model model)
{
   User u1 = new User(1,"haseeb","haseeb@gmail.com");
   User u2 = new User(2,"Josph","Josph@gmail.com");
   User u3 = new User(3,"Ameer","Ameer@gmail.com");
   List <User> myuser = new ArrayList<>();
   myuser.add(u1);
   myuser.add(u2);
   myuser.add(u3);
   model.addAttribute("myuserAttribute", myuser);
}
}



