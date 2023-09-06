package org.temp;

import java.util.ArrayList;
import java.util.List;

public class Temp {
    static int prev=-1;
    static boolean msgStart=false;
    static int start =-1;
    static int end = -1;
    static List<String>msgs;
    static StringBuilder sb;
    public static void main(String[] args) {
        int[] seq = new int[]{1,2,3,5,6,7,8,4};
        String ch = "-by-hi-e";
        for(int i=0;i<seq.length;i++)
            fun(seq[i],ch.charAt(i));
        for(int i=0;i<msgs.size();i++){
            System.out.println(msgs);
        }
    }


    static void fun(int seqNum, Character ch){
        if(seqNum<prev) {
            // find and remove the right msg
            removeMsg(seqNum);
        }
        if(ch=='-')
        {
            if(msgStart==false){
                msgStart=true;
            }else{
                sb.append("-"+seqNum);
                printer(sb.toString());
            }
            sb=new StringBuilder();
            sb.append(seqNum+"-");
            return;
        }
        // valid seq num and just another character
        sb.append(ch);
        prev = seqNum;
    }

    private static void removeMsg(int seqNum) {
        for(int i=0;i<msgs.size();i++){
            String msg = msgs.get(i);
            int start = msg.charAt(0)-'0';
            int end = msg.charAt(msg.length()-1)-'0';
            if(seqNum>start&&seqNum<end){
                msgs.remove(i);
            }
        }
    }

    private static void printer(String toString) {
        if(msgs==null)
            msgs=new ArrayList<>();
        msgs.add(toString);
        //System.out.println(toString);
    }
}
