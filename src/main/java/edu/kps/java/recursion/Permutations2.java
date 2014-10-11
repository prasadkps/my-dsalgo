package edu.kps.java.recursion;

/**
 * Created with IntelliJ IDEA.
 * User : kp
 * Date : 10-10-2014
 * Time : 08:17 PM
 */
public class Permutations2 {
    private boolean[] used;
    private StringBuilder out = new StringBuilder();
    private final String in;
    public Permutations2( final String str ){
        in = str;
        used = new boolean[ in.length() ];
    }
    public void permute( ){
        if( out.length() == in.length() ){
            System.out.println( out );
            return;
        }
        for( int i = 0; i < in.length(); ++i ){
            if( used[i] ) continue;
            out.append( in.charAt(i) );
            used[i] = true;
            permute();
            used[i] = false;
            out.setLength( out.length() - 1 );
        }
    }

    public static void main(String[] args) {
        Permutations2 perm = new Permutations2("ab");
        perm.permute();
    }
}