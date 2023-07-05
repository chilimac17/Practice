#Problem Number 3
#Michael Chillemi

def decryptMessage(key, message):
    decrypted = ''
    LETTERS = 'ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ'
    LETTERS = LETTERS.lower()
    for chars in message:
        if chars in LETTERS:
            num = LETTERS.find(chars)
            num -= key
            decrypted += LETTERS[num]

    return decrypted

def displayAnswer():
    ciphertext = "gyznkjgeycktzheznkkburazoutulroqkotzurubkcgygiikrkxgzkjcnozklgtmnosykrlhkmgtzumxucgcgxkulozznuamnotnoyiutyiouaytkyynkqtkctuzcngzrubkcgyozsgtolkyzkjozykrlzunosgygbuojotnoyhkotmgnatmxeginotmekgxtotmbuojzngzirgsuaxkjzuhklorrkjozcgygvgotgtjgtatxkyzgtjozxkikobkjkgyksktzutreheznkzuainulznktkcmujoyvxkyktikgzyainzoskyrubkcgypuezunosgcorjqkktznxorrotmygzoylgizouthazcnktgcgelxusnoymujznkvgotgtjznkatxkyzxkzaxtkjznkbuojotnosyvxgtmavgtjvxkyykjgmgotyznoscoznozyksvzotkyygtjznknatmkxmtgckjgtjmtgckjatikgyotmre"
    myKey = 6
    print("Cipher text is :", ciphertext)
    plaintext = decryptMessage(myKey, ciphertext)
    print("Plain Text is:  ", plaintext)


displayAnswer()