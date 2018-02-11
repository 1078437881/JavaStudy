package com.wyb.reflect.example;

import java.lang.reflect.Field;

public class ReflectUtils {

	public static <T> T clone(T clone, T beCloned) {
		if (clone == null || beCloned == null) {
			return null;
		}
		if (clone.getClass() != beCloned.getClass()) {
			return null;
		}
		@SuppressWarnings("rawtypes")
		Class cls = beCloned.getClass();
		// Method methods[] = cls.getDeclaredMethods();
		Field[] allField = cls.getDeclaredFields();
		if (allField == null || !(allField.length > 0)) {
			return null;
		}
		for (Field f : allField) {
			f.setAccessible(true);
			try {
				f.set(clone, f.get(beCloned));
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				f.setAccessible(false);
			}

		}
		return clone;
	}
}
