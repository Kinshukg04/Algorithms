def equilibrium(arr):
    leftsum=0
    n = len(arr)
    s = sum(arr)
    for i in range(n):
        s -= arr[i]
        leftsum += arr[i]
        if(s == leftsum):
            print("First equilibrium index is: " , i)
            break
arr = [-2,1,0,1-2]
equilibrium(arr)