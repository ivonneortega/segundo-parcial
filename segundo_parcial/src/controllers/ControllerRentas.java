/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.sql.SQLException;
import models.ModelRentas;
import views.ViewRentas;
/**
 *
 * @author IvonneBebe
 */
public class ControllerRentas {
    private ModelRentas model_rentas;
    private ViewRentas view_rentas;
    
    public ControllerRentas(ModelRentas model_rentas, ViewRentas view_rentas) {
        this.model_rentas = model_rentas;
        this.view_rentas = view_rentas;
        this.view_rentas.jbtn_primero.addActionListener(e -> jbtn_primero_clic());
        this.view_rentas.jbtn_siguiente.addActionListener(e -> jbtn_siguiente_clic());
        this.view_rentas.jbtn_anterior.addActionListener(e -> jbtn_anterior_clic());
        this.view_rentas.jbtn_ultimo.addActionListener(e -> jbtn_ultimo_clic());
        this.view_rentas.jbtn_agregar.addActionListener(e -> jbtn_agregar_clic());
        this.view_rentas.jbtn_borrar.addActionListener(e -> jbtn_borrar_clic());
        this.view_rentas.jbtn_actualizar.addActionListener(e -> jbtn_actualizar_clic());
        initView();
}
    
    
    public void getValores() {

        view_rentas.jtf_id_renta.setText(" " + model_rentas.getId_renta());
        view_rentas.jtf_id_cliente.setText(" " + model_rentas.getId_cliente());
        view_rentas.jtf_id_pelicula.setText(" " + model_rentas.getId_pelicula());
        view_rentas.jtf_costo_dia.setText(" " + model_rentas.getCosto_dia());
        view_rentas.jtf_dias.setText(" " + model_rentas.getDias());
        view_rentas.jtf_total_renta.setText(" " + model_rentas.getTotal_renta());
    }

    public void setValores() {
        //model_rentas.setId_renta(Integer.parseInt(view_rentas.jtf_id_renta.getText()));
       model_rentas.setId_cliente(Integer.parseInt(view_rentas.jtf_id_cliente.getText()));
       model_rentas.setId_pelicula(Integer.parseInt(view_rentas.jtf_id_pelicula.getText()));
       model_rentas.setCosto_dia(Integer.parseInt(view_rentas.jtf_costo_dia.getText()));
       model_rentas.setDias(Integer.parseInt(view_rentas.jtf_dias.getText()));
       model_rentas.setTotal_renta(Integer.parseInt(view_rentas.jtf_total_renta.getText()));
    }

   

    public void jbtn_agregar_clic() {
        setValores();
        model_rentas.agregar();
        getValores();

    }

    public void jbtn_actualizar_clic() {
        setValores();
        model_rentas.actualizar();
        getValores();

    }

    public void jbtn_borrar_clic() {
        setValores();
        model_rentas.borrar();
        getValores();
    }

    public void jbtn_primero_clic() {
        model_rentas.moverPrimero();
        getValores();
    }

    public void jbtn_ultimo_clic() {
        model_rentas.moverUltimo();
        getValores();
    }

    public void jbtn_siguiente_clic() {
        model_rentas.moverSiguiente();
        getValores();
    }

    public void jbtn_anterior_clic() {
        model_rentas.moverAnterior();
        getValores();
    }

    public void initView() {
        view_rentas.setVisible(true);
        model_rentas.Conectar();
        model_rentas.moverPrimero();
        getValores();
    }
}
