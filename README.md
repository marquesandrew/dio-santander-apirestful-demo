# DIO - Santander Bootcamp Java 2025
API RestFul criada para treinar as habilidade novas com Framework Spring 


##Diagrama de Classes

```mermaid 
classDiagram
    class Obra {
        +String Nome
        +String Inicio
    }

    class Cliente {
        +String Nome
    }

    class Endereco {
        +String Cep
        +String Logradouro
        +String Bairro
        +String Numero
    }

    Obra "1" -- "1" Cliente : tem
    Obra "1" -- "1" Endereco : localizada em
    ```
