package com.flysoloing.commons.util;

import com.flysoloing.commons.exception.AppRuntimeException;
import org.hibernate.validator.HibernateValidator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Iterator;
import java.util.Set;

/**
 * 基于Hibernate-validator的验证工具类
 *
 * @author laitao
 * @date 2016-05-03 23:21:00
 */
public class ValidationUtils {

    private static Validator validator = Validation.byProvider(HibernateValidator.class)
            .configure()
            .failFast(true)
            .buildValidatorFactory()
            .getValidator();

    /**
     * 验证
     * @param obj
     * @param <T>
     * @throws AppRuntimeException
     */
    public static <T> void validate(T obj) throws AppRuntimeException {
        Set<ConstraintViolation<T>> constraintViolationSet = validator.validate(obj);
        if (!constraintViolationSet.isEmpty()) {
            StringBuilder sb = new StringBuilder("Obj state is invalid: ");
            for (Iterator<ConstraintViolation<T>> it = constraintViolationSet.iterator(); it.hasNext();) {
                ConstraintViolation<T> constraintViolation = it.next();
                sb.append(constraintViolation.getPropertyPath()).append(" - ").append(constraintViolation.getMessage());
                if (it.hasNext()) {
                    sb.append("; ");
                }
            }
            throw new AppRuntimeException("", sb.toString());
        }
    }

}
