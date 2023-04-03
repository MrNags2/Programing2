package patterns;
	import java.util.*;

	class Job implements Comparable<Job> {
	    int start, end, profit;
	    
	    Job(int start, int end, int profit) {
	        this.start = start;
	        this.end = end;
	        this.profit = profit;
	    }
	    
	    public int compareTo(Job other) {
	        return this.end - other.end;
	    }
	}

	public class JobSelection {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        List<Job> jobs = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            int start = sc.nextInt();
	            int end = sc.nextInt();
	            int profit = sc.nextInt();
	            jobs.add(new Job(start, end, profit));
	        }
	        Collections.sort(jobs);
	        int[] dp = new int[n];
	        dp[0] = jobs.get(0).profit;
	        for (int i = 1; i < n; i++) {
	            int include = jobs.get(i).profit;
	            int j = binarySearch(jobs, i);
	            if (j != -1) {
	                include += dp[j];
	            }
	            dp[i] = Math.max(include, dp[i-1]);
	        }
	        System.out.println(n - countSelectedJobs(jobs, dp) + " " + dp[n-1]);
	    }
	    
	    private static int binarySearch(List<Job> jobs, int i) {
	        int lo = 0, hi = i - 1;
	        while (lo <= hi) {
	            int mid = lo + (hi - lo) / 2;
	            if (jobs.get(mid).end <= jobs.get(i).start) {
	                if (jobs.get(mid+1).end <= jobs.get(i).start) {
	                    lo = mid + 1;
	                } else {
	                    return mid;
	                }
	            } else {
	                hi = mid - 1;
	            }
	        }
	        return -1;
	    }
	    
	    private static int countSelectedJobs(List<Job> jobs, int[] dp) {
	        int i = jobs.size() - 1, j = dp.length - 1;
	        int count = 0;
	        while (i >= 0 && j >= 0) {
	            if (jobs.get(i).profit + (i > 0 ? dp[j-1] : 0) == dp[j]) {
	                count++;
	                i--;
	                j--;
	            } else {
	                j--;
	            }
	        }
	        return count;
	    }
	}


