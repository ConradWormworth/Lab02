/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 612944
 */
public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }
   
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String currentAge = request.getParameter("currentAge");
        int numberedAge = 0;
        
        request.setAttribute("currentAge", currentAge);
        try 
        { 
            // checking valid integer using parseInt() method 
            numberedAge = Integer.parseInt(currentAge); 
        }  
        catch (NumberFormatException e)  
        { 
            request.setAttribute("message", "Please enter a number.");
                        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        } 
        
        
        // Always strings!!! Have to convert if we want primitive data
        

        
          request.setAttribute("message", "Your age on your next birthday will be " + (numberedAge + 1));
   

        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);   
    }
    
}
