/**
 * MIT License
 *
 * Copyright (c) 2017-2018 Vseslav Sekorin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.vssekorin.cactoosmath.graph;

import com.vssekorin.cactoosmath.Graph;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.cactoos.Func;

/**
 * Graph of.
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id$
 * @param <T> Type of matrix
 * @since 0.1
 */
public class GraphOf<T> extends GraphEnvelope<T> {

    /**
     * Ctor.
     * @param vertices List
     * @param create Func
     */
    public GraphOf(final List<T> vertices, final Func<T, List<T>> create) {
        this(() -> {
            final Map<T, List<T>> result = new HashMap<>();
            for (final T node : vertices) {
                result.put(node, create.apply(node));
            }
            return result;
        });
    }

    /**
     * Ctor.
     * @param src Map
     */
    public GraphOf(final Map<T, List<T>> src) {
        this(() -> src);
    }

    /**
     * Ctor.
     * @param src Graph
     */
    public GraphOf(final Graph<T> src) {
        super(() -> src);
    }
}