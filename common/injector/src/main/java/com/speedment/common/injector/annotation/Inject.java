/**
 *
 * Copyright (c) 2006-2016, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.injector.annotation;

import com.speedment.common.injector.State;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotes a field that should be set automatically using dependency injection.
 * Each injected field has a specified state that it is required to be in. It
 * is up to the injector to make sure that a type has been properly setup.
 * 
 * @author  Emil Forslund
 * @since   1.0.0
 */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
    
    /**
     * The {@link State} that the injected value must be in before 
     * it can be injected.
     * <p>
     * The default state is {@link State#STARTED}.
     * 
     * @return  the expected phase of the injected component
     */
    State value() default State.STARTED;
    
    /**
     * If the injector should throw an exception if no implementation
     * for this value could be found. If {@code required} is false, then
     * the value will simply be set to null.
     * <p>
     * The default is that every injected value is required.
     * 
     * @return  if this value is required
     */
    boolean required() default true;
    
}