/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.produto;

import com.mycompany.dao.DaoCategoria;
import com.mycompany.dao.DaoMarca;
import com.mycompany.dao.DaoProduto;
import com.mycompany.ferramentas.DadosTemporarios;
import com.mycompany.modelo.ModCategoria;
import com.mycompany.modelo.ModProduto;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arthur.7923
 */
public class ListProduto extends javax.swing.JFrame {

    /**
     * Creates new form ListProduto
     */
    public ListProduto() {
        initComponents();
        setLocationRelativeTo(null);
        
        listarTodos();
        
    }
    
    public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String id_categoria = resultSet.getString(2);
                String id_marca = resultSet.getString(3);
                String nome = resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, id_categoria, id_marca, nome, descricao, preco});
            }
        }catch(Exception e){
            
        }
    }
    
    public void listarPorId(int pId){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();

            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorId(pId);
            
            defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String id = resultSet.getString(1);
                String id_categoria = resultSet.getString(2);
                String id_marca = resultSet.getString(3);
                String nome = resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, id_categoria, id_marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorCategoria(String pCategoria){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();

            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorCategoria(pCategoria);
            
            defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String id = resultSet.getString(1);
                String id_categoria = resultSet.getString(2);
                String id_marca = resultSet.getString(3);
                String nome = resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, id_categoria, id_marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorMarca(String pMarca){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();

            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
                ResultSet resultSet = daoProduto.listarPorMarca(pMarca);
            
            defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String id = resultSet.getString(1);
                String id_categoria = resultSet.getString(2);
                String id_marca = resultSet.getString(3);
                String nome = resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, id_categoria, id_marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNome(String pNome){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();

            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
                ResultSet resultSet = daoProduto.listarPorNome(pNome);
            
            defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String id = resultSet.getString(1);
                String id_categoria = resultSet.getString(2);
                String id_marca = resultSet.getString(3);
                String nome = resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, id_categoria, id_marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorDescricao(String pDescricao){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorDescricao(pDescricao);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorPrecoMaiorQue(Double pPreco){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorPrecoMaiorQue(pPreco);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorPrecoMenorQue(Double pPreco){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorPrecoMenorQue(pPreco);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorPrecoIgualA(Double pPreco){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorPrecoIgualA(pPreco);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
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

        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduto = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "CATEGORIA", "MARCA", "NOME", "DESCRICAO", "PRECOMAIORQUE", "PRECOMENORQUE", "PRECOIGUALA", " " }));

        tableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID_CATEGORIA", "ID_MARCA", "NOME", "DESCRIÇÃO", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduto);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutoMouseClicked
        try{
            if (evt.getClickCount() == 2){
                ModProduto modProduto = new ModProduto();

                modProduto.setid(Integer.parseInt(String.valueOf(tableProduto.getValueAt(tableProduto.getSelectedRow(), 0))));
                
                modProduto.setnome(String.valueOf(tableProduto.getValueAt(tableProduto.getSelectedRow(), 3)));
                modProduto.setdescricao(String.valueOf(tableProduto.getValueAt(tableProduto.getSelectedRow(), 4)));
                
                DaoCategoria daoCategoria = new DaoCategoria();
                ResultSet resultSetCategoria = daoCategoria.listarPorNome(String.valueOf(tableProduto.getValueAt(tableProduto.getSelectedRow(), 1)));

                int id_categoria = -1;
                while(resultSetCategoria.next())
                    id_categoria = resultSetCategoria.getInt("ID");

                modProduto.setid_categoria(id_categoria);
                
                DaoMarca daoMarca = new DaoMarca();
                
                ResultSet resultSetMarca = daoMarca.listarPorNome(String.valueOf(tableProduto.getValueAt(tableProduto.getSelectedRow(), 1)));

                int id_marca = -1;
                while(resultSetMarca.next())
                    id_marca = resultSetMarca.getInt("ID");

                modProduto.setid_marca(id_marca);
                
                DadosTemporarios.tempObject = (ModProduto) modProduto;

                CadProduto cadProduto = new CadProduto();
                cadProduto.setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tableProdutoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorId(Integer.parseInt(tfFiltro.getText()));
                break;
            case 2:
                listarPorCategoria(tfFiltro.getText());
                break;
            case 3:
                listarPorMarca(tfFiltro.getText());
                break;
            case 4:
                listarPorNome(tfFiltro.getText());
                break;
            case 5:
                listarPorDescricao(tfFiltro.getText());
                break;
            case 6:
                listarPorPrecoMaiorQue(Double.parseDouble(tfFiltro.getText()));
                break;
            case 7:
                listarPorPrecoMenorQue(Double.parseDouble(tfFiltro.getText()));
                break;
            case 8:
                listarPorPrecoIgualA(Double.parseDouble(tfFiltro.getText()));
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
            java.util.logging.Logger.getLogger(ListProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tableProduto;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
