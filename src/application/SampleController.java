package application;

import com.coffeemachine.controllers.ClientController;
import com.coffeemachine.controllers.ProductController;
import com.coffeemachine.controllers.TechnicianController;
import com.coffeemachine.models.Client;
import com.coffeemachine.models.Product;
import com.coffeemachine.models.Technician;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class SampleController{
	
	//Part Technicien 
	
	@FXML 
	private TextField idTech;
	@FXML
	private TextField nameTech;
	@FXML
	private TextField phoneTec;
	@FXML
	private TextField idRefTech;
	@FXML
	private TextField accessCodeTec;
	@FXML 
	private TabPane tabPane;
	@FXML 
	private Button btn1;
	@FXML
	private TableView<?> tablTec;
	@FXML
	private TableColumn<?,?> colIdTec;
	@FXML
	private TableColumn<?,?> colNameTec;
	@FXML
	private TableColumn<?,?> colPhoneTec;
	@FXML
	private TableColumn<?,?> colIdRefTec;
	@FXML
	private TableColumn<?,?> colAccessCodeTec;
	
	
	//Part Client 
	
	@FXML
	private TextField idC;
	@FXML
	private TextField nameC;
	@FXML
	private TextField phoneC;
	@FXML
	private TextField choiceC;
	@FXML
	private TextField coinsC;
	@FXML
	private TextField restC;
	
	//Part Product
	@FXML
	private TextField nameP;
	@FXML
	private TextField priceP;
	
	
	
		TechnicianController technicianController;
		ClientController clientController;
		ProductController productController;
		static List<Technician> technicians;
		static List<Client> clients;
		static List<Product> products;
		Technician techn;
		Client client;
		Product product;
		
		public  SampleController() {
			technicianController = new TechnicianController();
			clientController= new ClientController();
			technicians = new ArrayList<Technician>();
			clients = new ArrayList<Client>();
			products = new ArrayList<Product>();
		}
		
	
	
		 
      //Add Technicient
		public void addTech() throws Exception {
			
			long id = new Random().nextLong();
			String nameTString = this.nameTech.getText();
			String phonString = this.phoneTec.getText();
			String idRedC = this.idRefTech.getText();
			String accessString = this.accessCodeTec.getText();
			Technician technician = new Technician(id, nameTString, phonString, idRedC, accessString);
			technicianController.AddTechnician(technicians, technician);
			System.out.println(technicians);
		}
		

		//add Client
		
		public void addClient() throws Exception {
			long id = new Random().nextLong();
			String nameClinet = this.nameC.getText();
			String phoneClinet = this.phoneC.getText();
			String choiceClient = this.choiceC.getText();
			double coinsClient = Double.parseDouble(coinsC.getText());
			double restClient = Double.parseDouble(restC.getText());
			Client client = new Client(id, nameClinet, phoneClinet, choiceClient, coinsClient,restClient);
			clientController.AddClient(clients, client);
			System.out.println(clients);
		}
		
		//add Product 
		
		public void addProduct() throws Exception {
			long id = new Random().nextLong();
			String nameProduct = this.nameP.getText();
			double priceProduct =Double.parseDouble(priceP.getText());
			Product product = new Product(id, nameProduct, priceProduct);
			productController.AddProduct(products, product);
			System.out.println(products);
		}
		
		
		
}
