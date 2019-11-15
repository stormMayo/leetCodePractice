public class QuickUnionWithWeighted {
    private int[] id;
    private int[] sz;
    public QuickUnionWithWeighted(int N){
        id = new int[N];
        sz = new int[N];
        for(int i = 0 ; i < id.length ; i++){
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int i){
        while (id[i] != i){
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p,int q){
        return root(p) ==root(q);
    }

    public void union(int p , int q){
        int i = root(p);
        int j = root(q);
        if(i == j){
            return;
        }
        if(sz[i] < sz[j]){
            sz[j] += sz[i];
            id[i] = j;
        }else {
            sz[i] += sz[j];
            id[j] = i;
        }

    }

}
