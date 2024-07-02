package com.manageway.web.converter;

import com.manageway.domain.user.records.Email;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;


@Component
public class StringToEmailConverter implements Converter<String, Email> {
    @Override
    public Email convert(@NonNull String source) {
        return new Email(source);
    }
}
