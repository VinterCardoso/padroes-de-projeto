# Descrição

O padrão de projeto proxy é uma maneira de criar um intermediário entre o cliente 
e um objeto base, sem que o cliente perceba que não tem acesso direto ao objeto, 
o padrão proxy também ajuda a controlar o uso excessivo de recursos, podendo 
receber a demanda diretamente do cliente e organizar o que será feito antes ou depois 
de acessar o objeto, caso vários clientes envie demandas diferentes ou iguais o proxy 
fará com que não fique sobrecarregado e consiga organizar as demandas e enviar as 
respostas de acordo, assim podendo acelerar pesquisas do objeto base, impedir a 
criação de objetos sem saber se será utilizado futuramente

# Qual problema é resolvido por esse padrão? Quando utilizar?

Objetos grandes que consomem muito recursos do sistema que não são necessários a
todo o momento, clientes executando o código geraria códigos duplicados, esses são
alguns dos possíveis problemas gerados por não utilizar o proxy. Deve utilizar quando
desejar controlar o acesso a um objeto complexo, inicialização sensível ou cara ou
para adicionar novas funcionalidades.

# Diagrama UML

![alt text](<Untitled - Frame 1.jpg>)

# Vantagens

- Mais eficiente e seguro
- Inicialização tardia de objetos complexos
- Melhoria de desempenho
- Registro de atividade
- Economia de recursos
- Controle de acesso

# Desvantagens

- Pode deixar o código mais complexo pois seria necessario adicionar novas classes
- A resposta do servidor pode atrasar