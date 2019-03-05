package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {

	// recupere la valeur d'un parametre dont le nom est avecPhoto
	String Matricule = req.getParameter("Matricule");
	String titre = req.getParameter("titre");
	String nom = req.getParameter("nom");
	String prenom = req.getParameter("prenom");
	


	// code HTML ecrit dans le corps de la reponse
	resp.getWriter().write("<h1>Edition de collaborateur</h1>"
	+ "<ul>"
	+ "<li>Matricul="+ Matricule + "</li>"
    +"<li>titre="+ titre + "</li>"
    +"<li>nom="+ nom + "</li>"
    +"<li>prenom="+ prenom + "</li>"
	+ "</ul>"); 
	}
	}
