package controllers;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import models.User;
import repository.UserRepository;
import tableModels.UserTableModel;
import views.DataView;
import views.LoginView;

public class DataController {
	private DataView view;
	
	public DataController(DataView view) {

		this.view = view;
		registerListeners();

	}

	public void registerListeners( ) {

		view.mItemExit.addActionListener(e -> handleClose());

		view.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				handleClose();
			}
		});

		view.btnUsers.addActionListener(e -> {showUsers();
		});
		
		view.btnHome.addActionListener(e -> view.showView(DataView.HOME));
		
	}
	
	private void showUsers() {
		UserRepository repository = new UserRepository();
		
		try {
			List<User> users = repository.getUsers();
			
			UserTableModel model = new UserTableModel(users);
			
			view.usersPanel.setTableModel(model);
			
			view.showView(DataView.USERS);
			
		}catch (IOException ex) {
			JOptionPane.showMessageDialog(view, ex.getMessage());
		}
		
	}
	
	private void handleClose() {
		int option = view.confirmExit();
		System.out.println(option);

		
		if (option == JOptionPane.YES_OPTION) {
			LoginView ventanaLogin = new LoginView(); 
            new controllers.LoginController(ventanaLogin);
		}
		
	}

}
