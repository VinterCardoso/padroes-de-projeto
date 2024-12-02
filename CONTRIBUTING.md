# Indíce

- [Padrões de Branch](#padrões-de-branch)
- [Mensagens de commit](#mensagens-de-commit)
- [Implementação e documentação](#implementação-e-documentação)
- [Workflow](#workflow)

# Padrões de branch
 O padrão de branch a ser seguido é lowercase_snake_case.\
 Cada branch deve ser criada a partir da master. \
 A branch master é protegida, então somente pull requests para master poderão atualiza-la.

# Mensagens de commit
 Os commits devem seguir o padrão feat: mensagem do commit ou doc: mensagem do commit.\
 Os commits com feat são as features, devem conter a implementação do padrão de projeto.\
 Os commits começados em doc são apenas para atualização de documentação. 

# Implementação e documentação
 Os códigos de implementação podem ser em qualquer linguagem e de preferência a documentação em markdown deve explicar como funciona, suas vantagens e desvantagens. Cada pasta já tem um template que deve ser seguido e existe um backup na pasta raíz do projeto.

# Workflow

- Crie uma issue "Implementar (padrão de projeto)", ela sera atribuida a você
- Crie sua branch a partir da master com o nome do padrão atribuido a você.
- Utilize a pasta do seu padrão para criar a documentação e implementação.
- Ao terminar não esqueça de criar o pull request.