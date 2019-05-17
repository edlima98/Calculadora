/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import operacoes.MetodosOperacionais;
import javax.swing.JOptionPane;

public class TelaCalculadora extends javax.swing.JFrame{

    public TelaCalculadora() {
        initComponents();
    }
    double n1, n2;
    int op;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        B6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Soma = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        AC = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        Divisao = new javax.swing.JButton();
        RaizQuadrada = new javax.swing.JButton();
        Exponecial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        B0 = new javax.swing.JButton();
        txt_tela = new javax.swing.JTextField();
        Result = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        Multiplicacao = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        Subtracacao = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setLocation(new java.awt.Point(700, 300));
        setResizable(false);

        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        B6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B6KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText(" R = √");

        Soma.setText("+");
        Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SomaActionPerformed(evt);
            }
        });
        Soma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SomaKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("X = X²");

        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        B1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B1KeyPressed(evt);
            }
        });

        AC.setText("AC");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });
        AC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ACKeyPressed(evt);
            }
        });

        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        B2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B2KeyPressed(evt);
            }
        });

        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        B3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B3KeyPressed(evt);
            }
        });

        Divisao.setText("/");
        Divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisaoActionPerformed(evt);
            }
        });

        RaizQuadrada.setText("√");
        RaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaizQuadradaActionPerformed(evt);
            }
        });

        Exponecial.setText("X²");
        Exponecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExponecialActionPerformed(evt);
            }
        });
        Exponecial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ExponecialKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("   CALCULADORA DO MEU ÓDIO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });
        B0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B0KeyPressed(evt);
            }
        });

        txt_tela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telaActionPerformed(evt);
            }
        });
        txt_tela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_telaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telaKeyTyped(evt);
            }
        });

        Result.setText("=");
        Result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultActionPerformed(evt);
            }
        });
        Result.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ResultKeyPressed(evt);
            }
        });

        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        B7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B7KeyPressed(evt);
            }
        });

        Multiplicacao.setText("*");
        Multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacaoActionPerformed(evt);
            }
        });

        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        B8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B8KeyPressed(evt);
            }
        });

        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        B9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B9KeyPressed(evt);
            }
        });

        Subtracacao.setText("-");
        Subtracacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtracacaoActionPerformed(evt);
            }
        });

        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        B4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B4KeyPressed(evt);
            }
        });

        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        B5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B5KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Exponecial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Soma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Subtracacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Multiplicacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_tela)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tela, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Soma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subtracacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Exponecial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void txt_telaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telaActionPerformed
    }//GEN-LAST:event_txt_telaActionPerformed
    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        txt_tela.setText(txt_tela.getText() + "1");
    }//GEN-LAST:event_B1ActionPerformed
    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        txt_tela.setText(txt_tela.getText() + "2");
    }//GEN-LAST:event_B2ActionPerformed
    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        txt_tela.setText(txt_tela.getText() + "3");
    }//GEN-LAST:event_B3ActionPerformed
    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        txt_tela.setText(txt_tela.getText() + "4");
    }//GEN-LAST:event_B4ActionPerformed
    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        txt_tela.setText(txt_tela.getText() + "5");
    }//GEN-LAST:event_B5ActionPerformed
    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        txt_tela.setText(txt_tela.getText() + "6");
    }//GEN-LAST:event_B6ActionPerformed
    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        txt_tela.setText(txt_tela.getText() + "7");
    }//GEN-LAST:event_B7ActionPerformed
    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        txt_tela.setText(txt_tela.getText() + "8");
    }//GEN-LAST:event_B8ActionPerformed
    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        txt_tela.setText(txt_tela.getText() + "9");
    }//GEN-LAST:event_B9ActionPerformed
    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        txt_tela.setText(txt_tela.getText() + "0");
    }//GEN-LAST:event_B0ActionPerformed
    private void SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SomaActionPerformed
        n1 = Double.parseDouble(txt_tela.getText());
        txt_tela.setText("");
        op = 1;
    }//GEN-LAST:event_SomaActionPerformed
    private void SubtracacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtracacaoActionPerformed
        n1 = Double.parseDouble(txt_tela.getText());
        txt_tela.setText("");
        op = 2;
    }//GEN-LAST:event_SubtracacaoActionPerformed
    private void MultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacaoActionPerformed
        n1 = Double.parseDouble(txt_tela.getText());
        txt_tela.setText("");
        op = 3;
    }//GEN-LAST:event_MultiplicacaoActionPerformed
    private void DivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisaoActionPerformed
        n1 = Double.parseDouble(txt_tela.getText());
        txt_tela.setText("");
        op = 4;
    }//GEN-LAST:event_DivisaoActionPerformed
    private void RaizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaizQuadradaActionPerformed
        op = 5;
    }//GEN-LAST:event_RaizQuadradaActionPerformed

    private void ExponecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExponecialActionPerformed
        MetodosOperacionais c = new MetodosOperacionais();
        n1 = Double.parseDouble(txt_tela.getText());
        txt_tela.setText("");
        txt_tela.setText(String.valueOf(c.exponecial(n1)));
    }//GEN-LAST:event_ExponecialActionPerformed
    private void ResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultActionPerformed
        MetodosOperacionais c = new MetodosOperacionais();
        n2 = Double.parseDouble(txt_tela.getText());
        switch (op) {
            case 1:
                txt_tela.setText(String.valueOf(c.soma(n1, n2)));
                break;
            case 2:
                txt_tela.setText(String.valueOf(c.subtracao(n1, n2)));
                break;
            case 3:
                txt_tela.setText(String.valueOf(c.multiplicacao(n1, n2)));
                break;
            case 4:
                txt_tela.setText(String.valueOf(c.divisao(n1, n2)));
                break;
            case 5:
                n1 = Double.parseDouble(txt_tela.getText());
                txt_tela.setText("");
                txt_tela.setText(String.valueOf(c.raiz(n1)));
                break;
        }
    }//GEN-LAST:event_ResultActionPerformed
    private void B1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B1KeyPressed
        System.out.println(evt.getKeyCode());
        if (evt.getKeyCode() == 97) {
            JOptionPane.showMessageDialog(this, "1");
        }
    }//GEN-LAST:event_B1KeyPressed
    private void B2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B2KeyPressed
    }//GEN-LAST:event_B2KeyPressed
    private void B3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B3KeyPressed
    }//GEN-LAST:event_B3KeyPressed
    private void B4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B4KeyPressed
    }//GEN-LAST:event_B4KeyPressed
    private void B5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B5KeyPressed
    }//GEN-LAST:event_B5KeyPressed
    private void B6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B6KeyPressed
    }//GEN-LAST:event_B6KeyPressed
    private void B7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B7KeyPressed
    }//GEN-LAST:event_B7KeyPressed
    private void B8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B8KeyPressed
    }//GEN-LAST:event_B8KeyPressed
    private void B9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B9KeyPressed
    }//GEN-LAST:event_B9KeyPressed
    private void B0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B0KeyPressed
    }//GEN-LAST:event_B0KeyPressed
    private void ResultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResultKeyPressed
    }//GEN-LAST:event_ResultKeyPressed
    private void SomaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SomaKeyPressed
    }//GEN-LAST:event_SomaKeyPressed
    private void txt_telaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telaKeyPressed
        /*======================== BOTÕES FISICOS ========================*/

        if (evt.getKeyChar() == 127) {
            n1 = 0;
            n2 = 0;
            txt_tela.setText("");
        }
        if (evt.getKeyChar() == 8) {

        }
        /*======================== Operadores ========================*/

        if (evt.getKeyCode() == 107) {
            n1 = Double.parseDouble(txt_tela.getText());
            txt_tela.setText("");
            op = 1;
        }
        if (evt.getKeyCode() == 109) {
            n1 = Double.parseDouble(txt_tela.getText());
            txt_tela.setText("");
            op = 2;
        }
        if (evt.getKeyCode() == 106) {
            n1 = Double.parseDouble(txt_tela.getText());
            txt_tela.setText("");
            op = 3;
        }
        if (evt.getKeyCode() == 111) {
            n1 = Double.parseDouble(txt_tela.getText());
            txt_tela.setText("");
            op = 4;
        }
        if (evt.getKeyCode() == 88) {
            MetodosOperacionais c = new MetodosOperacionais();
            n1 = Double.parseDouble(txt_tela.getText());
            txt_tela.setText("");
            txt_tela.setText(String.valueOf(c.exponecial(n1)));
        }
        if (evt.getKeyCode() == 82) {
            op = 5;
        }

        /*======================== Resultado ========================*/
        if (evt.getKeyCode() == 10) {
            MetodosOperacionais c = new MetodosOperacionais();
            n2 = Double.parseDouble(txt_tela.getText());
            switch (op) {
                case 1:
                    txt_tela.setText(String.valueOf(c.soma(n1, n2)));
                    break;
                case 2:
                    txt_tela.setText(String.valueOf(c.subtracao(n1, n2)));
                    break;
                case 3:
                    txt_tela.setText(String.valueOf(c.multiplicacao(n1, n2)));
                    break;
                case 4:
                    txt_tela.setText(String.valueOf(c.divisao(n1, n2)));
                    break;
                case 5:
                    n1 = Double.parseDouble(txt_tela.getText());
                    txt_tela.setText("");
                    txt_tela.setText(String.valueOf(c.raiz(n1)));
                    break;
            }
        }

    }//GEN-LAST:event_txt_telaKeyPressed
    private void txt_telaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telaKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_telaKeyTyped
    private void ExponecialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExponecialKeyPressed
    }//GEN-LAST:event_ExponecialKeyPressed
    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        n1 = 0;
        n2 = 0;
        txt_tela.setText("");
    }//GEN-LAST:event_ACActionPerformed
    private void ACKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ACKeyPressed
    }//GEN-LAST:event_ACKeyPressed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton Divisao;
    private javax.swing.JButton Exponecial;
    private javax.swing.JButton Multiplicacao;
    private javax.swing.JButton RaizQuadrada;
    private javax.swing.JButton Result;
    private javax.swing.JButton Soma;
    private javax.swing.JButton Subtracacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_tela;
    // End of variables declaration//GEN-END:variables
}