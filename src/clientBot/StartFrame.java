package clientBot;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class StartFrame extends javax.swing.JFrame
{

    private static final long serialVersionUID = 1L;
    private ImageIcon ico;
    private Socket soc;

    public StartFrame ()
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //will set the default installed l&F as windows Native
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
        {
            Logger.getLogger(StartFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();

    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        portNumber = new javax.swing.JLabel();
        serverStart = new javax.swing.JButton();
        ipAddrsField = new javax.swing.JTextField();
        portField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        serverPass = new javax.swing.JLabel();
        passField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crpyton Server");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Enter IP :");

        portNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        portNumber.setText("Enter Port :");

        serverStart.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        serverStart.setText("Connect");
        serverStart.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                serverStartActionPerformed(evt);
            }
        });

        ipAddrsField.setToolTipText("Please enter dot (.) separated IPv4 address only !");
        ipAddrsField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ipAddrsFieldActionPerformed(evt);
            }
        });

        portField.setToolTipText("Please change if the Port you entered is not available !");
        portField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                portFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("(10-65535)");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Universal Socket Client");

        serverPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        serverPass.setText("Password");

        passField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                passFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portNumber)
                            .addComponent(serverPass)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serverStart)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3))
                                .addComponent(passField))
                            .addComponent(ipAddrsField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ipAddrsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(portNumber)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverPass)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(serverStart)
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void serverStartActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_serverStartActionPerformed
    {//GEN-HEADEREND:event_serverStartActionPerformed

        String IpValidator = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern ptrn = Pattern.compile(IpValidator);
        String ipv4 = ipAddrsField.getText();
        Matcher mtch = ptrn.matcher(ipv4);
        boolean isValidated = true;
        int port = 0;
        try
        {
            port = Integer.parseInt(portField.getText());
        }
        catch (NumberFormatException e)
        {
            isValidated = false;
            if (portField.getText().isEmpty())
            {
                isValidated = false;
                JOptionPane.showMessageDialog(this, "Port or IP can't be left Empty", "Input Error", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Port can only be a Number", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (port < 10 | port >= 65536)
        {
            isValidated = false;
            System.out.println("Enter port within range chewtiye");
            JOptionPane.showMessageDialog(this, "Port isn't in the range specified", "Value Error", JOptionPane.WARNING_MESSAGE);
        }

        if (!mtch.matches())
        {
            isValidated = false;
            JOptionPane.showMessageDialog(this, "Please Enter a valid IP\nA valid IP is in the range of\n255.255.255.255 (0-255)", "Value Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
                soc = new Socket(ipv4, port);
            }
            catch (IOException ex)
            {
                isValidated = false;
                JOptionPane.showMessageDialog(rootPane, "The host you're trying to connect is not up\n"
                        + "or not responding to the client requests at\n"
                        + "the moment please recheck the credentials\n"
                        + "or retry after sometime !", "Connection Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (isValidated) //means true (by default)
        {
            dispose();
            new clientBot.ChatConsole(ipv4, port).setVisible(true);
            //do whatever the heck here as this is the place where everthing is checked and verified
            System.out.println("IP is " + ipv4 + " port is " + port);

        }

    }//GEN-LAST:event_serverStartActionPerformed

    private void portFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_portFieldActionPerformed
    {//GEN-HEADEREND:event_portFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portFieldActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_passFieldActionPerformed
    {//GEN-HEADEREND:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void ipAddrsFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ipAddrsFieldActionPerformed
    {//GEN-HEADEREND:event_ipAddrsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipAddrsFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main (String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new StartFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ipAddrsField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField passField;
    private javax.swing.JTextField portField;
    private javax.swing.JLabel portNumber;
    private javax.swing.JLabel serverPass;
    private javax.swing.JButton serverStart;
    // End of variables declaration//GEN-END:variables
}
