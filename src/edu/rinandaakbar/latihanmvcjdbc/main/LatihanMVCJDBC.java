/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rinandaakbar.latihanmvcjdbc.main;

import edu.rinandaakbar.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.rinandaakbar.latihanmvcjdbc.entity.Pelanggan;
import edu.rinandaakbar.latihanmvcjdbc.error.PelangganException;
import edu.rinandaakbar.latihanmvcjdbc.service.PelangganDao;
import edu.rinandaakbar.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author
 * Nama     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 * Kelas    : PBOUlang
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws edu.rinandaakbar.latihanmvcjdbc.error.PelangganException
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
     
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanMVCJDBC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

}
