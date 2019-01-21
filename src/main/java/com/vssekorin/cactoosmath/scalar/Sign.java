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
package com.vssekorin.cactoosmath.scalar;

import org.cactoos.Scalar;
import org.cactoos.scalar.NumberEnvelope;
import org.cactoos.scalar.UncheckedScalar;

/**
 * Returns the signum function of the argument; zero if the argument is zero,
 * 1.0 if the argument is greater than zero,
 * -1.0 if the argument is less than zero.
 *
 * @author Darya Egorova (dar3997@yandex.ru)
 * @version $Id$
 * @since 0.2
 */
public final class Sign extends NumberEnvelope {

    /**
     * Serialization marker.
     */
    private static final long serialVersionUID = -2465484771344689423L;

    /**
     * Ctor.
     * @param scl Scalar
     */
    public Sign(final Scalar<Number> scl) {
        this(new UncheckedScalar<>(scl).value());
    }

    /**
     * Ctor.
     * @param nmb Number
     */
    public Sign(final Number nmb) {
        super(() -> Math.signum(nmb.doubleValue()));
    }

}
