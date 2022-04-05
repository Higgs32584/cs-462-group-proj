import random
arr1=[]
arr2=[]

array=[[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]]
for x in range(5):
    arr1.append(random.choice(['G','C','A','T']))
    arr2.append(random.choice(['G','C','A','T']))
# s[i][j] = max( s[i-1][j], s[i][j-1], s[i-1][j-1] + 1 if there is a match between the last characters of the 2 substrings)

for i in range(5):
    for j in range(5):
        temp_l=[]
        if(i > 0 and j > 0):
            if(arr1[i] == arr2[j]):
                temp_l.append((array[i-1][j-1])+1)
            else:
                 temp_l.append((array[i-1][j-1]))
        if(i > 0):
            temp_l.append(array[i-1][j])
        if(j > 0):
            temp_l.append(array[i][j-1])
        temp_l.append(0)
        array[i][j]=max(temp_l)
print()
print(arr2)
for z in range(5):
    print(arr1[z],array[z])
print("new Stuff!!")
