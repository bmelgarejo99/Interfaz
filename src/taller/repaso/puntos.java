/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.repaso;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class puntos extends javax.swing.JFrame {

    /**
     * Creates new form puntos
     */
    public puntos() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TALLER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.setToolTipText("BOTONES");

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("BOTONES");

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setText("PUNTO 1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 51));
        jButton3.setText("PUNTO 2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setText("PUNTO 3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setText("PUNTO 4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setText("PUNTO 5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 0));
        jButton7.setText("PUNTO 6");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 0));
        jButton8.setText("PUNTO 7");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 0));
        jButton9.setText("PUNTO 8");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 0));
        jButton10.setText("PUNTO 9");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(44, 44, 44)
                                .addComponent(jButton5)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8)
                            .addComponent(jButton9)
                            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(45, 45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton8))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton9))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton7)
                    .addComponent(jButton10))
                .addContainerGap(46, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        segundo();     
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       cuarto();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       septimo();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         primero();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           tercero();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
             quinto();        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          sexto(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
          octavo();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         noveno();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new puntos().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
 public static void primero()
    {
        Scanner miEscaner= new Scanner (System.in);
        int a;
        int b, c;
        
        System.out.println("digite el primer numero");
        a= miEscaner.nextInt();
        System.out.println("digite el otro numero");
        b= miEscaner.nextInt();
     
       System.out.println(" la suma de " + a + "+" + b + "" + " es" );
       System.out.println(a + b);
       System.out.println(" la resta " + a + "-" + b + "" + " es"  );
       System.out.println(a - b);
    }
    
    public static void segundo()
    {
        Scanner elEscaner = new Scanner (System.in);
        
        int op;
        
        System.out.println("elija una opcion\n");
        System.out.println("1. leon");
        System.out.println("2. liebre");
        System.out.println("3. cerdo");
        System.out.println("4. aguila");
        System.out.println("5. gato");
        
        op = elEscaner.nextInt();
        
        if(op==1)
        {
            System.out.println("el genero de este animal es carnivoro y salvaje");
        }
        
        if (op==2)
        {
            System.out.println("el genero de este animal es herbivoro y es salvaje");
        }
        
         if (op==3)
        {
            System.out.println("el genero de este animal es omnivoro y es domestico");
        }
         
          if (op==4)
        {
            System.out.println("el genero de este animal es carnivoro y es salvaje");
        }
          
           if (op==5)
        {
            System.out.println("el genero de este animal es carnivoro y es domestico");
        }
           
        if (op!=1 && op!=2 && op!=3 && op!=4 && op!=5 )
          {
              System.out.println("esta opcion no esta disponible");
          }
        
        
    }
    
    public static void tercero()
    {
       int op;
       double b,c;
       
        op= Integer.parseInt(JOptionPane.showInputDialog(null, "digite el numero de la nota que quiere ver"));
       
       
        switch(op)
        {
            case 1:
            JOptionPane.showMessageDialog(null, "LA NOTA ES SOL");  
            break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "LA NOTA ES SI");
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null,"LA NOTA ES RE");
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null,"LA NOTA ES FA");
                break;
                
            case 5:
                JOptionPane.showMessageDialog(null,"LA NOTA ES LA");
                break;
                
            case 6:
                JOptionPane.showMessageDialog(null,"LA NOTA ES MI");
                break;
                
            case 7:
                JOptionPane.showMessageDialog(null,"LA NOTA ES DO");
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"LA OPCION NO TIENE NOTA MUSICAL");
                
        }
        
    }
    
    public static void cuarto()
    {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "digite el numero hasta el cual quiere conocer la secuencia"));
        
        for(int i = 0; i <= num; i++)
        {
            JOptionPane.showMessageDialog(null, i);
        }
    }
    
    public static void quinto()
    {
          int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "digite el numero hasta el cual quiere conocer la secuencia de 3 en 3"));
        
        for(int i = 0; i <= num; i+=3)
        {
            JOptionPane.showMessageDialog(null, i);
        }
    }
    
    public static void sexto()
    {
          int num;
          float valor;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "digite el numero el cual quiere saber si es par o inpar"));
        
        valor = num%2;
        
        if(valor==0)
        {
            JOptionPane.showMessageDialog(null, "el numero " + num + " es par");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "el numero " + num + " es impar");
        }
    }
    
    public static void septimo()
    {
        int num, fe=0;
        int valor1=1;
        int valor2,i=1;
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "digite el numero hasta el cual quiere conocer la secuencia de finonacci"));
        
        while(i <= num)
        {
            if(i<num)
            { 
              valor2 = fe;
              fe = valor1 + fe;
              valor1 = valor2;
              JOptionPane.showMessageDialog(null,"" + valor1);
            }
           i ++;  
        }
    }
    
    public static void octavo()
    {
        int num1; 
        int num2 = 7;
          int inte=3;
     for(int i=1; i<=inte; i++)
       {  
           num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE EL NUMERO DE CONTRASEÑA"));
            
            if(num1==num2)
            {
                JOptionPane.showMessageDialog(null,"ACCESO PERMITIDO");
                JOptionPane.showMessageDialog(null,"BIENVENIDO");
                return;
            }
            else
                JOptionPane.showMessageDialog(null,"ACCESO DENEGADO");
        }
    }
    
    public static void noveno()
    {
        //IMPRIMIR SOLO LOS NUMEROS PARES DE LA SECUENCIA
        
      int num=0;
      num = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE EL NUMERO DEL QUE QUIERE CONOCER LA SECUENCIA DE SUS PARES ANTERIORES"));
       for( int i = 0; i <= num; i++)
       {
          if(i%2==0)
          {
              JOptionPane.showMessageDialog(null, i);
          }
       }
       
    }
}
