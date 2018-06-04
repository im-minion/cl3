from threading import Thread
sorted = False

def sort(x,l):
	global sorted
	for i in range(l, len(x)-1, 2):
			if x[i] > x[i+1]:
				x[i], x[i+1] = x[i+1], x[i]
				sorted = False

def oddevensort(x):
	global sorted
	sorted = False
	while not sorted:
		sorted = True
		t =Thread(sort(x,0))
		t1 =Thread(sort(x,1))
		t.start()
		t1.start()
		t.join()
		t1.join()
	return x

x = [7,99,8,54,5,55,5,6,66]
result = oddevensort(x)
print(result)