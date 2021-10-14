# jenkins-automate-docker

Execute a imagem atualizada do Jenkins enquanto passa as variáveis de ambiente JENKINS_ADMIN_ID e JENKINS_ADMIN_PASSWORD por meio da opção --env (substitua a senha por uma senha de sua escolha):

```sh
docker build -t jenkins:jcasc . && docker run --name jenkins --rm -p 8080:8080 -p 50000:50000 --env JENKINS_ADMIN_ID=admin --env JENKINS_ADMIN_PASSWORD=password jenkins:jcasc
```

Agora você pode ir para server_ip: 8080/login e fazer login usando as credenciais especificadas

[!login](img/login.png)

# SLASHICORP

<ul>
<li>Allan Phyllyp Reis (RM85619) </li>
<li>Dihogo Cassimiro Teixeira  (RM84082) </li>
<li>Fernando Borgatto Bouman (RM85833) </li>
<li>Paloma Rangel Rocha (RM86486) </li>
<li>Juan Carlos Benvive Serrano (RM85468) </li>
</ul>
