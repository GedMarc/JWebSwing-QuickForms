package com.jwebmp.plugins.quickforms.annotations;

import java.lang.annotation.*;

/**
 * @author Marc Magon
 * @since 25 Mar 2017
 */
@Target({ElementType.FIELD, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface SwitchField
{

	String style() default "";

	String classes() default "";

	String requiredMessage() default "This field is required";

	String patternMessage() default "This field doesn't match the required pattern";

	boolean required() default false;

	boolean showControlFeedback() default true;

	String onText() default "";

	String offText() default "";

	String regex() default "";

	String regexBind() default "";
}