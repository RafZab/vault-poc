***

# Vault + Spring Cloud Config Server (PoC)

This project is a **proof of concept (PoC)** demonstrating integration between **HashiCorp Vault** and **Spring Cloud Config Server** using **AppRole authentication**.
The configuration server retrieves properties from two sources in a defined order: **local YAML files** and **Vault secrets**.

***

### How Configuration is Loaded

Configuration is resolved in the following order:

1. **Local YAML files** (from `classpath:/config/{application}`)
2. **Config Server properties without profiles**
3. **Config Server properties with profiles**
    - If multiple profiles are active (e.g. `dev,prod`), they are applied in declared order: first `dev`, then `prod`.

***

# Tutorial to generate app_role
- https://developer.hashicorp.com/vault/tutorials/auth-methods/approle