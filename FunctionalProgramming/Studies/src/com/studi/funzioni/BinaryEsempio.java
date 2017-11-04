package com.studi.funzioni;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryEsempio {

	public static void main(String[] args) {
		BinaryOperator<Integer> somma = (x,y) -> x + y;
		System.out.println(somma.apply(9, 3));
		
		BinaryOperator<Function<Integer, Integer>> due_operations = (f,g) -> x -> g.apply(f.apply(x));
		Function<Integer, Integer> somma_uno_e_raddoppia = due_operations.apply(x -> x + 1, x -> x * 2);
		System.out.println(somma_uno_e_raddoppia.apply(10));
		
	}
	
}
