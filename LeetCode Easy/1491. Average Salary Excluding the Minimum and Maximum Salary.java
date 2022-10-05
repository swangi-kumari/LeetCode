/***
1491. Average Salary Excluding the Minimum and Maximum Salary
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

Example 1:

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
Example 2:

Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
***/

class Solution {
    public double average(int[] salary) {
        // int n = salary.length;
        // Arrays.sort(salary);
        // double sum = 0;
        // for(int i = 1; i< n-1 ; ++i){
        //     sum = sum + salary[i];
        // }
        // return sum/(n-2);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = salary.length;
        double sum = 0;
        for(int i = 0; i < n ; i++){
            if(salary[i]>max){
                max = salary[i];
            }
            if (salary[i]<min){
                min = salary[i];
            }
            sum = sum + salary[i];                
        }
        double total = sum - min - max;
        return total/(n-2);
    }
}
