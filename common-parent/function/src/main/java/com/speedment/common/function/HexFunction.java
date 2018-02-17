/**
 *
 * Copyright (c) 2006-2017, Speedment, Inc. All Rights Reserved.
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
package com.speedment.common.function;

import java.util.function.Function;

/**
 * Represents a function that accepts three arguments and produces a result.
 * This is the three-arity specialization of
 * {@link java.util.function.Function}.
 * 
 * @param <T>  the type of the first argument to the function
 * @param <U>  the type of the second argument to the function
 * @param <V>  the type of the third argument to the function
 * @param <X>  the type of the forth argument to the function
 * @param <Y>  the type of the fifth argument to the function
 * @param <Z>  the type of the sixth argument to the function
 * @param <R>  the type of the result of the function
 *
 * @see Function
 */
@FunctionalInterface
public interface HexFunction<T, U, V, X, Y, Z, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t  the first function argument
     * @param u  the second function argument
     * @param v  the third function argument
     * @param x  the fourth function argument
     * @param y  the fifth function argument
     * @param z  the sixth function argument
     * @return   the function result
     */
    R apply(T t, U u, V v, X x, Y y, Z z);
}
