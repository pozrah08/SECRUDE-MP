
package View;

import Model.User;
import java.awt.Color;
import java.util.ArrayList;
import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 

public class Register extends javax.swing.JPanel {

    public Frame frame;
    
    public Register() {
        initComponents();
        
        //hide messages
        userErrorMsg.setVisible(false);
        userErrorMsg1.setVisible(false);
        passwordErrorMsg.setVisible(false);
        confErrorMsg.setVisible(false);
        usernameLbl.setForeground(Color.black);
        passwordLbl.setForeground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerBtn = new javax.swing.JButton();
        usernameFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        confirmPassFld = new javax.swing.JPasswordField();
        userErrorMsg = new javax.swing.JLabel();
        passwordErrorMsg = new javax.swing.JLabel();
        confErrorMsg = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        userErrorMsg1 = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();

        registerBtn.setBackground(new java.awt.Color(0, 0, 0));
        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        passwordFld.setMinimumSize(new java.awt.Dimension(12, 45));
        passwordFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFldActionPerformed(evt);
            }
        });

        confirmPassFld.setBackground(new java.awt.Color(240, 240, 240));
        confirmPassFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirmPassFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        confirmPassFld.setMinimumSize(new java.awt.Dimension(12, 45));
        confirmPassFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassFldActionPerformed(evt);
            }
        });

        userErrorMsg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        userErrorMsg.setForeground(new java.awt.Color(204, 0, 0));
        userErrorMsg.setText("Username is already taken!");

        passwordErrorMsg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        passwordErrorMsg.setForeground(new java.awt.Color(204, 0, 0));
        passwordErrorMsg.setText("Must be at least 6 characters long!");

        confErrorMsg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        confErrorMsg.setForeground(new java.awt.Color(204, 0, 0));
        confErrorMsg.setText("Passwords do not match!");

        usernameLbl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        usernameLbl.setText("<html>Cannot contain special characters</html>");
        usernameLbl.setToolTipText("");

        userErrorMsg1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        userErrorMsg1.setForeground(new java.awt.Color(204, 0, 0));
        userErrorMsg1.setText("Must be at least 6 characters long!");

        passwordLbl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        passwordLbl.setText("<html>Must have at least one uppercase letter and a number</html>");
        passwordLbl.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameFld)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmPassFld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(passwordErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(confErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(userErrorMsg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userErrorMsg1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(userErrorMsg)
                                .addGap(30, 30, 30))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(usernameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordErrorMsg)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(passwordLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confErrorMsg))
                .addGap(46, 46, 46)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        String password1, password2, username;
        boolean foundUser, hasUppercase, hasNum, passIs6, uNameIs6, passMatch, hasSpecialChar;
        ArrayList <User> userList;
        
        //retrieving data and inputs
        username = usernameFld.getText();
        password1 = passwordFld.getText().trim();
        password2 = confirmPassFld.getText().trim();
        userList = frame.main.sqlite.getUsers();
        
        //initalizing booleans
        foundUser = false;
        hasUppercase = false;
        hasNum = false;
        passIs6 = true;
        uNameIs6 = true;
        passMatch = true;
        hasSpecialChar = false;
        
        //clearing the error messages
        userErrorMsg.setVisible(false);
        userErrorMsg1.setVisible(false);
        passwordErrorMsg.setVisible(false);
        confErrorMsg.setVisible(false);
        usernameLbl.setForeground(Color.black);
        
        //check if username has special characters
        char[] usernameArray = username.toCharArray();
         for(int i = 0; i < usernameArray.length; i++){
            if(usernameArray[i] < 48 || //48 - 57 is equal to 0 - 9 in ascii
                 (usernameArray[i] > 57 && usernameArray[i] < 65) || //65 - 90 is uppercase characters
                    (usernameArray[i] > 90 && usernameArray[i] < 97) || // 97 - 122 is lowercase characters
                        usernameArray[i] > 122){  //special characters
                hasSpecialChar = true;
                usernameLbl.setForeground(Color.red);
            }
        }
         
        //check if username already exists
        for(int i = 0; i < userList.size(); i++){
            if(username.equalsIgnoreCase(userList.get(i).getUsername())){
                foundUser = true;
                userErrorMsg.setVisible(true);
                break; // break out of loop
            }
        }
        
        //check if passwords match
        if(!password1.equals(password2)){
            passMatch = false;
            confErrorMsg.setVisible(true);
            System.out.println("Password 1 (" + password1 + ") Password 2(" + password2 + ")");
        }
        
        //verifying password validity
        char[] passwordArray = password1.toCharArray();
        for(int i = 0; i < passwordArray.length; i++){
            if(passwordArray[i] > 64 && passwordArray[i] < 91){ //check if the password has an uppercase character
                hasUppercase = true;
            }
 
            if(passwordArray[i] > 47 && passwordArray[i] < 58){ // check if the password has a number
                hasNum = true;
            }
        }
        
        if(!hasUppercase || !hasNum){
            usernameLbl.setForeground(Color.red);
        }
        
        if(username.length() < 6){
            uNameIs6 = false;
            userErrorMsg1.setVisible(true);
        }
        
        if(password1.length() < 6){
            passIs6 = false;
            passwordErrorMsg.setVisible(true);
        }
        
        if(!foundUser && passMatch && hasUppercase && hasNum && uNameIs6 && passIs6 && !hasSpecialChar){
            frame.registerAction(usernameFld.getText(), password1);
            System.out.println("===REGISTER SUCCESSFUL===");
            System.out.println("Username: " + username);
            System.out.println("Password: " + password1);
            
             //clearing fields
            usernameFld.setText("");
            passwordFld.setText("");
            confirmPassFld.setText("");
        
            //clearing the error messages
            userErrorMsg.setVisible(false);
            userErrorMsg1.setVisible(false);
            passwordErrorMsg.setVisible(false);
            confErrorMsg.setVisible(false);
            usernameLbl.setForeground(Color.black);
            passwordLbl.setForeground(Color.black);
            
            
            frame.loginNav();
        }           
        
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        //clearing fields
        usernameFld.setText("");
        passwordFld.setText("");
        confirmPassFld.setText("");
        
        //clearing the error messages
        userErrorMsg.setVisible(false);
        userErrorMsg1.setVisible(false);
        passwordErrorMsg.setVisible(false);
        confErrorMsg.setVisible(false);
        usernameLbl.setForeground(Color.black);
        passwordLbl.setForeground(Color.black);
        
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed

    private void passwordFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFldActionPerformed

    private void confirmPassFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPassFldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel confErrorMsg;
    private javax.swing.JPasswordField confirmPassFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passwordErrorMsg;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel userErrorMsg;
    private javax.swing.JLabel userErrorMsg1;
    private javax.swing.JTextField usernameFld;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}
