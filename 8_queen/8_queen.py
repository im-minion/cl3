import xml.etree.ElementTree as etree

# pos = 3
pos = int(etree.parse('8_queen_data.xml').getroot()[0].text)
print(pos)
positions = [-1,-1,-1,-1,-1,-1,-1,-1,-1]

def NQueen(queen_number, N):
    for col in range (1,N+1):
        if isPossible(queen_number, col):
            positions[queen_number] = col
            if queen_number == N and positions[1] == pos:
                print (positions[1:N+1])
            else:
                NQueen(queen_number+1,N)

def isPossible(queen_number, col):
    for i in range (1,queen_number):
        if positions[i] == col or abs(positions[i] - col) == abs(i - queen_number):
            return False
    return True

NQueen(1,8)
