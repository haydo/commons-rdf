/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.rdf.simple;

import org.apache.commons.rdf.api.BlankNode;
import org.apache.commons.rdf.api.BlankNodeOrIRI;
import org.apache.commons.rdf.api.Graph;
import org.apache.commons.rdf.api.IRI;
import org.apache.commons.rdf.api.Literal;
import org.apache.commons.rdf.api.RDFTerm;
import org.apache.commons.rdf.api.RDFTermFactory;
import org.apache.commons.rdf.api.Triple;

/**
 * A Simple implementation of {@link RDFTermFactory}
 * <p>
 * This class is <strong>deprecated</strong>, use instead {@link SimpleRDFFactory}.
 */
@Deprecated
public class SimpleRDFTermFactory implements RDFTermFactory {

	private SimpleRDFFactory factory = new SimpleRDFFactory();

	public BlankNode createBlankNode() {
		return factory.createBlankNode();
	}

	public BlankNode createBlankNode(String name) {
		return factory.createBlankNode(name);
	}

	public Graph createGraph() {
		return factory.createGraph();
	}

	public IRI createIRI(String iri) {
		return factory.createIRI(iri);
	}

	public Literal createLiteral(String literal) {
		return factory.createLiteral(literal);
	}

	public Literal createLiteral(String literal, IRI dataType) {
		return factory.createLiteral(literal, dataType);
	}

	public Literal createLiteral(String literal, String language) {
		return factory.createLiteral(literal, language);
	}

	public Triple createTriple(BlankNodeOrIRI subject, IRI predicate, RDFTerm object) {
		return factory.createTriple(subject, predicate, object);
	} 
}
