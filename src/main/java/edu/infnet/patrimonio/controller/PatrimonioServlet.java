package edu.infnet.patrimonio.controller;

import edu.infnet.patrimonio.negocio.dao.PatrimonioDAO;
import edu.infnet.patrimonio.negocio.modelo.Patrimonio;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

// TODO: Adicionar schema da tabela
// TODO: Adicionar README.md
@WebServlet(name = "patrimonio", urlPatterns = "")
public class PatrimonioServlet extends HttpServlet {

    private PatrimonioDAO patrimonioDAO;

    public PatrimonioServlet() {
        this.patrimonioDAO = new PatrimonioDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Patrimonio> patrimonios = patrimonioDAO.findAll();

        req.setAttribute("lista_patrimonios", patrimonios);

        req.getRequestDispatcher("pages/patrimonio.jsp")
                .forward(req, resp);
    }

}
