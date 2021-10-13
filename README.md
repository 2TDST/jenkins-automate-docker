# jenkins-automate-docker

Run the updated Jenkins image whilst passing in the JENKINS_ADMIN_ID and JENKINS_ADMIN_PASSWORD environment variables via the --env option (replace <password> with a password of your choice):

```sh
docker build -t jenkins:jcasc . && docker run --name jenkins --rm -p 8080:8080 -p 50000:50000 --env JENKINS_ADMIN_ID=admin --env JENKINS_ADMIN_PASSWORD=password jenkins:jcasc
```

You can now go to server_ip:8080/login and log in using the specified credentials.

[!login](img/login.png)