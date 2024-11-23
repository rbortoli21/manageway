package com.manageway.web.converter;

import com.manageway.domain.entity.TenantId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class StringToTenantIdConverter implements Converter<String, TenantId> {
    @Override
    public TenantId convert(@NonNull String source) {
        return new TenantId(UUID.fromString(source));
    }
}
