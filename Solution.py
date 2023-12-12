def find_max_not_in_subarray(n, q, permutation, queries):
    last_occurrence = [0] * (n + 1)
    max_num = n
    result = []
 
    for i in range(n - 1, -1, -1):
        last_occurrence[permutation[i]] = i + 1
 
    for query in queries:
        l, r = query
        max_not_in_subarray = max_num
 
        for num in range(max_not_in_subarray, 0, -1):
            if last_occurrence[num] > r or last_occurrence[num] < l:
                result.append(num)
                break
 
        print(result[-1])
 
# Input
n, q = map(int, input().split())
permutation = list(map(int, input().split()))
queries = [list(map(int, input().split())) for _ in range(q)]
 
# Output
find_max_not_in_subarray(n, q, permutation, queries)
