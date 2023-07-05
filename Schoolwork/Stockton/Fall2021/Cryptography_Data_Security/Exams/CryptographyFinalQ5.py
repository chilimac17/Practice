#michael chillemi 
from math import sqrt

def checkPrime(num):
    prime_flag = 0
  
    if(num > 1):
        for i in range(2, int(sqrt(num)) + 1):
         if (num % i == 0):
            prime_flag = 1
            break
        if (prime_flag == 0):
            return True
        else:
         return False
    else:
        return False



def printGenerators(num,gList):
    print("All generators for ", num)
    for i in range(num):
        gList.append(i)
        print(i)




def printPrimativeElements(glist,plist):
    for i in range(len(glist)):
        if checkPrime(glist[i]) == True:
            plist.append(glist[i])
        
    print("Primative Elements")
    print(plist)
    
        

def main():
    genList = []
    primList = []
    print('Enter a Prime Number ')
    userNum = int(input())
    
    if checkPrime(userNum) == True:
        
        printGenerators(userNum,genList)
        printPrimativeElements(genList,primList)
    else:
        print(userNum, " is not a prime number please enter a prime number ")
        main()

    

if __name__ == '__main__':
    main()
