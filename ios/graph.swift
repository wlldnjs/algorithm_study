// 너비 우선 탐색
// 시간 복잡도: 노드 수(V), 간선 수(E) 일 때
// O(V+E)
func BFS(graph: [String: [String]], start: String) -> [String] {
    var visitedQueue: [String] = []
    var needVisitQueue = [start]
    
    while(!needVisitQueue.isEmpty){
        let node = needVisitQueue.removeFirst()
        if visitedQueue.contains(node) { continue }
        
        visitedQueue.append(node)
        needVisitQueue += graph[node] ?? []
        
    }
    return visitedQueue
}

// 깊이 우선 탐색
// 시간 복잡도: 노드 수(V), 간선 수(E) 일 때
// O(V+E)
func DFS(graph: [String: [String]], start: String) -> [String] {
    var visitedQueue: [String] = []
    var needVisitStack: [String] = [start]
    
    while (!needVisitStack.isEmpty) {
        let node = needVisitStack.removeLast()
        if visitedQueue.contains(node) { continue }
        
        visitedQueue.append(node)
        needVisitStack += graph[node] ?? []
    }
    return visitedQueue
}
