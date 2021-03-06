/*
 * Copyright © 2017 Mercateo AG (http://www.mercateo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mercateo.rest.jersey.utils.exception;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;

@Getter
@JsonPropertyOrder({ "type", "status","title","detail", "errors" })
public class ValidationExceptionJson extends SimpleExceptionJson {

    final String type;
    final List<ValidationError> errors;

    public ValidationExceptionJson(final String type,
                                   final String title,
                                   final int status,
                                   final String detail,
                                   final List<ValidationError> errors) {

        super(title, status, detail);
        this.type = type;
        this.errors = errors;
    }
}
