def findSubArrays(arr, n):

    dict = {}

    output = []

    sum1 = 0
    for i in range(n):

        sum1 += arr[i]

        if sum1 == 0:
            output.append((0, i))
        al = []

        if sum1 in dict:

            al = dict.get(sum1)
            for it in range(len(al)):
                output.append((al[it] + 1, i))
        al.append(i)
        dict[sum1] = al
    return output


def printOutput(output):
    for i in output:
        print("Subarray found from Index " +
              str(i[0]) + " to " + str(i[1]))


if __name__ == '__main__':
    arr = [-2, 1, 0, -1, -2]
    n = len(arr)
    output = findSubArrays(arr, n)

    if (len(output) == 0):
        print("No subarray exists")
    else:
        printOutput(output)
