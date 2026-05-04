class Solution {
    public int numSpecial(int[][] mat) 
    {
        int[] Col = new int[mat[0].length];
        int[] Row = new int[mat.length];
        int iRet = 0;

        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                if(mat[i][j] == 1)
                {
                    Row[i]++;
                    Col[j]++;
                }
            }
        } 

        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                if(mat[i][j] == 1)
                {
                    if((Row[i] - Col[j]) == 0 && Row[i] == 1)
                    {
                        iRet++;
                    }
                }
            }
        }
        return iRet;
    }
}