#include<stdio.h>
#include<string.h>
#include <stdlib.h>

//#define SIZE 100 

typedef struct ContactNode_struct {
    char contactName[100];
    char contactPhone[100];
    struct ContactNode_struct *nextContactNodePtr;
} ContactNode;


//prompt function
void prompt(char name[], char phone[], const int SIZE) {
    printf("Enter contact name: ");
    fgets(name, SIZE, stdin);
    name[(strlen(name) - 1)] = '\0';            //replace the enter key with \0

    printf("Enter contact phone: ");
    fgets(phone, SIZE, stdin);
    phone[(strlen(phone) - 1)] = '\0';
}

//InitializeContactNode
void InitializeContactNode(ContactNode *thisNode, char *name, char *phone) {
    strcpy(thisNode->contactName, name);
    strcpy(thisNode->contactPhone, phone);
    thisNode->nextContactNodePtr = NULL;
}


//InsertAfter
void InsertAfter(ContactNode *thisNode, ContactNode *newNode) {
    ContactNode *tempNext = thisNode->nextContactNodePtr;
    thisNode->nextContactNodePtr = newNode;
    newNode->nextContactNodePtr = tempNext;
}


//PrintContactNode
void PrintContactNode(ContactNode *thisNode) {
    printf("Name: %s\n", thisNode->contactName);
    printf("Phone Number: %s\n", thisNode->contactPhone);
}

//GetName
char* GetName(ContactNode *thisNode) {
    return thisNode->contactName;
}

//GetPhone
char* GetPhone(ContactNode *thisNode) {
    return thisNode->contactPhone;
}

char* GetName(ContactNode* thisNode) {
   return thisNode->contactName;
}

int main() {

    //variables
    const int SIZE = 100;
    char name[SIZE];
    char phone[SIZE];

    ContactNode *contact1;  //1A1A
    ContactNode *contact2;  //2B2B
    ContactNode *contact3;  //3C3C
    ContactNode *currContactEntry;  //4D4D
    contact1 = (ContactNode*)malloc(sizeof(ContactNode));
    contact2 = (ContactNode*)malloc(sizeof(ContactNode));
    contact3 = (ContactNode*)malloc(sizeof(ContactNode));

    //prompt the user 
    prompt(name, phone, SIZE);                          //function call
    printf("Person 1: %s, %s\n", name, phone);

    //place info into the head of the contact list
    InitializeContactNode(contact1, name, phone);       //function call

    //prompt the user for contact 2
    prompt(name, phone, SIZE);
    printf("Person 2: %s, %s\n", name, phone);

    //place contact2 info into the contact list
    InitializeContactNode(contact2, name, phone);
    //connect the two nodes
    InsertAfter(contact1, contact2);

    //prompt the user for contact 3 info
    prompt(name, phone, SIZE);
    printf("Person 3: %s, %s\n", name, phone);

    //place contact3 info into the contact list
    InitializeContactNode(contact3, name, phone);
    //connect the node to the end of the list
    InsertAfter(contact2, contact3);


    //print the contact list
    printf("\nCONTACT LIST\n");
    currContactEntry = contact1;

    while(currContactEntry != NULL) {
        PrintContactNode(currContactEntry);                     //function call
        printf("\n");
        currContactEntry = GetNext(currContactEntry);           //function call
    }

    return 0;
}

