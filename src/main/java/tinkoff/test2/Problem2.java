package tinkoff.test2;

class Problem2 {

    public int sum(int[] arg0) {
        int sum = 0;
        int min = -1;
        for(int i = 0; i < arg0.length; ++i) {
            sum += arg0[i];
            if(arg0[i] % 2 !=0)  {
                if(min == -1) {
                    min = arg0[i];
                }else if(arg0[i] < min) {
                    min = arg0[i];
                }
            }
        }
        if(sum % 2 == 0) {
            return sum;
        }
        return sum - min;
    }
}
