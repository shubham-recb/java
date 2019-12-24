 //WAP  to  find  the average and sum of the  N  numbers  using command line argument.
 class CommondLine
 {
	 public static void main(String args[])
	 {
		 int i,sum=0;
		 float average=0;
		 for(i=0;i<args.length;i++)
		 {
			 sum=sum+Integer.parseInt(args[i]);
			 average=sum/args.length;
		 }
		 System.out.println("Sum="+sum);
		 System.out.println("Average="+average);
	 }
 }