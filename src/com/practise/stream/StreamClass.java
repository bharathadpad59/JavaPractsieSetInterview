package com.practise.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

	static String paramName = "widget";

	public static void main(String[] args) {
		
		"hello".contains("he");
		
		if (Stream.of("widget", "panel_selected_tab").noneMatch(s -> s.equalsIgnoreCase(paramName))) {
			System.out.println("hello its not matched");
		}

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);

		List<Product> productsList = new ArrayList<>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f, null));
		productsList.add(new Product(2, "Dell Laptop", 30000f, null));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f, null));
		productsList.add(new Product(4, "Sony Laptop", 28000f, null));
		productsList.add(new Product(5, "Apple Laptop", 90000f, null));

		List<Float> productPriceList = productsList.stream().filter(p -> p.price > 30000) // filtering data
				.map(Product::getPrice) // fetching price by referring getPrice method
				.collect(Collectors.toList());
		// min method will print minimum value
		float maxValue = productsList.stream().filter(p -> p.getPrice() > 24000f)
				.max((a, b) -> a.getPrice() > b.getPrice() ? 1 : -1).get().getPrice();
		System.out.println("MaxValue=====" + maxValue);
		// collecting as list
		System.out.println(productPriceList);
		
		float max = productsList.stream().filter(p -> p.price > 30000) // filtering data
				.map(Product::getPrice) // fetching price by referring getPrice method
				.max((num1,num2)-> num1>num2 ? 1: -1).get();
		
		float result = productsList.stream() // filtering data
				.map(Product::getPrice).reduce((a,b)->(a*a*a)+(b*b*b)).get();
		
		System.out.println("Result==="+result);
		List<Integer> r= new ArrayList<Integer>();
		r.add(1);r.add(2);r.add(3);r.add(4);
		double resul=r.stream().mapToDouble(val->(val*val*val)).sum();
		System.out.println("Resul=="+resul);

		
		double testSum=0;
		
		for (Integer integer : r) {
			testSum=testSum+(integer*integer*integer);
		}

		System.out.println("Testing==="+testSum);
		
		
	}
//Filter will just filter data but again u have to collect it and then return it
	// reduce method will filter/do Operations  the data and get the value final value
	//mapToDouble get the individual value process it 
	//map will be used for transformation of data i.e it itself gives 
	// another stream which furthure can be processed.
	//flatmap is used to iterate/process nested streams i.e stream of stream
}
