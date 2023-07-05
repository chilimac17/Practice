#Michael Chillemi
#11/8/2021
#Problem 4 Hw 7



def SquareAndMultimodNumlyAlgorithm(baseNum, exNum, modNum) :
    answer = 1    
    baseNum = baseNum % modNum
    if (baseNum == 0) :
        return 0
 
    while (exNum > 0) :
       
        if ((exNum & 1) == 1) :
            answer = (answer * baseNum) % modNum
 
        
        exNum = exNum >> 1      
        baseNum = (baseNum * baseNum) % modNum
         
    return answer

if __name__ == "__main__":
    base = 2
    exponet = 5
    modulo = 13
    result = SquareAndMultimodNumlyAlgorithm(base,exponet,modulo)
    print("Base = ", base, "Exponet = ", exponet, "Mod = ", modulo )
    print("Answer = ", result)