/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package municiplesupport;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author kishore
 */
public class PersonViewHospitalTable extends JFrame {

    public PersonViewHospitalTable(loginData f) {
        super("My Profile");
        setLayout(new BorderLayout());
        PersonViewHospitalDetailsTable model = new PersonViewHospitalDetailsTable(f);
        JTable tbl = new JTable(model);
        add(new JScrollPane(tbl), BorderLayout.CENTER);

        setSize(900, 700);
        setLocationRelativeTo(null);

        setVisible(true);
    }
    
    
    
}
