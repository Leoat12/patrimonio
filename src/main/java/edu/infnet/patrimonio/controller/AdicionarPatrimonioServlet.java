package edu.infnet.patrimonio.controller;

import edu.infnet.patrimonio.negocio.dao.PatrimonioDAO;
import edu.infnet.patrimonio.negocio.modelo.Patrimonio;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "adicionar-patrimonio", urlPatterns = "/adicionar")
public class AdicionarPatrimonioServlet extends HttpServlet {

    private PatrimonioDAO patrimonioDAO;

    public AdicionarPatrimonioServlet() {
        this.patrimonioDAO = new PatrimonioDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pages/adicionar-patrimonio.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String descricao = req.getParameter("descricao");
        String localizacao = req.getParameter("localizacao");

        patrimonioDAO.save(Patrimonio.builder().id(id).descricao(descricao).localizacao(localizacao).build());

        resp.sendRedirect(req.getContextPath());
    }
}
