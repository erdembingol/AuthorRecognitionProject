package com.authorRecognition.ui;

import com.authorRecognition.db.DatabaseOperation;
import com.authorRecognition.db.FileOperation;
import com.authorRecognition.ui.swing.ComboBoxGUI;
import com.authorRecognition.ui.swing.MessageBox;
import com.authorRecognition.weka.Arff;
import com.authorRecognition.weka.ArticleProperty;
import com.authorRecognition.weka.Attribute;
import com.authorRecognition.weka.Classifier;
import com.authorRecognition.weka.Data;
import com.authorRecognition.zemberek.Article;
import com.authorRecognition.zemberek.ArticleOperation;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author erdem_000
 */
public class FindArticleAuthor extends javax.swing.JFrame {
    
    private ComboBoxGUI classifyMethodGUI = null;

    /**
     * Creates new form FindArticleAuthor
     */
    public FindArticleAuthor() {
        initComponents();    
        
        classifyMethodGUI = new ComboBoxGUI(this.classifyMethod);
        articleText.setWrapStyleWord(true);
        articleText.setLineWrap(true); 
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        articleText = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        filePathTextBox = new javax.swing.JTextField();
        selectArticle = new javax.swing.JButton();
        findArticle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        successRate = new javax.swing.JTextField();
        operationTime = new javax.swing.JTextField();
        articleAuthor = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        classifyMethod = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Find Article");
        setBackground(java.awt.SystemColor.activeCaption);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Enter Article as Text or Choose a File");

        articleText.setColumns(20);
        articleText.setRows(5);
        jScrollPane1.setViewportView(articleText);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        filePathTextBox.setEditable(false);
        filePathTextBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        filePathTextBox.setText("  Select...");
        filePathTextBox.setEnabled(false);

        selectArticle.setText("...");
        selectArticle.setEnabled(false);
        selectArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectArticleActionPerformed(evt);
            }
        });

        findArticle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        findArticle.setForeground(new java.awt.Color(0, 102, 51));
        findArticle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/authorRecognition/images/blue-search-icon.png"))); // NOI18N
        findArticle.setText("Find");
        findArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findArticleActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Article Author");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Success Rate");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Operation Time");

        successRate.setEditable(false);
        successRate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        operationTime.setEditable(false);
        operationTime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        articleAuthor.setEditable(false);
        articleAuthor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        classifyMethod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        classifyMethod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Naive Bayes", "Bayes Network", "Support Vector Machine", "Simple Logistic", "LMT" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filePathTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(classifyMethod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1)
                    .addComponent(findArticle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(operationTime, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(articleAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(33, 33, 33)
                                    .addComponent(successRate, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(filePathTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(classifyMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(findArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(articleAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(successRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(operationTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectArticleActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
        this.filePathTextBox.setText(file.getPath().replace("\\", "\\\\"));
        
        Article article = null;
        if(this.filePathTextBox.getText().equals("Select...")){
            article = new Article(null, this.selectArticle.getText());
        }else{
            try {
                article = FileOperation.readArticles(this.filePathTextBox.getText()).get(0);
                this.articleText.setText(article.getContent());
            } catch (IOException ex) {
                MessageBox.warningMessage("", "Dosya Bulunamadı!!!");
                Logger.getLogger(FindArticleAuthor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        this.findArticle.setEnabled(true);
    }//GEN-LAST:event_selectArticleActionPerformed

    private void findArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findArticleActionPerformed
        Date start = new Date();
        Article article = null;
        
        article = new Article(null, this.articleText.getText());
        
        ArticleOperation ao = new ArticleOperation(article);
        List<String> propertyList = ao.getArticleProperties();
        List<String> valueList = ao.getArticleValues();
        
        ArticleProperty aproperty = new ArticleProperty("?", propertyList, valueList);
        List<ArticleProperty> ap = new ArrayList<>();
        ap.add(aproperty);
        
        String filePath = "TestArticle.arff";
        String relationName = "TestArticle";
        
        //Arff dosyası atribute listesini hazırla
        List<Attribute> attributeList = new ArrayList<>();
        for (int i = 0; i < ap.get(0).getProperties().size(); i++) {
            List<String> values = new ArrayList<>();
            values.add("REAL");
            Attribute a = new Attribute(ap.get(0).getProperty(i), values);
            attributeList.add(a);
        }
        
        try {
            DatabaseOperation db = new DatabaseOperation();
            db.connect();
            List<ArticleProperty> articleProperties = db.getAllArticleProperties();
            db.disconnect();
            
            //Arff dosyası class value hazırla
            Set<String> classValues = new HashSet<>();
            for (int i = 0; i < articleProperties.size(); i++) {
                classValues.add(articleProperties.get(i).getAuthor().replace(' ', '-'));
            }
            List<String> classValuesL = new ArrayList<>();
            Iterator it = classValues.iterator();
            while(it.hasNext()){
                classValuesL.add((String)it.next());
            }

            //Attribute listesine class value ekle
            Attribute a = new Attribute("AUTHOR", classValuesL);
            attributeList.add(a);
        } catch (SQLException ex) {
            Logger.getLogger(FindArticleAuthor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(FindArticleAuthor.class.getName()).log(Level.SEVERE, null, ex);
        }      

        //Arff dosyası datalist'i hazırla
        List<Data> dataList = new ArrayList<>();
        int listSize = ap.size();
        int propertySize = ap.get(0).getProperties().size();
        for (int i = 0; i < listSize; i++) {
            List<String> values = new ArrayList<>();
            for (int j = 0; j < propertySize; j++) {
                values.add(String.valueOf(ap.get(i).getValue(j)));
            }
            Data d = new Data(ap.get(i).getAuthor().replace(' ', '-'), values);
            dataList.add(d);
        }

        //Arff dosyasına verileri kaydet
        Arff.writeToArffFile(filePath, relationName, attributeList, dataList);
        
        String[] result = null;
        try {
            String trainFile = "AuthorRecognition.arff";
            String testFile = "TestArticle.arff";
            result = Classifier.find(trainFile, testFile, this.classifyMethodGUI.getSelectedRow());
        } catch (Exception ex) {
            Logger.getLogger(FindArticleAuthor.class.getName()).log(Level.SEVERE, null, ex);
        }

        Date end = new Date();
        long second = TimeUnit.MILLISECONDS.toSeconds(end.getTime () - start.getTime ());
        long mlsec = (TimeUnit.MILLISECONDS.toMillis(end.getTime () - start.getTime ()) * 1000 - second) / 100000;
        this.operationTime.setText(String.valueOf(second + "." + mlsec + " sec"));
        
        this.articleAuthor.setText(result[0]);
        this.successRate.setText(result[1]);
    }//GEN-LAST:event_findArticleActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(!this.jCheckBox1.isSelected()){
            this.selectArticle.setEnabled(false);
            this.filePathTextBox.setEnabled(false);
        }else{
            this.selectArticle.setEnabled(true);
            this.filePathTextBox.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(FindArticleAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindArticleAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindArticleAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindArticleAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindArticleAuthor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField articleAuthor;
    private javax.swing.JTextArea articleText;
    private javax.swing.JComboBox classifyMethod;
    private javax.swing.JTextField filePathTextBox;
    private javax.swing.JButton findArticle;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField operationTime;
    private javax.swing.JButton selectArticle;
    private javax.swing.JTextField successRate;
    // End of variables declaration//GEN-END:variables
}