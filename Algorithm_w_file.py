import random
arr1=['Spring 2022',
'Hi',
'Spring 2022',
'After Spring break',
'Masks are optional',
'Starting March 18, 2022',
'Until the end of',
'May']
arr2=['Hi',
'This is',
'Spring 2022',
'Maybe',
'After Spring break',
'Masks are optional',
'Up To',
'May',
'Until the end of the semester',
'Then it is summer?']
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
    print(array[z])
print("new Stuff!!")