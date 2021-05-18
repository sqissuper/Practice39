package test;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * ClassName:TextDemo1
 * Package:test
 * Description:
 *
 * @Author:HP
 * @date:2021/5/18 11:21
 */
public class TextDemo1 {
    // 两数相加
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        if(l1 == null && l2 == null) return null;
//        int carry = 0;
//        ListNode head = null;
//        ListNode cur = null;
//        while(l1 != null || l2 != null) {
//            int n1 = l1 == null ? 0 : l1.val;
//            int n2 = l2 == null ? 0 : l2.val;
//            int sum = n1 + n2 + carry;
//            if(head == null) {
//                head = cur = new ListNode(sum % 10);
//            } else {
//                cur.next = new ListNode(sum % 10);
//                cur = cur.next;
//            }
//            carry = sum / 10;
//            if(l1 != null) {
//                l1 = l1.next;
//            }
//            if(l2 != null) {
//
//                l2 = l2.next;
//            }
//        }
//        if(carry > 0) cur.next = new ListNode(carry);
//        return head;
//    }

    //最长回文子串
//    public static String longestPalindrome(String s) {
//        int n = s.length();
//        if(n == 1) return s;
//        String str = "";
//        int ret = 0;
//        for(int i = 0; i < n - 1; i++) {
//            for(int j = 1; j <= n; j++) {
//                if(isPalindrome(s,i,j - 1) && (j - i >= ret)) {
//                    ret = j - i;
//                    str = s.substring(i,j);
//                }
//            }
//        }
//        return str;
//    }
//    public static boolean isPalindrome(String s,int i,int j) {
//        while(i <= j) {
//            if(s.charAt(i) != s.charAt(j)) return false;
//            i++;
//            j--;
//        }
//        return true;
//    }

    //电话号码的字母组合
//    public List<String> letterCombinations(String digits) {
//        List<String> list = new ArrayList<>();
//        if(digits == null || digits.length() == 0) return list;
//        Map<Integer,String> map = new HashMap<>();
//        map.put(2,"abc");
//        map.put(3,"def");
//        map.put(4,"ghi");
//        map.put(5,"jkl");
//        map.put(6,"mno");
//        map.put(7,"pqrs");
//        map.put(8,"tuv");
//        map.put(9,"wxyz");
//
//        dfs(digits,map,list,0,new StringBuilder());
//        return list;
//    }
//    public void dfs(String s,Map<Integer,String> map,List<String> list,int idx,StringBuilder sb){
//        if(idx == s.length()) {
//            list.add(sb.toString());
//        } else {
//            int tmp = s.charAt(idx) - '0';
//            String ret = map.get(tmp);
//            for(int i = 0; i < ret.length(); i++) {
//                sb.append(ret.charAt(i));
//                dfs(s,map,list,idx + 1,sb);
//                sb.deleteCharAt(idx);
//            }
//        }
//    }

    //不用加减乘除做加法
//    public static int Add(int num1,int num2) {
//        while(num2 != 0) {
//            int tmp = num1 ^ num2;
//            num2 = (num1 & num2) << 1;
//            num1 = tmp;
//        }
//        return num1;
//    }
    public static void main(String[] args) {
//        int a = 3;
//        int b = 4;
//        System.out.println(Add(a, b));
//        String s = "babad";
//        System.out.println(longestPalindrome(s));
//        StringBuilder sb = new StringBuilder();
//        sb.deleteCharAt()
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            BigInteger a = sc.nextBigInteger();
//            BigInteger b = sc.nextBigInteger();
//            BigInteger c = sc.nextBigInteger();
//            if(a.add(b).compareTo(c) > 0 && a.add(c).compareTo(b) > 0 && b.add(c).compareTo(a) > 0) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
//        }

    }
}
