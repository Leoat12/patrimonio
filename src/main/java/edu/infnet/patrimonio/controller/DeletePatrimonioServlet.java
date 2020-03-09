package edu.infnet.patrimonio.controller;

import edu.infnet.patrimonio.negocio.dao.PatrimonioDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "deletar-patrimonio", urlPatterns = "/deletar/*")
public class DeletePatrimonioServlet extends HttpServlet {

    private PatrimonioDAO patrimonioDAO;

    public DeletePatrimonioServlet() {
        this.patrimonioDAO = new PatrimonioDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        String[] pathParts = pathInfo.split("/");
        String id = pathParts[1];

        patrimonioDAO.delete(id);

        resp.sendRedirect(req.getContextPath());
    }
}
