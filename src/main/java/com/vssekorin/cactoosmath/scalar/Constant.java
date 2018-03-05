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
package com.vssekorin.cactoosmath.scalar;

import com.vssekorin.cactoosmath.Matrix;
import com.vssekorin.cactoosmath.matrix.UncheckedMatrix;
import org.cactoos.Scalar;
import org.cactoos.list.ListOf;
import org.cactoos.scalar.UncheckedScalar;

/**
 * Constant.
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id$
 * @param <T> Type of value
 * @since 0.1
 */
public final class Constant<T> implements Scalar<T> {

    /**
     * Value.
     */
    private final T val;

    /**
     * Ctor.
     * @param src Matrix
     * @param row Row number
     * @param col Column number
     */
    public Constant(final Matrix<T> src, final Number row, final Number col) {
        this(
            new UncheckedMatrix<>(src)
                .asArray()[row.intValue()][col.intValue()]
        );
    }

    /**
     * Ctor.
     * @param src Iterable
     * @param pos Index
     */
    public Constant(final Iterable<T> src, final Number pos) {
        this(new ListOf<>(src).get(pos.intValue()));
    }

    /**
     * Ctor.
     * @param src Scalar
     */
    public Constant(final Scalar<T> src) {
        this(new UncheckedScalar<>(src).value());
    }

    /**
     * Ctor.
     * @param src Value
     */
    public Constant(final T src) {
        this.val = src;
    }

    @Override
    public T value() throws Exception {
        return this.val;
    }
}