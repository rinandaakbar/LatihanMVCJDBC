/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rinandaakbar.latihanmvcjdbc.event;

import edu.rinandaakbar.latihanmvcjdbc.entity.Pelanggan;
import edu.rinandaakbar.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Rizki Adam Kurniawan
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);
    
    
    
}
