package com.manageway.web.converter;

import com.manageway.domain.user.records.Phone;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;


@Component
public class StringToPhoneConverter implements Converter<String, Phone> {
    @Override
    public Phone convert(@NonNull String source) {
        return new Phone(source);
    }
}
