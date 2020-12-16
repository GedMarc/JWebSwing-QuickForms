package com.jwebmp.plugins.quickforms.annotations.states;

import com.jwebmp.core.plugins.ComponentInformation;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@ComponentInformation(name = "Marks a field as explicitly editable",description = "Marks a field as explicitly editable")
public @interface WebEditable
{

}
