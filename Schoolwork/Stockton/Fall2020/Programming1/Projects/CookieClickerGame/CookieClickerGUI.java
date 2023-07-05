package CookieClickerGame;

//Michael Chillemi
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class CookieClickerGUI extends javax.swing.JFrame {
    //global variables
    private int cookie;  
    private int helper;
    private int helperPrice;
    private int grandma;
    private int grandmaPrice;
    private int farms;
    private int farmsPrice;
    private int factory; 
    private int factoryPrice;
    
    
    
    /**
     * Creates new form CookieClickerGUI
     */
    public CookieClickerGUI() {
        initComponents();
        cookieUpdater();
        
        
    }
    
    public void cookieUpdater() {
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               //This will update a print statement on a timer to update the amount of cookies you have in the terminal. 
               //It will also multiply and add to the amount of cookies depending on how many helpers,grandmas..ect you have.
        
                setCookie(getCookie()+ (getHelper()*5)+(getGrandma()*50)+(getFarms()*300) + getFactory()*1000);
                numberOfCookiesLabel.setText(getCookie() +"");
                
                System.out.println("Number of Cookies: " + getCookie());
            
                 
            }
        };
        Timer displayTimer = new Timer(1000, listener);
        displayTimer.start();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cookieButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numberOfCookiesLabel = new javax.swing.JLabel();
        cursorButton = new javax.swing.JButton();
        grandmaButton = new javax.swing.JButton();
        farmButton = new javax.swing.JButton();
        factoryButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        helperLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        grandmaLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        farmsLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        factoriesLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        helperCostLabel = new javax.swing.JLabel();
        grandmaCostLabel = new javax.swing.JLabel();
        farmsCostLabel = new javax.swing.JLabel();
        factoriesCostLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cookieButton.setText("Cookie");
        cookieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Cookies:");

        numberOfCookiesLabel.setText("0");

        cursorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursorButtonActionPerformed(evt);
            }
        });

        grandmaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grandmaButtonActionPerformed(evt);
            }
        });

        farmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmButtonActionPerformed(evt);
            }
        });

        factoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factoryButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Number of Helpers:");

        helperLabel.setText("0");

        jLabel4.setText("Number of Grandmas:");

        grandmaLabel.setText("0");

        jLabel6.setText("Number of Farms:");

        farmsLabel.setText("0");

        jLabel8.setText("Number of Factories:");

        factoriesLabel.setText("0");

        jLabel3.setText("Cost:");

        jLabel5.setText("Cost:");

        jLabel7.setText("Cost:");

        jLabel9.setText("Cost:");

        helperCostLabel.setText("10");

        grandmaCostLabel.setText("100");

        farmsCostLabel.setText("1000");

        factoriesCostLabel.setText("100000");
        
        //These are the starting prices of all of the buttons.
        setFactoryPrice(100000);
	setFarmsPrice(1000);
	setGrandmaPrice(100);
	setHelperPrice(10);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberOfCookiesLabel))
                    .addComponent(cookieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cursorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(helperLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(helperCostLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(grandmaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grandmaLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grandmaCostLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(farmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(farmsLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(farmsCostLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(factoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(factoriesLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(factoriesCostLabel)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numberOfCookiesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cursorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(helperLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(helperCostLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grandmaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(grandmaLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(grandmaCostLabel)))))
                    .addComponent(cookieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(farmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(farmsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(farmsCostLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(factoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(factoriesLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(factoriesCostLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cookieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieButtonActionPerformed
        
       //this print statement will print "+1 cookie" evry time you click the cookie button.
        System.out.println(" +1 cookie ");
       //this adds the value of a cookie by one every time you click it
        setCookie(getCookie()+1);  
       // this prints and changes the number
        numberOfCookiesLabel.setText(getCookie()+"");  
        
        //These are the achievements 
        if(getCookie() == 1){
            System.out.println("Achievement Unlocked: First Cookie ");
            System.out.println("Description: Get 1 Cookie");
        }
        
        if(getCookie() == 100){
            System.out.println("Achievement Unlocked: A Whole Batch of Cookies ");
            System.out.println("Description: Get 100 Cookies ");
        }
        
        if(getCookie() == 1000){
            System.out.println("Achievement Unlocked: Cookie Overload ");
            System.out.println("Description: Get 1000 Cookies ");
        }
        //this achievement gives you a bonus 1,000,000 cookies once you unlock it 
        if(getCookie() == 1000000){
            System.out.println("Achievement Unlocked: Cookie Monster!!!! ");
            setCookie(getCookie()+1000000);
            System.out.println("Bonus Cookies You get a Million!!");
        }
        
    }//GEN-LAST:event_cookieButtonActionPerformed
    
    
    private void cursorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursorButtonActionPerformed
        // This couple lines of code will do the following if the number of cookies is greater than or equal to the price of a helper
        //-subtract the helper price from the amount of cookies 
        //-add one helper per click and display it 
        //-print out "+1 helper" in the terminal 
        //-it will also increase the helper price by 1.1 after the first purchase and display it
        //if you do not meet the requirment you get a print statement saying to get more cookies 
        if(getCookie() >= getHelperPrice()){
            setCookie(getCookie()-getHelperPrice()); 
            setHelper(getHelper() + 1);
            numberOfCookiesLabel.setText(getCookie()+"");
            helperLabel.setText(getHelper()+"");
            System.out.println(" +1 Helper");
            setHelperPrice((int)Math.round(getHelperPrice()*1.1));
            helperCostLabel.setText(getHelperPrice()+ "");
            
        }else{ 
            System.out.println("You Dont Have Enough Get More Cookies ");
        }
        
        //These are the achievements
        if(getHelper() == 1){
            System.out.println("Achievement Unlocked: Got a Helper ");
            System.out.println("Description: Get 1 Helpers ");
        }
        
        if(getHelper() == 10){
            System.out.println("Achievement Unlocked: Call The Squad ");
            System.out.println("Description: Get 10 Helpers ");
        }

        if(getHelper() == 100){
            System.out.println("Achievement Unlocked: Family Reunion ");
            System.out.println("Description: Get 100 Helpers ");
        }

        if(getHelper() == 1000){
            System.out.println("Achievement Unlocked: Teamwork!! ");
            System.out.println("Description: Get 1000 Helpers ");
        }

        if(getHelper() == 100000){
            System.out.println("Achievement Unlocked: There Is No I In Team ");
            System.out.println("Description: Get 100000 Helpers ");
        }

        if(getHelper() == 1000000){
            System.out.println("Achievement Unlocked: Teamwork Makes The Dream Work");
            System.out.println("Description: Get 1000000 Helpers ");
        }


        
        
    }//GEN-LAST:event_cursorButtonActionPerformed

    private void grandmaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grandmaButtonActionPerformed
        // This couple lines of code will do the following if the number of cookies is greater than or equal to the price of a grandma
        //-subtract the grandma price from the amount of cookies 
        //-add one grandma per click and display it 
        //-print out "+1 grandma" in the terminal 
        //-it will also increase the grandma price by 1.1 after the first purchase and display it
        //if you do not meet the requirment you get a print statement saying to get more cookies
        
        if(getCookie() >= getGrandmaPrice()){
            setCookie(getCookie()- getGrandmaPrice()); 
            setGrandma(getGrandma() + 1);
            numberOfCookiesLabel.setText(getCookie()+"");
            grandmaLabel.setText(getGrandma()+"");
            System.out.println(" +1 Grandma");
            setGrandmaPrice((int)Math.round(getGrandmaPrice()*1.1));
            grandmaCostLabel.setText(getGrandmaPrice()+ "");
        }else{ 
            System.out.println("You Dont Have Enough Get More Cookies ");
        }
        
        //These are the achievements
        if(getGrandma() == 1){
            System.out.println("Achievement Unlocked: Grandmas Cookies ");
            System.out.println("Description: Get 1 Grandma ");
        }
        
        if(getGrandma() == 10){
            System.out.println("Achievement Unlocked: Grandma's Friends");
            System.out.println("Description: Get 10 Grandma ");
        }

        if(getGrandma() == 100){
            System.out.println("Achievement Unlocked: Call The Retirement Home ");
            System.out.println("Description: Get 100 Grandma ");
        }

        if(getGrandma() == 1000){
            System.out.println("Achievement Unlocked: Panic At The Bingo ");
            System.out.println("Description: Get 1000 Grandma ");
        }

        if(getGrandma() == 100000){
            System.out.println("Achievement Unlocked: Elder Diapers ");
            System.out.println("Description: Get 100000 Grandma ");
        }

        if(getGrandma() == 1000000){
            System.out.println("Achievement Unlocked: Grandma Overload ");
            System.out.println("Description: Get 1000000 Grandma ");
        }

        
        
    }//GEN-LAST:event_grandmaButtonActionPerformed

    private void farmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmButtonActionPerformed
        // This couple lines of code will do the following if the number of cookies is greater than or equal to the price of a farm
        //-subtract the farm price from the amount of cookies 
        //-add one farm per click and display it 
        //-print out "+1 farm" in the terminal 
        //-it will also increase the farm price by 1.1 after the first purchase and display it
        //if you do not meet the requirment you get a print statement saying to get more cookies  
        
         if(getCookie() >= getFarmsPrice()){
            setCookie(getCookie()-getFarmsPrice()); 
            setFarms(getFarms() + 1);
            numberOfCookiesLabel.setText(getCookie()+"");
            farmsLabel.setText(getFarms()+"");
            System.out.println(" +1 Farm");
            setFarmsPrice((int)Math.round(getFarmsPrice()*1.1));
            farmsCostLabel.setText(getFarmsPrice()+ "");
             }else{ 
            System.out.println("You Dont Have Enough Get More Cookies ");
        }
        
        //These are the achievements
        
        if(getFarms() == 1){
            System.out.println("Achievement Unlocked: My First Farm ");
            System.out.println("Description: Get 1 Farm ");
        }
        
        if(getFarms() == 10){
            System.out.println("Achievement Unlocked: Seedy Business ");
            System.out.println("Description: Get 10 Farm ");
        }

        if(getFarms() == 100){
            System.out.println("Achievement Unlocked: Ewww Manure ");
            System.out.println("Description: Get 100 Farm ");
        }

        if(getFarms() == 1000){
            System.out.println("Achievement Unlocked: Where's My Tractor ");
            System.out.println("Description: Get 1000 Farm ");
        }

        if(getFarms() == 100000){
            System.out.println("Achievement Unlocked: Cock-A-Doodle-Doo ");
            System.out.println("Description: Get 100000 Farm ");
        }

        if(getFarms() == 1000000){
            System.out.println("Achievement Unlocked: Old Macdonald ");
            System.out.println("Description: Get 1000000 Farm ");
        }
        
    }//GEN-LAST:event_farmButtonActionPerformed

    private void factoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factoryButtonActionPerformed
        // This couple lines of code will do the following if the number of cookies is greater than or equal to the price of a factory
        //-subtract the factory price from the amount of cookies 
        //-add one factory per click and display it 
        //-print out "+1 factory" in the terminal 
        //-it will also increase the factory price by 1.1 after the first purchase and display it
        //if you do not meet the requirment you get a print statement saying to get more cookies  
        
        if(getCookie() >= getFactoryPrice()){
            setCookie(getCookie()-getFactoryPrice()); 
            setFactory(getFactory() + 1);
            numberOfCookiesLabel.setText(getCookie()+"");
            factoriesLabel.setText(getFactory()+"");
            System.out.println(" +1 Factory");
            setFactoryPrice((int)Math.round(getFactoryPrice()*1.1));
            factoriesCostLabel.setText(getFactoryPrice()+ "");
        }else{ 
            System.out.println("You Dont Have Enough Get More Cookies ");
        }
        
        //These are the achievements
        
        if(getFactory() == 1){
            System.out.println("Achievement Unlocked: Production Chain ");
            System.out.println("Description: Get 1 Factory ");
        }
        
        if(getFactory() == 10){
            System.out.println("Achievement Unlocked: Industrial Revolution ");
            System.out.println("Description: Get 10 Factory ");
        }

        if(getFactory() == 100){
            System.out.println("Achievement Unlocked: global Warming ");
            System.out.println("Description: Get 100 Factory ");
        }

        if(getFactory() == 1000){
            System.out.println("Achievement Unlocked: In Full Gear ");
            System.out.println("Description: Get 1000 Factory ");
        }

        if(getFactory() == 100000){
            System.out.println("Achievement Unlocked: Labor Of Love ");
            System.out.println("Description: Get 100000 Factory ");
        }

        if(getFactory() == 1000000){
            System.out.println("Achievement Unlocked: Working Overtime ");
            System.out.println("Description: Get 1000000 Factory ");
        }
        
    }//GEN-LAST:event_factoryButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CookieClickerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CookieClickerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CookieClickerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CookieClickerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CookieClickerGUI().setVisible(true);
            }
        });
    }
    
    //these are my getters for all my global variables
    public int getCookie(){
        return cookie;
    }
    
    public int getHelper(){
        return helper;
    }
    
    public int getHelperPrice(){
        return helperPrice;
    }
    
    public int getGrandma(){
        return grandma;
    }
    
    public int getGrandmaPrice(){
        return grandmaPrice;
    }
    
    public int getFarms(){
        return farms;
    }
    
    public int getFarmsPrice(){
        return farmsPrice;
    }
    
    public int getFactory(){
        return factory;
    }
    
    public int getFactoryPrice(){
        return factoryPrice;
    }
    
    public void setCookie(int newCookie){
        cookie = newCookie;
    }
    
    //these are all my setters for my global variables
    public void setHelper(int newHelper){
        helper = newHelper;
    }
    
    public void setHelperPrice(int newHelperPrice){
        helperPrice = newHelperPrice;
        newHelperPrice = 10;
    }
    
    public void setGrandma(int newGrandma){
        grandma = newGrandma;
    }
    
    public void setGrandmaPrice(int newGrandmaPrice){
        grandmaPrice = newGrandmaPrice;
    }
    
    public void setFarms(int newFarms){
        farms = newFarms;
    }
    
    public void setFarmsPrice(int newFarmsPrice){
        farmsPrice = newFarmsPrice;
    }
    
    public void setFactory(int newFactory){
        factory = newFactory;
    }
    
    public void setFactoryPrice(int newFactoryPrice){
        factoryPrice = newFactoryPrice;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cookieButton;
    private javax.swing.JButton cursorButton;
    private javax.swing.JLabel factoriesCostLabel;
    private javax.swing.JLabel factoriesLabel;
    private javax.swing.JButton factoryButton;
    private javax.swing.JButton farmButton;
    private javax.swing.JLabel farmsCostLabel;
    private javax.swing.JLabel farmsLabel;
    private javax.swing.JButton grandmaButton;
    private javax.swing.JLabel grandmaCostLabel;
    private javax.swing.JLabel grandmaLabel;
    private javax.swing.JLabel helperCostLabel;
    private javax.swing.JLabel helperLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel numberOfCookiesLabel;
    // End of variables declaration//GEN-END:variables
}