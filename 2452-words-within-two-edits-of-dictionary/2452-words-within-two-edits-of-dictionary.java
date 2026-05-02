class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {        
        List<String> list = new ArrayList<>();
        for(String curr : queries){ 
            for(String dic : dictionary){ 
                int count = 0;
                for(int k = 0 ; k < curr.length() ;k++){ 
                    if(curr.charAt(k) != dic.charAt(k)){
                        count++;
                        if(count > 2){
                            break;
                        }
                    }
                }
                if(count <= 2){
                    list.add(curr);
                    break;
                }
            }
        }
        return list;
    }
}