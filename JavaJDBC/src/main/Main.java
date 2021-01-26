package main;

import view.ChamadoView;
import dao.ConnectionFactory;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) throws SQLException {
            new ChamadoView().setVisible(true);
		/*JFrame frm = new javax.swing.JFrame();
                JPanel jp = new ChamadoView();
                frm.add(jp);
                frm.setVisible(true);
                */
	}

}
