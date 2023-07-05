#include<stdio.h>

int main()
{
	//variables 
	double radius;  //user input 
	double area;
	const double PI = 3.14159;

	//prompt the user for input
	printf("Enter the radius in cm: ");
	scanf("%lf", &radius);

	//calculate area
	area = PI * radius * radius;
	//pow(x,y)
	
	//display
	printf("Area = %.2lf cm sq.\n", area);

	return 0;
}
