package LeetCode;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {


        int m = accounts.length;
        int n = accounts[0].length;
        int[] wealthCustomer = new int[m];
        int max=0;

        for(int i = 0; i<m ; i++){


            for(int j = 0;j<n;j++){
                wealthCustomer[i] = accounts[i][j]+wealthCustomer[i];
            }

            if(wealthCustomer[i]>max){
                max = wealthCustomer[i];
            }

        }

    return max;

    }

}
