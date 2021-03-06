/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rinandaakbar.latihanmvcjdbc.service;

import edu.rinandaakbar.latihanmvcjdbc.entity.Pelanggan;
import edu.rinandaakbar.latihanmvcjdbc.error.PelangganException;
import java.util.List;
import javafx.scene.input.KeyCode;

/**
 *
 * @author
 * Nama     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 * Kelas    : PBOUlang
 */
public interface PelangganDao {

    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;

    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;

    public void deletePelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(String email) throws PelangganException;

    public List<Pelanggan> selectAllPelanggan() throws PelangganException;

    public void deletePelanggan(KeyCode keyCode);

    public void deletePelanggan();
}
