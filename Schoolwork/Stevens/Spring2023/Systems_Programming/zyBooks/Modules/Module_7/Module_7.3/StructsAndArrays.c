
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

const int MAX_COUNTRY_NAME_LENGTH = 50;

/**
 * @brief 
 * The power of structs becomes even more evident when used in conjunction with arrays. 
 * Consider a TV watching time program where a user can enter a country name, and the program outputs the daily TV watching hours average for a person in that country. 
 * One approach uses two same-sized arrays, one to hold names, and the other to hold numbers corresponding to each name. 
 * Instead of those two arrays, a struct allows for declaration of just one array that stores items that each have name and number data members.
 * 
 * Note that the countryList variable is declared as CountryTvWatch countryList[NUM_COUNTRIES], meaning an array of items of type CountryTvWatch. 
 * Thus, each array element will have memory allocated for the struct's two data members, countryName and tvMinutes.
 * The notation countryList[i].countryName is equivalent to (countryList[i]).countryName, because the member access operator is evaluated left-to-right (as are any equal-precedence operators). 
 * The left-to-right member access operator evaluation is well-known among programmers so parentheses are typically omitted.
 */

typedef struct CountryTvWatch_struct {
   char countryName[MAX_COUNTRY_NAME_LENGTH];
   int tvMinutes;
} CountryTvWatch;

typedef struct Sandwich_struct {
   char sandwichName[75];
   char ingredients[75];
} Sandwich;

typedef struct Pizza_struct {
   char pizzaName[75];
   int caloriesPerSlice;
} Pizza;

int main(void) {
   // Source: www.statista.com, 2010
   const int NUM_COUNTRIES = 4;
   
   CountryTvWatch countryList[NUM_COUNTRIES];
   char countryToFind[MAX_COUNTRY_NAME_LENGTH];
   bool countryFound;
   int i;
   
   strcpy(countryList[0].countryName, "Brazil");
   countryList[0].tvMinutes = 222;
   strcpy(countryList[1].countryName, "India");
   countryList[1].tvMinutes = 119;
   strcpy(countryList[2].countryName, "U.K.");
   countryList[2].tvMinutes = 242;
   strcpy(countryList[3].countryName, "U.S.A.");
   countryList[3].tvMinutes = 283;
   
   printf("Enter country name: ");
   scanf("%s", countryToFind);
  
   countryFound = false;
   for (i = 0; i < NUM_COUNTRIES && !countryFound; ++i) { // Find country's index
      if (strcmp(countryList[i].countryName, countryToFind) == 0) {
         countryFound = true;
         printf("People in %s watch\n", countryToFind);
         printf("%d minutes of TV daily.\n", countryList[i].tvMinutes);
      }
   }
   if (!countryFound) {
      printf("Country not found, try again.\n");
   }
   
    Sandwich availableSandwiches[3];

   strcpy(availableSandwiches[0].sandwichName, "Chicken and Bacon");
   strcpy(availableSandwiches[1].sandwichName, "Chicken breast");
   strcpy(availableSandwiches[2].sandwichName, "Chicken with peppers");
   strcpy(availableSandwiches[0].ingredients, "Crispy chicken, onions, lettuce, bacon, mayonnaise");
   strcpy(availableSandwiches[1].ingredients, "Grilled chicken, lettuce, tomato");
   strcpy(availableSandwiches[2].ingredients, "Grilled chicken, red and green peppers, barbecue sauce");

   printf("%s: %s\n", availableSandwiches[0].sandwichName, availableSandwiches[0].ingredients);
   printf("%s: %s\n", availableSandwiches[1].sandwichName, availableSandwiches[1].ingredients);
   printf("%s: %s\n", availableSandwiches[2].sandwichName, availableSandwiches[2].ingredients);

   Pizza listOfPizzas[2];

   strcpy(listOfPizzas[0].pizzaName, "Barbecue");
   strcpy(listOfPizzas[1].pizzaName, "Ham and Cheese");

   /* Your code goes here */
   scanf("%d",&listOfPizzas[0].caloriesPerSlice);
   scanf("%d",&listOfPizzas[1].caloriesPerSlice);

   printf("A %s slice contains %d calories.\n", listOfPizzas[0].pizzaName, listOfPizzas[0].caloriesPerSlice);
   printf("A %s slice contains %d calories.\n", listOfPizzas[1].pizzaName, listOfPizzas[1].caloriesPerSlice);
   
   return 0;
}