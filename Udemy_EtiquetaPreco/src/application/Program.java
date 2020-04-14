package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List <Product> list = new ArrayList<>();
		
		System.out.println("Enter the number os products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i): ");
			char resposta = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			if(resposta == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
			
				Date manufactureDate;
				try {
					manufactureDate = sdf.parse(sc.next());
					list.add(new UsedProduct(name, price, manufactureDate));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else if(resposta == 'i') {
				System.out.println("Customs Fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println("PRICE TAGS: ");
		
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}
}
