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
import com.vssekorin.cactoosmath.Vector;

/**
 * Matrix with row.
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id$
 * @param <T> Type of elements
 * @since 0.3
 */
@SuppressWarnings(
    {
        "PMD.CallSuperInConstructor",
        "PMD.ConstructorOnlyInitializesOrCallOtherConstructors",
        "PMD.LooseCoupling"
    }
)
public final class MatrixWithRow<T> extends MatrixEnvelope<T> {

    /**
     * Ctor.
     * @param mtx Origin matrix
     * @param vct Row
     * @param nmb Number of row
     */
    @SuppressWarnings("unchecked")
    public MatrixWithRow(final Matrix<T> mtx, final Vector<T> vct,
        final int nmb) {
        super(() -> () -> {
            final T[][] matrix = mtx.asArray();
            final T[][] result =
                (T[][]) new Object[matrix.length][matrix[0].length];
            for (int row = 0; row < matrix.length; ++row) {
                if (row == nmb) {
                    System.arraycopy(
                        vct.asArray(), 0, result[row], 0, matrix[row].length
                    );
                } else {
                    System.arraycopy(
                        matrix[row], 0, result[row], 0, matrix[row].length
                    );
                }
            }
            return result;
        });
    }
}
