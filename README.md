# Avaliação
Este pequeno projeto foi desenvolvido devido a necessidade de uma avaliação individeal.


## Get

**_/api/receitas/brasileiras/_**
Retorna todas as receitas do banco.


**_/api/receitas/brasileiras/{id}_**
Retorna a receita especifica indicada pela url no id;


## Post

**_/api/receitas/brasileiras/_**
Cria uma receita no banco, passando no corpo do JSON o objeto a ser criado.
O campo nome pode ser nulo, mas os demais são obrigatodios
    {
    
        "nome": null,
        "ingredientes": "tudo",
        "modoDePreparar": "fritar"
    }

## Put
**_/api/receitas/brasileiras/{id}_**
Atualiza uma receita, passando o id da mesma na url e passando os campos para atualizar no corpodo JSON
{
  
    "nome": "agua quente",
    "ingredientes": "agua",
    "modoDePreparar": "agua na panela e depois panela no fogão"
}


## Delete
**_/api/receitas/brasileiras/{id}_**
Deleta uma receita, passando o id da receita qual deseja delatar na url