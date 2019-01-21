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
package com.vssekorin.cactoosmath.func;

import org.cactoos.BiFunc;
import org.cactoos.Func;

/**
 * Convert BiFunc to Func of Func.
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id$
 * @param <X> First input type
 * @param <Y> Second input type
 * @param <Z> Result type
 * @since 0.1
 */
public final class BiFuncFunc<X, Y, Z> implements Func<X, Func<Y, Z>> {

    /**
     * Origin function of two arguments.
     */
    private final BiFunc<X, Y, Z> function;

    /**
     * Ctor.
     * @param func BiFunc
     */
    public BiFuncFunc(final BiFunc<X, Y, Z> func) {
        this.function = func;
    }

    @Override
    public Func<Y, Z> apply(final X first) throws Exception {
        return second -> this.function.apply(first, second);
    }
}
