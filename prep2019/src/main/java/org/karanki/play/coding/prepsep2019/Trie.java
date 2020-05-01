package org.karanki.play.coding.prepsep2019;

import java.util.HashMap;
import java.util.Map;

import org.omg.CORBA.Current;

public class Trie {
	
	class TrieNode {
		
		private Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
		private boolean isWord;
	}

	
	public final TrieNode root = new TrieNode();
	
	public void buildDictionalry(String [] words) {
		for(String word : words) {
			insertWord(word);
		}
	}
	
	public  void insertWord(String word) {
		TrieNode currentNode = root;
		for(int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			TrieNode tmpNode = currentNode.children.get(ch);
			if(tmpNode == null) {
				tmpNode = new TrieNode();
				currentNode.children.put(ch, tmpNode);
			}
			currentNode = tmpNode;
		}
		currentNode.isWord = true;
	}
	
	public void insertWordRec(TrieNode currentNode, String word, int index) {
		
		if(index == word.length()) {
			currentNode.isWord = true;
			return;
		}
		
		char ch = word.charAt(index);
		TrieNode tmpNode =  currentNode.children.get(ch);
		if(tmpNode == null) {
			tmpNode = new TrieNode();
			currentNode.children.put(ch, tmpNode);
		}
		
		insertWordRec(tmpNode, word, index+1);
	}
	
	public void insertWordRec(String word) {
		insertWordRec(root, word, 0);
	}
	
	public boolean search(String word) {
		TrieNode curNode = root;
		
		for(int index = 0; index < word.length(); index++) {
			TrieNode tmpNode = curNode.children.get(word.charAt(index));
			if(tmpNode == null) {
				return false;
			}
			
			curNode = tmpNode;
		}
		
		return curNode.isWord;
	}
	
	public boolean searchRec(TrieNode currentNode, String word, int index) {

		if(index == word.length()) {
			return currentNode.isWord;
		}
		
		TrieNode tmpNode = currentNode.children.get(word.charAt(index));
		
		if(tmpNode == null) {
 			return false;
		}	
		
		return searchRec(tmpNode, word, index+1);
	}
	
	public boolean delete(TrieNode node, String word, int index) {
		
		if(index == word.length()) {
			if(!node.isWord) return false;
			node.isWord = false;
			return node.children.size() == 0;
		}
		
		char ch = word.charAt(index);
		TrieNode tmpNode = node.children.get(ch);
		
		if(tmpNode == null) return false; 
		
		boolean shouldDeleteCurrentNode = delete(node, word, index+1);
		
		if(shouldDeleteCurrentNode) {
			node.children.remove(ch);
			return node.children.size() == 0;
		}
		
		return false;
	}
}
