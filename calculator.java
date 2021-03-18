public class calculator
{
public static void main(String[]args)
{
System.out.println(addition (1, 5));		
System.out.println(subtract (4, 2));	
System.out.println(division (4, 2));		
System.out.println(multiplication (4, 2));		
}

private static float addition (float num, float num2) {
	return num + num2;
}

private static float subtract (float num, float num2) {
	return num - num2;
}

private static float division (float num, float num2) {
	return num / num2;
}

private static float multiplication (float num, float num2){
	return num * num2;
}}