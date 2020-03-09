package edu.infnet.patrimonio.controller;

import edu.infnet.patrimonio.negocio.dao.PatrimonioDAO;
import edu.infnet.patrimonio.negocio.modelo.Patrimonio;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "editar-patrimonio", urlPatterns = "/editar")
public class EditarPatrimonioServlet extends HttpServlet {

    private PatrimonioDAO patrimonioDAO;

    public EditarPatrimonioServlet() {
        this.patrimonioDAO = new PatrimonioDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        Patrimonio patrimonio = patrimonioDAO.find(id);

        req.setAttribute("patrimonio", patrimonio);

        req.getRequestDispatcher("pages/editar-patrimonio.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String descricao = req.getParameter("descricao");
        String localizacao = req.getParameter("localizacao");

        Patrimonio patrimonio = patrimonioDAO.find(id);

        patrimonio.setDescricao(descricao);
        patrimonio.setLocalizacao(localizacao);

        patrimonioDAO.edit(patrimonio);

        resp.sendRedirect(req.getContextPath());
    }
}
