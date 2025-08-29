package com.java.innerclass;


	public class Bank extends Customer{
		public class SavingsAccount1{
			void msg(){
				System.out.println("i am savings account");
			
			}
		}
	//inner class2
		public class RecurringAccount2{
			
		void msg2(){
			System.out.println("i am recurring Account");
		}
		}
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				Bank b= new Bank();
				Bank.SavingsAccount1 obj1=b.new SavingsAccount1();
				Bank.RecurringAccount2 obj2=b.new RecurringAccount2();
				obj1.msg();
				obj2.msg2();
		}
	}



	
