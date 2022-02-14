package com.practise.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


//Stream API is used to process the collections of Objects
//A stream is a sequence of Objects, that supports various methods, which can be pipelined to produce
//the desired result
//Stream is not data structures , instead it takes the input from Collections, Arrays or I/O channels.
//Streams don't change the data structures,they only provides the result based on the pipelined methods.

//Why we need stream?
//--->> 1) Functional Programming, 2) code Reduce  3)Bulk Operation
public class ToMap {
	//map() is used for data transformation,
	
//It returns the stream, based on the stream it received after applying the Function(Functional Interface Impl), functional interface has apply() method which takes 
//and argument and return an argument based on what we need
// So Map job us return the stream of data back by doing some changes (such as adding "" to int ) or not doing any changes (get salary data from Employee object).
	
	// flatMap() is used for data transformation + flattering
	
	//mapToInt(),mapToDouble()  converts Object type to primitive so that we can used methods on it
	// which are only available for primitives i.e sum(), average(), min(), max() methods without logic
	
	//but if we use map() we have to use reduce to do sum, for max, min we have to pass comparator impl
	//mapToInte().boxed() can gives us the Wrapper type return type
	
//filter() ->For conditional check    //It returns the stream based on the stream it
//Received after applying the predicate(Predicate Funl Interface Impl)

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f, Arrays.asList(1, 2),1));
		productsList.add(new Product(2, "Dell Laptop", 30000f, Arrays.asList(3, 4),2));


		// map will take 1 stream that is list and return 1 stream i.e iterate and its
		// 1 to 1 mapping

		// flatMap is used to process Stream of Stream i.e nested list for iteration
		System.out
				.println(productsList.stream()
				.flatMap(p -> p.getPrices()
				.stream())
				.mapToDouble(i -> i * i * i)
				.sum());
		
		lisIntegerCubeSum();
		lisIntegerCollect();
		mapCollectionIteration();
		mapToDouble();
		sortMap();
		gettingListToMap();
	}

	public static void lisIntegerCubeSum() {
		List<Integer> r = new ArrayList<>();
		r.add(1);
		r.add(2);
		r.add(3);
		r.add(4);

		double resul = r.stream().mapToDouble(val -> (val * val * val)).sum();
		System.out.println("********************************************");
		System.out.println("Resul==" + resul);
	}
	
	public static void lisIntegerCollect() {
		List<Integer> r = new ArrayList<>();
		r.add(1);
		r.add(2);
		r.add(3);
		r.add(4);

		Set<Integer> resul = r.stream().map(l->l+1).collect(Collectors.toSet());
		System.out.println("********************************************");
		System.out.println("Resul==" + resul);
	}
	
	public static void mapToDouble() {
		List<Product> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f, Arrays.asList(1, 2),Integer.valueOf(1)));
		productsList.add(new Product(2, "Dell Laptop", 30000f, Arrays.asList(3, 4),Integer.valueOf(2)));
		productsList.add(new Product(3, "Acer Laptop", 25000f, Arrays.asList(1, 2),Integer.valueOf(3)));
		System.out.println("********************************************");
		int sum1=productsList.stream().mapToInt(p->p.getHashKey()*p.getHashKey()*p.getHashKey()).sum();
		System.out.println(sum1);
		
		Integer sum2=productsList.stream().map(p->p.getId()*p.getId()*p.getId()).reduce(0, (a,b)->a+b);
		System.out.println(sum2);
		
		Optional<Integer> sum3=productsList.stream().map(p->p.getId()*p.getId()*p.getId()).reduce((x,y)->x+y);
		System.out.println(sum3);


	}
	
	public static void mapCollectionIteration() {
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "Bharat");
		map.put(7, "Basavraj");
		map.put(3, "Brothers");
		map.put(9, "Brothers");
		map.put(5, "Brothers");
		
		System.out.println("********************************************");
		map.entrySet()
		.stream()
		.map(val->val.getKey())
		.filter(val2->val2 > 2)
//		.filter(val2->val2>2).findFirst();
		.sorted((a,b)->a>b?-1:1)
//		.sorted((a,b)->a>b?-1:1).mapToDouble(res->res).sum();
		.forEach(System.out::println);
		
		System.out.println("****************************************************");
		
		System.out.println(map.entrySet()
		.stream()
		.map(val->val.getKey())
		.filter(val2->val2>2).findAny());
	}
	
	
	public static void sortMap() {
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "Dinnosaur");
		map.put(7, "Cat");
		map.put(3, "Raju");
		map.put(9, "Somu");
		map.put(5, "Zebra");
		System.out.println("**********************sortMap()******************************");
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()).
//		collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//				(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		Map result1 = map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey()) 			
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
				(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		System.out.println("BY KEY==="+result1);
		
		 //sort by values, and reserve it, 10,9,8,7,6...
        Map<Object, Object> result2 = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> newValue, LinkedHashMap::new));
        System.out.println("BY VALUE==="+result2);
	}
	
	public static void gettingListToMap() {
		List<Product> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f, Arrays.asList(1, 2),Integer.valueOf(1)));
		productsList.add(new Product(2, "Dell Laptop", 30000f, Arrays.asList(3, 4),Integer.valueOf(2)));
		productsList.add(new Product(3, "Acer Laptop", 25000f, Arrays.asList(1, 2),Integer.valueOf(3)));
		System.out.println("**************************************************************************");
		
		System.out.println(productsList.stream().collect(Collectors.toMap(Product::getName, Function.identity(),
			      (existing, replacement) -> existing)));
		System.out.println("**************************************************************************");		
		System.out.println(productsList.stream().collect(
      Collectors.toMap(Product::getName, Function.identity())));
	}
	
}
