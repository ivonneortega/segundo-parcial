/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author IvonneBebe
 */
public class ViewRentas extends javax.swing.JPanel {

    /**
     * Creates new form ViewRentas
     */
    public ViewRentas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_rentas = new javax.swing.JLabel();
        jl_id_renta = new javax.swing.JLabel();
        jl_id_cliente = new javax.swing.JLabel();
        jl_id_pelicula = new javax.swing.JLabel();
        jl_costo_dia = new javax.swing.JLabel();
        jl_dias = new javax.swing.JLabel();
        jl_total_renta = new javax.swing.JLabel();
        jtf_id_renta = new javax.swing.JTextField();
        jtf_id_cliente = new javax.swing.JTextField();
        jtf_id_pelicula = new javax.swing.JTextField();
        jtf_costo_dia = new javax.swing.JTextField();
        jtf_dias = new javax.swing.JTextField();
        jtf_total_renta = new javax.swing.JTextField();
        jbtn_actualizar = new javax.swing.JButton();
        jbtn_agregar = new javax.swing.JButton();
        jbtn_borrar = new javax.swing.JButton();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();

        jl_rentas.setText("Rentas");

        jl_id_renta.setText("ID_renta");

        jl_id_cliente.setText("ID_cliente");

        jl_id_pelicula.setText("ID_pelicula");

        jl_costo_dia.setText("costo dia");

        jl_dias.setText("dias");

        jl_total_renta.setText("Total de renta");

        jtf_id_renta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_id_rentaActionPerformed(evt);
            }
        });

        jbtn_actualizar.setText("Actualizar");

        jbtn_agregar.setText("Agregar");

        jbtn_borrar.setText("Borrar");

        jbtn_primero.setText("|<");

        jbtn_anterior.setText("<");
        jbtn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_anteriorActionPerformed(evt);
            }
        });

        jbtn_siguiente.setText(">");

        jbtn_ultimo.setText(">|");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jl_rentas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_id_pelicula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_id_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_borrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_id_cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtn_agregar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtn_actualizar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_costo_dia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_costo_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_id_renta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtf_id_renta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_dias)
                                        .addGap(31, 31, 31)
                                        .addComponent(jtf_dias, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_total_renta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtf_total_renta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtn_primero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_anterior)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn_siguiente)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_ultimo)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jl_rentas)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_id_renta)
                            .addComponent(jtf_id_renta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_id_cliente)
                            .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_agregar)
                        .addGap(28, 28, 28)
                        .addComponent(jbtn_actualizar)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_id_pelicula)
                    .addComponent(jtf_id_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_borrar))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_costo_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_costo_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_primero)
                    .addComponent(jbtn_anterior))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_dias)
                    .addComponent(jtf_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_siguiente)
                    .addComponent(jbtn_ultimo))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_total_renta)
                    .addComponent(jtf_total_renta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_id_rentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_id_rentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_id_rentaActionPerformed

    private void jbtn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_anteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_anteriorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_actualizar;
    public javax.swing.JButton jbtn_agregar;
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_borrar;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    public javax.swing.JLabel jl_costo_dia;
    public javax.swing.JLabel jl_dias;
    public javax.swing.JLabel jl_id_cliente;
    public javax.swing.JLabel jl_id_pelicula;
    public javax.swing.JLabel jl_id_renta;
    public javax.swing.JLabel jl_rentas;
    public javax.swing.JLabel jl_total_renta;
    public javax.swing.JTextField jtf_costo_dia;
    public javax.swing.JTextField jtf_dias;
    public javax.swing.JTextField jtf_id_cliente;
    public javax.swing.JTextField jtf_id_pelicula;
    public javax.swing.JTextField jtf_id_renta;
    public javax.swing.JTextField jtf_total_renta;
    // End of variables declaration//GEN-END:variables
}