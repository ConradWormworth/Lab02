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
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }
   
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNumber = request.getParameter("firstNumber");
        String secondNumber = request.getParameter("secondNumber");
        String mathType = request.getParameter("mathType");
        int actualFirstNumber = 0;
        int actualSecondNumber = 0;
        int finalNumber = 0;
        
        request.setAttribute("firstNumber", firstNumber);
        request.setAttribute("secondNumber", secondNumber);
        try 
        { 
            // checking valid integer using parseInt() method 
            actualFirstNumber = Integer.parseInt(firstNumber); 
            actualSecondNumber = Integer.parseInt(secondNumber);
            
            if (mathType.equals("+")){
                finalNumber = (actualFirstNumber + actualSecondNumber);
            }
            
            if (mathType.equals("-")){
                finalNumber = (actualFirstNumber - actualSecondNumber);
            }
            
            if (mathType.equals("*")){
                finalNumber = (actualFirstNumber * actualSecondNumber);
            }
            
            if (mathType.equals("%")){
                finalNumber = (actualFirstNumber / actualSecondNumber);
            }
        }  
        catch (NumberFormatException e)  
        { 
            request.setAttribute("message", "Please enter a number.");
                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        } 
        
        
        // Always strings!!! Have to convert if we want primitive data
        

        
          request.setAttribute("message", "The result is " + finalNumber);
   

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);   
    }
    
}
