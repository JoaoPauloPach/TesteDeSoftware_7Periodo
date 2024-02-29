Tarefa - Implementar um sistema de controle de leilões. Não é necessário implementar
interface gráfica.

O sistema deve possuir as seguintes features:

1. Listagem de Leilões, com filtro. O filtro deve permitir filtrar por leilões ABERTOS,
FINALIZADOS, EXPIRADOS e INATIVOS. Esses são os possíveis estados que um
leilão pode assumir;
2. Um leilão é considerado INATIVO quando este é cadastrado no sistema mas ainda não
foi aberto;
3. Um leilão é considerado ABERTO quando este está apto a receber lances;
4. Um leilão expira com base na sua data de expiração. Desta forma, o leilão assume o
estado EXPIRADO;
5. Leilões expirados podem ser finalizados, assumindo o estado FINALIZADO;
6. O estado FINALIZADO é atribuído a um leilão a partir do estado EXPIRADO ou do
estado ABERTO.
7. A partir do momento em que um leilão assume o estado ABERTO, este pode receber
lances. Sobre os lances as seguintes regras devem ser observadas:
a. Um lance nunca pode assumir um valor menor que o lance mínimo de um leilão;
b. Um lance nunca pode assumir um valor menor ou igual ao valor do último lance;
c. Um mesmo participante não pode efetuar dois lances seguidos. No entanto, o
participante pode efetuar quantos lances quiser.
8. Quando um leilão assumir o estado FINALIZADO, o ganhador do leilão (se houver) deve
receber um e-mail parabenizando-o pelo arremate.
9. É considerado ganhador do leilão, o proponente do maior lance efetuado para o leilão.
10. Os participantes do leilão devem ser previamente cadastrados.
11. Uma feature importante, é permitir que o usuário tenha acesso à lista de lances de um
determinado leilão, em ordem crescente de valor.
12. Além da lista de lances para um leilão específico, os usuários precisam saber qual é o
maior e o menor lance efetuado.

Para cada uma das features enumeradas, implementar testes unitários que permitam 100% de
cobertura do código fonte.
