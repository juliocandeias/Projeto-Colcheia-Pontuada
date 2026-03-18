Aqui está o README atualizado com as remoções solicitadas (Docker, licença, contato) e desenvolvedores adicionados:

***

# Colcheia Pontuada

Sistema de Gerenciamento de Partituras para Orquestras, Institutos e Conservatórios.

## Descrição

Colcheia Pontuada é um sistema web full-stack desenvolvido para gerenciar partituras musicais em projetos de grande porte, como orquestras sinfônicas, institutos musicais ou conservatórios. Ele controla o acesso a arquivos de partituras por roles específicas, organiza grupos musicais, repertórios e eventos, e oferece ferramentas de catalogação e auditoria para otimizar ensaios e apresentações.

O projeto foi criado como trabalho de conclusão de curso no Ensino Médio Técnico de Informática (3º ano), priorizando usabilidade, escalabilidade e segurança de dados.

## Entidades Principais

- **Administrador**: Administra partituras e usuários, audita logs de acesso (quem baixou o quê e quando).
- **Maestro**: Define repertórios, gerencia grupos, acessa todas as partituras e rege obrigatoriamente um grupo. Aprova adições a repertórios e marca status de eventos.
- **Músico de Estante**: Acessa apenas partituras do seu instrumento e dos grupos aos quais pertence.
- **Grupo**: Conjunto de Músicos de Estante, um Maestro Principal e possivelmente assistentes. Contém repertórios.
- **Partitura**: Arquivo com instruções musicais, específico para instrumento ou grupo. Inclui metadados como compositor, tom, duração e dificuldade.
- **Repertório**: Conjunto de partituras de um grupo, para fins específicos como estudo ou apresentação.
- **Instrumento**: Objeto para execução de sons (ex.: violino, clarinete).
- **Evento/Apresentação**: Ligado a repertórios, com data, local, público esperado e lista de presença. Status: ensaio, apresentação ou cancelado.
- **Arquivista**: cataloga partituras com tags (compositor, dificuldade, era musical) e acessa todo o acervo.
- **Compositor/Arrangedor**: Registra criadores ou adaptadores de partituras.
- **Ensaio**: Contém data, horário, grupo e repertório associado.

## Funcionalidades Principais

- **Controle de Acesso Granular**: Músicos veem apenas conteúdo relevante; maestros e admins têm permissões elevadas.
- **Busca Avançada**: Filtra partituras por instrumento, grupo, data de evento, metadados (compositor, tom, dificuldade).
- **Gerenciamento de Grupos e Eventos**: Criação de ensaios e apresentações com integração de repertórios.
- **Catalogação Inteligente**: Tags e metadados para organização eficiente pelo arquivista.
- **Logs de Auditoria**: Rastreamento completo de downloads e acessos.
- **Interface Responsiva**: Web app otimizada para desktop e mobile, com visualizador de PDFs.

## Tecnologias Utilizadas

- **Backend**: Java 17+ com Spring Boot 3.x
- **Banco de Dados**: PostgreSQL (JPA/Hibernate para ORM)
- **Frontend**: React.js com Material-UI / Bootstrap
- **Armazenamento de Arquivos**: Local ou AWS S3 (Spring Cloud AWS)
- **Autenticação**: Spring Security + JWT
- **Outras**: Maven/Gradle, Git para versionamento

## Instalação e Execução

1. Clone o repositório:
   ```
   git clone https://github.com/seuusuario/colcheia-pontuada.git
   cd colcheia-pontuada
   ```

2. Instale dependências backend:
   ```
   cd backend
   ./mvnw clean install  # ou ./gradlew build
   ```

3. Instale dependências frontend:
   ```
   cd ../frontend
   npm install
   ```

4. Configure variáveis de ambiente:
   Crie `backend/src/main/resources/application.properties`:
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/colcheia
   spring.datasource.username=seuuser
   spring.datasource.password=suapass
   spring.jpa.hibernate.ddl-auto=update
   jwt.secret=suasecret
   ```

5. Execute o projeto:
   ```
   # Backend (terminal 1)
   cd backend
   ./mvnw spring-boot:run

   # Frontend (terminal 2)
   cd frontend
   npm start
   ```
   Acesse em `http://localhost:3000`. Backend roda em `http://localhost:8080`.

## Estrutura de Pastas

```
colcheia-pontuada/
├── backend/                # Spring Boot API, controllers, entities, services
│   └── src/main/java/br/com/colcheia/
├── frontend/               # Interface React
├── docs/                   # Diagramas ER, wireframes
└── README.md
```

## Roadmap de Desenvolvimento

- [ ] Modelagem do Banco de Dados
- [ ] Desenvolvimento do Backend
- [ ] Desenvolvimento da Interface


## MER do projeto

MER Projeto Colcheia Pontuada-2026-03-18-121801.png


## Contribuições

Contribuições são bem-vindas! Crie issues para sugestões/bugs e pull requests para features. Siga as boas práticas de commit (Conventional Commits).

## Desenvolvedores

- Júlio Miguel
- Luiz Augusto

***
