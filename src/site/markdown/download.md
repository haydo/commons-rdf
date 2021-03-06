<!--

    Licensed to the Apache Software Foundation (ASF) under one
    or more contributor license agreements. See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership. The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

-->

# Download Commons RDF


## Maven

Apache Commons RDF is available from
[Maven Central](https://repo.maven.apache.org/maven2/org/apache/commons/commons-rdf-api/),
mirrored from
[ASF's Maven repository](https://repository.apache.org/content/repositories/releases/org/apache/commons/commons-rdf-api/).
For convenience of IDE users, the Maven artifacts include `-javadoc.jar` and
`-sources.jar`, however you might prefer the
online [API javadoc](apidocs/)
and the [source code releases](#Source_code) (see below).

To use Commons RDF with [Maven](https://maven.apache.org/), add to your `pom.xml`:

```xml
<dependencies>
  <dependency>
      <groupId>org.apache.commons</groupId>
      <artifactId>commons-rdf-api</artifactId>
      <version>0.3.0-incubating</version>
  </dependency>

  <!-- and at least one of the implementations: -->

  <dependency>
      <groupId>org.apache.commons</groupId>
      <artifactId>commons-rdf-simple</artifactId>
      <version>0.3.0-incubating</version>
  </dependency>
  <dependency>
      <groupId>org.apache.commons</groupId>
      <artifactId>commons-rdf-jsonld-java</artifactId>
      <version>0.3.0-incubating</version>
  </dependency>
  <dependency>
      <groupId>org.apache.commons</groupId>
      <artifactId>commons-rdf-jena</artifactId>
      <version>0.3.0-incubating</version>
  </dependency>
  <dependency>
      <groupId>org.apache.commons</groupId>
      <artifactId>commons-rdf-rdf4j</artifactId>
      <version>0.3.0-incubating</version>
  </dependency>

</dependencies>
```

The `<version>` above might not be up to date,
see the [source code releases](#Source_code) below to find the latest version.

See the [user guide](userguide.html) for documentation of the
Apache Commons RDF API, and the [implementations](implementations.html) for
details on each of the bindings.


## Source code

Here you can find all source releases published of Apache Commons RDF.

For the latest developments
you may also be interested in the [source code repository](source-repository.html),
which is also [mirrored to GitHub](http://github.com/apache/commons-rdf).


### 0.3.0-incubating

**Apache Commons RDF 0.3.0-incubating** was published on 2016-11-15, and is available for download
from official mirrors of the
ASF Distribution Directory [incubator/commonsrdf](https://www.apache.org/dyn/closer.lua/incubator/commonsrdf/0.3.0-incubating/):

* [apache-commons-rdf-0.3.0-incubating-src.zip](https://www.apache.org/dyn/closer.lua/incubator/commonsrdf/0.3.0-incubating/apache-commons-rdf-0.3.0-incubating-src.zip)
  ([asc](https://www.apache.org/dist/incubator/commonsrdf/0.3.0-incubating/apache-commons-rdf-0.3.0-incubating-src.zip.asc),
  [md5](https://www.apache.org/dist/incubator/commonsrdf/0.3.0-incubating/apache-commons-rdf-0.3.0-incubating-src.zip.md5),
  [sha1](https://www.apache.org/dist/incubator/commonsrdf/0.3.0-incubating/apache-commons-rdf-0.3.0-incubating-src.zip.sha1))
* [apache-commons-rdf-0.3.0-incubating-src.tar.gz](https://www.apache.org/dyn/closer.lua/incubator/commonsrdf/0.3.0-incubating/apache-commons-rdf-0.3.0-incubating-src.zip)
  ([asc](https://www.apache.org/dist/incubator/commonsrdf/0.3.0-incubating/apache-commons-rdf-0.3.0-incubating-src.tar.gz.asc),
  [md5](https://www.apache.org/dist/incubator/commonsrdf/0.3.0-incubating/apache-commons-rdf-0.3.0-incubating-src.tar.gz.md5),
  [sha1](https://www.apache.org/dist/incubator/commonsrdf/0.3.0-incubating/apache-commons-rdf-0.3.0-incubating-src.tar.gz.sha1))

After downloading the files, [check the signatures](https://www.apache.org/info/verification.html) 
using the following [KEYS](https://www.apache.org/dist/incubator/commonsrdf/KEYS)
file. The [changelog](https://s.apache.org/rdf-0.3.0)
is available from the [Apache Commons RDF Jira](https://issues.apache.org/jira/browse/COMMONSRDF).

### Previous Releases

Previous release are available from [archive.apache.org](https://archive.apache.org/dist/commons/rdf/).

Note that earlier 
[incubator releases](https://archive.apache.org/dist/incubator/commonsrdf/)
(0.3.0-incubating and earlier) are archived separately. 
