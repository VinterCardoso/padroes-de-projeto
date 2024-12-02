# Descrição

O padrão de projeto Observer é classificado como comportamental, ou seja, lida com a comunicação entos e suas interações. Nesse padrão, um objeto chamado de "observável" notifica objetos dependentes chamados de "observadores" quando há mudança em seu estado, portanto, é uma relação de um-para-muitos entre observável e observadores. Para implementar o padrão Observer é necessário que o observável mantenha uma lista de objetos observadores e métodos para adiciona-los e remove-los da lista, além disso o observável precisa de um método que notifique cada observador da lista, esse método será chamado quando o estado do observável mudar. Já os observadores precisam implementam uma interface comum que deixe os observáveis notifica-los sobre suas mudanças de estado, assim cada observador se atualiza conforme as informações do observável.

# Qual problema é resolvido por esse padrão? Quando utilizar?

Forte acoplamento é um dos problemas que podem ser resolvidos com o Observer, esse padrão ajuda a construir sistemas flexíveis e extensíveis promovendo modularidade e escalabilidade. Observer pode ser utilizado em várias situações, mas um exemplo é um sistema de estoque onde banco de dados e interface de usuário precisam ser atualizados quando um estoque de produto mudar.

# Diagrama UML

![Alt text](https://purr.objects-us-east-1.dream.io/i/img_1844.jpg "a title")

# Vantagens

A principal vantagem desse padrão de projeto é a reutilização, já que observáveis e observadores podem ser interfaces, e também o baixo acoplamento gerado pelo Observer

# Desvantagens

A desvantagem seria a inundação de informações geradas pelas notificações cajo esse padrão for muito usado em um mesmo sistema.