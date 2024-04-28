package project.main.ann;

import java.lang.reflect.Field;

public class ToStringWrapper {
	public ToStringWrapper() {}

	@Override
	public String toString() {
		Field[] fields = this.getClass().getFields();
		String result = "";
		for(Field field : fields) {
			Value value = field.getAnnotation(Value.class);
			if(value == null) continue;
			if(value.isValid() == false) continue;
			result.concat("[").concat(field.getName()).concat("=");
			if(value.value().equals("*"))
				result = result.concat(field.toString());
			else result = result.concat(value.value());
			result = result.concat("]");
		}
		return result;
	}
	
	
}
