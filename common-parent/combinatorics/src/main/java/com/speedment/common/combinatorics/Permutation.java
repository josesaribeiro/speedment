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
package com.speedment.common.combinatorics;

import com.speedment.common.combinatorics.internal.PermutationUtil;
import java.util.*;
import java.util.stream.Stream;

/**
 * General Permutation support from
 * http://minborgsjavapot.blogspot.com/2015/07/java-8-master-permutations.html
 *
 * @author Per Minborg
 */
public final class Permutation {

    public static long factorial(final int n) {
        return PermutationUtil.factorial(n);
    }

    public static <T> List<T> permutation(final long no, final List<T> items) {
        return PermutationUtil.permutation(no, items);
    }

    @SafeVarargs
    @SuppressWarnings("varargs") // Creating a List from an array is safe
    public static <T> Stream<Stream<T>> of(final T... items) {
        return PermutationUtil.of(items);
    }

    private Permutation() {
        throw new UnsupportedOperationException();
    }

}