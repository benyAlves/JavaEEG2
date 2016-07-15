/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.curso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mz.curso.model.Presenca;

/**
 *
 * @author bernardo
 */

@WebServlet(name = "done", urlPatterns = {"/done"}) 
public class NewServlet extends HttpServlet {
    List<String> numeros = new ArrayList<>();
    
    Presenca p = new Presenca(new Date(), numeros);
    
    @Override
   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
//       resp.addHeader("Content-type", "text/html");
//       resp.getWriter().print("<form method='POST'><input type='text'/><button type='submit'>Submeter</button></form>");
   }
   
   @Override
   public void doPost(HttpServletRequest rq, HttpServletResponse resp) throws IOException, ServletException{
      String numero = rq.getParameter("numero");
      
  
      
		if (!isPresente(numero)) {
                        numeros.add(numero);
			  rq.getRequestDispatcher("done.html").forward(rq, resp);
//                        resp.sendRedirect("done.html");
		} else {
                        rq.getRequestDispatcher("error.html").forward(rq, resp);
//                        resp.sendRedirect("error.html");
		}     
      
   }

    private boolean isPresente(String num) {
        for(int i=0; i<numeros.size(); i++){
            String numP = numeros.get(i);
            if(Objects.equals(num, numP))
                return true;
        }
        return false;
    }

}
