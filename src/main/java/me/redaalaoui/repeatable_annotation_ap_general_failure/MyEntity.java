package me.redaalaoui.repeatable_annotation_ap_general_failure;

import javax.persistence.Entity;

/**
 * @author Réda Housni Alaoui
 */
@Entity
@MyAnnotations({
	@MyAnnotation(foo),
	@MyAnnotation(bar)
})
public class MyEntity {


}
