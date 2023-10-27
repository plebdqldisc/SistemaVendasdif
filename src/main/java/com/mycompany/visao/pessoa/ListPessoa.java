/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.pessoa;

import com.mycompany.dao.DaoCliente;
import com.mycompany.dao.DaoEndereco;
import com.mycompany.dao.DaoEstadoCivil;
import com.mycompany.dao.DaoPessoa;
import com.mycompany.ferramentas.DadosTemporarios;
import com.mycompany.ferramentas.Formularios;
import com.mycompany.modelo.ModCliente;
import com.mycompany.modelo.ModEndereco;
import com.mycompany.modelo.ModPessoa;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arthur.7923
 */
public class ListPessoa extends javax.swing.JFrame {

    /**
     * Creates new form ListPessoa
     */
    public ListPessoa() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
    }
    
    public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String num_Resid = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, num_Resid, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorId(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorId(Integer.parseInt(tfFiltro.getText()));
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String num_Resid = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, num_Resid, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorRua(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorRua(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String num_Resid = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, num_Resid, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarCep(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorCep(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String num_Resid = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, num_Resid, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNumeroResidencia(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorNumeroResidencia(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String num_Resid = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, num_Resid, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNome(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorNome(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String num_Resid = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, num_Resid, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorSobrenome(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorSobrenome(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String num_Resid = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, num_Resid, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorGenero(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorGenero(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String num_Resid = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, num_Resid, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorTelefone(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorTelefone(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String num_Resid = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, num_Resid, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorEmail(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorEmail(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String num_Resid = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, num_Resid, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorEstadoCivil(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorEstadoCivil(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String num_Resid = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, num_Resid, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePessoa = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "RUA", "CEP", "NUM_RESID", "NOME", "SOBRENOME", "GENERO", "TELEFONE", "EMAIL", "ESTADO_CIVIL" }));
        jcbTipoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoFiltroActionPerformed(evt);
            }
        });

        tablePessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CIDADE", "RUA", "CEP", "NUM_RESIDENCIA", "NOME", "SOBRENOME", "GENERO", "TELEFONE", "EMAIL", "ESTCIVIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePessoaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablePessoa);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablePessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePessoaMouseClicked
        try{
            if (evt.getClickCount() == 2){
                //Pega os dados da pessoa
                ModPessoa modPessoa = new ModPessoa();

                modPessoa.setId(Integer.parseInt(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 0))));
//                modPessoa.setIdEndereco(Integer.parseInt(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 1))));
//                modPessoa.setIdEstadoCivil(Integer.parseInt(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 2))));;;
                modPessoa.setNome(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 5)));
                modPessoa.setSobrenome(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 6)));
                modPessoa.setGenero(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 7)));
                modPessoa.setTelefone(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 8)));
                modPessoa.setEmail(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 9)));
                
                //
                DaoEndereco daoEndereco = new DaoEndereco();
                ResultSet resultSet = daoEndereco.listarPorId(Integer.parseInt(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 0).toString()));

                int id_endereco = -1;
                while(resultSet.next())
                    id_endereco = resultSet.getInt("ID");

                modPessoa.setIdEndereco(id_endereco);
                //
                
                //
                DaoEstadoCivil daoEstadoCivil = new DaoEstadoCivil();
                resultSet = daoEstadoCivil.listarPorNome(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 10)));

                int id_estadocivil = -1;
                while(resultSet.next())
                    id_estadocivil = resultSet.getInt("ID");
                
                modPessoa.setIdEstadoCivil(id_estadocivil);
                //
                
                //Pega os dados do endereço
                ModEndereco modEndereco = new ModEndereco();
                
                modEndereco.setrua(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 2)));
                modEndereco.setcep(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 3)));
                modEndereco.setnum_resid(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 4)));
                //
                
                //
                DaoCliente daoCliente = new DaoCliente();
                resultSet = daoCliente.listarporId_pessoa(Integer.parseInt(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 0))));

                ModCliente modCliente = new ModCliente();
                
                int id_cliente = -1;
                while(resultSet.next())
                    id_cliente = resultSet.getInt("ID");
                
                modCliente.setId(id_cliente);
                //
                
                DadosTemporarios.tempObject = (ModPessoa) modPessoa;
                DadosTemporarios.tempObject2 = (ModEndereco) modEndereco;
                DadosTemporarios.tempObject3 = (ModCliente) modCliente;
                
                CadPessoa cadPessoa = new CadPessoa();
                cadPessoa.setVisible(true);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_tablePessoaMouseClicked

    private void jcbTipoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoFiltroActionPerformed

    }//GEN-LAST:event_jcbTipoFiltroActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Formularios.listPessoa = null;
    }//GEN-LAST:event_formWindowClosed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorId();
                break;
            case 2:
                listarPorRua();
                break;
            case 3:
                listarCep();
                break;
            case 4:
                listarPorNumeroResidencia();
                break;
            case 5:
                listarPorNome();
                break;
            case 6:
                listarPorSobrenome();
                break;
            case 7:
                listarPorGenero();
                break;
            case 8:
                listarPorTelefone();
                break;
            case 9:
                listarPorEmail();
                break;
            case 10:
                listarPorEstadoCivil();
                break;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tablePessoa;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
