package edu.infnet.patrimonio.negocio.dao;

import edu.infnet.patrimonio.negocio.modelo.Patrimonio;

public class PatrimonioDAO extends JpaDAO<Patrimonio, String> {
    public PatrimonioDAO() {
        super(Patrimonio.class);
    }
}
