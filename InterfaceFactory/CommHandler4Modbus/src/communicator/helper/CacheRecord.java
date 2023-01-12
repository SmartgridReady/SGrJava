package communicator.helper;

import java.time.Instant;

public class CacheRecord<V> {
	
	private final V value;
	private final Instant lastAccess;
	
	public CacheRecord(V value, Instant lastAccess) {
		this.value = value;
		this.lastAccess = lastAccess;
	}
	
	public boolean isExpired(Long timeToLiveMs) {
		if (timeToLiveMs != null && lastAccess != null) {
			return System.currentTimeMillis() >= lastAccess.toEpochMilli() + timeToLiveMs;
		}
		return true;
	}	
	public V getValue() {
		return value;
	}
}
