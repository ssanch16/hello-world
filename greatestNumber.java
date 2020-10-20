
public class greatestNumber {
public static void main(String[] args) {
	int a=2;
	int b=7;
	int c=11;
int min=a;
int max=a;

if (b>max) {
	max=b;
}
else if (b < min) {	
	min=b;
}
if (c>max) {
	max=c;
}

System.out.println("The largest number is="+ max);
}
}
	