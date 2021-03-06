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
package com.vssekorin.cactoosmath.vector;

import com.vssekorin.cactoosmath.Vector;
import org.cactoos.Scalar;

/**
 * Vectors float dot (scalar) product.
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id$
 * @since 0.3
 */
@SuppressWarnings("PMD.LooseCoupling")
public final class FloatDot implements Scalar<Float> {

    /**
     * First vector.
     */
    private final Vector<Float> first;

    /**
     * Second vector.
     */
    private final Vector<Float> second;

    /**
     * Ctor.
     * @param fst First vector
     * @param snd Second vector
     */
    public FloatDot(final Vector<Float> fst, final Vector<Float> snd) {
        this.first = fst;
        this.second = snd;
    }

    @Override
    public Float value() throws Exception {
        float result = 0;
        final Float[] fst = this.first.asArray();
        final Float[] snd = this.second.asArray();
        for (int ind = 0; ind < fst.length; ++ind) {
            result += fst[ind] * snd[ind];
        }
        return result;
    }
}
