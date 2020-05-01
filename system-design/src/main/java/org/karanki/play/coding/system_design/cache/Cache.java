package org.karanki.play.coding.system_design.cache;

/**
 * Generic Cache Implmentation.
 * 
 * @author Koteswara R. Karanki
 * @since Aug 2017
 *
 */
public interface Cache {
	
	public void put(Object key, Object value);
	
	public Object get(Object key);
	
}
