import xml.etree.ElementTree as etree #package for taking xml data

# pos = 3
pos = int(etree.parse('8_queen_data.xml').getroot()[0].text) #taking value frokm xml file
print(pos)
positions = [-1,-1,-1,-1,-1,-1,-1,-1,-1] # inz 
def NQueen(queen_number, N): # function to place queens
    for col in range (1,N+1): # traversing all the columns from 1 to N+1
        if isPossible(queen_number, col): # if possible then place the queen
            positions[queen_number] = col # if possible then put at col position
            if queen_number == N and positions[1] == pos: # if all columns traverased and the intial positon of queen is 3 then print the values
                print (positions[1:N+1])
            else:
                NQueen(queen_number+1,N)

def isPossible(queen_number, col): # function for posibility
    for i in range (1,queen_number): # range 1 to queen number
        if positions[i] == col or abs(positions[i] - col) == abs(i - queen_number): 
            return False # not possible
    return True # possible

NQueen(1,8)
