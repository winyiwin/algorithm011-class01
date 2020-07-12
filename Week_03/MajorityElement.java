class MajorityElement {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums) {
            Integer compute = map.compute(n, (k, v) -> {
                if (v == null) {
                    return 1;
                }
                return ++v;
            });
            if (compute > nums.length/2) {
                return n;
            }
        }
        return 0;
    }
}
