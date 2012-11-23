/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is3calendar;

import calendarCode.CalendarEx;
import java.awt.BorderLayout;
import java.awt.Dialog;
import javax.swing.JPanel;

/**
 *
 * @author Dan
 */
public class MainFrame extends javax.swing.JFrame {

    public DayPanel dayPanel;
    public WeekPanel weekPanel;
    public MonthPanel monthPanel;
    public YearPanel yearPanel;
    public ToDoPanel toDoPanel;
    
    public JPanel currentPanel;
    
    private CalendarEx cal;

    /**
     * Creates new form MainFrame
     */
    public MainFrame(CalendarEx calendar) {
        initComponents();
        System.out.println("PRINT ME");
        cal = calendar;
        cal.setMax_id(5);
        System.out.println(cal.getMax_id());
        dayPanel = new DayPanel(cal);
        weekPanel = new WeekPanel(cal);
        monthPanel = new MonthPanel(cal);
        yearPanel = new YearPanel(cal);
        toDoPanel = new ToDoPanel(cal);

        InternalPanel.setLayout(new java.awt.BorderLayout());
        
        InternalPanel.add(dayPanel);
        currentPanel = dayPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InternalPanel = new javax.swing.JPanel();
        AddEventButton = new javax.swing.JButton();
        DayButton = new javax.swing.JButton();
        MonthButton = new javax.swing.JButton();
        WeekButton = new javax.swing.JButton();
        YearButton = new javax.swing.JButton();
        ToDoButton = new javax.swing.JButton();
        TodayButton = new javax.swing.JButton();
        HelpButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        AllCategoriesButton = new javax.swing.JButton();
        WorkButton = new javax.swing.JButton();
        UniversityButton = new javax.swing.JButton();
        SocialButton = new javax.swing.JButton();
        BirthdaysButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InternalPanel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout InternalPanelLayout = new javax.swing.GroupLayout(InternalPanel);
        InternalPanel.setLayout(InternalPanelLayout);
        InternalPanelLayout.setHorizontalGroup(
            InternalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        InternalPanelLayout.setVerticalGroup(
            InternalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        AddEventButton.setText("Add Event");
        AddEventButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddEventButtonMouseClicked(evt);
            }
        });
        AddEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEventButtonActionPerformed(evt);
            }
        });

        DayButton.setText("Day");
        DayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DayButtonMouseClicked(evt);
            }
        });

        MonthButton.setText("Month");
        MonthButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MonthButtonMouseClicked(evt);
            }
        });

        WeekButton.setText("Week");
        WeekButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WeekButtonMouseClicked(evt);
            }
        });

        YearButton.setText("Year");
        YearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YearButtonMouseClicked(evt);
            }
        });

        ToDoButton.setText("ToDo");
        ToDoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToDoButtonMouseClicked(evt);
            }
        });

        TodayButton.setText("Today");
        TodayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TodayButtonMouseClicked(evt);
            }
        });

        HelpButton.setText("Help");

        SettingsButton.setText("Settings");

        AllCategoriesButton.setText("All Categories");

        WorkButton.setText("Work");

        UniversityButton.setText("University");

        SocialButton.setText("Social");

        BirthdaysButton.setText("Birthdays");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddEventButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SettingsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HelpButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InternalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DayButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(WeekButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MonthButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(YearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ToDoButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TodayButton)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(AllCategoriesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WorkButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UniversityButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SocialButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BirthdaysButton)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DayButton, MonthButton, ToDoButton, TodayButton, WeekButton, YearButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddEventButton)
                    .addComponent(HelpButton)
                    .addComponent(SettingsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllCategoriesButton)
                    .addComponent(WorkButton)
                    .addComponent(UniversityButton)
                    .addComponent(SocialButton)
                    .addComponent(BirthdaysButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InternalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DayButton)
                    .addComponent(MonthButton)
                    .addComponent(WeekButton)
                    .addComponent(YearButton)
                    .addComponent(ToDoButton)
                    .addComponent(TodayButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DayButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DayButtonMouseClicked
        InternalPanel.remove(currentPanel);
        InternalPanel.add(dayPanel);
        InternalPanel.revalidate();
        InternalPanel.repaint();
        currentPanel = dayPanel;
        dayPanel.RefreshView();
    }//GEN-LAST:event_DayButtonMouseClicked

    private void WeekButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WeekButtonMouseClicked
        InternalPanel.remove(currentPanel);
        InternalPanel.add(weekPanel);
        InternalPanel.revalidate();
        InternalPanel.repaint();
        currentPanel = weekPanel;
        weekPanel.RefreshView();
    }//GEN-LAST:event_WeekButtonMouseClicked

    private void MonthButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MonthButtonMouseClicked
        InternalPanel.remove(currentPanel);
        InternalPanel.add(monthPanel);
        InternalPanel.revalidate();
        InternalPanel.repaint();
        currentPanel = monthPanel;
        monthPanel.RefreshView();
    }//GEN-LAST:event_MonthButtonMouseClicked

    private void YearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YearButtonMouseClicked
        InternalPanel.remove(currentPanel);
        InternalPanel.add(yearPanel);
        InternalPanel.revalidate();
        InternalPanel.repaint();
        currentPanel = yearPanel;
        yearPanel.RefreshView();
    }//GEN-LAST:event_YearButtonMouseClicked

    private void ToDoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToDoButtonMouseClicked
        InternalPanel.remove(currentPanel);
        InternalPanel.add(toDoPanel);
        InternalPanel.revalidate();
        InternalPanel.repaint();
        currentPanel = toDoPanel;
        toDoPanel.RefreshView();
    }//GEN-LAST:event_ToDoButtonMouseClicked

    private void TodayButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TodayButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TodayButtonMouseClicked

    private void AddEventButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddEventButtonMouseClicked
        //display AddEventDialog
    }//GEN-LAST:event_AddEventButtonMouseClicked

    private void AddEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEventButtonActionPerformed
        AddEventDialog addEvent = new AddEventDialog();
        AddEventDialog.run(cal, this);
        addEvent.setCal(cal);
    }//GEN-LAST:event_AddEventButtonActionPerformed

    public void RefreshView(){
        
        if(currentPanel.getClass().equals(dayPanel.getClass())){
            dayPanel.RefreshView();
        }
        else if (currentPanel.getClass().equals(weekPanel.getClass())){
            weekPanel.RefreshView();
        }
        else if (currentPanel.getClass().equals(monthPanel.getClass())){
            monthPanel.RefreshView();
        }
        else if (currentPanel.getClass().equals(yearPanel.getClass())){
            yearPanel.RefreshView();
        }
        else if (toDoPanel.getClass().equals(toDoPanel.getClass())){
            monthPanel.RefreshView();
        }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MainFrame().setVisible(true);
                //i just hope we don't need this
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEventButton;
    private javax.swing.JButton AllCategoriesButton;
    private javax.swing.JButton BirthdaysButton;
    private javax.swing.JButton DayButton;
    private javax.swing.JButton HelpButton;
    private javax.swing.JPanel InternalPanel;
    private javax.swing.JButton MonthButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton SocialButton;
    private javax.swing.JButton ToDoButton;
    private javax.swing.JButton TodayButton;
    private javax.swing.JButton UniversityButton;
    private javax.swing.JButton WeekButton;
    private javax.swing.JButton WorkButton;
    private javax.swing.JButton YearButton;
    // End of variables declaration//GEN-END:variables
}