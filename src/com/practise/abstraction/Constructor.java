package com.practise.abstraction;

public class Constructor {

        public String name;

        public Constructor(String Name) {
            name = Name;
        }
        
        
        
        public static void main(String[] args) {
			System.out.println("Result==="+new Constructor("bharat").name);
		}
    
}
