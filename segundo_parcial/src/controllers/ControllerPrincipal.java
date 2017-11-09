/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import models.*;
import views.*;
import controllers.*;
/**
 *
 * @author IvonneBebe
 */
public class ControllerPrincipal {
    ModelPrincipal model_principal;
    ModelPeliculas model_peliculas;
    ModelClientes model_clientes;
    ViewPeliculas view_peliculas;
    ViewClientes view_clientes;
    ViewPrincipal view_principal;
    ControllerPeliculas controller_peliculas;
    ControllerClientes controller_clientes;
    
    
    public ControllerPrincipal(ModelPrincipal model_principal, Object views[]) {
        this.model_principal = model_principal;
        this.view_principal = (ViewPrincipal) views[1];
        this.view_peliculas = (ViewPeliculas) views[0];
        this.view_clientes = (ViewClientes) views[2];
        view_principal.jmi_peliculas.addActionListener(e -> jmi_peliculasActionPerformed());
        view_principal.jmi_clientes.addActionListener(e -> jmi_clientesActionPerformed());
        initView();
    }
    
      public void jmi_peliculasActionPerformed(){
        this.view_principal.setContentPane(view_peliculas);
        this.view_principal.revalidate();
        this.view_principal.repaint();
    }
    
         public void jmi_clientesActionPerformed(){
        this.view_principal.setContentPane(view_clientes);
        this.view_principal.revalidate();
        this.view_principal.repaint();
    }
    
    public void initView(){
        this.view_principal.setLocationRelativeTo(null);
        view_principal.setVisible(true);
    }
     
     
    
}
