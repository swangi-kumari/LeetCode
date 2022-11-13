class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int size = arr.length /3;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<arr.length ; i++){
            if (mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue()>size){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}