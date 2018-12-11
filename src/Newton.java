public class Newton {
    double int arr[][];
    double int n ;
    public Newton(int arr[][],int n){
        this.arr = arr;
        this.n = n;
    }

    private double fact(int n){
        double res = 1;
        for(int i=2;i<=n;i++) res*=i;
        return res;
    }

    private double findDelta(int i, int delta){
        if (delta == 1){
            return arr[1][i+1] - arr[1][i];
        }
        else return findDelta(int i-1,)

    }
    /**
     * this function use for equidistant nodes
     * 3 - 4 - 5 - 6 (Xi - X(i-1) = const)
     * @return double
     */
    public double solve_equal(double x){

        return 0;
    }

    /**
     * this function use for un-euidistant nodes (Xi - X(i-1) != const)
     * @param x
     * @return double
     */
    public double solve_not_equal(double x){
        return 0;
    }
}
