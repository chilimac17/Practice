#include <stdio.h>
#include <string.h>

typedef struct ContactNode_struct {
   char contactName[100];
   char contactPhoneNumber[100];
   struct ContactNode_struct* nextContactNodePtr;
} ContactNode;


void InitializeContactNode(ContactNode* thisNode, char* initialName, char* initialPhoneNumber) {
   strcpy(thisNode->contactName, initialName);
   strcpy(thisNode->contactPhoneNumber, initialPhoneNumber);
   thisNode->nextContactNodePtr = NULL;
}

void InsertAfter(ContactNode* thisNode, ContactNode* newContactNode) {
   ContactNode* tempNext = thisNode->nextContactNodePtr;
   thisNode->nextContactNodePtr = newContactNode;
   newContactNode->nextContactNodePtr = tempNext;
}

char* GetName(ContactNode* thisNode) {
   return thisNode->contactName;
}

char* GetPhoneNumber(ContactNode* thisNode) {
   return thisNode->contactPhoneNumber;
}

   ContactNode* GetNext(ContactNode* thisNode) {
   return thisNode->nextContactNodePtr;
}

void PrintContactNode(ContactNode* thisNode) {
   printf("Name: %s\nPhone number: %s\n",GetName(thisNode), GetPhoneNumber(thisNode));
}


int main(void) {
   const int TEXT_LIMIT = 100;
   char fullName1[TEXT_LIMIT];
   char phoneNumber1[TEXT_LIMIT];
   char fullName2[TEXT_LIMIT];
   char phoneNumber2[TEXT_LIMIT];
   char fullName3[TEXT_LIMIT];
   char phoneNumber3[TEXT_LIMIT];
   ContactNode contactEntry1;
   ContactNode contactEntry2;
   ContactNode contactEntry3;
   ContactNode* currContactEntry;

   
   fgets(fullName1,TEXT_LIMIT,stdin);
   fgets(phoneNumber1,TEXT_LIMIT,stdin);
   fullName1[strlen(fullName1) - 1] = '\0';
   phoneNumber1[strlen(phoneNumber1) - 1] = '\0';
   printf("Person 1: %s, %s\n", fullName1, phoneNumber1);

   InitializeContactNode(&contactEntry1, fullName1, phoneNumber1);

   fgets(fullName2,TEXT_LIMIT,stdin);
   fgets(phoneNumber2,TEXT_LIMIT,stdin);
   fullName2[strlen(fullName2) - 1] = '\0';
   phoneNumber2[strlen(phoneNumber2) - 1] = '\0';
   printf("Person 2: %s, %s\n", fullName2, phoneNumber2);
  
   InitializeContactNode(&contactEntry2, fullName2, phoneNumber2);
   InsertAfter(&contactEntry1, &contactEntry2);
   

   fgets(fullName3,TEXT_LIMIT,stdin);
   fgets(phoneNumber3,TEXT_LIMIT,stdin);
   fullName3[strlen(fullName3) - 1] = '\0';
   phoneNumber3[strlen(phoneNumber3) - 1] = '\0';
   printf("Person 3: %s, %s\n", fullName3, phoneNumber3);
   
   InitializeContactNode(&contactEntry3, fullName3, phoneNumber3);
   InsertAfter(&contactEntry2, &contactEntry3);

  
   printf("\nCONTACT LIST\n");
   currContactEntry = &contactEntry1;

   while (currContactEntry != NULL) {
      PrintContactNode(currContactEntry);
      printf("\n");
      currContactEntry = GetNext(currContactEntry);
   }

   return 0;
}
