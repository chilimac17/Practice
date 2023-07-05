def main():
    ciphertext = "gyznkjgeycktzheznkkburazoutulroqkotzurubkcgygiikrkxgzkjcnozklgtmnosykrlhkmgtzumxucgcgxkulozznuamnotnoyiutyiouaytkyynkqtkctuzcngzrubkcgyozsgtolkyzkjozykrlzunosgygbuojotnoyhkotmgnatmxeginotmekgxtotmbuojzngzirgsuaxkjzuhklorrkjozcgygvgotgtjgtatxkyzgtjozxkikobkjkgyksktzutreheznkzuainulznktkcmujoyvxkyktikgzyainzoskyrubkcgypuezunosgcorjqkktznxorrotmygzoylgizouthazcnktgcgelxusnoymujznkvgotgtjznkatxkyzxkzaxtkjznkbuojotnosyvxgtmavgtjvxkyykjgmgotyznoscoznozyksvzotkyygtjznknatmkxmtgckjgtjmtgckjatikgyotmre"
    myKey = 6
    print("Cipher text is :", ciphertext)
    plaintext = decryptMessage(myKey, ciphertext)
    print("Plain Text is:  ", plaintext)
    
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

if name == 'main':
    main()
