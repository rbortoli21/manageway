package com.manageway.web.converter;

import com.manageway.domain.entity.Id;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class StringToIdConverter implements Converter<String, Id> {
    @Override
    public Id convert(@NonNull String source) {
        return new Id(UUID.fromString(source));
    }
}
