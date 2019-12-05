# MS.Authentication


## Docker

__Create__

```
docker build -t ms-authentication:0.1 .
```


__Testing__

```
docker run -e PORT=8080 -m512M --cpus 2 -it -p 8080:8080 --name  ms-authentication --rm  ms-authentication:0.1
```

