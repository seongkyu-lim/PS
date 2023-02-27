package baekjoon.no22865;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static int V;
	static ArrayList<ArrayList<Node>> graph;


    static class Node {
		int idx, cost;

		Node(int idx, int cost) {
			this.idx = idx;
			this.cost = cost;
		}
	}

    public static void main(String[] args) throws IOException {
        /*
         * 가장 먼 곳
         * 
         * dijkstra
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        V = Integer.parseInt(br.readLine());
        // System.out.println("V : "+ V);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] friends = new int[3];
        for(int i=0; i<3; i++){
            friends[i] = Integer.parseInt(st.nextToken());
        }
        graph = new ArrayList<>();
        for (int i = 0; i < V + 1; i++) {
			graph.add(new ArrayList<Node>());
		}

        int E = Integer.parseInt(br.readLine());
        for(int i=0; i<E; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

            graph.get(s).add(new Node(e, c));
            graph.get(e).add(new Node(s, c));   
        }

        int answer = 0;
        int minWeight = Integer.MIN_VALUE;

        int[] dist1 = dijkstra(friends[0]);
        int[] dist2 = dijkstra(friends[1]);
        int[] dist3 = dijkstra(friends[2]);

        for(int i=1; i<V+1; i++){
            if(i==friends[0] || i==friends[1] || i==friends[2]) continue;

            int min = Integer.MAX_VALUE;
            min = Math.min(min, dist1[i]);
            min = Math.min(min, dist2[i]);
            min = Math.min(min, dist3[i]);

            if(min > minWeight){
                answer = i;
                minWeight = min;
            }
        }


        
        System.out.println(answer);
    }

    private static int[] dijkstra(int start){
        int[] dist = new int[V + 1];
		for (int i = 0; i < V + 1; i++) {
			dist[i] = Integer.MAX_VALUE;
		}

        PriorityQueue<Node> q = new PriorityQueue<Node>((o1, o2) -> Integer.compare(o1.cost, o2.cost));
        q.offer(new Node(start, 0));
        dist[start] = 0;
		while (!q.isEmpty()) {
			Node curNode = q.poll();
			if (dist[curNode.idx] < curNode.cost) {
				continue;
			}

			for (int i = 0; i < graph.get(curNode.idx).size(); i++) {
				Node nxtNode = graph.get(curNode.idx).get(i);
				if (dist[nxtNode.idx] > curNode.cost + nxtNode.cost) {
					dist[nxtNode.idx] = curNode.cost + nxtNode.cost;
					q.offer(new Node(nxtNode.idx, dist[nxtNode.idx]));
				}
			}
		}

        return dist;
    }
    
}
