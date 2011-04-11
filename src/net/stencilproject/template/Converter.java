package net.stencilproject.template;

public interface Converter<FROM, TO> {
	TO convert(FROM from) throws ConverterException;
}
