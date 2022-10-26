package myexam1_10_26_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws NumberFormatException, IOException{
		ZooAnimal AnimalInfo;
		ZooKeeper KeeperInfo;
		Cage cleans;
		Cage coveredd;
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		String name = null, title = null, starving = null, zkname = null;
		boolean hungry = false, clean = false, covered = false, degree = false;
		int age = 0, length = 0, width = 0, height = 0;
		double payrate = 0;
		
		System.out.println("Enter Animal name: ");
		name = sc.nextLine();
		
		System.out.println("Enter Animal age: ");
		age = Integer.parseInt(rd.readLine());	
		
		System.out.println("Enter Cage Length: ");
		length = Integer.parseInt(rd.readLine());	
		
		System.out.println("Enter Cage Width: ");
		width = Integer.parseInt(rd.readLine());	
		
		System.out.println("Enter Cage Height: ");
		height = Integer.parseInt(rd.readLine());	
		
		System.out.println("Enter ZooKeeper Gender: ");
		title = sc.nextLine().toUpperCase();
		
		System.out.println("Enter ZooKeeper Name: ");
		zkname = sc.nextLine();	
		
		System.out.println("Enter ZooKeeper Payrate: ");
		payrate = Double.parseDouble(rd.readLine());		
		
		AnimalInfo = new ZooAnimal(name,age,hungry);
		cleans = new Cage(length,width,height,clean,covered);
		coveredd = new Cage(length,width,height,clean,covered);
		KeeperInfo = new ZooKeeper(name,title,payrate,degree);
		
		System.out.println(AnimalInfo.ZooAnimalInfo(starving));
		System.out.println(cleans.CageCleanInfo()+ coveredd.CageCoveredInfo());
		System.out.println(cleans.CageCleanInfo()+ coveredd.CageCoveredInfo());
		System.out.println(KeeperInfo.ZooKeeperInfo());
	}

}
