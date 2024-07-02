package com.manageway.web.converter;

import com.manageway.domain.user.records.Name;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;


@Component
public class StringToNameConverter implements Converter<String, Name> {
    @Override
    public Name convert(@NonNull String source) {
        return new Name(source);
    }
}
