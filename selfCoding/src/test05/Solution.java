package test05;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.joining;
	import static java.util.stream.Collectors.toList;



	class Result {

	    /*
	     * Complete the 'fountainActivation' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER_ARRAY locations as parameter.
	     */

	    public static int fountainActivation(List<Integer> locations) {
	    		
	    	 int n = locations.size();

	         int arr[] = new int[n]; //배열 생성해주고

	         for (int i = 1; i <= n; i++) {

	             int left = Math.max(i - locations.get(i-1), 1);
	             int right = Math.min(i + locations.get(i-1), n);

	             arr[left - 1] = Math.max(arr[left - 1], right); //가장 오른쪽

	         }


	         int right = arr[0];
	         int nextRight = right;

	         int fountainActivate = 1;

	         for (int i = 1; i < n; i++) {
	             nextRight = Math.max(nextRight, arr[i]);
	             
	             //다음분수?로 증가해주기
	             if (i == right) {
	                 fountainActivate++;
	                 right = nextRight;
	             }


	         }

	         return fountainActivate;
	     }

	 }



	public class Solution {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int locationsCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> locations = IntStream.range(0, locationsCount).mapToObj(i -> {
	            try {
	                return bufferedReader.readLine().replaceAll("\\s+$", "");
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        })
	            .map(String::trim)
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = Result.fountainActivation(locations);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}



