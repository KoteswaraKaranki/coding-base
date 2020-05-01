package org.karanki.play.coding.prepsep2019;

import java.util.HashSet;
import java.util.Set;

public class Boggle {

	public final static String[] dictionary = new String[19];
	
		
	public static Set<String> doBoggle(char [][]boggle)  {
		
		Set<String> validWords = new HashSet();
		
		
		return validWords;
	}
	
	private char[] getNeighbours(char[][] boggle, int rowNo, int colNo) {
	
		return new char[]{};
	}
	
	public static void main(String[] args) {
	
		char boggle[][] = {
				
			{'c','n','t','s','s'},
			{'d','a','t','i','n'},
			{'o','o','m','e','l'},
			{'s','i','k','n','d'},
			{'p','i','c','l','e'},
		};
		
		Trie trie = new Trie();
		
		trie.insertWord("can");
		trie.insertWord("cat");
		trie.insertWord("cap");
		
		System.out.println(trie.search("can"));
		System.out.println(trie.search("cat"));
		System.out.println(trie.search("catt"));
		System.out.println(trie.search("capp"));
		System.out.println(trie.search("app"));
		
		System.out.println(trie.searchRec(trie.root, "can", 0));
		System.out.println(trie.searchRec(trie.root, "cat", 0));
		System.out.println(trie.searchRec(trie.root, "catt", 0));
		System.out.println(trie.searchRec(trie.root, "capp", 0));
		System.out.println(trie.searchRec(trie.root, "app", 0));
		
		//System.out.println(Boggle.doBoggle(boggle));

	}
	
	
	static {
		dictionary[0] = "apple";
		dictionary[1] = "pickle";
		dictionary[2] = "side";
		dictionary[3] = "kick";
		dictionary[4] = "sick";
		dictionary[5] = "mood";
		dictionary[6] = "cat";
		dictionary[7] = "cats";
		dictionary[8] = "man";
		dictionary[9] = "super";
		dictionary[10] = "antman";
		dictionary[11] = "godzilla";
		dictionary[12] = "dog";
		dictionary[13] = "dot";
		dictionary[14] = "sine";
		dictionary[15] = "cos";
		dictionary[16] = "signal";
		dictionary[17] = "bitcoin";
		dictionary[18] = "zapper";
	}
	
}
