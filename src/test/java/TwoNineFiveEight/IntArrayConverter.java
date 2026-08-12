package TwoNineFiveEight;

import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class IntArrayConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(Object source, Class<?> targetType) {
        String raw = source.toString().replace("[", "").replace("]", "").trim();
        String[] parts = raw.split(",");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i].trim());
        }
        return result;
    }
}
