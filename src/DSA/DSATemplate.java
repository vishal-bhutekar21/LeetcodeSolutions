package DSA;

import java.util.*;

public class DSATemplate {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 5;
        int[] arr = {5,2,8,1,3};

        Arrays.sort(arr);

        for(int x: arr) System.out.print(x+" ");
        System.out.println();

        System.out.println(sum(arr));
        System.out.println(max(arr));
        System.out.println(min(arr));

        String s="12345";

        int num=Integer.parseInt(s);
        String str=String.valueOf(num);

        char[] ch=s.toCharArray();
        String again=new String(ch);

        reverse(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(gcd(24,18));
        System.out.println(lcm(24,18));
        System.out.println(isPrime(17));
        System.out.println(power(2,10));

        prefixSum(arr);
        suffixSum(arr);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.remove(Integer.valueOf(10));

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,10);
        map.getOrDefault(2,0);

        HashSet<Integer> set=new HashSet<>();
        set.add(5);

        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.poll();

        Deque<Integer> dq=new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerLast(2);
        dq.pollFirst();

        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.pop();

        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());

        StringBuilder sb=new StringBuilder();
        sb.append("Hello");
        sb.reverse();

        char c='A';
        int ascii=c;
        char fromAscii=(char)65;

        System.out.println(binary(13));
        System.out.println(decimal("1101"));
    }

    static int sum(int[] arr){
        int s=0;
        for(int x:arr) s+=x;
        return s;
    }

    static int max(int[] arr){
        int ans=arr[0];
        for(int x:arr) ans=Math.max(ans,x);
        return ans;
    }

    static int min(int[] arr){
        int ans=arr[0];
        for(int x:arr) ans=Math.min(ans,x);
        return ans;
    }

    static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

    static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }

    static int lcm(int a,int b){
        return a/gcd(a,b)*b;
    }

    static long power(long a,long b){
        long ans=1;
        while(b>0){
            if((b&1)==1) ans*=a;
            a*=a;
            b>>=1;
        }
        return ans;
    }

    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0) return false;
        return true;
    }

    static boolean[] sieve(int n){
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
        if(n>=0) prime[0]=false;
        if(n>=1) prime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i)
                    prime[j]=false;
            }
        }
        return prime;
    }

    static int[] prefixSum(int[] arr){
        int[] pre=new int[arr.length];
        if(arr.length==0) return pre;
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++)
            pre[i]=pre[i-1]+arr[i];
        return pre;
    }

    static int[] suffixSum(int[] arr){
        int[] suf=new int[arr.length];
        if(arr.length==0) return suf;
        suf[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
            suf[i]=suf[i+1]+arr[i];
        return suf;
    }

    static int binarySearch(int[] arr,int target){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return -1;
    }

    static String binary(int n){
        return Integer.toBinaryString(n);
    }

    static int decimal(String bin){
        return Integer.parseInt(bin,2);
    }

    static boolean palindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static int countDigits(int n){
        return String.valueOf(Math.abs(n)).length();
    }

    static int reverseNumber(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }

    static class Pair{
        int first;
        int second;

        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
}

/*
==========================
COMMON CONVERSIONS
==========================

String -> int
int x=Integer.parseInt(s);

String -> long
long x=Long.parseLong(s);

int -> String
String s=String.valueOf(x);

long -> String
String s=String.valueOf(x);

String -> char[]
char[] ch=s.toCharArray();

char[] -> String
String s=new String(ch);

char -> int
int x=c;

int -> char
char c=(char)x;

Sort
Arrays.sort(arr);

Fill
Arrays.fill(arr,-1);

Copy
int[] copy=Arrays.copyOf(arr,arr.length);

Print
System.out.println(Arrays.toString(arr));

2D Print
System.out.println(Arrays.deepToString(matrix));

Reverse String
new StringBuilder(s).reverse().toString();

Max Heap
PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

Min Heap
PriorityQueue<Integer> pq=new PriorityQueue<>();

HashMap Frequency
map.put(x,map.getOrDefault(x,0)+1);

HashSet
set.add(x);
set.contains(x);

Queue
offer poll peek

Deque
offerFirst offerLast pollFirst pollLast

Stack
push pop peek

*/