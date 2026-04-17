package com.product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.product.controller.Productcontroller;
import com.product.entity.Product;

public class TestApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Productcontroller c=new Productcontroller();
		c.createdb("productdb");
		c.createtable();
		
		List<Product>list=new ArrayList<>();
		
		while(true)
		{
			System.out.println("\n===== PRODUCT MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Database");
            System.out.println("2. Create Table");
            System.out.println("3. Insert Product");
            System.out.println("4. Show Product");
            System.out.println("5. search by using Id");
            System.out.println("6. search by  using Name");
            System.out.println("7.sort by using  price");
            System.out.println("Enter Your Choice:");
            

            Scanner sc=new Scanner(System.in);
            int  choice = sc.nextInt();
            switch (choice) {

            // CREATE DATABASE
            case 1:
                c.createdb("productdb");
                System.out.println("Database Created Successfully");
                break;

            // CREATE TABLE
            case 2:
                c.createtable();
                System.out.println("Table Created Successfully");
                break;

            // INSERT PRODUCT
            case 3:

                List<Product> list1 = new ArrayList<>();
               
                System.out.println("How many products you want to add?");
                int n = sc.nextInt();

                for (int i = 0; i < n; i++) {

                    System.out.println("\nEnter Product " + (i + 1) + " Details");

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Product Name: ");
                    String name = sc.next();

                    System.out.print("Enter Product Category: ");
                    String category = sc.next();
                     sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();


                    System.out.print("Enter MFG Date: ");
                    String mfgdate = sc.next();

                    System.out.print("Enter EXP Date: ");
                    String expdate = sc.next();

                    list1.add(new Product(id, name, category, price, mfgdate, expdate));
                }

                c.insertdata(list1);
                System.out.println("Product Inserted Successfully");
                break;

            // SHOW PRODUCT
            case 4:
                c.showdata();
                break;

            // EXIT
            case 5:
                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();
                c.productById(id);
                break;
                
            case 6:

                 System.out.print("Enter Product name: ");
                 String name = sc.next();
                 c.productByName(name);
                 break;
                 
            case 7:
            	c.sortByprice();
            	break;
                     
           

            default:
                System.out.println("Invalid Choice ❌ Please Try Again");
          }
		}

	}

}
