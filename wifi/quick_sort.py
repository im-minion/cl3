import xml.etree.ElementTree as etree
from threading import Thread, current_thread
a = []

def partition(a,low,high):
    i = ( low - 1)
    pivot = a[high]
    for j in range (low, high):
        if a[j] <= pivot:
            i = i+1
            a[i], a[j] = a[j], a[i]
    a[i+1],a[high] = a[high], a[i+1]
    return (i+1)

def quick_sort(a,low,high):
    if low<high:
        p = partition(a,low,high)
        t1 = Thread(target=quick_sort,args=(a,low,p-1))
        t1.start()
        t1.join()
        t2 = t1 = Thread(target=quick_sort,args=(a,p+1,high))
        t2.start()
        t2.join()
    return a

root = etree.parse('quick_data.xml').getroot()

for i in range(0,10):
    a.append(int(root[i].text)) 

result = quick_sort(a,0,9)
for i in range(0,10):
    print ("%d" %result[i])