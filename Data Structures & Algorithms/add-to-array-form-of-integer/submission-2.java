class Solution {
        public int[] addToArrayForm(int[] num, int k) {
                List<Integer>res=new ArrayList<>();
                        int i=num.length-1;

                                while(i>=0||k>0){
                                            if(i>=0){
                                                            k+=num[i];
                                                                            i--;
                                                                                        }

                                                                                                    res.add(k%10);
                                                                                                                k/=10;
                                                                                                                        }

                                                                                                                                Collections.reverse(res);

                                                                                                                                        int[] ans=new int[res.size()];
                                                                                                                                                for (int j=0;j<res.size();j++) {
                                                                                                                                                            ans[j]=res.get(j);
                                                                                                                                                                    }
                                                                                                                                                                            return ans;
                                                                                                                                                                                }
                                                                                                                                                                                }

