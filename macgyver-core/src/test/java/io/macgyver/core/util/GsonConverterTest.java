package io.macgyver.core.util;

import org.junit.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class GsonConverterTest extends AbstractConverterTest {

	@Test
	public void testGson() {
		JsonObject a = Xson.convert(jsonText, JsonObject.class);
		JsonElement a2 = Xson.convert(jsonText, JsonElement.class);

		a2 = Xson.convert(a, JsonElement.class);
	}

	@Test
	public void testNull() {
		org.junit.Assert.assertNull(Xson.convert(null, JsonElement.class));
	}

	@Test
	public void testJsonObject() {
		JsonObject x = Xson.convert(jsonText, JsonObject.class);

	}

	@Test(expected = ClassCastException.class)
	public void testInvalidTarget() {
		 Xson.convert(jsonText, JsonArray.class);

	}

	@Test
	public void testIdentityArray() {
		JsonArray x = Xson.convert(
				Xson.convert(jsonArrayText, JsonArray.class), JsonArray.class);

	}

	@Override
	@SuppressWarnings("rawtypes")
	public Class getAbstractNodeClass() {
		return JsonElement.class;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Class getObjectNodeClass() {
		return JsonObject.class;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Class getArrayNodeClass() {
		return JsonArray.class;
	}
}
