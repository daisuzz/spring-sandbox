package com.daisuzz.samplevalidator.custom.beanvalidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Documented
@NotEmpty
@Size(max = 20)
@Constraint(validatedBy = {})
@ReportAsSingleViolation
public @interface ValidName {

    String message() default "名前に不備があります";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
