
package View;

import Model.User;
import java.awt.Color;
import java.util.ArrayList;

public class Register extends javax.swing.JPanel {

    public Frame frame;
    
    public Register() {
        initComponents();
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

        registerBtn.setBackground(new java.awt.Color(255, 255, 255));
        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
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

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmPassFld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameFld, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmPassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        String password1, password2, username;
        boolean foundUser, hasUppercase, hasNum, hasSymbol, passIs6, uNameIs6, passMatch, usernameSpecialChar;
        ArrayList <User> userList;
        
        //retrieving data and inputs
        username = Security.cleanString(usernameFld.getText());
        password1 = Security.cleanString(passwordFld.getText().trim());
        password2 = Security.cleanString(confirmPassFld.getText().trim());
        userList = frame.main.sqlite.getUsers();
        
        //initalizing booleans
        foundUser = false;
        hasUppercase = false;
        hasNum = false;
        hasSymbol = false; //for password
        passIs6 = true;
        uNameIs6 = true;
        passMatch = true;
        usernameSpecialChar = false;
        
        //clearing the error messages
//        userErrorMsg.setVisible(false);
//        userErrorMsg1.setVisible(false);
//        passwordErrorMsg.setVisible(false);
//        confErrorMsg.setVisible(false);
//        usernameLbl.setForeground(Color.black);
//        passwordLbl.setForeground(Color.black);
        
        //check if username has special characters
        char[] usernameArray = username.toCharArray();
         for(int i = 0; i < usernameArray.length; i++){
            if(!(Character.isDigit(usernameArray[i])) && !(Character.isLetter(usernameArray[i]))){  //special characters
                usernameSpecialChar = true;
//                usernameLbl.setForeground(Color.red);
            }
        }
         
        //check if username already exists
        for(int i = 0; i < userList.size(); i++){
            if(username.equalsIgnoreCase(userList.get(i).getUsername())){
                foundUser = true;
//                userErrorMsg.setVisible(true);
                break; // break out of loop
            }
        }
        
        //check if passwords match
        if(!password1.equals(password2)){
            passMatch = false;
//            confErrorMsg.setVisible(true);
            System.out.println("Password 1 (" + password1 + ") Password 2(" + password2 + ")");
        }
        
        //verifying password validity
        char[] passwordArray = password1.toCharArray();
        for(int i = 0; i < passwordArray.length; i++){
            if(Character.isUpperCase(passwordArray[i])){ //check if the password has an uppercase character
                hasUppercase = true;
            }
 
            if(Character.isDigit(passwordArray[i])){ // check if the password has a number
                hasNum = true;
            }
            
            if(password1.matches("(.*)[-+_!@#$%^&*.,?](.*)")){ //check if the password has a symbol
                hasSymbol = true;
            }
        }
        
//        if(!hasUppercase || !hasNum){
//            passwordLbl.setForeground(Color.red);
//        }
//        
//        ENFORCE MAX LENGTH OF USERNAME AND PASSWORD
        if(username.length() < 6 && username.length() > 50){
            uNameIs6 = false;
//            userErrorMsg1.setVisible(true);
        }
        
        if(password1.length() < 6 && password1.length() > 50){
            passIs6 = false;
//            passwordErrorMsg.setVisible(true);
        }
        
        if(!foundUser && passMatch && hasUppercase && hasNum && uNameIs6 && passIs6 && hasSymbol && !usernameSpecialChar){
            frame.registerAction(username, password1);
            System.out.println("===REGISTER SUCCESSFUL===");
            System.out.println("Username: " + username);
            System.out.println("Password: " + password1);
            
             //clearing fields
            usernameFld.setText("");
            passwordFld.setText("");
            confirmPassFld.setText("");
        
            //clearing the error messages
//            userErrorMsg.setVisible(false);
//            userErrorMsg1.setVisible(false);
//            passwordErrorMsg.setVisible(false);
//            confErrorMsg.setVisible(false);
//            usernameLbl.setForeground(Color.black);
//            passwordLbl.setForeground(Color.black);
            
            
            frame.loginNav();
        }           
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        //clearing fields
        usernameFld.setText("");
        passwordFld.setText("");
        confirmPassFld.setText("");
        
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
    private javax.swing.JPasswordField confirmPassFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
