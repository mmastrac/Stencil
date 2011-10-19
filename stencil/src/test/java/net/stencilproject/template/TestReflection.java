package net.stencilproject.template;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import net.stencilproject.template.otherpackage.BooleanPropertyObject;
import net.stencilproject.template.otherpackage.NonPublicObjectFactory;

import org.junit.Test;

import com.google.common.collect.Maps;

public class TestReflection extends AbstractTemplateTest {
	@Test
	public void testBooleanProperties() throws TemplateParserException {
		Template template = parse("{{ x.boolean1 }} {{ x.boolean2 }} {{ x.boolean3 }}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", new BooleanPropertyObject());
		assertEquals("true true true", template.process(mapModel));
	}

	@Test
	public void testPackageProtectedObject() throws TemplateParserException {
		Template template = parse("{{ x.value }} {{ x.field }} {{ x.privateField }}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", new NonPublicObjectFactory().getPackageProtectedObject());
		assertEquals("1 2 ", template.process(mapModel));
	}

	@Test
	public void testPrivateObject() throws TemplateParserException {
		Template template = parse("{{ x.value }} {{ x.field }} {{ x.privateField }}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", new NonPublicObjectFactory().getPrivateObject());
		assertEquals("1 2 ", template.process(mapModel));
	}

	@Test
	public void testInstanceHelperMethods() throws TemplateParserException {
		TemplateRootScope rootScope = new TemplateRootScope();
		rootScope.put("x", new InstanceTestMethods());

		Template template = parse(
				rootScope,
				"{{ x.add_x('foo') }} {{x.add_x(1)}} {{x.sub_1(10)}} {{x.sub_1('10')}} {{x.self().sub_1(10)}} {{x.self().sub_1('10')}} {{x.add_together(1, 2)}}");
		assertEquals("foox 1x 9 9 9 9 3", template.process(null));
	}

	@Test
	public void testHelperEnum() throws TemplateParserException {
		TemplateRootScope rootScope = new TemplateRootScope();
		rootScope.addEnum(EnumValuesToImport.class);
		Template template = parse(rootScope,
				"{{ EnumValuesToImport.ENUM_A }} = {{ +EnumValuesToImport.ENUM_A }} {{ EnumValuesToImport.ENUM_B }} = {{ +EnumValuesToImport.ENUM_B }}");

		assertEquals("ENUM_A = 0 ENUM_B = 1", template.process(null));
	}

	@Test
	public void testPropertyOverridesField() throws TemplateParserException {
		Template template = parse("{{ x.x }}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", new OverrideFieldWithProperty());
		assertEquals("10", template.process(mapModel));
	}
}
