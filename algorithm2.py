import random
arr1=['G','T','A','G','G','C']
arr2=['A','G','C','G','A','C']
array=[]
for x in range(len(arr1)+1):
    part=[]
    for y in range(len(arr2)):
        part.append(0)
    array.append(part)
for i in range(len(arr1)):
    for j in range(len(arr2)):
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
        if(arr1[i] == arr2[j]):
            temp_l.append(1)
        array[i][j]=max(temp_l)
print()
print(arr1)
for z in range(len(arr1)):
    print(arr1[z],array[z])
print("new Stuff!!")
