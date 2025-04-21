package BOJ.Silver;

import java.util.Scanner;

public class TreeTraversal {
    static int [][] tree = new int[26][2]; //[노드의개수][0: 왼쪽, 1:오른쪾]

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            char parent = input[0].charAt(0);
            char left = input[1].charAt(0);
            char right = input[2].charAt(0);

            int p = parent - 'A';
            tree[p][0] = (left == '.' ? -1 : left - 'A'); // 왼쪽 자식
            tree[p][1] = (right == '.' ? -1 : right - 'A'); // 오른쪽 자식
        }

        preorder(0);
        System.out.println();
        inorder(0);
        System.out.println();
        postorder(0);

    }

    static void preorder(int node){
        if (node == -1) return;

        System.out.print((char)(node + 'A'));
        preorder(tree[node][0]);
        preorder(tree[node][1]);
    }

    static void inorder(int node){
        if (node == -1) return;

        inorder(tree[node][0]);
        System.out.print((char)(node + 'A'));
        inorder(tree[node][1]);
    }

    static void postorder(int node){
        if (node == -1) return;

        postorder(tree[node][0]);
        postorder(tree[node][1]);
        System.out.print((char)(node + 'A'));
    }
}
