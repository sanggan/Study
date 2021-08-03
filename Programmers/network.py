def DFS (n,computers,answers,index,currNet):
    answers[index] = currNet
    for i in range(index+1,n):
        if(answers[i]==-1 and computers[index][i]==1):
            answers[i] = currNet
            DFS(n,computers,answers,i,currNet)

def solution(n, computers):
    answer = 0
    answers = [-1]*n
    currNet = 1
    for i in range(n):
        if(answers[i] == -1):
            DFS(n,computers,answers,i,currNet)
            currNet+=1
    answer = max(answers)
    return answer


n = 3

computers = [[1, 1, 0], [1, 1, 0], [0, 0, 1]]

print(solution(n,computers))