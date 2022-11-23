myIntegerList = [9, 4, 3, 2, 8]
myFloatList = [2.0, 9.1, 5.9, 8.123432]
myCharList = ['p', 'y', 't', 'h', 'o', 'n']
myStringList = ["Hello", "Python", "Ok done!"]

myNewList = myStringList
print (myNewList)

myNewList = myStringList[0:2]
print (myNewList)


myList1 = range(9)
print (myList1)



# APPEND list elements
emptyList = []
emptyList.append('The Big Bang Theory')
emptyList.append('F.R.I.E.N.D.S')
emptyList.append('How I Met Your Mother')
emptyList.append('Seinfeld')
print (emptyList)


# find number of elements in a list
print (len(emptyList))

# accessing using index - 0, 1, 2, 3
print (emptyList[1])
