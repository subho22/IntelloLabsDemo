import sys
import time
arg = sys.argv[1]


#argvalue=int(arg)


with open("F:/Users/subhajit/workspace/IntelloLabsDemo/file.txt", 'a') as target:
    for _ in range(5):
        target.write(arg+" ") 
        time.sleep(1)
    
    print(arg)
