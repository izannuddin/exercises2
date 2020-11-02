package latihan2;
import java.util.*;
public class latihan1 {

	

			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				
				printExercises12();
				printExercises13();
				printExercises14();
				printExercises15();
				printExercises16();
				printExercises17();
				printExercises18();
				printExercises19();
				printExercises20();
				printExercises21();
				
				
			}
				
				public static void printExercises12() {
					Scanner in = new Scanner(System.in);
				
					
				System.out.println("--exercises12--");
				System.out.print("Input first number: ");
				  int num1 = in.nextInt();
				  System.out.print("Input second number: ");
				  int num2 = in.nextInt();
				  System.out.print("Input third number: ");
				  int num3 = in.nextInt();
				  System.out.print("Input fourth number: ");
				  int num4 = in.nextInt();
				  System.out.print("Enter fifth number: ");
				  int num5 = in.nextInt();
				  System.out.println("Average of five numbers is: " + 
				   (num1 + num2 + num3 + num4 + num5) / 5);
				  
				System.out.println();
				}
				
				
				public static void printExercises13(){
				Scanner in = new Scanner(System.in);
				
				System.out.println("----exercises13----");
				final double width = 5.6;
		        final double height = 8.5;
		        double perimeter = 2*(height + width);
		        double area = width * height;			
				System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
		        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
				System.out.println();
				}
				
				
				public static void printExercises14(){
					Scanner in = new Scanner(System.in);
					
			    System.out.println("----exercises14-----");
				System.out.print("* * * * * * ==================================");
		        System.out.print(" * * * * *  ==================================");
		        System.out.print("* * * * * * ==================================");
		        System.out.print(" * * * * *  ==================================");
		        System.out.print("* * * * * * ==================================");
		        System.out.print(" * * * * *  ==================================");
		        System.out.print("* * * * * * ==================================");
		        System.out.print(" * * * * *  ==================================");
		        System.out.print("* * * * * * ==================================");
		        System.out.print("==============================================");
		        System.out.print("==============================================");
		        System.out.print("==============================================");
		        System.out.print("==============================================");
		        System.out.print("==============================================");
		        System.out.print("==============================================");
		        System.out.println();
				}
				
				
				public static void printExercises15() {
				Scanner in = new Scanner(System.in);
				
				System.out.println("----Exercises15----");
				 int a, b, temp;
				   a = 15;
				   b = 27;
				   System.out.println("Before swapping : a, b = "+a+", "+ + b);
				   temp = a;
				   a = b;
				   b = temp;   
				  System.out.println("After swapping : a, b = "+a+", "+ + b);
				 System.out.println();
				}
					
				 public static void printExercises16() {	
				 Scanner in = new Scanner(System.in);
				
				 System.out.println("----Exercises16----");
				 int a, b, temp;
				   a = 15;
				   b = 27;
				   System.out.println("Before swapping : a, b = "+a+", "+ + b);
				   temp = a;
				   a = b;
				   b = temp;   
				  System.out.println("After swapping : a, b = "+a+", "+ + b);
				  System.out.println();
				 }
				
				  public static void printExercises17() {
				  Scanner in = new Scanner(System.in);
				
				  System.out.println("----exercises17---");
				  long binary1, binary2;
				  int i = 0, remainder = 0;
				  int[] sum = new int[20];
				  System.out.print("Input first binary number: ");
				  binary1 = in.nextLong();
				  System.out.print("Input second binary number: ");
				  binary2 = in.nextLong();

				  while (binary1 != 0 || binary2 != 0) 
				  {
				   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
				   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
				   binary1 = binary1 / 10;
				   binary2 = binary2 / 10;
				  }
				  if (remainder != 0) {
				   sum[i++] = remainder;
				  }
				  --i;
				  System.out.print("Sum of two binary numbers: ");
				  while (i >= 0) {
				   System.out.print(sum[i--]);
				  }
				   System.out.print("\n");
				   System.out.println();
				}
				
				  public static void printExercises18() {
				  Scanner in = new Scanner(System.in);
				
				
				  System.out.println("----Exercises18----");
				  long binary1, binary2, multiply = 0;
				  int digit, factor = 1;
				  System.out.print("Input the first binary number: ");
				  binary1 = in.nextLong();
				  System.out.print("Input the second binary number: ");
				  binary2 = in.nextLong();
				  while (binary2 != 0)
				  {
				   digit = (int)(binary2 % 10);
				   if (digit == 1) 
				   {
				    binary1 = binary1 * factor;
				    multiply = binaryproduct((int) binary1, (int) multiply);
				   } 
				   else
				   {
				    binary1 = binary1 * factor;
				   }
				   binary2 = binary2 / 10;
				   factor = 10;
				  }
				  System.out.print("Product of two binary numbers: " + multiply+"\n");
				 }
				  static int binaryproduct(int binary1, int binary2) 
				 {
				  int i = 0, remainder = 0;
				  int[] sum = new int[20];
				  int binary_prod_result = 0;

				   while (binary1 != 0 || binary2 != 0) 
				  {
				   sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
				   remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
				   binary1 = binary1 / 10;
				   binary2 = binary2 / 10;
				  }
				  if (remainder != 0)
				  {
				   sum[i++] = remainder;
				  }
				  --i;
				  while (i >= 0) 
				  {
				   binary_prod_result = binary_prod_result * 10 + sum[i--];
				  }
				   return binary_prod_result;
				  
				  
				  
				  }
				 
				 
				 
				  public static void printExercises19() { 
				  Scanner in = new Scanner(System.in); 
				
				  System.out.println("----Exercises19---");
				  int dec_num, quot, i=1, j;
		          int bin_num[] = new int[100];
		          Scanner scan = new Scanner(System.in);
				
		          System.out.print("Input a Decimal Number : ");
		          dec_num = scan.nextInt();
				
		          quot = dec_num;
				
		          while(quot != 0)
		          {
		            bin_num[i++] = quot%2;
		            quot = quot/2;
		          }
				
		          System.out.print("Binary number is: ");
		          for(j=i-1; j>0; j--)
		          {
		          System.out.print(bin_num[j]);
		          }
		          System.out.print("\n");
		          System.out.println();
				  }
				 
				
				  public static void printExercises20() {
				  Scanner in = new Scanner(System.in);
				 
				 System.out.println("----exercises20-----");
				  int dec_num, rem;
			      String hexdec_num="";
			        
			      /* hexadecimal number digits */
			        
			       char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			       System.out.print("Input a decimal number: ");
			       dec_num = in.nextInt();
					
			       while(dec_num>0)
			       {
			        rem = dec_num%16;
			        hexdec_num = hex[rem] + hexdec_num;
			        dec_num = dec_num/16;
			       }
			       System.out.print("Hexadecimal number is : "+hexdec_num+"\n");
				   System.out.println();
				   }
				
				
		         public static void printExercises21() {
			     Scanner in = new Scanner(System.in);
			  
			     System.out.println("-----Exercises21----");
			     int dec_num, rem, quot, i=1, j;
		         int oct_num[] = new int[100];
		         Scanner scan = new Scanner(System.in);
			
		         System.out.print("Input a Decimal Number: ");
		         dec_num = scan.nextInt();
			
		         quot = dec_num;
			
		         while(quot != 0)
		         {
		         oct_num[i++] = quot%8;
		         quot = quot/8;
		         }
			
		         System.out.print("Octal number is: ");
		         for(j=i-1; j>0; j--)
		         {
		         System.out.print(oct_num[j]);
		         }
			     System.out.print("\n");
			     System.out.println();
			  
		    }
		  
		      
		}



	}

}
