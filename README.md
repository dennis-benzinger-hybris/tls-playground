```

     ,-~~~-.
    (  <O>  )`~-,.___..,--~~~-,-..___.,--~\
    |`~---~'|   :      :      :       :    \
    |       |   :   TLS Playground    :   <
    |       |   :      :      :       :   /
     `~---~' `~-'.___..'--~~~-'-..___.'--~'

```



# TLS Playground Project

This TLS Playground demonstrates various TLS scenarios, including certificate handling and client/server interactions over TLS.



## TP Components

### Certificate Utilities

Utilities for dealing with [CSRs and certificates](cert/) using openssl.

### Private Certificate Authorities

Configuration samples and utilities for running [Certificate Authorities (CA)](ca/) based on `openssl ca`.

### ACME / Let's Encypt

Configuation samples and utilities for obtaining certificates through the [ACME](acme) protocol using Certbot.

### Servers

Demo [(web) servers](server/) using various configurations and certificates.

### Clients

Demo [clients](client/) using various configurations and certificates.



## Using TP with Docker

### Building with Docker

Use the following to create a Docker image of the TLS Playground and all its prerequisites:

```
$ docker image pull debian:testing-slim
$ docker build --tag user/tls-playground:latest .
$ docker image push user/tls-playground:latest .
```

### Running with Docker

TODO

#### Env-Vars

TODO

#### Volume Mounts

TODO

### Developing with Docker

TODO
