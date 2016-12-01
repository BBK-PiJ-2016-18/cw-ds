/**
 * A sampleable list can be sampled. 
 * 
 * @author PiJ
 */
public class SampleableListImpl extends ArrayList implements SampleableList {
	/**
	 * Returns a list containing the first, third, fifth... items of this list, or an empty list if the list is empty. 
	 * 
	 * @return a list containing the first, third, fifth... items of this list
	 */
	public SampleableListImpl sample() {
		if (this.isEmpty() == true) {
			return this;
		}
		SampleableListImpl sampleList = new SampleableListImpl();
		for (int i = 0; i < this.size(); i = i + 2) {
			sampleList.add(this.get(i).getReturnValue());
		}
		return sampleList;
	}
}
