# char counter

def counter(a: list) -> int:
    return int(len(a)-1) # whoops

def loop():
    dummy = int(input("Enter positive integer to continue\t"))
    while dummy > 0:
        string_ct = str(input("Enter a string to count:  "))
        ctd_string = counter(string_ct)
        print(ctd_string)
        dummy = int(input("Enter positive integer to continue\t"))

loop()
