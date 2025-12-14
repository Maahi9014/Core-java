class Subset {
  public void sums(int[] nums1,int index,ArrayList<Integer> al,ArrayList<Integer> ans){
      if(index==nums1.length){
         int sum=0;
         for(int i=0;i<al.size();i++){
          sum+=al.get(i);
         }
        ans.add(sum);
        return ;
      }
      al.add(nums1[index]);
      sums(nums1,index+1,al,ans);
      al.remove(al.size()-1);
      sums(nums1,index+1,al,ans);
  }
    public List<Integer> subsetSums(int[] nums) {
        List<Integer> su= new ArrayList<>();
        sums(nums,0,new ArrayList<>(),su);
        return su;
    }
    public static void main(String[] args){
        int a[]={1,2,0};
        Subset s=new Subset();
        System.out.println(s.subsetSums(a));
    }
}