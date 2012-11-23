/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is3calendar;

import calendarCode.Appointment;
import calendarCode.CalendarDate;
import calendarCode.CalendarEx;
import calendarCode.CalendarTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1007414g
 */
public class AddEventDialog extends javax.swing.JDialog {

    private CalendarEx cal;
    private MainFrame mainFrame;
    
    /**
     * Creates new form AddEventDialog
     */
    public AddEventDialog(java.awt.Frame parent, boolean modal, CalendarEx calendar, MainFrame mainFrame) {
        super(parent, modal);
        initComponents();
        cal = calendar;
        this.mainFrame = mainFrame;
    }

    public void setCal(CalendarEx cal) {
        this.cal = cal;
    }

    AddEventDialog() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EventNameInput = new javax.swing.JTextField();
        HourList = new javax.swing.JComboBox();
        MinuteList = new javax.swing.JComboBox();
        AMPMList = new javax.swing.JComboBox();
        DayList = new javax.swing.JComboBox();
        MonthList = new javax.swing.JComboBox();
        YearInput = new javax.swing.JTextField();
        LocationInput1 = new javax.swing.JTextField();
        InviteInput = new javax.swing.JTextField();
        CategoryInput = new javax.swing.JTextField();
        RecurrenceButton = new javax.swing.JButton();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EventNameInput.setText("Add Event Name");

        HourList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        MinuteList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));

        AMPMList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));

        DayList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        DayList.setSelectedIndex(CalendarEx.getCurrentDay() -1);

        MonthList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "Mar", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        MonthList.setSelectedIndex(CalendarEx.getCurrentMonth());

        YearInput.setText(Integer.toString(CalendarEx.getCurrentYear()));

        LocationInput1.setText("Add Location");

        InviteInput.setText("Invite");

        CategoryInput.setText("Add Category");

        RecurrenceButton.setText("Add Recurrence");

        Save.setText("Save");
        Save.setActionCommand("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RecurrenceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(DayList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(MonthList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(YearInput))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(HourList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(MinuteList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AMPMList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(EventNameInput)
                        .addComponent(LocationInput1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(InviteInput)
                        .addComponent(CategoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(EventNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HourList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinuteList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AMPMList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DayList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonthList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LocationInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InviteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CategoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RecurrenceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Save)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        
        System.out.println(Integer.parseInt(DayList.getSelectedItem().toString()));
        CalendarDate date = new CalendarDate(Integer.parseInt(DayList.getSelectedItem().toString()), convertMonth(MonthList.getSelectedItem().toString()), Integer.parseInt(YearInput.getText()));
        CalendarTime start = new CalendarTime(Integer.parseInt(HourList.getSelectedItem().toString()), Integer.parseInt(MinuteList.getSelectedItem().toString()) );
        CalendarTime end = new CalendarTime(Integer.parseInt(HourList.getSelectedItem().toString())+1, Integer.parseInt(MinuteList.getSelectedItem().toString()));
        System.out.println(date.toString());
        System.out.println(start.toString());
        System.out.println(end.toString());
        cal.addAppointment(new Appointment(date, start, end, EventNameInput.getText()));
        
        this.mainFrame.RefreshView();
        this.dispose();
    }//GEN-LAST:event_SaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void run(final CalendarEx calendar, final MainFrame mainframe) {
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
            java.util.logging.Logger.getLogger(AddEventDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEventDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEventDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEventDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddEventDialog dialog = new AddEventDialog(new javax.swing.JFrame(), true, calendar, mainframe);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        try {
                            this.finalize();
                        } catch (Throwable ex) {
                            Logger.getLogger(AddEventDialog.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    public int convertMonth(String monw) {
        int x = 0;
        if (monw.equals("Jan")) {
            x = 1;
        }
        else if (monw.equals("Feb")) {
            x = 2;
        } 
        else if (monw.equals("Mar")) {
            x = 3;
        } 
        else if (monw.equals("Apr")) {
            x = 4;
        } 
        else if (monw.equals("May")) {
            x = 5;
        } 
        else if (monw.equals("Jun")) {
            x = 6;
        } 
        else if (monw.equals("Jul")) {
            x = 7;
        } 
        else if (monw.equals("Aug")) {
            x = 8;
        } 
        else if (monw.equals("Sep")) {
            x = 9;
        } 
        else if (monw.equals("Oct")) {
            x = 10;
        } 
        else if (monw.equals("Nov")) {
            x = 11;
        } 
        else if (monw.equals("Dec")) {
            x = 12;
        }
        return x;
}    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AMPMList;
    private javax.swing.JTextField CategoryInput;
    private javax.swing.JComboBox DayList;
    private javax.swing.JTextField EventNameInput;
    private javax.swing.JComboBox HourList;
    private javax.swing.JTextField InviteInput;
    private javax.swing.JTextField LocationInput1;
    private javax.swing.JComboBox MinuteList;
    private javax.swing.JComboBox MonthList;
    private javax.swing.JButton RecurrenceButton;
    private javax.swing.JButton Save;
    private javax.swing.JTextField YearInput;
    // End of variables declaration//GEN-END:variables
}
