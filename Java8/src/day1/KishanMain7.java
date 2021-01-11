package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KishanMain7 {
	public static void main(String[] args) {
		List<Kisaan> aandolan = new ArrayList<Kisaan>();
		aandolan.add(new Kisaan("Balvinder singh", 84, "Punjab"));
		aandolan.add(new Kisaan("Ramdev Gujar", 94, "Haryana"));
		aandolan.add(new Kisaan("Jitendre kholi", 81, "Delhi"));
		aandolan.add(new Kisaan("Ram lakhan yadav", 74, "UP"));
		aandolan.add(new Kisaan("Naresh paswan", 88, "Bihar"));
		aandolan.add(new Kisaan("ujwal munda", 56, "Jharkhand"));
		aandolan.add(new Kisaan("Devdenu mukherjee", 64, "West Bengal"));
		aandolan.add(new Kisaan("Mahendra choudhry", 34, "MP"));
		aandolan.add(new Kisaan("Azhar khan", 35, "Bihar"));
		aandolan.add(new Kisaan("Darshan saha", 27, "Mahrashtra"));

		// sort based on age
		Collections.sort(aandolan, new Comparator<Kisaan>() {

			@Override
			public int compare(Kisaan k1, Kisaan k2) {

				return k1.getAge() - k2.getAge();
			}
		});

		// print all

		printAll(aandolan);
		System.out.println("2nd method");

		// print those whose belong to Punjab
		printBasedOnCity(aandolan);
		
		//print kisaan data with using behavior
		
		printKisaanCondtionally(aandolan,new Conditionn() {
			
			@Override
			public void test(Kisaan k) {
				// TODO Auto-generated method stub
				
			}
		});

	}

	private static void printKisaanCondtionally(List<Kisaan> aandolan, Conditionn conditionn) {
		// TODO Auto-generated method stub
		
	}

	private static void printAll(List<Kisaan> aandolan) {
		for (Kisaan kisaanList : aandolan) {
			System.out.println(kisaanList);
		}
	}

	private static void printBasedOnCity(List<Kisaan> aandolan) {
		for (Kisaan kisaanList : aandolan) {
			if (kisaanList.getCity().startsWith("Punjab")) {
				System.out.println(kisaanList);
			}
		}

	}
	public interface Conditionn{
		void test(Kisaan k);
		
	}
}
