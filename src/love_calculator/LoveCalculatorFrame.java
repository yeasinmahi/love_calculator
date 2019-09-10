package love_calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author SAMI
 */
public class LoveCalculatorFrame extends javax.swing.JFrame {
    //******Global Variable*********
    int rslt=0;
    Timer timer;
    Timer timerN;
    ActionListener al;
    ActionListener alN;
    int r=200;
    int count=0;
    boolean st=false;
    boolean sm=true;
    private final Sound soundBC;
    private Sound soundF;
    private final Browser browser;
    //******Constractor*********
    public LoveCalculatorFrame() {
        initComponents();
        
        //******Adding Icon*********
        iconClass icon= new iconClass("/image/love.png",this);
        
        //******On the soft Middele of the device screen*********
        middleScreen screen= new middleScreen();
        screen.screen(this);
        
        //******On the soft Middele of the device screen*********
        soundBC=new Sound("/sound/bc.wav");
        soundBC.playLoop();
        soundF= new Sound("/sound/finish.wav");
        
        //******On the soft Middele of the device screen*********
        browser= new Browser();
        
        youLabel.setVisible(false);
        loverLabel.setVisible(false);
        loveLabel.setForeground(Color.green);
        
        //******Action Listener for Number blinding*********
        alN= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(st){
                    loveLabel.setText(""+rslt+"%");
                    st=false;
                }else{
                    loveLabel.setText("");
                    st=true;
                }
                if(count<5){
                    
                    count++;
                }else{
                    timerN.stop();
                    count=0;
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        timerN= new Timer(1000, alN);
        //******Action Listener for Incresing Progress bar gredually*********
        al= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Pr.getValue()<rslt){
                    Pr.setValue(Pr.getValue()+1);
                    r-=2;
                    Pr.setForeground(new Color(255,r,r));
                    loveLabel.setText(""+Pr.getValue()+"%");
                }
                else{
                    if(Pr.getValue()>rslt){
                        Pr.setValue(Pr.getValue()-1);
                        r+=2;
                        Pr.setForeground(new Color(255,r,r));
                        loveLabel.setText(""+Pr.getValue()+"%");
                    }
                    else{
                        soundF.play();
                        timerN.start();
                        timer.stop();
                    }   
                }
            }
        };
        timer= new Timer(100, al);  
        
        
    //*************KeyBoard Action Listener******************
    //************Your Name Text Field Keyboard action listener*******
    ynameTextField.addKeyListener(new java.awt.event.KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                char key=e.getKeyChar();
                if(Character.isDigit(key)){
                    e.consume();
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key=e.getKeyCode();
                if(key==KeyEvent.VK_ENTER){
                   calculate();
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    
    //************Lover Name Text Field Keyboard action listener*******
    lnameTextField.addKeyListener(new java.awt.event.KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                char key=e.getKeyChar();
                if(Character.isDigit(key)){
                    e.consume();
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key=e.getKeyCode();
                if(key==KeyEvent.VK_ENTER){
                   calculate();
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    
    //************Calculate Button Keyboard action listener*******
    calculateButton.addKeyListener(new java.awt.event.KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key=e.getKeyCode();
                if(key==KeyEvent.VK_ENTER){
                   calculate();
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ynameLabel = new javax.swing.JLabel();
        lnameLabel = new javax.swing.JLabel();
        lnameTextField = new javax.swing.JTextField();
        ynameTextField = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        Pr = new javax.swing.JProgressBar();
        loveLabel = new javax.swing.JLabel();
        youLabel = new javax.swing.JLabel();
        loverLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        snLabel = new javax.swing.JLabel();
        facebookLabel = new javax.swing.JLabel();
        twitterLabel = new javax.swing.JLabel();
        googleLabel = new javax.swing.JLabel();
        linkinLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Love Calculator");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(708, 420));
        setMinimumSize(new java.awt.Dimension(708, 420));
        setPreferredSize(new java.awt.Dimension(708, 420));
        setResizable(false);
        getContentPane().setLayout(null);

        ynameLabel.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        ynameLabel.setForeground(new java.awt.Color(0, 0, 153));
        ynameLabel.setText("Your Name");
        getContentPane().add(ynameLabel);
        ynameLabel.setBounds(130, 70, 128, 38);

        lnameLabel.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        lnameLabel.setForeground(new java.awt.Color(0, 0, 153));
        lnameLabel.setText("Lover Name");
        getContentPane().add(lnameLabel);
        lnameLabel.setBounds(130, 130, 136, 38);

        lnameTextField.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lnameTextField.setForeground(new java.awt.Color(51, 51, 51));
        lnameTextField.setToolTipText("Enter your lover nick name");
        lnameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lnameTextField.setOpaque(false);
        getContentPane().add(lnameTextField);
        lnameTextField.setBounds(330, 130, 220, 32);

        ynameTextField.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ynameTextField.setForeground(new java.awt.Color(51, 51, 51));
        ynameTextField.setToolTipText("Enter your nick name");
        ynameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ynameTextField.setOpaque(false);
        getContentPane().add(ynameTextField);
        ynameTextField.setBounds(330, 70, 220, 32);

        calculateButton.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        calculateButton.setForeground(new java.awt.Color(204, 0, 0));
        calculateButton.setText("Calculate");
        calculateButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calculateButton.setFocusCycleRoot(true);
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(calculateButton);
        calculateButton.setBounds(260, 330, 130, 33);

        Pr.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        Pr.setForeground(new java.awt.Color(255, 51, 51));
        Pr.setToolTipText("");
        Pr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Pr.setOpaque(true);
        getContentPane().add(Pr);
        Pr.setBounds(130, 180, 419, 30);

        loveLabel.setFont(new java.awt.Font("Viner Hand ITC", 1, 30)); // NOI18N
        loveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/love.png"))); // NOI18N
        loveLabel.setLabelFor(youLabel);
        loveLabel.setToolTipText("Love Percentage");
        loveLabel.setDoubleBuffered(true);
        loveLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(loveLabel);
        loveLabel.setBounds(260, 220, 133, 100);

        youLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        youLabel.setForeground(new java.awt.Color(0, 51, 255));
        youLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        youLabel.setText("Your Name");
        youLabel.setToolTipText("Your Name");
        youLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(youLabel);
        youLabel.setBounds(0, 260, 250, 29);

        loverLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        loverLabel.setForeground(new java.awt.Color(0, 51, 255));
        loverLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loverLabel.setText("Lover Name");
        loverLabel.setToolTipText("Lover Name");
        loverLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(loverLabel);
        loverLabel.setBounds(410, 260, 300, 29);

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        getContentPane().add(logoLabel);
        logoLabel.setBounds(240, 10, 260, 40);

        snLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sound.png"))); // NOI18N
        snLabel.setToolTipText("Sound ON/OFF");
        snLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        snLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                snLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                snLabelMouseExited(evt);
            }
        });
        getContentPane().add(snLabel);
        snLabel.setBounds(610, 40, 30, 30);

        facebookLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Facebook2.png"))); // NOI18N
        facebookLabel.setToolTipText("Facebook");
        facebookLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        facebookLabel.setMaximumSize(new java.awt.Dimension(35, 35));
        facebookLabel.setMinimumSize(new java.awt.Dimension(35, 35));
        facebookLabel.setPreferredSize(new java.awt.Dimension(35, 35));
        facebookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebookLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facebookLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facebookLabelMouseExited(evt);
            }
        });
        getContentPane().add(facebookLabel);
        facebookLabel.setBounds(520, 350, 35, 35);

        twitterLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Twitter2.png"))); // NOI18N
        twitterLabel.setToolTipText("Twitter");
        twitterLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        twitterLabel.setMaximumSize(new java.awt.Dimension(35, 35));
        twitterLabel.setMinimumSize(new java.awt.Dimension(35, 35));
        twitterLabel.setPreferredSize(new java.awt.Dimension(35, 35));
        twitterLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                twitterLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                twitterLabelMouseExited(evt);
            }
        });
        getContentPane().add(twitterLabel);
        twitterLabel.setBounds(550, 350, 35, 35);

        googleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Google-Plus2.png"))); // NOI18N
        googleLabel.setToolTipText("Google-Plus");
        googleLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        googleLabel.setMaximumSize(new java.awt.Dimension(35, 35));
        googleLabel.setMinimumSize(new java.awt.Dimension(35, 35));
        googleLabel.setPreferredSize(new java.awt.Dimension(35, 35));
        googleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                googleLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                googleLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                googleLabelMouseExited(evt);
            }
        });
        getContentPane().add(googleLabel);
        googleLabel.setBounds(580, 350, 35, 35);

        linkinLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Linkedin2.png"))); // NOI18N
        linkinLabel.setToolTipText("Linked in");
        linkinLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        linkinLabel.setMaximumSize(new java.awt.Dimension(35, 35));
        linkinLabel.setMinimumSize(new java.awt.Dimension(35, 35));
        linkinLabel.setPreferredSize(new java.awt.Dimension(35, 35));
        linkinLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkinLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkinLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                linkinLabelMouseExited(evt);
            }
        });
        getContentPane().add(linkinLabel);
        linkinLabel.setBounds(610, 350, 35, 35);

        emailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Email2.png"))); // NOI18N
        emailLabel.setToolTipText("Email Me");
        emailLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emailLabel.setMaximumSize(new java.awt.Dimension(35, 35));
        emailLabel.setMinimumSize(new java.awt.Dimension(35, 35));
        emailLabel.setPreferredSize(new java.awt.Dimension(35, 35));
        emailLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emailLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emailLabelMouseExited(evt);
            }
        });
        getContentPane().add(emailLabel);
        emailLabel.setBounds(640, 350, 35, 35);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bc.jpg"))); // NOI18N
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 708, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void calculate(){
        String yname=ynameTextField.getText();
        String lname=lnameTextField.getText();
        String ynameUppercase = null;
        String lnameUppercase = null;
        try{
            ynameUppercase=yname.toUpperCase();
            lnameUppercase=lname.toUpperCase();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Use Nick Name Only","Love Calculator", 1);
        }
        if(!("".equals(ynameUppercase)|| "".equals(lnameUppercase))){
            int you=0,lover=0;
            int lenY=ynameUppercase.length();
            int lenL=lnameUppercase.length();
            char ch;
            boolean st = true;
            for(int i=0;i<lenY;i++){
                ch=ynameUppercase.charAt(i);
                if(Character.isLetter(ch)){
                    you+=(int)ch;
                }
            }
            for(int i=0;i<lenL;i++){
                ch=lnameUppercase.charAt(i);
                if(Character.isLetter(ch)){
                    lover+=(int)ch;
                }
            }
            if(st){
                youLabel.setText(yname);
                loverLabel.setText(lname);
                youLabel.setVisible(true);
                loverLabel.setVisible(true);
                
                int Y=(you/lenY)*3;
                int L=(lover/lenL)*3;
                rslt=100-Math.abs(Y-L);
                if(rslt>0){
                    if(rslt>99){
                        rslt=100;
                    }
                }else{
                    rslt=0;
                }
                if(!timer.isRunning()){
                    timer.start();
                }
            }
            
        }
        else{
            if("".equals(yname)){
               JOptionPane.showMessageDialog(rootPane, "Enter Your Name","Love Calculator", 1);
            }else{
               JOptionPane.showMessageDialog(rootPane, "Enter Lover Name","Love Calculator", 1); 
            }
        }
    }
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        calculate();
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void snLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snLabelMouseClicked
        
        if(sm){
            sm=false;
            soundBC.stop();
            snLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mute2.png")));
        }else{
            sm=true;
            soundBC.playLoop();
            snLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sound2.png")));
        }
        
        
    }//GEN-LAST:event_snLabelMouseClicked

    //****************Mouse Click Action*****************
    private void facebookLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookLabelMouseClicked
        browser.browser("https://www.facebook.com/yeasinmahi7218");
    }//GEN-LAST:event_facebookLabelMouseClicked

    private void twitterLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterLabelMouseClicked
        browser.browser("https://twitter.com/Yeasinmahi");
    }//GEN-LAST:event_twitterLabelMouseClicked

    private void linkinLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkinLabelMouseClicked
        browser.browser("https://www.linkedin.com/profile/view?id=169782578");
    }//GEN-LAST:event_linkinLabelMouseClicked

    private void googleLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googleLabelMouseClicked
        browser.browser("https://plus.google.com/u/0/105958827013023376610/posts");
    }//GEN-LAST:event_googleLabelMouseClicked

    private void emailLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailLabelMouseClicked
        browser.email(rootPane);
    }//GEN-LAST:event_emailLabelMouseClicked

    
    //****************Mouse Enter to photo size increase*****************
    private void googleLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googleLabelMouseEntered
        googleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Google-Plus.png")));
    }//GEN-LAST:event_googleLabelMouseEntered

    private void twitterLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterLabelMouseEntered
        twitterLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Twitter.png")));
    }//GEN-LAST:event_twitterLabelMouseEntered

    private void facebookLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookLabelMouseEntered
        facebookLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Facebook.png")));
    }//GEN-LAST:event_facebookLabelMouseEntered

    private void linkinLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkinLabelMouseEntered
        linkinLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Linkedin.png")));
    }//GEN-LAST:event_linkinLabelMouseEntered

    private void emailLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailLabelMouseEntered
        emailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Email.png")));
    }//GEN-LAST:event_emailLabelMouseEntered

    
    //****************Mouse Exit to proto resize*****************
    private void googleLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googleLabelMouseExited
        googleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Google-Plus2.png")));
    }//GEN-LAST:event_googleLabelMouseExited

    private void twitterLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterLabelMouseExited
        twitterLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Twitter2.png")));
    }//GEN-LAST:event_twitterLabelMouseExited

    private void facebookLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookLabelMouseExited
        facebookLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Facebook2.png")));
    }//GEN-LAST:event_facebookLabelMouseExited

    private void linkinLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkinLabelMouseExited
        linkinLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Linkedin2.png")));
    }//GEN-LAST:event_linkinLabelMouseExited

    private void emailLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailLabelMouseExited
        emailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Email2.png")));
    }//GEN-LAST:event_emailLabelMouseExited

    private void snLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snLabelMouseEntered
        if(!sm){
            snLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mute2.png")));
        }else{
            snLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sound2.png")));
        }
    }//GEN-LAST:event_snLabelMouseEntered

    private void snLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snLabelMouseExited
        if(!sm){
            snLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mute.png")));
        }else{
            snLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sound.png")));
        }
    }//GEN-LAST:event_snLabelMouseExited
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JProgressBar Pr;
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel facebookLabel;
    private javax.swing.JLabel googleLabel;
    private javax.swing.JLabel linkinLabel;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JTextField lnameTextField;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel loveLabel;
    private javax.swing.JLabel loverLabel;
    private javax.swing.JLabel snLabel;
    private javax.swing.JLabel twitterLabel;
    private javax.swing.JLabel ynameLabel;
    private javax.swing.JTextField ynameTextField;
    private javax.swing.JLabel youLabel;
    // End of variables declaration//GEN-END:variables
}
