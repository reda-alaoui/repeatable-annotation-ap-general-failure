package me.redaalaoui.repeatable_annotation_ap_general_failure;

import java.lang.annotation.Repeatable;

/**
 * @author Réda Housni Alaoui
 */
@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {

	String value();

}
