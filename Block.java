package simple;

public class Block {
	
	public Datapoints[] data;
	public int previous_hash;
	public int hash;
	
	public Block(Datapoints[] data, int previous_hash) {
		this.data = data;
		this.previous_hash = previous_hash;
		int[] to_hash = {data.hashCode(), previous_hash};
		this.hash = to_hash.hashCode();
	}
	
	public int get_hash() {
		return hash;
	}
	
}
