package simple;

import java.util.ArrayList;

public class Blockchain
{
	
	public ArrayList<Block> blocks = new ArrayList();
	public int last_hash = 0;
	
	public Blockchain(Datapoints[] data)
	{
		/**
		Adding genesis block upon creation of the blockchain
		*/
		add_block(data);
	}
	
	public void add_block(Datapoints[] data)
	{
		Block next = new Block(data, last_hash);
		blocks.add(next);
		this.last_hash = next.get_hash();
	}
	
	private class Block 
	{	
		public Datapoints[] data;
		public int hash;
		
		public Block(Datapoints[] data, int previous_hash) 
		{
			this.data = data;
			int[] to_hash = {data.hashCode(), previous_hash};
			this.hash = to_hash.hashCode();
		}
		
		public int get_hash() 
		{
			return hash;
		}
		
	}
}
