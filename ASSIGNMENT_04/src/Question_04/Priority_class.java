package practice.company;

import java.util.*;

	public class Priority_class {
		private PriorityQueue<Product> pQueue;

		public Priority_class()
		{
		      pQueue = new PriorityQueue<Product>();
		      init();
		} 

			void init()
			{
				 pQueue.add(new Product(10,"Dell Laptop",69000));
			     pQueue.add(new Product(62,"iPhoneX",50000));
			     pQueue.add(new Product(63,"iBuds",18000));	
			     pQueue.add(new Product(72,"SamsungTab",30000));
			     pQueue.add(new Product(90,"Videocon Smart TV",50000));
			}
			
			public void sort1()
			{
				 System.out.println("Sorted Product by product price :");

				   for(Product p: pQueue)
				   {
						System.out.println(p);
				
				   }
			
			}
		}



