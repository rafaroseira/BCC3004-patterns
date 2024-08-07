# Padrão _Singleton_

O padrão _singleton_ é um padrão criacional que garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância. Este padrão é útil quando exatamente um objeto é necessário para coordenar ações em todo o sistema. Uma aplicação útil do _singleton_ é quando se faz necessária a conexão com um banco de dados, já que não há a necessidade de haver múltiplas conexões simultâneas.

O construtor é privado porque evita que a classe seja instanciada fora dela. Assim, para podermos instanciar ou acessar uma instância da classe cria-se um atributo público e estático da classe que retorna através de um método estático _getInstance()_ uma única instância dessa classe. Caso a classe já tenha sido instanciada, retorna-se a única instância já criada; caso não, cria-se uma nova.

# Padrão _Visitor_

O padrão _visitor_ é um padrão comportamental que permite adicionar novas operações a uma estrutura de objetos sem modificar as classes dos elementos dessa estrutura. No exemplo do padrão visitor, estamos calculando a área e perímetro de figuras sem alterar as classes concretas que implementam estas figuras.

No exemplo do padrão _visitor_, há dois tipos de interface: _Visitable_ (visitáveis) e _Visitor_ (visitante). _Visitable_ possui um caráter passivo, ou seja, apenas aceitará (_accept_) os visitantes, enquanto que _Visitor_ possui caráter ativo, ou seja, visitará (_visit_) um visitável. _Circle_ e _Rectangle_ são exemplos de _Visitable_ que implementam o método _accept_. Por outro lado, as operações em si, fazem parte dos visitantes e são representados por _AreaVisitor_ e _PerimeterVisitor_.

# Padrão _Adapter_

O padrão _adapter_ é um padrão estrutural que funciona como conector de duas interfaces incompatíveis que não podem ser conectadas diretamente. A principal ideia do padrão é converter uma interface existente em outra interface que o cliente espera.

No exemplo do padrão _adapter_, a aplicação é responsável por retornar a velocidade máxima de um carro em milhas por hora. No entanto, há certos países que não é comum o uso dessa unidade imperial; adota-se, na verdade, uma unidade métrica, o kilometro por hora. Portanto, para essa aplicação se faz útil um adaptador de MPH para KMH.

A interface _Carro_ retorna a velocidade máxima em MPH e a classe _Golf_ implementa _Carro_ e retorna a velocidade máxima hipotética de um Volkswagen Golf em MPH. _CarroAdapter_ é a interface que retorna a velocidade em KMH e _CarroAdapterImpl_ é a implementação da interface, a qual contém um método _MPHtoKPH_ (conversão). Dessa forma, podemos instanciar um Golf e um _CarroAdapter_, e, ao usar o método _getVelocidade()_ de _CarroAdapter_, teremos a velocidade convertida para KMH.

**Nota: Todos os exemplos possuem diagramas de classes em suas respectivas pastas.** 