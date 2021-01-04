
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "," + age;
    }

}

class DoublyLinkedList {

    ArrayList<Person> data = new ArrayList<>();

    public void addFirst(Person p) {
        data.add(0, p);
    }

    public void addLast(Person p) {
        data.add(data.size(), p);
    }

    public void inSert(int index, Person p) {
        data.add(index-1, p);
    }
    
    public void printMe(){
        for(Person x : data)
            System.out.println(x.toString());
        System.out.println("END PRINT");
    }
}

/**
 *
 * @author User
 */
public class Assignment_4_jframe extends javax.swing.JFrame {
    public static DoublyLinkedList Doubly;
    public static String[] header = {"Name", "Age"};
    /**
     * Creates new form Assignment_4_jframe
     */
    public Assignment_4_jframe() {
        initComponents();
        jTextField1.setText(null);
        jTextField2.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButtonGen = new javax.swing.JButton();
        jButtonAddFirst = new javax.swing.JButton();
        jButtonAddLast = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("“Doubly LinkedList’s operations”");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setText("New Data");

        jTextField2.setText("Number index");

        jButtonGen.setText("Generate");
        jButtonGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenActionPerformed(evt);
            }
        });

        jButtonAddFirst.setText("addFirst");
        jButtonAddFirst.setMaximumSize(new java.awt.Dimension(85, 25));
        jButtonAddFirst.setMinimumSize(new java.awt.Dimension(85, 25));
        jButtonAddFirst.setPreferredSize(new java.awt.Dimension(85, 25));
        jButtonAddFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFirstActionPerformed(evt);
            }
        });

        jButtonAddLast.setText("addLast");
        jButtonAddLast.setActionCommand("");
        jButtonAddLast.setMaximumSize(new java.awt.Dimension(85, 25));
        jButtonAddLast.setMinimumSize(new java.awt.Dimension(85, 25));
        jButtonAddLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddLastActionPerformed(evt);
            }
        });

        jButtonInsert.setText("insert");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAddLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAddFirst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jButtonGen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButtonGen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAddFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAddLast, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Generate
    private void jButtonGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenActionPerformed
        // TODO add your handling code here:
        Doubly = new DoublyLinkedList();
        int number = 5;
        for(int i=0; i<number; i++){
            String name = genRandomString(new Random().nextInt(5)+5);
            int age = 15+ new Random().nextInt(50);
            Doubly.data.add(new Person(name, age));
        }
        Doubly.printMe();
        Object[][] x = new Object[Doubly.data.size()][];

            for (int i = 0; i < Doubly.data.size(); i++) {
                x[i] = Doubly.data.get(i).toString().split(",");
            }

            javax.swing.table.DefaultTableModel model1 = new javax.swing.table.DefaultTableModel(x, header);
            jTable1.setModel(model1);
        
    }//GEN-LAST:event_jButtonGenActionPerformed

//addFirst
    private void jButtonAddFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddFirstActionPerformed
        // TODO add your handling code here:
        String rowData [] = jTextField1.getText().split(",");
        Doubly.addFirst(new Person(rowData[0], Integer.parseInt(rowData[1])));
        
        Doubly.printMe();
        Object[][] x = new Object[Doubly.data.size()][];

            for (int i = 0; i < Doubly.data.size(); i++) {
                x[i] = Doubly.data.get(i).toString().split(",");
            }

            javax.swing.table.DefaultTableModel model1 = new javax.swing.table.DefaultTableModel(x, header);
            jTable1.setModel(model1);
        jTextField1.setText(null);
    }//GEN-LAST:event_jButtonAddFirstActionPerformed

//addLast
    private void jButtonAddLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddLastActionPerformed
        // TODO add your handling code here:
        String rowData [] = jTextField1.getText().split(",");
        Doubly.addLast(new Person(rowData[0], Integer.parseInt(rowData[1])));
        
        Doubly.printMe();
        Object[][] x = new Object[Doubly.data.size()][];

            for (int i = 0; i < Doubly.data.size(); i++) {
                x[i] = Doubly.data.get(i).toString().split(",");
            }

            javax.swing.table.DefaultTableModel model1 = new javax.swing.table.DefaultTableModel(x, header);
            jTable1.setModel(model1);
        jTextField1.setText(null);
    }//GEN-LAST:event_jButtonAddLastActionPerformed

//Insert
    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:
        String rowData [] = jTextField1.getText().split(",");
        int index = Integer.parseInt(jTextField2.getText());
        Doubly.inSert(index,new Person(rowData[0], Integer.parseInt(rowData[1])));
        
        Doubly.printMe();
        Object[][] x = new Object[Doubly.data.size()][];

            for (int i = 0; i < Doubly.data.size(); i++) {
                x[i] = Doubly.data.get(i).toString().split(",");
            }

            javax.swing.table.DefaultTableModel model1 = new javax.swing.table.DefaultTableModel(x, header);
            jTable1.setModel(model1);
        jTextField1.setText(null);
        jTextField2.setText(null);
    }//GEN-LAST:event_jButtonInsertActionPerformed

    public static String genRandomString(int n) {
        Random random = new Random();
        String str = "";
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < n; i++) {
            str += letters[random.nextInt(26)];
            if (i == 0) {
                str = str.toUpperCase();
            }
        }
        return str;
    }

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
            java.util.logging.Logger.getLogger(Assignment_4_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment_4_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment_4_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment_4_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment_4_jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddFirst;
    private javax.swing.JButton jButtonAddLast;
    private javax.swing.JButton jButtonGen;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
