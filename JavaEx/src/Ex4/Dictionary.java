package Ex4;

public class Dictionary extends PairMap {

	private int s;

	public Dictionary() {
	}

	public Dictionary(int s) {
		this.s = 0;
		keyArray = new String[s];
		valueArray = new String[s];
	}

	@Override
	String get(String key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < keyArray.length; i++) {
			if (key.equals(keyArray[i]))
				return valueArray[i];
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		for (int i = 0; i < keyArray.length; i++) {
			if (key.equals(keyArray[i])) {
				keyArray[i] = key;
				valueArray[i] = value;
				return;
			}
		}
		keyArray[s] = key;
		valueArray[s] = value;
		s++;
	}

	@Override
	String delete(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			if (key.equals(keyArray[i])) {
				String val = valueArray[i];
				keyArray[i] = null;
				valueArray[i] = null;
				return val;
			}
		}
		return null;
	}

	@Override
	int length() {
		// TODO Auto-generated method stub
		return s;
	}

}
