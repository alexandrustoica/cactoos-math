/**
 * MIT License
 *
 * Copyright (c) 2017-2019 Vseslav Sekorin
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
package com.vssekorin.cactoosmath.matrix;

import com.vssekorin.cactoosmath.Matrix;
import org.cactoos.Scalar;

/**
 * Number of column.
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id$
 * @param <T> Type of matrix
 * @since 0.1
 */
public final class NmbColumns<T> implements Scalar<Integer> {

    /**
     * Matrix.
     */
    private final Matrix<T> matrix;

    /**
     * Ctor.
     * @param src Matrix.
     */
    public NmbColumns(final Matrix<T> src) {
        this.matrix = src;
    }

    @Override
    public Integer value() throws Exception {
        return this.matrix.asArray()[0].length;
    }
}
